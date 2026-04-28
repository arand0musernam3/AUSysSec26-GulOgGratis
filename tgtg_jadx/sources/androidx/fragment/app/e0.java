package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f3179a;

    public e0(Fragment fragment) {
        this.f3179a = fragment;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        View view;
        if (wVar != androidx.lifecycle.w.ON_STOP || (view = this.f3179a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
