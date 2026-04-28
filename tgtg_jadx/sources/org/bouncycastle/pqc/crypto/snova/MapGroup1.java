package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes3.dex */
class MapGroup1 {
    public final byte[][][] aAlpha;
    public final byte[][][] bAlpha;
    public final byte[][][][] p11;
    public final byte[][][][] p12;
    public final byte[][][][] p21;
    public final byte[][][] qAlpha1;
    public final byte[][][] qAlpha2;

    public MapGroup1(SnovaParameters snovaParameters) {
        int m11 = snovaParameters.getM();
        int v3 = snovaParameters.getV();
        int o11 = snovaParameters.getO();
        int alpha = snovaParameters.getAlpha();
        int lsq = snovaParameters.getLsq();
        Class cls = Byte.TYPE;
        this.p11 = (byte[][][][]) Array.newInstance((Class<?>) cls, m11, v3, v3, lsq);
        this.p12 = (byte[][][][]) Array.newInstance((Class<?>) cls, m11, v3, o11, lsq);
        this.p21 = (byte[][][][]) Array.newInstance((Class<?>) cls, m11, o11, v3, lsq);
        this.aAlpha = (byte[][][]) Array.newInstance((Class<?>) cls, m11, alpha, lsq);
        this.bAlpha = (byte[][][]) Array.newInstance((Class<?>) cls, m11, alpha, lsq);
        this.qAlpha1 = (byte[][][]) Array.newInstance((Class<?>) cls, m11, alpha, lsq);
        this.qAlpha2 = (byte[][][]) Array.newInstance((Class<?>) cls, m11, alpha, lsq);
    }

    private static int decodeAlpha(byte[] bArr, int i11, byte[][][] bArr2, int i12) {
        int iDecodeArray = 0;
        for (byte[][] bArr3 : bArr2) {
            iDecodeArray += decodeArray(bArr, i11 + iDecodeArray, bArr3, i12 - iDecodeArray);
        }
        return iDecodeArray;
    }

    public static int decodeArray(byte[] bArr, int i11, byte[][] bArr2, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < bArr2.length; i14++) {
            int iMin = Math.min(bArr2[i14].length, i12 << 1);
            GF16.decode(bArr, i11 + i13, bArr2[i14], 0, iMin);
            int i15 = (iMin + 1) >> 1;
            i13 += i15;
            i12 -= i15;
        }
        return i13;
    }

    public static int decodeP(byte[] bArr, int i11, byte[][][][] bArr2, int i12) {
        int iDecodeAlpha = 0;
        for (byte[][][] bArr3 : bArr2) {
            iDecodeAlpha += decodeAlpha(bArr, i11 + iDecodeAlpha, bArr3, i12);
        }
        return iDecodeAlpha;
    }

    public static int fillAlpha(byte[] bArr, int i11, byte[][][] bArr2, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < bArr2.length; i14++) {
            int i15 = 0;
            while (true) {
                byte[][] bArr3 = bArr2[i14];
                if (i15 < bArr3.length) {
                    int iMin = Math.min(bArr3[i15].length, i12 - i13);
                    System.arraycopy(bArr, i11 + i13, bArr2[i14][i15], 0, iMin);
                    i13 += iMin;
                    i15++;
                }
            }
        }
        return i13;
    }

    public static int fillP(byte[] bArr, int i11, byte[][][][] bArr2, int i12) {
        int iFillAlpha = 0;
        for (byte[][][] bArr3 : bArr2) {
            iFillAlpha += fillAlpha(bArr, i11 + iFillAlpha, bArr3, i12 - iFillAlpha);
        }
        return iFillAlpha;
    }

    public void decode(byte[] bArr, int i11, boolean z11) {
        int iDecodeP = decodeP(bArr, 0, this.p11, i11);
        int iDecodeP2 = iDecodeP + decodeP(bArr, iDecodeP, this.p12, i11 - iDecodeP);
        int iDecodeP3 = iDecodeP2 + decodeP(bArr, iDecodeP2, this.p21, i11 - iDecodeP2);
        if (z11) {
            int iDecodeAlpha = iDecodeP3 + decodeAlpha(bArr, iDecodeP3, this.aAlpha, i11 - iDecodeP3);
            int iDecodeAlpha2 = iDecodeAlpha + decodeAlpha(bArr, iDecodeAlpha, this.bAlpha, i11 - iDecodeAlpha);
            int iDecodeAlpha3 = iDecodeAlpha2 + decodeAlpha(bArr, iDecodeAlpha2, this.qAlpha1, i11 - iDecodeAlpha2);
            decodeAlpha(bArr, iDecodeAlpha3, this.qAlpha2, i11 - iDecodeAlpha3);
        }
    }

    public void fill(byte[] bArr, boolean z11) {
        int iFillP = fillP(bArr, 0, this.p11, bArr.length);
        int iFillP2 = iFillP + fillP(bArr, iFillP, this.p12, bArr.length - iFillP);
        int iFillP3 = iFillP2 + fillP(bArr, iFillP2, this.p21, bArr.length - iFillP2);
        if (z11) {
            int iFillAlpha = iFillP3 + fillAlpha(bArr, iFillP3, this.aAlpha, bArr.length - iFillP3);
            int iFillAlpha2 = iFillAlpha + fillAlpha(bArr, iFillAlpha, this.bAlpha, bArr.length - iFillAlpha);
            int iFillAlpha3 = iFillAlpha2 + fillAlpha(bArr, iFillAlpha2, this.qAlpha1, bArr.length - iFillAlpha2);
            fillAlpha(bArr, iFillAlpha3, this.qAlpha2, bArr.length - iFillAlpha3);
        }
    }
}
