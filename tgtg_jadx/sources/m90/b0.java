package m90;

import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f29758c;

    static {
        o30.f0.O(FloatCompanionObject.INSTANCE);
        f29758c = new b0(c0.f29762a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        float fL = aVar.l(this.f29806b, i11);
        a0Var.b(a0Var.d() + 1);
        float[] fArr = a0Var.f29754a;
        int i12 = a0Var.f29755b;
        a0Var.f29755b = i12 + 1;
        fArr[i12] = fL;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        a0 a0Var = new a0();
        a0Var.f29754a = fArr;
        a0Var.f29755b = fArr.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new float[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        float[] fArr = (float[]) obj;
        bVar.getClass();
        fArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.y(this.f29806b, i12, fArr[i12]);
        }
    }
}
