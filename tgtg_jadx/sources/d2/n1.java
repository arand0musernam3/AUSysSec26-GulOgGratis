package d2;

import c5.l3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/n1;", "Lb5/h1;", "Ld2/o1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13860c;

    public n1(float f11, boolean z11) {
        this.f13859b = f11;
        this.f13860c = z11;
    }

    @Override // b5.h1
    public final b4.s create() {
        o1 o1Var = new o1();
        o1Var.f13869o = this.f13859b;
        o1Var.f13870p = this.f13860c;
        return o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n1 n1Var = obj instanceof n1 ? (n1) obj : null;
        return n1Var != null && this.f13859b == n1Var.f13859b && this.f13860c == n1Var.f13860c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13860c) + (Float.hashCode(this.f13859b) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "weight";
        float f11 = this.f13859b;
        o2Var.f7308b = Float.valueOf(f11);
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Float.valueOf(f11), "weight");
        l3Var.b(Boolean.valueOf(this.f13860c), "fill");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        o1 o1Var = (o1) sVar;
        o1Var.f13869o = this.f13859b;
        o1Var.f13870p = this.f13860c;
    }
}
