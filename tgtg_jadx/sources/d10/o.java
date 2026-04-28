package d10;

import a3.i3;
import android.app.Activity;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13719a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f13720b = new i3(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f13722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f13724f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(c cVar) {
        b(h.f13698a, cVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f13720b.A(new l(h.f13698a, onCompleteListener));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, c cVar) {
        this.f13720b.A(new l(executor, cVar));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final void c(Executor executor, OnCompleteListener onCompleteListener) {
        this.f13720b.A(new l(executor, onCompleteListener));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final o d(Activity activity, mp.a aVar) {
        n nVar;
        l lVar = new l((Executor) h.f13698a, (d) aVar);
        this.f13720b.A(lVar);
        qz.j jVarB = qz.i.b(activity);
        synchronized (jVarB) {
            try {
                nVar = (n) jVarB.c(n.class, "TaskOnStopCallback");
                if (nVar == null) {
                    nVar = new n(jVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = nVar.f13718b;
        synchronized (arrayList) {
            arrayList.add(new WeakReference(lVar));
        }
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o e(d dVar) {
        f(h.f13698a, dVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o f(Executor executor, d dVar) {
        this.f13720b.A(new l(executor, dVar));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o g(e eVar) {
        h(h.f13698a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f13719a) {
            exc = this.f13724f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f13719a) {
            try {
                i0.j("Task is not yet complete", this.f13721c);
                if (this.f13722d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f13724f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f13723e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o h(Executor executor, e eVar) {
        this.f13720b.A(new l(executor, eVar));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(Executor executor, b bVar) {
        o oVar = new o();
        this.f13720b.A(new k(executor, bVar, oVar, 0));
        u();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z11;
        synchronized (this.f13719a) {
            try {
                z11 = false;
                if (this.f13721c && !this.f13722d && this.f13724f == null) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task j(Executor executor, b bVar) {
        o oVar = new o();
        this.f13720b.A(new k(executor, bVar, oVar, 1));
        u();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object k() {
        Object obj;
        synchronized (this.f13719a) {
            try {
                i0.j("Task is not yet complete", this.f13721c);
                if (this.f13722d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean zIsInstance = IOException.class.isInstance(this.f13724f);
                Exception exc = this.f13724f;
                if (zIsInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f13723e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        return this.f13722d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z11;
        synchronized (this.f13719a) {
            z11 = this.f13721c;
        }
        return z11;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task n(f fVar) {
        w0.d dVar = h.f13698a;
        o oVar = new o();
        this.f13720b.A(new l(dVar, fVar, oVar));
        u();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, f fVar) {
        o oVar = new o();
        this.f13720b.A(new l(executor, fVar, oVar));
        u();
        return oVar;
    }

    public final void p(Object obj) {
        synchronized (this.f13719a) {
            t();
            this.f13721c = true;
            this.f13723e = obj;
        }
        this.f13720b.B(this);
    }

    public final boolean q(Object obj) {
        synchronized (this.f13719a) {
            try {
                if (this.f13721c) {
                    return false;
                }
                this.f13721c = true;
                this.f13723e = obj;
                this.f13720b.B(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(Exception exc) {
        i0.i(exc, "Exception must not be null");
        synchronized (this.f13719a) {
            t();
            this.f13721c = true;
            this.f13724f = exc;
        }
        this.f13720b.B(this);
    }

    public final void s() {
        synchronized (this.f13719a) {
            try {
                if (this.f13721c) {
                    return;
                }
                this.f13721c = true;
                this.f13722d = true;
                this.f13720b.B(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        if (this.f13721c) {
            if (!m()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
        }
    }

    public final void u() {
        synchronized (this.f13719a) {
            try {
                if (this.f13721c) {
                    this.f13720b.B(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
