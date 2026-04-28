package z1;

import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz1/s2;", "Lb5/h1;", "Lz1/g3;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class s2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f46674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f46675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2.l f46678f;

    public s2(h3 h3Var, h2 h2Var, boolean z11, boolean z12, b2.l lVar) {
        this.f46674b = h3Var;
        this.f46675c = h2Var;
        this.f46676d = z11;
        this.f46677e = z12;
        this.f46678f = lVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new g3(this.f46678f, null, null, null, this.f46675c, this.f46674b, this.f46676d, this.f46677e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return Intrinsics.areEqual(this.f46674b, s2Var.f46674b) && this.f46675c == s2Var.f46675c && Intrinsics.areEqual((Object) null, (Object) null) && this.f46676d == s2Var.f46676d && this.f46677e == s2Var.f46677e && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f46678f, s2Var.f46678f) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.e((this.f46675c.hashCode() + (this.f46674b.hashCode() * 31)) * 961, 31, this.f46676d), 961, this.f46677e);
        b2.l lVar = this.f46678f;
        return (iE + (lVar != null ? lVar.hashCode() : 0)) * 31;
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "scrollable";
        c5.l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f46675c, InAppMessageBase.ORIENTATION);
        l3Var.b(this.f46674b, "state");
        l3Var.b(null, "overscrollEffect");
        l3Var.b(Boolean.valueOf(this.f46676d), FeatureFlag.ENABLED);
        l3Var.b(Boolean.valueOf(this.f46677e), "reverseDirection");
        l3Var.b(null, "flingBehavior");
        l3Var.b(this.f46678f, "interactionSource");
        l3Var.b(null, "bringIntoViewSpec");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((g3) sVar).g1(this.f46678f, null, null, null, this.f46675c, this.f46674b, this.f46676d, this.f46677e);
    }
}
