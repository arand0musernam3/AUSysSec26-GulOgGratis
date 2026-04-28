package n3;

import m3.m2;
import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f30488c = new t(0, 3, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        k8.d dVar;
        m2 m2Var = (m2) sVar.e(1);
        m3.a aVar = (m3.a) sVar.e(0);
        c cVar3 = (c) sVar.e(2);
        q2 q2VarG = m2Var.g();
        if (l0Var != null) {
            try {
                dVar = new k8.d(19, l0Var, q2Var);
            } catch (Throwable th2) {
                q2VarG.e(false);
                throw th2;
            }
        } else {
            dVar = null;
        }
        if (!cVar3.f30452i.I()) {
            m3.v.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar3.f30451h.H(cVar, q2VarG, cVar2, dVar);
        q2VarG.e(true);
        q2Var.d();
        aVar.getClass();
        q2Var.A(m2Var, m2Var.b(aVar));
        q2Var.k();
    }
}
