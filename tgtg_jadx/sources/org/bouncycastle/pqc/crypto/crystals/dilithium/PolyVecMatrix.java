package org.bouncycastle.pqc.crypto.crystals.dilithium;

import b3.i;

/* JADX INFO: loaded from: classes3.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            this.mat[i11] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        String strConcat = "[";
        int i11 = 0;
        while (i11 < this.dilithiumK) {
            StringBuilder sbO = i.o(strConcat + "Outer Matrix " + i11 + " [");
            sbO.append(this.mat[i11].toString());
            String string = sbO.toString();
            strConcat = i11 == this.dilithiumK + (-1) ? string.concat("]\n") : string.concat("],\n");
            i11++;
        }
        return strConcat.concat("]\n");
    }

    public void expandMatrix(byte[] bArr) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            for (int i12 = 0; i12 < this.dilithiumL; i12++) {
                this.mat[i11].getVectorIndex(i12).uniformBlocks(bArr, (short) ((i11 << 8) + i12));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            polyVecK.getVectorIndex(i11).pointwiseAccountMontgomery(this.mat[i11], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
