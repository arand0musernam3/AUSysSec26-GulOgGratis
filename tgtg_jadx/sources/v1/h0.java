package v1;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends g {
    public String M;
    public Function0 N;
    public boolean O;
    public final q1.k0 P;
    public final q1.k0 Q;

    public h0(b2.l lVar, j5.j jVar, String str, String str2, Function0 function0, Function0 function02) {
        super(lVar, null, false, true, str2, jVar, function0);
        this.M = str;
        this.N = function02;
        this.O = true;
        q1.k0 k0Var = q1.w.f35850a;
        this.P = new q1.k0();
        this.Q = new q1.k0();
    }

    @Override // v1.g
    public final void O0(j5.b0 b0Var) {
        if (this.N != null) {
            j5.z.f(b0Var, this.M, new rv.a(this, 13));
        }
    }

    @Override // v1.g
    public final w4.m0 P0() {
        a3.i1 i1Var = new a3.i1(this, 7);
        w4.n nVar = w4.h0.f43125a;
        return new w4.m0(null, null, i1Var);
    }

    @Override // v1.g
    public final void W0() {
        a1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // v1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X0(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = u4.c.b(r7)
            kotlin.jvm.functions.Function0 r7 = r6.N
            if (r7 == 0) goto L26
            q1.k0 r7 = r6.P
            java.lang.Object r2 = r7.b(r0)
            if (r2 != 0) goto L26
            v80.b0 r2 = r6.getCoroutineScope()
            sf.a r3 = new sf.a
            r4 = 9
            r5 = 0
            r3.<init>(r6, r5, r4)
            r4 = 3
            v80.b2 r2 = v80.f0.B(r2, r5, r5, r3, r4)
            r7.h(r0, r2)
            r7 = 1
            goto L27
        L26:
            r7 = 0
        L27:
            q1.k0 r2 = r6.Q
            java.lang.Object r0 = r2.b(r0)
            v1.e0 r0 = (v1.e0) r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.h0.X0(android.view.KeyEvent):boolean");
    }

    @Override // v1.g
    public final void Y0(KeyEvent keyEvent) {
        long jB = u4.c.b(keyEvent);
        q1.k0 k0Var = this.P;
        boolean z11 = false;
        if (k0Var.b(jB) != null) {
            v80.i1 i1Var = (v80.i1) k0Var.b(jB);
            if (i1Var != null) {
                if (i1Var.g()) {
                    i1Var.a(null);
                } else {
                    z11 = true;
                }
            }
            k0Var.g(jB);
        }
        if (z11) {
            return;
        }
        this.f41727w.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1() {
        /*
            r23 = this;
            r0 = r23
            q1.k0 r1 = r0.P
            java.lang.Object[] r2 = r1.f35836c
            long[] r3 = r1.f35834a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            r13 = 0
            if (r4 < 0) goto L68
            r14 = r13
            r15 = 128(0x80, double:6.3E-322)
        L19:
            r5 = r3[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r13
        L2d:
            if (r8 >= r7) goto L54
            long r19 = r5 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L48
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r2[r19]
            r20 = r9
            r9 = r19
            v80.i1 r9 = (v80.i1) r9
            r21 = r10
            r10 = 0
            r9.a(r10)
            goto L4c
        L48:
            r20 = r9
            r21 = r10
        L4c:
            long r5 = r5 >> r12
            int r8 = r8 + 1
            r9 = r20
            r10 = r21
            goto L2d
        L54:
            r20 = r9
            r21 = r10
            if (r7 != r12) goto L70
            goto L5f
        L5b:
            r20 = r9
            r21 = r10
        L5f:
            if (r14 == r4) goto L70
            int r14 = r14 + 1
            r9 = r20
            r10 = r21
            goto L19
        L68:
            r20 = r9
            r21 = r10
            r15 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L70:
            r1.c()
            q1.k0 r1 = r0.Q
            java.lang.Object[] r2 = r1.f35836c
            long[] r3 = r1.f35834a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto Lb2
            r5 = r13
        L7f:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto Lad
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r13
        L93:
            if (r9 >= r8) goto Lab
            long r10 = r6 & r17
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 < 0) goto L9f
            long r6 = r6 >> r12
            int r9 = r9 + 1
            goto L93
        L9f:
            int r1 = r5 << 3
            int r1 = r1 + r9
            r1 = r2[r1]
            v1.e0 r1 = (v1.e0) r1
            r1.getClass()
            r1 = 0
            throw r1
        Lab:
            if (r8 != r12) goto Lb2
        Lad:
            if (r5 == r4) goto Lb2
            int r5 = r5 + 1
            goto L7f
        Lb2:
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.h0.a1():void");
    }

    @Override // b4.s
    public final void onReset() {
        super.onReset();
        a1();
    }
}
