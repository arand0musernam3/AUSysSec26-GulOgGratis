package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
class SnovaEngine {
    private static final Map<Integer, byte[]> fixedAbqSet = new HashMap();
    private static final Map<Integer, byte[][]> sSet = new HashMap();
    private static final Map<Integer, int[][]> xSSet = new HashMap();
    final byte[][] S;
    private final int alpha;
    private final int l;
    private final int lsq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f33612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f33613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f33614o;
    private final SnovaParameters params;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f33615v;
    final int[][] xS;

    public SnovaEngine(SnovaParameters snovaParameters) {
        int i11;
        this.params = snovaParameters;
        int l = snovaParameters.getL();
        this.l = l;
        int lsq = snovaParameters.getLsq();
        this.lsq = lsq;
        this.f33612m = snovaParameters.getM();
        this.f33615v = snovaParameters.getV();
        this.f33614o = snovaParameters.getO();
        this.alpha = snovaParameters.getAlpha();
        this.f33613n = snovaParameters.getN();
        int i12 = 0;
        if (!xSSet.containsKey(Integers.valueOf(l))) {
            int i13 = 2;
            byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, l, lsq);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, l, lsq);
            be_aI(bArr[0], 0, (byte) 1);
            beTheS(bArr[1]);
            while (true) {
                int i14 = this.l;
                if (i13 >= i14) {
                    break;
                }
                GF16Utils.gf16mMul(bArr[i13 - 1], bArr[1], bArr[i13], i14);
                i13++;
            }
            int i15 = 0;
            while (true) {
                i11 = this.l;
                if (i15 >= i11) {
                    break;
                }
                for (int i16 = 0; i16 < this.lsq; i16++) {
                    iArr[i15][i16] = GF16Utils.gf16FromNibble(bArr[i15][i16]);
                }
                i15++;
            }
            sSet.put(Integers.valueOf(i11), bArr);
            xSSet.put(Integers.valueOf(this.l), iArr);
        }
        this.S = sSet.get(Integers.valueOf(this.l));
        this.xS = xSSet.get(Integers.valueOf(this.l));
        if (this.l >= 4 || fixedAbqSet.containsKey(Integers.valueOf(this.f33614o))) {
            return;
        }
        int i17 = this.alpha;
        int i18 = this.l;
        int i19 = i17 * i18;
        int i21 = i18 * i19;
        int i22 = this.f33614o;
        int i23 = i22 * i19;
        int i24 = i22 * i21;
        byte[] bArr2 = new byte[i24 << 2];
        int i25 = i24 + i23;
        byte[] bArr3 = new byte[i25];
        byte[] bArr4 = new byte[i23 << 2];
        byte[] bytes = "SNOVA_ABQ".getBytes();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bytes, 0, bytes.length);
        sHAKEDigest.doFinal(bArr3, 0, i25);
        int i26 = i24 << 1;
        GF16.decode(bArr3, bArr2, i26);
        GF16.decode(bArr3, i21, bArr4, 0, i23 << 1);
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int i31 = this.f33614o;
            if (i27 >= i31) {
                fixedAbqSet.put(Integers.valueOf(i31), bArr2);
                return;
            }
            int i32 = i12;
            int i33 = i28;
            int i34 = i29;
            while (i32 < this.alpha) {
                makeInvertibleByAddingAS(bArr2, i34);
                makeInvertibleByAddingAS(bArr2, i24 + i34);
                genAFqS(bArr4, i33, bArr2, i26 + i34);
                genAFqS(bArr4, i23 + i33, bArr2, i26 + i24 + i34);
                i32++;
                i33 += this.l;
                i34 += this.lsq;
            }
            i27++;
            i29 += i21;
            i28 += i19;
            i12 = 0;
        }
    }

    private void beTheS(byte[] bArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i11 = this.l;
            if (i13 >= i11) {
                break;
            }
            int i15 = 0;
            while (true) {
                i12 = this.l;
                if (i15 < i12) {
                    bArr[i14 + i15] = (byte) ((8 - (i13 + i15)) & 15);
                    i15++;
                }
            }
            i13++;
            i14 += i12;
        }
        if (i11 == 5) {
            bArr[24] = 9;
        }
    }

    private void be_aI(byte[] bArr, int i11, byte b8) {
        int i12 = this.l + 1;
        int i13 = 0;
        while (i13 < this.l) {
            bArr[i11] = b8;
            i13++;
            i11 += i12;
        }
    }

    private static void copy4DMatrix(byte[][][][] bArr, byte[][][][] bArr2, int i11, int i12, int i13, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                for (int i17 = 0; i17 < i13; i17++) {
                    System.arraycopy(bArr[i15][i16][i17], 0, bArr2[i15][i16][i17], 0, i14);
                }
            }
        }
    }

    private byte determinant2x2(byte[] bArr, int i11) {
        return (byte) (GF16.mul(bArr[i11 + 1], bArr[i11 + 2]) ^ GF16.mul(bArr[i11], bArr[i11 + 3]));
    }

    private byte determinant3x3(byte[] bArr, int i11) {
        byte b8 = bArr[i11];
        byte b11 = bArr[i11 + 1];
        byte b12 = bArr[i11 + 2];
        byte b13 = bArr[i11 + 3];
        byte b14 = bArr[i11 + 4];
        byte b15 = bArr[i11 + 5];
        byte b16 = bArr[i11 + 6];
        byte b17 = bArr[i11 + 7];
        byte b18 = bArr[i11 + 8];
        return (byte) ((GF16.mul(b11, GF16.mul(b13, b18) ^ GF16.mul(b15, b16)) ^ GF16.mul(b8, GF16.mul(b14, b18) ^ GF16.mul(b15, b17))) ^ GF16.mul(b12, GF16.mul(b13, b17) ^ GF16.mul(b14, b16)));
    }

    private byte determinant4x4(byte[] bArr, int i11) {
        byte b8 = bArr[i11];
        byte b11 = bArr[i11 + 1];
        byte b12 = bArr[i11 + 2];
        byte b13 = bArr[i11 + 3];
        byte b14 = bArr[i11 + 4];
        byte b15 = bArr[i11 + 5];
        byte b16 = bArr[i11 + 6];
        byte b17 = bArr[i11 + 7];
        byte b18 = bArr[i11 + 8];
        byte b19 = bArr[i11 + 9];
        byte b21 = bArr[i11 + 10];
        byte b22 = bArr[i11 + 11];
        byte b23 = bArr[i11 + 12];
        byte b24 = bArr[i11 + 13];
        byte b25 = bArr[i11 + 14];
        byte b26 = bArr[i11 + 15];
        byte bMul = (byte) (GF16.mul(b21, b26) ^ GF16.mul(b22, b25));
        byte bMul2 = (byte) (GF16.mul(b19, b26) ^ GF16.mul(b22, b24));
        byte bMul3 = (byte) (GF16.mul(b19, b25) ^ GF16.mul(b21, b24));
        byte bMul4 = (byte) (GF16.mul(b22, b23) ^ GF16.mul(b18, b26));
        byte bMul5 = (byte) (GF16.mul(b21, b23) ^ GF16.mul(b18, b25));
        byte bMul6 = (byte) (GF16.mul(b18, b24) ^ GF16.mul(b19, b23));
        return (byte) (GF16.mul(b13, (GF16.mul(b14, bMul3) ^ GF16.mul(b15, bMul5)) ^ GF16.mul(b16, bMul6)) ^ ((GF16.mul(b8, (GF16.mul(b15, bMul) ^ GF16.mul(b16, bMul2)) ^ GF16.mul(b17, bMul3)) ^ GF16.mul(b11, (GF16.mul(b14, bMul) ^ GF16.mul(b16, bMul4)) ^ GF16.mul(b17, bMul5))) ^ GF16.mul(b12, (GF16.mul(b14, bMul2) ^ GF16.mul(b15, bMul4)) ^ GF16.mul(b17, bMul6))));
    }

    private byte determinant5x5(byte[] bArr, int i11) {
        byte b8 = bArr[i11];
        byte b11 = bArr[i11 + 1];
        byte b12 = bArr[i11 + 2];
        byte b13 = bArr[i11 + 3];
        byte b14 = bArr[i11 + 4];
        byte b15 = bArr[i11 + 5];
        byte b16 = bArr[i11 + 6];
        byte b17 = bArr[i11 + 7];
        byte b18 = bArr[i11 + 8];
        byte b19 = bArr[i11 + 9];
        byte b21 = bArr[i11 + 10];
        byte b22 = bArr[i11 + 11];
        byte b23 = bArr[i11 + 12];
        byte b24 = bArr[i11 + 13];
        byte b25 = bArr[i11 + 14];
        byte b26 = bArr[i11 + 15];
        byte b27 = bArr[i11 + 16];
        byte b28 = bArr[i11 + 17];
        byte b29 = bArr[i11 + 18];
        byte b31 = bArr[i11 + 19];
        byte b32 = bArr[i11 + 20];
        byte b33 = bArr[i11 + 21];
        byte b34 = bArr[i11 + 22];
        byte b35 = bArr[i11 + 23];
        byte b36 = bArr[i11 + 24];
        byte bMul = (byte) (GF16.mul(b15, b22) ^ GF16.mul(b16, b21));
        byte bMul2 = (byte) (GF16.mul(b15, b23) ^ GF16.mul(b17, b21));
        byte bMul3 = (byte) (GF16.mul(b15, b24) ^ GF16.mul(b18, b21));
        byte bMul4 = (byte) (GF16.mul(b15, b25) ^ GF16.mul(b19, b21));
        byte bMul5 = (byte) (GF16.mul(b16, b23) ^ GF16.mul(b17, b22));
        byte bMul6 = (byte) (GF16.mul(b16, b24) ^ GF16.mul(b18, b22));
        byte bMul7 = (byte) (GF16.mul(b16, b25) ^ GF16.mul(b19, b22));
        byte bMul8 = (byte) (GF16.mul(b17, b24) ^ GF16.mul(b18, b23));
        byte bMul9 = (byte) (GF16.mul(b17, b25) ^ GF16.mul(b19, b23));
        byte bMul10 = (byte) (GF16.mul(b18, b25) ^ GF16.mul(b19, b24));
        return (byte) (((byte) (GF16.mul((GF16.mul(b13, bMul7) ^ GF16.mul(b11, bMul10)) ^ GF16.mul(b14, bMul6), GF16.mul(b26, b34) ^ GF16.mul(b28, b32)) ^ ((byte) (((byte) (((byte) (GF16.mul((GF16.mul(b8, bMul10) ^ GF16.mul(b13, bMul4)) ^ GF16.mul(b14, bMul3), GF16.mul(b27, b34) ^ GF16.mul(b28, b33)) ^ ((byte) (((byte) (((byte) (((byte) (((byte) GF16.mul((GF16.mul(b8, bMul5) ^ GF16.mul(b11, bMul2)) ^ GF16.mul(b12, bMul), GF16.mul(b29, b36) ^ GF16.mul(b31, b35))) ^ GF16.mul((GF16.mul(b8, bMul6) ^ GF16.mul(b11, bMul3)) ^ GF16.mul(b13, bMul), GF16.mul(b28, b36) ^ GF16.mul(b31, b34)))) ^ GF16.mul((GF16.mul(b8, bMul7) ^ GF16.mul(b11, bMul4)) ^ GF16.mul(b14, bMul), GF16.mul(b28, b35) ^ GF16.mul(b29, b34)))) ^ GF16.mul((GF16.mul(b8, bMul8) ^ GF16.mul(b12, bMul3)) ^ GF16.mul(b13, bMul2), GF16.mul(b27, b36) ^ GF16.mul(b31, b33)))) ^ GF16.mul((GF16.mul(b8, bMul9) ^ GF16.mul(b12, bMul4)) ^ GF16.mul(b14, bMul2), GF16.mul(b27, b35) ^ GF16.mul(b29, b33)))))) ^ GF16.mul((GF16.mul(b11, bMul8) ^ GF16.mul(b12, bMul6)) ^ GF16.mul(b13, bMul5), GF16.mul(b26, b36) ^ GF16.mul(b31, b32)))) ^ GF16.mul(GF16.mul(b14, bMul5) ^ (GF16.mul(b11, bMul9) ^ GF16.mul(b12, bMul7)), GF16.mul(b26, b35) ^ GF16.mul(b29, b32)))))) ^ GF16.mul((GF16.mul(b12, bMul10) ^ GF16.mul(b13, bMul9)) ^ GF16.mul(b14, bMul8), GF16.mul(b26, b33) ^ GF16.mul(b27, b32)));
    }

    private void genAFqS(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        be_aI(bArr2, i12, bArr[i11]);
        int i15 = 1;
        while (true) {
            i13 = this.l;
            if (i15 >= i13 - 1) {
                break;
            }
            gf16mScaleTo(this.S[i15], bArr[i11 + i15], bArr2, i12);
            i15++;
        }
        if (bArr[(i11 + i13) - 1] != 0) {
            i14 = bArr[(i11 + i13) - 1];
        } else {
            int i16 = bArr[i11];
            i14 = 16 - (i16 + (i16 == 0 ? 1 : 0));
        }
        gf16mScaleTo(this.S[i13 - 1], (byte) i14, bArr2, i12);
    }

    private void genAFqSCT(byte[] bArr, int i11, byte[] bArr2) {
        int i12;
        int[] iArr = new int[this.lsq];
        int i13 = this.l + 1;
        int iGf16FromNibble = GF16Utils.gf16FromNibble(bArr[i11]);
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.l) {
            iArr[i15] = iGf16FromNibble;
            i14++;
            i15 += i13;
        }
        int i16 = 1;
        while (true) {
            i12 = this.l;
            if (i16 >= i12 - 1) {
                break;
            }
            int iGf16FromNibble2 = GF16Utils.gf16FromNibble(bArr[i11 + i16]);
            for (int i17 = 0; i17 < this.lsq; i17++) {
                iArr[i17] = iArr[i17] ^ (this.xS[i16][i17] * iGf16FromNibble2);
            }
            i16++;
        }
        int iCtGF16IsNotZero = GF16Utils.ctGF16IsNotZero(bArr[(i12 + i11) - 1]);
        int iGf16FromNibble3 = GF16Utils.gf16FromNibble((byte) ((((GF16Utils.ctGF16IsNotZero(bArr[i11]) + 15) - bArr[i11]) * (1 - iCtGF16IsNotZero)) + (bArr[(this.l + i11) - 1] * iCtGF16IsNotZero)));
        for (int i18 = 0; i18 < this.lsq; i18++) {
            int i19 = iArr[i18] ^ (this.xS[this.l - 1][i18] * iGf16FromNibble3);
            iArr[i18] = i19;
            bArr2[i18] = GF16Utils.gf16ToNibble(i19);
        }
        Arrays.fill(iArr, 0);
    }

    private void genF(MapGroup2 mapGroup2, MapGroup1 mapGroup1, byte[][][] bArr) {
        byte[][][][] bArr2 = mapGroup1.p11;
        byte[][][][] bArr3 = mapGroup2.f11;
        int i11 = this.f33612m;
        int i12 = this.f33615v;
        copy4DMatrix(bArr2, bArr3, i11, i12, i12, this.lsq);
        copy4DMatrix(mapGroup1.p12, mapGroup2.f12, this.f33612m, this.f33615v, this.f33614o, this.lsq);
        copy4DMatrix(mapGroup1.p21, mapGroup2.f21, this.f33612m, this.f33614o, this.f33615v, this.lsq);
        for (int i13 = 0; i13 < this.f33612m; i13++) {
            for (int i14 = 0; i14 < this.f33615v; i14++) {
                for (int i15 = 0; i15 < this.f33614o; i15++) {
                    for (int i16 = 0; i16 < this.f33615v; i16++) {
                        byte[][][] bArr4 = mapGroup1.p11[i13];
                        GF16Utils.gf16mMulToTo(bArr4[i14][i16], bArr[i16][i15], bArr4[i16][i14], mapGroup2.f12[i13][i14][i15], mapGroup2.f21[i13][i15][i14], this.l);
                    }
                }
            }
        }
    }

    private void genSeedsAndT12(byte[][][] bArr, byte[] bArr2) {
        int i11 = this.f33615v * this.f33614o * this.l;
        int i12 = (i11 + 1) >>> 1;
        byte[] bArr3 = new byte[i12];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, bArr2.length);
        sHAKEDigest.doFinal(bArr3, 0, i12);
        byte[] bArr4 = new byte[i11];
        GF16.decode(bArr3, bArr4, i11);
        int i13 = 0;
        for (int i14 = 0; i14 < this.f33615v; i14++) {
            for (int i15 = 0; i15 < this.f33614o; i15++) {
                genAFqSCT(bArr4, i13, bArr[i14][i15]);
                i13 += this.l;
            }
        }
    }

    private void generateASMatrixTo(byte[] bArr, int i11, byte b8) {
        int i12;
        int i13 = 0;
        while (i13 < this.l) {
            int i14 = 0;
            while (true) {
                i12 = this.l;
                if (i14 < i12) {
                    byte b11 = (byte) (8 - (i13 + i14));
                    if (i12 == 5 && i13 == 4 && i14 == 4) {
                        b11 = 9;
                    }
                    int i15 = i11 + i14;
                    bArr[i15] = (byte) (GF16.mul(b11, b8) ^ bArr[i15]);
                    i14++;
                }
            }
            i13++;
            i11 += i12;
        }
    }

    private byte gf16Determinant(byte[] bArr, int i11) {
        int i12 = this.l;
        if (i12 == 2) {
            return determinant2x2(bArr, i11);
        }
        if (i12 == 3) {
            return determinant3x3(bArr, i11);
        }
        if (i12 == 4) {
            return determinant4x4(bArr, i11);
        }
        if (i12 == 5) {
            return determinant5x5(bArr, i11);
        }
        y.e();
        return (byte) 0;
    }

    private void gf16mScaleTo(byte[] bArr, byte b8, byte[] bArr2, int i11) {
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.l) {
            int i15 = 0;
            while (true) {
                i12 = this.l;
                if (i15 < i12) {
                    int i16 = i14 + i15;
                    int i17 = i16 + i11;
                    bArr2[i17] = (byte) (GF16.mul(bArr[i16], b8) ^ bArr2[i17]);
                    i15++;
                }
            }
            i13++;
            i14 += i12;
        }
    }

    private void makeInvertibleByAddingAS(byte[] bArr, int i11) {
        if (gf16Determinant(bArr, i11) != 0) {
            return;
        }
        for (int i12 = 1; i12 < 16; i12++) {
            generateASMatrixTo(bArr, i11, (byte) i12);
            if (gf16Determinant(bArr, i11) != 0) {
                return;
            }
        }
    }

    public void genABQP(MapGroup1 mapGroup1, byte[] bArr) {
        int i11 = this.lsq;
        int i12 = this.f33612m;
        int i13 = this.alpha;
        int i14 = this.f33613n;
        int i15 = ((((i14 * i14) - (i12 * i12)) * i12) + (i12 * 2 * i13)) * i11;
        int i16 = this.l;
        int i17 = (i16 * 2 * i12 * i13) + i15;
        int i18 = ((i12 * i13) * i16) << 1;
        byte[] bArr2 = new byte[i18];
        int i19 = (i17 + 1) >> 1;
        byte[] bArr3 = new byte[i19];
        if (this.params.isPkExpandShake()) {
            byte[] bArr4 = new byte[8];
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            long j9 = 0;
            int i21 = 0;
            while (i19 > 0) {
                sHAKEDigest.update(bArr, 0, bArr.length);
                Pack.longToLittleEndian(j9, bArr4, 0);
                sHAKEDigest.update(bArr4, 0, 8);
                int iMin = Math.min(i19, 168);
                sHAKEDigest.doFinal(bArr3, i21, iMin);
                i21 += iMin;
                i19 -= iMin;
                j9++;
            }
        } else {
            CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
            cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr), new byte[16]));
            int blockSize = cTRModeCipherNewInstance.getBlockSize();
            byte[] bArr5 = new byte[blockSize];
            int i22 = 0;
            while (true) {
                int i23 = i22 + blockSize;
                if (i23 > i19) {
                    break;
                }
                cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr3, i22);
                i22 = i23;
            }
            if (i22 < i19) {
                cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr3, i22, i19 - i22);
            }
        }
        if ((this.lsq & 1) == 0) {
            mapGroup1.decode(bArr3, (i17 - i18) >> 1, this.l >= 4);
        } else {
            int i24 = i17 - i18;
            byte[] bArr6 = new byte[i24];
            GF16.decode(bArr3, bArr6, i24);
            mapGroup1.fill(bArr6, this.l >= 4);
        }
        if (this.l < 4) {
            int i25 = this.f33614o;
            int i26 = this.alpha * i25 * this.lsq;
            byte[] bArr7 = fixedAbqSet.get(Integers.valueOf(i25));
            MapGroup1.fillAlpha(bArr7, 0, mapGroup1.aAlpha, this.f33612m * i26);
            MapGroup1.fillAlpha(bArr7, i26, mapGroup1.bAlpha, (this.f33612m - 1) * i26);
            MapGroup1.fillAlpha(bArr7, i26 * 2, mapGroup1.qAlpha1, (this.f33612m - 2) * i26);
            MapGroup1.fillAlpha(bArr7, i26 * 3, mapGroup1.qAlpha2, (this.f33612m - 3) * i26);
            return;
        }
        GF16.decode(bArr3, (i17 - i18) >> 1, bArr2, 0, i18);
        int i27 = this.f33612m * this.alpha * this.l;
        int i28 = 0;
        for (int i29 = 0; i29 < this.f33612m; i29++) {
            for (int i31 = 0; i31 < this.alpha; i31++) {
                makeInvertibleByAddingAS(mapGroup1.aAlpha[i29][i31], 0);
                makeInvertibleByAddingAS(mapGroup1.bAlpha[i29][i31], 0);
                genAFqS(bArr2, i28, mapGroup1.qAlpha1[i29][i31], 0);
                genAFqS(bArr2, i27, mapGroup1.qAlpha2[i29][i31], 0);
                int i32 = this.l;
                i28 += i32;
                i27 += i32;
            }
        }
    }

    public void genMap1T12Map2(SnovaKeyElements snovaKeyElements, byte[] bArr, byte[] bArr2) {
        genSeedsAndT12(snovaKeyElements.T12, bArr2);
        genABQP(snovaKeyElements.map1, bArr);
        genF(snovaKeyElements.map2, snovaKeyElements.map1, snovaKeyElements.T12);
    }

    public void genP22(byte[] bArr, int i11, byte[][][] bArr2, byte[][][][] bArr3, byte[][][][] bArr4) {
        int i12 = this.f33614o;
        int i13 = this.lsq * i12;
        int i14 = i12 * i13;
        int i15 = this.f33612m * i14;
        byte[] bArr5 = new byte[i15];
        int i16 = 0;
        int i17 = 0;
        while (i16 < this.f33612m) {
            int i18 = 0;
            int i19 = i17;
            while (i18 < this.f33614o) {
                int i21 = 0;
                int i22 = i19;
                while (i21 < this.f33614o) {
                    int i23 = 0;
                    while (i23 < this.f33615v) {
                        byte[][] bArr6 = bArr2[i23];
                        int i24 = i21;
                        GF16Utils.gf16mMulTo(bArr6[i18], bArr4[i16][i23][i24], bArr3[i16][i18][i23], bArr6[i24], bArr5, i22, this.l);
                        i23++;
                        i21 = i24;
                    }
                    i21++;
                    i22 += this.lsq;
                }
                i18++;
                i19 += i13;
            }
            i16++;
            i17 += i14;
        }
        GF16.encode(bArr5, bArr, i11, i15);
    }
}
