package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes3.dex */
public class SnovaSigner implements MessageSigner {
    private SnovaEngine engine;
    private SnovaParameters params;
    private SnovaPrivateKeyParameters privKey;
    private SnovaPublicKeyParameters pubKey;
    private SecureRandom random;
    private final SHAKEDigest shake = new SHAKEDigest(256);

    private void evaluation(byte[] bArr, MapGroup1 mapGroup1, byte[][][][] bArr2, byte[] bArr3) {
        MapGroup1 mapGroup12 = mapGroup1;
        int m11 = this.params.getM();
        int alpha = this.params.getAlpha();
        int n11 = this.params.getN();
        int l = this.params.getL();
        int lsq = this.params.getLsq();
        int o11 = this.params.getO();
        Class cls = Byte.TYPE;
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n11, lsq);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n11, lsq);
        byte[] bArr6 = new byte[lsq];
        int i11 = 0;
        int i12 = 0;
        while (i11 < m11) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < n11) {
                int i15 = 0;
                while (i15 < alpha) {
                    GF16Utils.gf16mTranMulMul(bArr3, i14, mapGroup12.aAlpha[i11][i15], mapGroup12.bAlpha[i11][i15], mapGroup12.qAlpha1[i11][i15], mapGroup12.qAlpha2[i11][i15], bArr6, bArr4[i15][i13], bArr5[i15][i13], l);
                    i15++;
                    i13 = i13;
                }
                i14 += lsq;
                i13++;
            }
            int i16 = l;
            int i17 = i11;
            int i18 = 0;
            while (i18 < alpha) {
                if (i17 >= o11) {
                    i17 -= o11;
                }
                int i19 = i11;
                int i21 = 0;
                while (i21 < n11) {
                    int i22 = i12;
                    int i23 = i19;
                    int i24 = lsq;
                    int i25 = o11;
                    int i26 = i17;
                    GF16Utils.gf16mMul(getPMatrix(mapGroup12, bArr2, i26, i21, 0), bArr5[i18][0], bArr6, i16);
                    int i27 = 1;
                    while (i27 < n11) {
                        GF16Utils.gf16mMulTo(getPMatrix(mapGroup1, bArr2, i26, i21, i27), bArr5[i18][i27], bArr6, i16);
                        i27++;
                        m11 = m11;
                    }
                    GF16Utils.gf16mMulTo(bArr4[i18][i21], bArr6, bArr, i22, i16);
                    i21++;
                    mapGroup12 = mapGroup1;
                    i17 = i26;
                    lsq = i24;
                    o11 = i25;
                    i19 = i23;
                    i12 = i22;
                }
                i18++;
                i17++;
                mapGroup12 = mapGroup1;
                o11 = o11;
                i11 = i19;
            }
            i11++;
            i12 += lsq;
            mapGroup12 = mapGroup1;
            l = i16;
        }
    }

    private byte[] getMessageHash(byte[] bArr) {
        byte[] bArr2 = new byte[this.shake.getDigestSize()];
        this.shake.update(bArr, 0, bArr.length);
        this.shake.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] getPMatrix(MapGroup1 mapGroup1, byte[][][][] bArr, int i11, int i12, int i13) {
        int v3 = this.params.getV();
        return i12 < v3 ? i13 < v3 ? mapGroup1.p11[i11][i12][i13] : mapGroup1.p12[i11][i12][i13 - v3] : i13 < v3 ? mapGroup1.p21[i11][i12 - v3][i13] : bArr[i11][i12 - v3][i13 - v3];
    }

    private int performGaussianElimination(byte[][] bArr, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13;
            while (i14 < i11 && bArr[i14][i13] == 0) {
                i14++;
            }
            if (i14 >= i11) {
                return 1;
            }
            if (i14 != i13) {
                byte[] bArr3 = bArr[i13];
                bArr[i13] = bArr[i14];
                bArr[i14] = bArr3;
            }
            byte bInv = GF16.inv(bArr[i13][i13]);
            for (int i15 = i13; i15 < i12; i15++) {
                byte[] bArr4 = bArr[i13];
                bArr4[i15] = GF16.mul(bArr4[i15], bInv);
            }
            int i16 = i13 + 1;
            for (int i17 = i16; i17 < i11; i17++) {
                byte b8 = bArr[i17][i13];
                if (b8 != 0) {
                    for (int i18 = i13; i18 < i12; i18++) {
                        byte[] bArr5 = bArr[i17];
                        bArr5[i18] = (byte) (bArr5[i18] ^ GF16.mul(bArr[i13][i18], b8));
                    }
                }
            }
            i13 = i16;
        }
        for (int i19 = i11 - 1; i19 >= 0; i19--) {
            byte bMul = bArr[i19][i11];
            for (int i21 = i19 + 1; i21 < i11; i21++) {
                bMul = (byte) (bMul ^ GF16.mul(bArr[i19][i21], bArr2[i21]));
            }
            bArr2[i19] = bMul;
        }
        return 0;
    }

    public void createSignedHash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14, byte[] bArr4, int i15) {
        this.shake.update(bArr, 0, i11);
        this.shake.update(bArr2, 0, i12);
        this.shake.update(bArr3, i13, i14);
        this.shake.doFinal(bArr4, 0, i15);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        byte[] messageHash = getMessageHash(bArr);
        byte[] bArr2 = new byte[this.params.getSaltLength()];
        this.random.nextBytes(bArr2);
        byte[] bArr3 = new byte[this.params.getSaltLength() + (((this.params.getLsq() * this.params.getN()) + 1) >>> 1)];
        SnovaKeyElements snovaKeyElements = new SnovaKeyElements(this.params);
        boolean zIsSkIsSeed = this.params.isSkIsSeed();
        SnovaPrivateKeyParameters snovaPrivateKeyParameters = this.privKey;
        if (zIsSkIsSeed) {
            byte[] privateKey = snovaPrivateKeyParameters.getPrivateKey();
            bArrCopyOfRange = Arrays.copyOfRange(privateKey, 0, 16);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey, 16, privateKey.length);
            this.engine.genMap1T12Map2(snovaKeyElements, bArrCopyOfRange, bArrCopyOfRange2);
        } else {
            byte[] privateKey2 = snovaPrivateKeyParameters.getPrivateKey();
            int length = (privateKey2.length - 48) << 1;
            byte[] bArr4 = new byte[length];
            GF16Utils.decodeMergeInHalf(privateKey2, bArr4, length);
            SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, 0, snovaKeyElements.map1.aAlpha), snovaKeyElements.map1.bAlpha), snovaKeyElements.map1.qAlpha1), snovaKeyElements.map1.qAlpha2), snovaKeyElements.T12), snovaKeyElements.map2.f11), snovaKeyElements.map2.f12), snovaKeyElements.map2.f21);
            bArrCopyOfRange = Arrays.copyOfRange(privateKey2, privateKey2.length - 48, privateKey2.length - 32);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey2, privateKey2.length - 32, privateKey2.length);
        }
        byte[] bArr5 = bArrCopyOfRange2;
        byte[] bArr6 = bArrCopyOfRange;
        MapGroup1 mapGroup1 = snovaKeyElements.map1;
        byte[][][] bArr7 = mapGroup1.aAlpha;
        byte[][][] bArr8 = mapGroup1.bAlpha;
        byte[][][] bArr9 = mapGroup1.qAlpha1;
        byte[][][] bArr10 = mapGroup1.qAlpha2;
        byte[][][] bArr11 = snovaKeyElements.T12;
        MapGroup2 mapGroup2 = snovaKeyElements.map2;
        signDigestCore(bArr3, messageHash, bArr2, bArr7, bArr8, bArr9, bArr10, bArr11, mapGroup2.f11, mapGroup2.f12, mapGroup2.f21, bArr6, bArr5);
        return Arrays.concatenate(bArr3, bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z11) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SnovaPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SnovaPrivateKeyParameters) cipherParameters;
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random = secureRandom;
            this.params = this.privKey.getParameters();
        } else {
            SnovaPublicKeyParameters snovaPublicKeyParameters = (SnovaPublicKeyParameters) cipherParameters;
            this.pubKey = snovaPublicKeyParameters;
            this.params = snovaPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
        }
        this.engine = new SnovaEngine(this.params);
    }

    public void signDigestCore(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][][] bArr4, byte[][][] bArr5, byte[][][] bArr6, byte[][][] bArr7, byte[][][] bArr8, byte[][][][] bArr9, byte[][][][] bArr10, byte[][][][] bArr11, byte[] bArr12, byte[] bArr13) {
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr14;
        int i15;
        byte b8;
        int i16;
        byte b11;
        byte[] bArr15 = bArr13;
        int m11 = this.params.getM();
        int l = this.params.getL();
        int lsq = this.params.getLsq();
        int alpha = this.params.getAlpha();
        int v3 = this.params.getV();
        int o11 = this.params.getO();
        int n11 = this.params.getN();
        int i17 = m11 * lsq;
        int i18 = o11 * lsq;
        int i19 = v3 * lsq;
        int i21 = (i18 + 1) >>> 1;
        Class cls = Byte.TYPE;
        byte[][] bArr16 = (byte[][]) Array.newInstance((Class<?>) cls, i17, i17 + 1);
        byte[][] bArr17 = (byte[][]) Array.newInstance((Class<?>) cls, lsq, lsq);
        byte[] bArr18 = new byte[i17];
        byte[][][] bArr19 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v3, lsq);
        byte[][][] bArr20 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v3, lsq);
        byte[] bArr21 = new byte[lsq];
        byte[] bArr22 = new byte[lsq];
        byte[] bArr23 = new byte[lsq];
        byte[] bArr24 = new byte[i17];
        int i22 = n11 * lsq;
        byte[] bArr25 = new byte[i21];
        int i23 = (i19 + 1) >>> 1;
        int i24 = lsq;
        byte[] bArr26 = new byte[i23];
        byte[] bArr27 = new byte[l];
        int i25 = l;
        int i26 = o11;
        int i27 = v3;
        byte b12 = 0;
        byte[] bArr28 = bArr18;
        byte[] bArr29 = new byte[i22];
        int i28 = i23;
        byte[] bArr30 = bArr23;
        byte[] bArr31 = bArr22;
        int i29 = m11;
        int i31 = alpha;
        int i32 = i17;
        byte[] bArr32 = bArr27;
        createSignedHash(bArr12, bArr12.length, bArr2, bArr2.length, bArr3, 0, bArr3.length, bArr25, i21);
        byte[] bArr33 = bArr2;
        GF16.decode(bArr25, 0, bArr24, 0, i32);
        byte b13 = 0;
        while (true) {
            for (int i33 = b12; i33 < bArr16.length; i33++) {
                Arrays.fill(bArr16[i33], b12);
            }
            byte b14 = (byte) (b13 + 1);
            for (int i34 = b12; i34 < i32; i34++) {
                bArr16[i34][i32] = bArr24[i34];
            }
            this.shake.update(bArr15, b12, bArr15.length);
            this.shake.update(bArr33, b12, bArr33.length);
            this.shake.update(bArr3, b12, bArr3.length);
            this.shake.update(b14);
            int i35 = i28;
            this.shake.doFinal(bArr26, b12, i35);
            byte[] bArr34 = bArr29;
            GF16.decode(bArr26, bArr34, i35 << 1);
            int i36 = b12;
            int i37 = i29;
            int i38 = i36;
            while (i36 < i37) {
                byte[] bArr35 = bArr30;
                Arrays.fill(bArr35, b12);
                int i39 = i36;
                int i41 = b12;
                int i42 = i31;
                while (i41 < i42) {
                    byte b15 = b14;
                    int i43 = i26;
                    if (i39 >= i43) {
                        i39 -= i43;
                    }
                    int i44 = i39;
                    byte[] bArr36 = bArr24;
                    byte[] bArr37 = bArr26;
                    int i45 = i27;
                    int i46 = 0;
                    int i47 = 0;
                    while (i46 < i45) {
                        int i48 = i42;
                        byte[] bArr38 = bArr34;
                        GF16Utils.gf16mTranMulMul(bArr38, i47, bArr4[i36][i41], bArr5[i36][i41], bArr6[i36][i41], bArr7[i36][i41], bArr32, bArr19[i41][i46], bArr20[i41][i46], i25);
                        i47 += i24;
                        i32 = i32;
                        i46++;
                        bArr37 = bArr37;
                        i42 = i48;
                        bArr34 = bArr38;
                    }
                    byte[] bArr39 = bArr34;
                    int i49 = i42;
                    int i51 = i32;
                    byte[] bArr40 = bArr37;
                    int i52 = 0;
                    int i53 = 0;
                    while (i53 < i45) {
                        int i54 = i52;
                        while (i54 < i45) {
                            int i55 = i53;
                            int i56 = i49;
                            byte[] bArr41 = bArr32;
                            GF16Utils.gf16mMulMulTo(bArr19[i41][i53], bArr9[i44][i53][i54], bArr20[i41][i54], bArr41, bArr35, i25);
                            i54++;
                            i36 = i36;
                            i37 = i37;
                            i41 = i41;
                            i35 = i35;
                            bArr32 = bArr41;
                            i49 = i56;
                            i53 = i55;
                        }
                        i41 = i41;
                        i52 = 0;
                        bArr32 = bArr32;
                        i49 = i49;
                        i53++;
                        i36 = i36;
                    }
                    i42 = i49;
                    bArr32 = bArr32;
                    i26 = i43;
                    i27 = i45;
                    b14 = b15;
                    bArr24 = bArr36;
                    bArr26 = bArr40;
                    bArr34 = bArr39;
                    i41++;
                    i36 = i36;
                    i32 = i51;
                    i39 = i44 + 1;
                    i35 = i35;
                }
                int i57 = i35;
                int i58 = i37;
                byte[] bArr42 = bArr34;
                bArr30 = bArr35;
                byte b16 = b14;
                byte[] bArr43 = bArr24;
                byte[] bArr44 = bArr26;
                int i59 = i32;
                byte[] bArr45 = bArr32;
                int i61 = i24;
                int i62 = i25;
                int i63 = i27;
                int i64 = i26;
                int i65 = i36;
                int i66 = 0;
                int i67 = 0;
                while (i66 < i62) {
                    int i68 = i67;
                    int i69 = 0;
                    while (i69 < i62) {
                        byte[] bArr46 = bArr16[i38 + i68];
                        bArr46[i59] = (byte) (bArr30[i68] ^ bArr46[i59]);
                        i69++;
                        i68++;
                    }
                    i66++;
                    i67 = i68;
                }
                int i71 = 0;
                int i72 = 0;
                while (i71 < i64) {
                    int i73 = i65;
                    int i74 = 0;
                    while (i74 < i42) {
                        if (i73 >= i64) {
                            i73 -= i64;
                        }
                        int i75 = i73;
                        for (int i76 = 0; i76 < i61; i76++) {
                            Arrays.fill(bArr17[i76], (byte) 0);
                        }
                        int i77 = 0;
                        while (i77 < i63) {
                            int i78 = i74;
                            int i79 = i77;
                            GF16Utils.gf16mMulMul(bArr19[i74][i77], bArr10[i75][i77][i71], bArr7[i65][i74], bArr45, bArr21, i62);
                            byte[] bArr47 = bArr31;
                            GF16Utils.gf16mMulMul(bArr6[i65][i78], bArr11[i75][i71][i79], bArr20[i78][i79], bArr45, bArr47, i62);
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            while (i81 < i61) {
                                if (i82 == i62) {
                                    i83 += i62;
                                    i82 = 0;
                                }
                                int i84 = i81;
                                int i85 = i82;
                                byte b17 = bArr21[i83];
                                byte b18 = bArr47[i82];
                                int i86 = 0;
                                int i87 = 0;
                                int i88 = 0;
                                int i89 = 0;
                                int i91 = 0;
                                while (i86 < i61) {
                                    if (i87 == i62) {
                                        i88++;
                                        i89 += i62;
                                        i15 = i86;
                                        b8 = bArr21[i83 + i88];
                                        b11 = bArr47[i89 + i85];
                                        i91 = 0;
                                        i16 = 0;
                                    } else {
                                        byte b19 = b17;
                                        i15 = i86;
                                        b8 = b19;
                                        byte b21 = b18;
                                        i16 = i87;
                                        b11 = b21;
                                    }
                                    int i92 = i83;
                                    byte b22 = bArr5[i65][i78][i91 + i85];
                                    byte[] bArr48 = bArr45;
                                    byte b23 = bArr4[i65][i78][i92 + i16];
                                    byte[] bArr49 = bArr17[i84];
                                    bArr49[i15] = (byte) (bArr49[i15] ^ (GF16.mul(b8, b22) ^ GF16.mul(b23, b11)));
                                    int i93 = i15 + 1;
                                    int i94 = i16 + 1;
                                    i91 += i62;
                                    b17 = b8;
                                    b18 = b11;
                                    i86 = i93;
                                    i87 = i94;
                                    i83 = i92;
                                    bArr45 = bArr48;
                                }
                                i81 = i84 + 1;
                                i82 = i85 + 1;
                            }
                            i77 = i79 + 1;
                            bArr31 = bArr47;
                            i74 = i78;
                        }
                        int i95 = i74;
                        byte[] bArr50 = bArr45;
                        byte[] bArr51 = bArr31;
                        int i96 = 0;
                        while (i96 < i61) {
                            int i97 = 0;
                            while (i97 < i61) {
                                byte[] bArr52 = bArr16[i38 + i96];
                                int i98 = i72 + i97;
                                bArr52[i98] = (byte) (bArr52[i98] ^ bArr17[i96][i97]);
                                i97++;
                                i96 = i96;
                            }
                            i96++;
                        }
                        i74 = i95 + 1;
                        i73 = i75 + 1;
                        bArr31 = bArr51;
                        bArr45 = bArr50;
                    }
                    i71++;
                    i72 += i61;
                }
                byte[] bArr53 = bArr45;
                i36 = i65 + 1;
                i38 += i61;
                i32 = i59;
                i25 = i62;
                i26 = i64;
                i27 = i63;
                i24 = i61;
                i37 = i58;
                b14 = b16;
                bArr24 = bArr43;
                bArr26 = bArr44;
                bArr34 = bArr42;
                i35 = i57;
                bArr32 = bArr53;
                i31 = i42;
                b12 = 0;
            }
            i28 = i35;
            bArr29 = bArr34;
            byte b24 = b14;
            byte[] bArr54 = bArr24;
            byte[] bArr55 = bArr26;
            int i99 = i32;
            int i100 = i31;
            byte[] bArr56 = bArr32;
            i11 = i24;
            byte[] bArr57 = bArr31;
            i12 = i25;
            i13 = i27;
            i14 = i26;
            bArr14 = bArr28;
            int i101 = i37;
            if (performGaussianElimination(bArr16, bArr14, i99) == 0) {
                break;
            }
            i32 = i99;
            bArr28 = bArr14;
            bArr31 = bArr57;
            i25 = i12;
            i26 = i14;
            i27 = i13;
            i24 = i11;
            i29 = i101;
            b13 = b24;
            bArr24 = bArr54;
            bArr26 = bArr55;
            bArr32 = bArr56;
            bArr33 = bArr2;
            bArr15 = bArr13;
            i31 = i100;
            b12 = 0;
        }
        int i102 = 0;
        int i103 = 0;
        while (i102 < i13) {
            int i104 = 0;
            int i105 = 0;
            while (i105 < i14) {
                GF16Utils.gf16mMulTo(bArr8[i102][i105], bArr14, i104, bArr29, i103, i12);
                i105++;
                i104 += i11;
            }
            i102++;
            i103 += i11;
        }
        System.arraycopy(bArr14, 0, bArr29, i19, i18);
        GF16.encode(bArr29, bArr, i22);
        System.arraycopy(bArr3, 0, bArr, bArr.length - 16, 16);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        byte[] messageHash = getMessageHash(bArr);
        MapGroup1 mapGroup1 = new MapGroup1(this.params);
        byte[] encoded = this.pubKey.getEncoded();
        byte[] bArrCopyOf = Arrays.copyOf(encoded, 16);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        this.engine.genABQP(mapGroup1, bArrCopyOf);
        byte[][][][] bArr3 = (byte[][][][]) Array.newInstance((Class<?>) Byte.TYPE, this.params.getM(), this.params.getO(), this.params.getO(), this.params.getLsq());
        if ((this.params.getLsq() & 1) == 0) {
            MapGroup1.decodeP(bArrCopyOfRange, 0, bArr3, bArrCopyOfRange.length << 1);
        } else {
            int length = bArrCopyOfRange.length << 1;
            byte[] bArr4 = new byte[length];
            GF16.decode(bArrCopyOfRange, bArr4, length);
            MapGroup1.fillP(bArr4, 0, bArr3, length);
        }
        return verifySignatureCore(messageHash, bArr2, bArrCopyOf, mapGroup1, bArr3);
    }

    public boolean verifySignatureCore(byte[] bArr, byte[] bArr2, byte[] bArr3, MapGroup1 mapGroup1, byte[][][][] bArr4) {
        int lsq = this.params.getLsq();
        int o11 = this.params.getO() * lsq;
        int i11 = (o11 + 1) >>> 1;
        int saltLength = this.params.getSaltLength();
        int m11 = this.params.getM();
        int n11 = this.params.getN() * lsq;
        byte[] bArr5 = new byte[i11];
        createSignedHash(bArr3, bArr3.length, bArr, bArr.length, bArr2, (n11 + 1) >>> 1, saltLength, bArr5, i11);
        if ((o11 & 1) != 0) {
            int i12 = i11 - 1;
            bArr5[i12] = (byte) (bArr5[i12] & 15);
        }
        byte[] bArr6 = new byte[n11];
        GF16.decode(bArr2, 0, bArr6, 0, n11);
        int i13 = m11 * lsq;
        byte[] bArr7 = new byte[i13];
        evaluation(bArr7, mapGroup1, bArr4, bArr6);
        byte[] bArr8 = new byte[i11];
        GF16.encode(bArr7, bArr8, i13);
        return Arrays.areEqual(bArr5, bArr8);
    }
}
