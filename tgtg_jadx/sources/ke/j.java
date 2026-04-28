package ke;

import android.graphics.PointF;
import com.braze.h2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f26320j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i11) {
        super(list);
        this.f26319i = i11;
        switch (i11) {
            case 1:
                super(list);
                this.f26320j = new PointF();
                break;
            case 2:
                super(list);
                this.f26320j = new we.c();
                break;
            default:
                int iMax = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    qe.c cVar = (qe.c) ((we.a) list.get(i12)).f43388b;
                    if (cVar != null) {
                        iMax = Math.max(iMax, cVar.f36956b.length);
                    }
                }
                this.f26320j = new qe.c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // ke.e
    public final Object g(we.a aVar, float f11) {
        Object obj;
        float f12;
        switch (this.f26319i) {
            case 0:
                qe.c cVar = (qe.c) this.f26320j;
                qe.c cVar2 = (qe.c) aVar.f43388b;
                qe.c cVar3 = (qe.c) aVar.f43389c;
                int[] iArr = cVar.f36956b;
                float[] fArr = cVar.f36955a;
                boolean zEquals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f36956b;
                if (zEquals) {
                    cVar.a(cVar2);
                    return cVar;
                }
                if (f11 <= 0.0f) {
                    cVar.a(cVar2);
                    return cVar;
                }
                if (f11 >= 1.0f) {
                    cVar.a(cVar3);
                    return cVar;
                }
                int length = iArr2.length;
                int[] iArr3 = cVar3.f36956b;
                if (length != iArr3.length) {
                    StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                    sb2.append(iArr2.length);
                    sb2.append(" vs ");
                    i4.a.f(r8.k.i(iArr3.length, ")", sb2));
                    return null;
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    fArr[i11] = ve.g.f(cVar2.f36955a[i11], cVar3.f36955a[i11], f11);
                    iArr[i11] = h0.g.n(iArr2[i11], f11, iArr3[i11]);
                }
                for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                    fArr[length2] = fArr[iArr2.length - 1];
                    iArr[length2] = iArr[iArr2.length - 1];
                }
                return cVar;
            case 1:
                return m(aVar, f11, f11, f11);
            default:
                we.c cVar4 = (we.c) this.f26320j;
                Object obj2 = aVar.f43388b;
                if (obj2 == null || (obj = aVar.f43389c) == null) {
                    h2.b("Missing values for keyframe.");
                    return null;
                }
                we.c cVar5 = (we.c) obj2;
                we.c cVar6 = (we.c) obj;
                ub.a aVar2 = this.f26305e;
                if (aVar2 != null) {
                    f12 = f11;
                    we.c cVar7 = (we.c) aVar2.x(aVar.f43393g, aVar.f43394h.floatValue(), cVar5, cVar6, f12, e(), this.f26304d);
                    if (cVar7 != null) {
                        return cVar7;
                    }
                } else {
                    f12 = f11;
                }
                float f13 = ve.g.f(cVar5.f43409a, cVar6.f43409a, f12);
                float f14 = ve.g.f(cVar5.f43410b, cVar6.f43410b, f12);
                cVar4.f43409a = f13;
                cVar4.f43410b = f14;
                return cVar4;
        }
    }

    @Override // ke.e
    public /* bridge */ /* synthetic */ Object h(we.a aVar, float f11, float f12, float f13) {
        switch (this.f26319i) {
            case 1:
                return m(aVar, f11, f12, f13);
            default:
                return super.h(aVar, f11, f12, f13);
        }
    }

    public PointF m(we.a aVar, float f11, float f12, float f13) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.f26320j;
        Object obj2 = aVar.f43388b;
        if (obj2 == null || (obj = aVar.f43389c) == null) {
            h2.b("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        ub.a aVar2 = this.f26305e;
        if (aVar2 != null && (pointF = (PointF) aVar2.x(aVar.f43393g, aVar.f43394h.floatValue(), pointF3, pointF4, f11, e(), this.f26304d)) != null) {
            return pointF;
        }
        float f14 = pointF3.x;
        float fA = j4.s.a(pointF4.x, f14, f12, f14);
        float f15 = pointF3.y;
        pointF2.set(fA, j4.s.a(pointF4.y, f15, f13, f15));
        return pointF2;
    }
}
