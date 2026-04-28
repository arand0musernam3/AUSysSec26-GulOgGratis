package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f19745a = new x0();

    public final void a(k4 k4Var, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(882141204);
        int i12 = (sVar.f(k4Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            q7.a(k4Var.f18949a, null, k4Var.f18950b, k4Var.f18951c, k4Var.f18952d, 0.0f, null, u3.e.e(1991263321, sVar, new a3.f1(k4Var, 29)), sVar, 12582912, 98);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.u2(this, k4Var, i11, 19);
        }
    }
}
