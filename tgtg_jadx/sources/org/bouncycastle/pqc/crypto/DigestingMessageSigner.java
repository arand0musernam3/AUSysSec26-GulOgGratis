package org.bouncycastle.pqc.crypto;

import com.braze.h2;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DigestingMessageSigner implements Signer {
    private boolean forSigning;
    private final Digest messDigest;
    private final MessageSigner messSigner;

    public DigestingMessageSigner(MessageSigner messageSigner, Digest digest) {
        this.messSigner = messageSigner;
        this.messDigest = digest;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.forSigning) {
            h2.b("DigestingMessageSigner not initialised for signature generation.");
            return null;
        }
        byte[] bArr = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr, 0);
        return this.messSigner.generateSignature(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forSigning = z11;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z11 && !asymmetricKeyParameter.isPrivate()) {
            a.f("Signing Requires Private Key.");
        } else if (!z11 && asymmetricKeyParameter.isPrivate()) {
            a.f("Verification Requires Public Key.");
        } else {
            reset();
            this.messSigner.init(z11, cipherParameters);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.messDigest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.messDigest.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning) {
            h2.b("DigestingMessageSigner not initialised for verification");
            return false;
        }
        byte[] bArr2 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr2, 0);
        return this.messSigner.verifySignature(bArr2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.messDigest.update(bArr, i11, i12);
    }
}
