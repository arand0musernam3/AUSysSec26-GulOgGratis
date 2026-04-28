package m90;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f29818c;

    static {
        o30.f0.P(IntCompanionObject.INSTANCE);
        f29818c = new k0(l0.f29821a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        j0 j0Var = (j0) obj;
        j0Var.getClass();
        int iQ = aVar.q(this.f29806b, i11);
        j0Var.b(j0Var.d() + 1);
        int[] iArr = j0Var.f29814a;
        int i12 = j0Var.f29815b;
        j0Var.f29815b = i12 + 1;
        iArr[i12] = iQ;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        j0 j0Var = new j0();
        j0Var.f29814a = iArr;
        j0Var.f29815b = iArr.length;
        j0Var.b(10);
        return j0Var;
    }

    @Override // m90.h1
    public final Object j() {
        return new int[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        int[] iArr = (int[]) obj;
        bVar.getClass();
        iArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.m(i12, iArr[i12], this.f29806b);
        }
    }
}
