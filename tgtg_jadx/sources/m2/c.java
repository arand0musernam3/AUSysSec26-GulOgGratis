package m2;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pair f28777a;

    static {
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        f28777a = new Pair(n0Var, n0Var);
    }

    public static final void a(m5.h hVar, List list, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1794596951);
        int i12 = (i11 & 6) == 0 ? (sVar.f(hVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                m5.f fVar = (m5.f) list.get(i13);
                i80.n nVar2 = (i80.n) fVar.f29529a;
                int i14 = fVar.f29530b;
                int i15 = fVar.f29531c;
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = b.f28765b;
                    sVar.k0(objM);
                }
                z4.u0 u0Var = (z4.u0) objM;
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC = b4.a.c(b4.q.f5711a, sVar);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0Var, b5.i.f5843f, sVar);
                m3.i.C(iVarL, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar);
                nVar2.invoke(hVar.subSequence(i14, i15).f29538b, sVar, 0);
                sVar.q(true);
            }
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(hVar, list, i11, 15);
        }
    }
}
