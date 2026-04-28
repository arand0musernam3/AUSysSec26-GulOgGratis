package b0;

import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.x f5380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f5381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f5382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f5383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3 f5384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f5385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z.k f5386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t70.a f5387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0.j f5388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u70.t f5389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u70.t f5390k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f0.o f5391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f5392n;

    public r0(w.x xVar, l1 l1Var, g2 g2Var, l3 l3Var, k3 k3Var, x0 x0Var, z.k kVar, n nVar, t70.a aVar, a0.j jVar) {
        xVar.getClass();
        l1Var.getClass();
        g2Var.getClass();
        l3Var.getClass();
        k3Var.getClass();
        x0Var.getClass();
        nVar.getClass();
        aVar.getClass();
        jVar.getClass();
        this.f5380a = xVar;
        this.f5381b = l1Var;
        this.f5382c = g2Var;
        this.f5383d = l3Var;
        this.f5384e = k3Var;
        this.f5385f = x0Var;
        this.f5386g = kVar;
        this.f5387h = aVar;
        this.f5388i = jVar;
        this.f5389j = u70.l.b(new p(nVar, 0));
        this.f5390k = u70.l.b(new aa.e(this, 13));
        this.l = 1;
        this.f5392n = new x();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(b0.r0 r10, long r11, boolean r13, z70.c r14) {
        /*
            boolean r0 = r14 instanceof b0.h0
            if (r0 == 0) goto L14
            r0 = r14
            b0.h0 r0 = (b0.h0) r0
            int r1 = r0.f5213o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5213o = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            b0.h0 r0 = new b0.h0
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f5211m
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f5213o
            r8 = 3
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L48
            if (r1 == r2) goto L40
            if (r1 == r3) goto L36
            if (r1 != r8) goto L2f
            ba0.g.M(r14)
            return r14
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L36:
            java.lang.AutoCloseable r10 = r7.l
            ba0.g.M(r14)     // Catch: java.lang.Throwable -> L3c
            goto L9f
        L3c:
            r0 = move-exception
            r11 = r0
            goto Lbe
        L40:
            boolean r13 = r7.f5210k
            long r11 = r7.f5209j
            ba0.g.M(r14)
            goto L5e
        L48:
            ba0.g.M(r14)
            a0.j r14 = r10.f5388i
            i0.b r14 = r14.a()
            r7.f5209j = r11
            r7.f5210k = r13
            r7.f5213o = r2
            java.lang.Object r14 = r14.e(r7)
            if (r14 != r0) goto L5e
            goto Laf
        L5e:
            java.lang.AutoCloseable r14 = (java.lang.AutoCloseable) r14
            r1 = r14
            i0.c r1 = (i0.c) r1     // Catch: java.lang.Throwable -> Lb8
            e0.t0 r2 = new e0.t0     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            r4 = r3
            b0.q r3 = new b0.q     // Catch: java.lang.Throwable -> Lbb
            r5 = 0
            r3.<init>(r10, r13, r5)     // Catch: java.lang.Throwable -> Lbb
            r7.l = r14     // Catch: java.lang.Throwable -> Lb8
            r7.f5213o = r4     // Catch: java.lang.Throwable -> Lb8
            h0.e r10 = r1.f22602a     // Catch: java.lang.Throwable -> Lb3
            boolean r10 = r10.a()     // Catch: java.lang.Throwable -> Lb3
            if (r10 != 0) goto L91
            i0.h r1 = r1.f22604c     // Catch: java.lang.Throwable -> Lb3
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> Lb3
            r5.<init>(r11)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> Lb3
            r10 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r6.<init>(r10)     // Catch: java.lang.Throwable -> Lb3
            r4 = 60
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb3
            goto L99
        L91:
            java.lang.String r10 = "Cannot call lock3A on "
            java.lang.String r11 = " after close."
            qc.y.j(r10, r1, r11)     // Catch: java.lang.Throwable -> Lb3
            r10 = 0
        L99:
            if (r10 != r0) goto L9c
            goto Laf
        L9c:
            r9 = r14
            r14 = r10
            r10 = r9
        L9f:
            v80.i0 r14 = (v80.i0) r14     // Catch: java.lang.Throwable -> L3c
            r11 = 0
            w.b.y(r10, r11)
            r7.l = r11
            r7.f5213o = r8
            java.lang.Object r10 = r14.H(r7)
            if (r10 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            return r10
        Lb1:
            r11 = r10
            goto Lb6
        Lb3:
            r0 = move-exception
            r10 = r0
            goto Lb1
        Lb6:
            r10 = r14
            goto Lbe
        Lb8:
            r0 = move-exception
            r11 = r0
            goto Lb6
        Lbb:
            r0 = move-exception
            r10 = r0
            goto Lb1
        Lbe:
            throw r11     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r0 = move-exception
            r12 = r0
            w.b.y(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.d(b0.r0, long, boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [b0.r0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(b0.r0 r6, long r7, z70.c r9) {
        /*
            boolean r0 = r9 instanceof b0.p0
            if (r0 == 0) goto L13
            r0 = r9
            b0.p0 r0 = (b0.p0) r0
            int r1 = r0.f5361n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5361n = r1
            goto L18
        L13:
            b0.p0 r0 = new b0.p0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f5361n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r9)
            return r9
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L34:
            java.lang.AutoCloseable r6 = r0.f5359k
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L3a
            goto L69
        L3a:
            r7 = move-exception
            goto L7b
        L3c:
            long r7 = r0.f5358j
            ba0.g.M(r9)
            goto L56
        L42:
            ba0.g.M(r9)
            a0.j r6 = r6.f5388i
            i0.b r6 = r6.a()
            r0.f5358j = r7
            r0.f5361n = r5
            java.lang.Object r9 = r6.e(r0)
            if (r9 != r1) goto L56
            goto L79
        L56:
            r6 = r9
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            r9 = r6
            i0.c r9 = (i0.c) r9     // Catch: java.lang.Throwable -> L3a
            r0.f5359k = r6     // Catch: java.lang.Throwable -> L3a
            r0.f5361n = r4     // Catch: java.lang.Throwable -> L3a
            r2 = 29
            v80.q r9 = i0.c.t(r9, r7, r2)     // Catch: java.lang.Throwable -> L3a
            if (r9 != r1) goto L69
            goto L79
        L69:
            v80.i0 r9 = (v80.i0) r9     // Catch: java.lang.Throwable -> L3a
            r7 = 0
            w.b.y(r6, r7)
            r0.f5359k = r7
            r0.f5361n = r3
            java.lang.Object r6 = r9.H(r0)
            if (r6 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r6
        L7b:
            throw r7     // Catch: java.lang.Throwable -> L7c
        L7c:
            r8 = move-exception
            w.b.y(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.e(b0.r0, long, z70.c):java.lang.Object");
    }

    @Override // b0.o
    public final Object a(List list, int i11, s0.u0 u0Var, int i12, int i13, int i14, z70.c cVar) {
        return j(kotlin.collections.d0.h(s.PRE_CAPTURE, s.MAIN_CAPTURE, s.POST_CAPTURE), i12, i14, i13, new r(list, i11, u0Var), cVar);
    }

    @Override // b0.o
    public final void b(int i11) {
        this.l = i11;
    }

    @Override // b0.o
    public final b0 c(int i11, int i12) {
        return new b0(this, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:65:0x0129, B:67:0x012f), top: B:93:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [kotlin.coroutines.CoroutineContext, v80.d0, x70.c] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(b0.r r19, long r20, int r22, java.util.List r23, z70.c r24) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.f(b0.r, long, int, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(b0.r r9, int r10, int r11, java.util.List r12, z70.c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof b0.u
            if (r0 == 0) goto L14
            r0 = r13
            b0.u r0 = (b0.u) r0
            int r1 = r0.f5433o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5433o = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            b0.u r0 = new b0.u
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.f5431m
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f5433o
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L4e
            if (r1 == r5) goto L41
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L32
            ba0.g.M(r13)
            return r13
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L39:
            ba0.g.M(r13)
            return r13
        L3d:
            ba0.g.M(r13)
            return r13
        L41:
            int r10 = r7.l
            java.util.List r12 = r7.f5430k
            b0.r r9 = r7.f5429j
            ba0.g.M(r13)
        L4a:
            r2 = r9
            r5 = r10
            r6 = r12
            goto L6f
        L4e:
            ba0.g.M(r13)
            u70.t r13 = r8.f5389j
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto La4
            r7.f5429j = r9
            r7.f5430k = r12
            r7.l = r10
            r7.f5433o = r5
            java.lang.Object r13 = r8.m(r11, r7)
            if (r13 != r0) goto L4a
        L6d:
            r1 = r8
            goto Lad
        L6f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r9 = r13.booleanValue()
            if (r9 == 0) goto L7d
            r10 = 5000000000(0x12a05f200, double:2.470328229E-314)
            goto L80
        L7d:
            r10 = 1000000000(0x3b9aca00, double:4.94065646E-315)
        L80:
            r12 = 0
            if (r9 != 0) goto L94
            if (r5 != 0) goto L86
            goto L94
        L86:
            r7.f5429j = r12
            r7.f5430k = r12
            r7.f5433o = r3
            java.lang.Object r9 = r8.h(r2, r5, r6, r7)
            if (r9 != r0) goto L93
            goto L6d
        L93:
            return r9
        L94:
            r7.f5429j = r12
            r7.f5430k = r12
            r7.f5433o = r4
            r1 = r8
            r3 = r10
            java.lang.Object r9 = r1.f(r2, r3, r5, r6, r7)
            if (r9 != r0) goto La3
            goto Lad
        La3:
            return r9
        La4:
            r1 = r8
            r7.f5433o = r2
            java.lang.Object r9 = r8.h(r9, r10, r12, r7)
            if (r9 != r0) goto Lae
        Lad:
            return r0
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.g(b0.r, int, int, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(b0.r r13, int r14, java.util.List r15, z70.c r16) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.h(b0.r, int, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(z70.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof b0.c0
            if (r0 == 0) goto L13
            r0 = r9
            b0.c0 r0 = (b0.c0) r0
            int r1 = r0.f5083m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5083m = r1
            goto L18
        L13:
            b0.c0 r0 = new b0.c0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f5082k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f5083m
            r3 = 3
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2c
            b0.r0 r0 = r0.f5081j
            ba0.g.M(r9)
            goto L5b
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L33:
            ba0.g.M(r9)
            f0.o r9 = r8.f5391m
            if (r9 != 0) goto L67
            boolean r9 = wd.a.B(r3, r5)
            if (r9 == 0) goto L45
            java.lang.String r9 = "getFrameMetadata: waiting for result"
            android.util.Log.d(r5, r9)
        L45:
            r0.f5081j = r8
            r0.f5083m = r4
            g r9 = new g
            r2 = 8
            r9.<init>(r2)
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.Object r9 = r8.r(r6, r9, r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            r0 = r8
        L5b:
            e0.k0 r9 = (e0.k0) r9
            if (r9 == 0) goto L64
            f0.o r9 = r9.getMetadata()
            goto L65
        L64:
            r9 = 0
        L65:
            r0.f5391m = r9
        L67:
            boolean r9 = wd.a.B(r3, r5)
            if (r9 == 0) goto L80
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "getFrameMetadata: frameMetadata = "
            r9.<init>(r0)
            f0.o r0 = r8.f5391m
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L80:
            f0.o r9 = r8.f5391m
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.i(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.List r10, int r11, int r12, int r13, b0.r r14, z70.c r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.j(java.util.List, int, int, int, b0.r, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:32:0x0076, B:34:0x007f, B:40:0x008e), top: B:55:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:44:0x009a, B:46:0x00a0), top: B:53:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b0.e0
            if (r0 == 0) goto L13
            r0 = r10
            b0.e0 r0 = (b0.e0) r0
            int r1 = r0.f5133n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5133n = r1
            goto L18
        L13:
            b0.e0 r0 = new b0.e0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f5133n
            r3 = 2
            r4 = 1
            r5 = 3
            java.lang.String r6 = "CXCP"
            if (r2 == 0) goto L48
            if (r2 == r4) goto L42
            if (r2 == r3) goto L3c
            if (r2 != r5) goto L35
            java.lang.AutoCloseable r9 = r0.f5131k
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L32
            goto L9a
        L32:
            r10 = move-exception
            goto Lac
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3c:
            int r9 = r0.f5130j
            ba0.g.M(r10)
            goto L74
        L42:
            int r9 = r0.f5130j
            ba0.g.M(r10)
            goto L58
        L48:
            ba0.g.M(r10)
            r0.f5130j = r9
            r0.f5133n = r4
            b0.l1 r10 = r8.f5381b
            java.lang.Object r10 = r10.f(r0)
            if (r10 != r1) goto L58
            goto L98
        L58:
            boolean r10 = wd.a.B(r5, r6)
            if (r10 == 0) goto L63
            java.lang.String r10 = "screenFlashPostCapture: Acquiring session for unlocking 3A"
            android.util.Log.d(r6, r10)
        L63:
            a0.j r10 = r8.f5388i
            i0.b r10 = r10.a()
            r0.f5130j = r9
            r0.f5133n = r3
            java.lang.Object r10 = r10.e(r0)
            if (r10 != r1) goto L74
            goto L98
        L74:
            java.lang.AutoCloseable r10 = (java.lang.AutoCloseable) r10
            r2 = r10
            i0.c r2 = (i0.c) r2     // Catch: java.lang.Throwable -> L85
            boolean r3 = wd.a.B(r5, r6)     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L8a
            java.lang.String r3 = "screenFlashPostCapture: Unlocking 3A"
            android.util.Log.d(r6, r3)     // Catch: java.lang.Throwable -> L85
            goto L8a
        L85:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lac
        L8a:
            if (r9 != 0) goto L8d
            goto L8e
        L8d:
            r4 = 0
        L8e:
            r0.f5131k = r10     // Catch: java.lang.Throwable -> L85
            r0.f5133n = r5     // Catch: java.lang.Throwable -> L85
            v80.q r9 = r2.u(r4)     // Catch: java.lang.Throwable -> L85
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            r9 = r10
        L9a:
            boolean r10 = wd.a.B(r5, r6)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto La5
            java.lang.String r10 = "screenFlashPostCapture: Unlocking 3A done"
            android.util.Log.d(r6, r10)     // Catch: java.lang.Throwable -> L32
        La5:
            r10 = 0
            w.b.y(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        Lac:
            throw r10     // Catch: java.lang.Throwable -> Lad
        Lad:
            r0 = move-exception
            w.b.y(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.k(int, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        if (r14 != r2) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:33:0x0076, B:35:0x007f, B:41:0x008f), top: B:57:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r13v0, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r13, z70.c r14) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.l(int, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b0.g0
            if (r0 == 0) goto L13
            r0 = r7
            b0.g0 r0 = (b0.g0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            b0.g0 r0 = new b0.g0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5188j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ba0.g.M(r7)
            goto L4e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r7)
            if (r6 == 0) goto L45
            if (r6 == r4) goto L43
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 3
            if (r6 != r7) goto L3d
            goto L68
        L3d:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L43:
            r3 = r4
            goto L68
        L45:
            r0.l = r4
            java.lang.Object r7 = r5.i(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            f0.o r7 = (f0.o) r7
            if (r7 == 0) goto L68
            android.hardware.camera2.CaptureResult$Key r6 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            r6.getClass()
            java.lang.Object r6 = r7.c(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L60
            goto L68
        L60:
            int r6 = r6.intValue()
            r7 = 4
            if (r6 != r7) goto L68
            goto L43
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.m(int, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(b0.r r7, int r8, java.util.List r9, z70.c r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.n(b0.r, int, java.util.List, z70.c):java.lang.Object");
    }

    public final ArrayList o(r rVar) {
        List list = rVar.f5377a;
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#submitRequestInternal; Submitting " + list + " with CameraPipe");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            e0.i1 i1VarA = null;
            if (!it.hasNext()) {
                break;
            }
            s0.r0 r0Var = (s0.r0) it.next();
            v80.q qVar = new v80.q();
            arrayList.add(qVar);
            try {
                i1VarA = this.f5380a.a(r0Var, rVar.f5378b, rVar.f5379c, kotlin.collections.c0.c(new k0(qVar)));
            } catch (IllegalStateException e5) {
                if (wd.a.B(4, "CXCP")) {
                    Log.i("CXCP", "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", e5);
                }
                qVar.h0(new ImageCaptureException(2, "Capture request failed with reason " + e5.getMessage(), e5));
            }
            if (i1VarA != null) {
                arrayList2.add(i1VarA);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        v80.f0.B(this.f5384e.f5270f, null, null, new al.n((x70.c) null, this, arrayList, arrayList2), 3);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(b0.r r24, int r25, long r26, java.util.List r28, boolean r29, z70.c r30) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.p(b0.r, int, long, java.util.List, boolean, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(b0.r r10, int r11, int r12, java.util.List r13, z70.c r14) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.q(b0.r, int, int, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(long r11, kotlin.jvm.functions.Function1 r13, z70.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof b0.q0
            if (r0 == 0) goto L13
            r0 = r14
            b0.q0 r0 = (b0.q0) r0
            int r1 = r0.f5371m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5371m = r1
            goto L18
        L13:
            b0.q0 r0 = new b0.q0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f5370k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f5371m
            b0.x0 r3 = r10.f5385f
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2b
            b0.v1 r11 = r0.f5369j
            ba0.g.M(r14)
            goto L67
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L32:
            ba0.g.M(r14)
            b0.v1 r14 = new b0.v1
            r14.<init>(r11, r13)
            b0.k3 r13 = r10.f5384e
            b0.j3 r2 = r13.f5269e
            r3.a(r14, r2)
            a90.d r13 = r13.f5270f
            a3.x r2 = new a3.x
            r5 = 12
            r6 = 0
            r2.<init>(r14, r10, r6, r5)
            r5 = 3
            v80.f0.B(r13, r6, r6, r2, r5)
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 / r7
            a3.b2 r13 = new a3.b2
            r2 = 5
            r13.<init>(r14, r6, r2)
            r0.f5369j = r14
            r0.f5371m = r4
            java.lang.Object r11 = v80.j2.c(r11, r13, r0)
            if (r11 != r1) goto L64
            return r1
        L64:
            r9 = r14
            r14 = r11
            r11 = r9
        L67:
            r12 = r14
            e0.k0 r12 = (e0.k0) r12
            if (r12 != 0) goto L6f
            r3.b(r11)
        L6f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r0.r(long, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }
}
