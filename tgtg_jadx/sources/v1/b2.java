package v1;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/b2;", "Lb5/h1;", "Lv1/w1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f41691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41692c;

    public b2(y1 y1Var, boolean z11) {
        this.f41691b = y1Var;
        this.f41692c = z11;
    }

    @Override // b5.h1
    public final b4.s create() {
        w1 w1Var = new w1();
        w1Var.f41866o = this.f41691b;
        w1Var.f41867p = this.f41692c;
        return w1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.areEqual(this.f41691b, b2Var.f41691b) && this.f41692c == b2Var.f41692c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41692c) + r8.k.e(this.f41691b.hashCode() * 31, 31, false);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "scroll";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f41691b, "state");
        l3Var.b(Boolean.FALSE, "reverseScrolling");
        l3Var.b(Boolean.valueOf(this.f41692c), "isVertical");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        w1 w1Var = (w1) sVar;
        w1Var.f41866o = this.f41691b;
        w1Var.f41867p = this.f41692c;
    }
}
