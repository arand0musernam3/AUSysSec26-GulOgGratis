package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f3161a;

    public c0(Fragment fragment) {
        this.f3161a = fragment;
    }

    @Override // androidx.fragment.app.i0
    public final void a() {
        Fragment fragment = this.f3161a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.f1.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
