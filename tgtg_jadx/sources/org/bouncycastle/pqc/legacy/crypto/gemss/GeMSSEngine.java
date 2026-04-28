package org.bouncycastle.pqc.legacy.crypto.gemss;

import i4.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.legacy.crypto.gemss.SecretKeyHFE;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class GeMSSEngine {
    final int ACCESS_last_equations8;
    Pointer Buffer_NB_WORD_GFqn;
    Pointer Buffer_NB_WORD_MUL;
    final boolean ENABLED_REMOVE_ODD_DEGREE;
    final int HFEDELTA;
    final int HFEDeg;
    final int HFEDegI;
    final int HFEDegJ;
    final int HFENr8;
    final int HFENr8c;
    int HFE_odd_degree;
    final int HFEm;
    final int HFEmq;
    final int HFEmq8;
    final int HFEmr;
    final int HFEmr8;
    final int HFEn;
    int HFEn1h_rightmost;
    int HFEn_1rightmost;
    final int HFEnq;
    final int HFEnr;
    final int HFEnv;
    final int HFEnvq;
    final int HFEnvr;
    final int HFEnvr8;
    final int HFEv;
    final int HFEvq;
    final int HFEvr;
    int II;
    int KP;
    int KX;
    final int LOST_BITS;
    int LTRIANGULAR_NV_SIZE;
    final int LTRIANGULAR_N_SIZE;
    final long MASK_GF2m;
    final long MASK_GF2n;
    final int MATRIXn_SIZE;
    final int MATRIXnv_SIZE;
    final int MLv_GFqn_SIZE;
    int MQv_GFqn_SIZE;
    final int NB_BYTES_EQUATION;
    final int NB_BYTES_GFqm;
    final int NB_BYTES_GFqn;
    final int NB_BYTES_GFqnv;
    int NB_COEFS_HFEPOLY;
    final int NB_ITE;
    int NB_MONOMIAL_PK;
    int NB_MONOMIAL_VINEGAR;
    int NB_UINT_HFEVPOLY;
    int NB_WORD_GF2m;
    int NB_WORD_GF2nv;
    final int NB_WORD_GF2nvm;
    int NB_WORD_GFqn;
    final int NB_WORD_GFqv;
    int NB_WORD_MMUL;
    final int NB_WORD_MUL;
    final int NB_WORD_UNCOMP_EQ;
    int POW_II;
    final int SIZE_DIGEST;
    final int SIZE_DIGEST_UINT;
    final int SIZE_ROW;
    final int SIZE_SEED_SK;
    final int SIZE_SIGN_UNCOMPRESSED;
    final int Sha3BitStrength;
    final int ShakeBitStrength;
    final int VAL_BITS_M;
    private int buffer;
    Mul_GF2x mul;
    private SecureRandom random;
    Rem_GF2n rem;
    SHA3Digest sha3Digest;
    final int NB_BITS_UINT = 64;
    final int LEN_UNROLLED_64 = 4;

    /* JADX INFO: renamed from: org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams;

        static {
            int[] iArr = new int[FunctionParams.values().length];
            $SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams = iArr;
            try {
                iArr[FunctionParams.N.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams[FunctionParams.NV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams[FunctionParams.V.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams[FunctionParams.M.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum FunctionParams {
        NV,
        V,
        N,
        M
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b3 A[LOOP:0: B:175:0x03ad->B:177:0x03b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c6 A[LOOP:1: B:179:0x03be->B:181:0x03c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b8 A[EDGE_INSN: B:184:0x03b8->B:178:0x03b8 BREAK  A[LOOP:0: B:175:0x03ad->B:177:0x03b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GeMSSEngine(int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine.<init>(int, int, int, int, int, int, int, int):void");
    }

    private void CMP_AND_SWAP_CST_TIME(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        long jCMP_LT_UINT = 0;
        long jORBITS_UINT = 0;
        long j9 = 0;
        for (int i11 = this.NB_WORD_GFqn - 1; i11 > 0; i11--) {
            jORBITS_UINT |= GeMSSUtils.ORBITS_UINT(pointer2.get(i11) ^ pointer.get(i11));
            j9 += jORBITS_UINT;
        }
        int i12 = 0;
        while (true) {
            int i13 = this.NB_WORD_GFqn;
            if (i12 >= i13) {
                pointer3.setRangeFromXorAndMask_xor(pointer, pointer2, -jCMP_LT_UINT, i13);
                return;
            } else {
                jCMP_LT_UINT |= (-GeMSSUtils.NORBITS_UINT(((long) i12) ^ j9)) & GeMSSUtils.CMP_LT_UINT(pointer2.get(i12), pointer.get(i12));
                i12++;
            }
        }
    }

    private void LOOPIR(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12, int i13, int i14, boolean z11) {
        for (int i15 = 0; i15 < i11; i15++) {
            Pointer pointer4 = new Pointer(pointer3);
            int i16 = 1;
            while (i16 <= i12) {
                LOOPJR(pointer, pointer2, pointer4, 64, i14, i16);
                i16++;
            }
            if (z11) {
                LOOPJR(pointer, pointer2, pointer4, i13, i14, i16);
            }
            pointer2.move(i14);
        }
    }

    private void LOOPIR_INIT(Pointer pointer, Pointer pointer2, Pointer pointer3, Pointer pointer4, int i11, int i12) {
        while (i11 < i12) {
            pointer.setRangeClear(0, this.NB_WORD_GFqn);
            pointer2.changeIndex(pointer3);
            Pointer pointer5 = pointer;
            LOOPK_COMPLETE(pointer5, pointer4, pointer2, 0, this.HFEnvq);
            pointer4.move(this.NB_WORD_GF2nv);
            i11++;
            pointer = pointer5;
        }
    }

    private void LOOPIR_LOOPK_COMPLETE(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        while (i11 < i12) {
            LOOPK_COMPLETE(pointer, pointer2, pointer3, 0, this.HFEnvq);
            i11++;
        }
    }

    private void LOOPJR(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12, int i13) {
        int iMin = Math.min(i12, i13);
        pointer.set(0L);
        for (int i14 = 0; i14 < i11; i14++) {
            pointer.setXor(GeMSSUtils.XORBITS_UINT(pointer2.getDotProduct(0, pointer3, 0, iMin)) << i14);
            pointer3.move(i13);
        }
        pointer.moveIncremental();
    }

    private long LOOPJR_NOCST_64(Pointer pointer, PointerUnion pointerUnion, int i11, int i12, long j9, int i13, int i14) {
        while (i11 < i12) {
            if ((1 & j9) != 0) {
                pointer.setXorRange(0, pointerUnion, 0, i14);
            }
            pointerUnion.moveNextBytes(i13);
            j9 >>>= 1;
            i11++;
        }
        return j9;
    }

    private void LOOPJR_UNROLLED_64(Pointer pointer, PointerUnion pointerUnion, int i11, int i12, long j9, int i13, int i14) {
        int i15 = i11;
        long jLOOPJR_NOCST_64 = j9;
        while (i15 < i12 - 3) {
            jLOOPJR_NOCST_64 = LOOPJR_NOCST_64(pointer, pointerUnion, 0, 4, jLOOPJR_NOCST_64, i13, i14);
            i15 += 4;
        }
        LOOPJR_NOCST_64(pointer, pointerUnion, i15, i12, jLOOPJR_NOCST_64, i13, i14);
    }

    private void LOOPKR(Pointer pointer, Pointer pointer2, long j9, int i11, int i12) {
        while (i11 < i12) {
            pointer2.setXorRangeAndMaskMove(pointer, this.NB_WORD_GFqn, -(1 & j9));
            j9 >>>= 1;
            i11++;
        }
    }

    private void LOOPK_COMPLETE(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        for (int i13 = i11; i13 < i12; i13++) {
            LOOPKR(pointer3, pointer, pointer2.get(i13), 0, 64);
        }
        if (this.HFEnvr != 0) {
            LOOPKR(pointer3, pointer, pointer2.get(i12), 0, this.HFEnvr);
        }
        pointer.move(this.NB_WORD_GFqn);
    }

    private int chooseRootHFE_gf2nx(Pointer pointer, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        GeMSSEngine geMSSEngine;
        SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar2;
        Pointer pointer3 = new Pointer(this.SIZE_DIGEST_UINT);
        Pointer pointer4 = new Pointer(((this.HFEDeg << 1) - 1) * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer((this.HFEDeg + 1) * this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer(this.NB_WORD_GFqn);
        pointer6.setRangeFromXor(complete_sparse_monic_gf2nxVar.poly, pointer2, this.NB_WORD_GFqn);
        int i11 = this.HFEDeg;
        if (i11 <= 34 || (this.HFEn > 196 && i11 < 256)) {
            geMSSEngine = this;
            complete_sparse_monic_gf2nxVar2 = complete_sparse_monic_gf2nxVar;
            frobeniusMap_multisqr_HFE_gf2nx(pointer4, complete_sparse_monic_gf2nxVar2, pointer6);
        } else {
            int i12 = 2 << this.HFEDegI;
            pointer4.set(this.NB_WORD_GFqn * i12, 1L);
            geMSSEngine = this;
            geMSSEngine.divsqr_r_HFE_cstdeg_gf2nx(pointer4, i12, i12, this.HFEDeg, complete_sparse_monic_gf2nxVar, pointer6);
            complete_sparse_monic_gf2nxVar2 = complete_sparse_monic_gf2nxVar;
            geMSSEngine.for_sqr_divsqr(pointer4, geMSSEngine.HFEDegI + 1, geMSSEngine.HFEn, complete_sparse_monic_gf2nxVar2, pointer6);
        }
        pointer4.setXor(geMSSEngine.NB_WORD_GFqn, 1L);
        int index = pointer5.getIndex();
        pointer5.copyFrom(complete_sparse_monic_gf2nxVar2.poly, geMSSEngine.NB_WORD_GFqn);
        for_copy_move(pointer5, complete_sparse_monic_gf2nxVar2);
        pointer5.changeIndex(index);
        pointer5.set(geMSSEngine.HFEDeg * geMSSEngine.NB_WORD_GFqn, 1L);
        pointer5.setXorRange(pointer2, geMSSEngine.NB_WORD_GFqn);
        int iGcd_gf2nx = gcd_gf2nx(pointer5, geMSSEngine.HFEDeg, pointer4, pointer4.getD_for_not0_or_plus(geMSSEngine.NB_WORD_GFqn, geMSSEngine.HFEDeg - 1));
        if (geMSSEngine.buffer != 0) {
            pointer4.swap(pointer5);
        }
        if (pointer4.is0_gf2n(0, geMSSEngine.NB_WORD_GFqn) == 0) {
            return 0;
        }
        convMonic_gf2nx(pointer5, iGcd_gf2nx);
        Pointer pointer7 = new Pointer(geMSSEngine.NB_WORD_GFqn * iGcd_gf2nx);
        findRootsSplit_gf2nx(pointer7, pointer5, iGcd_gf2nx);
        if (iGcd_gf2nx == 1) {
            pointer.copyFrom(pointer7, geMSSEngine.NB_WORD_GFqn);
            return iGcd_gf2nx;
        }
        fast_sort_gf2n(pointer7, iGcd_gf2nx);
        getSHA3Hash(pointer3, 0, geMSSEngine.Sha3BitStrength >>> 3, pointer2.toBytes(geMSSEngine.NB_BYTES_GFqn), 0, geMSSEngine.NB_BYTES_GFqn, new byte[geMSSEngine.Sha3BitStrength >>> 3]);
        int iRemainderUnsigned = (int) remainderUnsigned(pointer3.get(), iGcd_gf2nx);
        int i13 = this.NB_WORD_GFqn;
        pointer.copyFrom(0, pointer7, iRemainderUnsigned * i13, i13);
        return iGcd_gf2nx;
    }

    private void choose_LOOPJR(Pointer pointer, PointerUnion pointerUnion, int i11, long j9, int i12, int i13) {
        int i14 = this.HFEnvr;
        if (i14 < 8) {
            LOOPJR_NOCST_64(pointer, pointerUnion, i11, i14, j9, i12, i13);
        } else {
            LOOPJR_UNROLLED_64(pointer, pointerUnion, i11, i14, j9, i12, i13);
        }
    }

    private long convMQ_last_uncompressL_gf2(Pointer pointer, PointerUnion pointerUnion) {
        GeMSSEngine geMSSEngine;
        Pointer pointer2;
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        int i11 = this.HFEnv - 1;
        int i12 = i11 >>> 6;
        int i13 = i11 & 63;
        int iFor_setpk2_end_move_plus = for_setpk2_end_move_plus(pointer, pointerUnion2, i12);
        if (i13 != 0) {
            int i14 = i13 + 1;
            geMSSEngine = this;
            pointer2 = pointer;
            iFor_setpk2_end_move_plus = geMSSEngine.setPk2Value(pointer2, pointerUnion2, iFor_setpk2_end_move_plus, i12, i14);
        } else {
            geMSSEngine = this;
            pointer2 = pointer;
        }
        int i15 = geMSSEngine.HFEnv;
        int i16 = geMSSEngine.LOST_BITS;
        int i17 = i15 - i16;
        int i18 = i17 >>> 6;
        int i19 = i17 & 63;
        if (i19 != 0) {
            int i21 = iFor_setpk2_end_move_plus & 63;
            int i22 = geMSSEngine.NB_MONOMIAL_PK;
            if (i21 != 0) {
                if (((((i22 - i16) + 7) >>> 3) & 7) != 0) {
                    int i23 = (i15 - ((64 - (((i22 - i16) - geMSSEngine.HFEnvr) & 63)) & 63)) >>> 6;
                    pointer2.setRangePointerUnion_Check(pointerUnion2, i23, iFor_setpk2_end_move_plus);
                    pointer2.set(i23, pointerUnion2.getWithCheck(i23) >>> i21);
                    if (i23 < i18) {
                        int i24 = i23 + 1;
                        long withCheck = pointerUnion2.getWithCheck(i24);
                        pointer2.setXor(i23, withCheck << (64 - i21));
                        pointer2.set(i24, withCheck >>> i21);
                    } else if (i19 + i21 > 64) {
                        pointer2.setXor(i23, pointerUnion2.getWithCheck(i23 + 1) << (64 - i21));
                    }
                } else {
                    pointer2.setRangePointerUnion(pointerUnion2, i18, i21);
                    pointer2.set(i18, pointerUnion2.get(i18) >>> i21);
                    if (i19 + i21 > 64) {
                        pointer2.setXor(i18, pointerUnion2.get(i18 + 1) << (64 - i21));
                    }
                }
            } else if (((((i22 - i16) + 7) >>> 3) & 7) != 0) {
                pointer2.setRangePointerUnion(pointerUnion2, i18);
                pointer2.set(i18, pointerUnion2.getWithCheck(i18));
            } else {
                i18++;
                pointer2.setRangePointerUnion(pointerUnion2, i18);
            }
        } else if (i18 != 0) {
            int i25 = iFor_setpk2_end_move_plus & 63;
            if (i25 == 0) {
                pointer2.setRangePointerUnion(pointerUnion2, i18);
            } else if (((((geMSSEngine.NB_MONOMIAL_PK - i16) + 7) >>> 3) & 7) != 0) {
                int i26 = i18 - 1;
                pointer2.setRangePointerUnion(pointerUnion2, i26, i25);
                pointer2.set(i26, pointerUnion2.get(i26) >>> i25);
                pointer2.setXor(i26, pointerUnion2.getWithCheck(i18) << (64 - i25));
            } else {
                pointer2.setRangePointerUnion(pointerUnion2, i18, i25);
            }
        }
        return pointerUnion.get() & 1;
    }

    private long convMQ_uncompressL_gf2(Pointer pointer, PointerUnion pointerUnion) {
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        int iFor_setpk2_end_move_plus = for_setpk2_end_move_plus(pointer, pointerUnion2, this.HFEnvq);
        int i11 = this.HFEnvr;
        if (i11 != 0) {
            setPk2Value(pointer, pointerUnion2, iFor_setpk2_end_move_plus, this.HFEnvq, i11 + 1);
        }
        return pointerUnion.get() & 1;
    }

    private void convMonic_gf2nx(Pointer pointer, int i11) {
        Pointer pointer2 = new Pointer(this.NB_WORD_GFqn);
        int index = pointer.getIndex();
        pointer.move(this.NB_WORD_GFqn * i11);
        inv_gf2n(pointer2, pointer, 0);
        pointer.set1_gf2n(0, this.NB_WORD_GFqn);
        while (true) {
            i11--;
            if (i11 == -1) {
                pointer.changeIndex(index);
                return;
            } else {
                pointer.move(-this.NB_WORD_GFqn);
                mul_gf2n(pointer, pointer, pointer2);
            }
        }
    }

    private void copy_for_casct(Pointer pointer, Pointer pointer2, Pointer pointer3, Pointer pointer4, Pointer pointer5, int i11, int i12) {
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        while (i11 > 1) {
            pointer4.changeIndex(pointer3, (i12 + i11) * this.NB_WORD_GFqn);
            CMP_AND_SWAP_CST_TIME(pointer, pointer4, pointer5);
            i11 >>>= 1;
        }
    }

    private void copy_move_matrix_move(Pointer pointer, Pointer pointer2, int i11) {
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        pointer2.move(this.NB_WORD_GFqn);
        pointer.setXorMatrix(pointer2, this.NB_WORD_GFqn, i11);
        pointer2.move((this.HFEv + 1) * this.NB_WORD_GFqn);
    }

    private void div_q_monic_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer();
        Pointer pointer4 = new Pointer();
        while (i11 >= i12) {
            int iSearchDegree = pointer.searchDegree(i11, i12, this.NB_WORD_GFqn);
            if (iSearchDegree < i12) {
                return;
            }
            pointer3.changeIndex(pointer, this.NB_WORD_GFqn * iSearchDegree);
            int iMax = Math.max(0, (i12 << 1) - iSearchDegree);
            pointer4.changeIndex(pointer, ((iSearchDegree - i12) + iMax) * this.NB_WORD_GFqn);
            for_mul_rem_xor_move(pointer4, pointer3, pointer2, iMax, i12);
            i11 = iSearchDegree - 1;
        }
    }

    private void div_r_monic_cst_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer();
        int index = pointer.getIndex();
        pointer.move(this.NB_WORD_GFqn * i11);
        while (i11 >= i12) {
            pointer3.changeIndex(pointer, (-i12) * this.NB_WORD_GFqn);
            Pointer pointer4 = pointer;
            for_mul_rem_xor_move(pointer3, pointer4, pointer2, 0, i12);
            pointer4.move(-this.NB_WORD_GFqn);
            i11--;
            pointer = pointer4;
        }
        pointer.changeIndex(index);
    }

    private int div_r_monic_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer();
        Pointer pointer4 = new Pointer();
        while (i11 >= i12) {
            i11 = pointer.searchDegree(i11, i12, this.NB_WORD_GFqn);
            if (i11 < i12) {
                break;
            }
            pointer3.changeIndex(pointer, this.NB_WORD_GFqn * i11);
            pointer4.changeIndex(pointer3, (-i12) * this.NB_WORD_GFqn);
            for_mul_rem_xor_move(pointer4, pointer3, pointer2, 0, i12);
            i11--;
        }
        if (i11 == -1) {
            i11++;
        }
        return pointer.searchDegree(i11, 1, this.NB_WORD_GFqn);
    }

    private void divsqr_r_HFE_cstdeg_gf2nx(Pointer pointer, int i11, int i12, int i13, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        Pointer pointer3 = new Pointer(pointer, i11 * this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer();
        while (i12 >= i13) {
            pointer4.changeIndex(pointer3, (-this.HFEDeg) * this.NB_WORD_GFqn);
            mul_rem_xorrange(pointer4, pointer3, pointer2);
            for (int i14 = 1; i14 < this.NB_COEFS_HFEPOLY; i14++) {
                pointer4.move(complete_sparse_monic_gf2nxVar.L[i14]);
                mul_rem_xorrange(pointer4, pointer3, complete_sparse_monic_gf2nxVar.poly, this.NB_WORD_GFqn * i14);
            }
            pointer3.move(-this.NB_WORD_GFqn);
            i12--;
        }
    }

    private void dotProduct_gf2n(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        Pointer pointer4 = new Pointer(this.NB_WORD_MUL);
        int index = pointer2.getIndex();
        int index2 = pointer3.getIndex();
        mul_move(pointer4, pointer2, pointer3);
        for_mul_xorrange_move(pointer4, pointer2, pointer3, i11 - 1);
        rem_gf2n(pointer, 0, pointer4);
        pointer2.changeIndex(index);
        pointer3.changeIndex(index2);
    }

    private void dotproduct_move_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        dotProduct_gf2n(pointer, pointer3, pointer2, i11);
        pointer.move(this.NB_WORD_GFqn);
        pointer2.move((i11 + this.HFEv + 1) * this.NB_WORD_GFqn);
    }

    private void evalMQShybrid8_uncomp_nocst_gf2_m(Pointer pointer, Pointer pointer2, PointerUnion pointerUnion, PointerUnion pointerUnion2) {
        PointerUnion pointerUnion3 = new PointerUnion(pointerUnion2);
        evalMQSnocst8_quo_gf2(pointer, pointer2, pointerUnion);
        if (this.HFEmr < 8) {
            pointer.set(this.HFEmq, 0L);
        }
        for (int i11 = this.HFEmr - this.HFEmr8; i11 < this.HFEmr; i11++) {
            pointer.setXor(this.HFEmq, evalMQnocst_unrolled_no_simd_gf2(pointer2, pointerUnion3) << i11);
            pointerUnion3.move(this.NB_WORD_UNCOMP_EQ);
        }
    }

    private void evalMQSnocst8_quo_gf2(Pointer pointer, Pointer pointer2, PointerUnion pointerUnion) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        GeMSSEngine geMSSEngine = this;
        Pointer pointer3 = pointer;
        int i16 = geMSSEngine.HFEnv;
        int i17 = geMSSEngine.HFEm;
        if ((i17 >>> 3) != 0) {
            i17 = (i17 >>> 3) << 3;
        }
        int i18 = i17;
        int i19 = (i18 & 7) != 0 ? (i18 >>> 3) + 1 : i18 >>> 3;
        int i21 = (i19 >>> 3) + ((i19 & 7) != 0 ? 1 : 0);
        int i22 = i16;
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        System.arraycopy(pointerUnion2.getArray(), 0, pointer3.getArray(), pointer3.getIndex(), i21);
        pointerUnion2.moveNextBytes(i19);
        int i23 = 0;
        while (true) {
            i11 = geMSSEngine.HFEnvq;
            if (i23 >= i11) {
                break;
            }
            int i24 = i22;
            long j9 = pointer2.get(i23);
            int i25 = 0;
            while (i25 < 64) {
                if ((j9 & 1) != 0) {
                    pointer3.setXorRange(0, pointerUnion2, 0, i21);
                    pointerUnion2.moveNextBytes(i19);
                    i13 = i21;
                    i14 = i19;
                    int i26 = i25;
                    i12 = i26;
                    geMSSEngine.LOOPJR_UNROLLED_64(pointer3, pointerUnion2, i26 + 1, 64, j9 >>> 1, i14, i13);
                    int i27 = i23 + 1;
                    while (true) {
                        i15 = geMSSEngine.HFEnvq;
                        if (i27 >= i15) {
                            break;
                        }
                        geMSSEngine.LOOPJR_UNROLLED_64(pointer, pointerUnion2, 0, 64, pointer2.get(i27), i14, i13);
                        i27++;
                    }
                    if (geMSSEngine.HFEnvr != 0) {
                        pointer3 = pointer;
                        geMSSEngine.choose_LOOPJR(pointer3, pointerUnion2, 0, pointer2.get(i15), i14, i13);
                        i14 = i14;
                    } else {
                        pointer3 = pointer;
                    }
                } else {
                    i12 = i25;
                    i13 = i21;
                    i14 = i19;
                    pointerUnion2.moveNextBytes(i24 * i14);
                }
                j9 >>>= 1;
                i25 = i12 + 1;
                i24--;
                i19 = i14;
                i21 = i13;
            }
            i23++;
            i21 = i21;
            i22 = i24;
        }
        int i28 = i21;
        int i29 = i19;
        if (geMSSEngine.HFEnvr != 0) {
            int i31 = i22;
            long j11 = pointer2.get(i11);
            int i32 = 0;
            while (i32 < geMSSEngine.HFEnvr) {
                if ((j11 & 1) != 0) {
                    pointer3.setXorRange(0, pointerUnion2, 0, i28);
                    pointerUnion2.moveNextBytes(i29);
                    int i33 = i29;
                    geMSSEngine.choose_LOOPJR(pointer3, pointerUnion2, i32 + 1, j11 >>> 1, i33, i28);
                    i29 = i33;
                } else {
                    pointerUnion2.moveNextBytes(i31 * i29);
                }
                j11 >>>= 1;
                i32++;
                i31--;
                geMSSEngine = this;
            }
        }
        int i34 = i18 & 63;
        if (i34 != 0) {
            pointer3.setAnd(i28 - 1, (1 << i34) - 1);
        }
    }

    private long evalMQnocst_unrolled_no_simd_gf2(Pointer pointer, PointerUnion pointerUnion) {
        int i11;
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        long j9 = pointer.get();
        long dotProduct = 0;
        for (int i12 = 0; i12 < 64; i12++) {
            if ((1 & (j9 >>> i12)) != 0) {
                dotProduct ^= pointerUnion2.get(i12) & j9;
            }
        }
        pointerUnion2.move(64);
        int i13 = 1;
        while (true) {
            int i14 = this.NB_WORD_GF2nv;
            if (i13 >= i14) {
                return GeMSSUtils.XORBITS_UINT(dotProduct);
            }
            int i15 = i13 + 1;
            if (i14 != i15 || (i11 = this.HFEnvr) == 0) {
                i11 = 64;
            }
            long j11 = pointer.get(i13);
            for (int i16 = 0; i16 < i11; i16++) {
                if (((j11 >>> i16) & 1) != 0) {
                    dotProduct ^= pointerUnion2.getDotProduct(0, pointer, 0, i15);
                }
                pointerUnion2.move(i15);
            }
            i13 = i15;
        }
    }

    private void findRootsSplit_gf2nx(Pointer pointer, Pointer pointer2, int i11) {
        int i12;
        int iGcd_gf2nx;
        int i13;
        if (i11 == 1) {
            pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
            return;
        }
        if ((this.HFEn & 1) != 0 && i11 == 2) {
            findRootsSplit2_HT_gf2nx(pointer, pointer2);
            return;
        }
        int i14 = (i11 << 1) - 1;
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn * i14);
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn * i11);
        int i15 = i11 + 1;
        Pointer pointer5 = new Pointer(this.NB_WORD_GFqn * i15);
        Pointer pointer6 = new Pointer(this.NB_WORD_GFqn);
        while (true) {
            pointer3.setRangeClear(0, this.NB_WORD_GFqn * i14);
            pointer4.setRangeClear(0, this.NB_WORD_GFqn * i11);
            do {
                pointer4.fillRandom(this.NB_WORD_GFqn, this.random, this.NB_BYTES_GFqn);
                pointer4.setAnd((this.NB_WORD_GFqn << 1) - 1, this.MASK_GF2n);
                i12 = this.NB_WORD_GFqn;
            } while (pointer4.is0_gf2n(i12, i12) != 0);
            pointer5.copyFrom(pointer2, this.NB_WORD_GFqn * i15);
            traceMap_gf2nx(pointer4, pointer3, pointer5, i11);
            iGcd_gf2nx = gcd_gf2nx(pointer5, i11, pointer4, pointer4.searchDegree(i11 - 1, 1, this.NB_WORD_GFqn));
            i13 = this.buffer;
            if (iGcd_gf2nx != 0 && iGcd_gf2nx != i11) {
                break;
            }
        }
        if (i13 != 0) {
            pointer4.swap(pointer5);
        }
        inv_gf2n(pointer6, pointer5, this.NB_WORD_GFqn * iGcd_gf2nx);
        int i16 = this.NB_WORD_GFqn;
        pointer5.set1_gf2n(iGcd_gf2nx * i16, i16);
        for_mul(pointer5, pointer6, iGcd_gf2nx - 1);
        div_q_monic_gf2nx(pointer2, i11, pointer5, iGcd_gf2nx);
        findRootsSplit_gf2nx(pointer, pointer5, iGcd_gf2nx);
        findRootsSplit_gf2nx(new Pointer(pointer, this.NB_WORD_GFqn * iGcd_gf2nx), new Pointer(pointer2, this.NB_WORD_GFqn * iGcd_gf2nx), i11 - iGcd_gf2nx);
    }

    private void for_and_xor_shift_incre_move(Pointer pointer, int i11, int i12) {
        long j9 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            pointer.setAnd(j9);
            pointer.setXor(1 << i13);
            j9 = (j9 << 1) + 1;
            pointer.move(i11);
        }
    }

    private void for_casct_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        int i13 = this.NB_WORD_GFqn * i12;
        int i14 = 0;
        while (i14 < i11) {
            CMP_AND_SWAP_CST_TIME(pointer, pointer2, pointer3);
            pointer.move(i13);
            pointer2.move(i13);
            i14 += i12;
        }
    }

    private void for_copy_move(Pointer pointer, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar) {
        for (int i11 = 1; i11 < this.NB_COEFS_HFEPOLY; i11++) {
            pointer.move(complete_sparse_monic_gf2nxVar.L[i11]);
            Pointer pointer2 = complete_sparse_monic_gf2nxVar.poly;
            int i12 = this.NB_WORD_GFqn;
            pointer.copyFrom(0, pointer2, i11 * i12, i12);
        }
    }

    private void for_mul(Pointer pointer, Pointer pointer2, int i11) {
        Pointer pointer3 = new Pointer(pointer, this.NB_WORD_GFqn * i11);
        while (i11 != -1) {
            mul_gf2n(pointer3, pointer3, pointer2);
            pointer3.move(-this.NB_WORD_GFqn);
            i11--;
        }
    }

    private void for_mul_rem_xor_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        int i13 = this.NB_WORD_GFqn * i11;
        while (i11 < i12) {
            mul_rem_xorrange(pointer, pointer2, pointer3, i13);
            pointer.move(this.NB_WORD_GFqn);
            i11++;
            i13 += this.NB_WORD_GFqn;
        }
    }

    private int for_setPK(byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        bArr[i11] = (byte) (bArr2[i12] & 3);
        int pk2 = 2;
        for (int i14 = 2; i14 < i13; i14++) {
            int i15 = this.HFEnv;
            pk2 = setPK(bArr, bArr2, i14, i11, i12, pk2, i15 - 1, i15 - i14);
        }
        return pk2;
    }

    private int for_setpk2_end_move_plus(Pointer pointer, PointerUnion pointerUnion, int i11) {
        int i12 = 1;
        int i13 = 0;
        while (i13 < i11) {
            Pointer pointer2 = pointer;
            PointerUnion pointerUnion2 = pointerUnion;
            int pk2Value = setPk2Value(pointer2, pointerUnion2, i12, i13, 64);
            setPk2_endValue(pointer2, pointerUnion2, pk2Value, i13);
            i13++;
            pointerUnion2.move(i13);
            pointer2.move(i13);
            i12 = pk2Value + (i13 << 6);
            pointer = pointer2;
            pointerUnion = pointerUnion2;
        }
        return i12;
    }

    private void for_sqr_divsqr(Pointer pointer, int i11, int i12, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        while (i11 < i12) {
            sqr_gf2nx(pointer, this.HFEDeg - 1);
            int i13 = this.HFEDeg;
            divsqr_r_HFE_cstdeg_gf2nx(pointer, (i13 - 1) << 1, (i13 - 1) << 1, i13, complete_sparse_monic_gf2nxVar, pointer2);
            i11++;
        }
    }

    private void frobeniusMap_multisqr_HFE_gf2nx(Pointer pointer, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        Pointer pointer3 = new Pointer();
        Pointer pointer4 = new Pointer(this.HFEDeg * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer();
        Pointer pointer6 = new Pointer(((this.KX * this.HFEDeg) + this.POW_II) * this.NB_WORD_GFqn);
        int i11 = (this.POW_II * this.KP) - this.HFEDeg;
        Pointer pointer7 = new Pointer(pointer6, this.NB_WORD_GFqn * i11);
        pointer7.copyFrom(pointer2, this.NB_WORD_GFqn);
        for_copy_move(pointer7, complete_sparse_monic_gf2nxVar);
        int i12 = i11 - 1;
        divsqr_r_HFE_cstdeg_gf2nx(pointer6, this.HFEDeg + i12, i12, 0, complete_sparse_monic_gf2nxVar, pointer2);
        int i13 = this.KP + 1;
        while (true) {
            int i14 = this.HFEDeg;
            if (i13 >= i14) {
                break;
            }
            pointer7.changeIndex(pointer6, i14 * this.NB_WORD_GFqn);
            pointer7.setRangeClear(0, this.POW_II * this.NB_WORD_GFqn);
            int i15 = this.POW_II;
            int i16 = this.NB_WORD_GFqn;
            pointer7.copyFrom(i15 * i16, pointer6, 0, this.HFEDeg * i16);
            pointer6.changeIndex(pointer7);
            int i17 = this.POW_II;
            divsqr_r_HFE_cstdeg_gf2nx(pointer6, (i17 - 1) + this.HFEDeg, i17 - 1, 0, complete_sparse_monic_gf2nxVar, pointer2);
            i13++;
        }
        pointer6.indexReset();
        int i18 = (1 << this.HFEDegI) - this.KP;
        int i19 = this.HFEDeg;
        int i21 = this.NB_WORD_GFqn;
        pointer.copyFrom(0, pointer6, i18 * i19 * i21, i19 * i21);
        int i22 = 0;
        while (true) {
            int i23 = this.HFEn;
            int i24 = this.HFEDegI;
            int i25 = this.II;
            if (i22 >= ((i23 - i24) - i25) / i25) {
                for_sqr_divsqr(pointer, 0, (i23 - i24) % i25, complete_sparse_monic_gf2nxVar, pointer2);
                return;
            }
            loop_sqr(pointer4, pointer);
            for (int i26 = 1; i26 < this.II; i26++) {
                loop_sqr(pointer4, pointer4);
            }
            pointer5.changeIndex(pointer4, this.KP * this.NB_WORD_GFqn);
            pointer7.changeIndex(pointer6);
            pointer3.changeIndex(pointer);
            for (int i27 = 0; i27 < this.HFEDeg; i27++) {
                mul_gf2n(pointer3, pointer7, pointer5);
                pointer3.move(this.NB_WORD_GFqn);
                pointer7.move(this.NB_WORD_GFqn);
            }
            for (int i28 = this.KP + 1; i28 < this.HFEDeg; i28++) {
                pointer5.move(this.NB_WORD_GFqn);
                pointer3.changeIndex(pointer);
                for (int i29 = 0; i29 < this.HFEDeg; i29++) {
                    mul_rem_xorrange(pointer3, pointer7, pointer5);
                    pointer3.move(this.NB_WORD_GFqn);
                    pointer7.move(this.NB_WORD_GFqn);
                }
            }
            for (int i31 = 0; i31 < this.KP; i31++) {
                int i32 = this.POW_II * i31;
                int i33 = this.NB_WORD_GFqn;
                pointer.setXorRange(i32 * i33, pointer4, i31 * i33, i33);
            }
            i22++;
        }
    }

    private int gcd_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        int iDiv_r_monic_gf2nx;
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        this.buffer = 0;
        int i13 = i11;
        Pointer pointer4 = pointer;
        Pointer pointer5 = pointer2;
        while (true) {
            int i14 = i13;
            if (i12 == 0) {
                return i14;
            }
            if ((i12 << 1) > i14) {
                iDiv_r_monic_gf2nx = div_r_gf2nx(pointer4, i14, pointer5, i12);
            } else {
                inv_gf2n(pointer3, pointer5, this.NB_WORD_GFqn * i12);
                int i15 = this.NB_WORD_GFqn;
                pointer5.set1_gf2n(i12 * i15, i15);
                for_mul(pointer5, pointer3, i12 - 1);
                iDiv_r_monic_gf2nx = div_r_monic_gf2nx(pointer4, i14, pointer5, i12);
            }
            this.buffer = 1 - this.buffer;
            Pointer pointer6 = pointer4;
            pointer4 = pointer5;
            pointer5 = pointer6;
            i13 = i12;
            i12 = iDiv_r_monic_gf2nx;
        }
    }

    private void getSHA3Hash(Pointer pointer, int i11, int i12, byte[] bArr, int i13, int i14, byte[] bArr2) {
        this.sha3Digest.update(bArr, i13, i14);
        this.sha3Digest.doFinal(bArr2, 0);
        pointer.fill(i11, bArr2, 0, i12);
    }

    private void initListDifferences_gf2nx(int[] iArr) {
        iArr[1] = this.NB_WORD_GFqn;
        int arrayL = 2;
        int i11 = 0;
        while (i11 < this.HFEDegI) {
            if (!this.ENABLED_REMOVE_ODD_DEGREE || (1 << i11) + 1 <= this.HFE_odd_degree) {
                iArr[arrayL] = this.NB_WORD_GFqn;
                arrayL = setArrayL(iArr, arrayL + 1, 0, i11);
            } else {
                if (i11 != 0) {
                    iArr[arrayL] = this.NB_WORD_GFqn << 1;
                    arrayL++;
                }
                arrayL = setArrayL(iArr, arrayL, 1, i11);
            }
            i11++;
        }
        int i12 = this.HFEDegJ;
        if (i12 != 0) {
            if (!this.ENABLED_REMOVE_ODD_DEGREE || (1 << i11) + 1 <= this.HFE_odd_degree) {
                iArr[arrayL] = this.NB_WORD_GFqn;
                setArrayL(iArr, arrayL + 1, 0, i12 - 1);
            } else {
                iArr[arrayL] = this.NB_WORD_GFqn << 1;
                setArrayL(iArr, arrayL + 1, 1, i12 - 1);
            }
        }
    }

    private void inv_gf2n(Pointer pointer, Pointer pointer2, int i11) {
        int index = pointer2.getIndex();
        pointer2.move(i11);
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        for (int i12 = this.HFEn_1rightmost - 1; i12 != -1; i12--) {
            int i13 = (this.HFEn - 1) >>> (i12 + 1);
            sqr_gf2n(pointer3, pointer);
            for (int i14 = 1; i14 < i13; i14++) {
                sqr_gf2n(pointer3, pointer3);
            }
            mul_gf2n(pointer, pointer, pointer3);
            if ((((this.HFEn - 1) >>> i12) & 1) != 0) {
                sqr_gf2n(pointer3, pointer);
                mul_gf2n(pointer, pointer2, pointer3);
            }
        }
        sqr_gf2n(pointer, pointer);
        pointer2.changeIndex(index);
    }

    private void loop_sqr(Pointer pointer, Pointer pointer2) {
        for (int i11 = 0; i11 < this.HFEDeg; i11++) {
            int i12 = this.NB_WORD_GFqn;
            sqr_gf2n(pointer, i11 * i12, pointer2, i12 * i11);
        }
    }

    private int loop_xor_loop_move_xorandmask_move(Pointer pointer, Pointer pointer2, Pointer pointer3, Pointer pointer4, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 0;
        int i17 = i11;
        while (i16 < i13) {
            pointer.setXor(i12, 1 << i16);
            pointer2.changeIndex(pointer);
            pointer3.changeIndex(pointer4);
            for (int i18 = i17; i18 < i14; i18++) {
                pointer2.move(i15);
                pointer3.move((i18 >>> 6) + 1);
                pointer2.setXorRangeAndMask(pointer, i12 + 1, -((pointer3.get() >>> i16) & 1));
            }
            pointer.move(i15);
            pointer4.move(i12 + 1);
            i16++;
            i17++;
        }
        return i17;
    }

    private void mulMatricesLU_gf2(Pointer pointer, Pointer pointer2, Pointer pointer3, FunctionParams functionParams) {
        int i11;
        int i12;
        int i13;
        boolean z11;
        int index = pointer.getIndex();
        int i14 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        if (i14 == 1) {
            int i15 = this.HFEnq;
            i11 = this.HFEnr;
            i12 = i15;
            i13 = 1;
            z11 = true;
        } else {
            if (i14 != 2) {
                a.f("Invalid parameter for MULMATRICESLU_GF2");
                return;
            }
            int i16 = this.HFEnvq;
            i11 = this.HFEnvr;
            i12 = i16;
            i13 = 1;
            z11 = i11 != 0;
        }
        int i17 = i11;
        Pointer pointer4 = new Pointer(pointer2);
        int i18 = i13;
        while (true) {
            int i19 = i17;
            if (i18 > i12) {
                LOOPIR(pointer, pointer4, pointer3, i17, i12, i19, i18, z11);
                pointer.changeIndex(index);
                return;
            } else {
                LOOPIR(pointer, pointer4, pointer3, 64, i12, i19, i18, z11);
                i18++;
                i17 = i19;
            }
        }
    }

    private void precSignHFE(SecretKeyHFE secretKeyHFE, Pointer[] pointerArr, byte[] bArr) {
        precSignHFESeed(secretKeyHFE, bArr);
        initListDifferences_gf2nx(secretKeyHFE.F_struct.L);
        Pointer pointer = new Pointer(secretKeyHFE.F_HFEv);
        Pointer pointer2 = new Pointer(this.NB_COEFS_HFEPOLY * this.NB_WORD_GFqn);
        Pointer pointer3 = new Pointer(pointer, this.MQv_GFqn_SIZE);
        pointerArr[0] = pointer3;
        pointer.changeIndex(pointer3, this.MLv_GFqn_SIZE);
        Pointer pointer4 = new Pointer(pointer2, this.NB_WORD_GFqn * 2);
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i11 >= this.HFEDegI) {
                break;
            }
            if ((1 << i11) + 1 <= this.HFE_odd_degree || !this.ENABLED_REMOVE_ODD_DEGREE) {
                i12 = 0;
            }
            int i13 = i11 - i12;
            pointer4.copyFrom(pointer, this.NB_WORD_GFqn * i13);
            pointer.move(this.NB_WORD_GFqn * i13);
            pointer4.move(i13 * this.NB_WORD_GFqn);
            i11++;
            pointerArr[i11] = new Pointer(pointer);
            pointer.move(this.MLv_GFqn_SIZE);
            pointer4.move(this.NB_WORD_GFqn);
        }
        int i14 = this.HFEDegJ;
        if (i14 != 0) {
            pointer4.copyFrom(pointer, (i14 - ((1 << i11) + 1 > this.HFE_odd_degree ? 1 : 0)) * this.NB_WORD_GFqn);
        }
        secretKeyHFE.F_struct.poly = new Pointer(pointer2);
    }

    private void precSignHFESeed(SecretKeyHFE secretKeyHFE, byte[] bArr) {
        int i11 = this.NB_UINT_HFEVPOLY + ((this.LTRIANGULAR_NV_SIZE + this.LTRIANGULAR_N_SIZE) << 1);
        secretKeyHFE.sk_uncomp = new Pointer(this.MATRIXnv_SIZE + i11 + this.MATRIXn_SIZE);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(this.ShakeBitStrength);
        sHAKEDigest.update(bArr, 0, this.SIZE_SEED_SK);
        int i12 = i11 << 3;
        byte[] bArr2 = new byte[i12];
        sHAKEDigest.doFinal(bArr2, 0, i12);
        secretKeyHFE.sk_uncomp.fill(0, bArr2, 0, i12);
        Pointer pointer = new Pointer(secretKeyHFE.sk_uncomp, i11);
        secretKeyHFE.S = pointer;
        secretKeyHFE.T = new Pointer(pointer, this.MATRIXnv_SIZE);
        Pointer pointer2 = new Pointer(secretKeyHFE.sk_uncomp);
        secretKeyHFE.F_HFEv = pointer2;
        cleanMonicHFEv_gf2nx(pointer2);
        Pointer pointer3 = new Pointer(secretKeyHFE.sk_uncomp, this.NB_UINT_HFEVPOLY);
        Pointer pointer4 = new Pointer(pointer3, this.LTRIANGULAR_NV_SIZE);
        FunctionParams functionParams = FunctionParams.NV;
        cleanLowerMatrix(pointer3, functionParams);
        cleanLowerMatrix(pointer4, functionParams);
        mulMatricesLU_gf2(secretKeyHFE.S, pointer3, pointer4, functionParams);
        pointer3.move(this.LTRIANGULAR_NV_SIZE << 1);
        pointer4.changeIndex(pointer3, this.LTRIANGULAR_N_SIZE);
        FunctionParams functionParams2 = FunctionParams.N;
        cleanLowerMatrix(pointer3, functionParams2);
        cleanLowerMatrix(pointer4, functionParams2);
        mulMatricesLU_gf2(secretKeyHFE.T, pointer3, pointer4, functionParams2);
    }

    private void rem_gf2n(Pointer pointer, int i11, Pointer pointer2) {
        this.rem.rem_gf2n(pointer.array, i11 + pointer.getIndex(), pointer2.array);
    }

    private static long remainderUnsigned(long j9, long j11) {
        return (j9 <= 0 || j11 <= 0) ? new BigInteger(1, Pack.longToBigEndian(j9)).mod(new BigInteger(1, Pack.longToBigEndian(j11))).longValue() : j9 % j11;
    }

    private int setArrayL(int[] iArr, int i11, int i12, int i13) {
        while (i12 < i13) {
            iArr[i11] = this.NB_WORD_GFqn << i12;
            i12++;
            i11++;
        }
        return i11;
    }

    private int setPK(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, int i15, int i16) {
        while (i15 >= i16) {
            int i17 = (i14 >>> 3) + i12;
            bArr[i17] = (byte) (bArr[i17] ^ (((bArr2[(i11 >>> 3) + i13] >>> (i11 & 7)) & 1) << (i14 & 7)));
            i11 += i15;
            i15--;
            i14++;
        }
        this.buffer = i11;
        return i14;
    }

    private int setPk2Value(Pointer pointer, PointerUnion pointerUnion, int i11, int i12, int i13) {
        for (int i14 = 1; i14 < i13; i14++) {
            int i15 = i11 & 63;
            if (i15 != 0) {
                pointer.setRangePointerUnion(pointerUnion, i12, i15);
                pointer.set(i12, pointerUnion.get(i12) >>> i15);
                int i16 = i15 + i14;
                if (i16 > 64) {
                    pointer.setXor(i12, pointerUnion.get(i12 + 1) << (64 - i15));
                }
                if (i16 >= 64) {
                    pointerUnion.moveIncremental();
                }
            } else {
                pointer.setRangePointerUnion(pointerUnion, i12 + 1);
            }
            pointerUnion.move(i12);
            pointer.setAnd(i12, (1 << i14) - 1);
            pointer.move(i12 + 1);
            i11 += (i12 << 6) + i14;
        }
        return i11;
    }

    private void setPk2_endValue(Pointer pointer, PointerUnion pointerUnion, int i11, int i12) {
        int i13 = i11 & 63;
        int i14 = i12 + 1;
        if (i13 != 0) {
            pointer.setRangePointerUnion(pointerUnion, i14, i13);
        } else {
            pointer.setRangePointerUnion(pointerUnion, i14);
        }
    }

    private void special_buffer(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        int i11;
        int index = pointer2.getIndex();
        pointer2.move(((this.HFEv + 1) * this.NB_WORD_GFqn) << 1);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        pointer.move(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(pointer2, (this.HFEv + 2) * this.NB_WORD_GFqn);
        int i12 = 2;
        while (i12 < this.SIZE_ROW - 1) {
            copy_move_matrix_move(pointer, pointer4, i12 - 1);
            i12++;
        }
        if (this.ENABLED_REMOVE_ODD_DEGREE) {
            while (i12 < this.SIZE_ROW - 1) {
                copy_move_matrix_move(pointer, pointer4, i12 - 2);
                i12++;
            }
        }
        pointer.set1_gf2n(0, this.NB_WORD_GFqn);
        pointer.setXorMatrix(pointer4, this.NB_WORD_GFqn, this.HFEDegJ);
        for (int i13 = 0; i13 < this.HFEn - 1; i13++) {
            mul_gf2n(pointer, pointer3, pointer2);
            pointer.move(this.NB_WORD_GFqn);
            pointer4.changeIndex(pointer2, (this.HFEv + 2) * this.NB_WORD_GFqn);
            int i14 = 2;
            while (i14 < this.HFEDegI) {
                dotproduct_move_move(pointer, pointer4, pointer3, i14);
                i14++;
            }
            if (this.ENABLED_REMOVE_ODD_DEGREE) {
                pointer3.move(this.NB_WORD_GFqn);
                while (i14 < this.SIZE_ROW - 1) {
                    dotproduct_move_move(pointer, pointer4, pointer3, i14 - 1);
                    i14++;
                }
                pointer3.move(-this.NB_WORD_GFqn);
            }
            int i15 = this.HFEDegJ;
            if (i15 == 0) {
                pointer.copyFrom(pointer3, this.NB_WORD_GFqn);
                pointer.move(this.NB_WORD_GFqn);
                i11 = this.SIZE_ROW;
            } else {
                dotProduct_gf2n(pointer, pointer3, pointer4, i15);
                pointer3.move(this.HFEDegJ * this.NB_WORD_GFqn);
                pointer.setXorRange_SelfMove(pointer3, this.NB_WORD_GFqn);
                i11 = this.SIZE_ROW - this.HFEDegJ;
            }
            pointer3.move(i11 * this.NB_WORD_GFqn);
        }
        pointer.indexReset();
        pointer2.changeIndex(index);
        pointer3.indexReset();
    }

    private void sqr_gf2n(Pointer pointer, Pointer pointer2) {
        this.mul.sqr_gf2x(this.Buffer_NB_WORD_MUL.array, pointer2.array, pointer2.f33654cp);
        this.rem.rem_gf2n(pointer.array, pointer.f33654cp, this.Buffer_NB_WORD_MUL.array);
    }

    private void sqr_gf2nx(Pointer pointer, int i11) {
        int i12 = this.NB_WORD_GFqn * i11;
        int index = pointer.getIndex();
        pointer.move(i12);
        Pointer pointer2 = new Pointer(pointer, i12);
        for (int i13 = 0; i13 < i11; i13++) {
            sqr_gf2n(pointer2, pointer);
            pointer.move(-this.NB_WORD_GFqn);
            pointer2.move(-this.NB_WORD_GFqn);
            pointer2.setRangeClear(0, this.NB_WORD_GFqn);
            pointer2.move(-this.NB_WORD_GFqn);
        }
        sqr_gf2n(pointer, pointer);
        pointer.changeIndex(index);
    }

    private void traceMap_gf2nx(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        int i12;
        int i13 = 1;
        while (true) {
            i12 = 1 << i13;
            if (i12 >= i11) {
                break;
            }
            int i14 = this.NB_WORD_GFqn;
            sqr_gf2n(pointer, i14 << i13, pointer, i14 << (i13 - 1));
            i13++;
        }
        if (i13 < this.HFEn) {
            int i15 = this.NB_WORD_GFqn;
            sqr_gf2n(pointer2, i15 << i13, pointer, i15 << (i13 - 1));
            div_r_monic_cst_gf2nx(pointer2, i12, pointer3, i11);
            pointer.setXorRange(pointer2, this.NB_WORD_GFqn * i11);
            for (int i16 = i13 + 1; i16 < this.HFEn; i16++) {
                int i17 = i11 - 1;
                sqr_gf2nx(pointer2, i17);
                div_r_monic_cst_gf2nx(pointer2, i17 << 1, pointer3, i11);
                pointer.setXorRange(pointer2, this.NB_WORD_GFqn * i11);
            }
        }
    }

    private void uncompress_signHFE(Pointer pointer, byte[] bArr) {
        PointerUnion pointerUnion = new PointerUnion(pointer);
        int i11 = (1 << this.HFEnvr8) - 1;
        pointerUnion.fillBytes(0, bArr, 0, this.NB_BYTES_GFqnv);
        if (this.HFEnvr8 != 0) {
            pointerUnion.setAndByte(this.NB_BYTES_GFqnv - 1, i11);
        }
        int i12 = this.HFEnv;
        pointerUnion.moveNextBytes((this.NB_WORD_GF2nv << 3) + (this.HFEmq8 & 7));
        for (int i13 = 1; i13 < this.NB_ITE; i13++) {
            int i14 = i12 & 7;
            int iMin = Math.min(this.HFEDELTA + this.HFEv, (8 - i14) & 7);
            if (i14 != 0) {
                pointerUnion.setXorByte(((bArr[i12 >>> 3] & 255) >>> i14) << this.HFEmr8);
                int i15 = iMin - this.VAL_BITS_M;
                if (i15 >= 0) {
                    pointerUnion.moveNextByte();
                }
                if (i15 > 0) {
                    int i16 = i12 + this.VAL_BITS_M;
                    pointerUnion.setXorByte((bArr[i16 >>> 3] & 255) >>> (i16 & 7));
                    i12 = i16 + i15;
                } else {
                    i12 += iMin;
                }
            }
            int i17 = (this.HFEDELTA + this.HFEv) - iMin;
            int i18 = (this.HFEm + iMin) & 7;
            if (i18 != 0) {
                for (int i19 = 0; i19 < ((i17 - 1) >>> 3); i19++) {
                    int i21 = i12 >>> 3;
                    pointerUnion.setXorByte((bArr[i21] & 255) << i18);
                    pointerUnion.moveNextByte();
                    pointerUnion.setXorByte((bArr[i21] & 255) >>> (8 - i18));
                    i12 += 8;
                }
                int i22 = i12 >>> 3;
                pointerUnion.setXorByte((bArr[i22] & 255) << i18);
                pointerUnion.moveNextByte();
                int i23 = ((i17 + 7) & 7) + 1;
                int i24 = 8 - i18;
                if (i23 > i24) {
                    pointerUnion.setByte((bArr[i22] & 255) >>> i24);
                    pointerUnion.moveNextByte();
                }
                i12 += i23;
            } else {
                for (int i25 = 0; i25 < ((i17 + 7) >>> 3); i25++) {
                    pointerUnion.setByte(bArr[i12 >>> 3]);
                    i12 += 8;
                    pointerUnion.moveNextByte();
                }
                i12 -= (8 - (i17 & 7)) & 7;
            }
            if (this.HFEnvr8 != 0) {
                pointerUnion.setAndByte(-1, i11);
            }
            pointerUnion.moveNextBytes(((8 - (this.NB_BYTES_GFqnv & 7)) & 7) + (this.HFEmq8 & 7));
        }
    }

    private void vmpv_xorrange_move(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        vecMatProduct(pointer, pointer2, new Pointer(pointer3, this.NB_WORD_GFqn), FunctionParams.V);
        pointer.setXorRange(pointer3, this.NB_WORD_GFqn);
        pointer3.move(this.MLv_GFqn_SIZE);
    }

    public void changeVariablesMQS64_gf2(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer();
        int i11 = this.HFEnv;
        Pointer pointer4 = new Pointer(i11 * i11 * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(pointer, this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer(pointer4);
        Pointer pointer7 = new Pointer(pointer2);
        int i12 = 0;
        for (int i13 = 0; i13 < this.HFEnv; i13++) {
            pointer3.changeIndex(pointer5);
            for (int i14 = 0; i14 < this.HFEnvq; i14++) {
                for (int i15 = 0; i15 < 64; i15++) {
                    Pointer pointer8 = pointer6;
                    Pointer pointer9 = pointer3;
                    LOOPKR(pointer9, pointer8, pointer7.get() >>> i15, i15, 64);
                    pointer3 = pointer9;
                    pointer6 = pointer8;
                    LOOPK_COMPLETE(pointer6, pointer7, pointer3, 1, this.HFEnvq - i14);
                }
                pointer7.moveIncremental();
            }
            if (this.HFEnvr != 0) {
                for (int i16 = 0; i16 < this.HFEnvr; i16++) {
                    Pointer pointer10 = pointer6;
                    Pointer pointer11 = pointer3;
                    LOOPKR(pointer11, pointer10, pointer7.get() >>> i16, i16, this.HFEnvr);
                    pointer3 = pointer11;
                    pointer6 = pointer10;
                    pointer6.move(this.NB_WORD_GFqn);
                }
                pointer7.moveIncremental();
            }
        }
        pointer5.changeIndex(pointer4);
        pointer6.changeIndex(pointer, this.NB_WORD_GFqn);
        Pointer pointer12 = new Pointer(pointer2);
        int i17 = 0;
        while (i17 < this.HFEnvq) {
            int i18 = 0;
            while (i18 < 64) {
                pointer7.changeIndex(pointer12);
                Pointer pointer13 = pointer3;
                Pointer pointer14 = pointer5;
                Pointer pointer15 = pointer7;
                LOOPIR_INIT(pointer6, pointer13, pointer14, pointer15, i18, 64);
                Pointer pointer16 = pointer6;
                Pointer pointer17 = pointer14;
                pointer3 = pointer13;
                int i19 = i18;
                for (int i21 = i17 + 1; i21 < this.HFEnvq; i21++) {
                    Pointer pointer18 = pointer3;
                    Pointer pointer19 = pointer17;
                    Pointer pointer20 = pointer16;
                    LOOPIR_INIT(pointer20, pointer18, pointer19, pointer15, 0, 64);
                    pointer16 = pointer20;
                    pointer17 = pointer19;
                    pointer3 = pointer18;
                }
                int i22 = this.HFEnvr;
                if (i22 != 0) {
                    Pointer pointer21 = pointer3;
                    Pointer pointer22 = pointer17;
                    Pointer pointer23 = pointer16;
                    LOOPIR_INIT(pointer23, pointer21, pointer22, pointer15, 0, i22);
                    pointer16 = pointer23;
                    pointer17 = pointer22;
                    pointer3 = pointer21;
                }
                pointer17.changeIndex(pointer3);
                pointer12.move(this.NB_WORD_GF2nv);
                i18 = i19 + 1;
                pointer5 = pointer17;
                pointer6 = pointer16;
                pointer7 = pointer15;
            }
            i17++;
            pointer6 = pointer6;
        }
        Pointer pointer24 = pointer6;
        Pointer pointer25 = pointer5;
        Pointer pointer26 = pointer7;
        if (this.HFEnvr != 0) {
            int i23 = 0;
            while (i23 < this.HFEnvr) {
                pointer26.changeIndex(pointer12);
                pointer3.changeIndex(pointer25);
                Pointer pointer27 = pointer3;
                Pointer pointer28 = pointer25;
                Pointer pointer29 = pointer24;
                LOOPIR_INIT(pointer29, pointer27, pointer28, pointer26, i23, this.HFEnvr);
                pointer3 = pointer27;
                pointer28.changeIndex(pointer3);
                pointer12.move(this.NB_WORD_GF2nv);
                i23++;
                pointer24 = pointer29;
                pointer25 = pointer28;
            }
        }
        Pointer pointer30 = pointer25;
        Pointer pointer31 = pointer24;
        pointer30.changeIndex(pointer4);
        pointer31.changeIndex(pointer, this.NB_WORD_GFqn);
        pointer26.changeIndex(pointer2);
        for (int i24 = 0; i24 < this.HFEnvq; i24++) {
            int i25 = 0;
            while (i25 < 64) {
                pointer31.move(this.NB_WORD_GFqn);
                pointer30.move(this.HFEnv * this.NB_WORD_GFqn);
                pointer3.changeIndex(pointer30);
                int i26 = i25 + 1;
                Pointer pointer32 = pointer26;
                LOOPIR_LOOPK_COMPLETE(pointer31, pointer32, pointer3, i26, 64);
                pointer26 = pointer32;
                for (int i27 = i24 + 1; i27 < this.HFEnvq; i27++) {
                    Pointer pointer33 = pointer26;
                    LOOPIR_LOOPK_COMPLETE(pointer31, pointer33, pointer3, 0, 64);
                    pointer26 = pointer33;
                }
                int i28 = this.HFEnvr;
                if (i28 != 0) {
                    Pointer pointer34 = pointer26;
                    LOOPIR_LOOPK_COMPLETE(pointer31, pointer34, pointer3, 0, i28);
                    pointer26 = pointer34;
                }
                pointer26.move(this.NB_WORD_GF2nv);
                i25 = i26;
            }
        }
        if (this.HFEnvr != 0) {
            while (i12 < this.HFEnvr - 1) {
                pointer31.move(this.NB_WORD_GFqn);
                pointer30.move(this.HFEnv * this.NB_WORD_GFqn);
                pointer3.changeIndex(pointer30);
                i12++;
                Pointer pointer35 = pointer26;
                LOOPIR_LOOPK_COMPLETE(pointer31, pointer35, pointer3, i12, this.HFEnvr);
                pointer35.move(this.NB_WORD_GF2nv);
                pointer26 = pointer35;
            }
        }
        pointer.indexReset();
        pointer2.indexReset();
    }

    public void cleanLowerMatrix(Pointer pointer, FunctionParams functionParams) {
        int i11;
        int i12;
        int i13 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            i11 = this.HFEnq;
            i12 = this.HFEnr;
        } else if (i13 != 2) {
            a.f("");
            return;
        } else {
            i11 = this.HFEnvq;
            i12 = this.HFEnvr;
        }
        Pointer pointer2 = new Pointer(pointer);
        while (i14 <= i11) {
            for_and_xor_shift_incre_move(pointer2, i14, 64);
            pointer2.moveIncremental();
            i14++;
        }
        for_and_xor_shift_incre_move(pointer2, i14, i12);
    }

    public void cleanMonicHFEv_gf2nx(Pointer pointer) {
        int i11 = this.NB_WORD_GFqn - 1;
        while (i11 < this.NB_UINT_HFEVPOLY) {
            pointer.setAnd(i11, this.MASK_GF2n);
            i11 += this.NB_WORD_GFqn;
        }
    }

    public void compress_signHFE(byte[] bArr, Pointer pointer) {
        int i11;
        byte[] bytes = pointer.toBytes(pointer.getLength() << 3);
        System.arraycopy(bytes, 0, bArr, 0, this.NB_BYTES_GFqnv);
        int i12 = this.HFEnv;
        int i13 = (this.NB_WORD_GF2nv << 3) + (this.HFEmq8 & 7);
        for (int i14 = 1; i14 < this.NB_ITE; i14++) {
            int i15 = i12 & 7;
            int iMin = Math.min(this.HFEDELTA + this.HFEv, (8 - i15) & 7);
            if (i15 != 0) {
                int i16 = this.HFEmr8;
                if (i16 != 0) {
                    int i17 = i12 >>> 3;
                    bArr[i17] = (byte) ((((bytes[i13] & 255) >>> i16) << i15) ^ bArr[i17]);
                    int i18 = this.VAL_BITS_M;
                    int i19 = iMin - i18;
                    if (i19 >= 0) {
                        i13++;
                    }
                    if (i19 > 0) {
                        int i21 = i12 + i18;
                        int i22 = i21 >>> 3;
                        bArr[i22] = (byte) (bArr[i22] ^ ((bytes[i13] & 255) << (i21 & 7)));
                        i12 = i21 + i19;
                    }
                } else {
                    int i23 = i12 >>> 3;
                    bArr[i23] = (byte) (((bytes[i13] & 255) << i15) ^ bArr[i23]);
                }
                i12 += iMin;
            }
            int i24 = (this.HFEDELTA + this.HFEv) - iMin;
            int i25 = (this.HFEm + iMin) & 7;
            if (i25 != 0) {
                for (int i26 = 0; i26 < ((i24 - 1) >>> 3); i26++) {
                    int i27 = (bytes[i13] & 255) >>> i25;
                    i13++;
                    bArr[i12 >>> 3] = (byte) (i27 ^ ((bytes[i13] & 255) << (8 - i25)));
                    i12 += 8;
                }
                int i28 = i12 >>> 3;
                i11 = i13 + 1;
                byte b8 = (byte) ((bytes[i13] & 255) >>> i25);
                bArr[i28] = b8;
                int i29 = ((i24 + 7) & 7) + 1;
                int i31 = 8 - i25;
                if (i29 > i31) {
                    bArr[i28] = (byte) (((byte) ((bytes[i11] & 255) << i31)) ^ b8);
                    i11 = i13 + 2;
                }
                i12 += i29;
            } else {
                int i32 = 0;
                while (i32 < ((i24 + 7) >>> 3)) {
                    bArr[i12 >>> 3] = bytes[i13];
                    i12 += 8;
                    i32++;
                    i13++;
                }
                i12 -= (8 - (i24 & 7)) & 7;
                i11 = i13;
            }
            i13 = ((8 - (this.NB_BYTES_GFqnv & 7)) & 7) + (this.HFEmq8 & 7) + i11;
        }
    }

    public void convMQS_one_eq_to_hybrid_rep8_comp_gf2(byte[] bArr, PointerUnion pointerUnion, byte[] bArr2) {
        convMQ_UL_gf2(bArr, bArr2, this.HFEmr8);
        int bytesMove = 0;
        for (int i11 = 0; i11 < this.NB_MONOMIAL_PK; i11++) {
            bytesMove = pointerUnion.toBytesMove(bArr, bytesMove, this.HFEmq8);
            if (this.HFEmr8 != 0) {
                pointerUnion.moveNextByte();
            }
        }
    }

    public void convMQS_one_eq_to_hybrid_rep8_uncomp_gf2(byte[] bArr, PointerUnion pointerUnion, byte[] bArr2) {
        int i11 = this.HFEmr8 - 1;
        convMQ_UL_gf2(bArr, bArr2, i11);
        int i12 = this.ACCESS_last_equations8;
        int i13 = this.NB_BYTES_EQUATION;
        int i14 = i12 + (i11 * i13);
        int i15 = i13 * i11;
        int iFor_setPK = for_setPK(bArr, bArr2, i14, i15, this.HFEnv);
        int i16 = this.HFEnv;
        setPK(bArr, bArr2, i16, i14, i15, iFor_setPK, i16 - 1, this.LOST_BITS);
        int i17 = this.buffer;
        long j9 = 0;
        for (int i18 = this.LOST_BITS - 1; i18 >= 0; i18--) {
            j9 ^= ((long) ((bArr2[(i17 >>> 3) + i15] >>> (i17 & 7)) & 1)) << ((this.LOST_BITS - 1) - i18);
            i17 += i18;
        }
        int i19 = this.ACCESS_last_equations8 - 1;
        for (int i21 = 0; i21 < this.HFEmr8 - 1; i21++) {
            i19 += this.NB_BYTES_EQUATION;
            bArr[i19] = (byte) (bArr[i19] ^ (((byte) (j9 >>> (this.HFENr8c * i21))) << this.HFENr8));
        }
        pointerUnion.indexReset();
        int bytesMove = 0;
        for (int i22 = 0; i22 < this.NB_MONOMIAL_PK; i22++) {
            bytesMove = pointerUnion.toBytesMove(bArr, bytesMove, this.HFEmq8);
            pointerUnion.moveNextByte();
        }
    }

    public void convMQS_one_to_last_mr8_equations_gf2(byte[] bArr, PointerUnion pointerUnion) {
        int i11;
        pointerUnion.moveNextBytes(this.HFEmq8);
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        int i12 = this.NB_MONOMIAL_PK >>> 3;
        int i13 = 0;
        for (int i14 = 0; i14 < this.HFEmr8; i14++) {
            pointerUnion2.changeIndex(pointerUnion);
            int i15 = 0;
            while (true) {
                if (i15 >= i12) {
                    break;
                }
                int i16 = (pointerUnion2.getByte() >>> i14) & 1;
                pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                for (int i17 = 1; i17 < 8; i17++) {
                    i16 ^= ((pointerUnion2.getByte() >>> i14) & 1) << i17;
                    pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                }
                bArr[i13] = (byte) i16;
                i15++;
                i13++;
            }
            if (this.HFENr8 != 0) {
                long withCheck = (pointerUnion2.getWithCheck() >>> i14) & 1;
                pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                for (i11 = 1; i11 < this.HFENr8; i11++) {
                    withCheck ^= ((pointerUnion2.getWithCheck() >>> i14) & 1) << i11;
                    pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                }
                bArr[i13] = (byte) withCheck;
                i13++;
            }
        }
    }

    public void convMQ_UL_gf2(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.ACCESS_last_equations8;
            int i14 = this.NB_BYTES_EQUATION;
            for_setPK(bArr, bArr2, (i12 * i14) + i13, i12 * i14, this.HFEnv + 1);
        }
    }

    public int crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long j9;
        int i11;
        int i12;
        long j11;
        PointerUnion pointerUnion = new PointerUnion(bArr);
        int i13 = 0;
        long jConvMQ_uncompressL_gf2 = 0;
        if (this.HFENr8 == 0 || this.HFEmr8 <= 1) {
            j9 = 0;
        } else {
            PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
            pointerUnion2.moveNextBytes(this.ACCESS_last_equations8 - 1);
            j9 = 0;
            for (int i14 = 0; i14 < this.HFEmr8 - 1; i14++) {
                pointerUnion2.moveNextBytes(this.NB_BYTES_EQUATION);
                j9 ^= ((((long) pointerUnion2.getByte()) & 255) >>> this.HFENr8) << (this.HFENr8c * i14);
            }
        }
        int i15 = this.HFEmr8;
        if (i15 == 0) {
            Pointer pointer = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
            Pointer pointer2 = new Pointer(new Pointer(this.NB_WORD_GF2nv));
            Pointer pointer3 = new Pointer(this.SIZE_DIGEST_UINT);
            pointer.fill(0, bArr3, 0, this.NB_BYTES_GFqnv);
            getSHA3Hash(pointer3, 0, 64, bArr2, 0, bArr2.length, new byte[64]);
            evalMQSnocst8_quo_gf2(pointer2, pointer, pointerUnion);
            return pointer2.isEqual_nocst_gf2(pointer3, this.NB_WORD_GF2m);
        }
        Pointer pointer4 = new Pointer((this.NB_WORD_UNCOMP_EQ * i15) + 1);
        PointerUnion pointerUnion3 = new PointerUnion(pointerUnion);
        while (true) {
            int i16 = this.HFEmr8 - 1;
            i11 = this.ACCESS_last_equations8;
            if (i13 >= i16) {
                break;
            }
            pointerUnion3.setByteIndex((this.NB_BYTES_EQUATION * i13) + i11);
            jConvMQ_uncompressL_gf2 ^= convMQ_uncompressL_gf2(new Pointer(pointer4, (this.NB_WORD_UNCOMP_EQ * i13) + 1), pointerUnion3) << i13;
            i13++;
        }
        pointerUnion3.setByteIndex((this.NB_BYTES_EQUATION * i13) + i11);
        long jConvMQ_last_uncompressL_gf2 = jConvMQ_uncompressL_gf2 ^ (convMQ_last_uncompressL_gf2(new Pointer(pointer4, (this.NB_WORD_UNCOMP_EQ * i13) + 1), pointerUnion3) << i13);
        if (this.HFENr8 != 0) {
            int i17 = this.HFEnvr;
            if (i17 == 0) {
                i12 = (i13 + 1) * this.NB_WORD_UNCOMP_EQ;
                j11 = j9 << (64 - this.LOST_BITS);
            } else {
                int i18 = this.LOST_BITS;
                if (i17 > i18) {
                    i12 = (i13 + 1) * this.NB_WORD_UNCOMP_EQ;
                    j11 = j9 << (i17 - i18);
                } else {
                    int i19 = this.NB_WORD_UNCOMP_EQ;
                    int i21 = i13 + 1;
                    if (i17 == i18) {
                        pointer4.set(i21 * i19, j9);
                    } else {
                        pointer4.setXor((i19 * i21) - 1, j9 << (64 - (i18 - i17)));
                        pointer4.set(i21 * this.NB_WORD_UNCOMP_EQ, j9 >>> (this.LOST_BITS - this.HFEnvr));
                    }
                }
            }
            pointer4.setXor(i12, j11);
        }
        pointer4.set(jConvMQ_last_uncompressL_gf2 << (this.HFEmr - this.HFEmr8));
        return sign_openHFE_huncomp_pk(bArr2, bArr2.length, bArr3, pointerUnion, new PointerUnion(pointer4));
    }

    public int div_r_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(pointer);
        inv_gf2n(pointer4, pointer2, this.NB_WORD_GFqn * i12);
        while (i11 >= i12) {
            i11 = pointer.searchDegree(i11, i12, this.NB_WORD_GFqn);
            if (i11 < i12) {
                break;
            }
            pointer5.changeIndex((i11 - i12) * this.NB_WORD_GFqn);
            mul_gf2n(pointer3, pointer, this.NB_WORD_GFqn * i11, pointer4);
            for_mul_rem_xor_move(pointer5, pointer3, pointer2, 0, i12);
            i11--;
        }
        return pointer.searchDegree(i11, 1, this.NB_WORD_GFqn);
    }

    public void evalHFEv_gf2nx(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        int i11;
        Pointer pointer4 = new Pointer(this.NB_WORD_MUL);
        Pointer pointer5 = new Pointer(this.NB_WORD_MUL);
        int i12 = 1;
        Pointer pointer6 = new Pointer((this.HFEDegI + 1) * this.NB_WORD_GFqn);
        Pointer pointer7 = new Pointer();
        int index = pointer2.getIndex();
        Pointer pointer8 = new Pointer(this.NB_WORD_GFqv);
        Pointer pointer9 = new Pointer(pointer6, this.NB_WORD_GFqn);
        pointer6.copyFrom(pointer3, this.NB_WORD_GFqn);
        pointer6.setAnd(this.NB_WORD_GFqn - 1, this.MASK_GF2n);
        int i13 = 1;
        while (true) {
            int i14 = this.HFEDegI;
            i11 = this.NB_WORD_GFqn;
            if (i13 > i14) {
                break;
            }
            sqr_gf2n(pointer9, 0, pointer9, -i11);
            pointer9.move(this.NB_WORD_GFqn);
            i13++;
        }
        int i15 = this.NB_WORD_GFqv;
        if (i11 + i15 != this.NB_WORD_GF2nv) {
            i15--;
        }
        int i16 = i15;
        pointer8.setRangeRotate(0, pointer3, i11 - 1, i16, 64 - this.HFEnr);
        int i17 = this.NB_WORD_GFqn;
        if (this.NB_WORD_GFqv + i17 != this.NB_WORD_GF2nv) {
            pointer8.set(i16, pointer3.get((i17 - 1) + i16) >>> this.HFEnr);
        }
        evalMQSv_unrolled_gf2(pointer4, pointer8, pointer2);
        pointer2.move(this.MQv_GFqn_SIZE);
        vmpv_xorrange_move(pointer5, pointer8, pointer2);
        pointer9.changeIndex(pointer6);
        mul_xorrange(pointer4, pointer9, pointer5);
        while (true) {
            int i18 = this.HFEDegI;
            vmpv_xorrange_move(pointer5, pointer8, pointer2);
            if (i12 >= i18) {
                break;
            }
            int i19 = this.NB_WORD_GFqn;
            pointer5.setRangeClear(i19, this.NB_WORD_MMUL - i19);
            pointer7.changeIndex(pointer9);
            for_mul_xorrange_move(pointer5, pointer2, pointer7, i12);
            rem_gf2n(pointer5, 0, pointer5);
            mul_xorrange(pointer4, pointer7, pointer5);
            i12++;
        }
        pointer7.changeIndex(pointer9);
        int i21 = this.HFEDegJ;
        int i22 = this.NB_WORD_GFqn;
        if (i21 != 0) {
            pointer5.setRangeClear(i22, this.NB_WORD_MMUL - i22);
            for_mul_xorrange_move(pointer5, pointer2, pointer7, this.HFEDegJ);
            pointer5.setXorRange(pointer7, this.NB_WORD_GFqn);
            rem_gf2n(pointer5, 0, pointer5);
        } else {
            pointer5.setRangeFromXor(pointer5, pointer7, i22);
        }
        pointer9.move(this.HFEDegI * this.NB_WORD_GFqn);
        mul_xorrange(pointer4, pointer9, pointer5);
        rem_gf2n(pointer, 0, pointer4);
        pointer2.changeIndex(index);
    }

    public void evalMQSv_unrolled_gf2(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        Pointer pointer4 = new Pointer(this.HFEv);
        int i11 = this.HFEv;
        int i12 = i11 >>> 6;
        int i13 = i11 & 63;
        int i14 = this.HFEn;
        int i15 = 0;
        int i16 = (i14 >>> 6) + ((i14 & 63) != 0 ? 1 : 0);
        int index = pointer3.getIndex();
        Pointer pointer5 = new Pointer(i16);
        int i17 = 0;
        int range_xi = 0;
        while (i17 < i12) {
            range_xi = pointer4.setRange_xi(pointer2.get(i17), range_xi, 64);
            i17++;
        }
        if (i13 != 0) {
            pointer4.setRange_xi(pointer2.get(i17), range_xi, i13);
        }
        pointer.copyFrom(pointer3, i16);
        pointer3.move(i16);
        while (i15 < this.HFEv) {
            pointer5.copyFrom(pointer3, i16);
            pointer3.move(i16);
            int i18 = i15 + 1;
            int i19 = i18;
            while (i19 < this.HFEv - 3) {
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19));
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19 + 1));
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19 + 2));
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19 + 3));
                i19 += 4;
            }
            while (i19 < this.HFEv) {
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19));
                i19++;
            }
            pointer.setXorRangeAndMask(pointer5, i16, pointer4.get(i15));
            i15 = i18;
        }
        pointer3.changeIndex(index);
    }

    public void fast_sort_gf2n(Pointer pointer, int i11) {
        int i12;
        Pointer pointer2;
        int i13;
        Pointer pointer3 = pointer;
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer();
        Pointer pointer7 = new Pointer();
        int i14 = i11 - 1;
        int iHighest_One = GeMSSUtils.Highest_One(i14);
        int i15 = iHighest_One;
        while (true) {
            i12 = 0;
            if (i15 <= 1) {
                break;
            }
            int i16 = i15 << 1;
            int i17 = i11 / i16;
            int iMax = Math.max(0, (i11 - (i16 * i17)) - i15);
            pointer6.changeIndex(pointer3);
            pointer7.changeIndex(pointer3, this.NB_WORD_GFqn * i15);
            int i18 = 0;
            while (i18 < i17) {
                for_casct_move(pointer6, pointer7, pointer5, i15, 1);
                int i19 = i15;
                pointer6.move(this.NB_WORD_GFqn * i19);
                pointer7.move(this.NB_WORD_GFqn * i19);
                i18++;
                i15 = i19;
            }
            int i21 = i15;
            for_casct_move(pointer6, pointer7, pointer5, iMax, 1);
            int i22 = iHighest_One;
            while (i22 > i21) {
                while (i12 < i11 - i22) {
                    if ((i12 & i21) == 0) {
                        pointer7.changeIndex(pointer3, (i12 + i21) * this.NB_WORD_GFqn);
                        Pointer pointer8 = pointer5;
                        Pointer pointer9 = pointer3;
                        int i23 = i22;
                        Pointer pointer10 = pointer6;
                        Pointer pointer11 = pointer4;
                        i13 = i12;
                        copy_for_casct(pointer11, pointer7, pointer9, pointer10, pointer8, i23, i13);
                        pointer2 = pointer11;
                        pointer6 = pointer10;
                        i22 = i23;
                        pointer3 = pointer9;
                        pointer5 = pointer8;
                        pointer7.copyFrom(pointer2, this.NB_WORD_GFqn);
                    } else {
                        pointer2 = pointer4;
                        i13 = i12;
                    }
                    i12 = i13 + 1;
                    pointer4 = pointer2;
                }
                i22 >>>= 1;
                pointer4 = pointer4;
            }
            i15 = i21 >>> 1;
        }
        Pointer pointer12 = pointer4;
        pointer6.changeIndex(pointer3);
        pointer7.changeIndex(pointer3, this.NB_WORD_GFqn);
        for_casct_move(pointer6, pointer7, pointer5, i14, 2);
        pointer7.changeIndex(pointer3, this.NB_WORD_GFqn);
        while (iHighest_One > 1) {
            int i24 = i12;
            while (i24 < i11 - iHighest_One) {
                Pointer pointer13 = pointer6;
                Pointer pointer14 = pointer5;
                copy_for_casct(pointer12, pointer7, pointer3, pointer13, pointer14, iHighest_One, i24);
                pointer5 = pointer14;
                pointer7.copyFrom(pointer12, this.NB_WORD_GFqn);
                pointer7.move(this.NB_WORD_GFqn << 1);
                i24 += 2;
                pointer6 = pointer13;
                pointer3 = pointer;
            }
            iHighest_One >>>= 1;
            pointer3 = pointer;
            pointer6 = pointer6;
            i12 = i24;
        }
    }

    public void findRootsSplit2_HT_gf2nx(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
        int index = pointer2.getIndex();
        sqr_gf2n(pointer3, 0, pointer2, this.NB_WORD_GFqn);
        inv_gf2n(pointer, pointer3, 0);
        mul_gf2n(pointer3, pointer2, pointer);
        findRootsSplit_x2_x_c_HT_gf2nx(pointer4, pointer3);
        pointer2.move(this.NB_WORD_GFqn);
        mul_gf2n(pointer, pointer4, pointer2);
        int i11 = this.NB_WORD_GFqn;
        pointer.setRangeFromXor(i11, pointer, 0, pointer2, 0, i11);
        pointer2.changeIndex(index);
    }

    public void findRootsSplit_x2_x_c_HT_gf2nx(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        int i11 = (this.HFEn + 1) >>> 1;
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        int i12 = 1;
        for (int i13 = this.HFEn1h_rightmost; i13 != -1; i13--) {
            int i14 = i12 << 1;
            sqr_gf2n(pointer3, pointer);
            for (int i15 = 1; i15 < i14; i15++) {
                sqr_gf2n(pointer3, pointer3);
            }
            pointer.setXorRange(pointer3, this.NB_WORD_GFqn);
            i12 = i11 >>> i13;
            if ((i12 & 1) != 0) {
                sqr_gf2n(pointer3, pointer);
                sqr_gf2n(pointer, pointer3);
                pointer.setXorRange(pointer2, this.NB_WORD_GFqn);
            }
        }
    }

    public void for_mul_xorrange_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.mul.mul_gf2x_xor(pointer, pointer2, pointer3);
            pointer2.move(this.NB_WORD_GFqn);
            pointer3.move(this.NB_WORD_GFqn);
        }
    }

    public void genSecretMQS_gf2_opt(Pointer pointer, Pointer pointer2) {
        int i11;
        int i12;
        int i13;
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        int i14 = 1;
        Pointer pointer4 = new Pointer((this.HFEv + 1) * (this.HFEDegI + 1) * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(pointer2, this.MQv_GFqn_SIZE);
        for (int i15 = 0; i15 <= this.HFEDegI; i15++) {
            for (int i16 = 0; i16 <= this.HFEv; i16++) {
                int i17 = ((this.HFEDegI + 1) * i16) + i15;
                int i18 = this.NB_WORD_GFqn;
                pointer4.copyFrom(i17 * i18, pointer5, 0, i18);
                pointer5.move(this.NB_WORD_GFqn);
            }
            pointer5.move(this.NB_WORD_GFqn * i15);
        }
        Pointer pointer6 = new Pointer((this.HFEn - 1) * this.SIZE_ROW * this.NB_WORD_GFqn);
        for (int i19 = 1; i19 < this.HFEn; i19++) {
            pointer6.set(i19 >>> 6, 1 << (i19 & 63));
            int i21 = 0;
            while (true) {
                int i22 = this.HFEDegI;
                i13 = this.NB_WORD_GFqn;
                if (i21 < i22) {
                    sqr_gf2n(pointer6, i13, pointer6, 0);
                    pointer6.move(this.NB_WORD_GFqn);
                    i21++;
                }
            }
            pointer6.move(i13);
        }
        pointer6.indexReset();
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        pointer2.move(this.MQv_GFqn_SIZE);
        pointer.move(this.NB_WORD_GFqn);
        Pointer pointer7 = new Pointer(this.HFEDegI * this.HFEn * this.NB_WORD_GFqn);
        special_buffer(pointer7, pointer2, pointer6);
        Pointer pointer8 = new Pointer(pointer7);
        Pointer pointer9 = new Pointer(pointer7);
        pointer.copyFrom(pointer9, this.NB_WORD_GFqn);
        pointer9.move(this.NB_WORD_GFqn);
        pointer.setXorMatrix_NoMove(pointer9, this.NB_WORD_GFqn, this.HFEDegI - 1);
        pointer5.changeIndex(pointer4);
        pointer.setXorMatrix(pointer5, this.NB_WORD_GFqn, this.HFEDegI + 1);
        Pointer pointer10 = new Pointer(pointer6, this.NB_WORD_GFqn);
        int i23 = 1;
        while (i23 < this.HFEn) {
            dotProduct_gf2n(pointer, pointer10, pointer8, this.HFEDegI);
            pointer10.move(this.SIZE_ROW * this.NB_WORD_GFqn);
            pointer.setXorMatrix(pointer9, this.NB_WORD_GFqn, this.HFEDegI);
            i23++;
        }
        while (true) {
            int i24 = this.HFEnv;
            i11 = this.NB_WORD_GFqn;
            if (i23 >= i24) {
                break;
            }
            pointer.copyFrom(pointer5, i11);
            pointer5.move(this.NB_WORD_GFqn);
            pointer.setXorMatrix(pointer5, this.NB_WORD_GFqn, this.HFEDegI);
            i23++;
        }
        Pointer pointer11 = new Pointer(pointer6, i11);
        Pointer pointer12 = new Pointer(this.NB_WORD_MUL);
        int i25 = 1;
        while (i25 < this.HFEn) {
            pointer8.move(this.HFEDegI * this.NB_WORD_GFqn);
            pointer10.changeIndex(pointer11);
            pointer9.changeIndex(pointer8);
            int i26 = i14;
            this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer4, new Pointer(pointer10, -this.NB_WORD_GFqn));
            int i27 = i26;
            while (true) {
                int i28 = this.HFEDegI;
                i12 = this.NB_WORD_GFqn;
                if (i27 > i28) {
                    break;
                }
                int i29 = i25;
                Pointer pointer13 = pointer9;
                pointer3.setRangeFromXor(0, pointer13, 0, pointer4, i27 * i12, i12);
                mul_xorrange(this.Buffer_NB_WORD_MUL, pointer3, pointer10);
                pointer13.move(this.NB_WORD_GFqn);
                pointer10.move(this.NB_WORD_GFqn);
                i27++;
                pointer9 = pointer13;
                pointer12 = pointer12;
                i25 = i29;
            }
            Pointer pointer14 = pointer12;
            int i31 = i25;
            Pointer pointer15 = pointer9;
            pointer10.move(i12);
            rem_gf2n(pointer, 0, this.Buffer_NB_WORD_MUL);
            pointer.move(this.NB_WORD_GFqn);
            int i32 = i31 + 1;
            int i33 = i32;
            while (i33 < this.HFEn) {
                int index = pointer10.getIndex();
                int index2 = pointer8.getIndex();
                int index3 = pointer11.getIndex();
                int index4 = pointer15.getIndex();
                mul_move(pointer14, pointer10, pointer8);
                for_mul_xorrange_move(pointer14, pointer10, pointer8, this.HFEDegI - 1);
                for_mul_xorrange_move(pointer14, pointer11, pointer15, this.HFEDegI);
                rem_gf2n(pointer, 0, pointer14);
                pointer10.changeIndex((this.NB_WORD_GFqn * this.SIZE_ROW) + index);
                pointer8.changeIndex(index2);
                pointer11.changeIndex(index3);
                pointer15.changeIndex((this.HFEDegI * this.NB_WORD_GFqn) + index4);
                pointer.move(this.NB_WORD_GFqn);
                i33++;
                pointer3 = pointer3;
            }
            Pointer pointer16 = pointer3;
            pointer5.changeIndex(pointer4);
            pointer11.move(-this.NB_WORD_GFqn);
            while (i33 < this.HFEnv) {
                pointer5.move((this.HFEDegI + 1) * this.NB_WORD_GFqn);
                dotProduct_gf2n(pointer, pointer11, pointer5, this.HFEDegI + 1);
                pointer.move(this.NB_WORD_GFqn);
                i33++;
            }
            int i34 = this.NB_WORD_GFqn;
            pointer11.move((this.SIZE_ROW * i34) + i34);
            pointer9 = pointer15;
            i14 = i26;
            pointer3 = pointer16;
            i25 = i32;
            pointer12 = pointer14;
        }
        pointer2.move(this.NB_WORD_GFqn - this.MQv_GFqn_SIZE);
        pointer.copyFrom(pointer2, (this.NB_MONOMIAL_VINEGAR - 1) * this.NB_WORD_GFqn);
        pointer.indexReset();
        pointer2.indexReset();
    }

    public int interpolateHFE_FS_ref(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        int i11;
        Pointer pointer4 = new Pointer(this.NB_WORD_GF2nv);
        Pointer pointer5 = new Pointer();
        Pointer pointer6 = new Pointer();
        Pointer pointer7 = new Pointer(this.HFEnv * this.NB_WORD_GFqn);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        Pointer pointer8 = new Pointer(pointer3);
        Pointer pointer9 = new Pointer(pointer7);
        for (int i12 = 0; i12 < this.HFEnv; i12++) {
            evalHFEv_gf2nx(pointer9, pointer2, pointer8);
            pointer9.move(this.NB_WORD_GFqn);
            pointer8.move(this.NB_WORD_GF2nv);
        }
        pointer8.changeIndex(pointer3);
        pointer9.changeIndex(pointer7);
        int i13 = 0;
        while (i13 < this.HFEnv) {
            pointer.move(this.NB_WORD_GFqn);
            pointer9.setXorRange(pointer2, this.NB_WORD_GFqn);
            pointer.copyFrom(pointer9, this.NB_WORD_GFqn);
            pointer5.changeIndex(pointer9);
            pointer6.changeIndex(pointer8);
            i13++;
            int i14 = i13;
            while (true) {
                int i15 = this.HFEnv;
                i11 = this.NB_WORD_GFqn;
                if (i14 < i15) {
                    pointer.move(i11);
                    pointer5.move(this.NB_WORD_GFqn);
                    pointer6.move(this.NB_WORD_GF2nv);
                    pointer4.setRangeFromXor(pointer8, pointer6, this.NB_WORD_GF2nv);
                    evalHFEv_gf2nx(pointer, pointer2, pointer4);
                    pointer.setXorRangeXor(0, pointer9, 0, pointer5, 0, this.NB_WORD_GFqn);
                    i14++;
                }
            }
            pointer9.move(i11);
            pointer8.move(this.NB_WORD_GF2nv);
            pointer = pointer;
        }
        pointer.indexReset();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invMatrixLU_gf2(org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r18, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r19, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r20, org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine.FunctionParams r21) {
        /*
            r17 = this;
            r0 = r17
            r10 = r18
            r1 = r19
            org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r3 = new org.bouncycastle.pqc.legacy.crypto.gemss.Pointer
            r3.<init>(r1)
            org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r4 = new org.bouncycastle.pqc.legacy.crypto.gemss.Pointer
            r4.<init>(r1)
            org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r11 = new org.bouncycastle.pqc.legacy.crypto.gemss.Pointer
            r1 = r20
            r11.<init>(r1)
            int[] r1 = org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine.AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$legacy$crypto$gemss$GeMSSEngine$FunctionParams
            int r2 = r21.ordinal()
            r1 = r1[r2]
            r12 = 0
            r13 = 1
            if (r1 == r13) goto L3c
            r2 = 2
            if (r1 != r2) goto L36
            int r1 = r0.HFEnvq
            int r2 = r0.HFEnv
            int r2 = r2 - r13
            int r5 = r0.NB_WORD_GF2nv
            int r6 = r0.HFEnvr
            int r7 = r0.LTRIANGULAR_NV_SIZE
        L31:
            r14 = r1
            r8 = r2
            r9 = r5
            r15 = r6
            goto L4d
        L36:
            java.lang.String r1 = "Invalid Input"
            i4.a.f(r1)
            return
        L3c:
            int r1 = r0.MATRIXn_SIZE
            r10.setRangeClear(r12, r1)
            int r1 = r0.HFEnq
            int r2 = r0.HFEn
            int r2 = r2 - r13
            int r5 = r0.NB_WORD_GFqn
            int r6 = r0.HFEnr
            int r7 = r0.LTRIANGULAR_N_SIZE
            goto L31
        L4d:
            org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r1 = new org.bouncycastle.pqc.legacy.crypto.gemss.Pointer
            r1.<init>(r10)
            org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r2 = new org.bouncycastle.pqc.legacy.crypto.gemss.Pointer
            r2.<init>(r10)
            r5 = r12
            r6 = r5
        L59:
            if (r6 >= r14) goto L6f
            r16 = r7
            r7 = 64
            r12 = r16
            int r5 = r0.loop_xor_loop_move_xorandmask_move(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r4.moveIncremental()
            int r6 = r6 + 1
            r0 = r17
            r7 = r12
            r12 = 0
            goto L59
        L6f:
            r12 = r7
            r16 = r11
            r10 = 1
            if (r15 <= r13) goto L88
            int r7 = r15 + (-1)
            r0 = r17
            r0.loop_xor_loop_move_xorandmask_move(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            long r3 = r10 << r7
            r1.setXor(r6, r3)
        L82:
            r1.move(r9)
        L85:
            r0 = r16
            goto L8e
        L88:
            if (r15 != r13) goto L85
            r1.set(r6, r10)
            goto L82
        L8e:
            r0.move(r12)
        L91:
            if (r8 <= 0) goto Lbd
            int r3 = r8 >>> 6
            int r3 = (-1) - r3
            r0.move(r3)
            int r3 = -r9
            r1.move(r3)
            r3 = r18
            r2.changeIndex(r3)
            r4 = 0
        La4:
            if (r4 >= r8) goto Lba
            int r5 = r4 >>> 6
            long r5 = r0.get(r5)
            r7 = r4 & 63
            long r5 = r5 >>> r7
            long r5 = r5 & r10
            long r5 = -r5
            r2.setXorRangeAndMask(r1, r9, r5)
            r2.move(r9)
            int r4 = r4 + 1
            goto La4
        Lba:
            int r8 = r8 + (-1)
            goto L91
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine.invMatrixLU_gf2(org.bouncycastle.pqc.legacy.crypto.gemss.Pointer, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer, org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine$FunctionParams):void");
    }

    public void mul_gf2n(Pointer pointer, Pointer pointer2, int i11, Pointer pointer3) {
        int index = pointer2.getIndex();
        pointer2.move(i11);
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        pointer2.changeIndex(index);
        rem_gf2n(pointer, 0, this.Buffer_NB_WORD_MUL);
    }

    public void mul_move(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x(pointer, pointer2, pointer3);
        pointer2.move(this.NB_WORD_GFqn);
        pointer3.move(this.NB_WORD_GFqn);
    }

    public void mul_rem_xorrange(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        int index = pointer3.getIndex();
        pointer3.move(i11);
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        this.rem.rem_gf2n_xor(pointer.array, pointer.f33654cp, this.Buffer_NB_WORD_MUL.array);
        pointer3.changeIndex(index);
    }

    public void mul_xorrange(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x_xor(pointer, pointer2, pointer3);
    }

    public void signHFE_FeistelPatarin(SecureRandom secureRandom, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3) {
        int i13;
        int i14;
        long j9;
        long j11;
        long j12;
        PointerUnion pointerUnion;
        Pointer pointer;
        int i15;
        Pointer pointer2;
        Pointer pointer3;
        Pointer pointer4;
        SecureRandom secureRandom2 = secureRandom;
        this.random = secureRandom2;
        Pointer pointer5 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer(this.SIZE_DIGEST_UINT);
        Pointer pointer7 = new Pointer(new Pointer(this.SIZE_DIGEST_UINT));
        int i16 = this.HFEv;
        int i17 = i16 & 7;
        int i18 = (i16 >>> 3) + (i17 != 0 ? 1 : 0);
        long jMaskUINT = GeMSSUtils.maskUINT(this.HFEvr);
        SecretKeyHFE secretKeyHFE = new SecretKeyHFE(this);
        Pointer pointer8 = new Pointer(this.NB_WORD_GFqv);
        Pointer[] pointerArr = new Pointer[this.HFEDegI + 1];
        precSignHFE(secretKeyHFE, pointerArr, bArr3);
        Pointer pointer9 = new Pointer(secretKeyHFE.F_struct.poly);
        Pointer pointer10 = new Pointer(pointer6);
        int i19 = this.Sha3BitStrength >>> 3;
        byte[] bArr4 = new byte[i19];
        Pointer pointer11 = pointer7;
        Pointer pointer12 = pointer10;
        Pointer pointer13 = pointer9;
        long j13 = jMaskUINT;
        getSHA3Hash(pointer12, 0, i19, bArr2, i11, i12, bArr4);
        Pointer pointer14 = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
        Pointer pointer15 = new Pointer(this.NB_WORD_GF2nv);
        PointerUnion pointerUnion2 = new PointerUnion(pointer15);
        long j14 = 0;
        int i21 = 1;
        while (true) {
            i13 = this.NB_ITE;
            if (i21 > i13) {
                break;
            }
            pointer15.setRangeFromXor(pointer14, pointer12, this.NB_WORD_GF2m);
            if (this.HFEmr8 != 0) {
                i14 = i17;
                pointer15.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
                j14 = pointerUnion2.getByte(this.HFEmq8);
            } else {
                i14 = i17;
            }
            long j15 = j14;
            while (true) {
                if (this.HFEmr8 != 0) {
                    pointerUnion2.fillRandomBytes(this.HFEmq8, secureRandom2, (this.NB_BYTES_GFqn - this.NB_BYTES_GFqm) + 1);
                    pointerUnion2.setAndThenXorByte(this.HFEmq8, -(1 << this.HFEmr8), j15);
                    j9 = j15;
                } else {
                    j9 = j15;
                    int i22 = this.NB_BYTES_GFqm;
                    pointerUnion2.fillRandomBytes(i22, secureRandom2, this.NB_BYTES_GFqn - i22);
                }
                if ((this.HFEn & 7) != 0) {
                    j11 = j9;
                    pointer15.setAnd(this.NB_WORD_GFqn - 1, this.MASK_GF2n);
                } else {
                    j11 = j9;
                }
                vecMatProduct(pointer5, pointer15, secretKeyHFE.T, FunctionParams.N);
                pointer8.fillRandom(0, secureRandom2, i18);
                if (i14 != 0) {
                    j12 = j13;
                    pointer8.setAnd(this.NB_WORD_GFqv - 1, j12);
                } else {
                    j12 = j13;
                }
                Pointer pointer16 = pointer13;
                evalMQSv_unrolled_gf2(pointer16, pointer8, secretKeyHFE.F_HFEv);
                pointerUnion = pointerUnion2;
                int i23 = 0;
                while (i23 <= this.HFEDegI) {
                    int i24 = i23;
                    Pointer pointer17 = pointer16;
                    vecMatProduct(this.Buffer_NB_WORD_GFqn, pointer8, new Pointer(pointerArr[i24], this.NB_WORD_GFqn), FunctionParams.V);
                    int i25 = this.NB_WORD_GFqn;
                    i23 = i24 + 1;
                    pointer17.setRangeFromXor((((i24 * i23) >>> 1) + 1) * i25, pointerArr[i24], 0, this.Buffer_NB_WORD_GFqn, 0, i25);
                    pointer16 = pointer17;
                }
                pointer13 = pointer16;
                if (chooseRootHFE_gf2nx(pointer15, secretKeyHFE.F_struct, pointer5) != 0) {
                    break;
                }
                secureRandom2 = secureRandom;
                j15 = j11;
                pointerUnion2 = pointerUnion;
                j13 = j12;
            }
            pointer15.setXor(this.NB_WORD_GFqn - 1, pointer8.get() << this.HFEnr);
            Pointer pointer18 = pointer15;
            pointer18.setRangeRotate(this.NB_WORD_GFqn, pointer8, 0, this.NB_WORD_GFqv - 1, 64 - this.HFEnr);
            int i26 = this.NB_WORD_GFqn;
            int i27 = this.NB_WORD_GFqv;
            if (i26 + i27 == this.NB_WORD_GF2nv) {
                pointer18.set((i26 + i27) - 1, pointer8.get(i27 - 1) >>> (64 - this.HFEnr));
            }
            vecMatProduct(pointer14, pointer18, secretKeyHFE.S, FunctionParams.NV);
            int i28 = this.NB_ITE;
            if (i21 != i28) {
                int i29 = this.NB_WORD_GF2nv;
                int i31 = this.NB_WORD_GF2nvm;
                int i32 = (((i28 - 1) - i21) * i31) + i29;
                pointer14.copyFrom(i32, pointer14, i29 - i31, i31);
                if (this.HFEmr != 0) {
                    pointer14.setAnd(i32, ~this.MASK_GF2m);
                }
                byte[] bytes = pointer12.toBytes(this.SIZE_DIGEST);
                pointer = pointer14;
                i15 = i21;
                pointer2 = pointer18;
                pointer3 = pointer12;
                pointer4 = pointer11;
                getSHA3Hash(pointer4, 0, this.SIZE_DIGEST, bytes, 0, bytes.length, bytes);
                pointer4.swap(pointer3);
            } else {
                pointer = pointer14;
                i15 = i21;
                pointer2 = pointer18;
                pointer3 = pointer12;
                pointer4 = pointer11;
            }
            i21 = i15 + 1;
            j14 = j11;
            pointer11 = pointer4;
            pointer12 = pointer3;
            pointer14 = pointer;
            pointer15 = pointer2;
            pointerUnion2 = pointerUnion;
            secureRandom2 = secureRandom;
            j13 = j12;
            i17 = i14;
        }
        Pointer pointer19 = pointer14;
        if (i13 == 1) {
            System.arraycopy(pointer19.toBytes(pointer19.getLength() << 3), 0, bArr, 0, this.NB_BYTES_GFqnv);
        } else {
            compress_signHFE(bArr, pointer19);
        }
    }

    public int sign_openHFE_huncomp_pk(byte[] bArr, int i11, byte[] bArr2, PointerUnion pointerUnion, PointerUnion pointerUnion2) {
        int i12;
        Pointer pointer = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
        Pointer pointer2 = new Pointer(this.NB_WORD_GF2nv);
        Pointer pointer3 = new Pointer(this.NB_WORD_GF2nv);
        Pointer pointer4 = new Pointer(pointer2);
        Pointer pointer5 = new Pointer(pointer3);
        byte[] bArr3 = new byte[64];
        Pointer pointer6 = new Pointer(this.NB_ITE * this.SIZE_DIGEST_UINT);
        long j9 = pointerUnion2.get();
        pointerUnion2.move(1);
        uncompress_signHFE(pointer, bArr2);
        getSHA3Hash(pointer6, 0, 64, bArr, 0, i11, bArr3);
        int i13 = 1;
        while (true) {
            int i14 = this.NB_ITE;
            i12 = this.SIZE_DIGEST_UINT;
            if (i13 >= i14) {
                break;
            }
            int i15 = i13;
            getSHA3Hash(pointer6, i12 * i13, 64, bArr3, 0, this.SIZE_DIGEST, bArr3);
            pointer6.setAnd((((i15 - 1) * this.SIZE_DIGEST_UINT) + this.NB_WORD_GF2m) - 1, this.MASK_GF2m);
            i13 = i15 + 1;
        }
        pointer6.setAnd((((i13 - 1) * i12) + this.NB_WORD_GF2m) - 1, this.MASK_GF2m);
        evalMQShybrid8_uncomp_nocst_gf2_m(pointer4, pointer, pointerUnion, pointerUnion2);
        pointer4.setXor(this.HFEmq, j9);
        for (int i16 = this.NB_ITE - 1; i16 > 0; i16--) {
            pointer4.setXorRange(pointer6, this.SIZE_DIGEST_UINT * i16, this.NB_WORD_GF2m);
            int i17 = (((this.NB_ITE - 1) - i16) * this.NB_WORD_GF2nvm) + this.NB_WORD_GF2nv;
            pointer4.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
            pointer4.setXor(this.NB_WORD_GF2m - 1, pointer.get(i17));
            int i18 = this.NB_WORD_GF2nvm;
            if (i18 != 1) {
                pointer4.copyFrom(this.NB_WORD_GF2m, pointer, i17 + 1, i18 - 1);
            }
            evalMQShybrid8_uncomp_nocst_gf2_m(pointer5, pointer4, pointerUnion, pointerUnion2);
            pointer5.setXor(this.HFEmq, j9);
            pointer5.swap(pointer4);
        }
        return pointer4.isEqual_nocst_gf2(pointer6, this.NB_WORD_GF2m);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2 A[LOOP:2: B:38:0x00b0->B:39:0x00b2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vecMatProduct(org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r21, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r22, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer r23, org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine.FunctionParams r24) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine.vecMatProduct(org.bouncycastle.pqc.legacy.crypto.gemss.Pointer, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer, org.bouncycastle.pqc.legacy.crypto.gemss.Pointer, org.bouncycastle.pqc.legacy.crypto.gemss.GeMSSEngine$FunctionParams):void");
    }

    public void mul_gf2n(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        rem_gf2n(pointer, 0, this.Buffer_NB_WORD_MUL);
    }

    private void sqr_gf2n(Pointer pointer, int i11, Pointer pointer2, int i12) {
        this.mul.sqr_gf2x(this.Buffer_NB_WORD_MUL.array, pointer2.array, i12 + pointer2.f33654cp);
        rem_gf2n(pointer, i11, this.Buffer_NB_WORD_MUL);
    }

    public void mul_rem_xorrange(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        this.rem.rem_gf2n_xor(pointer.array, pointer.f33654cp, this.Buffer_NB_WORD_MUL.array);
    }
}
