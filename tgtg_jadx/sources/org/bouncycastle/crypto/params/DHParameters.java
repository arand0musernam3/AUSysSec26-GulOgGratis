package org.bouncycastle.crypto.params;

import i4.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f33213g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BigInteger f33214j;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33215m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33217q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i12 != 0) {
            if (i12 > bigInteger.bitLength()) {
                a.f("when l value specified, it must satisfy 2^(l-1) <= p");
                throw null;
            }
            if (i12 < i11) {
                a.f("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        if (i11 > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            a.f("unsafe p value so small specific l required");
            throw null;
        }
        this.f33213g = bigInteger2;
        this.f33216p = bigInteger;
        this.f33217q = bigInteger3;
        this.f33215m = i11;
        this.l = i12;
        this.f33214j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    private static int getDefaultMParam(int i11) {
        return (i11 != 0 && i11 < DEFAULT_MINIMUM_LENGTH) ? i11 : DEFAULT_MINIMUM_LENGTH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f33216p) && dHParameters.getG().equals(this.f33213g);
    }

    public BigInteger getG() {
        return this.f33213g;
    }

    public BigInteger getJ() {
        return this.f33214j;
    }

    public int getL() {
        return this.l;
    }

    public int getM() {
        return this.f33215m;
    }

    public BigInteger getP() {
        return this.f33216p;
    }

    public BigInteger getQ() {
        return this.f33217q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i11), i11, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12) {
        this(bigInteger, bigInteger2, bigInteger3, i11, i12, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, DEFAULT_MINIMUM_LENGTH, 0, bigInteger4, dHValidationParameters);
    }
}
