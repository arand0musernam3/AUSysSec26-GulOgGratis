package j5;

import b5.l1;
import b5.l2;
import b5.m0;
import b5.s1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.s f24693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f24695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f24696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f24698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24699g;

    public t(b4.s sVar, boolean z11, m0 m0Var, n nVar) {
        this.f24693a = sVar;
        this.f24694b = z11;
        this.f24695c = m0Var;
        this.f24696d = nVar;
        this.f24699g = m0Var.f5866b;
    }

    public static /* synthetic */ List j(int i11, t tVar) {
        return tVar.i((i11 & 1) != 0 ? !tVar.f24694b : false, (i11 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
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
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final h4.c a(s1 s1Var) {
        ?? B;
        t tVarL = l();
        if (tVarL == null) {
            return h4.c.f21379e;
        }
        l1 l1Var = tVarL.f24695c.G;
        if ((l1Var.f5860f.getAggregateChildKindSet$ui() & 8) != 0) {
            loop0: for (b4.s child$ui = l1Var.f5860f; child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & 8) != 0) {
                    B = child$ui;
                    ?? eVar = 0;
                    while (B != 0) {
                        if (B instanceof l2) {
                            if (((l2) B).c()) {
                                break loop0;
                            }
                        } else if ((B.getKindSet$ui() & 8) != 0 && (B instanceof b5.n)) {
                            b4.s child$ui2 = ((b5.n) B).f5892p;
                            int i11 = 0;
                            B = B;
                            eVar = eVar;
                            while (child$ui2 != null) {
                                if ((child$ui2.getKindSet$ui() & 8) != 0) {
                                    i11++;
                                    eVar = eVar;
                                    if (i11 == 1) {
                                        B = child$ui2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new o3.e(new b4.s[16], 0);
                                        }
                                        if (B != 0) {
                                            eVar.b(B);
                                            B = 0;
                                        }
                                        eVar.b(child$ui2);
                                    }
                                }
                                child$ui2 = child$ui2.getChild$ui();
                                B = B;
                                eVar = eVar;
                            }
                            if (i11 == 1) {
                            }
                        }
                        B = b5.m.b(eVar);
                    }
                }
                if ((child$ui.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
            B = 0;
        } else {
            B = 0;
        }
        l2 l2Var = (l2) B;
        s1 s1VarE = l2Var != null ? b5.m.e(l2Var, 8) : null;
        return s1VarE == null ? tVarL.a(s1Var) : s1VarE.v(s1Var, true);
    }

    public final t b(j jVar, Function1 function1) {
        n nVar = new n();
        nVar.f24684c = false;
        nVar.f24685d = false;
        function1.invoke(nVar);
        t tVar = new t(new s(function1), false, new m0(true, this.f24699g + (jVar != null ? 1000000000 : 2000000000)), nVar);
        tVar.f24697e = true;
        tVar.f24698f = this;
        return tVar;
    }

    public final void c(m0 m0Var, ArrayList arrayList) {
        o3.e eVarZ = m0Var.z();
        Object[] objArr = eVarZ.f31830a;
        int i11 = eVarZ.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if (m0Var2.I() && !m0Var2.T) {
                if (m0Var2.G.d(8)) {
                    arrayList.add(w.a(m0Var2, this.f24694b));
                } else {
                    c(m0Var2, arrayList);
                }
            }
        }
    }

    public final s1 d() {
        if (!this.f24697e) {
            l2 l2VarF = f();
            return l2VarF != null ? b5.m.e(l2VarF, 8) : this.f24695c.G.f5857c;
        }
        t tVarL = l();
        if (tVarL != null) {
            return tVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            t tVar = (t) arrayList.get(size2);
            if (tVar.m()) {
                arrayList2.add(tVar);
            } else if (!tVar.f24696d.f24685d) {
                tVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final l2 f() {
        ?? B;
        boolean z11 = this.f24696d.f24684c;
        ?? r42 = 0;
        r42 = 0;
        r42 = 0;
        r42 = 0;
        m0 m0Var = this.f24695c;
        if (z11) {
            l1 l1Var = m0Var.G;
            if ((l1Var.f5860f.getAggregateChildKindSet$ui() & 8) != 0) {
                b4.s child$ui = l1Var.f5860f;
                B = 0;
                while (child$ui != null) {
                    if ((child$ui.getKindSet$ui() & 8) != 0) {
                        ?? B2 = child$ui;
                        ?? eVar = 0;
                        while (B2 != 0) {
                            if (B2 instanceof l2) {
                                l2 l2Var = (l2) B2;
                                if (l2Var.c()) {
                                    if (l2Var.F0()) {
                                        return l2Var;
                                    }
                                    if (B == 0) {
                                        B = l2Var;
                                    }
                                }
                            } else if ((B2.getKindSet$ui() & 8) != 0 && (B2 instanceof b5.n)) {
                                b4.s child$ui2 = ((b5.n) B2).f5892p;
                                int i11 = 0;
                                B2 = B2;
                                eVar = eVar;
                                while (child$ui2 != null) {
                                    if ((child$ui2.getKindSet$ui() & 8) != 0) {
                                        i11++;
                                        eVar = eVar;
                                        if (i11 == 1) {
                                            B2 = child$ui2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B2 != 0) {
                                                eVar.b(B2);
                                                B2 = 0;
                                            }
                                            eVar.b(child$ui2);
                                        }
                                    }
                                    child$ui2 = child$ui2.getChild$ui();
                                    B2 = B2;
                                    eVar = eVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            B2 = b5.m.b(eVar);
                        }
                    }
                    if ((child$ui.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                    child$ui = child$ui.getChild$ui();
                    B = B;
                }
                r42 = B;
            }
        } else {
            l1 l1Var2 = m0Var.G;
            if ((l1Var2.f5860f.getAggregateChildKindSet$ui() & 8) != 0) {
                loop3: for (b4.s child$ui3 = l1Var2.f5860f; child$ui3 != null; child$ui3 = child$ui3.getChild$ui()) {
                    if ((child$ui3.getKindSet$ui() & 8) != 0) {
                        B = child$ui3;
                        ?? eVar2 = 0;
                        while (B != 0) {
                            if (B instanceof l2) {
                                if (((l2) B).c()) {
                                    r42 = B;
                                }
                            } else if ((B.getKindSet$ui() & 8) != 0 && (B instanceof b5.n)) {
                                b4.s child$ui4 = ((b5.n) B).f5892p;
                                int i12 = 0;
                                B = B;
                                eVar2 = eVar2;
                                while (child$ui4 != null) {
                                    if ((child$ui4.getKindSet$ui() & 8) != 0) {
                                        i12++;
                                        eVar2 = eVar2;
                                        if (i12 == 1) {
                                            B = child$ui4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B != 0) {
                                                eVar2.b(B);
                                                B = 0;
                                            }
                                            eVar2.b(child$ui4);
                                        }
                                    }
                                    child$ui4 = child$ui4.getChild$ui();
                                    B = B;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            B = b5.m.b(eVar2);
                        }
                    }
                    if ((child$ui3.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                }
            }
        }
        return (l2) r42;
    }

    public final h4.c g() {
        s1 s1VarD = d();
        if (s1VarD != null) {
            if (!s1VarD.n()) {
                s1VarD = null;
            }
            if (s1VarD != null) {
                return z4.c0.i(s1VarD).v(s1VarD, true);
            }
        }
        return h4.c.f21379e;
    }

    public final h4.c h() {
        s1 s1VarD = d();
        if (s1VarD != null) {
            if (!s1VarD.n()) {
                s1VarD = null;
            }
            if (s1VarD != null) {
                return z4.c0.f(s1VarD, true);
            }
        }
        return h4.c.f21379e;
    }

    public final List i(boolean z11, boolean z12) {
        if (!z11 && this.f24696d.f24685d) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m()) {
            return p(arrayList, z12);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final n k() {
        boolean zM = m();
        n nVar = this.f24696d;
        if (!zM) {
            return nVar;
        }
        n nVarD = nVar.d();
        o(new ArrayList(), nVarD);
        return nVarD;
    }

    public final t l() {
        m0 m0VarW;
        t tVar = this.f24698f;
        if (tVar != null) {
            return tVar;
        }
        m0 m0Var = this.f24695c;
        boolean z11 = this.f24694b;
        if (z11) {
            m0VarW = m0Var.w();
            while (m0VarW != null) {
                n nVarY = m0VarW.y();
                if (nVarY != null && nVarY.f24684c) {
                    break;
                }
                m0VarW = m0VarW.w();
            }
            m0VarW = null;
        } else {
            m0VarW = null;
        }
        if (m0VarW == null) {
            m0 m0VarW2 = m0Var.w();
            while (true) {
                if (m0VarW2 == null) {
                    m0VarW = null;
                    break;
                }
                if (m0VarW2.G.d(8)) {
                    m0VarW = m0VarW2;
                    break;
                }
                m0VarW2 = m0VarW2.w();
            }
        }
        if (m0VarW == null) {
            return null;
        }
        return w.a(m0VarW, z11);
    }

    public final boolean m() {
        return this.f24694b && this.f24696d.f24684c;
    }

    public final boolean n() {
        if (this.f24697e || !j(4, this).isEmpty()) {
            return false;
        }
        m0 m0VarW = this.f24695c.w();
        while (true) {
            if (m0VarW == null) {
                m0VarW = null;
                break;
            }
            n nVarY = m0VarW.y();
            if (nVarY != null && nVarY.f24684c) {
                break;
            }
            m0VarW = m0VarW.w();
        }
        return m0VarW == null;
    }

    public final void o(ArrayList arrayList, n nVar) {
        if (this.f24696d.f24685d) {
            return;
        }
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            t tVar = (t) arrayList.get(size2);
            if (!tVar.m()) {
                nVar.g(tVar.f24696d);
                tVar.o(arrayList, nVar);
            }
        }
    }

    public final List p(ArrayList arrayList, boolean z11) {
        if (this.f24697e) {
            return n0.f26529a;
        }
        c(this.f24695c, arrayList);
        if (z11) {
            a0 a0Var = x.f24730y;
            n nVar = this.f24696d;
            j jVar = (j) w.d(nVar, a0Var);
            if (jVar != null && nVar.f24684c && !arrayList.isEmpty()) {
                arrayList.add(b(jVar, new androidx.fragment.app.r(jVar, 22)));
            }
            a0 a0Var2 = x.f24707a;
            if (nVar.f24682a.b(a0Var2) && !arrayList.isEmpty() && nVar.f24684c) {
                List list = (List) w.d(nVar, a0Var2);
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new androidx.fragment.app.r(str, 23)));
                }
            }
        }
        return arrayList;
    }
}
