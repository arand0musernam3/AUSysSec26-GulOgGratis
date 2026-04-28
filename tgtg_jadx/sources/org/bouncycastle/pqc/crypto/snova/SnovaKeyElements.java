package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
class SnovaKeyElements {
    public final byte[][][] T12;
    public final MapGroup1 map1;
    public final MapGroup2 map2;

    public SnovaKeyElements(SnovaParameters snovaParameters) {
        int o11 = snovaParameters.getO();
        int v3 = snovaParameters.getV();
        int lsq = snovaParameters.getLsq();
        this.map1 = new MapGroup1(snovaParameters);
        this.T12 = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, v3, o11, lsq);
        this.map2 = new MapGroup2(snovaParameters);
    }

    public static int copy3d(byte[] bArr, int i11, byte[][][] bArr2) {
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            int i13 = 0;
            while (true) {
                byte[][] bArr3 = bArr2[i12];
                if (i13 < bArr3.length) {
                    byte[] bArr4 = bArr3[i13];
                    System.arraycopy(bArr, i11, bArr4, 0, bArr4.length);
                    i11 += bArr2[i12][i13].length;
                    i13++;
                }
            }
        }
        return i11;
    }

    public static int copy4d(byte[] bArr, int i11, byte[][][][] bArr2) {
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            for (int i13 = 0; i13 < bArr2[i12].length; i13++) {
                int i14 = 0;
                while (true) {
                    byte[][] bArr3 = bArr2[i12][i13];
                    if (i14 < bArr3.length) {
                        byte[] bArr4 = bArr3[i14];
                        System.arraycopy(bArr, i11, bArr4, 0, bArr4.length);
                        i11 += bArr2[i12][i13][i14].length;
                        i14++;
                    }
                }
            }
        }
        return i11;
    }

    public static int copy3d(byte[][][] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = 0;
            while (true) {
                byte[][] bArr3 = bArr[i12];
                if (i13 < bArr3.length) {
                    byte[] bArr4 = bArr3[i13];
                    System.arraycopy(bArr4, 0, bArr2, i11, bArr4.length);
                    i11 += bArr[i12][i13].length;
                    i13++;
                }
            }
        }
        return i11;
    }

    public static int copy4d(byte[][][][] bArr, byte[] bArr2, int i11) {
        for (byte[][][] bArr3 : bArr) {
            i11 = copy3d(bArr3, bArr2, i11);
        }
        return i11;
    }
}
