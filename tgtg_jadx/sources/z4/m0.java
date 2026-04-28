package z4;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f47179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f47180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f47182e;

    public /* synthetic */ m0(v0 v0Var, q0 q0Var, int i11, v0 v0Var2, int i12) {
        this.f47178a = i12;
        this.f47180c = q0Var;
        this.f47181d = i11;
        this.f47182e = v0Var2;
        this.f47179b = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // z4.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f47178a
            switch(r1) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            int r1 = r0.f47181d
            z4.q0 r2 = r0.f47180c
            r2.f47203d = r1
            z4.v0 r1 = r0.f47182e
            r1.a()
            b5.m0 r1 = r2.f47200a
            b5.m0 r1 = r1.f5873i
            if (r1 != 0) goto L1d
            int r1 = r2.f47203d
            r2.f(r1)
        L1d:
            return
        L1e:
            int r1 = r0.f47181d
            z4.q0 r2 = r0.f47180c
            r2.f47204e = r1
            z4.v0 r1 = r0.f47182e
            r1.a()
            o3.e r1 = r2.f47211m
            q1.t0 r3 = r2.l
            long[] r4 = r3.f35752a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9d
            r7 = 0
        L35:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L98
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L4f:
            if (r12 >= r10) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8c
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r3.f35753b
            r14 = r14[r13]
            java.lang.Object[] r15 = r3.f35754c
            r15 = r15[r13]
            z4.w1 r15 = (z4.w1) r15
            int r6 = r1.i(r14)
            r17 = r11
            if (r6 < 0) goto L73
            int r11 = r2.f47204e
            if (r6 < r11) goto L8e
        L73:
            if (r6 < 0) goto L7d
            java.lang.Object[] r11 = r1.f31830a
            r18 = r11[r6]
            java.lang.Object r18 = z4.c0.f47095b
            r11[r6] = r18
        L7d:
            q1.t0 r6 = r2.f47209j
            boolean r6 = r6.a(r14)
            if (r6 == 0) goto L88
            r15.a()
        L88:
            r3.l(r13)
            goto L8e
        L8c:
            r17 = r11
        L8e:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = r17
            goto L4f
        L95:
            r6 = r11
            if (r10 != r6) goto L9d
        L98:
            if (r7 == r5) goto L9d
            int r7 = r7 + 1
            goto L35
        L9d:
            int r1 = r2.f47203d
            r2.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.m0.a():void");
    }

    @Override // z4.v0
    public final int b() {
        switch (this.f47178a) {
        }
        return this.f47179b.b();
    }

    @Override // z4.v0
    public final Map c() {
        switch (this.f47178a) {
        }
        return this.f47179b.c();
    }

    @Override // z4.v0
    public final Function1 d() {
        switch (this.f47178a) {
        }
        return this.f47179b.d();
    }

    @Override // z4.v0
    public final int getHeight() {
        switch (this.f47178a) {
        }
        return this.f47179b.getHeight();
    }
}
