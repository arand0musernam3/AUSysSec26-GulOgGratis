package a5;

import b4.s;
import b5.l;
import b5.l1;
import b5.m;
import b5.m0;
import b5.n;
import kotlin.jvm.functions.Function0;
import o3.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends l {
    default a U() {
        return a.f815a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a5.c, b5.l] */
    /* JADX WARN: Type inference failed for: r2v10, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    /* JADX WARN: Type inference failed for: r5v6 */
    default Object b0(se.b bVar) {
        l1 l1Var;
        s sVar = (s) this;
        if (!sVar.getNode().isAttached()) {
            y4.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!sVar.getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        s parent$ui = sVar.getNode().getParent$ui();
        m0 m0VarG = m.g(this);
        while (m0VarG != null) {
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 32) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 32) != 0) {
                        ?? B = parent$ui;
                        ?? eVar = 0;
                        while (B != 0) {
                            if (B instanceof c) {
                                c cVar = (c) B;
                                if (cVar.U().a()) {
                                    cVar.U().b();
                                    throw null;
                                }
                            } else if ((B.getKindSet$ui() & 32) != 0 && (B instanceof n)) {
                                s child$ui = ((n) B).f5892p;
                                int i11 = 0;
                                B = B;
                                eVar = eVar;
                                while (child$ui != null) {
                                    if ((child$ui.getKindSet$ui() & 32) != 0) {
                                        i11++;
                                        eVar = eVar;
                                        if (i11 == 1) {
                                            B = child$ui;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new e(new s[16], 0);
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
                            B = m.b(eVar);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
        return ((Function0) bVar.f39010b).invoke();
    }
}
