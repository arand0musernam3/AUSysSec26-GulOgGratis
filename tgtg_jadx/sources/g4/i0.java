package g4;

import b5.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final boolean a(g0 g0Var, boolean z11) {
        int i11 = h0.$EnumSwitchMapping$0[g0Var.Q0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return z11;
            }
            if (i11 == 3) {
                g0 g0VarG = d.g(g0Var);
                if (!(g0VarG != null ? a(g0VarG, z11) : true)) {
                    return false;
                }
                g0Var.M0(b0.ActiveParent, b0.Inactive);
                return true;
            }
            if (i11 != 4) {
                e40.a.f();
                return false;
            }
        }
        return true;
    }

    public static final b b(g0 g0Var, int i11) {
        int i12 = h0.$EnumSwitchMapping$0[g0Var.Q0().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return b.Cancelled;
            }
            if (i12 == 3) {
                g0 g0VarG = d.g(g0Var);
                if (g0VarG == null) {
                    i4.a.f("ActiveParent with no focused child");
                    return null;
                }
                b bVarB = b(g0VarG, i11);
                b bVar = b.None;
                b bVar2 = bVarB != bVar ? bVarB : null;
                if (bVar2 != null) {
                    return bVar2;
                }
                if (g0Var.f19941q) {
                    return bVar;
                }
                g0Var.f19941q = true;
                try {
                    t tVarN0 = g0Var.N0();
                    a aVar = new a(i11);
                    p pVar = (p) ((c5.y) b5.m.h(g0Var)).getFocusOwner();
                    g0 g0VarH = pVar.h();
                    tVarN0.f19984k.invoke(aVar);
                    g0 g0VarH2 = pVar.h();
                    if (!aVar.f19931b) {
                        return (g0VarH == g0VarH2 || g0VarH2 == null) ? bVar : v.f19987d == v.f19986c ? b.Cancelled : b.Redirected;
                    }
                    v vVar = v.f19985b;
                    return b.Cancelled;
                } finally {
                    g0Var.f19941q = false;
                }
            }
            if (i12 != 4) {
                e40.a.f();
                return null;
            }
        }
        return b.None;
    }

    public static final b c(g0 g0Var, int i11) {
        if (!g0Var.f19942r) {
            g0Var.f19942r = true;
            try {
                t tVarN0 = g0Var.N0();
                a aVar = new a(i11);
                p pVar = (p) ((c5.y) b5.m.h(g0Var)).getFocusOwner();
                g0 g0VarH = pVar.h();
                tVarN0.f19983j.invoke(aVar);
                g0 g0VarH2 = pVar.h();
                if (aVar.f19931b) {
                    v vVar = v.f19985b;
                    return b.Cancelled;
                }
                if (g0VarH != g0VarH2 && g0VarH2 != null) {
                    return v.f19987d == v.f19986c ? b.Cancelled : b.Redirected;
                }
            } finally {
                g0Var.f19942r = false;
            }
        }
        return b.None;
    }

    public static final b d(g0 g0Var, int i11) {
        b4.s sVarB;
        l1 l1Var;
        int i12 = h0.$EnumSwitchMapping$0[g0Var.Q0().ordinal()];
        if (i12 == 1 || i12 == 2) {
            return b.None;
        }
        if (i12 == 3) {
            g0 g0VarG = d.g(g0Var);
            if (g0VarG != null) {
                return b(g0VarG, i11);
            }
            i4.a.f("ActiveParent with no focused child");
            return null;
        }
        if (i12 != 4) {
            e40.a.f();
            return null;
        }
        if (!g0Var.getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s parent$ui = g0Var.getNode().getParent$ui();
        b5.m0 m0VarG = b5.m.g(g0Var);
        loop0: while (true) {
            if (m0VarG == null) {
                sVarB = null;
                break;
            }
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        sVarB = parent$ui;
                        o3.e eVar = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g0) {
                                break loop0;
                            }
                            if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                int i13 = 0;
                                for (b4.s child$ui = ((b5.n) sVarB).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                                    if ((child$ui.getKindSet$ui() & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        g0 g0Var2 = (g0) sVarB;
        if (g0Var2 == null) {
            return b.None;
        }
        int i14 = h0.$EnumSwitchMapping$0[g0Var2.Q0().ordinal()];
        if (i14 == 1) {
            return c(g0Var2, i11);
        }
        if (i14 == 2) {
            return b.Cancelled;
        }
        if (i14 == 3) {
            return d(g0Var2, i11);
        }
        if (i14 != 4) {
            e40.a.f();
            return null;
        }
        b bVarD = d(g0Var2, i11);
        b bVar = bVarD != b.None ? bVarD : null;
        return bVar == null ? c(g0Var2, i11) : bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0256 A[ADDED_TO_REGION, LOOP:9: B:152:0x0256->B:159:0x026a, LOOP_START, PHI: r12
      0x0256: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:151:0x0254, B:159:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(g4.g0 r18) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i0.e(g4.g0):boolean");
    }
}
