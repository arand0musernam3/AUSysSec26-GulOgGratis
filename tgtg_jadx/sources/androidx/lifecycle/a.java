package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import com.braze.h2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends q1 implements ViewModelProvider$Factory {

    @Nullable
    private Bundle defaultArgs;

    @Nullable
    private Lifecycle lifecycle;

    @Nullable
    private SavedStateRegistry savedStateRegistry;

    public a(ea.f fVar, Bundle bundle) {
        fVar.getClass();
        this.savedStateRegistry = fVar.getSavedStateRegistry();
        this.lifecycle = fVar.getLifecycle();
        this.defaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public <T extends l1> T create(@NotNull Class<T> cls, @NotNull CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        String str = (String) creationExtras.a(r1.f3508b);
        if (str == null) {
            h2.b("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry == null) {
            return (T) create(str, cls, f1.a(creationExtras));
        }
        savedStateRegistry.getClass();
        Lifecycle lifecycle = this.lifecycle;
        lifecycle.getClass();
        d1 d1VarB = r.b(savedStateRegistry, lifecycle, str, this.defaultArgs);
        T t9 = (T) create(str, cls, d1VarB.f3424b);
        t9.addCloseable("androidx.lifecycle.savedstate.vm.tag", d1VarB);
        return t9;
    }

    public abstract l1 create(String str, Class cls, c1 c1Var);

    @Override // androidx.lifecycle.q1
    public void onRequery(@NotNull l1 l1Var) {
        l1Var.getClass();
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            Lifecycle lifecycle = this.lifecycle;
            lifecycle.getClass();
            r.a(l1Var, savedStateRegistry, lifecycle);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public <T extends l1> T create(@NotNull Class<T> cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
                savedStateRegistry.getClass();
                Lifecycle lifecycle = this.lifecycle;
                lifecycle.getClass();
                d1 d1VarB = r.b(savedStateRegistry, lifecycle, canonicalName, this.defaultArgs);
                T t9 = (T) create(canonicalName, cls, d1VarB.f3424b);
                t9.addCloseable("androidx.lifecycle.savedstate.vm.tag", d1VarB);
                return t9;
            }
            h2.a("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        i4.a.f("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
