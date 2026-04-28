package o30;

import com.google.android.gms.internal.measurement.i5;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f31853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f31854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f31856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f31857g;

    public c0(d0 d0Var, Object obj, Executor executor, int i11) {
        this.f31855e = i11;
        this.f31856f = d0Var;
        this.f31854d = d0Var;
        executor.getClass();
        this.f31853c = executor;
        this.f31857g = obj;
    }

    @Override // o30.t0
    public final void a(Throwable th2) {
        d0 d0Var = this.f31854d;
        d0Var.f31867n = null;
        if (th2 instanceof ExecutionException) {
            d0Var.n(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            d0Var.cancel(false);
        } else {
            d0Var.n(th2);
        }
    }

    @Override // o30.t0
    public final void b(Object obj) {
        this.f31854d.f31867n = null;
        switch (this.f31855e) {
            case 0:
                this.f31856f.o((ListenableFuture) obj);
                break;
            default:
                this.f31856f.m(obj);
                break;
        }
    }

    @Override // o30.t0
    public final boolean d() {
        return this.f31854d.isDone();
    }

    @Override // o30.t0
    public final Object e() {
        switch (this.f31855e) {
            case 0:
                return ((i5) this.f31857g).call();
            default:
                return ((Callable) this.f31857g).call();
        }
    }

    @Override // o30.t0
    public final String f() {
        switch (this.f31855e) {
            case 0:
                return ((i5) this.f31857g).toString();
            default:
                return ((Callable) this.f31857g).toString();
        }
    }
}
