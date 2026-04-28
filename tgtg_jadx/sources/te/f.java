package te;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f40072b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f40073c = new f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f40074d = new f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f40075e = new f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f40076f = new f(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f40077g = new f(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40078a;

    public /* synthetic */ f(int i11) {
        this.f40078a = i11;
    }

    @Override // te.f0
    public final Object f(ue.d dVar, float f11) {
        switch (this.f40078a) {
            case 0:
                boolean z11 = dVar.H() == ue.c.BEGIN_ARRAY;
                if (z11) {
                    dVar.a();
                }
                double dA = dVar.A();
                double dA2 = dVar.A();
                double dA3 = dVar.A();
                double dA4 = dVar.H() == ue.c.NUMBER ? dVar.A() : 1.0d;
                if (z11) {
                    dVar.g();
                }
                if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
                    dA *= 255.0d;
                    dA2 *= 255.0d;
                    dA3 *= 255.0d;
                    if (dA4 <= 1.0d) {
                        dA4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
            case 1:
                return Float.valueOf(o.d(dVar) * f11);
            case 2:
                return Integer.valueOf(Math.round(o.d(dVar) * f11));
            case 3:
                return o.b(dVar, f11);
            case 4:
                ue.c cVarH = dVar.H();
                if (cVarH == ue.c.BEGIN_ARRAY) {
                    return o.b(dVar, f11);
                }
                if (cVarH == ue.c.BEGIN_OBJECT) {
                    return o.b(dVar, f11);
                }
                if (cVarH != ue.c.NUMBER) {
                    j4.d.o(cVarH, "Cannot convert json to point. Next token is ");
                    return null;
                }
                PointF pointF = new PointF(((float) dVar.A()) * f11, ((float) dVar.A()) * f11);
                while (dVar.t()) {
                    dVar.O();
                }
                return pointF;
            default:
                boolean z12 = dVar.H() == ue.c.BEGIN_ARRAY;
                if (z12) {
                    dVar.a();
                }
                float fA = (float) dVar.A();
                float fA2 = (float) dVar.A();
                while (dVar.t()) {
                    dVar.O();
                }
                if (z12) {
                    dVar.g();
                }
                return new we.c((fA / 100.0f) * f11, (fA2 / 100.0f) * f11);
        }
    }
}
