package z;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import b0.b0;
import b0.g2;
import b0.k3;
import b0.n;
import b0.o;
import b0.p;
import b0.r0;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f46362f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f46363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f46364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f46365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f46366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f46367e;

    static {
        f46362f = y.c.a().b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public c(n nVar, t70.a aVar, k3 k3Var, g2 g2Var) {
        nVar.getClass();
        aVar.getClass();
        k3Var.getClass();
        g2Var.getClass();
        this.f46363a = aVar;
        this.f46364b = k3Var;
        this.f46365c = g2Var;
        this.f46366d = u70.l.b(new p(nVar, 1));
        this.f46367e = u70.l.b(new y.a(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // b0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r12, int r13, s0.u0 r14, int r15, int r16, int r17, z70.c r18) {
        /*
            r11 = this;
            r0 = r18
            boolean r1 = r0 instanceof z.b
            if (r1 == 0) goto L16
            r1 = r0
            z.b r1 = (z.b) r1
            int r2 = r1.f46361m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f46361m = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            z.b r1 = new z.b
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f46360k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r9.f46361m
            r10 = 3
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            boolean r1 = r9.f46359j
            ba0.g.M(r0)
            goto Lb2
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L36:
            ba0.g.M(r0)
            if (r12 == 0) goto L45
            r0 = r12
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L45
            goto L94
        L45:
            r0 = r12
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r0.next()
            s0.r0 r2 = (s0.r0) r2
            u70.t r4 = r11.f46366d
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.getClass()
            int r2 = r2.f38440c
            r5 = 2
            r6 = -1
            if (r13 != r10) goto L71
            if (r4 != 0) goto L71
            r4 = 4
            goto L7a
        L71:
            if (r2 == r6) goto L79
            r4 = 5
            if (r2 != r4) goto L77
            goto L79
        L77:
            r4 = r6
            goto L7a
        L79:
            r4 = r5
        L7a:
            if (r4 == r6) goto L7d
            r2 = r4
        L7d:
            if (r2 != r5) goto L4c
            b0.g2 r0 = r11.f46365c
            androidx.lifecycle.o0 r0 = r0.f5198e
            java.lang.Object r0 = r0.d()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L8c
            goto L94
        L8c:
            int r0 = r0.intValue()
            if (r0 != r3) goto L94
            r0 = r3
            goto L95
        L94:
            r0 = 0
        L95:
            u70.t r2 = r11.f46367e
            java.lang.Object r2 = r2.getValue()
            b0.r0 r2 = (b0.r0) r2
            r9.f46359j = r0
            r9.f46361m = r3
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            java.lang.Object r2 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != r1) goto Lb0
            return r1
        Lb0:
            r1 = r0
            r0 = r2
        Lb2:
            java.util.List r0 = (java.util.List) r0
            if (r1 == 0) goto Lc5
            b0.k3 r1 = r11.f46364b
            a90.d r1 = r1.f5270f
            tm.d r2 = new tm.d
            r3 = 28
            r4 = 0
            r2.<init>(r0, r11, r4, r3)
            v80.f0.B(r1, r4, r4, r2, r10)
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.c.a(java.util.List, int, s0.u0, int, int, int, z70.c):java.lang.Object");
    }

    @Override // b0.o
    public final void b(int i11) {
        ((r0) this.f46367e.getValue()).l = i11;
    }

    @Override // b0.o
    public final b0 c(int i11, int i12) {
        r0 r0Var = (r0) this.f46367e.getValue();
        r0Var.getClass();
        return new b0(r0Var, i11, i12);
    }
}
