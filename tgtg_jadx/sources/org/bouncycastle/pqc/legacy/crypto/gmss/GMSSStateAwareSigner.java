package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.braze.h2;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class GMSSStateAwareSigner implements StateAwareMessageSigner {
    private final GMSSSigner gmssSigner;
    private GMSSPrivateKeyParameters key;

    public GMSSStateAwareSigner(Digest digest) {
        if (!(digest instanceof Memoable)) {
            a.f("digest must implement Memoable");
            throw null;
        }
        final Memoable memoableCopy = ((Memoable) digest).copy();
        this.gmssSigner = new GMSSSigner(new GMSSDigestProvider() { // from class: org.bouncycastle.pqc.legacy.crypto.gmss.GMSSStateAwareSigner.1
            @Override // org.bouncycastle.pqc.legacy.crypto.gmss.GMSSDigestProvider
            public Digest get() {
                return (Digest) memoableCopy.copy();
            }
        });
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        if (this.key == null) {
            h2.b("signing key no longer usable");
            return null;
        }
        byte[] bArrGenerateSignature = this.gmssSigner.generateSignature(bArr);
        this.key = this.key.nextKey();
        return bArrGenerateSignature;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = this.key;
        this.key = null;
        return gMSSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (z11) {
            this.key = cipherParameters instanceof ParametersWithRandom ? (GMSSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (GMSSPrivateKeyParameters) cipherParameters;
        }
        this.gmssSigner.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return this.gmssSigner.verifySignature(bArr, bArr2);
    }
}
