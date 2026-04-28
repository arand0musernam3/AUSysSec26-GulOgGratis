package m2;

import android.os.Build;
import m3.d3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d3 f28759a = new d3(new lw.p(23));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f28760b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[Catch: RejectedExecutionException -> 0x0091, TryCatch #0 {RejectedExecutionException -> 0x0091, blocks: (B:8:0x003c, B:14:0x0049, B:16:0x005e, B:22:0x006a, B:24:0x007b, B:27:0x008c, B:26:0x007f, B:18:0x0064, B:10:0x0042), top: B:33:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(m5.h r12, m5.u0 r13, q5.h r14, java.util.List r15, m3.n r16, int r17) {
        /*
            r0 = r16
            m3.s r0 = (m3.s) r0
            m3.d3 r1 = m2.a0.f28759a
            java.lang.Object r1 = r0.j(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r2 = 0
            if (r1 == 0) goto L95
            java.lang.String r3 = r12.f29538b
            int r3 = r3.length()
            boolean r3 = b(r3)
            if (r3 == 0) goto L95
            r3 = -518761746(0xffffffffe11452ee, float:-1.7100586E20)
            r0.a0(r3)
            m3.d3 r3 = c5.x1.f7421n
            java.lang.Object r3 = r0.j(r3)
            r6 = r3
            z5.m r6 = (z5.m) r6
            m3.d3 r3 = c5.x1.f7416h
            java.lang.Object r3 = r0.j(r3)
            r9 = r3
            z5.c r9 = (z5.c) r9
            r3 = r17 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 1
            r5 = 32
            if (r3 <= r5) goto L42
            boolean r3 = r0.f(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r3 != 0) goto L46
        L42:
            r3 = r17 & 48
            if (r3 != r5) goto L48
        L46:
            r3 = r4
            goto L49
        L48:
            r3 = r2
        L49:
            int r5 = r6.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            boolean r5 = r0.d(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r5
            boolean r5 = r0.h(r15)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r5
            r5 = r17 & 14
            r5 = r5 ^ 6
            r7 = 4
            if (r5 <= r7) goto L64
            boolean r5 = r0.f(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r5 != 0) goto L6a
        L64:
            r5 = r17 & 6
            if (r5 != r7) goto L69
            goto L6a
        L69:
            r4 = r2
        L6a:
            r3 = r3 | r4
            boolean r4 = r0.f(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r4
            boolean r4 = r0.h(r14)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r4
            java.lang.Object r4 = r0.M()     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r3 != 0) goto L7f
            m3.f r3 = m3.m.f29332a     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r4 != r3) goto L8c
        L7f:
            d1.f r4 = new d1.f     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r11 = 1
            r8 = r12
            r5 = r13
            r10 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r0.k0(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
        L8c:
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r1.execute(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
        L91:
            r0.q(r2)
            return
        L95:
            r12 = -523310345(0xffffffffe0ceeaf7, float:-1.1928001E20)
            r0.a0(r12)
            r0.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a0.a(m5.h, m5.u0, q5.h, java.util.List, m3.n, int):void");
    }

    public static final boolean b(int i11) {
        if (Build.VERSION.SDK_INT >= 28 && i11 >= 8 && i11 < 1000) {
            if (f28760b == null) {
                f28760b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f28760b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
