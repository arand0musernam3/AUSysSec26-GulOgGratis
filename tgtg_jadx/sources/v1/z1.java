package v1;

import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z1.h2;
import z1.h3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/z1;", "Lb5/h1;", "Lv1/a2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class z1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f41909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f41910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f41911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z1.l1 f41913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2.l f41914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1.u f41915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f41916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1 f41917j;

    public z1(b2.l lVar, o1 o1Var, z1.u uVar, z1.l1 l1Var, h2 h2Var, h3 h3Var, boolean z11, boolean z12, boolean z13) {
        this.f41909b = h3Var;
        this.f41910c = h2Var;
        this.f41911d = z11;
        this.f41912e = z12;
        this.f41913f = l1Var;
        this.f41914g = lVar;
        this.f41915h = uVar;
        this.f41916i = z13;
        this.f41917j = o1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        a2 a2Var = new a2();
        a2Var.f41680q = this.f41909b;
        a2Var.f41681r = this.f41910c;
        a2Var.f41682s = this.f41911d;
        a2Var.f41683t = this.f41912e;
        a2Var.f41684u = this.f41913f;
        a2Var.f41685v = this.f41914g;
        a2Var.f41686w = this.f41915h;
        a2Var.f41687x = this.f41916i;
        a2Var.f41688y = this.f41917j;
        return a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return Intrinsics.areEqual(this.f41909b, z1Var.f41909b) && this.f41910c == z1Var.f41910c && this.f41911d == z1Var.f41911d && this.f41912e == z1Var.f41912e && Intrinsics.areEqual(this.f41913f, z1Var.f41913f) && Intrinsics.areEqual(this.f41914g, z1Var.f41914g) && Intrinsics.areEqual(this.f41915h, z1Var.f41915h) && this.f41916i == z1Var.f41916i && Intrinsics.areEqual(this.f41917j, z1Var.f41917j);
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.e((this.f41910c.hashCode() + (this.f41909b.hashCode() * 31)) * 31, 31, this.f41911d), 31, this.f41912e);
        z1.l1 l1Var = this.f41913f;
        int iHashCode = (iE + (l1Var != null ? l1Var.hashCode() : 0)) * 31;
        b2.l lVar = this.f41914g;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        z1.u uVar = this.f41915h;
        int iE2 = r8.k.e((iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31, 31, this.f41916i);
        o1 o1Var = this.f41917j;
        return iE2 + (o1Var != null ? o1Var.hashCode() : 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "scrollableArea";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f41909b, "state");
        l3Var.b(this.f41910c, InAppMessageBase.ORIENTATION);
        if (!this.f41916i) {
            l3Var.b(this.f41917j, "overscrollEffect");
        }
        l3Var.b(Boolean.valueOf(this.f41911d), FeatureFlag.ENABLED);
        l3Var.b(Boolean.valueOf(this.f41912e), "reverseScrolling");
        l3Var.b(this.f41913f, "flingBehavior");
        l3Var.b(this.f41914g, "interactionSource");
        l3Var.b(this.f41915h, "bringIntoViewSpec");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((a2) sVar).Q0(this.f41914g, this.f41917j, this.f41915h, this.f41913f, this.f41910c, this.f41909b, this.f41916i, this.f41911d, this.f41912e);
    }
}
