package n3;

import m3.f2;
import m3.q2;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f30456c = new e(0, 2, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        m3.a aVar = (m3.a) sVar.e(0);
        Object objE = sVar.e(1);
        if (objE instanceof f2) {
            f2 f2Var = (f2) objE;
            ((o3.e) cVar2.f18002e).b(f2Var);
            ((u0) cVar2.f18001d).d(f2Var);
        }
        if (q2Var.f29394n != 0) {
            m3.v.a("Can only append a slot if not current inserting");
        }
        int i11 = q2Var.f29390i;
        int i12 = q2Var.f29391j;
        int iC = q2Var.c(aVar);
        int iG = q2Var.g(q2Var.r(iC + 1), q2Var.f29383b);
        q2Var.f29390i = iG;
        q2Var.f29391j = iG;
        q2Var.x(1, iC);
        if (i11 >= iG) {
            i11++;
            i12++;
        }
        q2Var.f29384c[iG] = objE;
        q2Var.f29390i = i11;
        q2Var.f29391j = i12;
    }
}
