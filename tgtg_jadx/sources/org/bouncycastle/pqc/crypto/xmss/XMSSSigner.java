package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import com.braze.h2;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.pqc.crypto.xmss.XMSSSignature;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class XMSSSigner implements StateAwareMessageSigner {
    private boolean hasGenerated;
    private boolean initSign;
    private KeyedHashFunctions khf;
    private XMSSParameters params;
    private XMSSPrivateKeyParameters privateKey;
    private XMSSPublicKeyParameters publicKey;
    private WOTSPlus wotsPlus;

    private WOTSPlusSignature wotsSign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.params.getTreeDigestSize()) {
            a.f("size of messageDigest needs to be equal to size of digest");
            return null;
        }
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return null;
        }
        WOTSPlus wOTSPlus = this.wotsPlus;
        wOTSPlus.importKeys(wOTSPlus.getWOTSPlusSecretKey(this.privateKey.getSecretKeySeed(), oTSHashAddress), this.privateKey.getPublicSeed());
        return this.wotsPlus.sign(bArr, oTSHashAddress);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        String str;
        byte[] byteArray;
        if (bArr == null) {
            w.l("message == null");
            return null;
        }
        if (this.initSign) {
            XMSSPrivateKeyParameters xMSSPrivateKeyParameters = this.privateKey;
            if (xMSSPrivateKeyParameters != null) {
                synchronized (xMSSPrivateKeyParameters) {
                    try {
                        if (this.privateKey.getUsagesRemaining() <= 0) {
                            throw new ExhaustedPrivateKeyException("no usages of private key remaining");
                        }
                        if (this.privateKey.getBDSState().getAuthenticationPath().isEmpty()) {
                            throw new IllegalStateException("not initialized");
                        }
                        try {
                            int index = this.privateKey.getIndex();
                            this.hasGenerated = true;
                            long j9 = index;
                            byte[] bArrPRF = this.khf.PRF(this.privateKey.getSecretKeyPRF(), XMSSUtil.toBytesBigEndian(j9, 32));
                            byteArray = new XMSSSignature.Builder(this.params).withIndex(index).withRandom(bArrPRF).withWOTSPlusSignature(wotsSign(this.khf.HMsg(Arrays.concatenate(bArrPRF, this.privateKey.getRoot(), XMSSUtil.toBytesBigEndian(j9, this.params.getTreeDigestSize())), bArr), (OTSHashAddress) new OTSHashAddress.Builder().withOTSAddress(index).build())).withAuthPath(this.privateKey.getBDSState().getAuthenticationPath()).build().toByteArray();
                        } finally {
                            this.privateKey.getBDSState().markUsed();
                            this.privateKey.rollKey();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return byteArray;
            }
            str = "signing key no longer usable";
        } else {
            str = "signer not initialized for signature generation";
        }
        h2.b(str);
        return null;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        XMSSPrivateKeyParameters xMSSPrivateKeyParameters;
        synchronized (this.privateKey) {
            try {
                boolean z11 = this.hasGenerated;
                xMSSPrivateKeyParameters = this.privateKey;
                if (z11) {
                    this.privateKey = null;
                } else if (xMSSPrivateKeyParameters != null) {
                    this.privateKey = xMSSPrivateKeyParameters.getNextKey();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xMSSPrivateKeyParameters;
    }

    public long getUsagesRemaining() {
        return this.privateKey.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        XMSSParameters parameters;
        if (z11) {
            this.initSign = true;
            this.hasGenerated = false;
            XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters) cipherParameters;
            this.privateKey = xMSSPrivateKeyParameters;
            parameters = xMSSPrivateKeyParameters.getParameters();
        } else {
            this.initSign = false;
            XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) cipherParameters;
            this.publicKey = xMSSPublicKeyParameters;
            parameters = xMSSPublicKeyParameters.getParameters();
        }
        this.params = parameters;
        WOTSPlus wOTSPlus = this.params.getWOTSPlus();
        this.wotsPlus = wOTSPlus;
        this.khf = wOTSPlus.getKhf();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        XMSSSignature xMSSSignatureBuild = new XMSSSignature.Builder(this.params).withSignature(bArr2).build();
        int index = xMSSSignatureBuild.getIndex();
        this.wotsPlus.importKeys(new byte[this.params.getTreeDigestSize()], this.publicKey.getPublicSeed());
        long j9 = index;
        byte[] bArrHMsg = this.khf.HMsg(Arrays.concatenate(xMSSSignatureBuild.getRandom(), this.publicKey.getRoot(), XMSSUtil.toBytesBigEndian(j9, this.params.getTreeDigestSize())), bArr);
        int height = this.params.getHeight();
        return Arrays.constantTimeAreEqual(XMSSVerifierUtil.getRootNodeFromSignature(this.wotsPlus, height, bArrHMsg, xMSSSignatureBuild, (OTSHashAddress) new OTSHashAddress.Builder().withOTSAddress(index).build(), XMSSUtil.getLeafIndex(j9, height)).getValue(), this.publicKey.getRoot());
    }
}
