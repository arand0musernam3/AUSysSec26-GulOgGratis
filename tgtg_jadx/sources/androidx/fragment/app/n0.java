package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends u0 implements v6.c, v6.d, androidx.core.app.v0, androidx.core.app.w0, androidx.lifecycle.s1, androidx.activity.f0, h.f, ea.f, r1, h7.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f3282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var) {
        super(o0Var);
        this.f3282e = o0Var;
    }

    @Override // androidx.fragment.app.r1
    public final void a(FragmentManager fragmentManager, Fragment fragment) {
        this.f3282e.onAttachFragment(fragment);
    }

    @Override // h7.p
    public final void addMenuProvider(MenuProvider menuProvider) {
        this.f3282e.addMenuProvider(menuProvider);
    }

    @Override // v6.c
    public final void addOnConfigurationChangedListener(Consumer consumer) {
        this.f3282e.addOnConfigurationChangedListener(consumer);
    }

    @Override // androidx.core.app.v0
    public final void addOnMultiWindowModeChangedListener(Consumer consumer) {
        this.f3282e.addOnMultiWindowModeChangedListener(consumer);
    }

    @Override // androidx.core.app.w0
    public final void addOnPictureInPictureModeChangedListener(Consumer consumer) {
        this.f3282e.addOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // v6.d
    public final void addOnTrimMemoryListener(Consumer consumer) {
        this.f3282e.addOnTrimMemoryListener(consumer);
    }

    @Override // androidx.fragment.app.r0
    public final View b(int i11) {
        return this.f3282e.findViewById(i11);
    }

    @Override // androidx.fragment.app.r0
    public final boolean c() {
        Window window = this.f3282e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // h.f
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.f3282e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f3282e.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.f0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f3282e.getOnBackPressedDispatcher();
    }

    @Override // ea.f
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f3282e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.s1
    public final ViewModelStore getViewModelStore() {
        return this.f3282e.getViewModelStore();
    }

    @Override // h7.p
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.f3282e.removeMenuProvider(menuProvider);
    }

    @Override // v6.c
    public final void removeOnConfigurationChangedListener(Consumer consumer) {
        this.f3282e.removeOnConfigurationChangedListener(consumer);
    }

    @Override // androidx.core.app.v0
    public final void removeOnMultiWindowModeChangedListener(Consumer consumer) {
        this.f3282e.removeOnMultiWindowModeChangedListener(consumer);
    }

    @Override // androidx.core.app.w0
    public final void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
        this.f3282e.removeOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // v6.d
    public final void removeOnTrimMemoryListener(Consumer consumer) {
        this.f3282e.removeOnTrimMemoryListener(consumer);
    }
}
