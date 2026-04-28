package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException;

    int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException;

    void reset();

    byte returnByte(byte b8);
}
