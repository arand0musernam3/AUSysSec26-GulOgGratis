package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes3.dex */
final class GF13 extends GF {
    private int gf_mul_ext_par(short s7, short s8, short s11, short s12) {
        int i11 = (s8 & 1) * s7;
        int i12 = (s12 & 1) * s11;
        for (int i13 = 1; i13 < 13; i13++) {
            int i14 = 1 << i13;
            i11 ^= (s8 & i14) * s7;
            i12 ^= (i14 & s12) * s11;
        }
        return i11 ^ i12;
    }

    private short gf_sq2(short s7) {
        return gf_reduce(Interleave.expand16to32(gf_reduce(Interleave.expand16to32(s7))));
    }

    private short gf_sq2mul(short s7, short s8) {
        long j9 = s7;
        long j11 = s8;
        long j12 = (j11 << 18) * (64 & j9);
        long j13 = j9 ^ (j9 << 21);
        long j14 = ((j11 << 15) * (j13 & 8589934624L)) ^ (((((j12 ^ ((268435457 & j13) * j11)) ^ ((j11 << 3) * (536870914 & j13))) ^ ((j11 << 6) * (1073741828 & j13))) ^ ((j11 << 9) * (2147483656L & j13))) ^ ((j11 << 12) * (4294967312L & j13)));
        long j15 = 2305834213120671744L & j14;
        long j16 = j14 ^ ((j15 >>> 26) ^ (((j15 >>> 18) ^ (j15 >>> 20)) ^ (j15 >>> 24)));
        long j17 = 8796025913344L & j16;
        return gf_reduce(((int) (j16 ^ ((j17 >>> 26) ^ (((j17 >>> 18) ^ (j17 >>> 20)) ^ (j17 >>> 24))))) & 67108863);
    }

    private short gf_sqmul(short s7, short s8) {
        long j9 = s7;
        long j11 = s8;
        long j12 = (j11 << 6) * (64 & j9);
        long j13 = j9 ^ (j9 << 7);
        long j14 = ((j11 << 5) * (j13 & 524320)) ^ (((((j12 ^ ((16385 & j13) * j11)) ^ ((j11 << 1) * (32770 & j13))) ^ ((j11 << 2) * (65540 & j13))) ^ ((j11 << 3) * (131080 & j13))) ^ ((j11 << 4) * (262160 & j13)));
        long j15 = 137371844608L & j14;
        return gf_reduce(((int) (j14 ^ ((j15 >>> 26) ^ (((j15 >>> 18) ^ (j15 >>> 20)) ^ (j15 >>> 24))))) & 67108863);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s7, short s8) {
        short sGf_sqmul = gf_sqmul(s7, s7);
        short sGf_sq2mul = gf_sq2mul(sGf_sqmul, sGf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(sGf_sq2mul), sGf_sq2mul)), sGf_sq2mul), s8);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s7) {
        return gf_frac(s7, (short) 1);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s7, short s8) {
        int i11 = (s8 & 1) * s7;
        for (int i12 = 1; i12 < 13; i12++) {
            i11 ^= ((1 << i12) & s8) * s7;
        }
        return gf_reduce(i11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_mul_ext(short s7, short s8) {
        int i11 = (s8 & 1) * s7;
        for (int i12 = 1; i12 < 13; i12++) {
            i11 ^= ((1 << i12) & s8) * s7;
        }
        return i11;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public void gf_mul_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2) {
        iArr2[0] = gf_mul_ext(sArr2[0], sArr3[0]);
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i12 + i12;
            iArr2[i13 - 1] = 0;
            short s7 = sArr2[i12];
            short s8 = sArr3[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = i12 + i14;
                iArr2[i15] = iArr2[i15] ^ gf_mul_ext_par(s7, sArr3[i14], sArr2[i14], s8);
            }
            iArr2[i13] = gf_mul_ext(s7, s8);
        }
        for (int i16 = (i11 - 1) * 2; i16 >= i11; i16--) {
            int i17 = iArr2[i16];
            for (int i18 : iArr) {
                int i19 = (i16 - i11) + i18;
                iArr2[i19] = iArr2[i19] ^ i17;
            }
        }
        for (int i21 = 0; i21 < i11; i21++) {
            sArr[i21] = gf_reduce(iArr2[i21]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_reduce(int i11) {
        int i12 = i11 & 8191;
        int i13 = i11 >>> 13;
        int i14 = ((i13 << 4) ^ (i13 << 3)) ^ (i13 << 1);
        int i15 = i14 >>> 13;
        return (short) ((((i13 ^ i12) ^ i15) ^ (i14 & 8191)) ^ (((i15 << 4) ^ (i15 << 3)) ^ (i15 << 1)));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_sq(short s7) {
        return gf_reduce(Interleave.expand16to32(s7));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_sq_ext(short s7) {
        return Interleave.expand16to32(s7);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public void gf_sqr_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2) {
        iArr2[0] = gf_sq_ext(sArr2[0]);
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i12 + i12;
            iArr2[i13 - 1] = 0;
            iArr2[i13] = gf_sq_ext(sArr2[i12]);
        }
        for (int i14 = (i11 - 1) * 2; i14 >= i11; i14--) {
            int i15 = iArr2[i14];
            for (int i16 : iArr) {
                int i17 = (i14 - i11) + i16;
                iArr2[i17] = iArr2[i17] ^ i15;
            }
        }
        for (int i18 = 0; i18 < i11; i18++) {
            sArr[i18] = gf_reduce(iArr2[i18]);
        }
    }
}
