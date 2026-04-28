package g4;

import android.os.Trace;
import b5.l1;
import b5.y1;
import c5.x1;
import com.braze.h2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends b4.s implements b5.k, b5.b0, c0, y1, a5.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Function2 f19940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19943s;

    public g0(int i11, int i12, Function2 function2) {
        i11 = (i12 & 1) != 0 ? 1 : i11;
        boolean z11 = (i12 & 2) == 0;
        function2 = (i12 & 4) != 0 ? null : function2;
        this.f19939o = z11;
        this.f19940p = function2;
        this.f19943s = i11;
    }

    public final boolean L0(int i11) {
        int i12 = e0.$EnumSwitchMapping$0[i0.d(this, i11).ordinal()];
        if (i12 == 1) {
            return i0.e(this);
        }
        if (i12 == 2) {
            return true;
        }
        if (i12 == 3 || i12 == 4) {
            return false;
        }
        e40.a.f();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void M0(b0 b0Var, b0 b0Var2) {
        l1 l1Var;
        Function2 function2;
        p pVar = (p) ((c5.y) b5.m.h(this)).getFocusOwner();
        g0 g0VarH = pVar.h();
        if (!Intrinsics.areEqual(b0Var, b0Var2) && (function2 = this.f19940p) != null) {
            function2.invoke(b0Var, b0Var2);
        }
        b4.s node = getNode();
        if (!getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s node2 = getNode();
        b5.m0 m0VarG = b5.m.g(this);
        while (m0VarG != null) {
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & 4096) != 0) {
                            ?? B = node2;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof g) {
                                    g gVar = (g) B;
                                    if (g0VarH == pVar.h()) {
                                        gVar.e0(b0Var2);
                                    }
                                } else if ((B.getKindSet$ui() & 4096) != 0 && (B instanceof b5.n)) {
                                    b4.s child$ui = ((b5.n) B).f5892p;
                                    int i11 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 4096) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                B = child$ui;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (B != 0) {
                                                    eVar.b(B);
                                                    B = 0;
                                                }
                                                eVar.b(child$ui);
                                            }
                                        }
                                        child$ui = child$ui.getChild$ui();
                                        B = B;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B = b5.m.b(eVar);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            node2 = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final t N0() {
        boolean z11;
        l1 l1Var;
        t tVar = new t();
        tVar.f19974a = true;
        v vVar = v.f19985b;
        tVar.f19975b = vVar;
        tVar.f19976c = vVar;
        tVar.f19977d = vVar;
        tVar.f19978e = vVar;
        tVar.f19979f = vVar;
        tVar.f19980g = vVar;
        tVar.f19981h = vVar;
        tVar.f19982i = vVar;
        tVar.f19983j = s.f19971b;
        tVar.f19984k = s.f19972c;
        tVar.l = q.f19970a;
        int i11 = this.f19943s;
        if (i11 == 1) {
            z11 = true;
        } else if (i11 == 0) {
            z11 = !(((s4.a) ((s4.c) ((s4.b) b5.o.e(this, x1.f7420m))).f38837a.getValue()).f38836a == 1);
        } else {
            if (i11 != 2) {
                h2.b("Unknown Focusability");
                return null;
            }
            z11 = false;
        }
        tVar.f19974a = z11;
        b4.s node = getNode();
        if (!getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s node2 = getNode();
        b5.m0 m0VarG = b5.m.g(this);
        loop0: while (m0VarG != null) {
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & NewHope.SENDB_BYTES) != 0) {
                            ?? B = node2;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof u) {
                                    ((u) B).x(tVar);
                                } else if ((B.getKindSet$ui() & NewHope.SENDB_BYTES) != 0 && (B instanceof b5.n)) {
                                    b4.s child$ui = ((b5.n) B).f5892p;
                                    int i12 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & NewHope.SENDB_BYTES) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                B = child$ui;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (B != 0) {
                                                    eVar.b(B);
                                                    B = 0;
                                                }
                                                eVar.b(child$ui);
                                            }
                                        }
                                        child$ui = child$ui.getChild$ui();
                                        B = B;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                B = b5.m.b(eVar);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            node2 = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
        return tVar;
    }

    public final h4.c O0(z4.z zVar) {
        h4.c cVar = N0().l;
        return cVar != q.f19970a ? zVar == null ? cVar : cVar.k(zVar.q(b5.m.f(this), 0L)) : zVar != null ? zVar.v(b5.m.f(this), false) : na0.a.S(0L, b0.z.z(b5.m.f(this).f47185c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z4.f P0() {
        /*
            r7 = this;
            b4.s r0 = r7.getNode()
            boolean r0 = r0.isAttached()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "visitAncestors called on an unattached node"
            y4.a.b(r0)
        Lf:
            b4.s r0 = r7.getNode()
            b4.s r0 = r0.getParent$ui()
            b5.m0 r1 = b5.m.g(r7)
        L1b:
            r2 = 0
            if (r1 == 0) goto Lb6
            b5.l1 r3 = r1.G
            b4.s r3 = r3.f5860f
            int r3 = r3.getAggregateChildKindSet$ui()
            r4 = 8388640(0x800020, float:1.1754988E-38)
            r3 = r3 & r4
            if (r3 == 0) goto La5
        L2c:
            if (r0 == 0) goto La5
            int r3 = r0.getKindSet$ui()
            r3 = r3 & r4
            if (r3 == 0) goto La0
            r3 = 8388608(0x800000, float:1.1754944E-38)
            int r5 = r0.getKindSet$ui()
            r3 = r3 & r5
            if (r3 == 0) goto L62
            boolean r1 = r0 instanceof z4.i
            if (r1 == 0) goto L43
            goto L5b
        L43:
            boolean r1 = r0 instanceof b5.n
            if (r1 == 0) goto L5a
            b5.n r0 = (b5.n) r0
            b4.s r0 = r0.f5892p
            r1 = r2
        L4c:
            if (r0 == 0) goto L58
            boolean r3 = r0 instanceof z4.i
            if (r3 == 0) goto L53
            r1 = r0
        L53:
            b4.s r0 = r0.getChild$ui()
            goto L4c
        L58:
            r0 = r1
            goto L5b
        L5a:
            r0 = r2
        L5b:
            z4.i r0 = (z4.i) r0
            if (r0 == 0) goto Lb6
            h2.u r0 = (h2.u) r0
            return r0
        L62:
            int r3 = r0.getKindSet$ui()
            r3 = r3 & 32
            if (r3 == 0) goto La0
            boolean r3 = r0 instanceof a5.c
            if (r3 == 0) goto L70
            r5 = r0
            goto L87
        L70:
            boolean r3 = r0 instanceof b5.n
            if (r3 == 0) goto L86
            r3 = r0
            b5.n r3 = (b5.n) r3
            b4.s r3 = r3.f5892p
            r5 = r2
        L7a:
            if (r3 == 0) goto L87
            boolean r6 = r3 instanceof a5.c
            if (r6 == 0) goto L81
            r5 = r3
        L81:
            b4.s r3 = r3.getChild$ui()
            goto L7a
        L86:
            r5 = r2
        L87:
            a5.c r5 = (a5.c) r5
            if (r5 == 0) goto La0
            a5.a r3 = r5.U()
            int r6 = z4.h.f47130a
            boolean r3 = r3.a()
            if (r3 != 0) goto L98
            goto La0
        L98:
            a5.a r0 = r5.U()
            r0.b()
            throw r2
        La0:
            b4.s r0 = r0.getParent$ui()
            goto L2c
        La5:
            b5.m0 r1 = r1.w()
            if (r1 == 0) goto Lb3
            b5.l1 r0 = r1.G
            if (r0 == 0) goto Lb3
            b5.n2 r0 = r0.f5859e
            goto L1b
        Lb3:
            r0 = r2
            goto L1b
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.g0.P0():z4.f");
    }

    public final b0 Q0() {
        l1 l1Var;
        if (!isAttached()) {
            return b0.Inactive;
        }
        g0 g0VarH = ((p) ((c5.y) b5.m.h(this)).getFocusOwner()).h();
        if (g0VarH == null) {
            return b0.Inactive;
        }
        if (this == g0VarH) {
            return b0.Active;
        }
        if (g0VarH.isAttached()) {
            if (!g0VarH.getNode().isAttached()) {
                y4.a.b("visitAncestors called on an unattached node");
            }
            b4.s parent$ui = g0VarH.getNode().getParent$ui();
            b5.m0 m0VarG = b5.m.g(g0VarH);
            while (m0VarG != null) {
                if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            b4.s sVarB = parent$ui;
                            o3.e eVar = null;
                            while (sVarB != null) {
                                if (sVarB instanceof g0) {
                                    if (this == ((g0) sVarB)) {
                                        return b0.ActiveParent;
                                    }
                                } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                    int i11 = 0;
                                    for (b4.s child$ui = ((b5.n) sVarB).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                                        if ((child$ui.getKindSet$ui() & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                sVarB = child$ui;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (sVarB != null) {
                                                    eVar.b(sVarB);
                                                    sVarB = null;
                                                }
                                                eVar.b(child$ui);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                sVarB = b5.m.b(eVar);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                m0VarG = m0VarG.w();
                parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
            }
        }
        return b0.Inactive;
    }

    public final void R0() {
        r rVar;
        int i11 = e0.$EnumSwitchMapping$1[Q0().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                return;
            }
            e40.a.f();
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        b5.o.m(this, new f0(objectRef, this));
        T t9 = objectRef.element;
        if (t9 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            rVar = null;
        } else {
            rVar = (r) t9;
        }
        if (rVar.a()) {
            return;
        }
        ((p) ((c5.y) b5.m.h(this)).getFocusOwner()).b(true);
    }

    public final boolean S0(int i11) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zL0 = N0().f19974a ? L0(i11) : o0.e(this, i11, new c5.v(i11, 4));
            Trace.endSection();
            return zL0;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.y1
    public final void l0() {
        R0();
    }

    @Override // b4.s
    public final void onDetach() {
        int i11 = e0.$EnumSwitchMapping$1[Q0().ordinal()];
        if (i11 == 1 || i11 == 2) {
            p pVar = (p) ((c5.y) b5.m.h(this)).getFocusOwner();
            pVar.d(8, true, false);
            if (this.f19939o) {
                pVar.f19962a.E();
            }
            pVar.f19965d.a();
            return;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return;
            }
            e40.a.f();
            return;
        }
        l focusOwner = ((c5.y) b5.m.h(this)).getFocusOwner();
        g0 g0VarB = d.b(this);
        if (g0VarB == null || !g0VarB.f19939o) {
            return;
        }
        p pVar2 = (p) focusOwner;
        pVar2.f19962a.E();
        pVar2.f19965d.a();
    }

    @Override // b4.s
    public final void onReset() {
        if (Q0().c()) {
            ((p) ((c5.y) b5.m.h(this)).getFocusOwner()).d(8, true, true);
        }
    }

    @Override // b5.b0
    public final void u(z4.z zVar) {
    }
}
