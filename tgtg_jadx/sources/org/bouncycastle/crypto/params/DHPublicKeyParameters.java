package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes3.dex */
public class DHPublicKeyParameters extends DHKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f33219y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f33219y = validate(bigInteger, dHParameters);
    }

    private static int legendre(BigInteger bigInteger, BigInteger bigInteger2) {
        int iBitLength = bigInteger2.bitLength();
        int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
        int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
        int length = iArrFromBigInteger2.length;
        int i11 = 0;
        while (true) {
            int i12 = iArrFromBigInteger[0];
            if (i12 == 0) {
                Nat.shiftDownWord(length, iArrFromBigInteger, 0);
            } else {
                int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i12);
                if (iNumberOfTrailingZeros > 0) {
                    Nat.shiftDownBits(length, iArrFromBigInteger, iNumberOfTrailingZeros, 0);
                    int i13 = iArrFromBigInteger2[0];
                    i11 ^= (iNumberOfTrailingZeros << 1) & (i13 ^ (i13 >>> 1));
                }
                int iCompare = Nat.compare(length, iArrFromBigInteger, iArrFromBigInteger2);
                if (iCompare == 0) {
                    break;
                }
                if (iCompare < 0) {
                    i11 ^= iArrFromBigInteger[0] & iArrFromBigInteger2[0];
                    int[] iArr = iArrFromBigInteger2;
                    iArrFromBigInteger2 = iArrFromBigInteger;
                    iArrFromBigInteger = iArr;
                }
                while (true) {
                    int i14 = length - 1;
                    if (iArrFromBigInteger[i14] != 0) {
                        break;
                    }
                    length = i14;
                }
                Nat.sub(length, iArrFromBigInteger, iArrFromBigInteger2, iArrFromBigInteger);
            }
        }
        if (Nat.isOne(length, iArrFromBigInteger2)) {
            return 1 - (i11 & 2);
        }
        return 0;
    }

    private BigInteger validate(BigInteger bigInteger, DHParameters dHParameters) {
        String str;
        if (bigInteger == null) {
            w.l("y value cannot be null");
            return null;
        }
        BigInteger p7 = dHParameters.getP();
        BigInteger bigInteger2 = TWO;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(p7.subtract(bigInteger2)) > 0) {
            str = "invalid DH public key";
        } else {
            BigInteger q7 = dHParameters.getQ();
            if (q7 == null || (!(p7.testBit(0) && p7.bitLength() - 1 == q7.bitLength() && p7.shiftRight(1).equals(q7)) ? !ONE.equals(bigInteger.modPow(q7, p7)) : 1 != legendre(bigInteger, p7))) {
                return bigInteger;
            }
            str = "Y value does not appear to be in correct group";
        }
        a.f(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f33219y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f33219y;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f33219y.hashCode() ^ super.hashCode();
    }
}
