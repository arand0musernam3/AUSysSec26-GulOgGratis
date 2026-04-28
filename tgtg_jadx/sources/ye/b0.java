package ye;

import com.google.android.gms.internal.measurement.cg;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends qf.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80.i f45871c = cg.a(Integer.MAX_VALUE, null, null, 6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f45872d = new AtomicLong(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f45873e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45875g;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r7.e((java.util.List) r9, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r7.f(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (r7.g(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(ye.b0 r7, ye.m r8, z70.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof ye.y
            if (r0 == 0) goto L16
            r0 = r9
            ye.y r0 = (ye.y) r0
            int r1 = r0.f45949m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f45949m = r1
            goto L1b
        L16:
            ye.y r0 = new ye.y
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f45948k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45949m
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L34
            ba0.g.M(r9)
            goto La0
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L3b:
            ba0.g.M(r9)
            goto L86
        L3f:
            ba0.g.M(r9)
            goto L72
        L43:
            ye.b0 r7 = r0.f45947j
            ba0.g.M(r9)
            goto L5f
        L49:
            ba0.g.M(r9)
            boolean r9 = r8 instanceof ye.j
            if (r9 == 0) goto L75
            ye.j r8 = (ye.j) r8
            long r8 = r8.f45912a
            r0.f45947j = r7
            r0.f45949m = r6
            java.lang.Object r9 = r7.j(r8, r0)
            if (r9 != r1) goto L5f
            goto L9f
        L5f:
            java.util.List r9 = (java.util.List) r9
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f45873e
            r8.set(r6)
            r8 = 0
            r0.f45947j = r8
            r0.f45949m = r5
            kotlin.Unit r7 = r7.e(r9, r0)
            if (r7 != r1) goto L72
            goto L9f
        L72:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L75:
            boolean r9 = r8 instanceof ye.k
            if (r9 == 0) goto L89
            ye.k r8 = (ye.k) r8
            pf.a r8 = r8.f45913a
            r0.f45949m = r4
            java.lang.Object r7 = r7.f(r8, r0)
            if (r7 != r1) goto L86
            goto L9f
        L86:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L89:
            boolean r9 = r8 instanceof ye.l
            if (r9 == 0) goto La3
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f45873e
            r2 = 0
            r9.set(r2)
            ye.l r8 = (ye.l) r8
            long r8 = r8.f45914a
            r0.f45949m = r3
            kotlin.Unit r7 = r7.g(r8, r0)
            if (r7 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        La3:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.b0.c(ye.b0, ye.m, z70.c):java.lang.Object");
    }

    public static final long d(b0 b0Var, hf.g gVar, nf.e eVar, long j9) {
        Long lD0;
        b0Var.getClass();
        String strA = gVar.a(eVar);
        return (strA == null || (lD0 = StringsKt.d0(strA)) == null) ? j9 : lD0.longValue();
    }

    public final Unit e(List list, z70.c cVar) {
        if (list.isEmpty()) {
            return Unit.f26487a;
        }
        long j9 = this.f45874f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pf.a aVar = (pf.a) it.next();
            Long l = aVar.f34738e;
            if (l == null) {
                l = new Long(this.f45872d.get());
            }
            aVar.f34738e = l;
            Long l7 = aVar.f34737d;
            if (l7 == null) {
                long j11 = this.f45874f + 1;
                this.f45874f = j11;
                l7 = new Long(j11);
            }
            aVar.f34737d = l7;
            b().getClass();
            a(qf.c.Destination, a(qf.c.Enrichment, a(qf.c.Before, aVar)));
        }
        if (this.f45874f <= j9) {
            return Unit.f26487a;
        }
        Unit unitG = b().g().g(nf.e.LAST_EVENT_ID, String.valueOf(this.f45874f));
        return unitG == y70.a.COROUTINE_SUSPENDED ? unitG : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        if (r2.e(r13, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0 A[PHI: r2 r13
      0x00d0: PHI (r2v8 ye.b0) = (r2v4 ye.b0), (r2v7 ye.b0), (r2v9 ye.b0), (r2v11 ye.b0) binds: [B:52:0x00cf, B:36:0x0098, B:50:0x00cc, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r13v2 pf.a) = (r13v0 pf.a), (r13v1 pf.a), (r13v5 pf.a), (r13v8 pf.a) binds: [B:52:0x00cf, B:36:0x0098, B:50:0x00cc, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(pf.a r13, z70.c r14) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.b0.f(pf.a, z70.c):java.lang.Object");
    }

    public final Unit g(long j9, z70.c cVar) {
        if (this.f45872d.get() <= -1) {
            return Unit.f26487a;
        }
        this.f45875g = j9;
        Unit unitG = b().g().g(nf.e.LAST_EVENT_TIME, String.valueOf(this.f45875g));
        return unitG == y70.a.COROUTINE_SUSPENDED ? unitG : Unit.f26487a;
    }

    public final Unit h(long j9, z70.c cVar) {
        AtomicLong atomicLong = this.f45872d;
        atomicLong.set(j9);
        Unit unitG = b().g().g(nf.e.PREVIOUS_SESSION_ID, String.valueOf(atomicLong.get()));
        return unitG == y70.a.COROUTINE_SUSPENDED ? unitG : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r20, z70.c r22) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.b0.i(long, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (g(r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r10, z70.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof ye.a0
            if (r0 == 0) goto L13
            r0 = r12
            ye.a0 r0 = (ye.a0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ye.a0 r0 = new ye.a0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f45850j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r12)
            return r12
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L31:
            ba0.g.M(r12)
            goto L6c
        L35:
            ba0.g.M(r12)
            ye.b r12 = r9.b()
            r12.getClass()
            java.util.concurrent.atomic.AtomicLong r12 = r9.f45872d
            long r5 = r12.get()
            r7 = -1
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L6f
            java.util.concurrent.atomic.AtomicBoolean r12 = r9.f45873e
            boolean r12 = r12.get()
            if (r12 != 0) goto L63
            ye.b r12 = r9.b()
            ye.g r12 = r12.f45852a
            long r5 = r12.l
            long r7 = r9.f45875g
            long r7 = r10 - r7
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 >= 0) goto L6f
        L63:
            r0.l = r4
            kotlin.Unit r10 = r9.g(r10, r0)
            if (r10 != r1) goto L6c
            goto L77
        L6c:
            kotlin.collections.n0 r10 = kotlin.collections.n0.f26529a
            return r10
        L6f:
            r0.l = r3
            java.lang.Object r10 = r9.i(r10, r0)
            if (r10 != r1) goto L78
        L77:
            return r1
        L78:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.b0.j(long, z70.c):java.lang.Object");
    }
}
