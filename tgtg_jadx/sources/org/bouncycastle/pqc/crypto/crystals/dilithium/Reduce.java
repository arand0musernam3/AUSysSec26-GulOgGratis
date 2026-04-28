package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes3.dex */
class Reduce {
    public static int conditionalAddQ(int i11) {
        return i11 + ((i11 >> 31) & 8380417);
    }

    public static int montgomeryReduce(long j9) {
        return (int) ((j9 - (((long) ((int) (58728449 * j9))) * 8380417)) >>> 32);
    }

    public static int reduce32(int i11) {
        return i11 - (((4194304 + i11) >> 23) * 8380417);
    }
}
