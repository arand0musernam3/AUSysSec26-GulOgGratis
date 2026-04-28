package org.bouncycastle.pqc.crypto.mldsa;

import a40.d0;

/* JADX INFO: loaded from: classes3.dex */
class Rounding {
    public static int[] decompose(int i11, int i12) {
        int i13;
        int i14 = (i11 + 127) >> 7;
        if (i12 == 261888) {
            i13 = (((i14 * 1025) + 2097152) >> 22) & 15;
        } else {
            if (i12 != 95232) {
                d0.k("Wrong Gamma2!");
                return null;
            }
            int i15 = ((i14 * 11275) + 8388608) >> 24;
            i13 = i15 ^ (((43 - i15) >> 31) & i15);
        }
        int i16 = i11 - ((i13 * 2) * i12);
        return new int[]{i16 - (((4190208 - i16) >> 31) & 8380417), i13};
    }

    public static int makeHint(int i11, int i12, MLDSAEngine mLDSAEngine) {
        int i13;
        int dilithiumGamma2 = mLDSAEngine.getDilithiumGamma2();
        if (i11 <= dilithiumGamma2 || i11 > (i13 = 8380417 - dilithiumGamma2)) {
            return 0;
        }
        return (i11 == i13 && i12 == 0) ? 0 : 1;
    }

    public static int[] power2Round(int i11) {
        int i12 = (i11 + 4095) >> 13;
        return new int[]{i12, i11 - (i12 << 13)};
    }

    public static int useHint(int i11, int i12, int i13) {
        int[] iArrDecompose = decompose(i11, i13);
        int i14 = iArrDecompose[0];
        int i15 = iArrDecompose[1];
        if (i12 == 0) {
            return i15;
        }
        if (i13 == 261888) {
            return i14 > 0 ? (i15 + 1) & 15 : (i15 - 1) & 15;
        }
        if (i13 != 95232) {
            d0.k("Wrong Gamma2!");
            return 0;
        }
        if (i14 > 0) {
            if (i15 == 43) {
                return 0;
            }
            return i15 + 1;
        }
        if (i15 == 0) {
            return 43;
        }
        return i15 - 1;
    }
}
