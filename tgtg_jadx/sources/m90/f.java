package m90;

import kotlin.jvm.internal.BooleanCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f29792c;

    static {
        o30.f0.M(BooleanCompanionObject.INSTANCE);
        f29792c = new f(g.f29797a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        boolean zT = aVar.t(this.f29806b, i11);
        eVar.b(eVar.d() + 1);
        boolean[] zArr = eVar.f29774a;
        int i12 = eVar.f29775b;
        eVar.f29775b = i12 + 1;
        zArr[i12] = zT;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        e eVar = new e();
        eVar.f29774a = zArr;
        eVar.f29775b = zArr.length;
        eVar.b(10);
        return eVar;
    }

    @Override // m90.h1
    public final Object j() {
        return new boolean[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        boolean[] zArr = (boolean[]) obj;
        bVar.getClass();
        zArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.p(this.f29806b, i12, zArr[i12]);
        }
    }
}
