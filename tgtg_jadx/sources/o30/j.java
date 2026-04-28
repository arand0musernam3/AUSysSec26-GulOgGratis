package o30;

import com.adyen.checkout.components.core.Address;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import w2.l1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends s {
    public static void g(j jVar, boolean z11) {
        g gVar = null;
        while (true) {
            for (r rVarI = s.f31919g.I(jVar); rVarI != null; rVarI = rVarI.f31912b) {
                Thread thread = rVarI.f31911a;
                if (thread != null) {
                    rVarI.f31911a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z11) {
                jVar.k();
                z11 = false;
            }
            jVar.e();
            g gVar2 = gVar;
            g gVarH = s.f31919g.H(jVar);
            g gVar3 = gVar2;
            while (gVarH != null) {
                g gVar4 = gVarH.f31886c;
                gVarH.f31886c = gVar3;
                gVar3 = gVarH;
                gVarH = gVar4;
            }
            while (gVar3 != null) {
                gVar = gVar3.f31886c;
                Runnable runnable = gVar3.f31884a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    jVar = eVar.f31869a;
                    if (jVar.f31920a == eVar) {
                        if (s.f31919g.w(jVar, eVar, j(eVar.f31870b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = gVar3.f31885b;
                    Objects.requireNonNull(executor);
                    h(runnable, executor);
                }
                gVar3 = gVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e5) {
            s.f31917e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            Throwable th2 = ((d) obj).f31864b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof f) {
            throw new ExecutionException(((f) obj).f31878a);
        }
        if (obj == s.f31916d) {
            return null;
        }
        return obj;
    }

    public static Object j(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thC;
        if (listenableFuture instanceof h) {
            Object dVar = ((j) listenableFuture).f31920a;
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                if (dVar2.f31863a) {
                    dVar = dVar2.f31864b != null ? new d(dVar2.f31864b, false) : d.f31862d;
                }
            }
            Objects.requireNonNull(dVar);
            return dVar;
        }
        if ((listenableFuture instanceof s) && (thC = ((s) listenableFuture).c()) != null) {
            return new f(thC);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z11 = true;
        if ((!s.f31918f) && zIsCancelled) {
            d dVar3 = d.f31862d;
            Objects.requireNonNull(dVar3);
            return dVar3;
        }
        boolean z12 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e5) {
                        e = e5;
                        return new f(e);
                    }
                } catch (InterruptedException unused) {
                    z12 = z11;
                } catch (Throwable th2) {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e11) {
                e = e11;
                return new f(e);
            } catch (CancellationException e12) {
                if (zIsCancelled) {
                    return new d(e12, false);
                }
                return new f(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e12));
            } catch (ExecutionException e13) {
                if (!zIsCancelled) {
                    return new f(e13.getCause());
                }
                return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e13), false);
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? s.f31916d : obj;
        }
        return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void a(Runnable runnable, Executor executor) {
        g gVar;
        g gVar2 = g.f31883d;
        na0.a.b0(executor, "Executor was null.");
        if (!isDone() && (gVar = this.f31921b) != gVar2) {
            g gVar3 = new g(runnable, executor);
            do {
                gVar3.f31886c = gVar;
                if (s.f31919g.v(this, gVar, gVar3)) {
                    return;
                } else {
                    gVar = this.f31921b;
                }
            } while (gVar != gVar2);
        }
        h(runnable, executor);
    }

    @Override // o30.s
    public final Throwable c() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f31920a;
        if (obj instanceof f) {
            return ((f) obj).f31878a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        d dVar;
        Object obj = this.f31920a;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (s.f31918f) {
            dVar = new d(new CancellationException("Future.cancel() was called."), z11);
        } else {
            dVar = z11 ? d.f31861c : d.f31862d;
            Objects.requireNonNull(dVar);
        }
        j jVar = this;
        boolean z12 = false;
        while (true) {
            if (s.f31919g.w(jVar, obj, dVar)) {
                g(jVar, z11);
                if (!(obj instanceof e)) {
                    break;
                }
                ListenableFuture listenableFuture = ((e) obj).f31870b;
                if (!(listenableFuture instanceof h)) {
                    listenableFuture.cancel(z11);
                    break;
                }
                jVar = (j) listenableFuture;
                obj = jVar.f31920a;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z12 = true;
            } else {
                obj = jVar.f31920a;
                if (!(obj instanceof e)) {
                    return z12;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb2) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e5) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e5.getCause());
                sb2.append("]");
                return;
            } catch (Exception e11) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e11.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        f(sb2, obj);
        sb2.append("]");
    }

    public final void f(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z11;
        long j11;
        r rVar = r.f31910c;
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f31920a;
        if ((obj != null) && (!(obj instanceof e))) {
            return i(obj);
        }
        long j12 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r rVar2 = this.f31922c;
            if (rVar2 != rVar) {
                r rVar3 = new r();
                z11 = true;
                while (true) {
                    w.b bVar = s.f31919g;
                    bVar.X(rVar3, rVar2);
                    if (bVar.x(this, rVar2, rVar3)) {
                        j11 = j12;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(rVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f31920a;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(rVar3);
                    } else {
                        long j13 = j12;
                        rVar2 = this.f31922c;
                        if (rVar2 == rVar) {
                            break;
                        }
                        j12 = j13;
                    }
                }
            }
            Object obj3 = this.f31920a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        z11 = true;
        j11 = 0;
        while (nanos > j11) {
            Object obj4 = this.f31920a;
            if ((obj4 != null ? z11 : false) && (!(obj4 instanceof e))) {
                return i(obj4);
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
        if (nanos + 1000 < j11) {
            String strConcat = string3.concat(" (plus ");
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            boolean z12 = (jConvert == j11 || nanos2 > 1000) ? z11 : false;
            if (jConvert > j11) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z12) {
                    strConcat2 = strConcat2.concat(MessageLogView.COMMA_SEPARATOR);
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z12) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(r8.k.m(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f31920a instanceof d;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof e)) & (this.f31920a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = s.f31916d;
        }
        if (!s.f31919g.w(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        th2.getClass();
        if (!s.f31919g.w(this, null, new f(th2))) {
            return false;
        }
        g(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(com.google.common.util.concurrent.ListenableFuture r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f31920a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = j(r6)
            w.b r0 = o30.s.f31919g
            boolean r6 = r0.w(r5, r3, r6)
            if (r6 == 0) goto L4f
            g(r5, r1)
            return r2
        L20:
            o30.e r0 = new o30.e
            r0.<init>(r5, r6)
            w.b r4 = o30.s.f31919g
            boolean r3 = r4.w(r5, r3, r0)
            if (r3 == 0) goto L42
            o30.g0 r1 = o30.g0.INSTANCE     // Catch: java.lang.Throwable -> L33
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            o30.f r1 = new o30.f     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            o30.f r1 = o30.f.f31877b
        L3c:
            w.b r6 = o30.s.f31919g
            r6.w(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f31920a
        L44:
            boolean r2 = r0 instanceof o30.d
            if (r2 == 0) goto L4f
            o30.d r0 = (o30.d) r0
            boolean r0 = r0.f31863a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.j.o(com.google.common.util.concurrent.ListenableFuture):boolean");
    }

    public final boolean p() {
        Object obj = this.f31920a;
        return (obj instanceof d) && ((d) obj).f31863a;
    }

    public String toString() {
        String strL;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            d(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f31920a;
            if (obj instanceof e) {
                sb2.append(", setFuture=[");
                ListenableFuture listenableFuture = ((e) obj).f31870b;
                try {
                    if (listenableFuture == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(listenableFuture);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strL = l();
                    if (m0.c.o0(strL)) {
                        strL = null;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strL = "Exception thrown from implementation: " + th3.getClass();
                }
                if (strL != null) {
                    sb2.append(", info=[");
                    sb2.append(strL);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                d(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void e() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        r rVar = r.f31910c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f31920a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return i(obj2);
            }
            r rVar2 = this.f31922c;
            if (rVar2 != rVar) {
                r rVar3 = new r();
                do {
                    w.b bVar = s.f31919g;
                    bVar.X(rVar3, rVar2);
                    if (bVar.x(this, rVar2, rVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f31920a;
                            } else {
                                b(rVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return i(obj);
                    }
                    rVar2 = this.f31922c;
                } while (rVar2 != rVar);
            }
            Object obj3 = this.f31920a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
