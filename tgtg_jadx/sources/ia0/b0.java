package ia0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f23605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f23607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23610f;

    public b0(i iVar) {
        this.f23605a = iVar;
        g gVarH = iVar.h();
        this.f23606b = gVarH;
        e0 e0Var = gVarH.f23642a;
        this.f23607c = e0Var;
        this.f23608d = e0Var != null ? e0Var.f23626b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.f23626b) goto L16;
     */
    @Override // ia0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(ia0.g r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            boolean r3 = r8.f23609e
            if (r3 != 0) goto L61
            ia0.e0 r3 = r8.f23607c
            ia0.g r4 = r8.f23606b
            if (r3 == 0) goto L29
            ia0.e0 r5 = r4.f23642a
            if (r3 != r5) goto L21
            int r3 = r8.f23608d
            r5.getClass()
            int r5 = r5.f23626b
            if (r3 != r5) goto L21
            goto L29
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            com.braze.h2.b(r9)
        L26:
            r9 = 0
            return r9
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            long r0 = r8.f23610f
            r2 = 1
            long r0 = r0 + r2
            ia0.i r2 = r8.f23605a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            ia0.e0 r0 = r8.f23607c
            if (r0 != 0) goto L4a
            ia0.e0 r0 = r4.f23642a
            if (r0 == 0) goto L4a
            r8.f23607c = r0
            int r0 = r0.f23626b
            r8.f23608d = r0
        L4a:
            long r0 = r4.f23643b
            long r2 = r8.f23610f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            ia0.g r2 = r8.f23606b
            long r4 = r8.f23610f
            r3 = r9
            r2.A(r3, r4, r6)
            long r9 = r8.f23610f
            long r9 = r9 + r6
            r8.f23610f = r9
            return r6
        L61:
            java.lang.String r9 = "closed"
            com.braze.h2.b(r9)
            goto L26
        L67:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = e0.f.i(r10, r9)
            i4.a.i(r9)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.b0.F(ia0.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23609e = true;
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f23605a.i();
    }
}
