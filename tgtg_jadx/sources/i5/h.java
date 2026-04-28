package i5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23382c;

    public h(n5.i iVar) {
        this.f23382c = iVar;
        this.f23380a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f23382c
            n5.i r0 = (n5.i) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f30531f
            int r3 = com.google.android.gms.internal.measurement.cg.p(r3, r6, r7)
            android.text.Layout r4 = r0.f30531f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f23380a
            if (r1 != r4) goto L35
            float r6 = r5.f23381b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f23380a = r4
            r5.f23381b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.h.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i5.g
            if (r0 == 0) goto L13
            r0 = r6
            i5.g r0 = (i5.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            i5.g r0 = new i5.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f23378j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L43
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f23382c
            i5.c r6 = (i5.c) r6
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.l = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f23381b
            float r6 = r6 + r5
            r4.f23381b = r6
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.h.b(float, z70.c):java.lang.Object");
    }

    public h(int i11, c cVar) {
        this.f23380a = i11;
        this.f23382c = cVar;
    }
}
