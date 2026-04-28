package v1;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f41763d;

    public i0(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, k0 k0Var) {
        this.f41760a = intRef;
        this.f41761b = intRef2;
        this.f41762c = intRef3;
        this.f41763d = k0Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        b2.j jVar = (b2.j) obj;
        boolean z11 = jVar instanceof b2.n;
        Ref.IntRef intRef = this.f41762c;
        Ref.IntRef intRef2 = this.f41761b;
        Ref.IntRef intRef3 = this.f41760a;
        boolean z12 = true;
        if (z11) {
            intRef3.element++;
        } else if ((jVar instanceof b2.o) || (jVar instanceof b2.m)) {
            intRef3.element--;
        } else if (jVar instanceof b2.h) {
            intRef2.element++;
        } else if (jVar instanceof b2.i) {
            intRef2.element--;
        } else if (jVar instanceof b2.d) {
            intRef.element++;
        } else if (jVar instanceof b2.e) {
            intRef.element--;
        }
        boolean z13 = false;
        boolean z14 = intRef3.element > 0;
        boolean z15 = intRef2.element > 0;
        boolean z16 = intRef.element > 0;
        k0 k0Var = this.f41763d;
        if (k0Var.f41773p != z14) {
            k0Var.f41773p = z14;
            z13 = true;
        }
        if (k0Var.f41774q != z15) {
            k0Var.f41774q = z15;
            z13 = true;
        }
        if (k0Var.f41775r != z16) {
            k0Var.f41775r = z16;
        } else {
            z12 = z13;
        }
        if (z12) {
            b5.o.h(k0Var);
        }
        return Unit.f26487a;
    }
}
