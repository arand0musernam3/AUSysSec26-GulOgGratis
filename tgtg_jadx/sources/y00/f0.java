package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f44746f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f44748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44750d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f44751e = null;

    public /* synthetic */ f0(String str, Object obj, w wVar) {
        this.f44747a = str;
        this.f44749c = obj;
        this.f44748b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f44750d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L7
            return r4
        L7:
            ky.p r4 = y00.c2.f44659n
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f44749c
            return r4
        Le:
            java.lang.Object r4 = y00.f0.f44746f
            monitor-enter(r4)
            boolean r0 = ky.p.v()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f44751e     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f44749c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L64
        L20:
            java.lang.Object r0 = r3.f44751e     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = y00.g0.f44762a     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            y00.f0 r0 = (y00.f0) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = ky.p.v()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            y00.w r2 = r0.f44748b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.a()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = y00.f0.f44746f     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.f44751e = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
            y00.w r4 = r3.f44748b
            if (r4 != 0) goto L5f
        L5c:
            java.lang.Object r4 = r3.f44749c
            goto L63
        L5f:
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
        L63:
            return r4
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L66:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.f0.a(java.lang.Object):java.lang.Object");
    }
}
