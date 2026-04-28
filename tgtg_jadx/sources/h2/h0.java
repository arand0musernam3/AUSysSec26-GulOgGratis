package h2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.t0 f21115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a3.j f21116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1.u0 f21118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f21120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f21121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f21122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f21123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f21124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b4.t f21125k;

    public h0() {
        long[] jArr = q1.g1.f35760a;
        this.f21115a = new q1.t0();
        q1.u0 u0Var = q1.j1.f35777a;
        this.f21118d = new q1.u0();
        this.f21119e = new ArrayList();
        this.f21120f = new ArrayList();
        this.f21121g = new ArrayList();
        this.f21122h = new ArrayList();
        this.f21123i = new ArrayList();
        this.f21125k = new d0(this);
    }

    public static void c(r0 r0Var, int i11, f0 f0Var) {
        int i12 = 0;
        long j9 = r0Var.j(0);
        long jA = r0Var.h() ? z5.j.a(0, i11, 1, j9) : z5.j.a(i11, 0, 2, j9);
        b0[] b0VarArr = f0Var.f21101a;
        int length = b0VarArr.length;
        int i13 = 0;
        while (i12 < length) {
            b0 b0Var = b0VarArr[i12];
            int i14 = i13 + 1;
            if (b0Var != null) {
                b0Var.l = z5.j.d(jA, z5.j.c(r0Var.j(i13), j9));
            }
            i12++;
            i13 = i14;
        }
    }

    public static int h(int[] iArr, r0 r0Var) {
        int iK = r0Var.k();
        int iE = r0Var.e() + iK;
        int iMax = 0;
        while (iK < iE) {
            int iC = r0Var.c() + iArr[iK];
            iArr[iK] = iC;
            iMax = Math.max(iMax, iC);
            iK++;
        }
        return iMax;
    }

    public final b0 a(int i11, Object obj) {
        f0 f0Var = (f0) this.f21115a.d(obj);
        if (f0Var != null) {
            return f0Var.f21101a[i11];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.f21123i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = (b0) arrayList.get(i11);
            l4.b bVar = b0Var.f21055n;
            if (bVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (b0Var.l >> 32)) + ((int) (bVar.f27292u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (b0Var.l & 4294967295L)) + ((int) (bVar.f27292u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Type inference failed for: r11v35, types: [h2.b0[]] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [kotlin.coroutines.CoroutineContext, v80.d0, x70.c] */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r4v26, types: [h2.b0[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r49, int r50, int r51, java.util.ArrayList r52, a3.j r53, h2.s0 r54, boolean r55, boolean r56, int r57, boolean r58, int r59, int r60, v80.b0 r61, i4.e0 r62) {
        /*
            Method dump skipped, instruction units count: 1567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h0.d(int, int, int, java.util.ArrayList, a3.j, h2.s0, boolean, boolean, int, boolean, int, int, v80.b0, i4.e0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r15 = this;
            q1.t0 r0 = r15.f21115a
            boolean r1 = r0.f()
            if (r1 == 0) goto L5d
            java.lang.Object[] r1 = r0.f35754c
            long[] r2 = r0.f35752a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L13:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            h2.f0 r11 = (h2.f0) r11
            h2.b0[] r11 = r11.f21101a
            int r12 = r11.length
            r13 = r4
        L43:
            if (r13 >= r12) goto L4f
            r14 = r11[r13]
            if (r14 == 0) goto L4c
            r14.c()
        L4c:
            int r13 = r13 + 1
            goto L43
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L13
        L5a:
            r0.g()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h0.e():void");
    }

    public final void f(Object obj) {
        f0 f0Var = (f0) this.f21115a.k(obj);
        if (f0Var != null) {
            for (b0 b0Var : f0Var.f21101a) {
                if (b0Var != null) {
                    b0Var.c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(h2.r0 r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            q1.t0 r1 = r0.f21115a
            java.lang.Object r2 = r18.getKey()
            java.lang.Object r1 = r1.d(r2)
            r1.getClass()
            h2.f0 r1 = (h2.f0) r1
            h2.b0[] r1 = r1.f21101a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L78
            r6 = r1[r3]
            int r12 = r4 + 1
            r13 = r18
            if (r6 == 0) goto L70
            long r14 = r13.j(r4)
            long r4 = r6.l
            long r7 = h2.b0.f21041s
            boolean r7 = z5.j.b(r4, r7)
            if (r7 != 0) goto L6b
            boolean r7 = z5.j.b(r4, r14)
            if (r7 != 0) goto L6b
            long r4 = z5.j.c(r14, r4)
            t1.x r7 = r6.f21047e
            if (r7 != 0) goto L3d
            goto L6b
        L3d:
            m3.k1 r8 = r6.f21058q
            java.lang.Object r8 = r8.getValue()
            z5.j r8 = (z5.j) r8
            long r8 = r8.f47280a
            long r8 = z5.j.c(r8, r4)
            r6.g(r8)
            r4 = 1
            r6.f(r4)
            r4 = r19
            r6.f21049g = r4
            v80.b0 r5 = r6.f21043a
            r10 = r5
            a3.w r5 = new a3.w
            r11 = r10
            r10 = 0
            r16 = r11
            r11 = 3
            r0 = r16
            r5.<init>(r6, r7, r8, r10, r11)
            r7 = 3
            r8 = 0
            v80.f0.B(r0, r8, r8, r5, r7)
            goto L6d
        L6b:
            r4 = r19
        L6d:
            r6.l = r14
            goto L72
        L70:
            r4 = r19
        L72:
            int r3 = r3 + 1
            r0 = r17
            r4 = r12
            goto L16
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h0.g(h2.r0, boolean):void");
    }
}
