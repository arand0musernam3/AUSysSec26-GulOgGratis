package b5;

import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f5907a = new a2(1);

    public static final long a(float f11, boolean z11, boolean z12) {
        return (((z11 ? 1L : 0L) | (z12 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32);
    }

    public static final int b(u0 u0Var, z4.a aVar) {
        u0 u0VarE0 = u0Var.E0();
        if (u0VarE0 == null) {
            y4.a.b("Child of " + u0Var + " cannot be null when calculating alignment line");
        }
        if (u0Var.L0().c().containsKey(aVar)) {
            Integer num = (Integer) u0Var.L0().c().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iB0 = u0VarE0.b0(aVar);
            if (iB0 != Integer.MIN_VALUE) {
                u0VarE0.f5996j = true;
                u0Var.f5997k = true;
                u0Var.R0();
                u0VarE0.f5996j = false;
                u0Var.f5997k = false;
                return iB0 + ((int) (aVar instanceof z4.o ? u0VarE0.N0() & 4294967295L : u0VarE0.N0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final b4.s c(l lVar, int i11) {
        b4.s child$ui = lVar.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & i11) == 0) {
            return null;
        }
        while (child$ui != null) {
            int kindSet$ui = child$ui.getKindSet$ui();
            if ((kindSet$ui & 2) != 0) {
                return null;
            }
            if ((kindSet$ui & i11) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }

    public static final int d(long j9, long j11) {
        boolean zJ = j(j9);
        if (zJ != j(j11)) {
            return zJ ? -1 : 1;
        }
        return (Math.min(g(j9), g(j11)) >= 0.0f && i(j9) != i(j11)) ? i(j9) ? -1 : 1 : (int) Math.signum(g(j9) - g(j11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e(k kVar, m3.u1 u1Var) {
        if (!((b4.s) kVar).getNode().isAttached()) {
            y4.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        u3.i iVar = (u3.i) m.g(kVar).C;
        iVar.getClass();
        return m3.i.y(iVar, u1Var);
    }

    public static final ArrayList f(z4.u uVar) {
        uVar.getClass();
        m0 m0VarI0 = ((u0) uVar).I0();
        boolean zK = k(m0VarI0);
        o3.b bVar = (o3.b) m0VarI0.o();
        o3.e eVar = (o3.e) bVar.f31822b;
        ArrayList arrayList = new ArrayList(eVar.f31832c);
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var = (m0) bVar.get(i12);
            arrayList.add(zK ? m0Var.l() : m0Var.m());
        }
        return arrayList;
    }

    public static final float g(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(r rVar) {
        if (((b4.s) rVar).getNode().isAttached()) {
            m.e(rVar, 1).k1();
        }
    }

    public static final boolean i(long j9) {
        return (j9 & 2) != 0;
    }

    public static final boolean j(long j9) {
        return (j9 & 1) != 0;
    }

    public static final boolean k(m0 m0Var) {
        int i11 = g1.$EnumSwitchMapping$0[m0Var.H.f5931d.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            e40.a.f();
            return false;
        }
        m0 m0VarW = m0Var.w();
        if (m0VarW != null) {
            return k(m0VarW);
        }
        i4.a.f("no parent for idle node");
        return false;
    }

    public static final boolean l(m0 m0Var) {
        if (m0Var.f5873i == null) {
            return false;
        }
        m0 m0VarW = m0Var.w();
        return (m0VarW != null ? m0VarW.f5873i : null) == null || m0Var.H.f5929b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(b4.s sVar, Function0 function0) {
        z1 ownerScope$ui = sVar.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ownerScope$ui = new z1((y1) sVar);
            sVar.setOwnerScope$ui(ownerScope$ui);
        }
        f2 snapshotObserver = ((c5.y) m.h(sVar)).getSnapshotObserver();
        snapshotObserver.f5819a.d(ownerScope$ui, z1.f6039b, function0);
    }

    public static final View n(l lVar) {
        if (!lVar.getNode().isAttached()) {
            y4.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) p0.a(m.g(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void o(l lVar, Object obj, Function1 function1) {
        l1 l1Var;
        if (!lVar.getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s parent$ui = lVar.getNode().getParent$ui();
        m0 m0VarG = m.g(lVar);
        while (m0VarG != null) {
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        ?? B = parent$ui;
                        ?? eVar = 0;
                        while (B != 0) {
                            if (B instanceof q2) {
                                q2 q2Var = (q2) B;
                                if (!(Intrinsics.areEqual(obj, q2Var.g()) ? ((Boolean) function1.invoke(q2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((B.getKindSet$ui() & 262144) != 0) && (B instanceof n)) {
                                    b4.s child$ui = ((n) B).f5892p;
                                    int i11 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 262144) != 0) {
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
                            }
                            B = m.b(eVar);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void p(q2 q2Var, Function1 function1) {
        l1 l1Var;
        if (!q2Var.getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s parent$ui = q2Var.getNode().getParent$ui();
        m0 m0VarG = m.g(q2Var);
        while (m0VarG != null) {
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        ?? B = parent$ui;
                        ?? eVar = 0;
                        while (B != 0) {
                            boolean zBooleanValue = true;
                            if (B instanceof q2) {
                                q2 q2Var2 = (q2) B;
                                if (Intrinsics.areEqual(q2Var.g(), q2Var2.g()) && q2Var.getClass() == q2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(q2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((B.getKindSet$ui() & 262144) != 0) && (B instanceof n)) {
                                    b4.s child$ui = ((n) B).f5892p;
                                    int i11 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 262144) != 0) {
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
                            }
                            B = m.b(eVar);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void q(l lVar, String str, Function1 function1) {
        if (!lVar.getNode().isAttached()) {
            y4.a.b("visitSubtreeIf called on an unattached node");
        }
        o3.e eVar = new o3.e(new b4.s[16], 0);
        b4.s child$ui = lVar.getNode().getChild$ui();
        if (child$ui == null) {
            m.a(eVar, lVar.getNode());
        } else {
            eVar.b(child$ui);
        }
        while (true) {
            int i11 = eVar.f31832c;
            if (i11 == 0) {
                return;
            }
            b4.s sVar = (b4.s) eVar.l(i11 - 1);
            if ((sVar.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (b4.s child$ui2 = sVar; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 262144) != 0) {
                        ?? B = child$ui2;
                        ?? eVar2 = 0;
                        while (B != 0) {
                            if (B instanceof q2) {
                                q2 q2Var = (q2) B;
                                p2 p2Var = Intrinsics.areEqual(str, q2Var.g()) ? (p2) function1.invoke(q2Var) : p2.ContinueTraversal;
                                if (p2Var == p2.CancelTraversal) {
                                    return;
                                }
                                if (p2Var == p2.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((B.getKindSet$ui() & 262144) != 0 && (B instanceof n)) {
                                b4.s child$ui3 = ((n) B).f5892p;
                                int i12 = 0;
                                B = B;
                                eVar2 = eVar2;
                                while (child$ui3 != null) {
                                    if ((child$ui3.getKindSet$ui() & 262144) != 0) {
                                        i12++;
                                        eVar2 = eVar2;
                                        if (i12 == 1) {
                                            B = child$ui3;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B != 0) {
                                                eVar2.b(B);
                                                B = 0;
                                            }
                                            eVar2.b(child$ui3);
                                        }
                                    }
                                    child$ui3 = child$ui3.getChild$ui();
                                    B = B;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            B = m.b(eVar2);
                        }
                    }
                }
            }
            m.a(eVar, sVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [b5.q2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void r(q2 q2Var, Function1 function1) {
        b4.s sVar = (b4.s) q2Var;
        if (!sVar.getNode().isAttached()) {
            y4.a.b("visitSubtreeIf called on an unattached node");
        }
        o3.e eVar = new o3.e(new b4.s[16], 0);
        b4.s child$ui = sVar.getNode().getChild$ui();
        if (child$ui == null) {
            m.a(eVar, sVar.getNode());
        } else {
            eVar.b(child$ui);
        }
        while (true) {
            int i11 = eVar.f31832c;
            if (i11 == 0) {
                return;
            }
            b4.s sVar2 = (b4.s) eVar.l(i11 - 1);
            if ((sVar2.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (b4.s child$ui2 = sVar2; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 262144) != 0) {
                        ?? B = child$ui2;
                        ?? eVar2 = 0;
                        while (B != 0) {
                            if (B instanceof q2) {
                                q2 q2Var2 = (q2) B;
                                p2 p2Var = (Intrinsics.areEqual(q2Var.g(), q2Var2.g()) && q2Var.getClass() == q2Var2.getClass()) ? (p2) function1.invoke(q2Var2) : p2.ContinueTraversal;
                                if (p2Var == p2.CancelTraversal) {
                                    return;
                                }
                                if (p2Var == p2.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((B.getKindSet$ui() & 262144) != 0 && (B instanceof n)) {
                                b4.s child$ui3 = ((n) B).f5892p;
                                int i12 = 0;
                                B = B;
                                eVar2 = eVar2;
                                while (child$ui3 != null) {
                                    if ((child$ui3.getKindSet$ui() & 262144) != 0) {
                                        i12++;
                                        eVar2 = eVar2;
                                        if (i12 == 1) {
                                            B = child$ui3;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B != 0) {
                                                eVar2.b(B);
                                                B = 0;
                                            }
                                            eVar2.b(child$ui3);
                                        }
                                    }
                                    child$ui3 = child$ui3.getChild$ui();
                                    B = B;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            B = m.b(eVar2);
                        }
                    }
                }
            }
            m.a(eVar, sVar2);
        }
    }
}
