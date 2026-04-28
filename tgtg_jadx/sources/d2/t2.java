package d2;

import c5.l3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/t2;", "Lb5/h1;", "Ld2/u2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class t2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13937c;

    public t2(float f11, float f12) {
        this.f13936b = f11;
        this.f13937c = f12;
    }

    @Override // b5.h1
    public final b4.s create() {
        u2 u2Var = new u2();
        u2Var.f13943o = this.f13936b;
        u2Var.f13944p = this.f13937c;
        return u2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return z5.f.c(this.f13936b, t2Var.f13936b) && z5.f.c(this.f13937c, t2Var.f13937c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13937c) + (Float.hashCode(this.f13936b) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "defaultMinSize";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(new z5.f(this.f13936b), "minWidth");
        l3Var.b(new z5.f(this.f13937c), "minHeight");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        u2 u2Var = (u2) sVar;
        u2Var.f13943o = this.f13936b;
        u2Var.f13944p = this.f13937c;
    }
}
