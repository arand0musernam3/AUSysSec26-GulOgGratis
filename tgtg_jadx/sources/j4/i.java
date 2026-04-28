package j4;

import q1.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f24567a;

    static {
        r rVar = e.f24540e;
        int i11 = rVar.f24534c;
        f fVar = new f(rVar, rVar, 1);
        int i12 = rVar.f24534c;
        m mVar = e.f24558x;
        int i13 = (mVar.f24534c << 6) | i12;
        h hVar = new h(rVar, mVar, 0);
        int i14 = (i12 << 6) | mVar.f24534c;
        h hVar2 = new h(mVar, rVar, 0);
        g0 g0Var = q1.p.f35804a;
        g0 g0Var2 = new g0();
        g0Var2.i(i11 | (i11 << 6), fVar);
        g0Var2.i(i13, hVar);
        g0Var2.i(i14, hVar2);
        f24567a = g0Var2;
    }
}
