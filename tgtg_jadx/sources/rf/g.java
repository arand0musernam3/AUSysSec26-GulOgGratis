package rf;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.g f37980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye.b f37981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kf.b f37982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ye.g f37983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sf.b f37984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f37985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f37988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j30.g f37989j;

    public g(hf.g gVar, ye.b bVar, kf.b bVar2, ye.g gVar2, sf.b bVar3) {
        j30.g gVar3;
        gVar.getClass();
        bVar2.getClass();
        this.f37980a = gVar;
        this.f37981b = bVar;
        this.f37982c = bVar2;
        this.f37983d = gVar2;
        this.f37984e = bVar3;
        this.f37985f = new AtomicBoolean(false);
        this.f37988i = new AtomicBoolean(false);
        if (gVar instanceof hf.g) {
            gVar3 = new j30.g(gVar, bVar2, bVar);
        } else {
            bVar2.d("Custom storage, identify intercept not started");
            gVar3 = null;
        }
        this.f37989j = gVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (c(r0) == r1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pf.a r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.g.a(pf.a, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(pf.a r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rf.e
            if (r0 == 0) goto L13
            r0 = r6
            rf.e r0 = (rf.e) r0
            int r1 = r0.f37976m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37976m = r1
            goto L18
        L13:
            rf.e r0 = new rf.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f37975k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f37976m
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            rf.g r5 = r0.f37974j
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L29
            goto L4b
        L29:
            r6 = move-exception
            goto L44
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            hf.g r6 = r4.f37980a     // Catch: java.lang.Exception -> L42
            r0.f37974j = r4     // Catch: java.lang.Exception -> L42
            r0.f37976m = r3     // Catch: java.lang.Exception -> L42
            java.lang.Object r5 = r6.h(r5, r0)     // Catch: java.lang.Exception -> L42
            if (r5 != r1) goto L4b
            return r1
        L42:
            r6 = move-exception
            r5 = r4
        L44:
            kf.b r5 = r5.f37982c
            java.lang.String r0 = "Error when intercepting identifies"
            jf.e.J(r6, r5, r0)
        L4b:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.g.b(pf.a, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rf.f
            if (r0 == 0) goto L13
            r0 = r5
            rf.f r0 = (rf.f) r0
            int r1 = r0.f37979m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37979m = r1
            goto L18
        L13:
            rf.f r0 = new rf.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f37978k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f37979m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            rf.g r0 = r0.f37977j
            ba0.g.M(r5)
            goto L44
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            r0.f37977j = r4
            r0.f37979m = r3
            j30.g r5 = r4.f37989j
            r5.getClass()
            java.lang.Object r5 = r5.p(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            pf.a r5 = (pf.a) r5
            if (r5 == 0) goto L63
            sf.b r0 = r0.f37984e
            qf.a r0 = r0.f39020e
            if (r0 != 0) goto L54
            java.lang.String r0 = "pipeline"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        L54:
            r0.getClass()
            x80.m r0 = r0.f37036g
            qf.f r1 = new qf.f
            qf.g r2 = qf.g.EVENT
            r1.<init>(r2, r5)
            r0.h(r1)
        L63:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.g.c(z70.c):java.lang.Object");
    }
}
