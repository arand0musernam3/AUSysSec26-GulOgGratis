package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/r2;", "Lb5/h1;", "Ld2/s2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class r2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f13911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13912c;

    public r2(j0 j0Var, Function1 function1) {
        this.f13911b = j0Var;
        this.f13912c = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        s2 s2Var = new s2();
        s2Var.f13927q = this.f13911b;
        return s2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r2) {
            return Intrinsics.areEqual(((r2) obj).f13911b, this.f13911b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13911b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13912c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        s2 s2Var = (s2) sVar;
        j0 j0Var = s2Var.f13927q;
        j0 j0Var2 = this.f13911b;
        if (Intrinsics.areEqual(j0Var2, j0Var)) {
            return;
        }
        s2Var.f13927q = j0Var2;
        s2Var.M0();
    }
}
