package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f3372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3373b;

    public x(y yVar, r0 r0Var) {
        this.f3373b = yVar;
        this.f3372a = r0Var;
    }

    @Override // androidx.fragment.app.r0
    public final View b(int i11) {
        r0 r0Var = this.f3372a;
        return r0Var.c() ? r0Var.b(i11) : this.f3373b.onFindViewById(i11);
    }

    @Override // androidx.fragment.app.r0
    public final boolean c() {
        return this.f3372a.c() || this.f3373b.onHasView();
    }
}
