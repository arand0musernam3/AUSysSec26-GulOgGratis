package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements androidx.lifecycle.p, ea.f, androidx.lifecycle.s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f3235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelStore f3236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f3237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewModelProvider$Factory f3238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.f0 f3239e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ea.e f3240f = null;

    public i2(Fragment fragment, ViewModelStore viewModelStore, z zVar) {
        this.f3235a = fragment;
        this.f3236b = viewModelStore;
        this.f3237c = zVar;
    }

    public final void a(androidx.lifecycle.w wVar) {
        this.f3239e.g(wVar);
    }

    public final void b() {
        if (this.f3239e == null) {
            this.f3239e = new androidx.lifecycle.f0(this, true);
            ea.e eVar = new ea.e(new ga.a(this, new cw.b(this, 6)));
            this.f3240f = eVar;
            eVar.a();
            this.f3237c.run();
        }
    }

    @Override // androidx.lifecycle.p
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f3235a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        y8.d dVar = new y8.d(0);
        LinkedHashMap linkedHashMap = dVar.f3543a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.o1.f3505d, application);
        }
        linkedHashMap.put(androidx.lifecycle.f1.f3442a, fragment);
        linkedHashMap.put(androidx.lifecycle.f1.f3443b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.f1.f3444c, fragment.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f3235a;
        ViewModelProvider$Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f3238d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f3238d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f3238d = new androidx.lifecycle.i1(application, fragment, fragment.getArguments());
        }
        return this.f3238d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.f3239e;
    }

    @Override // ea.f
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f3240f.f15899b;
    }

    @Override // androidx.lifecycle.s1
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f3236b;
    }
}
