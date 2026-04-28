package m90;

import kotlin.jvm.internal.DoubleCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f29865c;

    static {
        o30.f0.N(DoubleCompanionObject.INSTANCE);
        f29865c = new u(v.f29868a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        t tVar = (t) obj;
        tVar.getClass();
        double dY = aVar.y(this.f29806b, i11);
        tVar.b(tVar.d() + 1);
        double[] dArr = tVar.f29859a;
        int i12 = tVar.f29860b;
        tVar.f29860b = i12 + 1;
        dArr[i12] = dY;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        t tVar = new t();
        tVar.f29859a = dArr;
        tVar.f29860b = dArr.length;
        tVar.b(10);
        return tVar;
    }

    @Override // m90.h1
    public final Object j() {
        return new double[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        double[] dArr = (double[]) obj;
        bVar.getClass();
        dArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.z(this.f29806b, i12, dArr[i12]);
        }
    }
}
