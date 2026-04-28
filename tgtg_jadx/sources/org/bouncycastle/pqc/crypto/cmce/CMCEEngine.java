package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    private GF f33470gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i11, int i12, int i13, int[] iArr, boolean z11, int i14) {
        BENES benes13;
        this.usePivots = z11;
        this.SYS_N = i12;
        this.SYS_T = i13;
        this.GFBITS = i11;
        this.poly = iArr;
        this.defaultKeySize = i14;
        this.IRR_BYTES = i13 * 2;
        this.COND_BYTES = ((i11 * 2) - 1) * (1 << (i11 - 4));
        int i15 = i13 * i11;
        this.PK_NROWS = i15;
        int i16 = i12 - i15;
        this.PK_NCOLS = i16;
        this.PK_ROW_BYTES = (i16 + 7) / 8;
        this.SYND_BYTES = (i15 + 7) / 8;
        this.GFMASK = (1 << i11) - 1;
        if (i11 == 12) {
            this.f33470gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.f33470gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void bm(short[] sArr, short[] sArr2) {
        GF gf2;
        int i11;
        int i12 = this.SYS_T;
        short[] sArr3 = new short[i12 + 1];
        short[] sArr4 = new short[i12 + 1];
        short s7 = 1;
        short[] sArr5 = new short[i12 + 1];
        int i13 = 0;
        for (int i14 = 0; i14 < this.SYS_T + 1; i14++) {
            sArr5[i14] = 0;
            sArr4[i14] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s8 = 1;
        short s11 = 0;
        short s12 = 0;
        while (s11 < this.SYS_T * 2) {
            int i15 = 0;
            int iGf_mul_ext = 0;
            while (true) {
                int iMin = min(s11, this.SYS_T);
                gf2 = this.f33470gf;
                if (i15 > iMin) {
                    break;
                }
                iGf_mul_ext ^= gf2.gf_mul_ext(sArr4[i15], sArr2[s11 - i15]);
                i15++;
            }
            short sGf_reduce = gf2.gf_reduce(iGf_mul_ext);
            short s13 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s7)) - s7);
            short s14 = (short) (((short) (((short) (((short) (((short) (s11 - (s12 * 2))) >> 15)) & s7)) - s7)) & s13);
            for (int i16 = 0; i16 <= this.SYS_T; i16++) {
                sArr3[i16] = sArr4[i16];
            }
            short sGf_frac = this.f33470gf.gf_frac(s8, sGf_reduce);
            int i17 = 0;
            while (true) {
                i11 = this.SYS_T;
                if (i17 > i11) {
                    break;
                }
                sArr4[i17] = (short) ((this.f33470gf.gf_mul(sGf_frac, sArr5[i17]) & s13) ^ sArr4[i17]);
                i17++;
            }
            int i18 = ~s14;
            int i19 = s11 + 1;
            s12 = (short) (((i19 - s12) & s14) | (s12 & i18));
            for (int i21 = i11 - 1; i21 >= 0; i21--) {
                sArr5[i21 + 1] = (short) ((sArr5[i21] & i18) | (sArr3[i21] & s14));
            }
            sArr5[0] = 0;
            s8 = (short) ((i18 & s8) | (sGf_reduce & s14));
            s11 = (short) i19;
            s7 = 1;
        }
        while (true) {
            int i22 = this.SYS_T;
            if (i13 > i22) {
                return;
            }
            sArr[i13] = sArr4[i22 - i13];
            i13++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j9, long j11, short[] sArr, int i11, long j12, long j13, int[] iArr) {
        long j14;
        int i12;
        int i13;
        int i14;
        char c3;
        long j15;
        long j16;
        long j17;
        long j18 = j13;
        long j19 = 1;
        long j21 = 7;
        char c7 = 3;
        if (j12 == 1) {
            int i15 = (int) (j9 >> 3);
            bArr[i15] = (byte) ((get_q_short(iArr, i11) << ((int) (j9 & 7))) ^ bArr[i15]);
            return;
        }
        if (sArr != null) {
            long j22 = 0;
            while (j22 < j18) {
                int i16 = (int) j22;
                long j23 = j19;
                iArr[i16] = sArr[(int) (j22 ^ j23)] | ((sArr[i16] ^ 1) << 16);
                j22 += j23;
                j19 = j23;
            }
            j14 = j19;
        } else {
            j14 = 1;
            long j24 = 0;
            while (j24 < j18) {
                long j25 = i11;
                iArr[(int) j24] = ((get_q_short(iArr, (int) (j25 + j24)) ^ 1) << 16) | get_q_short(iArr, (int) (j25 + (j24 ^ 1)));
                j24++;
                j21 = j21;
            }
        }
        long j26 = j21;
        int i17 = (int) j18;
        sort32(iArr, 0, i17);
        long j27 = 0;
        while (true) {
            i12 = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            if (j27 >= j18) {
                break;
            }
            int i18 = (int) j27;
            int i19 = 65535 & iArr[i18];
            if (j27 >= i19) {
                i18 = i19;
            }
            iArr[(int) (j18 + j27)] = i18 | (i19 << 16);
            j27 += j14;
        }
        for (long j28 = 0; j28 < j18; j28 += j14) {
            int i21 = (int) j28;
            iArr[i21] = (int) (((long) (iArr[i21] << 16)) | j28);
        }
        sort32(iArr, 0, i17);
        long j29 = 0;
        while (j29 < j18) {
            int i22 = (int) j29;
            iArr[i22] = (iArr[i22] << 16) + (iArr[(int) (j18 + j29)] >> 16);
            j29 += j14;
            c7 = c7;
        }
        char c8 = c7;
        sort32(iArr, 0, i17);
        if (j12 <= 10) {
            for (long j31 = 0; j31 < j18; j31 += j14) {
                int i23 = (int) (j18 + j31);
                iArr[i23] = ((iArr[(int) j31] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 10) | (iArr[i23] & 1023);
            }
            long j32 = j14;
            while (j32 < j12 - j14) {
                long j33 = 0;
                while (j33 < j18) {
                    iArr[(int) j33] = (int) (((long) ((iArr[(int) (j18 + j33)] & (-1024)) << 6)) | j33);
                    j33 += j14;
                    j32 = j32;
                }
                long j34 = j32;
                sort32(iArr, 0, i17);
                for (long j35 = 0; j35 < j18; j35 += j14) {
                    int i24 = (int) j35;
                    iArr[i24] = (iArr[i24] << 20) | iArr[(int) (j18 + j35)];
                }
                sort32(iArr, 0, i17);
                for (long j36 = 0; j36 < j18; j36 += j14) {
                    int i25 = iArr[(int) j36];
                    int i26 = 1048575 & i25;
                    int i27 = (int) (j18 + j36);
                    int i28 = (i25 & 1047552) | (iArr[i27] & 1023);
                    if (i26 >= i28) {
                        i26 = i28;
                    }
                    iArr[i27] = i26;
                }
                j32 = j34 + j14;
            }
            for (long j37 = 0; j37 < j18; j37 += j14) {
                int i29 = (int) (j18 + j37);
                iArr[i29] = iArr[i29] & 1023;
            }
            i13 = 65535;
            i14 = -65536;
            c3 = c8;
            j15 = j14;
        } else {
            int i31 = -65536;
            for (long j38 = 0; j38 < j18; j38 += j14) {
                int i32 = (int) (j18 + j38);
                iArr[i32] = (iArr[(int) j38] << 16) | (iArr[i32] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            long j39 = j14;
            while (j39 < j12 - j14) {
                long j41 = 0;
                while (j41 < j18) {
                    int i33 = i31;
                    iArr[(int) j41] = (int) (((long) (iArr[(int) (j18 + j41)] & i33)) | j41);
                    j41 += j14;
                    i12 = i12;
                    i31 = i33;
                }
                int i34 = i12;
                int i35 = i31;
                sort32(iArr, 0, i17);
                long j42 = 0;
                while (j42 < j18) {
                    int i36 = (int) j42;
                    long j43 = j14;
                    iArr[i36] = (iArr[i36] << 16) | (iArr[(int) (j18 + j42)] & i34);
                    j42 += j43;
                    c8 = c8;
                    j14 = j43;
                }
                char c11 = c8;
                long j44 = j14;
                if (j39 < j12 - 2) {
                    for (long j45 = 0; j45 < j18; j45 += j44) {
                        int i37 = (int) (j18 + j45);
                        iArr[i37] = (iArr[(int) j45] & i35) | (iArr[i37] >> 16);
                    }
                    sort32(iArr, i17, (int) (j18 * 2));
                    for (long j46 = 0; j46 < j18; j46 += j44) {
                        int i38 = (int) (j18 + j46);
                        iArr[i38] = (iArr[i38] << 16) | (iArr[(int) j46] & i34);
                    }
                }
                sort32(iArr, 0, i17);
                for (long j47 = 0; j47 < j18; j47 += j44) {
                    int i39 = (int) (j18 + j47);
                    int i41 = iArr[i39];
                    int i42 = (i41 & i35) | (iArr[(int) j47] & i34);
                    if (i42 < i41) {
                        iArr[i39] = i42;
                    }
                }
                j39 += j44;
                i12 = i34;
                c8 = c11;
                i31 = i35;
                j14 = j44;
            }
            i13 = i12;
            i14 = i31;
            c3 = c8;
            j15 = j14;
            for (long j48 = 0; j48 < j18; j48 += j15) {
                int i43 = (int) (j18 + j48);
                iArr[i43] = iArr[i43] & i13;
            }
        }
        long j49 = 0;
        if (sArr != null) {
            while (j49 < j18) {
                int i44 = (int) j49;
                iArr[i44] = (int) (((long) (sArr[i44] << 16)) + j49);
                j49 += j15;
            }
        } else {
            while (j49 < j18) {
                iArr[(int) j49] = (int) (((long) (get_q_short(iArr, (int) (((long) i11) + j49)) << 16)) + j49);
                j49 += j15;
            }
        }
        sort32(iArr, 0, i17);
        long j51 = j9;
        int i45 = i13;
        long j52 = 0;
        while (true) {
            j16 = j18 / 2;
            if (j52 >= j16) {
                break;
            }
            long j53 = j52 * 2;
            long j54 = j18 + j53;
            int i46 = (int) j54;
            int i47 = i45;
            int i48 = iArr[i46] & 1;
            char c12 = c3;
            int i49 = (int) (((long) i48) + j53);
            long j55 = j51;
            int i51 = (int) (j55 >> c12);
            bArr[i51] = (byte) ((i48 << ((int) (j55 & j26))) ^ bArr[i51]);
            j51 = j55 + j11;
            iArr[i46] = (iArr[(int) j53] << 16) | i49;
            iArr[(int) (j54 + j15)] = (iArr[(int) (j53 + j15)] << 16) | (i49 ^ 1);
            j52 += j15;
            i45 = i47;
            j18 = j13;
            c3 = c12;
        }
        int i52 = i45;
        char c13 = c3;
        long j56 = j13 * 2;
        sort32(iArr, i17, (int) j56);
        long j57 = j12 * 2;
        long j58 = ((j57 - 3) * j11 * j16) + j51;
        long j59 = 0;
        while (true) {
            j17 = j56;
            if (j59 >= j16) {
                break;
            }
            long j61 = j59 * 2;
            long j62 = j57;
            long j63 = j13 + j61;
            int i53 = iArr[(int) j63];
            int i54 = i53 & 1;
            int i55 = (int) (((long) i54) + j61);
            int i56 = i55 ^ 1;
            int i57 = (int) (j58 >> c13);
            bArr[i57] = (byte) (bArr[i57] ^ (i54 << ((int) (j58 & j26))));
            j58 += j11;
            iArr[(int) j61] = (i53 & i52) | (i55 << 16);
            iArr[(int) (j61 + j15)] = (i56 << 16) | (iArr[(int) (j63 + j15)] & i52);
            j59 += j15;
            j56 = j17;
            j57 = j62;
        }
        sort32(iArr, 0, i17);
        long j64 = j58 - (((j57 - 2) * j11) * j16);
        short[] sArr2 = new short[i17 * 4];
        for (long j65 = 0; j65 < j17; j65 += j15) {
            long j66 = j65 * 2;
            int i58 = iArr[(int) j65];
            sArr2[(int) j66] = (short) i58;
            sArr2[(int) (j66 + j15)] = (short) ((i58 & i14) >> 16);
        }
        for (long j67 = 0; j67 < j16; j67 += j15) {
            long j68 = j67 * 2;
            sArr2[(int) j67] = (short) ((iArr[(int) j68] & i52) >>> 1);
            sArr2[(int) (j67 + j16)] = (short) ((iArr[(int) (j68 + j15)] & i52) >>> 1);
        }
        for (long j69 = 0; j69 < j16; j69 += j15) {
            long j71 = j69 * 2;
            iArr[(int) ((j13 / 4) + j13 + j69)] = sArr2[(int) j71] | (sArr2[(int) (j71 + j15)] << 16);
        }
        long j72 = j11 * 2;
        long j73 = (j13 / 4) + j13;
        long j74 = j12 - j15;
        cbrecursion(bArr, j64, j72, null, ((int) j73) * 2, j74, j16, iArr);
        cbrecursion(bArr, j64 + j11, j72, null, (int) ((j73 * 2) + j16), j74, j16, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j9, long j11) {
        long j12 = j11;
        int[] iArr = new int[(int) (j12 * 2)];
        int i11 = (int) j12;
        short[] sArr2 = new short[i11];
        while (true) {
            short s7 = 0;
            for (int i12 = 0; i12 < (((((j9 * 2) - 1) * j12) / 2) + 7) / 8; i12++) {
                bArr[i12] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j9, j12, iArr);
            for (int i13 = 0; i13 < j11; i13++) {
                sArr2[i13] = (short) i13;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < j9; i15++) {
                layer(sArr2, bArr, i14, i15, i11);
                i14 = (int) (((long) i14) + (j11 >> 4));
            }
            for (int i16 = (int) (j9 - 2); i16 >= 0; i16--) {
                layer(sArr2, bArr, i14, i16, i11);
                i14 = (int) (((long) i14) + (j11 >> 4));
            }
            int i17 = 0;
            while (i17 < j11) {
                short s8 = (short) (s7 | (sArr[i17] ^ sArr2[i17]));
                i17++;
                s7 = s8;
            }
            if (s7 == 0) {
                return;
            } else {
                j12 = j11;
            }
        }
    }

    private static int ctz(long j9) {
        long j11 = ~j9;
        long j12 = 72340172838076673L;
        long j13 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j12 &= j11 >>> i11;
            j13 += j12;
        }
        long j14 = 578721382704613384L & j13;
        long j15 = j14 | (j14 >>> 1);
        long j16 = j15 | (j15 >>> 2);
        long j17 = j13 >>> 8;
        long j18 = j13 + (j17 & j16);
        for (int i12 = 2; i12 < 8; i12++) {
            j16 &= j16 >>> 8;
            j17 >>>= 8;
            j18 += j17 & j16;
        }
        return ((int) j18) & 255;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11;
        int i12;
        int i13 = this.SYS_T;
        short[] sArr = new short[i13 + 1];
        int i14 = this.SYS_N;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i13 * 2];
        short[] sArr4 = new short[i13 * 2];
        short[] sArr5 = new short[i13 + 1];
        short[] sArr6 = new short[i14];
        byte[] bArr4 = new byte[i14 / 8];
        int i15 = 0;
        while (true) {
            i11 = this.SYND_BYTES;
            if (i15 >= i11) {
                break;
            }
            bArr4[i15] = bArr3[i15];
            i15++;
        }
        while (i11 < this.SYS_N / 8) {
            bArr4[i11] = 0;
            i11++;
        }
        int i16 = 0;
        while (true) {
            i12 = this.SYS_T;
            if (i16 >= i12) {
                break;
            }
            sArr[i16] = Utils.load_gf(bArr2, (i16 * 2) + 40, this.GFMASK);
            i16++;
        }
        sArr[i12] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i17 = 0; i17 < this.SYS_N / 8; i17++) {
            bArr[i17] = 0;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.SYS_N; i19++) {
            short sGf_iszero = (short) (this.f33470gf.gf_iszero(sArr6[i19]) & 1);
            int i21 = i19 / 8;
            bArr[i21] = (byte) (bArr[i21] | (sGf_iszero << (i19 % 8)));
            i18 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i22 = this.SYS_T ^ i18;
        for (int i23 = 0; i23 < this.SYS_T * 2; i23++) {
            i22 |= sArr3[i23] ^ sArr4[i23];
        }
        return (((i22 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s7) {
        int i11 = this.SYS_T;
        short sGf_mul = sArr[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            sGf_mul = (short) (this.f33470gf.gf_mul(sGf_mul, s7) ^ sArr[i12]);
        }
        return sGf_mul;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i11;
        int i12 = this.SYS_T;
        short[] sArr = new short[i12 * 2];
        short[] sArr2 = new short[i12];
        byte[] bArr2 = new byte[i12];
        while (true) {
            boolean z11 = this.countErrorIndices;
            int i13 = this.SYS_T;
            if (z11) {
                byte[] bArr3 = new byte[i13 * 4];
                secureRandom.nextBytes(bArr3);
                for (int i14 = 0; i14 < this.SYS_T * 2; i14++) {
                    sArr[i14] = Utils.load_gf(bArr3, i14 * 2, this.GFMASK);
                }
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    i11 = this.SYS_T;
                    if (i15 >= i11 * 2 || i16 >= i11) {
                        break;
                    }
                    short s7 = sArr[i15];
                    if (s7 < this.SYS_N) {
                        sArr2[i16] = s7;
                        i16++;
                    }
                    i15++;
                }
                if (i16 < i11) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[i13 * 2];
                secureRandom.nextBytes(bArr4);
                for (int i17 = 0; i17 < this.SYS_T; i17++) {
                    sArr2[i17] = Utils.load_gf(bArr4, i17 * 2, this.GFMASK);
                }
            }
            boolean z12 = false;
            for (int i18 = 1; i18 < this.SYS_T && !z12; i18++) {
                int i19 = 0;
                while (true) {
                    if (i19 >= i18) {
                        break;
                    }
                    if (sArr2[i18] == sArr2[i19]) {
                        z12 = true;
                        break;
                    }
                    i19++;
                }
            }
            if (!z12) {
                break;
            }
        }
        for (int i21 = 0; i21 < this.SYS_T; i21++) {
            bArr2[i21] = (byte) (1 << (sArr2[i21] & 7));
        }
        for (short s8 = 0; s8 < this.SYS_N / 8; s8 = (short) (s8 + 1)) {
            bArr[s8] = 0;
            for (int i22 = 0; i22 < this.SYS_T; i22++) {
                bArr[s8] = (byte) ((((short) (same_mask32(s8, (short) (sArr2[i22] >> 3)) & 255)) & bArr2[i22]) | bArr[s8]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i11;
        int i12 = this.SYS_T;
        int i13 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i12 + 1, i12);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i11 = this.SYS_T;
            if (i13 >= i11) {
                break;
            }
            this.f33470gf.gf_sqr_poly(i11, this.poly, sArr2[i13], sArr2[i13 >>> 1], iArr);
            int[] iArr2 = iArr;
            this.f33470gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i13 + 1], sArr2[i13], sArr, iArr2);
            iArr = iArr2;
            i13 += 2;
        }
        if (i13 == i11) {
            this.f33470gf.gf_sqr_poly(i11, this.poly, sArr2[i13], sArr2[i13 >>> 1], iArr);
        }
        int i14 = 0;
        while (true) {
            int i15 = this.SYS_T;
            if (i14 >= i15) {
                System.arraycopy(sArr2[i15], 0, sArr, 0, i15);
                return 0;
            }
            int i16 = i14 + 1;
            for (int i17 = i16; i17 < this.SYS_T; i17++) {
                short sGf_iszero = this.f33470gf.gf_iszero(sArr2[i14][i14]);
                for (int i18 = i14; i18 < this.SYS_T + 1; i18++) {
                    short[] sArr3 = sArr2[i18];
                    sArr3[i14] = (short) (sArr3[i14] ^ ((short) (sArr3[i17] & sGf_iszero)));
                }
            }
            short s7 = sArr2[i14][i14];
            if (s7 == 0) {
                return -1;
            }
            short sGf_inv = this.f33470gf.gf_inv(s7);
            for (int i19 = i14; i19 < this.SYS_T + 1; i19++) {
                short[] sArr4 = sArr2[i19];
                sArr4[i14] = this.f33470gf.gf_mul(sArr4[i14], sGf_inv);
            }
            for (int i21 = 0; i21 < this.SYS_T; i21++) {
                if (i21 != i14) {
                    short s8 = sArr2[i14][i21];
                    for (int i22 = i14; i22 <= this.SYS_T; i22++) {
                        short[] sArr5 = sArr2[i22];
                        sArr5[i21] = (short) (sArr5[i21] ^ this.f33470gf.gf_mul(sArr5[i14], s8));
                    }
                }
            }
            i14 = i16;
        }
    }

    public static short get_q_short(int[] iArr, int i11) {
        int i12 = i11 / 2;
        return (short) (i11 % 2 == 0 ? iArr[i12] : (iArr[i12] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i11, int i12, int i13) {
        int i14 = 1 << i12;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += i14 * 2) {
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = i16 + i17;
                short s7 = sArr[i18];
                int i19 = i18 + i14;
                int i21 = (sArr[i19] ^ s7) & (-((bArr[(i15 >> 3) + i11] >> (i15 & 7)) & 1));
                sArr[i18] = (short) (s7 ^ i21);
                sArr[i19] = (short) (sArr[i19] ^ i21);
                i15++;
            }
        }
    }

    private static int min(short s7, int i11) {
        return s7 < i11 ? s7 : i11;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        int i11 = 64;
        long[] jArr2 = new long[64];
        int i12 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i13 = this.PK_NROWS - 32;
        int i14 = i13 / 8;
        int i15 = i13 % 8;
        char c3 = 0;
        if (this.usePadding) {
            for (int i16 = 0; i16 < 32; i16++) {
                for (int i17 = 0; i17 < 9; i17++) {
                    bArr2[i17] = bArr[i13 + i16][i14 + i17];
                }
                int i18 = 0;
                while (i18 < 8) {
                    int i19 = i18 + 1;
                    bArr2[i18] = (byte) (((bArr2[i18] & 255) >> i15) | (bArr2[i19] << (8 - i15)));
                    i18 = i19;
                }
                jArr2[i16] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i21 = 0; i21 < 32; i21++) {
                jArr2[i21] = Utils.load8(bArr[i13 + i21], i14);
            }
        }
        long j9 = 0;
        jArr[0] = 0;
        int i22 = 0;
        while (true) {
            long j11 = 1;
            if (i22 >= 32) {
                int i23 = 0;
                while (i23 < i12) {
                    int i24 = i23 + 1;
                    int i25 = i24;
                    while (i25 < i11) {
                        int i26 = i13 + i23;
                        int i27 = i13 + i25;
                        long jSame_mask64 = ((long) (sArr[i26] ^ sArr[i27])) & same_mask64((short) i25, (short) r19[i23]);
                        sArr[i26] = (short) (((long) sArr[i26]) ^ jSame_mask64);
                        sArr[i27] = (short) (jSame_mask64 ^ ((long) sArr[i27]));
                        i25++;
                        i24 = i24;
                        jArr3 = jArr3;
                        i11 = 64;
                        i12 = 32;
                    }
                    i23 = i24;
                }
                long[] jArr4 = jArr3;
                for (int i28 = 0; i28 < this.PK_NROWS; i28++) {
                    if (this.usePadding) {
                        for (int i29 = 0; i29 < 9; i29++) {
                            bArr2[i29] = bArr[i28][i14 + i29];
                        }
                        int i31 = 0;
                        while (i31 < 8) {
                            int i32 = i31 + 1;
                            bArr2[i31] = (byte) (((bArr2[i31] & 255) >> i15) | (bArr2[i32] << (8 - i15)));
                            i31 = i32;
                        }
                        jLoad8 = Utils.load8(bArr2, 0);
                    } else {
                        jLoad8 = Utils.load8(bArr[i28], i14);
                    }
                    for (int i33 = 0; i33 < 32; i33++) {
                        long j12 = jArr4[i33];
                        long j13 = ((jLoad8 >> i33) ^ (jLoad8 >> ((int) j12))) & 1;
                        jLoad8 = (jLoad8 ^ (j13 << ((int) j12))) ^ (j13 << i33);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, jLoad8);
                        byte[] bArr3 = bArr[i28];
                        int i34 = i14 + 8;
                        int i35 = 8 - i15;
                        bArr3[i34] = (byte) ((((bArr3[i34] & 255) >>> i15) << i15) | ((bArr2[7] & 255) >>> i35));
                        bArr3[i14] = (byte) (((bArr2[0] & 255) << i15) | (((bArr3[i14] & 255) << i35) >>> i35));
                        for (int i36 = 7; i36 >= 1; i36--) {
                            bArr[i28][i14 + i36] = (byte) (((bArr2[i36] & 255) << i15) | ((bArr2[i36 - 1] & 255) >>> i35));
                        }
                    } else {
                        Utils.store8(bArr[i28], i14, jLoad8);
                    }
                }
                return 0;
            }
            long j14 = jArr2[i22];
            int i37 = i22 + 1;
            long j15 = j9;
            for (int i38 = i37; i38 < 32; i38++) {
                j14 |= jArr2[i38];
            }
            if (j14 == j15) {
                return -1;
            }
            int iCtz = ctz(j14);
            char c7 = c3;
            long j16 = iCtz;
            jArr3[i22] = j16;
            jArr[c7] = jArr[c7] | (1 << ((int) j16));
            for (int i39 = i37; i39 < 32; i39++) {
                long j17 = jArr2[i22];
                jArr2[i22] = j17 ^ (jArr2[i39] & (((j17 >> iCtz) & 1) - 1));
            }
            int i41 = i37;
            while (i41 < 32) {
                long j18 = jArr2[i41];
                long j19 = j11;
                jArr2[i41] = j18 ^ (jArr2[i22] & (-((j18 >> iCtz) & j19)));
                i41++;
                j11 = j19;
                c7 = 0;
            }
            c3 = c7;
            i22 = i37;
            j9 = j15;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i11;
        int i12;
        int i13 = this.SYS_T;
        short[] sArr2 = new short[i13 + 1];
        byte b8 = 1;
        sArr2[i13] = 1;
        for (int i14 = 0; i14 < this.SYS_T; i14++) {
            sArr2[i14] = Utils.load_gf(bArr2, (i14 * 2) + 40, this.GFMASK);
        }
        int i15 = 1 << this.GFBITS;
        long[] jArr2 = new long[i15];
        for (int i16 = 0; i16 < (1 << this.GFBITS); i16++) {
            long j9 = iArr[i16];
            jArr2[i16] = j9;
            long j11 = j9 << 31;
            jArr2[i16] = j11;
            long j12 = j11 | ((long) i16);
            jArr2[i16] = j12;
            jArr2[i16] = j12 & LongCompanionObject.MAX_VALUE;
        }
        sort64(jArr2, 0, i15);
        for (int i17 = 1; i17 < (1 << this.GFBITS); i17++) {
            if ((jArr2[i17 - 1] >> 31) == (jArr2[i17] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i18 = 0; i18 < (1 << this.GFBITS); i18++) {
            sArr[i18] = (short) (jArr2[i18] & ((long) this.GFMASK));
        }
        int i19 = 0;
        while (true) {
            i11 = this.SYS_N;
            if (i19 >= i11) {
                break;
            }
            sArr3[i19] = Utils.bitrev(sArr[i19], this.GFBITS);
            i19++;
        }
        short[] sArr4 = new short[i11];
        root(sArr4, sArr2, sArr3);
        int i21 = 0;
        while (true) {
            i12 = this.SYS_N;
            if (i21 >= i12) {
                break;
            }
            sArr4[i21] = this.f33470gf.gf_inv(sArr4[i21]);
            i21++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i12 / 8);
        for (int i22 = 0; i22 < this.PK_NROWS; i22++) {
            for (int i23 = 0; i23 < this.SYS_N / 8; i23++) {
                bArr3[i22][i23] = 0;
            }
        }
        int i24 = 0;
        while (i24 < this.SYS_T) {
            for (int i25 = 0; i25 < this.SYS_N; i25 += 8) {
                int i26 = 0;
                while (true) {
                    int i27 = this.GFBITS;
                    if (i26 < i27) {
                        bArr3[(i27 * i24) + i26][i25 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i25 + 7] >>> i26) & 1)) << 1)) | ((sArr4[i25 + 6] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 5] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 4] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 3] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 2] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 1] >>> i26) & 1))) << 1)) | ((sArr4[i25] >>> i26) & 1));
                        i26++;
                    }
                }
            }
            for (int i28 = 0; i28 < this.SYS_N; i28++) {
                sArr4[i28] = this.f33470gf.gf_mul(sArr4[i28], sArr3[i28]);
            }
            i24++;
        }
        int i29 = 0;
        while (true) {
            int i31 = this.PK_NROWS;
            if (i29 >= i31) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i32 = ((this.SYS_N - i31) + 7) / 8;
                        int i33 = 0;
                        while (true) {
                            int i34 = this.PK_NROWS;
                            if (i33 >= i34) {
                                break;
                            }
                            System.arraycopy(bArr3[i33], i34 / 8, bArr, i32 * i33, i32);
                            i33++;
                        }
                    } else {
                        int i35 = i31 % 8;
                        if (i35 != 0) {
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                int i38 = this.PK_NROWS;
                                if (i36 >= i38) {
                                    break;
                                }
                                int i39 = (i38 - 1) / 8;
                                while (i39 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i36];
                                    int i41 = (bArr4[i39] & 255) >>> i35;
                                    i39++;
                                    bArr[i37] = (byte) ((bArr4[i39] << (8 - i35)) | i41);
                                    i37++;
                                }
                                bArr[i37] = (byte) ((bArr3[i36][i39] & 255) >>> i35);
                                i36++;
                                i37++;
                            }
                        } else {
                            System.arraycopy(bArr3[i24], (i31 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i24 = i29 >>> 3;
            int i42 = i29 & 7;
            if (this.usePivots && i29 == i31 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i43 = i29 + 1;
            for (int i44 = i43; i44 < this.PK_NROWS; i44++) {
                byte b11 = (byte) (-((byte) (((byte) (((byte) (bArr3[i29][i24] ^ bArr3[i44][i24])) >> i42)) & b8)));
                int i45 = 0;
                while (i45 < this.SYS_N / 8) {
                    byte[] bArr5 = bArr3[i29];
                    bArr5[i45] = (byte) (bArr5[i45] ^ (bArr3[i44][i45] & b11));
                    i45++;
                    b8 = b8;
                }
            }
            byte b12 = b8;
            if (((bArr3[i29][i24] >> i42) & 1) == 0) {
                return -1;
            }
            for (int i46 = 0; i46 < this.PK_NROWS; i46++) {
                if (i46 != i29) {
                    byte b13 = (byte) (-((byte) (((byte) (bArr3[i46][i24] >> i42)) & 1)));
                    for (int i47 = 0; i47 < this.SYS_N / 8; i47++) {
                        byte[] bArr6 = bArr3[i46];
                        bArr6[i47] = (byte) (bArr6[i47] ^ (bArr3[i29][i47] & b13));
                    }
                }
            }
            i29 = i43;
            b8 = b12;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < this.SYS_N; i11++) {
            sArr[i11] = eval(sArr2, sArr3[i11]);
        }
    }

    private static byte same_mask32(short s7, short s8) {
        return (byte) ((-(((s7 ^ s8) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s7, short s8) {
        return -((((long) (s7 ^ s8)) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        int i14 = 1;
        while (i14 < i13 - i14) {
            i14 += i14;
        }
        for (int i15 = i14; i15 > 0; i15 >>>= 1) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13 - i15; i17++) {
                if ((i17 & i15) == 0) {
                    int i18 = i11 + i17;
                    int i19 = i18 + i15;
                    int i21 = iArr[i19];
                    int i22 = iArr[i18];
                    int i23 = i21 ^ i22;
                    int i24 = i21 - i22;
                    int i25 = ((((i21 ^ i24) & i23) ^ i24) >> 31) & i23;
                    iArr[i18] = i22 ^ i25;
                    iArr[i19] = iArr[i19] ^ i25;
                }
            }
            for (int i26 = i14; i26 > i15; i26 >>>= 1) {
                while (i16 < i13 - i26) {
                    if ((i16 & i15) == 0) {
                        int i27 = i11 + i16;
                        int i28 = i27 + i15;
                        int i29 = iArr[i28];
                        for (int i31 = i26; i31 > i15; i31 >>>= 1) {
                            int i32 = i27 + i31;
                            int i33 = iArr[i32];
                            int i34 = i33 ^ i29;
                            int i35 = i33 - i29;
                            int i36 = i34 & ((i35 ^ ((i35 ^ i33) & i34)) >> 31);
                            i29 ^= i36;
                            iArr[i32] = i33 ^ i36;
                        }
                        iArr[i28] = i29;
                    }
                    i16++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        int i14 = 1;
        while (i14 < i13 - i14) {
            i14 += i14;
        }
        for (int i15 = i14; i15 > 0; i15 >>>= 1) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13 - i15; i17++) {
                if ((i17 & i15) == 0) {
                    int i18 = i11 + i17;
                    int i19 = i18 + i15;
                    long j9 = jArr[i19];
                    long j11 = jArr[i18];
                    long j12 = (j9 ^ j11) & (-((j9 - j11) >>> 63));
                    jArr[i18] = j11 ^ j12;
                    jArr[i19] = jArr[i19] ^ j12;
                }
            }
            for (int i21 = i14; i21 > i15; i21 >>>= 1) {
                while (i16 < i13 - i21) {
                    if ((i16 & i15) == 0) {
                        int i22 = i11 + i16;
                        int i23 = i22 + i15;
                        long j13 = jArr[i23];
                        for (int i24 = i21; i24 > i15; i24 >>>= 1) {
                            int i25 = i22 + i24;
                            long j14 = jArr[i25];
                            long j15 = (-((j14 - j13) >>> 63)) & (j13 ^ j14);
                            j13 ^= j15;
                            jArr[i25] = j14 ^ j15;
                        }
                        jArr[i23] = j13;
                    }
                    i16++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s7 = (short) (bArr[0] & 1);
        short s8 = sArr3[0];
        short sEval = eval(sArr2, s8);
        GF gf2 = this.f33470gf;
        short sGf_inv = (short) ((-s7) & gf2.gf_inv(gf2.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i11 = 1; i11 < this.SYS_T * 2; i11++) {
            sGf_inv = this.f33470gf.gf_mul(sGf_inv, s8);
            sArr[i11] = sGf_inv;
        }
        for (int i12 = 1; i12 < this.SYS_N; i12++) {
            short s11 = (short) ((bArr[i12 / 8] >> (i12 % 8)) & 1);
            short s12 = sArr3[i12];
            short sEval2 = eval(sArr2, s12);
            GF gf3 = this.f33470gf;
            short sGf_mul = this.f33470gf.gf_mul(gf3.gf_inv(gf3.gf_sq(sEval2)), s11);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i13 = 1; i13 < this.SYS_T * 2; i13++) {
                sGf_mul = this.f33470gf.gf_mul(sGf_mul, s12);
                sArr[i13] = (short) (sArr[i13] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i11 = this.PK_NROWS % 8;
        for (int i12 = 0; i12 < this.SYND_BYTES; i12++) {
            bArr[i12] = 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.PK_NROWS; i14++) {
            for (int i15 = 0; i15 < this.SYS_N / 8; i15++) {
                sArr[i15] = 0;
            }
            int i16 = 0;
            while (true) {
                int i17 = this.PK_ROW_BYTES;
                if (i16 >= i17) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i17) + i16] = bArr2[i13 + i16];
                i16++;
            }
            if (this.usePadding) {
                for (int i18 = (this.SYS_N / 8) - 1; i18 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i18--) {
                    sArr[i18] = (short) ((((sArr[i18] & 255) << i11) | ((sArr[i18 - 1] & 255) >>> (8 - i11))) & 255);
                }
            }
            int i19 = i14 / 8;
            int i21 = i14 % 8;
            sArr[i19] = (short) (sArr[i19] | (1 << i21));
            byte b8 = 0;
            for (int i22 = 0; i22 < this.SYS_N / 8; i22++) {
                b8 = (byte) (b8 ^ (sArr[i22] & bArr3[i22]));
            }
            byte b11 = (byte) ((b8 >>> 4) ^ b8);
            byte b12 = (byte) (b11 ^ (b11 >>> 2));
            bArr[i19] = (byte) ((((byte) (1 & ((byte) (b12 ^ (b12 >>> 1))))) << i21) | bArr[i19]);
            i13 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b8 = 0;
        for (int i11 = 0; i11 < this.PK_NROWS; i11++) {
            int i12 = this.PK_ROW_BYTES;
            b8 = (byte) (b8 | bArr[((i11 * i12) + i12) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b8 & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i11;
        short[] sArr;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i12 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i13 = i12 + 32;
        byte[] bArr3 = new byte[i13];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i13);
        if (bArr.length <= 40) {
            short[] sArr2 = new short[this.SYS_T];
            int i14 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i14];
            int i15 = i12 - i14;
            for (int i16 = 0; i16 < this.SYS_T; i16++) {
                sArr2[i16] = Utils.load_gf(bArr3, (i16 * 2) + i15, this.GFMASK);
            }
            generate_irr_poly(sArr2);
            for (int i17 = 0; i17 < this.SYS_T; i17++) {
                Utils.store_gf(bArr4, i17 * 2, sArr2[i17]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i18 = this.IRR_BYTES;
        if (length <= i18 + 40) {
            int i19 = this.GFBITS;
            int[] iArr = new int[1 << i19];
            short[] sArr3 = new short[1 << i19];
            int i21 = (i12 - i18) - ((1 << i19) * 4);
            int i22 = 0;
            while (true) {
                i11 = this.GFBITS;
                if (i22 >= (1 << i11)) {
                    break;
                }
                iArr[i22] = Utils.load4(bArr3, (i22 * 4) + i21);
                i22++;
            }
            if (this.usePivots) {
                sArr = sArr3;
                pk_gen(null, bArr2, iArr, sArr, new long[]{0});
            } else {
                sArr = sArr3;
                int i23 = 1 << i11;
                long[] jArr = new long[i23];
                for (int i24 = 0; i24 < (1 << this.GFBITS); i24++) {
                    long j9 = iArr[i24];
                    jArr[i24] = j9;
                    long j11 = j9 << 31;
                    jArr[i24] = j11;
                    long j12 = j11 | ((long) i24);
                    jArr[i24] = j12;
                    jArr[i24] = j12 & LongCompanionObject.MAX_VALUE;
                }
                sort64(jArr, 0, i23);
                for (int i25 = 0; i25 < (1 << this.GFBITS); i25++) {
                    sArr[i25] = (short) (jArr[i25] & ((long) this.GFMASK));
                }
            }
            int i26 = this.COND_BYTES;
            byte[] bArr5 = new byte[i26];
            controlbitsfrompermutation(bArr5, sArr, this.GFBITS, 1 << r3);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i26);
        }
        int privateKeySize = getPrivateKeySize();
        int i27 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i27 / 8), i27 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i11 = this.GFBITS;
        short[] sArr = new short[1 << i11];
        long[] jArr = {0};
        int[] iArr = new int[1 << i11];
        int i12 = ((1 << i11) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i12];
        int i13 = ((i12 - 32) - this.IRR_BYTES) - ((1 << i11) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i12);
        for (int i14 = 0; i14 < (1 << this.GFBITS); i14++) {
            iArr[i14] = Utils.load4(bArr3, (i14 * 4) + i13);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        boolean z11 = this.usePadding;
        int i11 = this.PK_NROWS;
        return z11 ? ((this.SYS_N / 8) - ((i11 - 1) / 8)) * i11 : (i11 * this.PK_NCOLS) / 8;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.SYS_N;
        byte[] bArr4 = new byte[i11 / 8];
        int i12 = (i11 / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i12];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i13 = 0;
        while (i13 < this.SYS_N / 8) {
            int i14 = i13 + 1;
            bArr5[i14] = (byte) ((bArr4[i13] & sDecrypt) | ((~sDecrypt) & bArr3[i13 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i13 = i14;
        }
        for (int i15 = 0; i15 < this.SYND_BYTES; i15++) {
            bArr5[(this.SYS_N / 8) + 1 + i15] = bArr2[i15];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i12);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b8 = (byte) iCheck_c_padding;
        for (int i16 = 0; i16 < bArr.length; i16++) {
            bArr[i16] = (byte) (bArr[i16] | b8);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i11 = this.SYS_N / 8;
        byte[] bArr4 = new byte[i11];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i11);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b8 = (byte) (((byte) iCheck_pk_padding) ^ 255);
        for (int i12 = 0; i12 < this.SYND_BYTES; i12++) {
            bArr[i12] = (byte) (bArr[i12] & b8);
        }
        for (int i13 = 0; i13 < 32; i13++) {
            bArr2[i13] = (byte) (bArr2[i13] & b8);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i11;
        int i12;
        int i13;
        short[] sArr;
        int i14;
        long j9;
        int i15 = 32;
        byte[] bArr3 = new byte[32];
        int i16 = 1;
        int i17 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i18 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i19 = i18 + 32;
        byte[] bArr5 = new byte[i19];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i17, i16);
            sHAKEDigest.update(bArr3, i17, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i17, i19);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i18, i18 + 32);
            System.arraycopy(bArr6, i17, bArr2, i17, i15);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i17, i15);
            int i21 = this.SYS_T;
            short[] sArr2 = new short[i21];
            int i22 = i18 - (i21 * 2);
            i11 = i16;
            for (int i23 = i17; i23 < this.SYS_T; i23++) {
                sArr2[i23] = Utils.load_gf(bArr5, (i23 * 2) + i22, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i24 = i17; i24 < this.SYS_T; i24++) {
                    Utils.store_gf(bArr2, (i24 * 2) + 40, sArr2[i24]);
                }
                int i25 = this.GFBITS;
                int[] iArr = new int[i11 << i25];
                i12 = i22 - ((i11 << i25) * 4);
                int i26 = 0;
                while (true) {
                    i13 = this.GFBITS;
                    if (i26 >= (i11 << i13)) {
                        break;
                    }
                    iArr[i26] = Utils.load4(bArr5, (i26 * 4) + i12);
                    i26++;
                }
                sArr = new short[i11 << i13];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            i16 = i11;
            i15 = 32;
            i17 = 0;
        }
        int i27 = this.COND_BYTES;
        byte[] bArr7 = new byte[i27];
        controlbitsfrompermutation(bArr7, sArr, this.GFBITS, i11 << r6);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i27);
        int i28 = this.SYS_N;
        System.arraycopy(bArr5, i12 - (i28 / 8), bArr2, bArr2.length - (i28 / 8), i28 / 8);
        if (this.usePivots) {
            i14 = 32;
            j9 = jArr[0];
        } else {
            j9 = 4294967295L;
            i14 = 32;
        }
        Utils.store8(bArr2, i14, j9);
    }
}
