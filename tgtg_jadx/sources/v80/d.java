package v80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f42077a;

    public d(c[] cVarArr) {
        this.f42077a = cVarArr;
    }

    public final void a() {
        for (c cVar : this.f42077a) {
            r0 r0Var = cVar.f42073f;
            if (r0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                r0Var = null;
            }
            r0Var.a();
        }
    }

    @Override // v80.j
    public final void b(Throwable th2) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f42077a + ']';
    }
}
