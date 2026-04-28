package org.bouncycastle.pqc.legacy.crypto.gemss;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class GeMSSUtils {
    public static long CMP_LT_UINT(long j9, long j11) {
        long j12 = j9 >>> 63;
        long j13 = j11 >>> 63;
        long j14 = j12 ^ j13;
        return ((((j9 & LongCompanionObject.MAX_VALUE) - (j11 & LongCompanionObject.MAX_VALUE)) >>> 63) & (1 ^ j14)) ^ (((j12 - j13) >>> 63) & j14);
    }

    public static int Highest_One(int i11) {
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        return i16 ^ (i16 >>> 1);
    }

    public static long NORBITS_UINT(long j9) {
        return (((j9 | (j9 << 32)) >>> 32) - 1) >>> 63;
    }

    public static long ORBITS_UINT(long j9) {
        return (((j9 | (j9 << 32)) >>> 32) + 4294967295L) >>> 32;
    }

    public static long XORBITS_UINT(long j9) {
        long j11 = j9 ^ (j9 << 1);
        return (((j11 ^ (j11 << 2)) & (-8608480567731124088L)) * 1229782938247303441L) >>> 63;
    }

    public static long maskUINT(int i11) {
        if (i11 != 0) {
            return (1 << i11) - 1;
        }
        return -1L;
    }
}
