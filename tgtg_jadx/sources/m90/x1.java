package m90;

import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f29884c;

    static {
        u70.z.f40865b.getClass();
        f29884c = new x1(y1.f29889a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        return ((u70.a0) obj).f40828a.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        w1 w1Var = (w1) obj;
        w1Var.getClass();
        int iP = aVar.z(this.f29806b, i11).p();
        u70.y yVar = u70.z.f40865b;
        w1Var.b(w1Var.d() + 1);
        int[] iArr = w1Var.f29875a;
        int i12 = w1Var.f29876b;
        w1Var.f29876b = i12 + 1;
        iArr[i12] = iP;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        int[] iArr = ((u70.a0) obj).f40828a;
        w1 w1Var = new w1();
        w1Var.f29875a = iArr;
        w1Var.f29876b = iArr.length;
        w1Var.b(10);
        return w1Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new u70.a0(new int[0]);
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        int[] iArr = ((u70.a0) obj).f40828a;
        bVar.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            Encoder encoderS = bVar.s(this.f29806b, i12);
            int i13 = iArr[i12];
            u70.y yVar = u70.z.f40865b;
            encoderS.u(i13);
        }
    }
}
