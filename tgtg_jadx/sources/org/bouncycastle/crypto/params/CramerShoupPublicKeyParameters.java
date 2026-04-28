package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f33210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f33211d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f33212h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f33210c = bigInteger;
        this.f33211d = bigInteger2;
        this.f33212h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f33210c) && cramerShoupPublicKeyParameters.getD().equals(this.f33211d) && cramerShoupPublicKeyParameters.getH().equals(this.f33212h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f33210c;
    }

    public BigInteger getD() {
        return this.f33211d;
    }

    public BigInteger getH() {
        return this.f33212h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f33210c.hashCode() ^ this.f33211d.hashCode()) ^ this.f33212h.hashCode()) ^ super.hashCode();
    }
}
