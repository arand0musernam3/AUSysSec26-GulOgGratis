package org.bouncycastle.crypto.prng.drbg;

import i4.a;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class DualECPoints {
    private final int cofactor;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ECPoint f33267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ECPoint f33268q;
    private final int securityStrength;

    public DualECPoints(int i11, ECPoint eCPoint, ECPoint eCPoint2, int i12) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            a.f("points need to be on the same curve");
            throw null;
        }
        this.securityStrength = i11;
        this.f33267p = eCPoint;
        this.f33268q = eCPoint2;
        this.cofactor = i12;
    }

    private static int log2(int i11) {
        int i12 = 0;
        while (true) {
            i11 >>= 1;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f33267p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f33267p;
    }

    public ECPoint getQ() {
        return this.f33268q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f33267p.getCurve().getFieldSize();
    }
}
