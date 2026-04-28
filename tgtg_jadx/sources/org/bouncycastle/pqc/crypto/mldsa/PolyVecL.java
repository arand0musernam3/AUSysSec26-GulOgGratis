package org.bouncycastle.pqc.crypto.mldsa;

import e0.f;

/* JADX INFO: loaded from: classes3.dex */
class PolyVecL {
    private final Poly[] vec;

    public PolyVecL(MLDSAEngine mLDSAEngine) {
        int dilithiumL = mLDSAEngine.getDilithiumL();
        this.vec = new Poly[dilithiumL];
        for (int i11 = 0; i11 < dilithiumL; i11++) {
            this.vec[i11] = new Poly(mLDSAEngine);
        }
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).addPoly(polyVecL.getVectorIndex(i11));
        }
    }

    public boolean checkNorm(int i11) {
        for (int i12 = 0; i12 < this.vec.length; i12++) {
            if (getVectorIndex(i12).checkNorm(i11)) {
                return true;
            }
        }
        return false;
    }

    public void copyTo(PolyVecL polyVecL) {
        int i11 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i11 >= polyArr.length) {
                return;
            }
            polyArr[i11].copyTo(polyVecL.vec[i11]);
            i11++;
        }
    }

    public Poly getVectorIndex(int i11) {
        return this.vec[i11];
    }

    public void invNttToMont() {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i11));
        }
    }

    public void polyVecNtt() {
        int i11 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i11 >= polyArr.length) {
                return;
            }
            polyArr[i11].polyNtt();
            i11++;
        }
    }

    public void reduce() {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).reduce();
        }
    }

    public String toString() {
        String strConcat = "\n[";
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            strConcat = strConcat + "Inner Matrix " + i11 + " " + getVectorIndex(i11).toString();
            if (i11 != this.vec.length - 1) {
                strConcat = strConcat.concat(",\n");
            }
        }
        return strConcat.concat("]");
    }

    public void uniformBlocks(byte[] bArr, int i11) {
        int i12 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i12 >= polyArr.length) {
                return;
            }
            polyArr[i12].uniformBlocks(bArr, (short) (i11 + i12));
            i12++;
        }
    }

    public void uniformEta(byte[] bArr, short s7) {
        int i11 = 0;
        while (i11 < this.vec.length) {
            getVectorIndex(i11).uniformEta(bArr, s7);
            i11++;
            s7 = (short) (s7 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s7) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).uniformGamma1(bArr, (short) ((this.vec.length * s7) + i11));
        }
    }

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public String toString(String str) {
        StringBuilder sbR = f.r(str, ": ");
        sbR.append(toString());
        return sbR.toString();
    }
}
