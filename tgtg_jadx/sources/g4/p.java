package g4;

import android.view.View;
import b5.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5.y f19962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5.y f19963b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f19965d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1.l0 f19967f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g0 f19969h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f19964c = new g0(2, 14, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f19966e = new n(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1.o0 f19968g = new q1.o0(1);

    public p(c5.y yVar, c5.y yVar2) {
        this.f19962a = yVar;
        this.f19963b = yVar2;
        this.f19965d = new i(this, yVar2);
    }

    public final void b(boolean z11) {
        d(8, z11, true);
    }

    public final boolean c(boolean z11) {
        l1 l1Var;
        if (h() != null) {
            g0 g0VarH = h();
            k(null);
            if (g0VarH != null) {
                g0VarH.M0(b0.Active, b0.Inactive);
                if (!g0VarH.getNode().isAttached()) {
                    y4.a.b("visitAncestors called on an unattached node");
                }
                b4.s parent$ui = g0VarH.getNode().getParent$ui();
                b5.m0 m0VarG = b5.m.g(g0VarH);
                while (m0VarG != null) {
                    if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                o3.e eVar = null;
                                b4.s sVarB = parent$ui;
                                while (sVarB != null) {
                                    if (sVarB instanceof g0) {
                                        ((g0) sVarB).M0(b0.ActiveParent, b0.Inactive);
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
        }
        return true;
    }

    public final boolean d(int i11, boolean z11, boolean z12) {
        boolean z13 = true;
        if (z11) {
            c(z11);
        } else {
            int i12 = m.$EnumSwitchMapping$0[i0.b(this.f19964c, i11).ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                z13 = false;
            } else {
                if (i12 != 4) {
                    e40.a.f();
                    return false;
                }
                c(z11);
            }
        }
        if (z13 && z12) {
            e();
        }
        return z13;
    }

    public final void e() {
        c5.y yVar = this.f19962a;
        if (yVar.isFocused() || yVar.hasFocus()) {
            yVar.clearFocus();
        } else if (yVar.hasFocus()) {
            View viewFindFocus = yVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            yVar.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x0028, B:14:0x002c, B:15:0x0034, B:27:0x0050, B:30:0x005b, B:32:0x0065, B:33:0x006a, B:35:0x0076, B:37:0x007d, B:39:0x0085, B:43:0x008f, B:141:0x01cf, B:143:0x01d9, B:144:0x01dc, B:146:0x01eb, B:149:0x01f9, B:153:0x0205, B:156:0x020b, B:157:0x0210, B:177:0x0250, B:158:0x0214, B:160:0x021c, B:162:0x0220, B:164:0x0228, B:166:0x0230, B:170:0x0238, B:172:0x0241, B:173:0x0245, B:174:0x0248, B:178:0x0255, B:179:0x025a, B:181:0x0260, B:183:0x0264, B:186:0x026b, B:188:0x0273, B:195:0x028a, B:197:0x0291, B:199:0x0295, B:222:0x02dd, B:203:0x02a1, B:205:0x02a9, B:207:0x02ad, B:209:0x02b5, B:211:0x02bd, B:215:0x02c5, B:217:0x02ce, B:218:0x02d2, B:219:0x02d5, B:223:0x02e2, B:227:0x02f2, B:229:0x02f9, B:231:0x02fd, B:254:0x0345, B:235:0x0309, B:237:0x0311, B:239:0x0315, B:241:0x031d, B:243:0x0325, B:247:0x032d, B:249:0x0336, B:250:0x033a, B:251:0x033d, B:256:0x034c, B:258:0x0353, B:47:0x0099, B:49:0x00a3, B:50:0x00a6, B:52:0x00b0, B:55:0x00be, B:59:0x00ca, B:90:0x0125, B:92:0x0129, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:68:0x00e3, B:70:0x00eb, B:74:0x00f3, B:76:0x00fc, B:77:0x0100, B:78:0x0103, B:81:0x010b, B:82:0x0110, B:83:0x0115, B:85:0x011b, B:87:0x011f, B:93:0x0131, B:95:0x013b, B:96:0x013e, B:98:0x014c, B:101:0x015a, B:105:0x0166, B:136:0x01c1, B:138:0x01c5, B:108:0x016b, B:110:0x0173, B:112:0x0177, B:114:0x017f, B:116:0x0187, B:120:0x018f, B:122:0x0198, B:123:0x019c, B:124:0x019f, B:127:0x01a7, B:128:0x01ac, B:129:0x01b1, B:131:0x01b7, B:133:0x01bb, B:17:0x003a, B:19:0x003e, B:21:0x0044, B:23:0x0048), top: B:267:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r15v5, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r15v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v38, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r14, kotlin.jvm.functions.Function0 r15) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.p.f(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0134, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean g(int r20, h4.c r21, kotlin.jvm.functions.Function1 r22) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.p.g(int, h4.c, kotlin.jvm.functions.Function1):java.lang.Boolean");
    }

    public final g0 h() {
        g0 g0Var = this.f19969h;
        if (g0Var == null || !g0Var.isAttached()) {
            return null;
        }
        return this.f19969h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    public final boolean i(int i11, boolean z11) {
        g0 g0VarH = h();
        c5.y yVar = this.f19962a;
        if (g0VarH == null || !g0VarH.f19939o || !yVar.w(i11)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = Boolean.FALSE;
            g0 g0VarH2 = h();
            Boolean boolG = g(i11, yVar.getEmbeddedViewFocusRect(), new o(objectRef, i11));
            if (!Intrinsics.areEqual(boolG, Boolean.TRUE) || g0VarH2 == h()) {
                if (boolG != null && objectRef.element != 0) {
                    if (!boolG.booleanValue() || !((Boolean) objectRef.element).booleanValue()) {
                        if ((i11 == 1 || i11 == 2) && z11 && d(i11, false, false)) {
                            Boolean boolG2 = g(i11, null, new c5.v(i11, 3));
                            if (boolG2 != null ? boolG2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i11) {
        if (!d(i11, false, false)) {
            return false;
        }
        Boolean boolG = g(i11, null, new c5.v(i11, 2));
        boolean zBooleanValue = boolG != null ? boolG.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public final void k(g0 g0Var) {
        g0 g0Var2 = this.f19969h;
        this.f19969h = g0Var;
        q1.o0 o0Var = this.f19968g;
        Object[] objArr = o0Var.f35721a;
        int i11 = o0Var.f35722b;
        for (int i12 = 0; i12 < i11; i12++) {
            ((j) objArr[i12]).a(g0Var2, g0Var);
        }
    }
}
