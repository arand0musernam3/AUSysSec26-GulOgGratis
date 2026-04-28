package org.bouncycastle.math.ec;

import i4.a;
import java.math.BigInteger;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class GLVMultiplier extends AbstractECMultiplier {
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            a.f("Need curve with known group order");
            throw null;
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }

    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            y.e();
            return null;
        }
        BigInteger[] bigIntegerArrDecomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = bigIntegerArrDecomposeScalar[0];
        BigInteger bigInteger3 = bigIntegerArrDecomposeScalar[1];
        boolean zHasEfficientPointMap = this.glvEndomorphism.hasEfficientPointMap();
        GLVEndomorphism gLVEndomorphism = this.glvEndomorphism;
        return zHasEfficientPointMap ? ECAlgorithms.implShamirsTrickWNaf(gLVEndomorphism, eCPoint, bigInteger2, bigInteger3) : ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, EndoUtil.mapPoint(gLVEndomorphism, eCPoint), bigInteger3);
    }
}
