package w2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f43086b;

    public /* synthetic */ z0(e1 e1Var, int i11) {
        this.f43085a = i11;
        this.f43086b = e1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43085a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e1 e1Var = this.f43086b;
                boolean z11 = e1Var.f42881t;
                if (!zBooleanValue) {
                    e1Var.P0();
                    s1 s1Var = e1Var.f42878q;
                    v2.h hVar = s1Var.f43043a;
                    y2.c cVar = y2.c.MergeIfPossible;
                    hVar.f41936b.a().m();
                    v2.a aVar = hVar.f41936b;
                    aVar.e(null);
                    s1Var.l(aVar);
                    v2.h.a(hVar, true, cVar);
                    e1Var.f42878q.a();
                } else if (z11) {
                    e1Var.T0(false);
                }
                b5.o.m(e1Var, new y0(e1Var, 3));
                return Unit.f26487a;
            case 1:
                x1.a.a(this.f43086b);
                return Unit.f26487a;
            case 2:
                b2.h hVar2 = new b2.h();
                e1 e1Var2 = this.f43086b;
                e1Var2.f42884w.c(hVar2);
                e1Var2.A = hVar2;
                x1.a.a(e1Var2);
                return Unit.f26487a;
            case 3:
                e1 e1Var3 = this.f43086b;
                o1 o1Var = e1Var3.f42879r;
                long jF = ((h4.b) obj).f21378a;
                z4.z zVarB = o1Var.b();
                if (zVarB != null && zVarB.n()) {
                    jF = zVarB.F(jF);
                }
                int iC = e1Var3.f42879r.c(jF, true);
                if (iC >= 0) {
                    e1Var3.f42878q.j(m5.k0.b(iC, iC));
                }
                e1Var3.f42880s.z(m2.t0.Cursor, jF);
                return Unit.f26487a;
            case 4:
                e1 e1Var4 = this.f43086b;
                e1Var4.Q0();
                e1Var4.f42880s.d();
                x1.a.a(e1Var4);
                return Unit.f26487a;
            case 5:
                this.f43086b.Q0();
                return Unit.f26487a;
            case 6:
                e1 e1Var5 = this.f43086b;
                v80.f0.B(e1Var5.getCoroutineScope(), null, v80.d0.UNDISPATCHED, new tm.d((m2.y0) obj, e1Var5, null, 16), 1);
                return Unit.f26487a;
            case 7:
                List list = (List) obj;
                m5.q0 q0VarG = this.f43086b.f42879r.f43008b.g();
                return Boolean.valueOf(q0VarG != null ? list.add(q0VarG) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f43086b.f42880s.f43791k.setValue(bool);
                return Unit.f26487a;
        }
    }
}
