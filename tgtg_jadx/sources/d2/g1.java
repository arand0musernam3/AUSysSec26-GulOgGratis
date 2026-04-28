package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/g1;", "Lb5/h1;", "Ld2/h1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class g1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f13791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13792c;

    public g1(i1 i1Var, Function1 function1) {
        this.f13791b = i1Var;
        this.f13792c = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        h1 h1Var = new h1(0);
        h1Var.f13798p = this.f13791b;
        h1Var.f13799q = true;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g1 g1Var = obj instanceof g1 ? (g1) obj : null;
        return g1Var != null && this.f13791b == g1Var.f13791b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f13791b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13792c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        h1 h1Var = (h1) sVar;
        h1Var.f13798p = this.f13791b;
        h1Var.f13799q = true;
    }
}
