package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import o00.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m1 f31865o = new m1(d0.class);
    public k30.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f31866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c0 f31867n;

    public d0(k30.b bVar, boolean z11) {
        int size = bVar.size();
        this.f31942h = null;
        this.f31943i = size;
        this.l = bVar;
        this.f31866m = z11;
    }

    @Override // o30.j
    public final void e() {
        k30.b bVar = this.l;
        w.OUTPUT_FUTURE_DONE.getClass();
        this.l = null;
        this.f31867n = null;
        if ((this.f31920a instanceof d) && (bVar != null)) {
            boolean zP = p();
            j00.g it = bVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // o30.j
    public final void k() {
        c0 c0Var = this.f31867n;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    @Override // o30.j
    public final String l() {
        k30.b bVar = this.l;
        if (bVar == null) {
            return super.l();
        }
        return "futures=" + bVar;
    }

    public final void q(k30.b bVar) {
        int iT = z.f31940j.t(this);
        na0.a.e0("Less than 0 remaining futures", iT >= 0);
        if (iT == 0) {
            if (bVar != null) {
                j00.g it = bVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z11 = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z11 = true;
                            } catch (Throwable th2) {
                                if (z11) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th2;
                            }
                        }
                        if (z11) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e5) {
                                r(e5.getCause());
                            } catch (Throwable th3) {
                                r(th3);
                            }
                        }
                    }
                }
            }
            this.f31942h = null;
            c0 c0Var = this.f31867n;
            if (c0Var != null) {
                try {
                    c0Var.f31853c.execute(c0Var);
                } catch (RejectedExecutionException e11) {
                    c0Var.f31854d.n(e11);
                }
            }
            w wVar = w.ALL_INPUT_FUTURES_PROCESSED;
            wVar.getClass();
            this.l = null;
            if (wVar == w.OUTPUT_FUTURE_DONE) {
                this.f31867n = null;
            }
        }
    }

    public final void r(Throwable th2) {
        th2.getClass();
        if (this.f31866m && !n(th2)) {
            Set set = this.f31942h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f31920a instanceof d)) {
                    Throwable thC = c();
                    Objects.requireNonNull(thC);
                    while (thC != null && setNewSetFromMap.add(thC)) {
                        thC = thC.getCause();
                    }
                }
                z.f31940j.l(this, setNewSetFromMap);
                Set set2 = this.f31942h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f31865o.a().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
            return;
        }
        boolean z11 = th2 instanceof Error;
        if (z11) {
            f31865o.a().log(Level.SEVERE, z11 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            c0 c0Var = this.f31867n;
            if (c0Var != null) {
                try {
                    c0Var.f31853c.execute(c0Var);
                    return;
                } catch (RejectedExecutionException e5) {
                    c0Var.f31854d.n(e5);
                    return;
                }
            }
            return;
        }
        k30.b bVar = this.l;
        if (!this.f31866m) {
            mr.h hVar = new mr.h(3, this, (Object) null);
            j00.g it = bVar.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    q(null);
                } else {
                    listenableFuture.a(hVar, g0.INSTANCE);
                }
            }
            return;
        }
        j00.g it2 = bVar.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i12 = i11 + 1;
            if (listenableFuture2.isDone()) {
                t(listenableFuture2);
            } else {
                listenableFuture2.a(new mr.h(this, i11, listenableFuture2), g0.INSTANCE);
            }
            i11 = i12;
        }
    }

    public final void t(ListenableFuture listenableFuture) {
        try {
            boolean z11 = false;
            if (listenableFuture.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (InterruptedException unused) {
                            z11 = true;
                        } catch (Throwable th2) {
                            if (z11) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    } catch (ExecutionException e5) {
                        r(e5.getCause());
                    } catch (Throwable th3) {
                        r(th3);
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            q(null);
        }
    }
}
