package org.bouncycastle.crypto.params;

import i4.a;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f33225y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.f33225y = validate(bigInteger, dSAParameters);
    }

    private BigInteger validate(BigInteger bigInteger, DSAParameters dSAParameters) {
        if (dSAParameters == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = TWO;
        if (bigInteger2.compareTo(bigInteger) <= 0 && dSAParameters.getP().subtract(bigInteger2).compareTo(bigInteger) >= 0 && ONE.equals(bigInteger.modPow(dSAParameters.getQ(), dSAParameters.getP()))) {
            return bigInteger;
        }
        a.f("y value does not appear to be in correct group");
        return null;
    }

    public BigInteger getY() {
        return this.f33225y;
    }
}
