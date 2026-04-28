package z80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x80.i f47384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47385b;

    public n(x80.i iVar, int i11) {
        this.f47384a = iVar;
        this.f47385b = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (v80.f0.L(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, x70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z80.m
            if (r0 == 0) goto L13
            r0 = r7
            z80.m r0 = (z80.m) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z80.m r0 = new z80.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f47382j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r7)
            goto L53
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            ba0.g.M(r7)
            goto L4a
        L35:
            ba0.g.M(r7)
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
            int r2 = r5.f47385b
            r7.<init>(r2, r6)
            r0.l = r4
            x80.i r6 = r5.f47384a
            java.lang.Object r6 = r6.f(r7, r0)
            if (r6 != r1) goto L4a
            goto L52
        L4a:
            r0.l = r3
            java.lang.Object r6 = v80.f0.L(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.n.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
