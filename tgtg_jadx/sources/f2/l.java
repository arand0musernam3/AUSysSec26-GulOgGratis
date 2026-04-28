package f2;

import a3.z1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h2.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3.j f17132c = new a3.j(2, (byte) 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1.f0 f17133d;

    public l(Function1 function1) {
        function1.invoke(this);
    }

    public static /* synthetic */ void q(l lVar, String str, i80.n nVar, int i11) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        lVar.p(str, nVar);
    }

    public static /* synthetic */ void s(l lVar, int i11, Function1 function1, u3.d dVar, int i12) {
        if ((i12 & 2) != 0) {
            function1 = null;
        }
        lVar.r(i11, function1, v.f17222a, dVar);
    }

    public static void t(l lVar, u3.d dVar) {
        a3.j jVar = lVar.f17132c;
        q1.f0 f0Var = lVar.f17133d;
        if (f0Var == null) {
            f0Var = new q1.f0();
            lVar.f17133d = f0Var;
        }
        f0Var.c(jVar.f398b);
        lVar.p(null, new u3.d(new j(dVar, jVar.f398b, 0), true, -1588696110));
    }

    @Override // h2.q
    public final a3.j k() {
        return this.f17132c;
    }

    public final void p(Object obj, i80.n nVar) {
        this.f17132c.e(1, new i(obj != null ? new k(obj, 0) : null, new cp.i(24), new u3.d(new z1(nVar, 2), true, -857469575)));
    }

    public final void r(int i11, Function1 function1, Function1 function12, u3.d dVar) {
        this.f17132c.e(i11, new i(function1, function12, dVar));
    }
}
