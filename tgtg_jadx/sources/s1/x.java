package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Lambda implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f38727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f38728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Function1 function1, q1 q1Var) {
        super(3);
        this.f38727a = function1;
        this.f38728b = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // i80.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            z4.w0 r9 = (z4.w0) r9
            z4.t0 r10 = (z4.t0) r10
            z5.a r11 = (z5.a) r11
            long r0 = r11.f47271a
            z4.m1 r10 = r10.D(r0)
            boolean r11 = r9.Z()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            if (r11 == 0) goto L32
            t1.q1 r11 = r8.f38728b
            m3.k1 r11 = r11.f39540d
            java.lang.Object r11 = r11.getValue()
            kotlin.jvm.functions.Function1 r3 = r8.f38727a
            java.lang.Object r11 = r3.invoke(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L32
            r3 = 0
            goto L3c
        L32:
            int r11 = r10.f47183a
            int r3 = r10.f47184b
            long r4 = (long) r11
            long r4 = r4 << r2
            long r6 = (long) r3
            long r6 = r6 & r0
            long r3 = r4 | r6
        L3c:
            long r5 = r3 >> r2
            int r11 = (int) r5
            long r0 = r0 & r3
            int r0 = (int) r0
            c5.l r1 = new c5.l
            r2 = 4
            r1.<init>(r10, r2)
            z4.v0 r9 = z4.w0.f(r9, r11, r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
