package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import com.braze.h2;
import java.security.SecureRandom;
import java.text.ParseException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class XMSSMT {
    private XMSSMTParameters params;
    private XMSSMTPrivateKeyParameters privateKey;
    private SecureRandom prng;
    private XMSSMTPublicKeyParameters publicKey;
    private XMSSParameters xmssParams;

    public XMSSMT(XMSSMTParameters xMSSMTParameters, SecureRandom secureRandom) {
        if (xMSSMTParameters == null) {
            w.l("params == null");
            throw null;
        }
        this.params = xMSSMTParameters;
        this.xmssParams = xMSSMTParameters.getXMSSParameters();
        this.prng = secureRandom;
        this.privateKey = new XMSSMTPrivateKeyParameters.Builder(xMSSMTParameters).build();
        this.publicKey = new XMSSMTPublicKeyParameters.Builder(xMSSMTParameters).build();
    }

    public byte[] exportPrivateKey() {
        return this.privateKey.toByteArray();
    }

    public byte[] exportPublicKey() {
        return this.publicKey.toByteArray();
    }

    public void generateKeys() {
        XMSSMTKeyPairGenerator xMSSMTKeyPairGenerator = new XMSSMTKeyPairGenerator();
        xMSSMTKeyPairGenerator.init(new XMSSMTKeyGenerationParameters(getParams(), this.prng));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = xMSSMTKeyPairGenerator.generateKeyPair();
        this.privateKey = (XMSSMTPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        this.publicKey = xMSSMTPublicKeyParameters;
        importState(this.privateKey, xMSSMTPublicKeyParameters);
    }

    public XMSSMTParameters getParams() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return this.privateKey.getPublicSeed();
    }

    public XMSSParameters getXMSS() {
        return this.xmssParams;
    }

    public void importState(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            w.l("privateKey == null");
            return;
        }
        if (bArr2 == null) {
            w.l("publicKey == null");
            return;
        }
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParametersBuild = new XMSSMTPrivateKeyParameters.Builder(this.params).withPrivateKey(bArr).build();
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParametersBuild = new XMSSMTPublicKeyParameters.Builder(this.params).withPublicKey(bArr2).build();
        if (!Arrays.areEqual(xMSSMTPrivateKeyParametersBuild.getRoot(), xMSSMTPublicKeyParametersBuild.getRoot())) {
            h2.b("root of private key and public key do not match");
        } else {
            if (!Arrays.areEqual(xMSSMTPrivateKeyParametersBuild.getPublicSeed(), xMSSMTPublicKeyParametersBuild.getPublicSeed())) {
                h2.b("public seed of private key and public key do not match");
                return;
            }
            this.xmssParams.getWOTSPlus().importKeys(new byte[this.params.getTreeDigestSize()], xMSSMTPrivateKeyParametersBuild.getPublicSeed());
            this.privateKey = xMSSMTPrivateKeyParametersBuild;
            this.publicKey = xMSSMTPublicKeyParametersBuild;
        }
    }

    public byte[] sign(byte[] bArr) {
        if (bArr == null) {
            w.l("message == null");
            return null;
        }
        XMSSMTSigner xMSSMTSigner = new XMSSMTSigner();
        xMSSMTSigner.init(true, this.privateKey);
        byte[] bArrGenerateSignature = xMSSMTSigner.generateSignature(bArr);
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) xMSSMTSigner.getUpdatedPrivateKey();
        this.privateKey = xMSSMTPrivateKeyParameters;
        importState(xMSSMTPrivateKeyParameters, this.publicKey);
        return bArrGenerateSignature;
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ParseException {
        if (bArr == null) {
            w.l("message == null");
            return false;
        }
        if (bArr2 == null) {
            w.l("signature == null");
            return false;
        }
        if (bArr3 == null) {
            w.l("publicKey == null");
            return false;
        }
        XMSSMTSigner xMSSMTSigner = new XMSSMTSigner();
        xMSSMTSigner.init(false, new XMSSMTPublicKeyParameters.Builder(getParams()).withPublicKey(bArr3).build());
        return xMSSMTSigner.verifySignature(bArr, bArr2);
    }

    private void importState(XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters, XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters) {
        this.xmssParams.getWOTSPlus().importKeys(new byte[this.params.getTreeDigestSize()], this.privateKey.getPublicSeed());
        this.privateKey = xMSSMTPrivateKeyParameters;
        this.publicKey = xMSSMTPublicKeyParameters;
    }
}
