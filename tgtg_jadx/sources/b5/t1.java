package b5;

import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1.n0 f5987a;

    static {
        q1.n0 n0Var = q1.a1.f35713a;
        f5987a = new q1.n0();
    }

    public static final void a(b4.s sVar) {
        if (!sVar.isAttached()) {
            y4.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(sVar, -1, 1);
    }

    public static final void b(b4.s sVar, int i11, int i12) {
        if (!(sVar instanceof n)) {
            c(sVar, i11 & sVar.getKindSet$ui(), i12);
            return;
        }
        n nVar = (n) sVar;
        int i13 = nVar.f5891o;
        c(sVar, i13 & i11, i12);
        int i14 = (~i13) & i11;
        for (b4.s child$ui = nVar.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            b(child$ui, i14, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(b4.s sVar, int i11, int i12) {
        if (i12 != 0 || sVar.getShouldAutoInvalidate()) {
            if ((i11 & 2) != 0 && (sVar instanceof c0)) {
                m.g((c0) sVar).F();
                if (i12 == 2) {
                    m.e(sVar, 2).p1();
                }
            }
            if ((i11 & 128) != 0 && i12 != 2) {
                m.g(sVar).F();
            }
            if ((4194304 & i11) != 0 && i12 != 2) {
                m0 m0VarG = m.g(sVar);
                g0 g0Var = m0.V;
                m0VarG.X(false);
            }
            if ((i11 & 256) != 0 && (sVar instanceof s)) {
                if (i12 == 1) {
                    m0 m0VarG2 = m.g(sVar);
                    m0VarG2.d0(m0VarG2.Q + 1);
                } else if (i12 == 2) {
                    m.g(sVar).d0(r0.Q - 1);
                }
                if (i12 != 2) {
                    m0 m0VarG3 = m.g(sVar);
                    if (m0VarG3.Q != 0 && !m0VarG3.q() && !m0VarG3.r() && !m0VarG3.P) {
                        c5.y yVar = (c5.y) p0.a(m0VarG3);
                        w2.z zVar = yVar.f7441h0.f5766e;
                        zVar.getClass();
                        if (m0VarG3.Q > 0) {
                            ((o3.e) zVar.f43083b).b(m0VarG3);
                            m0VarG3.P = true;
                        }
                        yVar.F(null);
                    }
                }
            }
            if ((i11 & 4) != 0 && (sVar instanceof r)) {
                o.h((r) sVar);
            }
            if ((i11 & 8) != 0 && (sVar instanceof l2)) {
                m.g(sVar).f5882s = true;
            }
            if ((i11 & 64) != 0 && (sVar instanceof g2)) {
                q0 q0Var = m.g((g2) sVar).H;
                q0Var.f5942p.f5810r = true;
                z0 z0Var = q0Var.f5943q;
                if (z0Var != null) {
                    z0Var.f6036x = true;
                }
            }
            if ((i11 & NewHope.SENDB_BYTES) != 0 && (sVar instanceof g4.u)) {
                g4.u uVar = (g4.u) sVar;
                f.f5798b = null;
                uVar.x(f.f5797a);
                if (f.f5798b != null) {
                    b4.s sVar2 = (b4.s) uVar;
                    if (!sVar2.getNode().isAttached()) {
                        y4.a.b("visitChildren called on an unattached node");
                    }
                    o3.e eVar = new o3.e(new b4.s[16], 0);
                    b4.s child$ui = sVar2.getNode().getChild$ui();
                    if (child$ui == null) {
                        m.a(eVar, sVar2.getNode());
                    } else {
                        eVar.b(child$ui);
                    }
                    while (true) {
                        int i13 = eVar.f31832c;
                        if (i13 == 0) {
                            break;
                        }
                        b4.s sVarB = (b4.s) eVar.l(i13 - 1);
                        if ((sVarB.getAggregateChildKindSet$ui() & 1024) == 0) {
                            m.a(eVar, sVarB);
                        } else {
                            while (true) {
                                if (sVarB == null) {
                                    break;
                                }
                                if ((sVarB.getKindSet$ui() & 1024) != 0) {
                                    o3.e eVar2 = null;
                                    while (sVarB != null) {
                                        if (sVarB instanceof g4.g0) {
                                            g4.g0 g0Var2 = (g4.g0) sVarB;
                                            g4.i iVar = ((g4.p) ((c5.y) m.h(g0Var2)).getFocusOwner()).f19965d;
                                            if (iVar.f19948c.d(g0Var2)) {
                                                iVar.a();
                                            }
                                        } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof n)) {
                                            int i14 = 0;
                                            for (b4.s child$ui2 = ((n) sVarB).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                                                if ((child$ui2.getKindSet$ui() & 1024) != 0) {
                                                    i14++;
                                                    if (i14 == 1) {
                                                        sVarB = child$ui2;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new o3.e(new b4.s[16], 0);
                                                        }
                                                        if (sVarB != null) {
                                                            eVar2.b(sVarB);
                                                            sVarB = null;
                                                        }
                                                        eVar2.b(child$ui2);
                                                    }
                                                }
                                            }
                                            if (i14 == 1) {
                                            }
                                        }
                                        sVarB = m.b(eVar2);
                                    }
                                } else {
                                    sVarB = sVarB.getChild$ui();
                                }
                            }
                        }
                    }
                }
            }
            if ((i11 & 4096) == 0 || !(sVar instanceof g4.g)) {
                return;
            }
            g4.g gVar = (g4.g) sVar;
            g4.i iVar2 = ((g4.p) ((c5.y) m.h(gVar)).getFocusOwner()).f19965d;
            if (iVar2.f19949d.d(gVar)) {
                iVar2.a();
            }
        }
    }

    public static final void d(b4.s sVar) {
        if (!sVar.isAttached()) {
            y4.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(sVar, -1, 0);
    }

    public static final int e(b4.r rVar) {
        int i11 = rVar instanceof z4.g0 ? 3 : 1;
        if (rVar instanceof f4.f) {
            i11 |= 4;
        }
        if (rVar instanceof j5.q) {
            i11 |= 8;
        }
        if (rVar instanceof w4.b0) {
            i11 |= 16;
        }
        if (rVar instanceof x2.g) {
            i11 |= 256;
        }
        if (rVar instanceof z4.j1) {
            i11 |= 64;
        }
        return rVar instanceof g5.a ? 524288 | i11 : i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int f(b4.s r4) {
        /*
            int r0 = r4.getKindSet$ui()
            if (r0 == 0) goto Lb
            int r4 = r4.getKindSet$ui()
            return r4
        Lb:
            java.lang.Class r0 = r4.getClass()
            q1.n0 r1 = b5.t1.f5987a
            int r2 = r1.a(r0)
            if (r2 < 0) goto L1c
            int[] r4 = r1.f35870c
            r4 = r4[r2]
            return r4
        L1c:
            boolean r2 = r4 instanceof b5.c0
            if (r2 == 0) goto L22
            r2 = 3
            goto L23
        L22:
            r2 = 1
        L23:
            boolean r3 = r4 instanceof b5.r
            if (r3 == 0) goto L29
            r2 = r2 | 4
        L29:
            boolean r3 = r4 instanceof b5.l2
            if (r3 == 0) goto L2f
            r2 = r2 | 8
        L2f:
            boolean r3 = r4 instanceof b5.i2
            if (r3 == 0) goto L35
            r2 = r2 | 16
        L35:
            boolean r3 = r4 instanceof a5.c
            if (r3 == 0) goto L3b
            r2 = r2 | 32
        L3b:
            boolean r3 = r4 instanceof b5.g2
            if (r3 == 0) goto L41
            r2 = r2 | 64
        L41:
            boolean r3 = r4 instanceof z4.g1
            if (r3 == 0) goto L49
            r3 = 4194304(0x400000, float:5.877472E-39)
        L47:
            r2 = r2 | r3
            goto L58
        L49:
            boolean r3 = r4 instanceof z4.i1
            if (r3 == 0) goto L50
            r2 = r2 | 128(0x80, float:1.8E-43)
            goto L58
        L50:
            boolean r3 = r4 instanceof b5.b0
            if (r3 == 0) goto L58
            r3 = 4194432(0x400080, float:5.877651E-39)
            goto L47
        L58:
            boolean r3 = r4 instanceof b5.s
            if (r3 == 0) goto L5e
            r2 = r2 | 256(0x100, float:3.59E-43)
        L5e:
            boolean r3 = r4 instanceof g4.g0
            if (r3 == 0) goto L64
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L64:
            boolean r3 = r4 instanceof g4.u
            if (r3 == 0) goto L6a
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L6a:
            boolean r3 = r4 instanceof g4.g
            if (r3 == 0) goto L70
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L70:
            boolean r3 = r4 instanceof u4.e
            if (r3 == 0) goto L76
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L76:
            boolean r3 = r4 instanceof c5.m
            if (r3 == 0) goto L7c
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L7c:
            boolean r3 = r4 instanceof b5.k
            if (r3 == 0) goto L84
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r3
        L84:
            boolean r3 = r4 instanceof b5.q2
            if (r3 == 0) goto L8b
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
        L8b:
            boolean r3 = r4 instanceof g5.a
            if (r3 == 0) goto L92
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r3
        L92:
            boolean r3 = r4 instanceof t4.c
            if (r3 == 0) goto L99
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r3
        L99:
            boolean r4 = r4 instanceof z4.i
            if (r4 == 0) goto La0
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r4
        La0:
            r1.g(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.t1.f(b4.s):int");
    }

    public static final int g(b4.s sVar) {
        if (!(sVar instanceof n)) {
            return f(sVar);
        }
        n nVar = (n) sVar;
        int iG = nVar.f5891o;
        for (b4.s child$ui = nVar.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            iG |= g(child$ui);
        }
        return iG;
    }

    public static final boolean h(int i11) {
        return ((i11 & 128) != 0) | ((i11 & 4194304) != 0);
    }
}
