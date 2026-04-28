package org.bouncycastle.pqc.crypto.crystals.dilithium;

import e0.f;

/* JADX INFO: loaded from: classes3.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            this.vec[i11] = new Poly(dilithiumEngine);
        }
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            getVectorIndex(i11).addPoly(polyVecL.getVectorIndex(i11));
        }
    }

    public boolean checkNorm(int i11) {
        for (int i12 = 0; i12 < this.dilithiumL; i12++) {
            if (getVectorIndex(i12).checkNorm(i11)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            for (int i12 = 0; i12 < 256; i12++) {
                polyVecL.getVectorIndex(i11).setCoeffIndex(i12, getVectorIndex(i11).getCoeffIndex(i12));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this.dilithiumL; i12++) {
            this.vec[i12].uniformBlocks(bArr, (short) ((i11 << 8) + i12));
        }
    }

    public Poly getVectorIndex(int i11) {
        return this.vec[i11];
    }

    public void invNttToMont() {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            getVectorIndex(i11).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            getVectorIndex(i11).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i11));
        }
    }

    public void polyVecNtt() {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            this.vec[i11].polyNtt();
        }
    }

    public void reduce() {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            getVectorIndex(i11).reduce();
        }
    }

    public String toString() {
        String strConcat = "\n[";
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            strConcat = strConcat + "Inner Matrix " + i11 + " " + getVectorIndex(i11).toString();
            if (i11 != this.dilithiumL - 1) {
                strConcat = strConcat.concat(",\n");
            }
        }
        return strConcat.concat("]");
    }

    public void uniformEta(byte[] bArr, short s7) {
        int i11 = 0;
        while (i11 < this.dilithiumL) {
            getVectorIndex(i11).uniformEta(bArr, s7);
            i11++;
            s7 = (short) (s7 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s7) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            getVectorIndex(i11).uniformGamma1(bArr, (short) ((this.dilithiumL * s7) + i11));
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
