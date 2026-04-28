package org.bouncycastle.crypto.engines;

import c50.w;
import org.bouncycastle.crypto.digests.ISAPDigest;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes3.dex */
public class AsconPermutationFriend {

    public static class AsconPermutation {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f33096x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public long f33097x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public long f33098x2;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        public long f33099x3;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public long f33100x4;

        public void p(int i11) {
            if (i11 == 12) {
                round(240L);
                round(225L);
                round(210L);
                round(195L);
            }
            if (i11 >= 8) {
                round(180L);
                round(165L);
            }
            round(150L);
            round(135L);
            round(120L);
            round(105L);
            round(90L);
            round(75L);
        }

        public void round(long j9) {
            long j11 = this.f33098x2 ^ j9;
            this.f33098x2 = j11;
            long j12 = this.f33096x0;
            long j13 = this.f33100x4;
            long j14 = j12 ^ j13;
            long j15 = this.f33097x1;
            long j16 = j15 ^ j11;
            long j17 = j15 | j11;
            long j18 = this.f33099x3;
            long j19 = ((j18 ^ j17) ^ j12) ^ (j15 & j14);
            long j21 = (j14 ^ (j17 | j18)) ^ ((j15 & j11) & j18);
            long j22 = ((~j18) & j13) ^ j16;
            long j23 = j16 ^ (j12 | (j18 ^ j13));
            long j24 = (j18 ^ (j13 | j15)) ^ (j12 & j15);
            this.f33096x0 = Longs.rotateRight(j19, 28) ^ (Longs.rotateRight(j19, 19) ^ j19);
            this.f33097x1 = (Longs.rotateRight(j21, 39) ^ j21) ^ Longs.rotateRight(j21, 61);
            this.f33098x2 = ~((Longs.rotateRight(j22, 1) ^ j22) ^ Longs.rotateRight(j22, 6));
            this.f33099x3 = (Longs.rotateRight(j23, 10) ^ j23) ^ Longs.rotateRight(j23, 17);
            this.f33100x4 = Longs.rotateRight(j24, 41) ^ (Longs.rotateRight(j24, 7) ^ j24);
        }

        public void set(long j9, long j11, long j12, long j13, long j14) {
            this.f33096x0 = j9;
            this.f33097x1 = j11;
            this.f33098x2 = j12;
            this.f33099x3 = j13;
            this.f33100x4 = j14;
        }
    }

    public static AsconPermutation getAsconPermutation(ISAPDigest.Friend friend) {
        if (friend != null) {
            return new AsconPermutation();
        }
        w.l("This method is only for use by ISAPDigest or Ascon Digest");
        return null;
    }
}
