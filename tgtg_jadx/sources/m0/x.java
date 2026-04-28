package m0;

import java.util.UUID;
import s0.n2;
import s0.o2;
import s0.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.i1 f28633a;

    public x(s0.i1 i1Var) {
        this.f28633a = i1Var;
        s0.g gVar = y0.i.f44570e1;
        Class cls = (Class) i1Var.i(gVar, null);
        if (cls != null && !cls.equals(s0.class)) {
            i1.k("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        i1Var.v(o2.U0, q2.PREVIEW);
        i1Var.v(gVar, s0.class);
        s0.g gVar2 = y0.i.f44569d1;
        if (i1Var.i(gVar2, null) == null) {
            i1Var.v(gVar2, s0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
        s0.g gVar3 = s0.d1.C0;
        if (((Integer) i1Var.i(gVar3, -1)).intValue() == -1) {
            i1Var.v(gVar3, 2);
        }
    }

    @Override // m0.d0
    public s0.i1 d() {
        return this.f28633a;
    }

    @Override // s0.n2
    public o2 f() {
        return new s0.m1(s0.l1.e(this.f28633a));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(int i11) {
        this(s0.i1.h());
        switch (i11) {
            case 1:
                return;
            default:
                s0.i1 i1VarH = s0.i1.h();
                this.f28633a = i1VarH;
                s0.g gVar = y0.i.f44570e1;
                Class cls = (Class) i1VarH.i(gVar, null);
                if (cls != null && !cls.equals(w.class)) {
                    i1.k("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                i1VarH.v(gVar, w.class);
                s0.g gVar2 = y0.i.f44569d1;
                if (i1VarH.i(gVar2, null) == null) {
                    i1VarH.v(gVar2, w.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
