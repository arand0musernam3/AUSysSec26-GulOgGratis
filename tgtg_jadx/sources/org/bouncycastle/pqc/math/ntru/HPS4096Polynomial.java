package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* JADX INFO: loaded from: classes3.dex */
public class HPS4096Polynomial extends HPSPolynomial {
    public HPS4096Polynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i11 = 0;
        while (true) {
            int iPackDegree = this.params.packDegree() / 2;
            short[] sArr = this.coeffs;
            if (i11 >= iPackDegree) {
                sArr[this.params.n() - 1] = 0;
                return;
            }
            int i12 = i11 * 2;
            int i13 = i11 * 3;
            int i14 = bArr[i13] & 255;
            byte b8 = bArr[i13 + 1];
            sArr[i12] = (short) (i14 | ((((short) (b8 & 255)) & 15) << 8));
            sArr[i12 + 1] = (short) (((((short) (bArr[i13 + 2] & 255)) & 255) << 4) | ((b8 & 255) >>> 4));
            i11++;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i11) {
        byte[] bArr = new byte[i11];
        int iQ = this.params.q();
        for (int i12 = 0; i12 < this.params.packDegree() / 2; i12++) {
            int i13 = i12 * 3;
            int i14 = i12 * 2;
            bArr[i13] = (byte) (Polynomial.modQ(this.coeffs[i14] & HPKE.aead_EXPORT_ONLY, iQ) & 255);
            int iModQ = Polynomial.modQ(this.coeffs[i14] & HPKE.aead_EXPORT_ONLY, iQ) >>> 8;
            int i15 = i14 + 1;
            bArr[i13 + 1] = (byte) (iModQ | ((Polynomial.modQ(this.coeffs[i15] & HPKE.aead_EXPORT_ONLY, iQ) & 15) << 4));
            bArr[i13 + 2] = (byte) (Polynomial.modQ(this.coeffs[i15] & HPKE.aead_EXPORT_ONLY, iQ) >>> 4);
        }
        return bArr;
    }
}
