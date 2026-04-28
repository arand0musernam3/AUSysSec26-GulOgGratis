package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes3.dex */
class SamplerZ {
    private static int BerExp(FalconRNG falconRNG, double d3, double d11) {
        int iPrng_get_u8;
        int i11 = (int) (1.4426950408889634d * d3);
        long jFpr_expm_p63 = ((FPREngine.fpr_expm_p63(d3 - (((double) i11) * 0.6931471805599453d), d11) << 1) - 1) >>> (i11 ^ ((i11 ^ 63) & (-((63 - i11) >>> 31))));
        int i12 = 64;
        do {
            i12 -= 8;
            iPrng_get_u8 = (falconRNG.prng_get_u8() & 255) - (((int) (jFpr_expm_p63 >>> i12)) & 255);
            if (iPrng_get_u8 != 0) {
                break;
            }
        } while (i12 > 0);
        return iPrng_get_u8 >>> 31;
    }

    public static int gaussian0_sampler(FalconRNG falconRNG) {
        int[] iArr = {10745844, 3068844, 3741698, 5559083, 1580863, 8248194, 2260429, 13669192, 2736639, 708981, 4421575, 10046180, 169348, 7122675, 4136815, 30538, 13063405, 7650655, 4132, 14505003, 7826148, 417, 16768101, 11363290, 31, 8444042, 8086568, 1, 12844466, 265321, 0, 1232676, 13644283, 0, 38047, 9111839, 0, 870, 6138264, 0, 14, 12545723, 0, 0, 3104126, 0, 0, 28824, 0, 0, 198, 0, 0, 1};
        long jPrng_get_u64 = falconRNG.prng_get_u64();
        int i11 = ((int) jPrng_get_u64) & 16777215;
        int i12 = 16777215 & ((int) (jPrng_get_u64 >>> 24));
        int iPrng_get_u8 = ((falconRNG.prng_get_u8() & 255) << 16) | ((int) (jPrng_get_u64 >>> 48));
        int i13 = 0;
        for (int i14 = 0; i14 < 54; i14 += 3) {
            i13 += ((iPrng_get_u8 - iArr[i14]) - (((i12 - iArr[i14 + 1]) - ((i11 - iArr[i14 + 2]) >>> 31)) >>> 31)) >>> 31;
        }
        return i13;
    }

    public static int sample(SamplerCtx samplerCtx, double d3, double d11) {
        return sampler(samplerCtx, d3, d11);
    }

    private static int sampler(SamplerCtx samplerCtx, double d3, double d11) {
        int iGaussian0_sampler;
        int iPrng_get_u8;
        double d12;
        int iFpr_floor = (int) FPREngine.fpr_floor(d3);
        double d13 = d3 - ((double) iFpr_floor);
        double d14 = d11 * d11 * 0.5d;
        double d15 = d11 * samplerCtx.sigma_min;
        do {
            iGaussian0_sampler = gaussian0_sampler(samplerCtx.f33490p);
            iPrng_get_u8 = (((r4 << 1) - 1) * iGaussian0_sampler) + (samplerCtx.f33490p.prng_get_u8() & 1);
            d12 = ((double) iPrng_get_u8) - d13;
        } while (BerExp(samplerCtx.f33490p, ((d12 * d12) * d14) - (((double) (iGaussian0_sampler * iGaussian0_sampler)) * 0.15086504887537272d), d15) == 0);
        return iFpr_floor + iPrng_get_u8;
    }
}
