package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/k1;", "Lb5/h1;", "Ld2/l1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f13822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13823c;

    public k1(i1 i1Var, Function1 function1) {
        this.f13822b = i1Var;
        this.f13823c = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        l1 l1Var = new l1(0);
        l1Var.f13835p = this.f13822b;
        l1Var.f13836q = true;
        return l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k1 k1Var = obj instanceof k1 ? (k1) obj : null;
        return k1Var != null && this.f13822b == k1Var.f13822b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f13822b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13823c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        l1 l1Var = (l1) sVar;
        l1Var.f13835p = this.f13822b;
        l1Var.f13836q = true;
    }
}
