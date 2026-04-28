package v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.e0 f41821a = new m3.e0(new t1.w1(12));

    public static final o1 a(m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        sVar.a0(282942128);
        j jVar = (j) sVar.j(f41821a);
        if (jVar == null) {
            sVar.q(false);
            return null;
        }
        boolean zF = sVar.f(jVar);
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            i iVar = new i(jVar.f41765a, jVar.f41766b, jVar.f41767c, jVar.f41768d);
            sVar.k0(iVar);
            objM = iVar;
        }
        o1 o1Var = (o1) objM;
        sVar.q(false);
        return o1Var;
    }
}
