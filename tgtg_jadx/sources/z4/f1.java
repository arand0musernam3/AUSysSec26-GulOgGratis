package z4;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz4/f1;", "Lb5/h1;", "Lz4/g1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class f1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f47120b;

    public f1(Function1 function1) {
        this.f47120b = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        g1 g1Var = new g1();
        g1Var.f47127o = this.f47120b;
        return g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return this.f47120b == ((f1) obj).f47120b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47120b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "onPlaced";
        o2Var.f7309c.b(this.f47120b, "onPlaced");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((g1) sVar).f47127o = this.f47120b;
    }
}
