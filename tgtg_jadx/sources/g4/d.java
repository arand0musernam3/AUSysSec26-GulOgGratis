package g4;

import b5.s1;
import com.braze.h2;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(g4.g0 r9, c6.f r10) {
        /*
            g4.b0 r0 = r9.Q0()
            int[] r1 = g4.l0.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L40
            if (r0 == r5) goto L3b
            if (r0 == r3) goto L3b
            if (r0 != r2) goto L36
            boolean r0 = j(r9, r10)
            if (r0 != 0) goto L89
            g4.t r0 = r9.N0()
            boolean r0 = r0.f19974a
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L88
            goto L89
        L36:
            e40.a.f()
        L39:
            r9 = 0
            return r9
        L3b:
            boolean r9 = j(r9, r10)
            return r9
        L40:
            g4.g0 r0 = g(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L8a
            g4.b0 r8 = r0.Q0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L67
            if (r1 == r5) goto L62
            if (r1 == r3) goto L62
            if (r1 == r2) goto L5e
            e40.a.f()
            goto L39
        L5e:
            com.braze.h2.b(r7)
            goto L39
        L62:
            boolean r9 = f(r9, r0, r5, r10)
            return r9
        L67:
            boolean r1 = a(r0, r10)
            if (r1 != 0) goto L89
            boolean r9 = f(r9, r0, r5, r10)
            if (r9 != 0) goto L89
            g4.t r9 = r0.N0()
            boolean r9 = r9.f19974a
            if (r9 == 0) goto L88
            java.lang.Object r9 = r10.invoke(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L88
            goto L89
        L88:
            return r4
        L89:
            return r6
        L8a:
            com.braze.h2.b(r7)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.a(g4.g0, c6.f):boolean");
    }

    public static final g0 b(g0 g0Var) {
        g0 g0VarH = ((p) ((c5.y) b5.m.h(g0Var)).getFocusOwner()).h();
        if (g0VarH == null || !g0VarH.isAttached()) {
            return null;
        }
        return g0VarH;
    }

    public static final h4.c c(g0 g0Var) {
        s1 coordinator$ui;
        boolean zIsAttached = g0Var.isAttached();
        h4.c cVar = h4.c.f21379e;
        if (zIsAttached && (coordinator$ui = g0Var.getCoordinator$ui()) != null) {
            z4.z zVarI = z4.c0.i(coordinator$ui);
            if (!zVarI.n()) {
                zVarI = null;
            }
            if (zVarI != null) {
                return g0Var.O0(zVarI);
            }
        }
        return cVar;
    }

    public static final b4.t d(b4.t tVar, v vVar) {
        return tVar.then(new w(vVar));
    }

    public static final boolean e(g0 g0Var, c6.f fVar) {
        int i11 = l0.$EnumSwitchMapping$0[g0Var.Q0().ordinal()];
        if (i11 == 1) {
            g0 g0VarG = g(g0Var);
            if (g0VarG != null) {
                return e(g0VarG, fVar) || f(g0Var, g0VarG, 1, fVar);
            }
            h2.b("ActiveParent must have a focusedChild");
            return false;
        }
        if (i11 == 2 || i11 == 3) {
            return k(g0Var, fVar);
        }
        if (i11 == 4) {
            return g0Var.N0().f19974a ? ((Boolean) fVar.invoke(g0Var)).booleanValue() : k(g0Var, fVar);
        }
        e40.a.f();
        return false;
    }

    public static final boolean f(g0 g0Var, g0 g0Var2, int i11, c6.f fVar) {
        if (m(g0Var, g0Var2, i11, fVar)) {
            return true;
        }
        Boolean bool = (Boolean) l(g0Var, i11, new m0(((p) ((c5.y) b5.m.h(g0Var)).getFocusOwner()).h(), g0Var, g0Var2, i11, fVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g4.g0 g(g4.g0 r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.g(g4.g0):g4.g0");
    }

    public static final boolean h(g0 g0Var) {
        b5.m0 m0Var;
        s1 coordinator$ui;
        b5.m0 m0Var2;
        s1 coordinator$ui2 = g0Var.getCoordinator$ui();
        return (coordinator$ui2 == null || (m0Var = coordinator$ui2.f5966p) == null || !m0Var.J() || (coordinator$ui = g0Var.getCoordinator$ui()) == null || (m0Var2 = coordinator$ui.f5966p) == null || !m0Var2.I()) ? false : true;
    }

    public static final b4.t i(b4.t tVar, Function1 function1) {
        return tVar.then(new c(function1));
    }

    public static final boolean j(g0 g0Var, c6.f fVar) {
        Object[] objArr = new g0[16];
        if (!g0Var.getNode().isAttached()) {
            y4.a.b("visitChildren called on an unattached node");
        }
        o3.e eVar = new o3.e(new b4.s[16], 0);
        b4.s child$ui = g0Var.getNode().getChild$ui();
        if (child$ui == null) {
            b5.m.a(eVar, g0Var.getNode());
        } else {
            eVar.b(child$ui);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar.f31832c;
            if (i12 == 0) {
                break;
            }
            b4.s sVarB = (b4.s) eVar.l(i12 - 1);
            if ((sVarB.getAggregateChildKindSet$ui() & 1024) == 0) {
                b5.m.a(eVar, sVarB);
            } else {
                while (true) {
                    if (sVarB == null) {
                        break;
                    }
                    if ((sVarB.getKindSet$ui() & 1024) != 0) {
                        o3.e eVar2 = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g0) {
                                g0 g0Var2 = (g0) sVarB;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = g0Var2;
                                i11 = i13;
                            } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                int i14 = 0;
                                for (b4.s child$ui2 = ((b5.n) sVarB).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
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
                            sVarB = b5.m.b(eVar2);
                        }
                    } else {
                        sVarB = sVarB.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i11, k0.f19952a);
        int i15 = i11 - 1;
        if (i15 < objArr.length) {
            while (i15 >= 0) {
                g0 g0Var3 = (g0) objArr[i15];
                if (h(g0Var3) && a(g0Var3, fVar)) {
                    return true;
                }
                i15--;
            }
        }
        return false;
    }

    public static final boolean k(g0 g0Var, c6.f fVar) {
        Object[] objArr = new g0[16];
        if (!g0Var.getNode().isAttached()) {
            y4.a.b("visitChildren called on an unattached node");
        }
        o3.e eVar = new o3.e(new b4.s[16], 0);
        b4.s child$ui = g0Var.getNode().getChild$ui();
        if (child$ui == null) {
            b5.m.a(eVar, g0Var.getNode());
        } else {
            eVar.b(child$ui);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar.f31832c;
            if (i12 == 0) {
                break;
            }
            b4.s sVarB = (b4.s) eVar.l(i12 - 1);
            if ((sVarB.getAggregateChildKindSet$ui() & 1024) == 0) {
                b5.m.a(eVar, sVarB);
            } else {
                while (true) {
                    if (sVarB == null) {
                        break;
                    }
                    if ((sVarB.getKindSet$ui() & 1024) != 0) {
                        o3.e eVar2 = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g0) {
                                g0 g0Var2 = (g0) sVarB;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = g0Var2;
                                i11 = i13;
                            } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                int i14 = 0;
                                for (b4.s child$ui2 = ((b5.n) sVarB).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
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
                            sVarB = b5.m.b(eVar2);
                        }
                    } else {
                        sVarB = sVarB.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i11, k0.f19952a);
        for (int i15 = 0; i15 < i11; i15++) {
            g0 g0Var3 = (g0) objArr[i15];
            if (h(g0Var3) && e(g0Var3, fVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[PHI: r0
      0x00b5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00b3, B:57:0x00b8, B:60:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, h2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, h2.n, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(g4.g0 r10, int r11, kotlin.jvm.functions.Function1 r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.l(g4.g0, int, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c3 A[EDGE_INSN: B:157:0x01c3->B:127:0x01c3 BREAK  A[LOOP:5: B:89:0x014c->B:162:0x014c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m(g4.g0 r12, g4.g0 r13, int r14, c6.f r15) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.m(g4.g0, g4.g0, int, c6.f):boolean");
    }
}
