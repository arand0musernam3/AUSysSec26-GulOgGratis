package jp;

import android.content.Context;
import gt.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ip.a f25360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f25361c;

    public q(Context context, ip.a aVar, a0 a0Var) {
        aVar.getClass();
        this.f25359a = context;
        this.f25360b = aVar;
        this.f25361c = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        if (r0 == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hp.g r25, z70.c r26) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.a(hp.g, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jp.b
            if (r0 == 0) goto L13
            r0 = r6
            jp.b r0 = (jp.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.b r0 = new jp.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25325j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L27
            goto L4c
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r6)
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r6 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r6 = r6.f24075a     // Catch: java.lang.Throwable -> L27
            hp.b0 r2 = new hp.b0     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L47
            goto L49
        L47:
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
        L49:
            if (r5 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r5
        L51:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.b(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jp.c
            if (r0 == 0) goto L13
            r0 = r9
            jp.c r0 = (jp.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.c r0 = new jp.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f25327j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L27
            goto L57
        L27:
            r9 = move-exception
            goto L5c
        L29:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L30:
            ba0.g.M(r9)
            u70.o r9 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            r6 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r4 = r4 - r6
            gt.a0 r9 = r8.f25361c     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            y9.v r9 = r9.f20830a     // Catch: java.lang.Throwable -> L27
            cg.k r2 = new cg.k     // Catch: java.lang.Throwable -> L27
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L27
            r4 = 0
            java.lang.Object r9 = o00.x0.C(r0, r9, r4, r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r9 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
        L54:
            if (r9 != r1) goto L57
            return r1
        L57:
            kotlin.Unit r9 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
            u70.o r0 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r9
        L5c:
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.c(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jp.d
            if (r0 == 0) goto L13
            r0 = r6
            jp.d r0 = (jp.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.d r0 = new jp.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25329j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L4c
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r6)
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r6 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r6 = r6.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r6.h(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L42
            goto L44
        L42:
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
        L44:
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r5
        L4c:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.d(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r5, java.util.List r6, java.util.List r7, z70.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof jp.e
            if (r0 == 0) goto L13
            r0 = r8
            jp.e r0 = (jp.e) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.e r0 = new jp.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f25331j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L27
            goto L60
        L27:
            r5 = move-exception
            goto L65
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r8)
            u70.o r8 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r8 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            hp.i0 r2 = new hp.i0     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L27
            java.time.ZonedDateTime r5 = java.time.ZonedDateTime.now()     // Catch: java.lang.Throwable -> L27
            java.time.ZoneOffset r5 = r5.getOffset()     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            android.content.Context r6 = r4.f25359a     // Catch: java.lang.Throwable -> L27
            boolean r6 = android.text.format.DateFormat.is24HourFormat(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r7 = r8.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r7.k(r2, r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L60
            return r1
        L60:
            hp.n r8 = (hp.n) r8     // Catch: java.lang.Throwable -> L27
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r8
        L65:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.e(java.util.List, java.util.List, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jp.f
            if (r0 == 0) goto L13
            r0 = r7
            jp.f r0 = (jp.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.f r0 = new jp.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25333j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27
            goto L60
        L27:
            r6 = move-exception
            goto L65
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r7 = r5.f25360b     // Catch: java.lang.Throwable -> L27
            hp.b0 r2 = new hp.b0     // Catch: java.lang.Throwable -> L27
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L27
            java.time.ZonedDateTime r6 = java.time.ZonedDateTime.now()     // Catch: java.lang.Throwable -> L27
            java.time.ZoneOffset r6 = r6.getOffset()     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L27
            r6.getClass()     // Catch: java.lang.Throwable -> L27
            android.content.Context r4 = r5.f25359a     // Catch: java.lang.Throwable -> L27
            boolean r4 = android.text.format.DateFormat.is24HourFormat(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r7 = r7.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.e(r2, r6, r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L60
            return r1
        L60:
            hp.e0 r7 = (hp.e0) r7     // Catch: java.lang.Throwable -> L27
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r7
        L65:
            u70.o r7 = u70.q.f40850b
            u70.p r7 = new u70.p
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.f(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jp.g
            if (r0 == 0) goto L13
            r0 = r6
            jp.g r0 = (jp.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.g r0 = new jp.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f25335j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L27
            goto L5b
        L27:
            r6 = move-exception
            goto L60
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r6)
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r6 = r5.f25360b     // Catch: java.lang.Throwable -> L27
            java.time.ZonedDateTime r2 = java.time.ZonedDateTime.now()     // Catch: java.lang.Throwable -> L27
            java.time.ZoneOffset r2 = r2.getOffset()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            android.content.Context r4 = r5.f25359a     // Catch: java.lang.Throwable -> L27
            boolean r4 = android.text.format.DateFormat.is24HourFormat(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r6 = r6.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.f(r2, r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L5b
            return r1
        L5b:
            hp.k r6 = (hp.k) r6     // Catch: java.lang.Throwable -> L27
            u70.o r0 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r6
        L60:
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.g(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jp.h
            if (r0 == 0) goto L13
            r0 = r5
            jp.h r0 = (jp.h) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.h r0 = new jp.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25337j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r5)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r5 = move-exception
            goto L47
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r5 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r5 = r5.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.d(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L42
            return r1
        L42:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L27
            u70.o r0 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r5
        L47:
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.h(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jp.i
            if (r0 == 0) goto L13
            r0 = r6
            jp.i r0 = (jp.i) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.i r0 = new jp.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25339j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r5 = move-exception
            goto L49
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r6)
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r6 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r6 = r6.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.j(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L42
            return r1
        L42:
            hp.o1 r6 = (hp.o1) r6     // Catch: java.lang.Throwable -> L27
            hp.g r5 = r6.f22315a     // Catch: java.lang.Throwable -> L27
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r5
        L49:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.i(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(z70.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jp.j
            if (r0 == 0) goto L13
            r0 = r7
            jp.j r0 = (jp.j) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.j r0 = new jp.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25341j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27
            goto L4a
        L27:
            r7 = move-exception
            goto L8e
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L30:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            gt.a0 r7 = r6.f25361c     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            y9.v r7 = r7.f20830a     // Catch: java.lang.Throwable -> L27
            g9.r0 r2 = new g9.r0     // Catch: java.lang.Throwable -> L27
            r4 = 20
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27
            r4 = 0
            java.lang.Object r7 = o00.x0.C(r0, r7, r3, r4, r2)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r1 = 10
            int r1 = kotlin.collections.e0.o(r7, r1)     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L27
        L5b:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L27
            com.app.tgtg.model.local.ViewedRecipe r1 = (com.app.tgtg.model.local.ViewedRecipe) r1     // Catch: java.lang.Throwable -> L27
            n90.b r2 = n90.c.f30748d     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r1.getRecipeJson()     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            hp.f r4 = hp.g.Companion     // Catch: java.lang.Throwable -> L27
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch: java.lang.Throwable -> L27
            i90.b r4 = (i90.b) r4     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.b(r4, r3)     // Catch: java.lang.Throwable -> L27
            hp.g r2 = (hp.g) r2     // Catch: java.lang.Throwable -> L27
            hp.p1 r3 = new hp.p1     // Catch: java.lang.Throwable -> L27
            long r4 = r1.getViewedAt()     // Catch: java.lang.Throwable -> L27
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L27
            r0.add(r3)     // Catch: java.lang.Throwable -> L27
            goto L5b
        L8b:
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r0
        L8e:
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.j(z70.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jp.k
            if (r0 == 0) goto L13
            r0 = r5
            jp.k r0 = (jp.k) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.k r0 = new jp.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25343j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r5)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r5 = move-exception
            goto L47
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r5 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r5 = r5.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.i(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L42
            return r1
        L42:
            hp.e1 r5 = (hp.e1) r5     // Catch: java.lang.Throwable -> L27
            u70.o r0 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r5
        L47:
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.k(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jp.l
            if (r0 == 0) goto L13
            r0 = r5
            jp.l r0 = (jp.l) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.l r0 = new jp.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25345j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r5)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r5 = move-exception
            goto L47
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r5 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r5 = r5.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.l(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L42
            return r1
        L42:
            hp.e1 r5 = (hp.e1) r5     // Catch: java.lang.Throwable -> L27
            u70.o r0 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r5
        L47:
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.l(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(hp.g r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jp.m
            if (r0 == 0) goto L13
            r0 = r6
            jp.m r0 = (jp.m) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.m r0 = new jp.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25347j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L4c
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r6)
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            ip.a r6 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            hp.y0 r2 = new hp.y0     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r5 = r6.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r5.g(r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L47
            return r1
        L47:
            hp.b1 r6 = (hp.b1) r6     // Catch: java.lang.Throwable -> L27
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r6
        L4c:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.m(hp.g, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(hp.g r5, java.lang.String r6, z70.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof jp.n
            if (r0 == 0) goto L13
            r0 = r7
            jp.n r0 = (jp.n) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.n r0 = new jp.n
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f25349j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27
            goto L59
        L27:
            r5 = move-exception
            goto L5e
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            if (r5 != 0) goto L47
            if (r6 == 0) goto L3a
            goto L47
        L3a:
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L27
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "kotlin.Unit"
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L27
            throw r6     // Catch: java.lang.Throwable -> L27
        L47:
            hp.i1 r7 = new hp.i1     // Catch: java.lang.Throwable -> L27
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L27
            ip.a r5 = r4.f25360b     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            ip.d r5 = r5.f24075a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r5.c(r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L59
            return r1
        L59:
            hp.l1 r7 = (hp.l1) r7     // Catch: java.lang.Throwable -> L27
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27
            return r7
        L5e:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.n(hp.g, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
    
        if (r0 == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(hp.g r22, z70.c r23) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.o(hp.g, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.ArrayList r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jp.p
            if (r0 == 0) goto L13
            r0 = r6
            jp.p r0 = (jp.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jp.p r0 = new jp.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25357j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L27
            goto L40
        L27:
            r5 = move-exception
            goto L45
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r6)
            ip.a r6 = r4.f25360b     // Catch: java.lang.Exception -> L27
            r0.l = r3     // Catch: java.lang.Exception -> L27
            ip.d r6 = r6.f24075a     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L40
            return r1
        L40:
            hp.l0 r6 = (hp.l0) r6     // Catch: java.lang.Exception -> L27
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Exception -> L27
            return r6
        L45:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.q.p(java.util.ArrayList, z70.c):java.lang.Object");
    }
}
