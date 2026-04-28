package org.bouncycastle.crypto.params;

import c50.w;
import com.braze.Constants;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class ECDomainParameters implements ECConstants {
    private final ECPoint G;
    private final ECCurve curve;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BigInteger f33229h;
    private BigInteger hInv;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BigInteger f33230n;
    private final byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            w.l("curve");
            throw null;
        }
        if (bigInteger == null) {
            w.l(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
            throw null;
        }
        this.curve = eCCurve;
        this.G = validatePublicPoint(eCCurve, eCPoint);
        this.f33230n = bigInteger;
        this.f33229h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        String str;
        if (eCPoint == null) {
            w.l("Point cannot be null");
            return null;
        }
        ECPoint eCPointNormalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (eCPointNormalize.isInfinity()) {
            str = "Point at infinity";
        } else {
            if (eCPointNormalize.isValid()) {
                return eCPointNormalize;
            }
            str = "Point not on curve";
        }
        a.f(str);
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.G.equals(eCDomainParameters.G) && this.f33230n.equals(eCDomainParameters.f33230n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.f33229h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.f33230n, this.f33229h);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f33230n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * 257) ^ this.G.hashCode()) * 257) ^ this.f33230n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            w.l("Scalar cannot be null");
            return null;
        }
        if (bigInteger.compareTo(ECConstants.ONE) >= 0 && bigInteger.compareTo(getN()) < 0) {
            return bigInteger;
        }
        a.f("Scalar is not in the interval [1, n - 1]");
        return null;
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }
}
