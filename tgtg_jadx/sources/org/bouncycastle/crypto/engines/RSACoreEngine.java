package org.bouncycastle.crypto.engines;

import com.braze.h2;
import java.math.BigInteger;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class RSACoreEngine {
    private boolean forEncryption;
    private RSAKeyParameters key;

    private CryptoServicePurpose getPurpose(boolean z11, boolean z12) {
        boolean z13 = false;
        boolean z14 = z11 && z12;
        boolean z15 = !z11 && z12;
        if (!z11 && !z12) {
            z13 = true;
        }
        return z14 ? CryptoServicePurpose.SIGNING : z15 ? CryptoServicePurpose.ENCRYPTION : z13 ? CryptoServicePurpose.VERIFYING : CryptoServicePurpose.DECRYPTION;
    }

    public BigInteger convertInput(byte[] bArr, int i11, int i12) {
        if (i12 <= getInputBlockSize() + 1 && (i12 != getInputBlockSize() + 1 || this.forEncryption)) {
            if (i11 != 0 || i12 != bArr.length) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.key.getModulus()) < 0) {
                return bigInteger;
            }
        }
        i1.t("input too large for RSA cipher.");
        return null;
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.forEncryption) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        }
        if (byteArray.length >= getOutputBlockSize()) {
            return byteArray;
        }
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr3 = new byte[outputBlockSize];
        System.arraycopy(byteArray, 0, bArr3, outputBlockSize - byteArray.length, byteArray.length);
        return bArr3;
    }

    public int getInputBlockSize() {
        int iBitLength = (this.key.getModulus().bitLength() + 7) / 8;
        return this.forEncryption ? iBitLength - 1 : iBitLength;
    }

    public int getOutputBlockSize() {
        int iBitLength = (this.key.getModulus().bitLength() + 7) / 8;
        return this.forEncryption ? iBitLength : iBitLength - 1;
    }

    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.forEncryption = z11;
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.key = rSAKeyParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSA", ConstraintUtils.bitsOfSecurityFor(rSAKeyParameters.getModulus()), this.key, getPurpose(this.key.isPrivate(), z11)));
    }

    public BigInteger processBlock(BigInteger bigInteger) {
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        BigInteger publicExponent;
        RSAKeyParameters rSAKeyParameters = this.key;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            return bigInteger.modPow(this.key.getExponent(), this.key.getModulus());
        }
        BigInteger p7 = rSAPrivateCrtKeyParameters.getP();
        BigInteger q7 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger dp2 = rSAPrivateCrtKeyParameters.getDP();
        BigInteger dq2 = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger bigIntegerModPow = bigInteger.remainder(p7).modPow(dp2, p7);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(q7).modPow(dq2, q7);
        BigInteger bigIntegerAdd = bigIntegerModPow.subtract(bigIntegerModPow2).multiply(qInv).mod(p7).multiply(q7).add(bigIntegerModPow2);
        if (bigIntegerAdd.modPow(publicExponent, rSAPrivateCrtKeyParameters.getModulus()).equals(bigInteger)) {
            return bigIntegerAdd;
        }
        h2.b("RSA engine faulty decryption/signing detected");
        return null;
    }
}
