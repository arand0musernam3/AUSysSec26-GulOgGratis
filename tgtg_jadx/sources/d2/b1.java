package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/b1;", "Lb5/h1;", "Ld2/d1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f13743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13744c;

    public b1(y2 y2Var, Function1 function1) {
        this.f13743b = y2Var;
        this.f13744c = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new d1(this.f13743b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return Intrinsics.areEqual(((b1) obj).f13743b, this.f13743b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13743b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13744c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        d1 d1Var = (d1) sVar;
        y2 y2Var = d1Var.f13773q;
        y2 y2Var2 = this.f13743b;
        if (Intrinsics.areEqual(y2Var2, y2Var)) {
            return;
        }
        d1Var.f13773q = y2Var2;
        d1Var.M0();
    }
}
