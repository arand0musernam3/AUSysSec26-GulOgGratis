package m2;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.o0 f28849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f28850b;

    public f1(q1.o0 o0Var, g1 g1Var) {
        this.f28849a = o0Var;
        this.f28850b = g1Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        b2.j jVar = (b2.j) obj;
        boolean z11 = jVar instanceof b2.h;
        q1.o0 o0Var = this.f28849a;
        if (z11 || (jVar instanceof b2.d) || (jVar instanceof b2.n)) {
            o0Var.g(jVar);
        } else if (jVar instanceof b2.i) {
            o0Var.k(((b2.i) jVar).f5562a);
        } else if (jVar instanceof b2.e) {
            o0Var.k(((b2.e) jVar).f5555a);
        } else if (jVar instanceof b2.o) {
            o0Var.k(((b2.o) jVar).f5566a);
        } else if (jVar instanceof b2.m) {
            o0Var.k(((b2.m) jVar).f5564a);
        }
        Object[] objArr = o0Var.f35721a;
        int i11 = o0Var.f35722b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            g1 g1Var = this.f28850b;
            if (i12 >= i11) {
                g1Var.f28861b.i(i13);
                return Unit.f26487a;
            }
            b2.j jVar2 = (b2.j) objArr[i12];
            if (jVar2 instanceof b2.h) {
                g1Var.getClass();
                i13 |= 2;
            } else if (jVar2 instanceof b2.d) {
                g1Var.getClass();
                i13 |= 1;
            } else if (jVar2 instanceof b2.n) {
                g1Var.getClass();
                i13 |= 4;
            }
            i12++;
        }
    }
}
