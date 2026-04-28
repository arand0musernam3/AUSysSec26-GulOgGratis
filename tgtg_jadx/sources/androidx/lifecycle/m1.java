package androidx.lifecycle;

import android.view.View;
import com.app.tgtg.R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import v80.d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a9.c f3494a = new a9.c();

    public static final LifecycleOwner a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            Object objS = dx.f.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final s1 b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            s1 s1Var = tag instanceof s1 ? (s1) tag : null;
            if (s1Var != null) {
                return s1Var;
            }
            Object objS = dx.f.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final z c(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.getClass();
        se.d dVar = lifecycle.f3411a;
        while (true) {
            z zVar = (z) ((AtomicReference) dVar.f39013b).get();
            if (zVar != null) {
                return zVar;
            }
            d2 d2VarD = v80.f0.d();
            c90.f fVar = v80.p0.f42144a;
            z zVar2 = new z(lifecycle, kotlin.coroutines.e.c(d2VarD, a90.p.f1044a.f43295e));
            AtomicReference atomicReference = (AtomicReference) dVar.f39013b;
            while (!atomicReference.compareAndSet(null, zVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            c90.f fVar2 = v80.p0.f42144a;
            v80.f0.B(zVar2, a90.p.f1044a.f43295e, null, new y(zVar2, null), 2);
            return zVar2;
        }
    }

    public static final a9.a d(l1 l1Var) {
        a9.a aVar;
        CoroutineContext coroutineContext;
        l1Var.getClass();
        synchronized (f3494a) {
            aVar = (a9.a) l1Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        c90.f fVar = v80.p0.f42144a;
                        coroutineContext = a90.p.f1044a.f43295e;
                    } catch (IllegalStateException unused) {
                        coroutineContext = kotlin.coroutines.g.f26549a;
                    }
                } catch (u70.n unused2) {
                    coroutineContext = kotlin.coroutines.g.f26549a;
                }
                a9.a aVar2 = new a9.a(coroutineContext.plus(v80.f0.d()));
                l1Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void e(View view, LifecycleOwner lifecycleOwner) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
