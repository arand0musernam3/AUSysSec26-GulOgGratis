package org.bouncycastle.pqc.crypto.mldsa;

import b3.i;

/* JADX INFO: loaded from: classes3.dex */
class PolyVecMatrix {
    private final PolyVecL[] matrix;

    public PolyVecMatrix(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.matrix = new PolyVecL[dilithiumK];
        for (int i11 = 0; i11 < dilithiumK; i11++) {
            this.matrix[i11] = new PolyVecL(mLDSAEngine);
        }
    }

    private String addString() {
        String strConcat = "[";
        int i11 = 0;
        while (i11 < this.matrix.length) {
            StringBuilder sbO = i.o(strConcat + "Outer Matrix " + i11 + " [");
            sbO.append(this.matrix[i11].toString());
            String string = sbO.toString();
            strConcat = i11 == this.matrix.length + (-1) ? string.concat("]\n") : string.concat("],\n");
            i11++;
        }
        return strConcat.concat("]\n");
    }

    public void expandMatrix(byte[] bArr) {
        int i11 = 0;
        while (true) {
            PolyVecL[] polyVecLArr = this.matrix;
            if (i11 >= polyVecLArr.length) {
                return;
            }
            polyVecLArr[i11].uniformBlocks(bArr, i11 << 8);
            i11++;
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.matrix.length; i11++) {
            polyVecK.getVectorIndex(i11).pointwiseAccountMontgomery(this.matrix[i11], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
