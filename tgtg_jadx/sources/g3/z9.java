package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19906a;

    static {
        zz.f.e(16, 8);
        f19906a = 200;
    }

    public static ca a(m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        int iQ0 = ((z5.c) sVar.j(c5.x1.f7416h)).q0(ba.f18378a);
        long jA = ((c5.q2) ((c5.x3) sVar.j(c5.x1.f7427t))).a();
        boolean zD = sVar.d(iQ0) | sVar.e(jA);
        Object objM = sVar.M();
        if (zD || objM == m3.m.f29332a) {
            objM = new ca(iQ0, jA);
            sVar.k0(objM);
        }
        return (ca) objM;
    }
}
