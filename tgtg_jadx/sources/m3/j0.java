package m3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f29305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f29306b;

    public j0(Function1 function1) {
        this.f29305a = function1;
    }

    @Override // m3.e2
    public final void c() {
        k0 k0Var = this.f29306b;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f29306b = null;
    }

    @Override // m3.e2
    public final void d() {
        this.f29306b = (k0) this.f29305a.invoke(i.f29300d);
    }

    @Override // m3.e2
    public final void b() {
    }
}
