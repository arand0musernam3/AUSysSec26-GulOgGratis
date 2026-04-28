package o00;

import com.adyen.checkout.components.core.Address;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Task f31746h;

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof y0) {
            Throwable th2 = ((y0) obj).f31781a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof a1) {
            throw new ExecutionException(((a1) obj).f31620a);
        }
        if (obj == j1.f31686d) {
            return null;
        }
        return obj;
    }

    public static Object d(t1 t1Var) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = t1Var.get();
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

    public static void e(t1 t1Var) {
        for (i1 i1VarZ = j1.f31689g.Z(t1Var); i1VarZ != null; i1VarZ = i1VarZ.f31680b) {
            Thread thread = i1VarZ.f31679a;
            if (thread != null) {
                i1VarZ.f31679a = null;
                LockSupport.unpark(thread);
            }
        }
        t1Var.f31746h = null;
        b1 b1VarA0 = j1.f31689g.a0(t1Var);
        b1 b1Var = null;
        while (b1VarA0 != null) {
            b1 b1Var2 = b1VarA0.f31626a;
            b1VarA0.f31626a = b1Var;
            b1Var = b1VarA0;
            b1VarA0 = b1Var2;
        }
        if (b1Var != null) {
            throw null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        y0 y0Var;
        Object obj = this.f31690a;
        if (obj != null) {
            return false;
        }
        if (j1.f31688f) {
            y0Var = new y0(z11, new CancellationException("Future.cancel() was called."));
        } else {
            y0Var = z11 ? y0.f31779b : y0.f31780c;
            Objects.requireNonNull(y0Var);
        }
        if (!j1.f31689g.b0(this, obj, y0Var)) {
            return false;
        }
        e(this);
        return true;
    }

    public final void f(StringBuilder sb2) {
        try {
            Object objD = d(this);
            sb2.append("SUCCESS, result=[");
            if (objD == null) {
                sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else if (objD == this) {
                sb2.append("this future");
            } else {
                sb2.append(objD.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objD)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e5) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e5.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j11;
        i1 i1Var = i1.f31678c;
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f31690a;
        if (obj != null) {
            return c(obj);
        }
        long j12 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i1 i1Var2 = this.f31692c;
            if (i1Var2 != i1Var) {
                i1 i1Var3 = new i1();
                while (true) {
                    ox.h hVar = j1.f31689g;
                    hVar.X(i1Var3, i1Var2);
                    if (hVar.Y(this, i1Var2, i1Var3)) {
                        j11 = j12;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(i1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f31690a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(i1Var3);
                    } else {
                        long j13 = j12;
                        i1Var2 = this.f31692c;
                        if (i1Var2 == i1Var) {
                            break;
                        }
                        j12 = j13;
                    }
                }
            }
            Object obj3 = this.f31690a;
            Objects.requireNonNull(obj3);
            return c(obj3);
        }
        j11 = 0;
        while (nanos > j11) {
            Object obj4 = this.f31690a;
            if (obj4 != null) {
                return c(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 8 + String.valueOf(lowerCase2).length());
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "Waited ", j9, " ");
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < j11) {
            String strConcat = string3.concat(" (plus ");
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            boolean z11 = jConvert == j11 || nanos2 > 1000;
            if (jConvert > j11) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                org.bouncycastle.jcajce.provider.asymmetric.a.v(sb3, strConcat, jConvert, " ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z11) {
                    string4 = string4.concat(MessageLogView.COMMA_SEPARATOR);
                }
                strConcat = string4.concat(" ");
            }
            if (z11) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(e0.f.n(new StringBuilder(string3.length() + 5 + string.length()), string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31690a instanceof y0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31690a != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<o00.t1> r1 = o00.t1.class
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "com.google.common.util.concurrent."
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L1b
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L22
        L1b:
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L22:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.f31690a
            boolean r1 = r1 instanceof o00.y0
            java.lang.String r2 = "]"
            if (r1 == 0) goto L45
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto La6
        L45:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L4f
            r6.f(r0)
            goto La6
        L4f:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            com.google.android.gms.tasks.Task r3 = r6.f31746h     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L5f
            java.lang.String r3 = ""
            goto L63
        L5f:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6e
        L63:
            r4 = 0
            if (r3 == 0) goto L6c
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L89
        L6c:
            r3 = r4
            goto L89
        L6e:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L7b
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L78
            goto L7b
        L78:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L7b:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Exception thrown from implementation: "
            java.lang.String r3 = r4.concat(r3)
        L89:
            if (r3 == 0) goto L96
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        L96:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto La6
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.f(r0)
        La6:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.t1.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        i1 i1Var = i1.f31678c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f31690a;
            if (obj2 != null) {
                return c(obj2);
            }
            i1 i1Var2 = this.f31692c;
            if (i1Var2 != i1Var) {
                i1 i1Var3 = new i1();
                do {
                    ox.h hVar = j1.f31689g;
                    hVar.X(i1Var3, i1Var2);
                    if (hVar.Y(this, i1Var2, i1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f31690a;
                            } else {
                                b(i1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    i1Var2 = this.f31692c;
                } while (i1Var2 != i1Var);
            }
            Object obj3 = this.f31690a;
            Objects.requireNonNull(obj3);
            return c(obj3);
        }
        throw new InterruptedException();
    }
}
