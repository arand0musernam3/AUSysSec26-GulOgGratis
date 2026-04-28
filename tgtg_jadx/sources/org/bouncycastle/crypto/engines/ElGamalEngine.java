package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import m0.i1;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalEngine implements AsymmetricBlockCipher {
    private int bitSize;
    private boolean forEncryption;
    private ElGamalKeyParameters key;
    private SecureRandom random;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        boolean z11 = this.forEncryption;
        int i11 = this.bitSize;
        return z11 ? (i11 - 1) / 8 : ((i11 + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        boolean z11 = this.forEncryption;
        int i11 = this.bitSize;
        return z11 ? ((i11 + 7) / 8) * 2 : (i11 - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (ElGamalKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.key = (ElGamalKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.forEncryption = z11;
        this.bitSize = this.key.getParameters().getP().bitLength();
        ElGamalKeyParameters elGamalKeyParameters = this.key;
        if (z11) {
            if (!(elGamalKeyParameters instanceof ElGamalPublicKeyParameters)) {
                a.f("ElGamalPublicKeyParameters are required for encryption.");
                return;
            }
        } else if (!(elGamalKeyParameters instanceof ElGamalPrivateKeyParameters)) {
            a.f("ElGamalPrivateKeyParameters are required for decryption.");
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSA", ConstraintUtils.bitsOfSecurityFor(this.key.getParameters().getP()), this.key, Utils.getPurpose(z11)));
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        BigInteger bigIntegerCreateRandomBigInteger;
        if (this.key == null) {
            h2.b("ElGamal engine not initialised");
            return null;
        }
        if (i12 > (this.forEncryption ? (this.bitSize + 6) / 8 : getInputBlockSize())) {
            i1.t("input too large for ElGamal cipher.\n");
            return null;
        }
        BigInteger p7 = this.key.getParameters().getP();
        if (this.key instanceof ElGamalPrivateKeyParameters) {
            int i13 = i12 / 2;
            byte[] bArr2 = new byte[i13];
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr, i11, bArr2, 0, i13);
            System.arraycopy(bArr, i11 + i13, bArr3, 0, i13);
            return BigIntegers.asUnsignedByteArray(new BigInteger(1, bArr2).modPow(p7.subtract(ONE).subtract(((ElGamalPrivateKeyParameters) this.key).getX()), p7).multiply(new BigInteger(1, bArr3)).mod(p7));
        }
        if (i11 != 0 || i12 != bArr.length) {
            byte[] bArr4 = new byte[i12];
            System.arraycopy(bArr, i11, bArr4, 0, i12);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p7) >= 0) {
            i1.t("input too large for ElGamal cipher.\n");
            return null;
        }
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) this.key;
        int iBitLength = p7.bitLength();
        while (true) {
            bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.random);
            if (!bigIntegerCreateRandomBigInteger.equals(ZERO) && bigIntegerCreateRandomBigInteger.compareTo(p7.subtract(TWO)) <= 0) {
                break;
            }
        }
        BigInteger bigIntegerModPow = this.key.getParameters().getG().modPow(bigIntegerCreateRandomBigInteger, p7);
        BigInteger bigIntegerMod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(bigIntegerCreateRandomBigInteger, p7)).mod(p7);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i14 = outputBlockSize / 2;
        if (byteArray.length > i14) {
            System.arraycopy(byteArray, 1, bArr5, i14 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i14 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i14) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        return bArr5;
    }
}
