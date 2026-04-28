package m90;

import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f29831c;

    static {
        CharCompanionObject.INSTANCE.getClass();
        f29831c = new o(p.f29836a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        char cD = aVar.d(this.f29806b, i11);
        nVar.b(nVar.d() + 1);
        char[] cArr = nVar.f29828a;
        int i12 = nVar.f29829b;
        nVar.f29829b = i12 + 1;
        cArr[i12] = cD;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        n nVar = new n();
        nVar.f29828a = cArr;
        nVar.f29829b = cArr.length;
        nVar.b(10);
        return nVar;
    }

    @Override // m90.h1
    public final Object j() {
        return new char[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        char[] cArr = (char[]) obj;
        bVar.getClass();
        cArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.e(this.f29806b, i12, cArr[i12]);
        }
    }
}
