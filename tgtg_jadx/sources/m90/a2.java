package m90;

import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f29757c;

    static {
        u70.c0.f40833b.getClass();
        f29757c = new a2(b2.f29759a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        return ((u70.d0) obj).f40835a.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        z1 z1Var = (z1) obj;
        z1Var.getClass();
        long jS = aVar.z(this.f29806b, i11).s();
        u70.b0 b0Var = u70.c0.f40833b;
        z1Var.b(z1Var.d() + 1);
        long[] jArr = z1Var.f29896a;
        int i12 = z1Var.f29897b;
        z1Var.f29897b = i12 + 1;
        jArr[i12] = jS;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        long[] jArr = ((u70.d0) obj).f40835a;
        z1 z1Var = new z1();
        z1Var.f29896a = jArr;
        z1Var.f29897b = jArr.length;
        z1Var.b(10);
        return z1Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new u70.d0(new long[0]);
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        long[] jArr = ((u70.d0) obj).f40835a;
        bVar.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            Encoder encoderS = bVar.s(this.f29806b, i12);
            long j9 = jArr[i12];
            u70.b0 b0Var = u70.c0.f40833b;
            encoderS.A(j9);
        }
    }
}
