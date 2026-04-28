package v80;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class j1 extends s1 implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(i1 i1Var) {
        s1 s1VarJ;
        super(true);
        boolean z11 = true;
        N(i1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f42158b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null || (s1VarJ = pVar.j()) == null) {
            z11 = false;
            break;
        }
        while (!s1VarJ.E()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(s1VarJ);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null || (s1VarJ = pVar2.j()) == null) {
                z11 = false;
                break;
            }
        }
        this.f42112c = z11;
    }

    @Override // v80.s1
    public final boolean E() {
        return this.f42112c;
    }

    @Override // v80.s1
    public final boolean F() {
        return true;
    }
}
