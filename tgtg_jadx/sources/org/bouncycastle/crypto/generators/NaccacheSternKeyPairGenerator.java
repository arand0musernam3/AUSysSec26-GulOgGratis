package org.bouncycastle.crypto.generators;

import com.app.tgtg.model.local.AppConstants;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, AppConstants.GO_TO_GPS_SETTINGS, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, AppConstants.STATUS_CODE_UNAUTHORIZED, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i11) {
        Vector vector = new Vector(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i12]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i11, int i12, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i11, i12, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i11);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i11) {
        int iNextInt;
        int i12;
        if (((-i11) & i11) == i11) {
            return (int) ((((long) i11) * ((long) (secureRandom.nextInt() & Integer.MAX_VALUE))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i12 = iNextInt % i11;
        } while ((i11 - 1) + (iNextInt - i12) < 0);
        return i12;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i11 = 0; i11 < vector.size(); i11++) {
            vector3.addElement(vector.elementAt(i11));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j9;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z11;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigIntegerMod;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        int i11;
        PrintStream printStream;
        StringBuilder sb2;
        int i12;
        BigInteger bigIntegerCreateRandomPrime;
        SecureRandom secureRandom;
        int i13;
        SecureRandom secureRandom2;
        int i14;
        BigInteger bigInteger8;
        BigInteger bigInteger9;
        int i15;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply2 = ONE;
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2;
        for (int i16 = 0; i16 < vectorPermuteList.size() / 2; i16++) {
            bigIntegerMultiply3 = bigIntegerMultiply3.multiply((BigInteger) vectorPermuteList.elementAt(i16));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply4 = bigIntegerMultiply3.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply4.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply3).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j11 = 0;
        while (true) {
            j9 = j11 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply5 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z11 = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply5.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z11;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (BigIntegers.modOddIsCoprime(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2), bigIntegerMultiply4)) {
                    BigInteger bigInteger10 = bigIntegerShiftLeft;
                    bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerAdd2);
                    bigInteger3 = bigInteger10;
                    if (bigIntegerMultiply.bitLength() >= strength) {
                        break;
                    }
                    int i17 = strength;
                    secureRandom2 = random;
                    i14 = certainty;
                    bigInteger8 = bigIntegerGeneratePrime3;
                    bigInteger9 = bigIntegerGeneratePrime4;
                    if (z11) {
                        PrintStream printStream2 = System.out;
                        i15 = i17;
                        StringBuilder sbK = a.k(i15, "key size too small. Should be ", " but is actually ");
                        sbK.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sbK.toString());
                    } else {
                        i15 = i17;
                    }
                } else {
                    i15 = strength;
                    secureRandom2 = random;
                    i14 = certainty;
                    bigInteger3 = bigIntegerShiftLeft;
                    bigInteger9 = bigIntegerGeneratePrime4;
                    bigInteger8 = bigIntegerGeneratePrime3;
                }
            } else {
                secureRandom2 = random;
                i14 = certainty;
                z11 = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
                bigInteger3 = bigIntegerShiftLeft;
                bigInteger9 = bigIntegerGeneratePrime4;
                bigInteger8 = bigIntegerGeneratePrime3;
                i15 = strength;
            }
            bigIntegerGeneratePrime3 = bigInteger8;
            strength = i15;
            bigIntegerGeneratePrime4 = bigInteger9;
            j11 = j9;
            zIsDebug = z11;
            bigIntegerShiftLeft2 = bigInteger2;
            bigIntegerShiftLeft = bigInteger3;
            random = secureRandom2;
            certainty = i14;
        }
        BigInteger bigInteger11 = bigIntegerGeneratePrime4;
        if (z11) {
            bigInteger4 = bigIntegerGeneratePrime3;
            System.out.println("needed " + j9 + " tries to generate p and q.");
        } else {
            bigInteger4 = bigIntegerGeneratePrime3;
        }
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z11) {
            System.out.println("generating g");
        }
        long j12 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger5 = bigIntegerAdd2;
            int i18 = 0;
            while (i18 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i18));
                while (true) {
                    j12++;
                    i12 = i18;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    i13 = certainty;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply).equals(ONE)) {
                        i18 = i12;
                        random = secureRandom;
                        certainty = i13;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i18 = i12 + 1;
                random = secureRandom;
                certainty = i13;
            }
            SecureRandom secureRandom3 = random;
            int i19 = certainty;
            bigIntegerMod = ONE;
            for (int i21 = 0; i21 < vectorPermuteList.size(); i21++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i21)).modPow(bigIntegerMultiply4.divide((BigInteger) vectorPermuteList.elementAt(i21)), bigIntegerMultiply)).mod(bigIntegerMultiply);
            }
            int i22 = 0;
            while (true) {
                if (i22 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply);
                    BigInteger bigInteger12 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger12)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply).equals(bigInteger12)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply).equals(bigInteger12)) {
                                bigInteger6 = bigInteger4;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply).equals(bigInteger12)) {
                                    bigInteger7 = bigInteger11;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger7), bigIntegerMultiply).equals(bigInteger12)) {
                                        break;
                                    }
                                    if (z11) {
                                        i11 = strength;
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else {
                                    if (z11) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                    }
                                    bigInteger7 = bigInteger11;
                                }
                            } else if (z11) {
                                printStream = System.out;
                                sb2 = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb2.append(bigIntegerMod);
                                printStream.println(sb2.toString());
                            }
                        } else if (z11) {
                            printStream = System.out;
                            sb2 = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb2.append(bigIntegerMod);
                            printStream.println(sb2.toString());
                        }
                    } else if (z11) {
                        printStream = System.out;
                        sb2 = new StringBuilder("g has order phi(n)/4\n g:");
                        sb2.append(bigIntegerMod);
                        printStream.println(sb2.toString());
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i22)), bigIntegerMultiply).equals(ONE)) {
                    i22++;
                } else if (z11) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i22) + "\n g: " + bigIntegerMod);
                }
            }
            bigInteger7 = bigInteger11;
            bigInteger6 = bigInteger4;
            i11 = strength;
            bigInteger4 = bigInteger6;
            strength = i11;
            random = secureRandom3;
            certainty = i19;
            bigInteger11 = bigInteger7;
            bigIntegerAdd2 = bigInteger5;
        }
        if (z11) {
            System.out.println("needed " + j12 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply4 + " (" + bigIntegerMultiply4.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb3 = new StringBuilder("a:.......... ");
            sb3.append(bigInteger6);
            printStream3.println(sb3.toString());
            System.out.println("b:.......... " + bigInteger7);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigIntegerAdd);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + bigIntegerMultiply);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
