package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements z5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z5.c f46573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e90.c f46576d = new e90.c(false);

    public k2(z5.c cVar) {
        this.f46573a = cVar;
    }

    @Override // z5.c
    public final long I(float f11) {
        return this.f46573a.I(f11);
    }

    @Override // z5.c
    public final float O(int i11) {
        return this.f46573a.O(i11);
    }

    @Override // z5.c
    public final float R(float f11) {
        return this.f46573a.R(f11);
    }

    @Override // z5.c
    public final float X() {
        return this.f46573a.X();
    }

    @Override // z5.c
    public final float a() {
        return this.f46573a.a();
    }

    public final void b() {
        this.f46575c = true;
        e90.c cVar = this.f46576d;
        if (cVar.a()) {
            cVar.e(null);
        }
    }

    public final void c() {
        this.f46574b = true;
        e90.c cVar = this.f46576d;
        if (cVar.a()) {
            cVar.e(null);
        }
    }

    @Override // z5.c
    public final float c0(float f11) {
        return this.f46573a.c0(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z1.i2
            if (r0 == 0) goto L13
            r0 = r5
            z1.i2 r0 = (z1.i2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.i2 r0 = new z1.i2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f46547j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            r0.l = r3
            e90.c r5 = r4.f46576d
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            r5 = 0
            r4.f46574b = r5
            r4.f46575c = r5
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k2.e(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof z1.j2
            if (r0 == 0) goto L13
            r0 = r6
            z1.j2 r0 = (z1.j2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.j2 r0 = new z1.j2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f46559j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            e90.c r3 = r5.f46576d
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            ba0.g.M(r6)
            goto L44
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r6)
            boolean r6 = r5.f46574b
            if (r6 != 0) goto L48
            boolean r6 = r5.f46575c
            if (r6 != 0) goto L48
            r0.l = r4
            java.lang.Object r6 = r3.g(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            r6 = 0
            r3.e(r6)
        L48:
            boolean r6 = r5.f46574b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k2.g(z70.c):java.lang.Object");
    }

    @Override // z5.c
    public final int j0(long j9) {
        return this.f46573a.j0(j9);
    }

    @Override // z5.c
    public final long l(float f11) {
        return this.f46573a.l(f11);
    }

    @Override // z5.c
    public final long m(long j9) {
        return this.f46573a.m(j9);
    }

    @Override // z5.c
    public final int q0(float f11) {
        return this.f46573a.q0(f11);
    }

    @Override // z5.c
    public final float t(long j9) {
        return this.f46573a.t(j9);
    }

    @Override // z5.c
    public final long x0(long j9) {
        return this.f46573a.x0(j9);
    }

    @Override // z5.c
    public final float z0(long j9) {
        return this.f46573a.z0(j9);
    }
}
