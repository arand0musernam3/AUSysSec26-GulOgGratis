package i2;

import z1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.j f22863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f22864b;

    public i0(a2.j jVar, e0 e0Var) {
        this.f22863a = jVar;
        this.f22864b = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z1.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z1.q2 r6, float r7, x70.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof i2.h0
            if (r0 == 0) goto L13
            r0 = r8
            i2.h0 r0 = (i2.h0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            i2.h0 r0 = new i2.h0
            z70.c r8 = (z70.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.f22860j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r8)
            goto L43
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r8)
            g3.q9 r8 = new g3.q9
            r8.<init>(r5, r6)
            r0.l = r3
            a2.j r2 = r5.f22863a
            java.lang.Object r8 = r2.d(r6, r7, r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            float r6 = r8.floatValue()
            i2.e0 r7 = r5.f22864b
            float r8 = r7.m()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L55
            goto L8d
        L55:
            float r8 = r7.m()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L8d
            int r8 = r7.l()
            z1.g0 r1 = r7.f22829k
            boolean r1 = r1.b()
            if (r1 == 0) goto L88
            m3.k1 r1 = r7.f22833p
            java.lang.Object r1 = r1.getValue()
            i2.v r1 = (i2.v) r1
            v80.b0 r1 = r1.f22923s
            i2.p r2 = new i2.p
            r3 = 2
            r4 = 0
            r2.<init>(r7, r4, r3)
            r3 = 3
            v80.f0.B(r1, r4, r4, r2, r3)
        L88:
            r1 = 0
            r7.v(r8, r0, r1)
            goto L96
        L8d:
            float r7 = r7.m()
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
        L96:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.i0.a(z1.q2, float, x70.c):java.lang.Object");
    }
}
