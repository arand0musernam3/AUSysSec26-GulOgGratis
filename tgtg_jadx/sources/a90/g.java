package a90;

import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import kotlinx.coroutines.internal.UndeliveredElementException;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f1022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f1023b;

    static {
        int i11 = 0;
        f1022a = new v("UNDEFINED", i11);
        f1023b = new v("REUSABLE_CLAIMED", i11);
    }

    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionB = b(function1, obj, null);
        if (undeliveredElementExceptionB != null) {
            f0.v(coroutineContext, undeliveredElementExceptionB);
        }
    }

    public static final UndeliveredElementException b(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException(j4.s.j(obj, "Exception in undelivered element handler for "), th2);
            }
            u70.e.a(undeliveredElementException, th2);
            return undeliveredElementException;
        }
    }

    public static final void c(int i11) {
        if (i11 >= 1) {
            return;
        }
        i4.a.i(j4.s.f(i11, "Expected positive parallelism level, but got "));
    }

    public static final t d(Object obj) {
        if (obj != b.f1008a) {
            return (t) obj;
        }
        h2.b("Does not contain segment");
        return null;
    }

    public static final void e(CoroutineContext coroutineContext, Throwable th2) {
        Throwable runtimeException;
        Iterator it = e.f1016a.iterator();
        while (it.hasNext()) {
            try {
                ((v80.z) it.next()).handleException(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    u70.e.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            u70.e.a(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean f(Object obj) {
        return obj == b.f1008a;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.Object r9, x70.c r10) throws kotlinx.coroutines.DispatchException {
        /*
            boolean r0 = r10 instanceof a90.f
            if (r0 == 0) goto Lae
            a90.f r10 = (a90.f) r10
            v80.x r0 = r10.f1018d
            z70.c r1 = r10.f1019e
            java.lang.Throwable r2 = u70.q.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            v80.t r3 = new v80.t
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            boolean r2 = j(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f1020f = r3
            r10.f42133c = r4
            kotlin.coroutines.CoroutineContext r9 = r1.getContext()
            i(r0, r9, r10)
            return
        L2f:
            v80.u0 r0 = v80.f2.a()
            long r5 = r0.f42164b
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f1020f = r3
            r10.f42133c = r4
            r0.B0(r10)
            goto La8
        L46:
            r0.C0(r4)
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            v80.h1 r3 = v80.h1.f42106a     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            v80.i1 r2 = (v80.i1) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.g()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.A()     // Catch: java.lang.Throwable -> L69
            u70.p r9 = ba0.g.j(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f1021g     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = a90.x.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            a90.v r5 = a90.x.f1053a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            v80.l2 r5 = v80.v.c(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.m0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            a90.x.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.E0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.A0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.m0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            a90.x.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.f(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.A0(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.g.h(java.lang.Object, x70.c):void");
    }

    public static final void i(v80.x xVar, CoroutineContext coroutineContext, Runnable runnable) throws DispatchException {
        try {
            xVar.u0(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, xVar, coroutineContext);
        }
    }

    public static final boolean j(v80.x xVar, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return xVar.y0(coroutineContext);
        } catch (Throwable th2) {
            throw new DispatchException(th2, xVar, coroutineContext);
        }
    }

    public static final long k(String str, long j9, long j11, long j12) {
        String property;
        int i11 = w.f1052a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j9;
        }
        Long lD0 = StringsKt.d0(property);
        if (lD0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lD0.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        StringBuilder sbN = b3.i.n(j11, "System property '", str, "' should be in range ");
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sbN, "..", j12, ", but is '");
        sbN.append(jLongValue);
        sbN.append('\'');
        throw new IllegalStateException(sbN.toString().toString());
    }

    public static int l(int i11, int i12, String str) {
        return (int) k(str, i11, 1, (i12 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
