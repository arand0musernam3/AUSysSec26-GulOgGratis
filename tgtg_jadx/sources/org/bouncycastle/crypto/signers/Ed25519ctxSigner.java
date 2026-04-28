package org.bouncycastle.crypto.signers;

import c50.w;
import com.braze.h2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Ed25519ctxSigner implements Signer {
    private final Buffer buffer = new Buffer();
    private final byte[] context;
    private boolean forSigning;
    private Ed25519PrivateKeyParameters privateKey;
    private Ed25519PublicKeyParameters publicKey;

    public static final class Buffer extends ByteArrayOutputStream {
        private Buffer() {
        }

        public synchronized byte[] generateSignature(Ed25519PrivateKeyParameters ed25519PrivateKeyParameters, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[64];
            ed25519PrivateKeyParameters.sign(1, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }

        public synchronized boolean verifySignature(Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2) {
            if (64 != bArr2.length) {
                reset();
                return false;
            }
            boolean zVerify = ed25519PublicKeyParameters.verify(1, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return zVerify;
        }
    }

    public Ed25519ctxSigner(byte[] bArr) {
        if (bArr != null) {
            this.context = Arrays.clone(bArr);
        } else {
            w.l("'context' cannot be null");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        Ed25519PrivateKeyParameters ed25519PrivateKeyParameters;
        if (this.forSigning && (ed25519PrivateKeyParameters = this.privateKey) != null) {
            return this.buffer.generateSignature(ed25519PrivateKeyParameters, this.context);
        }
        h2.b("Ed25519ctxSigner not initialised for signature generation.");
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
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) throws IOException {
        this.buffer.write(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (!this.forSigning && (ed25519PublicKeyParameters = this.publicKey) != null) {
            return this.buffer.verifySignature(ed25519PublicKeyParameters, this.context, bArr);
        }
        h2.b("Ed25519ctxSigner not initialised for verification");
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) throws IOException {
        this.buffer.write(bArr, i11, i12);
    }
}
