package org.bouncycastle.crypto.fpe;

import c50.w;
import com.braze.h2;
import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FPEEngine {
    protected final BlockCipher baseCipher;
    protected boolean forEncryption;
    protected FPEParameters fpeParameters;

    public FPEEngine(BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }

    public static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i11 = 0; i11 != sArr.length; i11++) {
            Pack.shortToBigEndian(sArr[i11], bArr, i11 * 2);
        }
        return bArr;
    }

    public static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            a.f("data must be an even number of bytes for a wide radix");
            return null;
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 != length; i11++) {
            sArr[i11] = Pack.bigEndianToShort(bArr, i11 * 2);
        }
        return sArr;
    }

    public abstract int decryptBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    public abstract int encryptBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    public abstract String getAlgorithmName();

    public abstract void init(boolean z11, CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.fpeParameters == null) {
            h2.b("FPE engine not initialized");
            return 0;
        }
        if (i12 < 0) {
            a.f("input length cannot be negative");
            return 0;
        }
        if (bArr == null || bArr2 == null) {
            w.l("buffer value is null");
            return 0;
        }
        if (bArr.length < i11 + i12) {
            i1.t("input buffer too short");
            return 0;
        }
        if (bArr2.length >= i13 + i12) {
            return this.forEncryption ? encryptBlock(bArr, i11, i12, bArr2, i13) : decryptBlock(bArr, i11, i12, bArr2, i13);
        }
        i1.r("output buffer too short");
        return 0;
    }
}
