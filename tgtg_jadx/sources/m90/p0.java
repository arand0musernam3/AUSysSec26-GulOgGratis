package m90;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f29838c;

    static {
        o30.f0.Q(LongCompanionObject.INSTANCE);
        f29838c = new p0(q0.f29842a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        o0 o0Var = (o0) obj;
        o0Var.getClass();
        long jK = aVar.k(this.f29806b, i11);
        o0Var.b(o0Var.d() + 1);
        long[] jArr = o0Var.f29832a;
        int i12 = o0Var.f29833b;
        o0Var.f29833b = i12 + 1;
        jArr[i12] = jK;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        o0 o0Var = new o0();
        o0Var.f29832a = jArr;
        o0Var.f29833b = jArr.length;
        o0Var.b(10);
        return o0Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new long[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        long[] jArr = (long[]) obj;
        bVar.getClass();
        jArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.B(this.f29806b, i12, jArr[i12]);
        }
    }
}
