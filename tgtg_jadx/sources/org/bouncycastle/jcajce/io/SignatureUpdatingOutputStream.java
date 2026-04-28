package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
class SignatureUpdatingOutputStream extends OutputStream {
    private Signature sig;

    public SignatureUpdatingOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        try {
            this.sig.update((byte) i11);
        } catch (SignatureException e5) {
            throw Exceptions.ioException(e5.getMessage(), e5);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.sig.update(bArr);
        } catch (SignatureException e5) {
            throw Exceptions.ioException(e5.getMessage(), e5);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        try {
            this.sig.update(bArr, i11, i12);
        } catch (SignatureException e5) {
            throw Exceptions.ioException(e5.getMessage(), e5);
        }
    }
}
