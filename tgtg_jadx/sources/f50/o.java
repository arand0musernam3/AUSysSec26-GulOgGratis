package f50;

import c50.k1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f17364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f17365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.f f17366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f17367d;

    public o(CoroutineContext coroutineContext, k1 k1Var, d8.f fVar) {
        coroutineContext.getClass();
        k1Var.getClass();
        fVar.getClass();
        this.f17364a = coroutineContext;
        this.f17365b = k1Var;
        this.f17366c = fVar;
        this.f17367d = new AtomicReference();
        f0.B(f0.b(coroutineContext), null, null, new m(this, null, 0), 3);
    }

    public final h a() throws Throwable {
        AtomicReference atomicReference = this.f17367d;
        if (atomicReference.get() == null) {
            Object objE = f0.E(kotlin.coroutines.g.f26549a, new m(this, null, 1));
            while (!atomicReference.compareAndSet(null, objE) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (h) obj;
    }

    public final boolean b() {
        Long l = a().f17351e;
        Integer num = a().f17350d;
        if (l == null || num == null) {
            return true;
        }
        this.f17365b.getClass();
        return k1.a().f7592c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(f50.h r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f50.n
            if (r0 == 0) goto L13
            r0 = r8
            f50.n r0 = (f50.n) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            f50.n r0 = new f50.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f17362j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r8)     // Catch: java.io.IOException -> L27
            goto L59
        L27:
            r7 = move-exception
            goto L46
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L30:
            ba0.g.M(r8)
            d8.f r8 = r6.f17366c     // Catch: java.io.IOException -> L27
            a3.y r2 = new a3.y     // Catch: java.io.IOException -> L27
            r4 = 0
            r5 = 8
            r2.<init>(r7, r4, r5)     // Catch: java.io.IOException -> L27
            r0.l = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r7 = r8.a(r2, r0)     // Catch: java.io.IOException -> L27
            if (r7 != r1) goto L59
            return r1
        L46:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FirebaseSessions"
            android.util.Log.w(r8, r7)
        L59:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.o.c(f50.h, z70.c):java.lang.Object");
    }
}
