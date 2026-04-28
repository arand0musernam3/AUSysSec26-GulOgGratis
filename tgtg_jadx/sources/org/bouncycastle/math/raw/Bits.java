package org.bouncycastle.math.raw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Bits {
    public static int bitPermuteStep(int i11, int i12, int i13) {
        int i14 = i12 & ((i11 >>> i13) ^ i11);
        return i11 ^ (i14 ^ (i14 << i13));
    }

    public static int bitPermuteStepSimple(int i11, int i12, int i13) {
        return ((i11 >>> i13) & i12) | ((i11 & i12) << i13);
    }

    public static long bitPermuteStepSimple(long j9, long j11, int i11) {
        return ((j9 >>> i11) & j11) | ((j9 & j11) << i11);
    }

    public static long bitPermuteStep(long j9, long j11, int i11) {
        long j12 = j11 & ((j9 >>> i11) ^ j9);
        return j9 ^ (j12 ^ (j12 << i11));
    }
}
