package b5;

import androidx.compose.ui.node.Owner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final void a(o3.e eVar, b4.s sVar) {
        o3.e eVarA = g(sVar).A();
        int i11 = eVarA.f31832c - 1;
        Object[] objArr = eVarA.f31830a;
        if (i11 < objArr.length) {
            while (i11 >= 0) {
                eVar.b(((m0) objArr[i11]).G.f5860f);
                i11--;
            }
        }
    }

    public static final b4.s b(o3.e eVar) {
        int i11;
        if (eVar == null || (i11 = eVar.f31832c) == 0) {
            return null;
        }
        return (b4.s) eVar.l(i11 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c0 c(b4.s sVar) {
        if ((sVar.getKindSet$ui() & 2) != 0) {
            if (sVar instanceof c0) {
                return (c0) sVar;
            }
            if (sVar instanceof n) {
                b4.s child$ui = ((n) sVar).f5892p;
                while (child$ui != 0) {
                    if (child$ui instanceof c0) {
                        return (c0) child$ui;
                    }
                    child$ui = (!(child$ui instanceof n) || (child$ui.getKindSet$ui() & 2) == 0) ? child$ui.getChild$ui() : ((n) child$ui).f5892p;
                }
            }
        }
        return null;
    }

    public static final void d(l lVar) {
        c4.d dVar;
        m0 m0VarG = g(lVar);
        if (m0VarG.f5884u || (dVar = ((c5.y) p0.a(m0VarG)).L) == null) {
            return;
        }
        dVar.f7028d.f25958a.v(m0VarG.f5866b, new c4.c(dVar, m0VarG));
    }

    public static final s1 e(l lVar, int i11) {
        s1 coordinator$ui = lVar.getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        if (coordinator$ui.d1() != lVar || !t1.h(i11)) {
            return coordinator$ui;
        }
        s1 s1Var = coordinator$ui.f5967q;
        s1Var.getClass();
        return s1Var;
    }

    public static final s1 f(l lVar) {
        if (!lVar.getNode().isAttached()) {
            y4.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        s1 s1VarE = e(lVar, 2);
        if (!s1VarE.n()) {
            y4.a.b("LayoutCoordinates is not attached.");
        }
        return s1VarE;
    }

    public static final m0 g(l lVar) {
        s1 coordinator$ui = lVar.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.f5966p;
        }
        throw b3.i.D("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner h(l lVar) {
        Owner owner = g(lVar).f5878o;
        if (owner != null) {
            return owner;
        }
        throw b3.i.D("This node does not have an owner.");
    }
}
