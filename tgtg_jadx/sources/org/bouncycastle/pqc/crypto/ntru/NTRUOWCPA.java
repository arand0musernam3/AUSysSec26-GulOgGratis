package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class NTRUOWCPA {
    private final NTRUParameterSet params;
    private final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (255 << (8 - ((this.params.packDegree() * this.params.logQ()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s7 = 0;
        short s8 = 0;
        for (int i11 = 0; i11 < this.params.n() - 1; i11++) {
            short s11 = hPSPolynomial.coeffs[i11];
            s7 = (short) (s7 + (s11 & 1));
            s8 = (short) (s8 + (s11 & 2));
        }
        return (((~(((s8 >>> 1) ^ s7) | (((NTRUHPSParameterSet) this.params).weight() ^ s8))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int iQ = 0;
        for (int i11 = 0; i11 < this.params.n() - 1; i11++) {
            short s7 = polynomial.coeffs[i11];
            iQ = iQ | ((s7 + 1) & (this.params.q() - 4)) | ((s7 + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.n() - 1] | iQ)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.params.owcpaMsgBytes()];
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial4 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.s3FromBytes(bArr2);
        polynomialCreatePolynomial2.z3ToZq();
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial, polynomialCreatePolynomial2);
        polynomialCreatePolynomial2.rqToS3(polynomialCreatePolynomial3);
        polynomialCreatePolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        polynomialCreatePolynomial4.s3Mul(polynomialCreatePolynomial2, polynomialCreatePolynomial3);
        polynomialCreatePolynomial4.s3ToBytes(bArr3, this.params.packTrinaryBytes());
        int iCheckCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            iCheckCiphertext |= checkM((HPSPolynomial) polynomialCreatePolynomial4);
        }
        polynomialCreatePolynomial2.lift(polynomialCreatePolynomial4);
        for (int i11 = 0; i11 < this.params.n(); i11++) {
            short[] sArr = polynomialCreatePolynomial.coeffs;
            sArr[i11] = (short) (sArr[i11] - polynomialCreatePolynomial2.coeffs[i11]);
        }
        polynomialCreatePolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        polynomialCreatePolynomial4.sqMul(polynomialCreatePolynomial, polynomialCreatePolynomial3);
        int iCheckR = iCheckCiphertext | checkR(polynomialCreatePolynomial4);
        polynomialCreatePolynomial4.trinaryZqToZ3();
        polynomialCreatePolynomial4.s3ToBytes(bArr3, 0);
        return new OWCPADecryptResult(bArr3, iCheckR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.rqMul(polynomial, polynomialCreatePolynomial);
        polynomialCreatePolynomial.lift(polynomial2);
        for (int i11 = 0; i11 < this.params.n(); i11++) {
            short[] sArr = polynomialCreatePolynomial2.coeffs;
            sArr[i11] = (short) (sArr[i11] + polynomialCreatePolynomial.coeffs[i11]);
        }
        return polynomialCreatePolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        short[] sArr;
        int iOwcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[iOwcpaSecretKeyBytes];
        int iN = this.params.n();
        this.params.q();
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        PolynomialPair polynomialPairSampleFg = this.sampling.sampleFg(bArr);
        Polynomial polynomialF = polynomialPairSampleFg.f();
        Polynomial polynomialG = polynomialPairSampleFg.g();
        polynomialCreatePolynomial.s3Inv(polynomialF);
        polynomialF.s3ToBytes(bArr2, 0);
        polynomialCreatePolynomial.s3ToBytes(bArr2, this.params.packTrinaryBytes());
        polynomialF.z3ToZq();
        polynomialG.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            while (true) {
                iN--;
                sArr = polynomialG.coeffs;
                if (iN <= 0) {
                    break;
                }
                sArr[iN] = (short) ((sArr[iN - 1] - sArr[iN]) * 3);
            }
            sArr[0] = (short) (-(sArr[0] * 3));
        } else {
            for (int i11 = 0; i11 < iN; i11++) {
                short[] sArr2 = polynomialG.coeffs;
                sArr2[i11] = (short) (sArr2[i11] * 3);
            }
        }
        polynomialCreatePolynomial.rqMul(polynomialG, polynomialF);
        polynomialCreatePolynomial2.rqInv(polynomialCreatePolynomial);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialF);
        polynomialCreatePolynomial.sqMul(polynomialCreatePolynomial3, polynomialF);
        byte[] bArrSqToBytes = polynomialCreatePolynomial.sqToBytes(iOwcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(bArrSqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, bArrSqToBytes.length);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialG);
        polynomialCreatePolynomial.rqMul(polynomialCreatePolynomial3, polynomialG);
        return new OWCPAKeyPair(polynomialCreatePolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
