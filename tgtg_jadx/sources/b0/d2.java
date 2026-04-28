package b0;

import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f5119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f5120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e90.c f5121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o2 f5122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList f5123e;

    public d2(l1 l1Var, k3 k3Var) {
        l1Var.getClass();
        k3Var.getClass();
        this.f5119a = l1Var;
        this.f5120b = k3Var;
        this.f5121c = e90.d.a();
        this.f5123e = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(b0.d2 r6, b0.y1 r7, b0.o2 r8, z70.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof b0.b2
            if (r0 == 0) goto L16
            r0 = r9
            b0.b2 r0 = (b0.b2) r0
            int r1 = r0.f5072n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f5072n = r1
            goto L1b
        L16:
            b0.b2 r0 = new b0.b2
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f5072n
            r3 = 3
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r2 == 0) goto L38
            if (r2 != r4) goto L31
            b0.o2 r8 = r0.f5070k
            b0.y1 r7 = r0.f5069j
            ba0.g.M(r9)
            goto L69
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L38:
            ba0.g.M(r9)
            boolean r9 = wd.a.B(r3, r5)
            if (r9 == 0) goto L5a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "StillCaptureRequestControl: submitting "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r2 = " at "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L5a:
            b0.l1 r9 = r6.f5119a
            r0.f5069j = r7
            r0.f5070k = r8
            r0.f5072n = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            boolean r0 = wd.a.B(r3, r5)
            if (r0 == 0) goto L7a
            java.lang.String r0 = "StillCaptureRequestControl: Issuing single capture"
            android.util.Log.d(r5, r0)
        L7a:
            java.util.ArrayList r0 = r7.f5510a
            int r1 = r7.f5511b
            int r2 = r7.f5512c
            java.util.List r8 = r8.d(r0, r1, r2, r9)
            b0.k3 r6 = r6.f5120b
            a90.d r6 = r6.f5270f
            a3.x r9 = new a3.x
            r0 = 14
            r1 = 0
            r9.<init>(r8, r7, r1, r0)
            v80.j0 r6 = v80.f0.f(r6, r1, r1, r9, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d2.b(b0.d2, b0.y1, b0.o2, z70.c):java.lang.Object");
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f5122d = o2Var;
        v80.f0.B(this.f5120b.f5270f, null, null, new c2(this, (x70.c) null), 3);
    }

    @Override // b0.h2
    public final void reset() {
        v80.f0.B(this.f5120b.f5270f, null, null, new a3.x1(this, (x70.c) null, 9), 3);
    }
}
