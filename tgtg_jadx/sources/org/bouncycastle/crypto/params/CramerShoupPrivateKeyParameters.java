package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private CramerShoupPublicKeyParameters f33204pk;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f33205x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f33206x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BigInteger f33207y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private BigInteger f33208y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BigInteger f33209z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f33205x1 = bigInteger;
        this.f33206x2 = bigInteger2;
        this.f33207y1 = bigInteger3;
        this.f33208y2 = bigInteger4;
        this.f33209z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f33205x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f33206x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f33207y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f33208y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f33209z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f33204pk;
    }

    public BigInteger getX1() {
        return this.f33205x1;
    }

    public BigInteger getX2() {
        return this.f33206x2;
    }

    public BigInteger getY1() {
        return this.f33207y1;
    }

    public BigInteger getY2() {
        return this.f33208y2;
    }

    public BigInteger getZ() {
        return this.f33209z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f33205x1.hashCode() ^ this.f33206x2.hashCode()) ^ this.f33207y1.hashCode()) ^ this.f33208y2.hashCode()) ^ this.f33209z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f33204pk = cramerShoupPublicKeyParameters;
    }
}
