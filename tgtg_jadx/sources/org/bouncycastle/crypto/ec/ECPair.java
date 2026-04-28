package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPair {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ECPoint f33076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ECPoint f33077y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f33076x = eCPoint;
        this.f33077y = eCPoint2;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f33076x;
    }

    public ECPoint getY() {
        return this.f33077y;
    }

    public int hashCode() {
        return (this.f33077y.hashCode() * 37) + this.f33076x.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }
}
