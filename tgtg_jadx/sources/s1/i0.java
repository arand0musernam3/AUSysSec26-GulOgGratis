package s1;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t1.m1;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls1/i0;", "Lb5/h1;", "Ls1/w0;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class i0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f38615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f38616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f38617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f38618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f38619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f38620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f38621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0 f38622i;

    public i0(q1 q1Var, m1 m1Var, m1 m1Var2, m1 m1Var3, x0 x0Var, y0 y0Var, Function0 function0, j0 j0Var) {
        this.f38615b = q1Var;
        this.f38616c = m1Var;
        this.f38617d = m1Var2;
        this.f38618e = m1Var3;
        this.f38619f = x0Var;
        this.f38620g = y0Var;
        this.f38621h = function0;
        this.f38622i = j0Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new w0(this.f38615b, this.f38616c, this.f38617d, this.f38618e, this.f38619f, this.f38620g, this.f38621h, this.f38622i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(i0Var.f38615b, this.f38615b) && Intrinsics.areEqual(i0Var.f38616c, this.f38616c) && Intrinsics.areEqual(i0Var.f38617d, this.f38617d) && Intrinsics.areEqual(i0Var.f38618e, this.f38618e) && Intrinsics.areEqual(i0Var.f38619f, this.f38619f) && Intrinsics.areEqual(i0Var.f38620g, this.f38620g) && i0Var.f38621h == this.f38621h && Intrinsics.areEqual(i0Var.f38622i, this.f38622i);
    }

    public final int hashCode() {
        int iHashCode = this.f38615b.hashCode() * 31;
        m1 m1Var = this.f38616c;
        int iHashCode2 = (iHashCode + (m1Var != null ? m1Var.hashCode() : 0)) * 31;
        m1 m1Var2 = this.f38617d;
        int iHashCode3 = (iHashCode2 + (m1Var2 != null ? m1Var2.hashCode() : 0)) * 31;
        m1 m1Var3 = this.f38618e;
        return this.f38622i.hashCode() + ((this.f38621h.hashCode() + ((this.f38620g.f38733a.hashCode() + ((this.f38619f.f38730a.hashCode() + ((iHashCode3 + (m1Var3 != null ? m1Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "enterExitTransition";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f38615b, "transition");
        l3Var.b(this.f38616c, "sizeAnimation");
        l3Var.b(this.f38617d, "offsetAnimation");
        l3Var.b(this.f38618e, "slideAnimation");
        l3Var.b(this.f38619f, "enter");
        l3Var.b(this.f38620g, "exit");
        l3Var.b(this.f38622i, "graphicsLayerBlock");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        w0 w0Var = (w0) sVar;
        w0Var.f38716p = this.f38615b;
        w0Var.f38717q = this.f38616c;
        w0Var.f38718r = this.f38617d;
        w0Var.f38719s = this.f38618e;
        w0Var.f38720t = this.f38619f;
        w0Var.f38721u = this.f38620g;
        w0Var.f38722v = this.f38621h;
        w0Var.f38723w = this.f38622i;
    }
}
