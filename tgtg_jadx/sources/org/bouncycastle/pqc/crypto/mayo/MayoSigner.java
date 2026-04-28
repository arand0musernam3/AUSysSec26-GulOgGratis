package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class MayoSigner implements MessageSigner {
    private static final long EVEN_2BYTES = 281470681808895L;
    private static final long EVEN_BYTES = 71777214294589695L;
    private static final int F_TAIL_LEN = 4;
    private MayoParameters params;
    private MayoPrivateKeyParameters privKey;
    private MayoPublicKeyParameters pubKey;
    private SecureRandom random;

    private static long ctCompare64(int i11, int i12) {
        return (-(i11 ^ i12)) >> 63;
    }

    private static void mVecMultiplyBins(int i11, int i12, long[] jArr, long[] jArr2) {
        int i13 = i11 + i11;
        int i14 = i13 + i11;
        int i15 = i14 + i11;
        int i16 = i15 + i11;
        int i17 = i16 + i11;
        int i18 = i17 + i11;
        int i19 = i18 + i11;
        int i21 = i19 + i11;
        int i22 = i21 + i11;
        int i23 = i22 + i11;
        int i24 = i23 + i11;
        int i25 = i24 + i11;
        int i26 = i25 + i11;
        int i27 = i26 + i11;
        int i28 = 0;
        int i29 = 0;
        while (i28 < i12) {
            int i31 = i28;
            int i32 = i29;
            int i33 = 0;
            while (i33 < i11) {
                long j9 = jArr[i32 + i16];
                long j11 = j9 & 1229782938247303441L;
                long j12 = (jArr[i32 + i22] ^ ((j9 & (-1229782938247303442L)) >>> 1)) ^ ((j11 << 3) + j11);
                long j13 = jArr[i32 + i23];
                long j14 = (j13 & (-8608480567731124088L)) >>> 3;
                long j15 = (jArr[i32 + i24] ^ ((j13 & 8608480567731124087L) << 1)) ^ ((j14 << 1) + j14);
                long j16 = j12 & 1229782938247303441L;
                long j17 = (jArr[i32 + i18] ^ ((j12 & (-1229782938247303442L)) >>> 1)) ^ ((j16 << 3) + j16);
                long j18 = (j15 & (-8608480567731124088L)) >>> 3;
                long j19 = (jArr[i32 + i17] ^ ((j15 & 8608480567731124087L) << 1)) ^ ((j18 << 1) + j18);
                long j21 = j17 & 1229782938247303441L;
                long j22 = (jArr[i32 + i26] ^ ((j17 & (-1229782938247303442L)) >>> 1)) ^ ((j21 << 3) + j21);
                long j23 = (j19 & (-8608480567731124088L)) >>> 3;
                long j24 = (jArr[i32 + i14] ^ ((j19 & 8608480567731124087L) << 1)) ^ ((j23 << 1) + j23);
                long j25 = j22 & 1229782938247303441L;
                long j26 = (jArr[i32 + i27] ^ ((j22 & (-1229782938247303442L)) >>> 1)) ^ ((j25 << 3) + j25);
                long j27 = (j24 & (-8608480567731124088L)) >>> 3;
                long j28 = (jArr[i32 + i19] ^ ((j24 & 8608480567731124087L) << 1)) ^ ((j27 << 1) + j27);
                long j29 = j26 & 1229782938247303441L;
                long j31 = (jArr[i32 + i25] ^ ((j26 & (-1229782938247303442L)) >>> 1)) ^ ((j29 << 3) + j29);
                long j32 = (j28 & (-8608480567731124088L)) >>> 3;
                long j33 = (jArr[i32 + i15] ^ ((j28 & 8608480567731124087L) << 1)) ^ ((j32 << 1) + j32);
                long j34 = j31 & 1229782938247303441L;
                long j35 = (jArr[i32 + i21] ^ ((j31 & (-1229782938247303442L)) >>> 1)) ^ ((j34 << 3) + j34);
                long j36 = (j33 & (-8608480567731124088L)) >>> 3;
                long j37 = (jArr[i32 + i13] ^ ((j33 & 8608480567731124087L) << 1)) ^ ((j36 << 1) + j36);
                long j38 = j35 & 1229782938247303441L;
                long j39 = (jArr[i32 + i11] ^ ((j35 & (-1229782938247303442L)) >>> 1)) ^ ((j38 << 3) + j38);
                long j41 = (j37 & (-8608480567731124088L)) >>> 3;
                jArr2[(i29 >> 4) + i33] = (j39 ^ ((j37 & 8608480567731124087L) << 1)) ^ ((j41 << 1) + j41);
                i33++;
                i32++;
            }
            i28 = i31 + 1;
            i29 += i11 << 4;
        }
    }

    private static void mayoGenericMCalculatePS(MayoParameters mayoParameters, long[] jArr, int i11, int i12, byte[] bArr, int i13, int i14, int i15, long[] jArr2) {
        int i16 = i13;
        int i17 = i14;
        int i18 = i17 + i16;
        int mVecLimbs = mayoParameters.getMVecLimbs();
        long[] jArr3 = new long[((mayoParameters.getN() * (mayoParameters.getK() * mVecLimbs)) * mVecLimbs) << 4];
        int i19 = i17 * mVecLimbs;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 < i16) {
            for (int i25 = i21; i25 < i16; i25++) {
                int i26 = 0;
                int i27 = 0;
                while (i26 < i15) {
                    Longs.xorTo(mVecLimbs, jArr, i23, jArr3, (((i24 + i26) << 4) + (bArr[i27 + i25] & 255)) * mVecLimbs);
                    i26++;
                    i27 += i18;
                }
                i23 += mVecLimbs;
            }
            int i28 = i22;
            int i29 = 0;
            while (i29 < i17) {
                int i31 = 0;
                int i32 = 0;
                while (i31 < i15) {
                    Longs.xorTo(mVecLimbs, jArr, i11 + i28, jArr3, (((i24 + i31) << 4) + (bArr[i32 + i29 + i13] & 255)) * mVecLimbs);
                    i31++;
                    i32 += i18;
                }
                i29++;
                i28 += mVecLimbs;
                i17 = i14;
            }
            i21++;
            i24 += i15;
            i22 += i19;
            i16 = i13;
            i17 = i14;
        }
        int i33 = i13 * i15;
        int i34 = 0;
        int i35 = i13;
        while (i35 < i18) {
            for (int i36 = i35; i36 < i18; i36++) {
                int i37 = 0;
                int i38 = 0;
                while (i37 < i15) {
                    Longs.xorTo(mVecLimbs, jArr, i12 + i34, jArr3, (((i33 + i37) << 4) + (bArr[i38 + i36] & 255)) * mVecLimbs);
                    i37++;
                    i38 += i18;
                }
                i34 += mVecLimbs;
            }
            i35++;
            i33 += i15;
        }
        mVecMultiplyBins(mVecLimbs, i18 * i15, jArr3, jArr2);
    }

    private static void mayoGenericMCalculateSPS(long[] jArr, byte[] bArr, int i11, int i12, int i13, long[] jArr2) {
        int i14 = i12;
        int i15 = i14 * i14;
        long[] jArr3 = new long[(i11 * i15) << 4];
        int i16 = i14 * i11;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i14) {
            int i21 = 0;
            int i22 = 0;
            while (i21 < i13) {
                int i23 = ((bArr[i18 + i21] & 255) * i11) + i19;
                int i24 = 0;
                int i25 = 0;
                while (i24 < i14) {
                    Longs.xorTo(i11, jArr, i22 + i25, jArr3, i23 + (i25 << 4));
                    i24++;
                    i25 += i11;
                    i14 = i12;
                }
                i21++;
                i22 += i16;
                i14 = i12;
            }
            i17++;
            i18 += i13;
            i19 += i16 << 4;
            i14 = i12;
        }
        mVecMultiplyBins(i11, i15, jArr3, jArr2);
    }

    private static int mulTable(int i11) {
        int i12 = i11 * 134480385;
        int i13 = (-252645136) & i12;
        return (i12 ^ (i13 >>> 4)) ^ (i13 >>> 3);
    }

    private static void transpose16x16Nibbles(long[] jArr, int i11) {
        for (int i12 = 0; i12 < 16; i12 += 2) {
            int i13 = i11 + i12;
            int i14 = i13 + 1;
            long j9 = jArr[i13];
            long j11 = ((j9 >>> 4) ^ jArr[i14]) & 1085102592571150095L;
            jArr[i13] = j9 ^ (j11 << 4);
            jArr[i14] = jArr[i14] ^ j11;
        }
        int i15 = i11;
        for (int i16 = 0; i16 < 16; i16 += 4) {
            long j12 = jArr[i15];
            long j13 = ((j12 >>> 8) ^ jArr[i15 + 2]) & EVEN_BYTES;
            int i17 = i15 + 1;
            long j14 = EVEN_BYTES & ((jArr[i17] >>> 8) ^ jArr[i15 + 3]);
            jArr[i15] = j12 ^ (j13 << 8);
            int i18 = i15 + 2;
            jArr[i17] = jArr[i17] ^ (j14 << 8);
            int i19 = i15 + 3;
            jArr[i18] = jArr[i18] ^ j13;
            i15 += 4;
            jArr[i19] = jArr[i19] ^ j14;
        }
        for (int i21 = 0; i21 < 4; i21++) {
            int i22 = i11 + i21;
            long j15 = jArr[i22];
            int i23 = i22 + 4;
            long j16 = ((j15 >>> 16) ^ jArr[i23]) & EVEN_2BYTES;
            int i24 = i22 + 8;
            int i25 = i22 + 12;
            long j17 = EVEN_2BYTES & ((jArr[i24] >>> 16) ^ jArr[i25]);
            jArr[i22] = j15 ^ (j16 << 16);
            jArr[i24] = jArr[i24] ^ (j17 << 16);
            jArr[i23] = jArr[i23] ^ j16;
            jArr[i25] = jArr[i25] ^ j17;
        }
        for (int i26 = 0; i26 < 8; i26++) {
            int i27 = i11 + i26;
            long j18 = jArr[i27];
            int i28 = i27 + 8;
            long j19 = ((j18 >>> 32) ^ jArr[i28]) & 4294967295L;
            jArr[i27] = j18 ^ (j19 << 32);
            jArr[i28] = jArr[i28] ^ j19;
        }
    }

    private static void vecMulAddU64(int i11, long[] jArr, byte b8, long[] jArr2, int i12) {
        int iMulTable = mulTable(b8 & 255);
        for (int i13 = 0; i13 < i11; i13++) {
            long j9 = jArr[i13];
            int i14 = i12 + i13;
            jArr2[i14] = ((((j9 >>> 3) & 1229782938247303441L) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j9 & 1229782938247303441L) * ((long) (iMulTable & 255))) ^ (((j9 >>> 1) & 1229782938247303441L) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j9 >>> 2) & 1229782938247303441L) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i14];
        }
    }

    public void computeA(long[] jArr, byte[] bArr) {
        char c3;
        int i11;
        char c7;
        int i12;
        int i13;
        int k11 = this.params.getK();
        int o11 = this.params.getO();
        int m11 = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int aCols = this.params.getACols();
        int[] fTail = this.params.getFTail();
        int i14 = o11 * k11;
        int i15 = o11 * mVecLimbs;
        int i16 = 4;
        int i17 = ((i14 + 15) >> 4) << 4;
        long[] jArr2 = new long[(((m11 + 7) >>> 3) * i17) << 4];
        int i18 = m11 & 15;
        if (i18 != 0) {
            long j9 = (1 << (i18 << 2)) - 1;
            int i19 = mVecLimbs - 1;
            c3 = 3;
            int i21 = 0;
            while (i21 < i14) {
                jArr[i19] = jArr[i19] & j9;
                i21++;
                i19 += mVecLimbs;
            }
        } else {
            c3 = 3;
        }
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i22 < k11) {
            int i27 = k11 - 1;
            int i28 = i27 * i15;
            int i29 = i16;
            int i31 = i27 * o11;
            int i32 = i26;
            int i33 = i27;
            while (i33 >= i22) {
                int i34 = 0;
                int i35 = 0;
                while (true) {
                    i12 = k11;
                    i13 = aCols;
                    if (i34 >= o11) {
                        break;
                    }
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < mVecLimbs) {
                        long j11 = jArr[i28 + i36 + i35];
                        int iC = a.C(i23, i34, i32, i37);
                        jArr2[iC] = jArr2[iC] ^ (j11 << i25);
                        if (i25 > 0) {
                            int i38 = iC + i17;
                            jArr2[i38] = jArr2[i38] ^ (j11 >>> (64 - i25));
                        }
                        i36++;
                        i37 += i17;
                    }
                    i34++;
                    i35 += mVecLimbs;
                    k11 = i12;
                    aCols = i13;
                }
                if (i22 != i33) {
                    int i39 = 0;
                    int i41 = 0;
                    while (i39 < o11) {
                        int i42 = i41;
                        int i43 = 0;
                        int i44 = 0;
                        while (i44 < mVecLimbs) {
                            long j12 = jArr[i24 + i44 + i42];
                            int iC2 = a.C(i31, i39, i32, i43);
                            jArr2[iC2] = jArr2[iC2] ^ (j12 << i25);
                            if (i25 > 0) {
                                int i45 = iC2 + i17;
                                jArr2[i45] = jArr2[i45] ^ (j12 >>> (64 - i25));
                            }
                            i44++;
                            i43 += i17;
                        }
                        i39++;
                        i41 = i42 + mVecLimbs;
                    }
                }
                int i46 = i25 + 4;
                if (i46 == 64) {
                    i32 += i17;
                    i25 = 0;
                } else {
                    i25 = i46;
                }
                i33--;
                i28 -= i15;
                i31 -= o11;
                k11 = i12;
                aCols = i13;
            }
            i22++;
            i23 += o11;
            i24 += i15;
            i26 = i32;
            i16 = i29;
        }
        int i47 = k11;
        int i48 = aCols;
        int i49 = i16;
        int i51 = 0;
        while (true) {
            i11 = (i47 + 1) * i47;
            if (i51 >= ((((i11 >> 1) + m11) + 15) >>> 4) * i17) {
                break;
            }
            transpose16x16Nibbles(jArr2, i51);
            i51 += 16;
        }
        byte[] bArr2 = new byte[16];
        int i52 = 0;
        int i53 = 0;
        while (true) {
            c7 = 1;
            if (i52 >= i49) {
                break;
            }
            int i54 = fTail[i52];
            bArr2[i53] = (byte) GF16.mul(i54, 1);
            bArr2[i53 + 1] = (byte) GF16.mul(i54, 2);
            int i55 = i53 + 3;
            bArr2[i53 + 2] = (byte) GF16.mul(i54, 4);
            i53 += 4;
            bArr2[i55] = (byte) GF16.mul(i54, 8);
            i52++;
            i49 = 4;
        }
        int i56 = 0;
        while (i56 < i17) {
            int i57 = m11;
            while (i57 < (i11 >>> 1) + m11) {
                long j13 = jArr2[((i57 >>> 4) * i17) + i56 + (i57 & 15)];
                long j14 = j13 & 1229782938247303441L;
                long j15 = (j13 >>> c7) & 1229782938247303441L;
                long j16 = (j13 >>> 2) & 1229782938247303441L;
                long j17 = (j13 >>> c3) & 1229782938247303441L;
                int i58 = 0;
                int i59 = 0;
                while (i58 < 4) {
                    int i61 = (i57 + i58) - m11;
                    int i62 = ((i61 >> 4) * i17) + i56 + (i61 & 15);
                    long j18 = j17;
                    jArr2[i62] = jArr2[i62] ^ ((((((long) bArr2[i59 + 1]) * j15) ^ (((long) bArr2[i59]) * j14)) ^ (((long) bArr2[i59 + 2]) * j16)) ^ (j18 * ((long) bArr2[i59 + 3])));
                    i58++;
                    i59 += 4;
                    i11 = i11;
                    j17 = j18;
                }
                i57++;
                c7 = 1;
            }
            i56 += 16;
            c7 = 1;
        }
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr2);
        for (int i63 = 0; i63 < m11; i63 += 16) {
            int i64 = 0;
            while (true) {
                int i65 = i48 - 1;
                if (i64 < i65) {
                    int i66 = 0;
                    while (true) {
                        int i67 = i66 + i63;
                        if (i67 < m11) {
                            GF16.decode(bArrLongToLittleEndian, ((((i63 * i17) >> 4) + i64) + i66) << 3, bArr, (i67 * i48) + i64, Math.min(16, i65 - i64));
                            i66++;
                        }
                    }
                    i64 += 16;
                }
            }
        }
    }

    public void computeRHS(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i11;
        int[] iArr;
        int m11 = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int k11 = this.params.getK();
        int[] fTail = this.params.getFTail();
        int i12 = ((m11 - 1) & 15) << 2;
        int i13 = m11 & 15;
        int i14 = 0;
        if (i13 != 0) {
            long j9 = (1 << (i13 << 2)) - 1;
            int i15 = k11 * k11;
            int i16 = mVecLimbs - 1;
            int i17 = 0;
            while (i17 < i15) {
                jArr[i16] = jArr[i16] & j9;
                i17++;
                i16 += mVecLimbs;
            }
        }
        long[] jArr2 = new long[mVecLimbs];
        byte[] bArr3 = new byte[mVecLimbs << 3];
        int i18 = k11 * mVecLimbs;
        int i19 = k11 - 1;
        int i21 = i19 * mVecLimbs;
        int i22 = i21 * k11;
        while (i19 >= 0) {
            int i23 = i19;
            int i24 = i21;
            int i25 = i22;
            while (i23 < k11) {
                int i26 = mVecLimbs - 1;
                long j11 = jArr2[i26];
                int i27 = i23;
                int i28 = (int) ((j11 >>> i12) & 15);
                jArr2[i26] = j11 << 4;
                for (int i29 = mVecLimbs - 2; i29 >= 0; i29--) {
                    int i31 = i29 + 1;
                    jArr2[i31] = jArr2[i31] ^ (jArr2[i29] >>> 60);
                    jArr2[i29] = jArr2[i29] << 4;
                }
                Pack.longToLittleEndian(jArr2, bArr3, i14);
                int i32 = i14;
                for (int i33 = 4; i32 < i33; i33 = 4) {
                    int i34 = fTail[i32];
                    if (i34 == 0) {
                        i11 = k11;
                        iArr = fTail;
                    } else {
                        i11 = k11;
                        iArr = fTail;
                        long jMul = GF16.mul(i28, i34);
                        if ((i32 & 1) == 0) {
                            int i35 = i32 >> 1;
                            bArr3[i35] = (byte) (bArr3[i35] ^ ((byte) (jMul & 15)));
                        } else {
                            int i36 = i32 >> 1;
                            bArr3[i36] = (byte) (bArr3[i36] ^ ((byte) ((jMul & 15) << 4)));
                        }
                    }
                    i32++;
                    k11 = i11;
                    fTail = iArr;
                }
                int i37 = k11;
                int[] iArr2 = fTail;
                Pack.littleEndianToLong(bArr3, 0, jArr2);
                int i38 = i22 + i24;
                int i39 = i25 + i21;
                boolean z11 = i19 == i27;
                for (int i41 = 0; i41 < mVecLimbs; i41++) {
                    long j12 = jArr[i38 + i41];
                    if (!z11) {
                        j12 ^= jArr[i39 + i41];
                    }
                    jArr2[i41] = jArr2[i41] ^ j12;
                }
                i23 = i27 + 1;
                i24 += mVecLimbs;
                i25 += i18;
                k11 = i37;
                fTail = iArr2;
                i14 = 0;
            }
            i19--;
            i21 -= mVecLimbs;
            i22 -= i18;
            i14 = 0;
        }
        Pack.longToLittleEndian(jArr2, bArr3, i14);
        while (i14 < m11) {
            int i42 = i14 >> 1;
            bArr2[i14] = (byte) (bArr[i14] ^ (bArr3[i42] & 15));
            int i43 = i14 + 1;
            bArr2[i43] = (byte) (((bArr3[i42] >>> 4) & 15) ^ bArr[i43]);
            i14 += 2;
        }
    }

    public void ef(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15 = (i12 + 15) >> 4;
        long[] jArr = new long[i15];
        long[] jArr2 = new long[i15];
        long[] jArr3 = new long[i11 * i15];
        int i16 = 16;
        int k11 = (this.params.getK() * this.params.getO()) + 16;
        byte[] bArr2 = new byte[k11 >> 1];
        int i17 = k11 >> 4;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (i18 < i11) {
            int i22 = 0;
            while (i22 < i15) {
                long j9 = 0;
                int i23 = 0;
                while (i23 < i16) {
                    int i24 = (i22 << 4) + i23;
                    if (i24 < i12) {
                        i13 = i23;
                        i14 = i18;
                        j9 |= (((long) bArr[i24 + i19]) & 15) << (i13 << 2);
                    } else {
                        i13 = i23;
                        i14 = i18;
                    }
                    i23 = i13 + 1;
                    i18 = i14;
                    i16 = 16;
                }
                jArr3[i22 + i21] = j9;
                i22++;
                i16 = 16;
            }
            i18++;
            i19 += i12;
            i21 += i15;
            i16 = 16;
        }
        int i25 = 0;
        int i26 = 0;
        while (i25 < i12) {
            int iMax = Math.max(0, (i25 + i11) - i12);
            int i27 = i11 - 1;
            int iMin = Math.min(i27, i25);
            Arrays.clear(jArr);
            Arrays.clear(jArr2);
            int iMin2 = Math.min(i27, iMin + 32);
            int i28 = iMax * i15;
            int i29 = i28;
            int i31 = 0;
            int i32 = i25;
            int i33 = i17;
            long j11 = -1;
            while (iMax <= iMin2) {
                long j12 = ~ctCompare64(iMax, i26);
                long j13 = (((long) i26) - ((long) iMax)) >> 63;
                for (int i34 = 0; i34 < i15; i34++) {
                    jArr[i34] = jArr[i34] ^ ((j12 | (j13 & j11)) & jArr3[i29 + i34]);
                }
                i31 = (int) ((jArr[i32 >>> 4] >>> ((i32 & 15) << 2)) & 15);
                j11 = ~((-i31) >> 63);
                iMax++;
                i29 += i15;
            }
            vecMulAddU64(i15, jArr, GF16.inv((byte) i31), jArr2);
            int i35 = i28;
            int i36 = iMax;
            while (i36 <= iMin) {
                int i37 = i35;
                int i38 = i31;
                int i39 = i36;
                long j14 = (~j11) & (~ctCompare64(i36, i26));
                long j15 = ~j14;
                int i41 = i37;
                int i42 = 0;
                while (i42 < i15) {
                    jArr3[i41] = (j15 & jArr3[i41]) | (j14 & jArr2[i42]);
                    i42++;
                    i41++;
                }
                i36 = i39 + 1;
                i35 = i37 + i15;
                i31 = i38;
            }
            int i43 = i31;
            int i44 = iMax;
            while (i44 < i11) {
                vecMulAddU64(i15, jArr2, (byte) (((int) ((jArr3[(i32 >>> 4) + i28] >>> ((i32 & 15) << 2)) & 15)) & (i44 > i26 ? -1 : 0)), jArr3, i28);
                i44++;
                i28 += i15;
            }
            if (i43 != 0) {
                i26++;
            }
            i25 = i32 + 1;
            i17 = i33;
        }
        int i45 = i17;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        while (i48 < i11) {
            Pack.longToLittleEndian(jArr3, i46, i45, bArr2, 0);
            GF16.decode(bArr2, 0, bArr, i47, i12);
            i47 += i12;
            i48++;
            i46 += i15;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        int i11;
        byte[] bArr13;
        int i12;
        byte[] bArr14;
        int i13;
        int i14;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        int i15;
        long[] jArr;
        int i16;
        long[] jArr2;
        int i17;
        int k11 = this.params.getK();
        int v3 = this.params.getV();
        int o11 = this.params.getO();
        int n11 = this.params.getN();
        int m11 = this.params.getM();
        int vBytes = this.params.getVBytes();
        int oBytes = this.params.getOBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        int p1Limbs = this.params.getP1Limbs();
        int pkSeedBytes = this.params.getPkSeedBytes();
        int digestBytes = this.params.getDigestBytes();
        int skSeedBytes = this.params.getSkSeedBytes();
        byte[] bArr18 = new byte[this.params.getMBytes()];
        byte[] bArr19 = new byte[m11];
        byte[] bArr20 = new byte[saltBytes];
        byte[] bArr21 = new byte[m11];
        int i18 = k11 * vBytes;
        int rBytes = this.params.getRBytes() + i18;
        int i19 = i18;
        int i21 = v3 * k11;
        int i22 = k11;
        byte[] bArr22 = new byte[i21];
        int i23 = i22 * o11;
        int i24 = i22 * n11;
        byte[] bArr23 = bArr22;
        int i25 = i23 + 1;
        byte[] bArr24 = new byte[rBytes];
        byte[] bArr25 = new byte[((m11 + 7) / 8) * 8 * i25];
        byte[] bArr26 = new byte[i24];
        byte[] bArr27 = new byte[i24];
        int i26 = digestBytes + saltBytes;
        int i27 = i24;
        int i28 = i26 + skSeedBytes;
        byte[] bArr28 = new byte[i25];
        int i29 = i28 + 1;
        int i31 = rBytes;
        byte[] bArr29 = new byte[i29];
        int i32 = i29;
        int sigBytes = this.params.getSigBytes();
        byte[] bArr30 = new byte[sigBytes];
        long[] jArr3 = new long[this.params.getP2Limbs() + p1Limbs];
        int i33 = v3 * o11;
        byte[] bArr31 = new byte[i33];
        byte[] bArr32 = bArr18;
        long[] jArr4 = new long[i23 * mVecLimbs];
        long[] jArr5 = new long[i22 * i22 * mVecLimbs];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        try {
            byte[] seedSk = this.privKey.getSeedSk();
            int i34 = pkSeedBytes + oBytes;
            byte[] bArr33 = new byte[i34];
            byte[] bArr34 = bArr20;
            try {
                sHAKEDigest.update(seedSk, 0, seedSk.length);
                sHAKEDigest.doFinal(bArr33, 0, i34);
                GF16.decode(bArr33, pkSeedBytes, bArr31, 0, i33);
                Utils.expandP1P2(this.params, jArr3, bArr33);
                int i35 = o11 * mVecLimbs;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                while (i36 < v3) {
                    int i41 = i37;
                    int i42 = i38;
                    int i43 = i39;
                    int i44 = i36;
                    while (i44 < v3) {
                        if (i44 == i36) {
                            i43 += mVecLimbs;
                            i16 = i35;
                            jArr2 = jArr3;
                            i17 = mVecLimbs;
                        } else {
                            i16 = i35;
                            int i45 = p1Limbs;
                            int i46 = 0;
                            while (i46 < o11) {
                                long[] jArr6 = jArr3;
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr6, i43, bArr31[i41 + i46], jArr3, i38 + i45);
                                int i47 = mVecLimbs;
                                GF16Utils.mVecMulAdd(i47, jArr6, i43, bArr31[i37 + i46], jArr6, i42 + i45);
                                i46++;
                                i45 += i47;
                                mVecLimbs = i47;
                                jArr3 = jArr6;
                            }
                            jArr2 = jArr3;
                            i17 = mVecLimbs;
                            i43 += i17;
                        }
                        i44++;
                        i41 += o11;
                        i42 += i16;
                        mVecLimbs = i17;
                        jArr3 = jArr2;
                        i35 = i16;
                    }
                    i36++;
                    i37 += o11;
                    i38 += i35;
                    jArr3 = jArr3;
                    i39 = i43;
                }
                long[] jArr7 = jArr3;
                int i48 = mVecLimbs;
                Arrays.fill(bArr33, (byte) 0);
                sHAKEDigest.update(bArr, 0, bArr.length);
                sHAKEDigest.doFinal(bArr29, 0, digestBytes);
                try {
                    this.random.nextBytes(bArr34);
                    int i49 = saltBytes;
                    System.arraycopy(bArr34, 0, bArr29, digestBytes, i49);
                    System.arraycopy(seedSk, 0, bArr29, i26, skSeedBytes);
                    int i51 = i28;
                    sHAKEDigest.update(bArr29, 0, i51);
                    sHAKEDigest.doFinal(bArr34, 0, i49);
                    System.arraycopy(bArr34, 0, bArr29, digestBytes, i49);
                    sHAKEDigest.update(bArr29, 0, i26);
                    byte[] bArr35 = bArr32;
                    try {
                        sHAKEDigest.doFinal(bArr35, 0, this.params.getMBytes());
                        try {
                            GF16.decode(bArr35, bArr19, m11);
                            long[] jArr8 = new long[i21 * i48];
                            bArr34 = bArr34;
                            try {
                                byte[] bArr36 = new byte[v3];
                                int i52 = 0;
                                while (true) {
                                    if (i52 > 255) {
                                        i11 = i49;
                                        bArr13 = bArr29;
                                        i12 = v3;
                                        bArr14 = bArr36;
                                        bArr32 = bArr35;
                                        bArr4 = bArr21;
                                        i13 = i22;
                                        bArr6 = bArr24;
                                        bArr7 = bArr25;
                                        i14 = i27;
                                        bArr15 = bArr28;
                                        bArr16 = bArr30;
                                        break;
                                    }
                                    try {
                                        bArr29[i51] = (byte) i52;
                                        int i53 = i48;
                                        int i54 = i32;
                                        int i55 = 0;
                                        sHAKEDigest.update(bArr29, 0, i54);
                                        i32 = i54;
                                        bArr32 = bArr35;
                                        bArr6 = bArr24;
                                        int i56 = i31;
                                        try {
                                            sHAKEDigest.doFinal(bArr6, 0, i56);
                                            i31 = i56;
                                            while (true) {
                                                i15 = i22;
                                                if (i55 >= i15) {
                                                    break;
                                                }
                                                i22 = i15;
                                                byte[] bArr37 = bArr29;
                                                int i57 = i51;
                                                byte[] bArr38 = bArr23;
                                                try {
                                                    GF16.decode(bArr6, i55 * vBytes, bArr38, i55 * v3, v3);
                                                    i55++;
                                                    bArr23 = bArr38;
                                                    bArr29 = bArr37;
                                                    i51 = i57;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    bArr5 = bArr38;
                                                    bArr11 = bArr19;
                                                    bArr2 = bArr37;
                                                    bArr4 = bArr21;
                                                    bArr7 = bArr25;
                                                    bArr8 = bArr26;
                                                    bArr9 = bArr27;
                                                    bArr10 = bArr28;
                                                    bArr12 = bArr32;
                                                    bArr3 = bArr34;
                                                    Arrays.fill(bArr12, (byte) 0);
                                                    Arrays.fill(bArr11, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr10, (byte) 0);
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    throw th;
                                                }
                                            }
                                            i11 = i49;
                                            bArr13 = bArr29;
                                            int i58 = i51;
                                            long[] jArr9 = jArr8;
                                            int i59 = i52;
                                            long[] jArr10 = jArr7;
                                            byte[] bArr39 = bArr23;
                                            i14 = i27;
                                            bArr16 = bArr30;
                                            long[] jArr11 = jArr4;
                                            bArr14 = bArr36;
                                            SHAKEDigest sHAKEDigest2 = sHAKEDigest;
                                            int i61 = i23;
                                            bArr15 = bArr28;
                                            try {
                                                GF16Utils.mulAddMatXMMat(i53, bArr39, jArr10, p1Limbs, jArr11, i15, v3, o11);
                                                int i62 = v3;
                                                try {
                                                    GF16Utils.mulAddMUpperTriangularMatXMatTrans(i53, jArr10, bArr39, jArr9, i62, i15);
                                                    jArr = jArr5;
                                                    GF16Utils.mulAddMatXMMat(i53, bArr39, jArr9, jArr, i15, i62);
                                                    i13 = i15;
                                                    i12 = i62;
                                                    bArr4 = bArr21;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    bArr23 = bArr39;
                                                    bArr4 = bArr21;
                                                    bArr7 = bArr25;
                                                    bArr11 = bArr19;
                                                    bArr10 = bArr15;
                                                    bArr5 = bArr23;
                                                    bArr8 = bArr26;
                                                    bArr9 = bArr27;
                                                    bArr12 = bArr32;
                                                    bArr3 = bArr34;
                                                    bArr2 = bArr13;
                                                    Arrays.fill(bArr12, (byte) 0);
                                                    Arrays.fill(bArr11, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr10, (byte) 0);
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    throw th;
                                                }
                                                try {
                                                    computeRHS(jArr, bArr19, bArr4);
                                                    bArr7 = bArr25;
                                                    try {
                                                        computeA(jArr11, bArr7);
                                                        bArr23 = bArr39;
                                                        int i63 = i19;
                                                        try {
                                                            GF16.decode(bArr6, i63, bArr15, 0, i61);
                                                            byte[] bArr40 = bArr26;
                                                            try {
                                                                if (sampleSolution(bArr7, bArr4, bArr15, bArr40)) {
                                                                    bArr26 = bArr40;
                                                                    break;
                                                                }
                                                                i19 = i63;
                                                                bArr26 = bArr40;
                                                                Arrays.fill(jArr11, 0L);
                                                                Arrays.fill(jArr, 0L);
                                                                bArr21 = bArr4;
                                                                bArr25 = bArr7;
                                                                jArr5 = jArr;
                                                                i22 = i13;
                                                                jArr4 = jArr11;
                                                                i23 = i61;
                                                                bArr28 = bArr15;
                                                                bArr24 = bArr6;
                                                                bArr36 = bArr14;
                                                                sHAKEDigest = sHAKEDigest2;
                                                                jArr7 = jArr10;
                                                                i48 = i53;
                                                                jArr8 = jArr9;
                                                                bArr35 = bArr32;
                                                                i51 = i58;
                                                                i49 = i11;
                                                                i27 = i14;
                                                                bArr30 = bArr16;
                                                                v3 = i12;
                                                                i52 = i59 + 1;
                                                                bArr29 = bArr13;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                bArr26 = bArr40;
                                                                bArr11 = bArr19;
                                                                bArr10 = bArr15;
                                                                bArr5 = bArr23;
                                                                bArr8 = bArr26;
                                                                bArr9 = bArr27;
                                                                bArr12 = bArr32;
                                                                bArr3 = bArr34;
                                                                bArr2 = bArr13;
                                                                Arrays.fill(bArr12, (byte) 0);
                                                                Arrays.fill(bArr11, (byte) 0);
                                                                Arrays.fill(bArr4, (byte) 0);
                                                                Arrays.fill(bArr3, (byte) 0);
                                                                Arrays.fill(bArr6, (byte) 0);
                                                                Arrays.fill(bArr5, (byte) 0);
                                                                Arrays.fill(bArr7, (byte) 0);
                                                                Arrays.fill(bArr8, (byte) 0);
                                                                Arrays.fill(bArr10, (byte) 0);
                                                                Arrays.fill(bArr9, (byte) 0);
                                                                Arrays.fill(bArr2, (byte) 0);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bArr23 = bArr39;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    bArr23 = bArr39;
                                                    bArr7 = bArr25;
                                                    bArr11 = bArr19;
                                                    bArr10 = bArr15;
                                                    bArr5 = bArr23;
                                                    bArr8 = bArr26;
                                                    bArr9 = bArr27;
                                                    bArr12 = bArr32;
                                                    bArr3 = bArr34;
                                                    bArr2 = bArr13;
                                                    Arrays.fill(bArr12, (byte) 0);
                                                    Arrays.fill(bArr11, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr10, (byte) 0);
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                bArr23 = bArr39;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            bArr13 = bArr29;
                                            bArr4 = bArr21;
                                            bArr7 = bArr25;
                                            bArr15 = bArr28;
                                            bArr11 = bArr19;
                                            bArr10 = bArr15;
                                            bArr5 = bArr23;
                                            bArr8 = bArr26;
                                            bArr9 = bArr27;
                                            bArr12 = bArr32;
                                            bArr3 = bArr34;
                                            bArr2 = bArr13;
                                            Arrays.fill(bArr12, (byte) 0);
                                            Arrays.fill(bArr11, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr10, (byte) 0);
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            throw th;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        bArr13 = bArr29;
                                        bArr32 = bArr35;
                                        bArr4 = bArr21;
                                        bArr6 = bArr24;
                                    }
                                }
                                byte[] bArr41 = bArr19;
                                int i64 = 0;
                                int i65 = 0;
                                int i66 = 0;
                                int i67 = 0;
                                while (i66 < i13) {
                                    int i68 = i65;
                                    bArr10 = bArr15;
                                    byte[] bArr42 = bArr31;
                                    byte[] bArr43 = bArr14;
                                    bArr11 = bArr41;
                                    int i69 = i64;
                                    int i71 = i12;
                                    int i72 = o11;
                                    byte[] bArr44 = bArr26;
                                    bArr12 = bArr32;
                                    bArr3 = bArr34;
                                    try {
                                        GF16Utils.matMul(bArr42, bArr44, i67, bArr43, i72, i71);
                                        bArr17 = bArr10;
                                        int i73 = i66;
                                        int i74 = i13;
                                        int i75 = i67;
                                        bArr5 = bArr23;
                                        bArr8 = bArr26;
                                        bArr9 = bArr27;
                                        try {
                                            Bytes.xor(i71, bArr5, i69, bArr43, bArr9, i68);
                                            System.arraycopy(bArr8, i75, bArr9, i68 + i71, i72);
                                            int i76 = i75 + i72;
                                            bArr41 = bArr11;
                                            bArr34 = bArr3;
                                            bArr32 = bArr12;
                                            bArr26 = bArr8;
                                            i12 = i71;
                                            bArr23 = bArr5;
                                            bArr27 = bArr9;
                                            i64 = i69 + i71;
                                            i13 = i74;
                                            bArr15 = bArr17;
                                            o11 = i72;
                                            i66 = i73 + 1;
                                            bArr14 = bArr43;
                                            i67 = i76;
                                            i65 = i68 + n11;
                                            bArr31 = bArr42;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            bArr10 = bArr17;
                                            bArr2 = bArr13;
                                            Arrays.fill(bArr12, (byte) 0);
                                            Arrays.fill(bArr11, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr10, (byte) 0);
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        bArr8 = bArr44;
                                        bArr5 = bArr23;
                                        bArr9 = bArr27;
                                        bArr2 = bArr13;
                                        Arrays.fill(bArr12, (byte) 0);
                                        Arrays.fill(bArr11, (byte) 0);
                                        Arrays.fill(bArr4, (byte) 0);
                                        Arrays.fill(bArr3, (byte) 0);
                                        Arrays.fill(bArr6, (byte) 0);
                                        Arrays.fill(bArr5, (byte) 0);
                                        Arrays.fill(bArr7, (byte) 0);
                                        Arrays.fill(bArr8, (byte) 0);
                                        Arrays.fill(bArr10, (byte) 0);
                                        Arrays.fill(bArr9, (byte) 0);
                                        Arrays.fill(bArr2, (byte) 0);
                                        throw th;
                                    }
                                }
                                bArr17 = bArr15;
                                bArr5 = bArr23;
                                bArr8 = bArr26;
                                bArr9 = bArr27;
                                bArr11 = bArr41;
                                bArr12 = bArr32;
                                bArr3 = bArr34;
                                byte[] bArr45 = bArr16;
                                GF16.encode(bArr9, bArr45, i14);
                                System.arraycopy(bArr3, 0, bArr45, sigBytes - i11, i11);
                                byte[] bArrConcatenate = Arrays.concatenate(bArr45, bArr);
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr17, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr13, (byte) 0);
                                return bArrConcatenate;
                            } catch (Throwable th13) {
                                th = th13;
                                bArr2 = bArr29;
                                bArr11 = bArr19;
                                bArr12 = bArr35;
                                bArr4 = bArr21;
                                bArr5 = bArr23;
                                bArr6 = bArr24;
                                bArr7 = bArr25;
                                bArr8 = bArr26;
                                bArr9 = bArr27;
                                bArr10 = bArr28;
                                bArr3 = bArr34;
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr10, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            bArr2 = bArr29;
                            bArr11 = bArr19;
                            bArr3 = bArr34;
                            bArr12 = bArr35;
                            bArr4 = bArr21;
                            bArr5 = bArr23;
                            bArr6 = bArr24;
                            bArr7 = bArr25;
                            bArr8 = bArr26;
                            bArr9 = bArr27;
                            bArr10 = bArr28;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        bArr2 = bArr29;
                        bArr3 = bArr34;
                        bArr12 = bArr35;
                        bArr4 = bArr21;
                        bArr5 = bArr23;
                        bArr6 = bArr24;
                        bArr7 = bArr25;
                        bArr8 = bArr26;
                        bArr9 = bArr27;
                        bArr10 = bArr28;
                        bArr11 = bArr19;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    bArr2 = bArr29;
                    bArr3 = bArr34;
                    bArr4 = bArr21;
                    bArr5 = bArr23;
                    bArr6 = bArr24;
                    bArr7 = bArr25;
                    bArr8 = bArr26;
                    bArr9 = bArr27;
                    bArr10 = bArr28;
                    bArr11 = bArr19;
                    bArr12 = bArr32;
                    Arrays.fill(bArr12, (byte) 0);
                    Arrays.fill(bArr11, (byte) 0);
                    Arrays.fill(bArr4, (byte) 0);
                    Arrays.fill(bArr3, (byte) 0);
                    Arrays.fill(bArr6, (byte) 0);
                    Arrays.fill(bArr5, (byte) 0);
                    Arrays.fill(bArr7, (byte) 0);
                    Arrays.fill(bArr8, (byte) 0);
                    Arrays.fill(bArr10, (byte) 0);
                    Arrays.fill(bArr9, (byte) 0);
                    Arrays.fill(bArr2, (byte) 0);
                    throw th;
                }
            } catch (Throwable th17) {
                th = th17;
                bArr2 = bArr29;
                bArr4 = bArr21;
                bArr5 = bArr23;
                bArr6 = bArr24;
                bArr7 = bArr25;
                bArr8 = bArr26;
                bArr9 = bArr27;
                bArr10 = bArr28;
                bArr11 = bArr19;
            }
        } catch (Throwable th18) {
            th = th18;
            bArr2 = bArr29;
            bArr3 = bArr20;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (!z11) {
            MayoPublicKeyParameters mayoPublicKeyParameters = (MayoPublicKeyParameters) cipherParameters;
            this.pubKey = mayoPublicKeyParameters;
            this.params = mayoPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
            return;
        }
        this.pubKey = null;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (MayoPrivateKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.privKey = (MayoPrivateKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.params = this.privKey.getParameters();
    }

    public boolean sampleSolution(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i11;
        boolean z11;
        int i12;
        int k11 = this.params.getK();
        int o11 = this.params.getO();
        int m11 = this.params.getM();
        int aCols = this.params.getACols();
        int i13 = k11 * o11;
        byte b8 = 0;
        System.arraycopy(bArr3, 0, bArr4, 0, i13);
        byte[] bArr5 = new byte[m11];
        int i14 = i13 + 1;
        byte[] bArr6 = bArr;
        GF16Utils.matMul(bArr6, bArr3, 0, bArr5, i14, m11);
        int i15 = i13;
        int i16 = 0;
        while (i16 < m11) {
            bArr6[i15] = (byte) (bArr2[i16] ^ bArr5[i16]);
            i16++;
            i15 += i14;
        }
        ef(bArr6, m11, aCols);
        int i17 = m11 - 1;
        int i18 = i17 * aCols;
        int i19 = i18;
        int i21 = 0;
        boolean z12 = false;
        while (true) {
            i11 = aCols - 1;
            z11 = true;
            if (i21 >= i11) {
                break;
            }
            if (bArr6[i19] == 0) {
                z11 = false;
            }
            z12 |= z11;
            i21++;
            i19++;
        }
        if (!z12) {
            return false;
        }
        while (i17 >= 0) {
            int iMin = Math.min((32 / (m11 - i17)) + i17, i13);
            int i22 = i17;
            byte b11 = b8;
            while (i22 <= iMin) {
                byte b12 = (byte) ((-(bArr6[i18 + i22] & 255)) >> 31);
                byte b13 = (byte) ((~b11) & b12 & bArr6[(i18 + aCols) - 1]);
                bArr4[i22] = (byte) (bArr4[i22] ^ b13);
                int i23 = i22;
                int i24 = i11;
                int i25 = 0;
                while (i25 < i17) {
                    boolean z13 = z11;
                    byte b14 = b12;
                    long j9 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        if (i26 >= 8) {
                            break;
                        }
                        int i28 = i26;
                        j9 ^= ((long) (bArr[i23 + i27] & 255)) << (i28 << 3);
                        i26 = i28 + 1;
                        i27 += aCols;
                    }
                    long jMulFx8 = GF16Utils.mulFx8(b13, j9);
                    int i29 = 0;
                    int i31 = 0;
                    for (i12 = 8; i29 < i12; i12 = 8) {
                        int i32 = i24 + i31;
                        bArr[i32] = (byte) (bArr[i32] ^ ((byte) ((jMulFx8 >> (i29 << 3)) & 15)));
                        i29++;
                        i31 += aCols;
                        i17 = i17;
                    }
                    i25 += 8;
                    int i33 = aCols << 3;
                    i23 += i33;
                    i24 += i33;
                    z11 = z13;
                    b12 = b14;
                }
                b11 = (byte) (b11 | b12);
                i22++;
                bArr6 = bArr;
            }
            i17--;
            i18 -= aCols;
            bArr6 = bArr;
            b8 = 0;
        }
        return z11;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int m11 = this.params.getM();
        int n11 = this.params.getN();
        int k11 = this.params.getK();
        int i11 = k11 * n11;
        int p1Limbs = this.params.getP1Limbs();
        int p2Limbs = this.params.getP2Limbs();
        int p3Limbs = this.params.getP3Limbs();
        int mBytes = this.params.getMBytes();
        int sigBytes = this.params.getSigBytes();
        int digestBytes = this.params.getDigestBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        byte[] bArr3 = new byte[mBytes];
        byte[] bArr4 = new byte[m11];
        byte[] bArr5 = new byte[m11 << 1];
        byte[] bArr6 = new byte[i11];
        int i12 = p1Limbs + p2Limbs;
        long[] jArr = new long[i12 + p3Limbs];
        byte[] bArr7 = new byte[digestBytes + saltBytes];
        byte[] encoded = this.pubKey.getEncoded();
        Utils.expandP1P2(this.params, jArr, encoded);
        Utils.unpackMVecs(encoded, this.params.getPkSeedBytes(), jArr, i12, p3Limbs / mVecLimbs, m11);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr2, sigBytes - saltBytes, saltBytes);
        sHAKEDigest.doFinal(bArr3, 0, mBytes);
        GF16.decode(bArr3, bArr4, m11);
        GF16.decode(bArr2, bArr6, i11);
        long[] jArr2 = new long[k11 * k11 * mVecLimbs];
        long[] jArr3 = new long[i11 * mVecLimbs];
        MayoParameters mayoParameters = this.params;
        mayoGenericMCalculatePS(mayoParameters, jArr, p1Limbs, i12, bArr6, mayoParameters.getV(), this.params.getO(), k11, jArr3);
        mayoGenericMCalculateSPS(jArr3, bArr6, mVecLimbs, k11, n11, jArr2);
        computeRHS(jArr2, new byte[m11], bArr5);
        return Arrays.constantTimeAreEqual(m11, bArr5, 0, bArr4, 0);
    }

    private static void vecMulAddU64(int i11, long[] jArr, byte b8, long[] jArr2) {
        int iMulTable = mulTable(b8 & 255);
        for (int i12 = 0; i12 < i11; i12++) {
            long j9 = jArr[i12];
            jArr2[i12] = ((((j9 >>> 3) & 1229782938247303441L) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j9 & 1229782938247303441L) * ((long) (iMulTable & 255))) ^ (((j9 >>> 1) & 1229782938247303441L) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j9 >>> 2) & 1229782938247303441L) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i12];
        }
    }
}
