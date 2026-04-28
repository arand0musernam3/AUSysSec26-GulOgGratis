package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import com.braze.h2;
import java.lang.reflect.Constructor;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends q1 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f3458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry f3459e;

    public i1(Application application, ea.f fVar, Bundle bundle) {
        o1 o1Var;
        this.f3459e = fVar.getSavedStateRegistry();
        this.f3458d = fVar.getLifecycle();
        this.f3457c = bundle;
        this.f3455a = application;
        if (application != null) {
            if (o1.f3504c == null) {
                o1.f3504c = new o1(application);
            }
            o1Var = o1.f3504c;
            o1Var.getClass();
        } else {
            o1Var = new o1(null);
        }
        this.f3456b = o1Var;
    }

    public final l1 a(Class cls, String str) {
        cls.getClass();
        Lifecycle lifecycle = this.f3458d;
        if (lifecycle == null) {
            h2.a("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = b.class.isAssignableFrom(cls);
        Application application = this.f3455a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? j1.a(cls, j1.f3465b) : j1.a(cls, j1.f3464a);
        if (constructorA == null) {
            if (application != null) {
                return this.f3456b.create(cls);
            }
            if (p1.f3507a == null) {
                p1.f3507a = new p1();
            }
            p1.f3507a.getClass();
            return w.b.E(cls);
        }
        SavedStateRegistry savedStateRegistry = this.f3459e;
        savedStateRegistry.getClass();
        d1 d1VarB = r.b(savedStateRegistry, lifecycle, str, this.f3457c);
        c1 c1Var = d1VarB.f3424b;
        l1 l1VarB = (!zIsAssignableFrom || application == null) ? j1.b(cls, constructorA, c1Var) : j1.b(cls, constructorA, application, c1Var);
        l1VarB.addCloseable("androidx.lifecycle.savedstate.vm.tag", d1VarB);
        return l1VarB;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        String str = (String) creationExtras.a(r1.f3508b);
        if (str == null) {
            h2.b("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (creationExtras.a(f1.f3442a) == null || creationExtras.a(f1.f3443b) == null) {
            if (this.f3458d != null) {
                return a(cls, str);
            }
            h2.b("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) creationExtras.a(o1.f3505d);
        boolean zIsAssignableFrom = b.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? j1.a(cls, j1.f3465b) : j1.a(cls, j1.f3464a);
        return constructorA == null ? this.f3456b.create(cls, creationExtras) : (!zIsAssignableFrom || application == null) ? j1.b(cls, constructorA, f1.a(creationExtras)) : j1.b(cls, constructorA, application, f1.a(creationExtras));
    }

    @Override // androidx.lifecycle.q1
    public final void onRequery(l1 l1Var) {
        l1Var.getClass();
        Lifecycle lifecycle = this.f3458d;
        if (lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.f3459e;
            savedStateRegistry.getClass();
            r.a(l1Var, savedStateRegistry, lifecycle);
        }
    }

    public i1() {
        this.f3456b = new o1(null);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return create(y9.w.v(kClass), creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        i4.a.f("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
