package f0;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a90.d f16728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f16729b;

    public j0(com.google.firebase.messaging.a0 a0Var, String str) {
        a90.d dVarB = v80.f0.b(((h0.n) a0Var.f12780c).f20986f.plus(new v80.d2((v80.i1) a0Var.f12781d)));
        this.f16728a = dVarB;
        this.f16729b = new CopyOnWriteArrayList();
        v80.f0.B(dVarB, null, null, new a3.x1(a0Var, str, this, (x70.c) null, 21), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, z70.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof f0.i0
            if (r0 == 0) goto L13
            r0 = r11
            f0.i0 r0 = (f0.i0) r0
            int r1 = r0.f16718m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16718m = r1
            goto L18
        L13:
            f0.i0 r0 = new f0.i0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f16717k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16718m
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.f16729b
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2b
            v80.q r9 = r0.f16716j
            ba0.g.M(r11)
            goto L52
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L32:
            ba0.g.M(r11)
            v80.q r11 = new v80.q
            r11.<init>()
            r3.add(r11)
            aa.k0 r2 = new aa.k0
            r5 = 1
            r6 = 0
            r2.<init>(r11, r6, r5)
            r0.f16716j = r11
            r0.f16718m = r4
            java.lang.Object r9 = v80.j2.c(r9, r2, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r7 = r11
            r11 = r9
            r9 = r7
        L52:
            if (r11 == 0) goto L55
            goto L56
        L55:
            r4 = 0
        L56:
            r3.remove(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.j0.a(long, z70.c):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        v80.f0.j(this.f16728a, null);
    }
}
