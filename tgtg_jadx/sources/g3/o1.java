package g3;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg3/o1;", "Lb5/h1;", "Lg3/p1;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class o1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm.j f19197b;

    public o1(bm.j jVar) {
        this.f19197b = jVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        p1 p1Var = new p1();
        p1Var.f19292o = this.f19197b;
        return p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o1) {
            return this.f19197b == ((o1) obj).f19197b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19197b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "exposedDropdownMenuAnchorType";
        o2Var.f7309c.b(this.f19197b, "updateStateOnAttach");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((p1) sVar).f19292o = this.f19197b;
    }
}
