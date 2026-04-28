package z4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Object obj, int i11) {
        super(0);
        this.f47236a = i11;
        this.f47237b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f47236a
            switch(r1) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f47237b
            z4.t1 r1 = (z4.t1) r1
            java.lang.Object r1 = r1.invoke()
            androidx.lifecycle.s1 r1 = (androidx.lifecycle.s1) r1
            return r1
        L12:
            java.lang.Object r1 = r0.f47237b
            com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment r1 = (com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment) r1
            return r1
        L17:
            java.lang.Object r1 = r0.f47237b
            z4.y1 r1 = (z4.y1) r1
            z4.q0 r1 = r1.a()
            b5.m0 r2 = r1.f47200a
            java.util.List r3 = r2.o()
            o3.b r3 = (o3.b) r3
            java.lang.Object r3 = r3.f31822b
            o3.e r3 = (o3.e) r3
            int r3 = r3.f31832c
            int r4 = r1.f47212n
            if (r4 == r3) goto L8f
            q1.t0 r1 = r1.f47205f
            java.lang.Object[] r3 = r1.f35754c
            long[] r1 = r1.f35752a
            int r4 = r1.length
            int r4 = r4 + (-2)
            r5 = 7
            r6 = 0
            if (r4 < 0) goto L78
            r7 = r6
        L3f:
            r8 = r1[r7]
            long r10 = ~r8
            long r10 = r10 << r5
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L73
            int r10 = r7 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L58:
            if (r12 >= r10) goto L71
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            z4.j0 r13 = (z4.j0) r13
            r14 = 1
            r13.f47152d = r14
        L6d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L58
        L71:
            if (r10 != r11) goto L78
        L73:
            if (r7 == r4) goto L78
            int r7 = r7 + 1
            goto L3f
        L78:
            b5.m0 r1 = r2.f5873i
            if (r1 == 0) goto L86
            b5.q0 r1 = r2.H
            boolean r1 = r1.f5932e
            if (r1 != 0) goto L8f
            b5.m0.W(r2, r6, r5)
            goto L8f
        L86:
            boolean r1 = r2.r()
            if (r1 != 0) goto L8f
            b5.m0.Y(r2, r6, r5)
        L8f:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.t1.invoke():java.lang.Object");
    }
}
