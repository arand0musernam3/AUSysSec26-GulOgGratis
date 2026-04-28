package s1;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls1/e1;", "Lb5/h1;", "Ls1/h1;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.x f38576b;

    public e1(t1.x xVar) {
        this.f38576b = xVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new h1(this.f38576b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1) || !Intrinsics.areEqual(((e1) obj).f38576b, this.f38576b)) {
            return false;
        }
        b4.k kVar = b4.d.f5683a;
        return Intrinsics.areEqual(kVar, kVar);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f38576b.hashCode() * 31)) * 31;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "animateContentSize";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f38576b, "animationSpec");
        l3Var.b(b4.d.f5683a, "alignment");
        l3Var.b(null, "finishedListener");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((h1) sVar).f38608p = this.f38576b;
    }
}
