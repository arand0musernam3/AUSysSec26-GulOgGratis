package g3;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u9 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f19598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w9 f19599b;

    public u9(Ref.IntRef intRef, w9 w9Var) {
        this.f19598a = intRef;
        this.f19599b = w9Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        b2.j jVar = (b2.j) obj;
        boolean z11 = jVar instanceof b2.n;
        Ref.IntRef intRef = this.f19598a;
        if (z11) {
            intRef.element++;
        } else if ((jVar instanceof b2.o) || (jVar instanceof b2.m)) {
            intRef.element--;
        }
        boolean z12 = intRef.element > 0;
        w9 w9Var = this.f19599b;
        if (w9Var.f19737r != z12) {
            w9Var.f19737r = z12;
            b5.m.g(w9Var).F();
        }
        return Unit.f26487a;
    }
}
