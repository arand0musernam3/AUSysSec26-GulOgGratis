package g4;

import com.braze.h2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f21382c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f21380a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f21383d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f21381b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        com.braze.h2.b("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        com.braze.h2.b("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(h4.c r18, h4.c r19, h4.c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = b(r3, r2, r0)
            float r5 = r2.f21381b
            float r6 = r2.f21383d
            float r7 = r2.f21380a
            float r2 = r2.f21382c
            float r8 = r0.f21383d
            float r9 = r0.f21381b
            float r10 = r0.f21382c
            float r11 = r0.f21380a
            r12 = 0
            if (r4 != 0) goto L9e
            boolean r0 = b(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9e
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L99
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L44:
            if (r3 != r13) goto L9a
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L99
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f21382c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f21380a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f21383d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L95
            float r1 = r1.f21381b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            com.braze.h2.b(r4)
        L93:
            r0 = 0
            return r0
        L95:
            com.braze.h2.b(r4)
            goto L93
        L99:
            return r18
        L9a:
            com.braze.h2.b(r4)
            goto L93
        L9e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.o0.a(h4.c, h4.c, h4.c, int):boolean");
    }

    public static final boolean b(int i11, h4.c cVar, h4.c cVar2) {
        if (i11 == 3 || i11 == 4) {
            return cVar.f21383d > cVar2.f21381b && cVar.f21381b < cVar2.f21383d;
        }
        if (i11 == 5 || i11 == 6) {
            return cVar.f21382c > cVar2.f21380a && cVar.f21380a < cVar2.f21382c;
        }
        h2.b("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void c(g0 g0Var, o3.e eVar) {
        if (!g0Var.getNode().isAttached()) {
            y4.a.b("visitChildren called on an unattached node");
        }
        o3.e eVar2 = new o3.e(new b4.s[16], 0);
        b4.s child$ui = g0Var.getNode().getChild$ui();
        if (child$ui == null) {
            b5.m.a(eVar2, g0Var.getNode());
        } else {
            eVar2.b(child$ui);
        }
        while (true) {
            int i11 = eVar2.f31832c;
            if (i11 == 0) {
                return;
            }
            b4.s sVarB = (b4.s) eVar2.l(i11 - 1);
            if ((sVarB.getAggregateChildKindSet$ui() & 1024) == 0) {
                b5.m.a(eVar2, sVarB);
            } else {
                while (true) {
                    if (sVarB == null) {
                        break;
                    }
                    if ((sVarB.getKindSet$ui() & 1024) != 0) {
                        o3.e eVar3 = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g0) {
                                g0 g0Var2 = (g0) sVarB;
                                if (g0Var2.isAttached() && !b5.m.g(g0Var2).T) {
                                    if (g0Var2.N0().f19974a) {
                                        eVar.b(g0Var2);
                                    } else {
                                        c(g0Var2, eVar);
                                    }
                                }
                            } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                int i12 = 0;
                                for (b4.s child$ui2 = ((b5.n) sVarB).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                                    if ((child$ui2.getKindSet$ui() & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            sVarB = child$ui2;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (sVarB != null) {
                                                eVar3.b(sVarB);
                                                sVarB = null;
                                            }
                                            eVar3.b(child$ui2);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            sVarB = b5.m.b(eVar3);
                        }
                    } else {
                        sVarB = sVarB.getChild$ui();
                    }
                }
            }
        }
    }

    public static final g0 d(o3.e eVar, h4.c cVar, int i11) {
        h4.c cVarJ;
        if (i11 == 3) {
            cVarJ = cVar.j((cVar.f21382c - cVar.f21380a) + 1, 0.0f);
        } else if (i11 == 4) {
            cVarJ = cVar.j(-((cVar.f21382c - cVar.f21380a) + 1), 0.0f);
        } else if (i11 == 5) {
            cVarJ = cVar.j(0.0f, (cVar.f21383d - cVar.f21381b) + 1);
        } else {
            if (i11 != 6) {
                h2.b("This function should only be used for 2-D focus search");
                return null;
            }
            cVarJ = cVar.j(0.0f, -((cVar.f21383d - cVar.f21381b) + 1));
        }
        Object[] objArr = eVar.f31830a;
        int i12 = eVar.f31832c;
        g0 g0Var = null;
        for (int i13 = 0; i13 < i12; i13++) {
            g0 g0Var2 = (g0) objArr[i13];
            if (d.h(g0Var2)) {
                h4.c cVarC = d.c(g0Var2);
                if (g(cVarC, cVarJ, cVar, i11)) {
                    g0Var = g0Var2;
                    cVarJ = cVarC;
                }
            }
        }
        return g0Var;
    }

    public static final boolean e(g0 g0Var, int i11, Function1 function1) {
        h4.c cVar;
        o3.e eVar = new o3.e(new g0[16], 0);
        c(g0Var, eVar);
        int i12 = eVar.f31832c;
        if (i12 <= 1) {
            g0 g0Var2 = (g0) (i12 == 0 ? null : eVar.f31830a[0]);
            if (g0Var2 != null) {
                return ((Boolean) function1.invoke(g0Var2)).booleanValue();
            }
        } else {
            if (i11 == 7) {
                i11 = 4;
            }
            if (i11 == 4 || i11 == 6) {
                h4.c cVarC = d.c(g0Var);
                float f11 = cVarC.f21380a;
                float f12 = cVarC.f21381b;
                cVar = new h4.c(f11, f12, f11, f12);
            } else {
                if (i11 != 3 && i11 != 5) {
                    h2.b("This function should only be used for 2-D focus search");
                    return false;
                }
                h4.c cVarC2 = d.c(g0Var);
                float f13 = cVarC2.f21382c;
                float f14 = cVarC2.f21383d;
                cVar = new h4.c(f13, f14, f13, f14);
            }
            g0 g0VarD = d(eVar, cVar, i11);
            if (g0VarD != null) {
                return ((Boolean) function1.invoke(g0VarD)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean f(int i11, c6.f fVar, g0 g0Var, h4.c cVar) {
        if (j(i11, fVar, g0Var, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) d.l(g0Var, i11, new m0(((p) ((c5.y) b5.m.h(g0Var)).getFocusOwner()).h(), g0Var, cVar, i11, fVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(h4.c cVar, h4.c cVar2, h4.c cVar3, int i11) {
        if (!h(i11, cVar, cVar3)) {
            return false;
        }
        if (h(i11, cVar2, cVar3) && !a(cVar3, cVar, cVar2, i11)) {
            return !a(cVar3, cVar2, cVar, i11) && i(i11, cVar3, cVar) < i(i11, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean h(int i11, h4.c cVar, h4.c cVar2) {
        if (i11 == 3) {
            float f11 = cVar2.f21382c;
            float f12 = cVar2.f21380a;
            float f13 = cVar.f21382c;
            return (f11 > f13 || f12 >= f13) && f12 > cVar.f21380a;
        }
        if (i11 == 4) {
            float f14 = cVar2.f21380a;
            float f15 = cVar2.f21382c;
            float f16 = cVar.f21380a;
            return (f14 < f16 || f15 <= f16) && f15 < cVar.f21382c;
        }
        if (i11 == 5) {
            float f17 = cVar2.f21383d;
            float f18 = cVar2.f21381b;
            float f19 = cVar.f21383d;
            return (f17 > f19 || f18 >= f19) && f18 > cVar.f21381b;
        }
        if (i11 != 6) {
            h2.b("This function should only be used for 2-D focus search");
            return false;
        }
        float f20 = cVar2.f21381b;
        float f21 = cVar2.f21383d;
        float f22 = cVar.f21381b;
        return (f20 < f22 || f21 <= f22) && f21 < cVar.f21383d;
    }

    public static final long i(int i11, h4.c cVar, h4.c cVar2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (i11 == 3) {
            f11 = cVar.f21380a;
            f12 = cVar2.f21382c;
        } else if (i11 == 4) {
            f11 = cVar2.f21380a;
            f12 = cVar.f21382c;
        } else if (i11 == 5) {
            f11 = cVar.f21381b;
            f12 = cVar2.f21383d;
        } else {
            if (i11 != 6) {
                h2.b("This function should only be used for 2-D focus search");
                return 0L;
            }
            f11 = cVar2.f21381b;
            f12 = cVar.f21383d;
        }
        float f17 = f11 - f12;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        long j9 = (long) f17;
        if (i11 == 3 || i11 == 4) {
            float f18 = cVar.f21381b;
            f13 = 2;
            f14 = ((cVar.f21383d - f18) / f13) + f18;
            f15 = cVar2.f21381b;
            f16 = cVar2.f21383d;
        } else {
            if (i11 != 5 && i11 != 6) {
                h2.b("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f19 = cVar.f21380a;
            f13 = 2;
            f14 = ((cVar.f21382c - f19) / f13) + f19;
            f15 = cVar2.f21380a;
            f16 = cVar2.f21382c;
        }
        long j11 = (long) (f14 - (((f16 - f15) / f13) + f15));
        return (j11 * j11) + (((long) 13) * j9 * j9);
    }

    public static final boolean j(int i11, c6.f fVar, g0 g0Var, h4.c cVar) {
        g0 g0VarD;
        o3.e eVar = new o3.e(new g0[16], 0);
        if (!g0Var.getNode().isAttached()) {
            y4.a.b("visitChildren called on an unattached node");
        }
        o3.e eVar2 = new o3.e(new b4.s[16], 0);
        b4.s child$ui = g0Var.getNode().getChild$ui();
        if (child$ui == null) {
            b5.m.a(eVar2, g0Var.getNode());
        } else {
            eVar2.b(child$ui);
        }
        while (true) {
            int i12 = eVar2.f31832c;
            if (i12 == 0) {
                break;
            }
            b4.s sVarB = (b4.s) eVar2.l(i12 - 1);
            if ((sVarB.getAggregateChildKindSet$ui() & 1024) == 0) {
                b5.m.a(eVar2, sVarB);
            } else {
                while (true) {
                    if (sVarB == null) {
                        break;
                    }
                    if ((sVarB.getKindSet$ui() & 1024) != 0) {
                        o3.e eVar3 = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g0) {
                                g0 g0Var2 = (g0) sVarB;
                                if (g0Var2.isAttached()) {
                                    eVar.b(g0Var2);
                                }
                            } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                int i13 = 0;
                                for (b4.s child$ui2 = ((b5.n) sVarB).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                                    if ((child$ui2.getKindSet$ui() & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            sVarB = child$ui2;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (sVarB != null) {
                                                eVar3.b(sVarB);
                                                sVarB = null;
                                            }
                                            eVar3.b(child$ui2);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            sVarB = b5.m.b(eVar3);
                        }
                    } else {
                        sVarB = sVarB.getChild$ui();
                    }
                }
            }
        }
        while (eVar.f31832c != 0 && (g0VarD = d(eVar, cVar, i11)) != null) {
            if (g0VarD.N0().f19974a) {
                return ((Boolean) fVar.invoke(g0VarD)).booleanValue();
            }
            if (f(i11, fVar, g0VarD, cVar)) {
                return true;
            }
            eVar.j(g0VarD);
        }
        return false;
    }

    public static final Boolean k(int i11, c6.f fVar, g0 g0Var, h4.c cVar) {
        b0 b0VarQ0 = g0Var.Q0();
        int[] iArr = n0.$EnumSwitchMapping$0;
        int i12 = iArr[b0VarQ0.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(e(g0Var, i11, fVar));
            }
            if (i12 == 4) {
                return g0Var.N0().f19974a ? (Boolean) fVar.invoke(g0Var) : cVar == null ? Boolean.valueOf(e(g0Var, i11, fVar)) : Boolean.valueOf(j(i11, fVar, g0Var, cVar));
            }
            e40.a.f();
            return null;
        }
        g0 g0VarG = d.g(g0Var);
        if (g0VarG == null) {
            h2.b("ActiveParent must have a focusedChild");
            return null;
        }
        int i13 = iArr[g0VarG.Q0().ordinal()];
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3) {
                if (cVar == null) {
                    cVar = d.c(g0VarG);
                }
                return Boolean.valueOf(f(i11, fVar, g0Var, cVar));
            }
            if (i13 != 4) {
                e40.a.f();
                return null;
            }
            h2.b("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean boolK = k(i11, fVar, g0VarG, cVar);
        if (!Intrinsics.areEqual(boolK, Boolean.FALSE)) {
            return boolK;
        }
        if (cVar == null) {
            if (g0VarG.Q0() != b0.ActiveParent) {
                h2.b("Searching for active node in inactive hierarchy");
                return null;
            }
            g0 g0VarB = d.b(g0VarG);
            if (g0VarB == null) {
                h2.b("ActiveParent must have a focusedChild");
                return null;
            }
            cVar = d.c(g0VarB);
        }
        return Boolean.valueOf(f(i11, fVar, g0Var, cVar));
    }
}
