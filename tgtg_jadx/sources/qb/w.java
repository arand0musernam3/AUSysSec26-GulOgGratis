package qb;

import ib.g0;
import java.util.Iterator;
import java.util.List;
import m2.c2;
import o00.x0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.v f36870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt.a f36871b = new gt.a(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt.m f36872c = new gt.m(3);

    public w(y9.v vVar) {
        this.f36870a = vVar;
    }

    public final void a(ha.a aVar, q1.e eVar) {
        q1.b bVar = (q1.b) eVar.keySet();
        q1.e eVar2 = bVar.f35714a;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.f35782c > 999) {
            f0.L(eVar, new v(this, aVar, 0));
            return;
        }
        StringBuilder sbO = b3.i.o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        pd.g.h(eVar2.f35782c, sbO);
        sbO.append(")");
        ha.c cVarV0 = aVar.v0(sbO.toString());
        Iterator it = bVar.iterator();
        int i11 = 1;
        while (true) {
            q1.a aVar2 = (q1.a) it;
            if (!aVar2.hasNext()) {
                try {
                    break;
                } finally {
                    cVarV0.close();
                }
            } else {
                cVarV0.C(i11, (String) aVar2.next());
                i11++;
            }
        }
        cVarV0.getClass();
        int iN = p30.b.n(cVarV0, "work_spec_id");
        if (iN == -1) {
            return;
        }
        while (cVarV0.q0()) {
            List list = (List) eVar.get(cVarV0.W(iN));
            if (list != null) {
                byte[] blob = cVarV0.getBlob(0);
                ib.h hVar = ib.h.f23726b;
                list.add(ex.i.t(blob));
            }
        }
    }

    public final void b(ha.a aVar, q1.e eVar) {
        q1.b bVar = (q1.b) eVar.keySet();
        q1.e eVar2 = bVar.f35714a;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.f35782c > 999) {
            f0.L(eVar, new v(this, aVar, 1));
            return;
        }
        StringBuilder sbO = b3.i.o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        pd.g.h(eVar2.f35782c, sbO);
        sbO.append(")");
        ha.c cVarV0 = aVar.v0(sbO.toString());
        Iterator it = bVar.iterator();
        int i11 = 1;
        while (true) {
            q1.a aVar2 = (q1.a) it;
            if (!aVar2.hasNext()) {
                try {
                    break;
                } finally {
                    cVarV0.close();
                }
            } else {
                cVarV0.C(i11, (String) aVar2.next());
                i11++;
            }
        }
        cVarV0.getClass();
        int iN = p30.b.n(cVarV0, "work_spec_id");
        if (iN == -1) {
            return;
        }
        while (cVarV0.q0()) {
            List list = (List) eVar.get(cVarV0.W(iN));
            if (list != null) {
                list.add(cVarV0.W(0));
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        x0.A(this.f36870a, false, true, new s(str, 6));
    }

    public final g0 d(String str) {
        str.getClass();
        return (g0) x0.A(this.f36870a, true, false, new gt.e(str, 29));
    }

    public final o e(String str) {
        str.getClass();
        return (o) x0.A(this.f36870a, true, false, new gt.e(str, 28));
    }

    public final List f(String str) {
        str.getClass();
        return (List) x0.A(this.f36870a, true, false, new s(str, 7));
    }

    public final void g(long j9, String str) {
        str.getClass();
        ((Number) x0.A(this.f36870a, false, true, new q(0, j9, str))).intValue();
    }

    public final void h(int i11, String str) {
        str.getClass();
        x0.A(this.f36870a, false, true, new gt.u(str, i11, 2));
    }

    public final void i(long j9, String str) {
        str.getClass();
        x0.A(this.f36870a, false, true, new q(1, j9, str));
    }

    public final void j(g0 g0Var, String str) {
        g0Var.getClass();
        str.getClass();
        ((Number) x0.A(this.f36870a, false, true, new c2(21, g0Var, str))).intValue();
    }

    public final void k(int i11, String str) {
        str.getClass();
        x0.A(this.f36870a, false, true, new gt.u(i11, str, 3));
    }
}
