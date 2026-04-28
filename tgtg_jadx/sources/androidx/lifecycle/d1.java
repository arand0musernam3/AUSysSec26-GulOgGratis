package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements c0, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f3424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3425c;

    public d1(String str, c1 c1Var) {
        this.f3423a = str;
        this.f3424b = c1Var;
    }

    public final void a(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        savedStateRegistry.getClass();
        lifecycle.getClass();
        if (this.f3425c) {
            h2.b("Already attached to lifecycleOwner");
            return;
        }
        this.f3425c = true;
        lifecycle.a(this);
        savedStateRegistry.c(this.f3423a, (androidx.activity.g) this.f3424b.f3420b.f3503e);
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        if (wVar == w.ON_DESTROY) {
            this.f3425c = false;
            lifecycleOwner.getLifecycle().d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
