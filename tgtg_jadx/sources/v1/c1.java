package v1;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/c1;", "Lb5/h1;", "Lv1/d1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.k f41701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f41702c;

    public c1(b2.k kVar, e1 e1Var) {
        this.f41701b = kVar;
        this.f41702c = e1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        b5.l lVarA = this.f41702c.a(this.f41701b);
        d1 d1Var = new d1();
        d1Var.f41710q = lVarA;
        d1Var.L0(lVarA);
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual(this.f41701b, c1Var.f41701b) && Intrinsics.areEqual(this.f41702c, c1Var.f41702c);
    }

    public final int hashCode() {
        return this.f41702c.hashCode() + (this.f41701b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "indication";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f41701b, "interactionSource");
        l3Var.b(this.f41702c, "indication");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        d1 d1Var = (d1) sVar;
        b5.l lVarA = this.f41702c.a(this.f41701b);
        d1Var.M0(d1Var.f41710q);
        d1Var.f41710q = lVarA;
        d1Var.L0(lVarA);
    }
}
