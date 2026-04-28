package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFk1vSDK {
    public static long[] getMediationNetwork(int i11, int i12) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i12) & 4294967295L) | ((((long) i11) & 4294967295L) << 32);
        for (int i13 = 1; i13 < 4; i13++) {
            long j9 = jArr[i13 - 1];
            jArr[i13] = ((j9 ^ (j9 >> 30)) * 1812433253) + ((long) i13);
        }
        return jArr;
    }
}
