package he;

import android.os.Handler;
import android.os.Looper;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f21904e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f21905a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f21906b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f21907c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e0 f21908d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f21904e = new l0.b(0);
        } else {
            f21904e = Executors.newCachedThreadPool(new ve.d());
        }
    }

    public f0(Callable callable, boolean z11) {
        if (z11) {
            try {
                d((e0) callable.call());
                return;
            } catch (Throwable th2) {
                d(new e0(th2));
                return;
            }
        }
        Executor executor = f21904e;
        c9.g gVar = new c9.g(callable);
        gVar.f7812b = this;
        executor.execute(gVar);
    }

    public final synchronized void a(c0 c0Var) {
        Throwable th2;
        try {
            e0 e0Var = this.f21908d;
            if (e0Var != null && (th2 = e0Var.f21903b) != null) {
                c0Var.onResult(th2);
            }
            this.f21906b.add(c0Var);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(c0 c0Var) {
        k kVar;
        try {
            e0 e0Var = this.f21908d;
            if (e0Var != null && (kVar = e0Var.f21902a) != null) {
                c0Var.onResult(kVar);
            }
            this.f21905a.add(c0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        e0 e0Var = this.f21908d;
        if (e0Var == null) {
            return;
        }
        k kVar = e0Var.f21902a;
        if (kVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f21905a).iterator();
                while (it.hasNext()) {
                    ((c0) it.next()).onResult(kVar);
                }
            }
            return;
        }
        Throwable th2 = e0Var.f21903b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f21906b);
            if (arrayList.isEmpty()) {
                ve.c.c("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((c0) it2.next()).onResult(th2);
            }
        }
    }

    public final void d(e0 e0Var) {
        if (this.f21908d != null) {
            h2.b("A task may only be set once.");
            return;
        }
        this.f21908d = e0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f21907c.post(new d1.e(this, 21));
        }
    }

    public f0(k kVar) {
        d(new e0(kVar));
    }
}
