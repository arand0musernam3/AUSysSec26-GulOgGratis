package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/t1;", "Lb5/h1;", "Ld2/u1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class t1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f13934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final defpackage.d f13935c;

    public t1(Function1 function1, defpackage.d dVar) {
        this.f13934b = function1;
        this.f13935c = dVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        u1 u1Var = new u1();
        u1Var.f13941o = this.f13934b;
        u1Var.f13942p = true;
        return u1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        t1 t1Var = obj instanceof t1 ? (t1) obj : null;
        return t1Var != null && this.f13934b == t1Var.f13934b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f13934b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13935c.invoke(o2Var);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f13934b + ", rtlAware=true)";
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        u1 u1Var = (u1) sVar;
        Function1 function1 = u1Var.f13941o;
        Function1 function12 = this.f13934b;
        if (function1 != function12 || !u1Var.f13942p) {
            b5.m0 m0VarG = b5.m.g(u1Var);
            b5.g0 g0Var = b5.m0.V;
            m0VarG.X(false);
        }
        u1Var.f13941o = function12;
        u1Var.f13942p = true;
    }
}
