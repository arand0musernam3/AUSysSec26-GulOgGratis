package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.braze.h2;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qb.e f3442a = new qb.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r40.d f3443b = new r40.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n20.f f3444c = new n20.f(5);

    public static final c1 a(CreationExtras creationExtras) {
        c1 c1Var;
        creationExtras.getClass();
        ea.f fVar = (ea.f) creationExtras.a(f3442a);
        if (fVar == null) {
            i4.a.f("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        s1 s1Var = (s1) creationExtras.a(f3443b);
        if (s1Var == null) {
            i4.a.f("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) creationExtras.a(f3444c);
        String str = (String) creationExtras.a(r1.f3508b);
        if (str == null) {
            i4.a.f("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        ea.d dVarB = fVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        g1 g1Var = dVarB instanceof g1 ? (g1) dVarB : null;
        if (g1Var == null) {
            h2.b("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        h1 h1VarC = c(s1Var);
        c1 c1Var2 = (c1) h1VarC.f3452a.get(str);
        if (c1Var2 != null) {
            return c1Var2;
        }
        g1Var.b();
        Bundle bundle3 = g1Var.f3450c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                kotlin.collections.o0.f26530a.getClass();
                bundle4 = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                g1Var.f3450c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
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
        h1VarC.f3452a.put(str, c1Var);
        return c1Var;
    }

    public static final void b(ea.f fVar) {
        Lifecycle.State stateB = fVar.getLifecycle().b();
        if (stateB != Lifecycle.State.INITIALIZED && stateB != Lifecycle.State.CREATED) {
            i4.a.f("Failed requirement.");
        } else if (fVar.getSavedStateRegistry().b() == null) {
            g1 g1Var = new g1(fVar.getSavedStateRegistry(), (s1) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", g1Var);
            fVar.getLifecycle().a(new ea.b(g1Var, 3));
        }
    }

    public static final h1 c(s1 s1Var) {
        r1 r1VarK = r40.d.k(s1Var, new e1(), 4);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(h1.class);
        orCreateKotlinClass.getClass();
        return (h1) r1VarK.f3509a.M("androidx.lifecycle.internal.SavedStateHandlesVM", orCreateKotlinClass);
    }
}
