package n3;

import m3.f2;
import m3.q2;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f30459c = new f0(1, 0, 2);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        int iD = sVar.d(0);
        int i11 = q2Var.f29402v;
        int iP = q2Var.P(q2Var.r(i11), q2Var.f29383b);
        int iG = q2Var.g(q2Var.r(i11 + 1), q2Var.f29383b);
        for (int iMax = Math.max(iP, iG - iD); iMax < iG; iMax++) {
            Object obj = q2Var.f29384c[q2Var.h(iMax)];
            if (obj instanceof f2) {
                cVar2.e((f2) obj);
            } else if (obj instanceof w1) {
                ((w1) obj).d();
            }
        }
        if (iD <= 0) {
            m3.v.a("Check failed");
        }
        int i12 = q2Var.f29402v;
        int iP2 = q2Var.P(q2Var.r(i12), q2Var.f29383b);
        int iG2 = q2Var.g(q2Var.r(i12 + 1), q2Var.f29383b) - iD;
        if (iG2 < iP2) {
            m3.v.a("Check failed");
        }
        q2Var.L(iG2, iD, i12);
        int i13 = q2Var.f29390i;
        if (i13 >= iP2) {
            q2Var.f29390i = i13 - iD;
        }
    }
}
