package d2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/w2;", "Lb5/h1;", "Ld2/x2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.j f13958b;

    public w2(b4.j jVar) {
        this.f13958b = jVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        x2 x2Var = new x2();
        x2Var.f13970o = this.f13958b;
        return x2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        w2 w2Var = obj instanceof w2 ? (w2) obj : null;
        if (w2Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f13958b, w2Var.f13958b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13958b.f5701a);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "align";
        o2Var.f7308b = this.f13958b;
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((x2) sVar).f13970o = this.f13958b;
    }
}
