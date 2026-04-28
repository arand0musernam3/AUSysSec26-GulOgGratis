package m90;

import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f29867c;

    static {
        u70.w.f40862b.getClass();
        f29867c = new u1(v1.f29870a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        return ((u70.x) obj).f40864a.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        t1 t1Var = (t1) obj;
        t1Var.getClass();
        byte bA = aVar.z(this.f29806b, i11).A();
        u70.v vVar = u70.w.f40862b;
        t1Var.b(t1Var.d() + 1);
        byte[] bArr = t1Var.f29863a;
        int i12 = t1Var.f29864b;
        t1Var.f29864b = i12 + 1;
        bArr[i12] = bA;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        byte[] bArr = ((u70.x) obj).f40864a;
        t1 t1Var = new t1();
        t1Var.f29863a = bArr;
        t1Var.f29864b = bArr.length;
        t1Var.b(10);
        return t1Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new u70.x(new byte[0]);
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        byte[] bArr = ((u70.x) obj).f40864a;
        bVar.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            Encoder encoderS = bVar.s(this.f29806b, i12);
            byte b8 = bArr[i12];
            u70.v vVar = u70.w.f40862b;
            encoderS.j(b8);
        }
    }
}
