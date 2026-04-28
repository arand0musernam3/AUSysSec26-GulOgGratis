package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f33221g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33223q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f33221g = bigInteger3;
        this.f33222p = bigInteger;
        this.f33223q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f33222p) && dSAParameters.getQ().equals(this.f33223q) && dSAParameters.getG().equals(this.f33221g);
    }

    public BigInteger getG() {
        return this.f33221g;
    }

    public BigInteger getP() {
        return this.f33222p;
    }

    public BigInteger getQ() {
        return this.f33223q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f33221g = bigInteger3;
        this.f33222p = bigInteger;
        this.f33223q = bigInteger2;
    }
}
