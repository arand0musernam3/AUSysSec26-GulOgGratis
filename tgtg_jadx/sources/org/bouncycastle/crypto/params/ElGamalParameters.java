package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f33233g;
    private int l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33234p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f33233g = bigInteger2;
        this.f33234p = bigInteger;
        this.l = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f33234p) && elGamalParameters.getG().equals(this.f33233g) && elGamalParameters.getL() == this.l;
    }

    public BigInteger getG() {
        return this.f33233g;
    }

    public int getL() {
        return this.l;
    }

    public BigInteger getP() {
        return this.f33234p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }
}
