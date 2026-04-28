package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes3.dex */
class FalconSign {
    public int do_sign_dyn(SamplerCtx samplerCtx, short[] sArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr2, int i11, double[] dArr, int i12) {
        int i13 = 1 << i11;
        int i14 = i12 + i13;
        int i15 = i14 + i13;
        int i16 = i15 + i13;
        smallints_to_fpr(dArr, i14, bArr, i11);
        smallints_to_fpr(dArr, i12, bArr2, i11);
        smallints_to_fpr(dArr, i16, bArr3, i11);
        smallints_to_fpr(dArr, i15, bArr4, i11);
        FalconFFT.FFT(dArr, i14, i11);
        FalconFFT.FFT(dArr, i12, i11);
        FalconFFT.FFT(dArr, i16, i11);
        FalconFFT.FFT(dArr, i15, i11);
        FalconFFT.poly_neg(dArr, i14, i11);
        FalconFFT.poly_neg(dArr, i16, i11);
        int i17 = i16 + i13;
        int i18 = i17 + i13;
        System.arraycopy(dArr, i14, dArr, i17, i13);
        FalconFFT.poly_mulselfadj_fft(dArr, i17, i11);
        System.arraycopy(dArr, i12, dArr, i18, i13);
        FalconFFT.poly_muladj_fft(dArr, i18, dArr, i15, i11);
        FalconFFT.poly_mulselfadj_fft(dArr, i12, i11);
        FalconFFT.poly_add(dArr, i12, dArr, i17, i11);
        System.arraycopy(dArr, i14, dArr, i17, i13);
        FalconFFT.poly_muladj_fft(dArr, i14, dArr, i16, i11);
        FalconFFT.poly_add(dArr, i14, dArr, i18, i11);
        FalconFFT.poly_mulselfadj_fft(dArr, i15, i11);
        System.arraycopy(dArr, i16, dArr, i18, i13);
        FalconFFT.poly_mulselfadj_fft(dArr, i18, i11);
        FalconFFT.poly_add(dArr, i15, dArr, i18, i11);
        int i19 = i18 + i13;
        for (int i21 = 0; i21 < i13; i21++) {
            dArr[i18 + i21] = sArr2[i21];
        }
        FalconFFT.FFT(dArr, i18, i11);
        System.arraycopy(dArr, i18, dArr, i19, i13);
        FalconFFT.poly_mul_fft(dArr, i19, dArr, i17, i11);
        FalconFFT.poly_mulconst(dArr, i19, -8.137358613394092E-5d, i11);
        FalconFFT.poly_mul_fft(dArr, i18, dArr, i16, i11);
        FalconFFT.poly_mulconst(dArr, i18, 8.137358613394092E-5d, i11);
        int i22 = i13 * 2;
        System.arraycopy(dArr, i18, dArr, i16, i22);
        ffSampling_fft_dyntree(samplerCtx, dArr, i16, dArr, i17, dArr, i12, dArr, i14, dArr, i15, i11, i11, dArr, i18);
        System.arraycopy(dArr, i16, dArr, i17, i22);
        smallints_to_fpr(dArr, i14, bArr, i11);
        smallints_to_fpr(dArr, i12, bArr2, i11);
        smallints_to_fpr(dArr, i16, bArr3, i11);
        smallints_to_fpr(dArr, i15, bArr4, i11);
        FalconFFT.FFT(dArr, i14, i11);
        FalconFFT.FFT(dArr, i12, i11);
        FalconFFT.FFT(dArr, i16, i11);
        FalconFFT.FFT(dArr, i15, i11);
        FalconFFT.poly_neg(dArr, i14, i11);
        FalconFFT.poly_neg(dArr, i16, i11);
        int i23 = i19 + i13;
        System.arraycopy(dArr, i17, dArr, i19, i13);
        System.arraycopy(dArr, i18, dArr, i23, i13);
        FalconFFT.poly_mul_fft(dArr, i19, dArr, i12, i11);
        FalconFFT.poly_mul_fft(dArr, i23, dArr, i15, i11);
        FalconFFT.poly_add(dArr, i19, dArr, i23, i11);
        System.arraycopy(dArr, i17, dArr, i23, i13);
        FalconFFT.poly_mul_fft(dArr, i23, dArr, i14, i11);
        System.arraycopy(dArr, i19, dArr, i17, i13);
        FalconFFT.poly_mul_fft(dArr, i18, dArr, i16, i11);
        FalconFFT.poly_add(dArr, i18, dArr, i23, i11);
        FalconFFT.iFFT(dArr, i17, i11);
        FalconFFT.iFFT(dArr, i18, i11);
        int i24 = 0;
        int i25 = 0;
        for (int i26 = 0; i26 < i13; i26++) {
            int iFpr_rint = (sArr2[i26] & HPKE.aead_EXPORT_ONLY) - ((int) FPREngine.fpr_rint(dArr[i17 + i26]));
            i24 += iFpr_rint * iFpr_rint;
            i25 |= i24;
        }
        int i27 = i24 | (-(i25 >>> 31));
        short[] sArr3 = new short[i13];
        for (int i28 = 0; i28 < i13; i28++) {
            sArr3[i28] = (short) (-FPREngine.fpr_rint(dArr[i18 + i28]));
        }
        if (FalconCommon.is_short_half(i27, sArr3, i11) == 0) {
            return 0;
        }
        System.arraycopy(sArr3, 0, sArr, 0, i13);
        return 1;
    }

    public void ffSampling_fft_dyntree(SamplerCtx samplerCtx, double[] dArr, int i11, double[] dArr2, int i12, double[] dArr3, int i13, double[] dArr4, int i14, double[] dArr5, int i15, int i16, int i17, double[] dArr6, int i18) {
        if (i17 == 0) {
            double dSqrt = Math.sqrt(dArr3[i13]) * FPREngine.fpr_inv_sigma[i16];
            dArr[i11] = SamplerZ.sample(samplerCtx, dArr[i11], dSqrt);
            dArr2[i12] = SamplerZ.sample(samplerCtx, dArr2[i12], dSqrt);
            return;
        }
        int i19 = 1 << i17;
        int i21 = i19 >> 1;
        FalconFFT.poly_LDL_fft(dArr3, i13, dArr4, i14, dArr5, i15, i17);
        int i22 = i18 + i21;
        FalconFFT.poly_split_fft(dArr6, i18, dArr6, i22, dArr3, i13, i17);
        System.arraycopy(dArr6, i18, dArr3, i13, i19);
        FalconFFT.poly_split_fft(dArr6, i18, dArr6, i22, dArr5, i15, i17);
        System.arraycopy(dArr6, i18, dArr5, i15, i19);
        System.arraycopy(dArr4, i14, dArr6, i18, i19);
        System.arraycopy(dArr3, i13, dArr4, i14, i21);
        int i23 = i14 + i21;
        System.arraycopy(dArr5, i15, dArr4, i23, i21);
        int i24 = i18 + i19;
        int i25 = i24 + i21;
        FalconFFT.poly_split_fft(dArr6, i24, dArr6, i25, dArr2, i12, i17);
        int i26 = i17 - 1;
        ffSampling_fft_dyntree(samplerCtx, dArr6, i24, dArr6, i25, dArr5, i15, dArr5, i15 + i21, dArr4, i23, i16, i26, dArr6, i24 + i19);
        int i27 = i18 + (i19 << 1);
        FalconFFT.poly_merge_fft(dArr6, i27, dArr6, i24, dArr6, i25, i17);
        System.arraycopy(dArr2, i12, dArr6, i24, i19);
        FalconFFT.poly_sub(dArr6, i24, dArr6, i27, i17);
        System.arraycopy(dArr6, i27, dArr2, i12, i19);
        FalconFFT.poly_mul_fft(dArr6, i18, dArr6, i24, i17);
        FalconFFT.poly_add(dArr, i11, dArr6, i18, i17);
        FalconFFT.poly_split_fft(dArr6, i18, dArr6, i22, dArr, i11, i17);
        ffSampling_fft_dyntree(samplerCtx, dArr6, i18, dArr6, i22, dArr3, i13, dArr3, i13 + i21, dArr4, i14, i16, i26, dArr6, i24);
        FalconFFT.poly_merge_fft(dArr, i11, dArr6, i18, dArr6, i22, i17);
    }

    public void sign_dyn(short[] sArr, SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr2, int i11, double[] dArr) {
        SamplerCtx samplerCtx;
        do {
            samplerCtx = new SamplerCtx();
            samplerCtx.sigma_min = FPREngine.fpr_sigma_min[i11];
            samplerCtx.f33490p.prng_init(sHAKEDigest);
        } while (do_sign_dyn(samplerCtx, sArr, bArr, bArr2, bArr3, bArr4, sArr2, i11, dArr, 0) == 0);
    }

    public void smallints_to_fpr(double[] dArr, int i11, byte[] bArr, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            dArr[i11 + i14] = bArr[i14];
        }
    }
}
