package w4;

import c5.u3;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements z5.c, x70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f43139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.l f43140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v80.l f43141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f43142d = o.Main;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.g f43143e = kotlin.coroutines.g.f26549a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f43144f;

    public k0(m0 m0Var, v80.l lVar) {
        this.f43144f = m0Var;
        this.f43139a = m0Var;
        this.f43140b = lVar;
    }

    @Override // z5.c
    public final long I(float f11) {
        return this.f43139a.I(f11);
    }

    @Override // z5.c
    public final float O(int i11) {
        return this.f43139a.O(i11);
    }

    @Override // z5.c
    public final float R(float f11) {
        return f11 / this.f43139a.a();
    }

    @Override // z5.c
    public final float X() {
        return this.f43139a.X();
    }

    @Override // z5.c
    public final float a() {
        return this.f43139a.a();
    }

    public final Object b(o oVar, x70.c cVar) {
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        this.f43142d = oVar;
        this.f43141c = lVar;
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public final long c() {
        m0 m0Var = this.f43144f;
        long jX0 = m0Var.x0(b5.m.g(m0Var).B.d());
        long j9 = m0Var.f43164x;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX0 >> 32)) - ((int) (j9 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX0 & 4294967295L)) - ((int) (j9 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // z5.c
    public final float c0(float f11) {
        return this.f43139a.a() * f11;
    }

    public final u3 e() {
        return b5.m.g(this.f43144f).B;
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f43143e;
    }

    @Override // z5.c
    public final int j0(long j9) {
        return this.f43139a.j0(j9);
    }

    @Override // z5.c
    public final long l(float f11) {
        return this.f43139a.l(f11);
    }

    @Override // z5.c
    public final long m(long j9) {
        return this.f43139a.m(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(long r11, kotlin.jvm.functions.Function2 r13, z70.a r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof w4.i0
            if (r0 == 0) goto L13
            r0 = r14
            w4.i0 r0 = (w4.i0) r0
            int r1 = r0.f43129m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43129m = r1
            goto L18
        L13:
            w4.i0 r0 = new w4.i0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f43128k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f43129m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            v80.b2 r11 = r0.f43127j
            ba0.g.M(r14)     // Catch: java.lang.Throwable -> L2a
            r7 = r10
            goto L70
        L2a:
            r0 = move-exception
            r12 = r0
            r7 = r10
            goto L78
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L35:
            ba0.g.M(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L51
            v80.l r14 = r10.f43141c
            if (r14 == 0) goto L51
            u70.o r2 = u70.q.f40850b
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r11)
            u70.p r4 = new u70.p
            r4.<init>(r2)
            r14.resumeWith(r4)
        L51:
            w4.m0 r14 = r10.f43144f
            v80.b0 r14 = r14.getCoroutineScope()
            a3.v1 r4 = new a3.v1
            r9 = 6
            r8 = 0
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r11 = 3
            v80.b2 r11 = v80.f0.B(r14, r8, r8, r4, r11)
            r0.f43127j = r11     // Catch: java.lang.Throwable -> L76
            r0.f43129m = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L76
            if (r14 != r1) goto L70
            return r1
        L70:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f2253a
            r11.a(r12)
            return r14
        L76:
            r0 = move-exception
            r12 = r0
        L78:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f2253a
            r11.a(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.k0.p(long, kotlin.jvm.functions.Function2, z70.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r5, kotlin.jvm.functions.Function2 r7, z70.a r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof w4.j0
            if (r0 == 0) goto L13
            r0 = r8
            w4.j0 r0 = (w4.j0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            w4.j0 r0 = new w4.j0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f43137j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            return r8
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r8)
            r0.l = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            java.lang.Object r5 = r4.p(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.k0.q(long, kotlin.jvm.functions.Function2, z70.a):java.lang.Object");
    }

    @Override // z5.c
    public final int q0(float f11) {
        return this.f43139a.q0(f11);
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        m0 m0Var = this.f43144f;
        synchronized (m0Var.f43161u) {
            m0Var.f43160t.j(this);
        }
        this.f43140b.resumeWith(obj);
    }

    @Override // z5.c
    public final float t(long j9) {
        return this.f43139a.t(j9);
    }

    @Override // z5.c
    public final long x0(long j9) {
        return this.f43139a.x0(j9);
    }

    @Override // z5.c
    public final float z0(long j9) {
        return this.f43139a.z0(j9);
    }
}
