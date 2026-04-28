package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class Packing {
    public static byte[] packPublicKey(PolyVecK polyVecK, MLDSAEngine mLDSAEngine) {
        byte[] bArr = new byte[mLDSAEngine.getCryptoPublicKeyBytes() - 32];
        for (int i11 = 0; i11 < mLDSAEngine.getDilithiumK(); i11++) {
            System.arraycopy(polyVecK.getVectorIndex(i11).polyt1Pack(), 0, bArr, i11 * 320, 320);
        }
        return bArr;
    }

    public static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, MLDSAEngine mLDSAEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[mLDSAEngine.getDilithiumL() * mLDSAEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i11 = 0; i11 < mLDSAEngine.getDilithiumL(); i11++) {
            polyVecL.getVectorIndex(i11).polyEtaPack(bArr4[3], mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i11);
        }
        bArr4[4] = new byte[mLDSAEngine.getDilithiumK() * mLDSAEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i12 = 0; i12 < mLDSAEngine.getDilithiumK(); i12++) {
            polyVecK2.getVectorIndex(i12).polyEtaPack(bArr4[4], mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i12);
        }
        bArr4[5] = new byte[mLDSAEngine.getDilithiumK() * 416];
        for (int i13 = 0; i13 < mLDSAEngine.getDilithiumK(); i13++) {
            polyVecK.getVectorIndex(i13).polyt0Pack(bArr4[5], i13 * 416);
        }
        return bArr4;
    }

    public static void packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, MLDSAEngine mLDSAEngine) {
        int dilithiumCTilde = mLDSAEngine.getDilithiumCTilde();
        for (int i11 = 0; i11 < mLDSAEngine.getDilithiumL(); i11++) {
            polyVecL.getVectorIndex(i11).zPack(bArr, dilithiumCTilde);
            dilithiumCTilde += mLDSAEngine.getDilithiumPolyZPackedBytes();
        }
        for (int i12 = 0; i12 < mLDSAEngine.getDilithiumOmega() + mLDSAEngine.getDilithiumK(); i12++) {
            bArr[dilithiumCTilde + i12] = 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < mLDSAEngine.getDilithiumK(); i14++) {
            for (int i15 = 0; i15 < 256; i15++) {
                if (polyVecK.getVectorIndex(i14).getCoeffIndex(i15) != 0) {
                    bArr[i13 + dilithiumCTilde] = (byte) i15;
                    i13++;
                }
            }
            bArr[mLDSAEngine.getDilithiumOmega() + dilithiumCTilde + i14] = (byte) i13;
        }
    }

    public static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, MLDSAEngine mLDSAEngine) {
        int i11 = 0;
        while (i11 < mLDSAEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i11);
            int i12 = i11 * 320;
            i11++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i12, i11 * 320));
        }
        return polyVecK;
    }

    public static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, MLDSAEngine mLDSAEngine) {
        for (int i11 = 0; i11 < mLDSAEngine.getDilithiumL(); i11++) {
            polyVecL.getVectorIndex(i11).polyEtaUnpack(bArr2, mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i11);
        }
        for (int i12 = 0; i12 < mLDSAEngine.getDilithiumK(); i12++) {
            polyVecK2.getVectorIndex(i12).polyEtaUnpack(bArr3, mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i12);
        }
        for (int i13 = 0; i13 < mLDSAEngine.getDilithiumK(); i13++) {
            polyVecK.getVectorIndex(i13).polyt0Unpack(bArr, i13 * 416);
        }
    }

    public static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, MLDSAEngine mLDSAEngine) {
        int dilithiumCTilde = mLDSAEngine.getDilithiumCTilde();
        int i11 = 0;
        while (i11 < mLDSAEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i11);
            int dilithiumPolyZPackedBytes = (mLDSAEngine.getDilithiumPolyZPackedBytes() * i11) + dilithiumCTilde;
            i11++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (mLDSAEngine.getDilithiumPolyZPackedBytes() * i11) + dilithiumCTilde));
        }
        int dilithiumL = (mLDSAEngine.getDilithiumL() * mLDSAEngine.getDilithiumPolyZPackedBytes()) + dilithiumCTilde;
        int i12 = 0;
        for (int i13 = 0; i13 < mLDSAEngine.getDilithiumK(); i13++) {
            for (int i14 = 0; i14 < 256; i14++) {
                polyVecK.getVectorIndex(i13).setCoeffIndex(i14, 0);
            }
            if ((bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i13] & 255) < i12 || (bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i13] & 255) > mLDSAEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i15 = i12; i15 < (bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i13] & 255); i15++) {
                if (i15 > i12) {
                    int i16 = dilithiumL + i15;
                    if ((bArr[i16] & 255) <= (bArr[i16 - 1] & 255)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i13).setCoeffIndex(bArr[dilithiumL + i15] & 255, 1);
            }
            i12 = bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i13];
        }
        while (i12 < mLDSAEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i12] & 255) != 0) {
                return false;
            }
            i12++;
        }
        return true;
    }
}
