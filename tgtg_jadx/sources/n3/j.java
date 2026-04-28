package n3;

import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f30466c = new j(0, 2, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        int i11;
        u3.f fVar = (u3.f) sVar.e(0);
        int iC = q2Var.c((m3.a) sVar.e(1));
        if (q2Var.f29400t >= iC) {
            m3.v.a("Check failed");
        }
        m0.c.l0(q2Var, cVar, iC);
        int i12 = q2Var.f29400t;
        int iG = q2Var.f29402v;
        while (iG >= 0 && !q2Var.y(iG)) {
            iG = q2Var.G(iG, q2Var.f29383b);
        }
        int iU = iG + 1;
        int iN = 0;
        while (iU < i12) {
            if (q2Var.v(i12, iU)) {
                if (q2Var.y(iU)) {
                    iN = 0;
                }
                iU++;
            } else {
                iN += q2Var.y(iU) ? 1 : q2Var.F(iU);
                iU += q2Var.u(iU);
            }
        }
        while (true) {
            i11 = q2Var.f29400t;
            if (i11 >= iC) {
                break;
            }
            if (q2Var.v(iC, i11)) {
                int i13 = q2Var.f29400t;
                if (i13 < q2Var.f29401u && (q2Var.f29383b[(q2Var.r(i13) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(q2Var.E(q2Var.f29400t));
                    iN = 0;
                }
                q2Var.R();
            } else {
                iN += q2Var.N();
            }
        }
        if (i11 != iC) {
            m3.v.a("Check failed");
        }
        fVar.f40654a = iN;
    }
}
