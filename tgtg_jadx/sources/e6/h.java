package e6;

import com.braze.Constants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o30.f0;
import w2.l1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15769d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f15770e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f0 f15771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f15772g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f15774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f15775c;

    static {
        f0 fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, Constants.BRAZE_PUSH_CONTENT_KEY));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f15771f = fVar;
        if (th != null) {
            f15770e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15772g = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f15775c;
        } while (!f15771f.v(hVar, gVar, g.f15766c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f15767a;
            if (thread != null) {
                gVar.f15767a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f15768b;
        }
        hVar.d();
        do {
            dVar2 = hVar.f15774b;
        } while (!f15771f.t(hVar, dVar2, d.f15757d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f15760c;
            dVar.f15760c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f15760c;
            f(dVar3.f15758a, dVar3.f15759b);
            dVar3 = dVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f15770e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f15754b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f15756a);
        }
        if (obj == f15772g) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = future.get();
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
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f15774b;
        d dVar2 = d.f15757d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f15760c = dVar;
                if (f15771f.t(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f15774b;
                }
            } while (dVar != dVar2);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e5.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        Object obj = this.f15773a;
        if (obj == null) {
            if (f15771f.u(this, obj, f15769d ? new a(new CancellationException("Future.cancel() was called."), z11) : z11 ? a.f15751c : a.f15752d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g gVar = g.f15766c;
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15773a;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f15775c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    f0 f0Var = f15771f;
                    f0Var.I(gVar3, gVar2);
                    if (f0Var.v(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15773a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(gVar3);
                    } else {
                        gVar2 = this.f15775c;
                    }
                } while (gVar2 != gVar);
            }
            return g(this.f15773a);
        }
        while (nanos > 0) {
            Object obj3 = this.f15773a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbG = l1.g("Waited ", j9, " ");
        sbG.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbG.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z11 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z11) {
                    strConcat2 = strConcat2.concat(MessageLogView.COMMA_SEPARATOR);
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z11) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(r8.k.m(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15773a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15773a != null;
    }

    public final void j(g gVar) {
        gVar.f15767a = null;
        while (true) {
            g gVar2 = this.f15775c;
            if (gVar2 == g.f15766c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f15768b;
                if (gVar2.f15767a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f15768b = gVar4;
                    if (gVar3.f15767a == null) {
                        break;
                    }
                } else if (!f15771f.v(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = f15772g;
        }
        if (!f15771f.u(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th2) {
        th2.getClass();
        if (!f15771f.u(this, null, new c(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f15773a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e5) {
                strI = "Exception thrown from implementation: " + e5.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strI);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f15766c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15773a;
            if (obj2 != null) {
                return g(obj2);
            }
            g gVar2 = this.f15775c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    f0 f0Var = f15771f;
                    f0Var.I(gVar3, gVar2);
                    if (f0Var.v(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15773a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    gVar2 = this.f15775c;
                } while (gVar2 != gVar);
            }
            return g(this.f15773a);
        }
        throw new InterruptedException();
    }
}
