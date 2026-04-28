package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    private BigInteger dP;
    private BigInteger dQ;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BigInteger f33256e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33258q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, false);
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getDQ() {
        return this.dQ;
    }

    public BigInteger getP() {
        return this.f33257p;
    }

    public BigInteger getPublicExponent() {
        return this.f33256e;
    }

    public BigInteger getQ() {
        return this.f33258q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, boolean z11) {
        super(true, bigInteger, bigInteger3, z11);
        this.f33256e = bigInteger2;
        this.f33257p = bigInteger4;
        this.f33258q = bigInteger5;
        this.dP = bigInteger6;
        this.dQ = bigInteger7;
        this.qInv = bigInteger8;
    }
}
