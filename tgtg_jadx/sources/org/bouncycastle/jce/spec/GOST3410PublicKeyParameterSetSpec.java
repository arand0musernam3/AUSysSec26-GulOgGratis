package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f33344a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33346q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f33345p = bigInteger;
        this.f33346q = bigInteger2;
        this.f33344a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f33344a.equals(gOST3410PublicKeyParameterSetSpec.f33344a) && this.f33345p.equals(gOST3410PublicKeyParameterSetSpec.f33345p) && this.f33346q.equals(gOST3410PublicKeyParameterSetSpec.f33346q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f33344a;
    }

    public BigInteger getP() {
        return this.f33345p;
    }

    public BigInteger getQ() {
        return this.f33346q;
    }

    public int hashCode() {
        return (this.f33344a.hashCode() ^ this.f33345p.hashCode()) ^ this.f33346q.hashCode();
    }
}
