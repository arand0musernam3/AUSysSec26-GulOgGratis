package org.bouncycastle.crypto.agreement.ecjpake;

import com.braze.Constants;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECJPAKECurve {
    private final ECCurve.AbstractFp curve;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ECPoint f33013g;

    public ECJPAKECurve(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7) {
        ECJPAKEUtil.validateNotNull(bigInteger2, Constants.BRAZE_PUSH_CONTENT_KEY);
        ECJPAKEUtil.validateNotNull(bigInteger3, "b");
        ECJPAKEUtil.validateNotNull(bigInteger, "q");
        ECJPAKEUtil.validateNotNull(bigInteger4, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
        ECJPAKEUtil.validateNotNull(bigInteger5, "h");
        ECJPAKEUtil.validateNotNull(bigInteger6, "g_x");
        ECJPAKEUtil.validateNotNull(bigInteger7, "g_y");
        if (!bigInteger.isProbablePrime(20)) {
            a.f("Field size q must be prime");
            throw null;
        }
        BigInteger bigInteger8 = BigInteger.ZERO;
        if (bigInteger2.compareTo(bigInteger8) < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            a.f("The parameter 'a' is not in the field [0, q-1]");
            throw null;
        }
        if (bigInteger3.compareTo(bigInteger8) < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            a.f("The parameter 'b' is not in the field [0, q-1]");
            throw null;
        }
        if (calculateDeterminant(bigInteger, bigInteger2, bigInteger3).equals(bigInteger8)) {
            a.f("The curve is singular, i.e the discriminant is equal to 0 mod q.");
            throw null;
        }
        if (!bigInteger4.isProbablePrime(20)) {
            a.f("The order n must be prime");
            throw null;
        }
        ECCurve.Fp fp = new ECCurve.Fp(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
        ECPoint eCPointCreatePoint = fp.createPoint(bigInteger6, bigInteger7);
        if (!eCPointCreatePoint.isValid()) {
            a.f("The base point G does not lie on the curve.");
            throw null;
        }
        this.curve = fp;
        this.f33013g = eCPointCreatePoint;
    }

    private static BigInteger calculateDeterminant(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger2).mod(bigInteger).multiply(bigInteger2).mod(bigInteger).shiftLeft(2).add(bigInteger3.multiply(bigInteger3).mod(bigInteger).multiply(BigInteger.valueOf(27L))).mod(bigInteger);
    }

    public BigInteger getA() {
        return this.curve.getA().toBigInteger();
    }

    public BigInteger getB() {
        return this.curve.getB().toBigInteger();
    }

    public ECCurve.AbstractFp getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f33013g;
    }

    public BigInteger getH() {
        return this.curve.getCofactor();
    }

    public BigInteger getN() {
        return this.curve.getOrder();
    }

    public BigInteger getQ() {
        return this.curve.getQ();
    }

    public ECJPAKECurve(ECCurve.AbstractFp abstractFp, ECPoint eCPoint) {
        ECJPAKEUtil.validateNotNull(abstractFp, "curve");
        ECJPAKEUtil.validateNotNull(eCPoint, "g");
        ECJPAKEUtil.validateNotNull(abstractFp.getOrder(), Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
        ECJPAKEUtil.validateNotNull(abstractFp.getCofactor(), "h");
        this.curve = abstractFp;
        this.f33013g = eCPoint;
    }
}
