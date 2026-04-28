package org.bouncycastle.crypto.signers;

import c50.w;
import com.braze.h2;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Ed25519phSigner implements Signer {
    private final byte[] context;
    private boolean forSigning;
    private final Digest prehash = Ed25519.createPrehash();
    private Ed25519PrivateKeyParameters privateKey;
    private Ed25519PublicKeyParameters publicKey;

    public Ed25519phSigner(byte[] bArr) {
        if (bArr != null) {
            this.context = Arrays.clone(bArr);
        } else {
            w.l("'context' cannot be null");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        String str;
        if (!this.forSigning || this.privateKey == null) {
            str = "Ed25519phSigner not initialised for signature generation.";
        } else {
            byte[] bArr = new byte[64];
            if (64 == this.prehash.doFinal(bArr, 0)) {
                byte[] bArr2 = new byte[64];
                this.privateKey.sign(2, this.context, bArr, 0, 64, bArr2, 0);
                return bArr2;
            }
            str = "Prehash digest failed";
        }
        h2.b(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forSigning = z11;
        Ed25519PublicKeyParameters ed25519PublicKeyParameters = null;
        if (z11) {
            this.privateKey = (Ed25519PrivateKeyParameters) cipherParameters;
        } else {
            this.privateKey = null;
            ed25519PublicKeyParameters = (Ed25519PublicKeyParameters) cipherParameters;
        }
        this.publicKey = ed25519PublicKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(EdDSAParameterSpec.Ed25519, 128, cipherParameters, z11));
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.prehash.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.prehash.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning || this.publicKey == null) {
            h2.b("Ed25519phSigner not initialised for verification");
            return false;
        }
        int length = bArr.length;
        Digest digest = this.prehash;
        if (64 != length) {
            digest.reset();
            return false;
        }
        byte[] bArr2 = new byte[64];
        if (64 == digest.doFinal(bArr2, 0)) {
            return this.publicKey.verify(2, this.context, bArr2, 0, 64, bArr, 0);
        }
        h2.b("Prehash digest failed");
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.prehash.update(bArr, i11, i12);
    }
}
