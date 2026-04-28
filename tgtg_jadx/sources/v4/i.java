package v4;

import b4.s;
import b5.l1;
import b5.m;
import b5.m0;
import b5.n;
import b5.o;
import b5.q2;
import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s implements q2, a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f41992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f41993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f41994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f41995r;

    public i(a aVar, d dVar) {
        this.f41992o = aVar;
        this.f41993p = dVar == null ? new d() : dVar;
        this.f41995r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // v4.a
    public final long J(int i11, long j9) {
        l1 l1Var;
        i iVar = null;
        q2 q2Var = null;
        iVar = null;
        if (isAttached() && isAttached()) {
            if (!getNode().isAttached()) {
                y4.a.b("visitAncestors called on an unattached node");
            }
            s parent$ui = getNode().getParent$ui();
            m0 m0VarG = m.g(this);
            loop0: while (true) {
                if (m0VarG == null) {
                    break;
                }
                if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                            ?? B = parent$ui;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof q2) {
                                    q2 q2Var2 = (q2) B;
                                    if (Intrinsics.areEqual(g(), q2Var2.g()) && i.class == q2Var2.getClass()) {
                                        q2Var = q2Var2;
                                        break loop0;
                                    }
                                } else if ((B.getKindSet$ui() & 262144) != 0 && (B instanceof n)) {
                                    s child$ui = ((n) B).f5892p;
                                    int i12 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 262144) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                B = child$ui;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new s[16], 0);
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
                                B = m.b(eVar);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                m0VarG = m0VarG.w();
                parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
            }
            iVar = (i) q2Var;
        }
        long J = iVar != null ? iVar.J(i11, j9) : 0L;
        return h4.b.f(J, this.f41992o.J(i11, h4.b.e(j9, J)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
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
    /* JADX WARN: Type inference failed for: r7v7 */
    public final b0 L0() {
        i iVar;
        q2 q2Var;
        l1 l1Var;
        if (isAttached()) {
            if (!getNode().isAttached()) {
                y4.a.b("visitAncestors called on an unattached node");
            }
            s parent$ui = getNode().getParent$ui();
            m0 m0VarG = m.g(this);
            loop0: while (true) {
                if (m0VarG == null) {
                    q2Var = null;
                    break;
                }
                if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                            ?? B = parent$ui;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof q2) {
                                    q2Var = (q2) B;
                                    if (Intrinsics.areEqual(g(), q2Var.g()) && i.class == q2Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((B.getKindSet$ui() & 262144) != 0 && (B instanceof n)) {
                                    s child$ui = ((n) B).f5892p;
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
                                                    eVar = new o3.e(new s[16], 0);
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
            iVar = (i) q2Var;
        } else {
            iVar = null;
        }
        b0 b0VarL0 = iVar != null ? iVar.L0() : null;
        if (b0VarL0 != null && f0.y(b0VarL0)) {
            return b0VarL0;
        }
        b0 b0Var = this.f41993p.f41982d;
        if (b0Var != null) {
            return b0Var;
        }
        h2.b("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r7v15 */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r21, long r23, x70.c r25) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.i.V(long, long, x70.c):java.lang.Object");
    }

    @Override // b5.q2
    public final Object g() {
        return this.f41995r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [v4.i] */
    /* JADX WARN: Type inference failed for: r3v10, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        l1 l1Var;
        long jO0 = this.f41992o.o0(i11, j9, j11);
        q2 q2Var = null;
        if (isAttached() && isAttached()) {
            if (!getNode().isAttached()) {
                y4.a.b("visitAncestors called on an unattached node");
            }
            s parent$ui = getNode().getParent$ui();
            m0 m0VarG = m.g(this);
            loop0: while (true) {
                if (m0VarG == null) {
                    break;
                }
                if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                            ?? B = parent$ui;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof q2) {
                                    q2 q2Var2 = (q2) B;
                                    if (Intrinsics.areEqual(g(), q2Var2.g()) && i.class == q2Var2.getClass()) {
                                        q2Var = q2Var2;
                                        break loop0;
                                    }
                                } else if ((B.getKindSet$ui() & 262144) != 0 && (B instanceof n)) {
                                    s child$ui = ((n) B).f5892p;
                                    int i12 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 262144) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                B = child$ui;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new s[16], 0);
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
                                B = m.b(eVar);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                m0VarG = m0VarG.w();
                parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
            }
            q2Var = (i) q2Var;
        }
        ?? r02 = q2Var;
        return h4.b.f(jO0, r02 != 0 ? r02.o0(i11, h4.b.f(j9, jO0), h4.b.e(j11, jO0)) : 0L);
    }

    @Override // b4.s
    public final void onAttach() {
        d dVar = this.f41993p;
        dVar.f41979a = this;
        dVar.f41980b = null;
        this.f41994q = null;
        dVar.f41981c = new ky.i(this, 19);
        this.f41993p.f41982d = getCoroutineScope();
    }

    @Override // b4.s
    public final void onDetach() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        o.p(this, new j(objectRef));
        i iVar = (i) ((q2) objectRef.element);
        this.f41994q = iVar;
        d dVar = this.f41993p;
        dVar.f41980b = iVar;
        if (dVar.f41979a == this) {
            dVar.f41979a = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
    
        if (r3 == r5) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v10, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r18, x70.c r20) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.i.q(long, x70.c):java.lang.Object");
    }
}
