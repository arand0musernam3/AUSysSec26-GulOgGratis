package org.bouncycastle.pqc.crypto.mldsa;

import e0.f;

/* JADX INFO: loaded from: classes3.dex */
class PolyVecK {
    private final Poly[] vec;

    public PolyVecK(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.vec = new Poly[dilithiumK];
        for (int i11 = 0; i11 < dilithiumK; i11++) {
            this.vec[i11] = new Poly(mLDSAEngine);
        }
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).addPoly(polyVecK.getVectorIndex(i11));
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

    public void conditionalAddQ() {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).decompose(polyVecK.getVectorIndex(i11));
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

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            iPolyMakeHint += getVectorIndex(i11).polyMakeHint(polyVecK.getVectorIndex(i11), polyVecK2.getVectorIndex(i11));
        }
        return iPolyMakeHint;
    }

    public void packW1(MLDSAEngine mLDSAEngine, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this.vec.length; i12++) {
            getVectorIndex(i12).packW1(bArr, (mLDSAEngine.getDilithiumPolyW1PackedBytes() * i12) + i11);
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i11));
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

    public void power2Round(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).power2Round(polyVecK.getVectorIndex(i11));
        }
    }

    public void reduce() {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).reduce();
        }
    }

    public void setVectorIndex(int i11, Poly poly) {
        this.vec[i11] = poly;
    }

    public void shiftLeft() {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).subtract(polyVecK.getVectorIndex(i11));
        }
    }

    public String toString() {
        String strConcat = "[";
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            strConcat = strConcat + i11 + " " + getVectorIndex(i11).toString();
            if (i11 != this.vec.length - 1) {
                strConcat = strConcat.concat(",\n");
            }
        }
        return strConcat.concat("]");
    }

    public void uniformEta(byte[] bArr, short s7) {
        int i11 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i11 >= polyArr.length) {
                return;
            }
            polyArr[i11].uniformEta(bArr, s7);
            i11++;
            s7 = (short) (s7 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i11 = 0; i11 < this.vec.length; i11++) {
            getVectorIndex(i11).polyUseHint(polyVecK.getVectorIndex(i11), polyVecK2.getVectorIndex(i11));
        }
    }

    public String toString(String str) {
        StringBuilder sbR = f.r(str, ": ");
        sbR.append(toString());
        return sbR.toString();
    }
}
