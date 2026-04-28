package v1;

import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/o0;", "Lb5/h1;", "Lv1/p0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class o0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.l f41812b;

    public o0(b2.l lVar) {
        this.f41812b = lVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new p0(this.f41812b, (w2.z0) null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return Intrinsics.areEqual(this.f41812b, ((o0) obj).f41812b);
        }
        return false;
    }

    public final int hashCode() {
        b2.l lVar = this.f41812b;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "focusable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Boolean.TRUE, FeatureFlag.ENABLED);
        l3Var.b(this.f41812b, "interactionSource");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((p0) sVar).Q0(this.f41812b);
    }
}
