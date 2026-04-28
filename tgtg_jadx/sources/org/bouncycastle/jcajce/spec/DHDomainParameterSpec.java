package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class DHDomainParameterSpec extends DHParameterSpec {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BigInteger f33311j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f33312m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f33313q;
    private DHValidationParameters validationParameters;

    public DHDomainParameterSpec(DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.validationParameters = dHParameters.getValidationParameters();
    }

    public DHParameters getDomainParameters() {
        return new DHParameters(getP(), getG(), this.f33313q, this.f33312m, getL(), this.f33311j, this.validationParameters);
    }

    public BigInteger getJ() {
        return this.f33311j;
    }

    public int getM() {
        return this.f33312m;
    }

    public BigInteger getQ() {
        return this.f33313q;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, null, i11);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i11);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11, int i12) {
        super(bigInteger, bigInteger3, i12);
        this.f33313q = bigInteger2;
        this.f33311j = bigInteger4;
        this.f33312m = i11;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }
}
