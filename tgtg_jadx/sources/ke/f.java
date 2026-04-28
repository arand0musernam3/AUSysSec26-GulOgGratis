package ke;

import android.graphics.PointF;
import com.braze.h2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26309i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i11) {
        super(list);
        this.f26309i = i11;
    }

    @Override // ke.e
    public final Object g(we.a aVar, float f11) {
        int i11;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.f26309i) {
            case 0:
                return Integer.valueOf(m(aVar, f11));
            case 1:
                Object obj2 = aVar.f43388b;
                if (obj2 == null) {
                    h2.b("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = aVar.f43389c;
                if (obj3 == null) {
                    if (aVar.f43397k == 784923401) {
                        aVar.f43397k = ((Integer) obj2).intValue();
                    }
                    i11 = aVar.f43397k;
                } else {
                    if (aVar.l == 784923401) {
                        aVar.l = ((Integer) obj3).intValue();
                    }
                    i11 = aVar.l;
                }
                int i12 = i11;
                ub.a aVar2 = this.f26305e;
                if (aVar2 == null || (num = (Integer) aVar2.x(aVar.f43393g, aVar.f43394h.floatValue(), (Integer) obj2, Integer.valueOf(i12), f11, e(), this.f26304d)) == null) {
                    if (aVar.f43397k == 784923401) {
                        aVar.f43397k = ((Integer) obj2).intValue();
                    }
                    int i13 = aVar.f43397k;
                    PointF pointF = ve.g.f42266a;
                    iIntValue = (int) (((i12 - i13) * f11) + i13);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = aVar.f43388b;
                ub.a aVar3 = this.f26305e;
                if (aVar3 == null) {
                    return (f11 != 1.0f || (obj = aVar.f43389c) == null) ? (oe.c) obj4 : (oe.c) obj;
                }
                float f12 = aVar.f43393g;
                Float f13 = aVar.f43394h;
                float fFloatValue = f13 == null ? Float.MAX_VALUE : f13.floatValue();
                oe.c cVar = (oe.c) obj4;
                Object obj5 = aVar.f43389c;
                return (oe.c) aVar3.x(f12, fFloatValue, cVar, obj5 == null ? cVar : (oe.c) obj5, f11, d(), this.f26304d);
        }
    }

    public int m(we.a aVar, float f11) {
        float f12;
        Float f13;
        Object obj = aVar.f43388b;
        Object obj2 = aVar.f43388b;
        if (obj == null || aVar.f43389c == null) {
            h2.b("Missing values for keyframe.");
            return 0;
        }
        ub.a aVar2 = this.f26305e;
        if (aVar2 == null || (f13 = aVar.f43394h) == null) {
            f12 = f11;
        } else {
            f12 = f11;
            Integer num = (Integer) aVar2.x(aVar.f43393g, f13.floatValue(), (Integer) obj2, (Integer) aVar.f43389c, f12, e(), this.f26304d);
            if (num != null) {
                return num.intValue();
            }
        }
        return h0.g.n(((Integer) obj2).intValue(), ve.g.b(f12, 0.0f, 1.0f), ((Integer) aVar.f43389c).intValue());
    }
}
