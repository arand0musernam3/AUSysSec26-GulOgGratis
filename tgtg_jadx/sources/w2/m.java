package w2;

import c5.f3;
import c5.z1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f42982b;

    public /* synthetic */ m(o oVar, int i11) {
        this.f42981a = i11;
        this.f42982b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f3 f3Var;
        switch (this.f42981a) {
            case 0:
                b5.m.d(this.f42982b);
                break;
            case 1:
                this.f42982b.f43004w.h(true);
                break;
            case 2:
                this.f42982b.f43004w.d(true);
                break;
            case 3:
                this.f42982b.f43004w.f();
                break;
            case 4:
                b5.m.d(this.f42982b);
                break;
            case 5:
                this.f42982b.f43004w.p();
                break;
            case 6:
                o oVar = this.f42982b;
                oVar.f43000s.f28839w.f28916b.f28834r.b(oVar.f43005x.f37693e);
                break;
            default:
                o oVar2 = this.f42982b;
                m2.e1 e1Var = oVar2.f43000s;
                g4.v vVar = oVar2.f43006y;
                boolean z11 = oVar2.f43001t;
                if (!e1Var.b()) {
                    g4.v.a(vVar);
                } else if (!z11 && (f3Var = e1Var.f28820c) != null) {
                    ((z1) f3Var).b();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
