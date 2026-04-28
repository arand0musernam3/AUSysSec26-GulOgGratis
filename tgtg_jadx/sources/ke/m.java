package ke;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f26323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f26324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f26325k;
    public final PathMeasure l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f26326m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.f26323i = new PointF();
        this.f26324j = new float[2];
        this.f26325k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // ke.e
    public final Object g(we.a aVar, float f11) {
        float f12;
        l lVar = (l) aVar;
        Path path = lVar.f26321q;
        ub.a aVar2 = this.f26305e;
        if (aVar2 == null || aVar.f43394h == null) {
            f12 = f11;
        } else {
            f12 = f11;
            PointF pointF = (PointF) aVar2.x(lVar.f43393g, lVar.f43394h.floatValue(), (PointF) lVar.f43388b, (PointF) lVar.f43389c, e(), f12, this.f26304d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f43388b;
        }
        l lVar2 = this.f26326m;
        PathMeasure pathMeasure = this.l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f26326m = lVar;
        }
        float length = pathMeasure.getLength();
        float f13 = f12 * length;
        float[] fArr = this.f26324j;
        float[] fArr2 = this.f26325k;
        pathMeasure.getPosTan(f13, fArr, fArr2);
        float f14 = fArr[0];
        float f15 = fArr[1];
        PointF pointF2 = this.f26323i;
        pointF2.set(f14, f15);
        if (f13 < 0.0f) {
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
            return pointF2;
        }
        if (f13 > length) {
            float f16 = f13 - length;
            pointF2.offset(fArr2[0] * f16, fArr2[1] * f16);
        }
        return pointF2;
    }
}
