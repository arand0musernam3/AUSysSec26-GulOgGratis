package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31858c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f31859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f31860e;

    public c1(d1 d1Var, Callable callable) {
        this.f31859d = d1Var;
        callable.getClass();
        this.f31860e = callable;
    }

    @Override // o30.t0
    public final void a(Throwable th2) {
        switch (this.f31858c) {
            case 0:
                this.f31859d.n(th2);
                break;
            default:
                this.f31859d.n(th2);
                break;
        }
    }

    @Override // o30.t0
    public final void b(Object obj) {
        switch (this.f31858c) {
            case 0:
                this.f31859d.o((ListenableFuture) obj);
                break;
            default:
                this.f31859d.m(obj);
                break;
        }
    }

    @Override // o30.t0
    public final boolean d() {
        switch (this.f31858c) {
        }
        return this.f31859d.isDone();
    }

    @Override // o30.t0
    public final Object e() {
        switch (this.f31858c) {
            case 0:
                a0 a0Var = (a0) this.f31860e;
                ListenableFuture listenableFutureCall = a0Var.call();
                na0.a.a0(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", a0Var);
                return listenableFutureCall;
            default:
                return ((Callable) this.f31860e).call();
        }
    }

    @Override // o30.t0
    public final String f() {
        switch (this.f31858c) {
            case 0:
                return ((a0) this.f31860e).toString();
            default:
                return ((Callable) this.f31860e).toString();
        }
    }

    public c1(d1 d1Var, a0 a0Var) {
        this.f31859d = d1Var;
        this.f31860e = a0Var;
    }
}
