package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException;

    void init(DerivationParameters derivationParameters);
}
