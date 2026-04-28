package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final void a(l1 l1Var, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        l1Var.getClass();
        savedStateRegistry.getClass();
        lifecycle.getClass();
        d1 d1Var = (d1) l1Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (d1Var == null || d1Var.f3425c) {
            return;
        }
        d1Var.a(savedStateRegistry, lifecycle);
        c(savedStateRegistry, lifecycle);
    }

    public static final d1 b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        c1 c1Var;
        savedStateRegistry.getClass();
        lifecycle.getClass();
        Bundle bundleA = savedStateRegistry.a(str);
        if (bundleA != null) {
            bundle = bundleA;
        }
        if (bundle == null) {
            c1Var = new c1();
        } else {
            ClassLoader classLoader = c1.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            v70.i iVar = new v70.i(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                iVar.put(str2, bundle.get(str2));
            }
            c1Var = new c1(iVar.b());
        }
        d1 d1Var = new d1(str, c1Var);
        d1Var.a(savedStateRegistry, lifecycle);
        c(savedStateRegistry, lifecycle);
        return d1Var;
    }

    public static void c(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.INITIALIZED || stateB.a(Lifecycle.State.STARTED)) {
            savedStateRegistry.d();
        } else {
            lifecycle.a(new androidx.activity.d0(2, lifecycle, savedStateRegistry));
        }
    }
}
