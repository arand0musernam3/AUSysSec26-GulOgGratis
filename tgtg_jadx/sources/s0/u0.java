package s0;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface u0 {
    static void r(i1 i1Var, u0 u0Var, u0 u0Var2, g gVar) {
        if (!Objects.equals(gVar, d1.H0)) {
            i1Var.x(gVar, u0Var2.f(gVar), u0Var2.d(gVar));
            return;
        }
        f1.b bVar = (f1.b) u0Var2.i(gVar, null);
        f1.b bVar2 = (f1.b) u0Var.i(gVar, null);
        t0 t0VarF = u0Var2.f(gVar);
        if (bVar == null) {
            bVar = bVar2;
        } else if (bVar2 != null) {
            f1.a aVar = bVar2.f17041a;
            f1.a aVar2 = bVar2.f17042b;
            int i11 = bVar2.f17043c;
            f1.a aVar3 = bVar.f17041a;
            if (aVar3 != null) {
                aVar = aVar3;
            }
            f1.a aVar4 = bVar.f17042b;
            if (aVar4 != null) {
                aVar2 = aVar4;
            }
            int i12 = bVar.f17043c;
            if (i12 != 0) {
                i11 = i12;
            }
            bVar = new f1.b(aVar, aVar2, i11);
        }
        i1Var.x(gVar, t0VarF, bVar);
    }

    static l1 u(u0 u0Var, u0 u0Var2) {
        if (u0Var == null && u0Var2 == null) {
            return l1.f38382c;
        }
        i1 i1VarS = u0Var2 != null ? i1.s(u0Var2) : i1.h();
        if (u0Var != null) {
            Iterator it = u0Var.c().iterator();
            while (it.hasNext()) {
                r(i1VarS, u0Var2, u0Var, (g) it.next());
            }
        }
        return l1.e(i1VarS);
    }

    Object a(g gVar, t0 t0Var);

    Set b(g gVar);

    Set c();

    Object d(g gVar);

    t0 f(g gVar);

    boolean g(g gVar);

    Object i(g gVar, Object obj);

    void j(a50.d dVar);
}
