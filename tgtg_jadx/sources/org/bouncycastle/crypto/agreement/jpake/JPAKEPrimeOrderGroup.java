package org.bouncycastle.crypto.agreement.jpake;

import com.braze.Constants;
import i4.a;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class JPAKEPrimeOrderGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BigInteger f33029g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BigInteger f33030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f33031q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z11) {
        JPAKEUtil.validateNotNull(bigInteger, Constants.BRAZE_PUSH_PRIORITY_KEY);
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z11) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                a.f("p-1 must be evenly divisible by q");
                throw null;
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) == 1) {
                a.f("g must be in [2, p-1]");
                throw null;
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                a.f("g^q mod p must equal 1");
                throw null;
            }
            if (!bigInteger.isProbablePrime(20)) {
                a.f("p must be prime");
                throw null;
            }
            if (!bigInteger2.isProbablePrime(20)) {
                a.f("q must be prime");
                throw null;
            }
        }
        this.f33030p = bigInteger;
        this.f33031q = bigInteger2;
        this.f33029g = bigInteger3;
    }

    public BigInteger getG() {
        return this.f33029g;
    }

    public BigInteger getP() {
        return this.f33030p;
    }

    public BigInteger getQ() {
        return this.f33031q;
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }
}
