package k3;

import kotlin.jvm.functions.Function0;
import m3.g1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b5.n implements v4.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function0 f25861r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f25863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f25864u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25862s = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v4.i f25865v = new v4.i(this, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g1 f25866w = new g1(0.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f25867x = new g1(0.0f);

    public s(boolean z11, Function0 function0, t tVar, float f11) {
        this.f25860q = z11;
        this.f25861r = function0;
        this.f25863t = tVar;
        this.f25864u = f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(k3.s r7, z70.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof k3.o
            if (r0 == 0) goto L17
            r0 = r8
            k3.o r0 = (k3.o) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.l = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            k3.o r0 = new k3.o
            r0.<init>(r7, r8)
            goto L15
        L1d:
            java.lang.Object r8 = r5.f25851j
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.l
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r0 = move-exception
            r8 = r0
            goto L6f
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L36:
            ba0.g.M(r8)
            k3.t r8 = r7.f25863t     // Catch: java.lang.Throwable -> L2c
            r5.l = r2     // Catch: java.lang.Throwable -> L2c
            t1.b r1 = r8.f25869a     // Catch: java.lang.Throwable -> L2c
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2c
            r8 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r8 = t1.b.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r0) goto L51
            goto L53
        L51:
            kotlin.Unit r8 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L2c
        L53:
            if (r8 != r0) goto L56
            return r0
        L56:
            boolean r8 = r7.isAttached()
            if (r8 == 0) goto L6c
            int r8 = r7.R0()
            float r8 = (float) r8
            r7.T0(r8)
            int r8 = r7.R0()
            float r8 = (float) r8
            r7.U0(r8)
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L6f:
            boolean r0 = r7.isAttached()
            if (r0 == 0) goto L85
            int r0 = r7.R0()
            float r0 = (float) r0
            r7.T0(r0)
            int r0 = r7.R0()
            float r0 = (float) r0
            r7.U0(r0)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.s.O0(k3.s, z70.c):java.lang.Object");
    }

    @Override // v4.a
    public final long J(int i11, long j9) {
        if (!this.f25863t.f25869a.e() && this.f25862s && i11 == 1 && Float.intBitsToFloat((int) (4294967295L & j9)) < 0.0f) {
            return Q0(j9);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(z70.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof k3.n
            if (r0 == 0) goto L14
            r0 = r9
            k3.n r0 = (k3.n) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            k3.n r0 = new k3.n
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f25849j
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.l
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2a
            goto L52
        L2a:
            r0 = move-exception
            r9 = r0
            goto L5b
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L34:
            ba0.g.M(r9)
            k3.t r9 = r8.f25863t     // Catch: java.lang.Throwable -> L2a
            r5.l = r2     // Catch: java.lang.Throwable -> L2a
            t1.b r1 = r9.f25869a     // Catch: java.lang.Throwable -> L2a
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r9 = t1.b.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            if (r9 != r0) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r9 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L2a
        L4f:
            if (r9 != r0) goto L52
            return r0
        L52:
            r8.T0(r7)
            r8.U0(r7)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L5b:
            r8.T0(r7)
            r8.U0(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.s.P0(z70.c):java.lang.Object");
    }

    public final long Q0(long j9) {
        float fH;
        float fR0;
        if (this.f25860q) {
            fH = 0.0f;
        } else {
            g1 g1Var = this.f25867x;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 & 4294967295L)) + g1Var.h();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fH = fIntBitsToFloat - g1Var.h();
            T0(fIntBitsToFloat);
            if (g1Var.h() * 0.5f <= R0()) {
                fR0 = g1Var.h() * 0.5f;
            } else {
                float fB = n80.p.b(Math.abs((g1Var.h() * 0.5f) / R0()) - 1.0f, 0.0f, 2.0f);
                fR0 = R0() + (R0() * (fB - (((float) Math.pow(fB, 2)) / 4)));
            }
            U0(fR0);
        }
        return (((long) Float.floatToRawIntBits(fH)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final int R0() {
        return b5.m.g(this).f5889z.q0(this.f25864u);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(float r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof k3.r
            if (r0 == 0) goto L13
            r0 = r8
            k3.r r0 = (k3.r) r0
            int r1 = r0.f25859m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25859m = r1
            goto L18
        L13:
            k3.r r0 = new k3.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25858k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f25859m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            float r7 = r0.f25857j
            ba0.g.M(r8)
            goto L6f
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L31:
            ba0.g.M(r8)
            boolean r8 = r6.f25860q
            if (r8 == 0) goto L3e
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r4)
            return r7
        L3e:
            m3.g1 r8 = r6.f25867x
            float r2 = r8.h()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r5
            int r5 = r6.R0()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L55
            kotlin.jvm.functions.Function0 r2 = r6.f25861r
            r2.invoke()
        L55:
            float r8 = r8.h()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L5f
        L5d:
            r7 = r4
            goto L64
        L5f:
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 >= 0) goto L64
            goto L5d
        L64:
            r0.f25857j = r7
            r0.f25859m = r3
            java.lang.Object r8 = r6.P0(r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r6.T0(r4)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.s.S0(float, z70.c):java.lang.Object");
    }

    public final void T0(float f11) {
        this.f25867x.i(f11);
    }

    public final void U0(float f11) {
        this.f25866w.i(f11);
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        if (this.f25863t.f25869a.e() || !this.f25862s || i11 != 1) {
            return 0L;
        }
        long jQ0 = Q0(j11);
        f0.B(getCoroutineScope(), null, null, new p(this, null, 1), 3);
        return jQ0;
    }

    @Override // b4.s
    public final void onAttach() {
        L0(this.f25865v);
        f0.B(getCoroutineScope(), null, null, new p(this, null, 0), 3);
        U0(this.f25860q ? R0() : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r5, x70.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof k3.q
            if (r0 == 0) goto L13
            r0 = r7
            k3.q r0 = (k3.q) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            k3.q r0 = new k3.q
            z70.c r7 = (z70.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.f25855j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r7)
            goto L40
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r7)
            float r5 = z5.q.c(r5)
            r0.l = r3
            java.lang.Object r7 = r4.S0(r5, r0)
            if (r7 != r1) goto L40
            return r1
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = ba0.g.g(r6, r5)
            z5.q r7 = new z5.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.s.q(long, x70.c):java.lang.Object");
    }
}
