package m90;

import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f29773c;

    static {
        u70.g0.f40838b.getClass();
        f29773c = new d2(e2.f29790a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        return ((u70.h0) obj).f40840a.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        c2 c2Var = (c2) obj;
        c2Var.getClass();
        short sB = aVar.z(this.f29806b, i11).B();
        u70.f0 f0Var = u70.g0.f40838b;
        c2Var.b(c2Var.d() + 1);
        short[] sArr = c2Var.f29767a;
        int i12 = c2Var.f29768b;
        c2Var.f29768b = i12 + 1;
        sArr[i12] = sB;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        short[] sArr = ((u70.h0) obj).f40840a;
        c2 c2Var = new c2();
        c2Var.f29767a = sArr;
        c2Var.f29768b = sArr.length;
        c2Var.b(10);
        return c2Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new u70.h0(new short[0]);
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        short[] sArr = ((u70.h0) obj).f40840a;
        bVar.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            Encoder encoderS = bVar.s(this.f29806b, i12);
            short s7 = sArr[i12];
            u70.f0 f0Var = u70.g0.f40838b;
            encoderS.h(s7);
        }
    }
}
