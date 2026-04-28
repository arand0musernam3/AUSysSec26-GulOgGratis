package ke;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    @Override // ke.e
    public final Object g(we.a aVar, float f11) {
        return Float.valueOf(n(aVar, f11));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(we.a aVar, float f11) {
        float f12;
        Object obj = aVar.f43388b;
        Object obj2 = aVar.f43388b;
        if (obj == null || aVar.f43389c == null) {
            h2.b("Missing values for keyframe.");
            return 0.0f;
        }
        ub.a aVar2 = this.f26305e;
        if (aVar2 != null) {
            f12 = f11;
            Float f13 = (Float) aVar2.x(aVar.f43393g, aVar.f43394h.floatValue(), (Float) obj2, (Float) aVar.f43389c, f12, e(), this.f26304d);
            if (f13 != null) {
                return f13.floatValue();
            }
        } else {
            f12 = f11;
        }
        if (aVar.f43395i == -3987645.8f) {
            aVar.f43395i = ((Float) obj2).floatValue();
        }
        float f14 = aVar.f43395i;
        if (aVar.f43396j == -3987645.8f) {
            aVar.f43396j = ((Float) aVar.f43389c).floatValue();
        }
        return ve.g.f(f14, aVar.f43396j, f12);
    }
}
