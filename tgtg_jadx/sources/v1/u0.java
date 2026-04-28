package v1;

import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/u0;", "Lb5/h1;", "Lv1/y0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class u0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.l f41849b;

    public u0(b2.l lVar) {
        this.f41849b = lVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        y0 y0Var = new y0();
        y0Var.f41885o = this.f41849b;
        return y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.areEqual(((u0) obj).f41849b, this.f41849b);
    }

    public final int hashCode() {
        return this.f41849b.hashCode() * 31;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "hoverable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f41849b, "interactionSource");
        l3Var.b(Boolean.TRUE, FeatureFlag.ENABLED);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        y0 y0Var = (y0) sVar;
        b2.l lVar = y0Var.f41885o;
        b2.l lVar2 = this.f41849b;
        if (Intrinsics.areEqual(lVar, lVar2)) {
            return;
        }
        y0Var.N0();
        y0Var.f41885o = lVar2;
    }
}
