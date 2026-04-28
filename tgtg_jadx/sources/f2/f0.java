package f2;

import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf2/f0;", "Lb5/h1;", "Lf2/g0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class f0 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.h1 f17117b;

    public f0(m3.h1 h1Var) {
        this.f17117b = h1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        g0 g0Var = new g0();
        g0Var.f17121o = 1.0f;
        g0Var.f17122p = this.f17117b;
        return g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.areEqual(this.f17117b, ((f0) obj).f17117b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        m3.h1 h1Var = this.f17117b;
        return Float.hashCode(1.0f) + ((h1Var != null ? h1Var.hashCode() : 0) * 961);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "fillParentMaxWidth";
        o2Var.f7308b = Float.valueOf(1.0f);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        g0 g0Var = (g0) sVar;
        g0Var.f17121o = 1.0f;
        g0Var.f17122p = this.f17117b;
    }
}
