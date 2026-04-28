package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x80.u f3467b;

    public /* synthetic */ k(x80.u uVar, int i11) {
        this.f3466a = i11;
        this.f3467b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
        /*
            r4 = this;
            int r0 = r4.f3466a
            switch(r0) {
                case 0: goto L4c;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof y80.p
            if (r0 == 0) goto L18
            r0 = r6
            y80.p r0 = (y80.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.l = r1
            goto L1d
        L18:
            y80.p r0 = new y80.p
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f45547j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r6)
            goto L49
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r1 = 0
            goto L4b
        L33:
            ba0.g.M(r6)
            if (r5 != 0) goto L3a
            a90.v r5 = z80.b.f47357b
        L3a:
            r0.l = r3
            x80.u r6 = r4.f3467b
            x80.t r6 = (x80.t) r6
            x80.i r6 = r6.f44084d
            java.lang.Object r5 = r6.f(r5, r0)
            if (r5 != r1) goto L49
            goto L4b
        L49:
            kotlin.Unit r1 = kotlin.Unit.f26487a
        L4b:
            return r1
        L4c:
            x80.u r0 = r4.f3467b
            x80.t r0 = (x80.t) r0
            x80.i r0 = r0.f44084d
            java.lang.Object r5 = r0.f(r5, r6)
            y70.a r6 = y70.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f26487a
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
