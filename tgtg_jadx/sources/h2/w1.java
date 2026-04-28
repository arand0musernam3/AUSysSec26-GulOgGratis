package h2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh2/w1;", "Lb5/h1;", "Lh2/x1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class w1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f21244b;

    public w1(z0 z0Var) {
        this.f21244b = z0Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        x1 x1Var = new x1();
        x1Var.f21245o = this.f21244b;
        return x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && Intrinsics.areEqual(this.f21244b, ((w1) obj).f21244b);
    }

    public final int hashCode() {
        return this.f21244b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "traversablePrefetchState";
        o2Var.f7308b = this.f21244b;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f21244b + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((x1) sVar).f21245o = this.f21244b;
    }
}
