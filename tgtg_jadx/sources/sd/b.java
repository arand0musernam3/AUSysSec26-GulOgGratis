package sd;

import kotlin.jvm.internal.Intrinsics;
import q90.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f39005a;

    public /* synthetic */ b(d0 d0Var) {
        this.f39005a = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(q90.d0 r8, pd.q r9, kotlin.jvm.functions.Function2 r10, z70.c r11) {
        /*
            boolean r0 = r11 instanceof sd.a
            if (r0 == 0) goto L13
            r0 = r11
            sd.a r0 = (sd.a) r0
            int r1 = r0.f39004m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39004m = r1
            goto L18
        L13:
            sd.a r0 = new sd.a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f39004m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.f39002j
            java.io.Closeable r8 = (java.io.Closeable) r8
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L33
            goto Lb0
        L33:
            r9 = move-exception
            goto Lb8
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L3d:
            java.lang.Object r8 = r0.f39002j
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            ba0.g.M(r11)
            goto L9a
        L45:
            q90.d0 r8 = r0.f39003k
            java.lang.Object r9 = r0.f39002j
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            ba0.g.M(r11)
            goto L60
        L50:
            ba0.g.M(r11)
            r0.f39002j = r10
            r0.f39003k = r8
            r0.f39004m = r5
            q90.g0 r11 = u00.d.m(r9, r0)
            if (r11 != r1) goto L60
            goto Lae
        L60:
            q90.g0 r11 = (q90.g0) r11
            r8.getClass()
            r11.getClass()
            u90.n r9 = new u90.n
            r2 = 0
            r9.<init>(r8, r11, r2)
            r0.f39002j = r10
            r0.f39003k = r6
            r0.f39004m = r4
            v80.l r8 = new v80.l
            x70.c r11 = y70.f.b(r0)
            r8.<init>(r5, r11)
            r8.t()
            a3.f2 r11 = new a3.f2
            r2 = 9
            r11.<init>(r9, r2)
            r8.v(r11)
            n7.k r11 = new n7.k
            r11.<init>(r8)
            r9.d(r11)
            java.lang.Object r11 = r8.s()
            if (r11 != r1) goto L99
            goto Lae
        L99:
            r8 = r10
        L9a:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            q90.p0 r10 = (q90.p0) r10     // Catch: java.lang.Throwable -> Lb4
            pd.r r10 = u00.d.l(r10)     // Catch: java.lang.Throwable -> Lb4
            r0.f39002j = r9     // Catch: java.lang.Throwable -> Lb4
            r0.f39004m = r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r11 != r1) goto Laf
        Lae:
            return r1
        Laf:
            r8 = r9
        Lb0:
            u00.d.p(r8, r6)
            return r11
        Lb4:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lb8:
            throw r9     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r10 = move-exception
            u00.d.p(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.b.a(q90.d0, pd.q, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f39005a, ((b) obj).f39005a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39005a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f39005a + ")";
    }
}
