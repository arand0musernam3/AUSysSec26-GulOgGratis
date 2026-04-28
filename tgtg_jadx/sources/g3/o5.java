package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.c3 f19213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3.c3 f19214c;

    public /* synthetic */ o5(m3.c3 c3Var, m3.c3 c3Var2, int i11) {
        this.f19212a = i11;
        this.f19213b = c3Var;
        this.f19214c = c3Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19212a) {
            case 0:
                k4.d dVar = (k4.d) obj;
                float fC0 = dVar.c0(q5.f19356c);
                m3.c3 c3Var = this.f19213b;
                float f11 = 2;
                float f12 = fC0 / f11;
                k4.d.w0(dVar, ((i4.v) c3Var.getValue()).f23317a, dVar.c0(l3.p0.f27095c / f11) - f12, 0L, new k4.h(fC0, 0.0f, 0, 0, null, 30), 108);
                m3.c3 c3Var2 = this.f19214c;
                if (z5.f.a(((z5.f) c3Var2.getValue()).f47277a, 0) > 0) {
                    k4.d.w0(dVar, ((i4.v) c3Var.getValue()).f23317a, dVar.c0(((z5.f) c3Var2.getValue()).f47277a) - f12, 0L, k4.g.f25943a, 108);
                }
                break;
            default:
                i4.s0 s0Var = (i4.s0) obj;
                m3.c3 c3Var3 = this.f19213b;
                s0Var.o(((Number) c3Var3.getValue()).floatValue());
                s0Var.p(((Number) c3Var3.getValue()).floatValue());
                s0Var.c(((Number) this.f19214c.getValue()).floatValue());
                break;
        }
        return Unit.f26487a;
    }
}
