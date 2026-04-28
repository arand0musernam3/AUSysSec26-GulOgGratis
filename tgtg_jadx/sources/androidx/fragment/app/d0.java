package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f3168a;

    public d0(Fragment fragment) {
        this.f3168a = fragment;
    }

    @Override // androidx.fragment.app.r0
    public final View b(int i11) {
        Fragment fragment = this.f3168a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i11);
        }
        com.braze.h2.b(w.a0.m("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // androidx.fragment.app.r0
    public final boolean c() {
        return this.f3168a.mView != null;
    }
}
