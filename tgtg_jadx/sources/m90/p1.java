package m90;

import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f29839c;

    static {
        ShortCompanionObject.INSTANCE.getClass();
        f29839c = new p1(q1.f29844a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        o1 o1Var = (o1) obj;
        o1Var.getClass();
        short sE = aVar.e(this.f29806b, i11);
        o1Var.b(o1Var.d() + 1);
        short[] sArr = o1Var.f29834a;
        int i12 = o1Var.f29835b;
        o1Var.f29835b = i12 + 1;
        sArr[i12] = sE;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        o1 o1Var = new o1();
        o1Var.f29834a = sArr;
        o1Var.f29835b = sArr.length;
        o1Var.b(10);
        return o1Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new short[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        short[] sArr = (short[]) obj;
        bVar.getClass();
        sArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.l(this.f29806b, i12, sArr[i12]);
        }
    }
}
