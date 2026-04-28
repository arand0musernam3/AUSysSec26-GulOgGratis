package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f18586b;

    public /* synthetic */ f1(h1 h1Var, int i11) {
        this.f18585a = i11;
        this.f18586b = h1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f3.b bVar;
        int i11 = this.f18585a;
        h1 h1Var = this.f18586b;
        switch (i11) {
            case 0:
                r5 r5Var = (r5) b5.o.e(h1Var, s5.f19473a);
                f3.a aVar = h1Var.f18715u;
                if (r5Var == null) {
                    if (aVar != null) {
                        h1Var.M0(aVar);
                    }
                    h1Var.f18715u = null;
                } else if (aVar == null) {
                    g1 g1Var = new g1(h1Var, 0);
                    f1 f1Var = new f1(h1Var, 1);
                    b2.k kVar = h1Var.f18711q;
                    boolean z11 = h1Var.f18712r;
                    float f11 = h1Var.f18713s;
                    t1.u1 u1Var = f3.f.f17264a;
                    f3.a aVar2 = new f3.a(kVar, z11, f11, g1Var, f1Var);
                    h1Var.L0(aVar2);
                    h1Var.f18715u = aVar2;
                }
                return Unit.f26487a;
            default:
                r5 r5Var2 = (r5) b5.o.e(h1Var, s5.f19473a);
                return (r5Var2 == null || (bVar = r5Var2.f19413b) == null) ? s0.f19453k : bVar;
        }
    }
}
