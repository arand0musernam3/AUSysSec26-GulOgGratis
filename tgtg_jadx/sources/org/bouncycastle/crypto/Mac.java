package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException;

    String getAlgorithmName();

    int getMacSize();

    void init(CipherParameters cipherParameters) throws IllegalArgumentException;

    void reset();

    void update(byte b8) throws IllegalStateException;

    void update(byte[] bArr, int i11, int i12) throws IllegalStateException, DataLengthException;
}
