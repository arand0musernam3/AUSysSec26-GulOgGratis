package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface Signer {
    byte[] generateSignature() throws DataLengthException, CryptoException;

    void init(boolean z11, CipherParameters cipherParameters);

    void reset();

    void update(byte b8);

    void update(byte[] bArr, int i11, int i12);

    boolean verifySignature(byte[] bArr);
}
