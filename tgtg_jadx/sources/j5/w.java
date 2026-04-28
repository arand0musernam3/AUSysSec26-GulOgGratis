package j5;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import b5.m0;
import b5.s1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import q1.g0;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4.c f24706a = new h4.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[LOOP:0: B:5:0x000f->B:36:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075 A[EDGE_INSN: B:44:0x0075->B:37:0x0075 BREAK  A[LOOP:0: B:5:0x000f->B:36:0x0070], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final j5.t a(b5.m0 r9, boolean r10) {
        /*
            b5.l1 r0 = r9.G
            b4.s r1 = r0.f5860f
            int r1 = r1.getAggregateChildKindSet$ui()
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L75
            b4.s r0 = r0.f5860f
        Lf:
            if (r0 == 0) goto L75
            int r1 = r0.getKindSet$ui()
            r1 = r1 & 8
            if (r1 == 0) goto L68
            r1 = r0
            r3 = r2
        L1b:
            if (r1 == 0) goto L68
            boolean r4 = r1 instanceof b5.l2
            if (r4 == 0) goto L23
            r2 = r1
            goto L75
        L23:
            int r4 = r1.getKindSet$ui()
            r4 = r4 & 8
            if (r4 == 0) goto L63
            boolean r4 = r1 instanceof b5.n
            if (r4 == 0) goto L63
            r4 = r1
            b5.n r4 = (b5.n) r4
            b4.s r4 = r4.f5892p
            r5 = 0
            r6 = r5
        L36:
            r7 = 1
            if (r4 == 0) goto L60
            int r8 = r4.getKindSet$ui()
            r8 = r8 & 8
            if (r8 == 0) goto L5b
            int r6 = r6 + 1
            if (r6 != r7) goto L47
            r1 = r4
            goto L5b
        L47:
            if (r3 != 0) goto L52
            o3.e r3 = new o3.e
            r7 = 16
            b4.s[] r7 = new b4.s[r7]
            r3.<init>(r7, r5)
        L52:
            if (r1 == 0) goto L58
            r3.b(r1)
            r1 = r2
        L58:
            r3.b(r4)
        L5b:
            b4.s r4 = r4.getChild$ui()
            goto L36
        L60:
            if (r6 != r7) goto L63
            goto L1b
        L63:
            b4.s r1 = b5.m.b(r3)
            goto L1b
        L68:
            int r1 = r0.getAggregateChildKindSet$ui()
            r1 = r1 & 8
            if (r1 == 0) goto L75
            b4.s r0 = r0.getChild$ui()
            goto Lf
        L75:
            r2.getClass()
            b5.l2 r2 = (b5.l2) r2
            b4.s r2 = (b4.s) r2
            b4.s r0 = r2.getNode()
            j5.n r1 = r9.y()
            if (r1 != 0) goto L8b
            j5.n r1 = new j5.n
            r1.<init>()
        L8b:
            j5.t r2 = new j5.t
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.w.a(b5.m0, boolean):j5.t");
    }

    public static final g0 b(v vVar, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            t tVarA = vVar.a();
            m0 m0Var = tVarA.f24695c;
            if (m0Var.J() && m0Var.I()) {
                g0 g0Var = new g0(48);
                a50.c cVar = new a50.c(28);
                z5.k kVarH = android.support.v4.media.session.a.H(tVarA.g());
                ((Region) cVar.f822b).set(kVarH.f47282a, kVarH.f47283b, kVarH.f47284c, kVarH.f47285d);
                c(cVar, tVarA, g0Var, function1, tVarA, new a50.c(28));
                return g0Var;
            }
            g0 g0Var2 = q1.p.f35804a;
            g0Var2.getClass();
            return g0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(a50.c cVar, t tVar, g0 g0Var, Function1 function1, t tVar2, a50.c cVar2) {
        h4.c cVarY1;
        m0 m0Var;
        t tVar3 = tVar;
        int i11 = tVar3.f24699g;
        a50.c cVar3 = cVar2;
        Region region = (Region) cVar3.f822b;
        m0 m0Var2 = tVar2.f24695c;
        int i12 = tVar2.f24699g;
        boolean z11 = (m0Var2.J() && m0Var2.I()) ? false : true;
        a50.c cVar4 = cVar;
        Region region2 = (Region) cVar4.f822b;
        if (!region2.isEmpty() || i12 == i11) {
            if (!z11 || tVar2.f24697e) {
                Object objF = tVar2.f();
                if (objF == null) {
                    cVarY1 = m0Var2.G.f5857c.y1();
                } else {
                    b4.s node = ((b4.s) objF).getNode();
                    boolean z12 = d(tVar2.f24696d, m.f24658b) != null;
                    if (!node.getNode().isAttached()) {
                        cVarY1 = h4.c.f21379e;
                    } else if (z12) {
                        cVarY1 = b5.m.e(node, 8).y1();
                    } else {
                        s1 s1VarE = b5.m.e(node, 8);
                        cVarY1 = z4.c0.i(s1VarE).v(s1VarE, true);
                    }
                }
                z5.k kVarH = android.support.v4.media.session.a.H(cVarY1);
                region.set(kVarH.f47282a, kVarH.f47283b, kVarH.f47284c, kVarH.f47285d);
                if (i12 == i11) {
                    i12 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (tVar2.f24697e) {
                        t tVarL = tVar2.l();
                        g0Var.i(i12, new u(tVar2, android.support.v4.media.session.a.H((tVarL == null || (m0Var = tVarL.f24695c) == null || !m0Var.J()) ? f24706a : tVarL.g())));
                        return;
                    } else {
                        if (i12 == -1) {
                            Rect bounds = region.getBounds();
                            g0Var.i(i12, new u(tVar2, new z5.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                g0Var.i(i12, new u(tVar2, new z5.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = t.j(4, tVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) function1.invoke(listJ.get(size))).booleanValue()) {
                        c(cVar4, tVar3, g0Var, function1, (t) listJ.get(size), cVar3);
                    }
                    size--;
                    cVar4 = cVar;
                    tVar3 = tVar;
                    cVar3 = cVar2;
                }
                if (f(tVar2)) {
                    region2.op(kVarH.f47282a, kVarH.f47283b, kVarH.f47284c, kVarH.f47285d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(n nVar, a0 a0Var) {
        o oVar = o.f24686b;
        Object objD = nVar.f24682a.d(a0Var);
        return objD == null ? oVar.invoke() : objD;
    }

    public static final boolean e(t tVar) {
        s1 s1VarD = tVar.d();
        t0 t0Var = tVar.f24696d.f24682a;
        return (s1VarD != null ? s1VarD.l1() : false) || t0Var.b(x.f24721p) || t0Var.b(x.f24720o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(j5.t r14) {
        /*
            boolean r0 = e(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            j5.n r14 = r14.f24696d
            boolean r0 = r14.f24684c
            if (r0 != 0) goto L59
            q1.t0 r14 = r14.f24682a
            java.lang.Object[] r0 = r14.f35753b
            java.lang.Object[] r2 = r14.f35754c
            long[] r14 = r14.f35752a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            j5.a0 r11 = (j5.a0) r11
            boolean r10 = r11.f24613c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.w.f(j5.t):boolean");
    }
}
