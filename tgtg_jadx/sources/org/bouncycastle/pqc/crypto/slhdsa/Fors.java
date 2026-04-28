package org.bouncycastle.pqc.crypto.slhdsa;

import java.math.BigInteger;
import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class Fors {
    SLHDSAEngine engine;

    public Fors(SLHDSAEngine sLHDSAEngine) {
        this.engine = sLHDSAEngine;
    }

    public static int[] base2B(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i12];
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            while (i14 < i11) {
                bigIntegerAdd = bigIntegerAdd.shiftLeft(8).add(BigInteger.valueOf(bArr[i13] & 255));
                i13++;
                i14 += 8;
            }
            i14 -= i11;
            iArr[i15] = bigIntegerAdd.shiftRight(i14).mod(BigInteger.valueOf(2L).pow(i11)).intValue();
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i11;
        int i12 = 2;
        byte[][] bArr3 = new byte[2][];
        SLHDSAEngine sLHDSAEngine = this.engine;
        int i13 = sLHDSAEngine.K;
        byte[][] bArr4 = new byte[i13][];
        int i14 = sLHDSAEngine.T;
        int[] iArrBase2B = base2B(bArr, sLHDSAEngine.A, i13);
        int i15 = 0;
        while (i15 < this.engine.K) {
            int i16 = iArrBase2B[i15];
            byte[] sk2 = sig_forsArr[i15].getSK();
            adrs.setTreeHeight(0);
            int i17 = (i15 * i14) + i16;
            adrs.setTreeIndex(i17);
            bArr3[0] = this.engine.F(bArr2, adrs, sk2);
            byte[][] authPath = sig_forsArr[i15].getAuthPath();
            adrs.setTreeIndex(i17);
            int i18 = 0;
            while (i18 < this.engine.A) {
                int i19 = i18 + 1;
                adrs.setTreeHeight(i19);
                if ((i16 / (1 << i18)) % i12 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i12);
                    i11 = i12;
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i18]);
                } else {
                    i11 = i12;
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i18], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i18 = i19;
                i12 = i11;
            }
            bArr4[i15] = bArr3[0];
            i15++;
            i12 = i12;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SLHDSAEngine sLHDSAEngine = fors.engine;
        int[] iArrBase2B = base2B(bArr, sLHDSAEngine.A, sLHDSAEngine.K);
        SLHDSAEngine sLHDSAEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sLHDSAEngine2.K];
        int i11 = sLHDSAEngine2.T;
        int i12 = 0;
        while (i12 < fors.engine.K) {
            int i13 = iArrBase2B[i12];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i14 = i12 * i11;
            adrs2.setTreeIndex(i14 + i13);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i15 = 0;
            while (i15 < fors.engine.A) {
                int i16 = 1 << i15;
                bArr6[i15] = fors.treehash(bArr4, (((i13 / i16) ^ 1) * i16) + i14, i15, bArr5, adrs2);
                i15++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i12] = new SIG_FORS(bArrPRF, bArr6);
            i12++;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i11, int i12, byte[] bArr2, ADRS adrs) {
        if (((i11 >>> i12) << i12) != i11) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i13 = 0; i13 < (1 << i12); i13++) {
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i14 = i11 + i13;
            adrs2.setTreeIndex(i14);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] bArrF = this.engine.F(bArr2, adrs2, bArrPRF);
            adrs2.setTreeHeight(1);
            int i15 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i15) {
                i14 = (i14 - 1) / 2;
                adrs2.setTreeIndex(i14);
                bArrF = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrF);
                i15++;
                adrs2.setTreeHeight(i15);
            }
            linkedList.add(0, new NodeEntry(bArrF, i15));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
