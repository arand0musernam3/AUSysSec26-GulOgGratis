package v1;

import b5.i2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends b4.s implements i2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b2.l f41885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b2.h f41886p;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(v1.y0 r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof v1.v0
            if (r0 == 0) goto L13
            r0 = r5
            v1.v0 r0 = (v1.v0) r0
            int r1 = r0.f41857m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41857m = r1
            goto L18
        L13:
            v1.v0 r0 = new v1.v0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f41856k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f41857m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            b2.h r0 = r0.f41855j
            ba0.g.M(r5)
            goto L4a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L30:
            ba0.g.M(r5)
            b2.h r5 = r4.f41886p
            if (r5 != 0) goto L4c
            b2.h r5 = new b2.h
            r5.<init>()
            b2.l r2 = r4.f41885o
            r0.f41855j = r5
            r0.f41857m = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.f41886p = r0
        L4c:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.y0.L0(v1.y0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(v1.y0 r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof v1.w0
            if (r0 == 0) goto L13
            r0 = r5
            v1.w0 r0 = (v1.w0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            v1.w0 r0 = new v1.w0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f41864j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L45
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L2e:
            ba0.g.M(r5)
            b2.h r5 = r4.f41886p
            if (r5 == 0) goto L48
            b2.i r2 = new b2.i
            r2.<init>(r5)
            b2.l r5 = r4.f41885o
            r0.l = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = 0
            r4.f41886p = r5
        L48:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.y0.M0(v1.y0, z70.c):java.lang.Object");
    }

    @Override // b5.i2
    public final void F() {
        N0();
    }

    public final void N0() {
        b2.h hVar = this.f41886p;
        if (hVar != null) {
            this.f41885o.c(new b2.i(hVar));
            this.f41886p = null;
        }
    }

    @Override // b4.s
    public final void onDetach() {
        N0();
    }

    @Override // b5.i2
    public final void p0(w4.n nVar, w4.o oVar, long j9) {
        if (oVar == w4.o.Main) {
            int i11 = nVar.f43170f;
            x70.c cVar = null;
            if (i11 == 4) {
                v80.f0.B(getCoroutineScope(), null, null, new x0(this, cVar, 0), 3);
            } else if (i11 == 5) {
                v80.f0.B(getCoroutineScope(), null, null, new x0(this, cVar, 1), 3);
            }
        }
    }
}
