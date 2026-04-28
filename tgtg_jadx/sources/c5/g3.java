package c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc5/g3;", "Lb5/h1;", "Lc5/h3;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class g3 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7241b;

    public g3(String str) {
        this.f7241b = str;
    }

    @Override // b5.h1
    public final b4.s create() {
        h3 h3Var = new h3();
        h3Var.f7245o = this.f7241b;
        return h3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        return Intrinsics.areEqual(this.f7241b, ((g3) obj).f7241b);
    }

    public final int hashCode() {
        return this.f7241b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "testTag";
        o2Var.f7309c.b(this.f7241b, "tag");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((h3) sVar).f7245o = this.f7241b;
    }
}
