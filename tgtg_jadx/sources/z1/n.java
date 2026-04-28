package z1;

import g3.t7;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends f1 {
    public r I;
    public h2 J;
    public l1 K;
    public l1 L;
    public z5.c M;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g1(z1.n r6, float r7, z70.c r8) {
        /*
            boolean r0 = r8 instanceof z1.l
            if (r0 == 0) goto L13
            r0 = r8
            z1.l r0 = (z1.l) r0
            int r1 = r0.f46580m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46580m = r1
            goto L18
        L13:
            z1.l r0 = new z1.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f46579k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46580m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.Ref$FloatRef r6 = r0.f46578j
            ba0.g.M(r8)
            goto L69
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L33:
            ba0.g.M(r8)
            return r8
        L37:
            ba0.g.M(r8)
            z1.r r8 = r6.I
            boolean r8 = r8.e()
            if (r8 == 0) goto L4e
            z1.r r6 = r6.I
            r0.f46580m = r4
            java.lang.Object r6 = r6.i(r7, r0)
            if (r6 != r1) goto L4d
            goto L67
        L4d:
            return r6
        L4e:
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            r8.element = r7
            z1.r r2 = r6.I
            z1.m r4 = new z1.m
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.f46578j = r8
            r0.f46580m = r3
            java.lang.Object r6 = z1.r.b(r2, r4, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r8
        L69:
            float r6 = r6.element
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.n.g1(z1.n, float, z70.c):java.lang.Object");
    }

    @Override // z1.f1
    public final Object S0(d1 d1Var, e1 e1Var) {
        Object objB = r.b(this.I, new a70.b(d1Var, this, (x70.c) null, 7), e1Var);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    @Override // z1.f1
    public final void Y0(p0 p0Var) {
        if (isAttached()) {
            v80.f0.B(getCoroutineScope(), null, null, new tm.d(this, p0Var, null, 29), 3);
        }
    }

    @Override // z1.f1
    public final boolean d1() {
        return this.I.l.getValue() != null;
    }

    public final boolean h1() {
        return b5.m.g(this).A == z5.m.Rtl && this.J == h2.Horizontal;
    }

    public final void i1(l1 l1Var) {
        if (l1Var == null) {
            t1.u1 u1Var = a.f46388a;
            yj.m mVar = a.f46389b;
            z5.c cVar = b5.m.g(this).f5889z;
            this.M = cVar;
            c cVar2 = new c(this.I, mVar, new t7(cVar, 1));
            float f11 = a2.n.f232a;
            l1Var = new a2.j(cVar2, k.f46569b, u1Var);
        }
        this.L = l1Var;
    }

    @Override // b4.s
    public final void onAttach() {
        i1(this.K);
    }

    @Override // b5.l, b5.i2
    public final void onDensityChange() {
        F();
        if (isAttached()) {
            z5.c cVar = b5.m.g(this).f5889z;
            z5.c cVar2 = this.M;
            if (cVar2 == null || !Intrinsics.areEqual(cVar2, cVar)) {
                this.M = cVar;
                i1(this.K);
            }
        }
    }

    @Override // z1.f1
    public final void X0(long j9) {
    }
}
