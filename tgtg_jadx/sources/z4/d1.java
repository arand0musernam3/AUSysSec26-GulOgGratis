package z4;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz4/d1;", "Lb5/h1;", "Lz4/e1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f47103b;

    public d1(Function1 function1) {
        this.f47103b = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        e1 e1Var = new e1();
        e1Var.f47114o = this.f47103b;
        return e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            return this.f47103b == ((d1) obj).f47103b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47103b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "onGloballyPositioned";
        o2Var.f7309c.b(this.f47103b, "onGloballyPositioned");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((e1) sVar).f47114o = this.f47103b;
    }
}
