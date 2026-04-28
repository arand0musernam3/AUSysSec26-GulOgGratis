package b5;

import java.util.HashSet;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f5855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f5856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f5857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1 f5858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n2 f5859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b4.s f5860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o3.e f5861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o3.e f5862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o3.e f5863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j1 f5864j;

    public l1(m0 m0Var) {
        this.f5855a = m0Var;
        k1 k1Var = new k1();
        k1Var.setAggregateChildKindSet$ui(-1);
        this.f5856b = k1Var;
        x xVar = new x(m0Var);
        this.f5857c = xVar;
        this.f5858d = xVar;
        n2 n2Var = xVar.Y;
        this.f5859e = n2Var;
        this.f5860f = n2Var;
        this.f5863i = new o3.e(new b4.t[16], 0);
    }

    public static final void a(l1 l1Var, b4.s sVar, s1 s1Var) {
        for (b4.s parent$ui = sVar.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (parent$ui == l1Var.f5856b) {
                m0 m0VarW = l1Var.f5855a.w();
                s1Var.f5968r = m0VarW != null ? m0VarW.G.f5857c : null;
                l1Var.f5858d = s1Var;
                return;
            } else {
                if ((parent$ui.getKindSet$ui() & 2) != 0) {
                    return;
                }
                parent$ui.updateCoordinator$ui(s1Var);
            }
        }
    }

    public static b4.s b(b4.r rVar, b4.s sVar) {
        b4.s sVarCreate;
        if (rVar instanceof h1) {
            sVarCreate = ((h1) rVar).create();
            sVarCreate.setKindSet$ui(t1.g(sVarCreate));
        } else {
            c cVar = new c();
            cVar.setKindSet$ui(t1.e(rVar));
            cVar.f5760o = rVar;
            cVar.f5761p = new HashSet();
            sVarCreate = cVar;
        }
        if (sVarCreate.isAttached()) {
            y4.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        sVarCreate.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        b4.s child$ui = sVar.getChild$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(sVarCreate);
            sVarCreate.setChild$ui(child$ui);
        }
        sVar.setChild$ui(sVarCreate);
        sVarCreate.setParent$ui(sVar);
        return sVarCreate;
    }

    public static b4.s c(b4.s sVar) {
        if (sVar.isAttached()) {
            q1.n0 n0Var = t1.f5987a;
            if (!sVar.isAttached()) {
                y4.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            t1.b(sVar, -1, 2);
            sVar.runDetachLifecycle$ui();
            sVar.markAsDetached$ui();
        }
        b4.s child$ui = sVar.getChild$ui();
        b4.s parent$ui = sVar.getParent$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(parent$ui);
            sVar.setChild$ui(null);
        }
        if (parent$ui != null) {
            parent$ui.setChild$ui(child$ui);
            sVar.setParent$ui(null);
        }
        parent$ui.getClass();
        return parent$ui;
    }

    public static void h(b4.r rVar, b4.r rVar2, b4.s sVar) {
        if ((rVar instanceof h1) && (rVar2 instanceof h1)) {
            sVar.getClass();
            ((h1) rVar2).update(sVar);
            if (sVar.isAttached()) {
                t1.d(sVar);
                return;
            } else {
                sVar.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(sVar instanceof c)) {
            y4.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar = (c) sVar;
        if (cVar.isAttached()) {
            cVar.M0();
        }
        cVar.f5760o = rVar2;
        cVar.setKindSet$ui(t1.e(rVar2));
        if (cVar.isAttached()) {
            cVar.L0(false);
        }
        if (sVar.isAttached()) {
            t1.d(sVar);
        } else {
            sVar.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    public final boolean d(int i11) {
        return (i11 & this.f5860f.getAggregateChildKindSet$ui()) != 0;
    }

    public final void e() {
        for (b4.s child$ui = this.f5860f; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.runAttachLifecycle$ui();
            if (child$ui.getInsertedNodeAwaitingAttachForInvalidation$ui()) {
                t1.a(child$ui);
            }
            if (child$ui.getUpdatedNodeAwaitingAttachForInvalidation$ui()) {
                t1.d(child$ui);
            }
            child$ui.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            child$ui.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0266, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026c, code lost:
    
        r1 = r1 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0158, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        if (r13 > r1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016d, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        r22 = r10 - ((r5 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        if (r1 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        if (r14 <= r7) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        if (r11 <= r15) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        if (r6.b(r14 - 1, r27 - 1) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bb, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        if (r24 == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c5, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
    
        if (r11 < r12) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c9, code lost:
    
        if (r11 > r1) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cf, code lost:
    
        if (r16[r17 + r11] < r14) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, o3.e r33, o3.e r34, b4.s r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.l1.f(int, o3.e, o3.e, b4.s, boolean):void");
    }

    public final void g() {
        m0 m0Var;
        e0 e0Var;
        c2 c2Var;
        b4.s parent$ui = this.f5859e.getParent$ui();
        s1 s1Var = this.f5857c;
        while (true) {
            m0Var = this.f5855a;
            if (parent$ui == null) {
                break;
            }
            c0 c0VarC = m.c(parent$ui);
            if (c0VarC != null) {
                if (parent$ui.getCoordinator$ui() != null) {
                    s1 coordinator$ui = parent$ui.getCoordinator$ui();
                    coordinator$ui.getClass();
                    e0Var = (e0) coordinator$ui;
                    c0 c0Var = e0Var.Y;
                    e0Var.F1(c0VarC);
                    if (c0Var != parent$ui && (c2Var = e0Var.M) != null) {
                        ((c5.f2) c2Var).c();
                    }
                } else {
                    e0 e0Var2 = new e0(m0Var, c0VarC);
                    parent$ui.updateCoordinator$ui(e0Var2);
                    e0Var = e0Var2;
                }
                s1Var.f5968r = e0Var;
                e0Var.f5967q = s1Var;
                s1Var = e0Var;
            } else {
                parent$ui.updateCoordinator$ui(s1Var);
            }
            parent$ui = parent$ui.getParent$ui();
        }
        m0 m0VarW = m0Var.w();
        s1Var.f5968r = m0VarW != null ? m0VarW.G.f5857c : null;
        this.f5858d = s1Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        b4.s child$ui = this.f5860f;
        n2 n2Var = this.f5859e;
        if (child$ui == n2Var) {
            sb2.append("]");
        } else {
            while (true) {
                if (child$ui == null || child$ui == n2Var) {
                    break;
                }
                sb2.append(String.valueOf(child$ui));
                if (child$ui.getChild$ui() == n2Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                child$ui = child$ui.getChild$ui();
            }
        }
        return sb2.toString();
    }
}
