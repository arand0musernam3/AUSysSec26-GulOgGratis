package h2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh2/d0;", "Lb5/h1;", "Lh2/e0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class d0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f21070b;

    public d0(h0 h0Var) {
        this.f21070b = h0Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        e0 e0Var = new e0();
        e0Var.f21084o = this.f21070b;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.areEqual(this.f21070b, ((d0) obj).f21070b);
    }

    public final int hashCode() {
        return this.f21070b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "DisplayingDisappearingItemsElement";
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f21070b + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        e0 e0Var = (e0) sVar;
        h0 h0Var = e0Var.f21084o;
        h0 h0Var2 = this.f21070b;
        if (Intrinsics.areEqual(h0Var, h0Var2) || !e0Var.getNode().isAttached()) {
            return;
        }
        h0 h0Var3 = e0Var.f21084o;
        h0Var3.e();
        h0Var3.f21116b = null;
        h0Var3.f21117c = -1;
        h0Var2.f21124j = e0Var;
        e0Var.f21084o = h0Var2;
    }
}
