package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes3.dex */
public interface AEADCipher {
    int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException;

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i11);

    int getUpdateOutputSize(int i11);

    void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException;

    void processAADByte(byte b8);

    void processAADBytes(byte[] bArr, int i11, int i12);

    int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException;

    int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException;

    void reset();
}
