package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18525a = 0;

    static {
        new m3.d3(new fw.b(23));
    }

    public static final void a(u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(442516910);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            sVar.a0(1766838549);
            sVar.q(false);
            sVar.a0(1767392772);
            dVar.invoke(sVar, 6);
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d2.m0(dVar, i11, 3);
        }
    }
}
