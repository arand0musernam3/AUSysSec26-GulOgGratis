package d2;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/g0;", "Lb5/h1;", "Ld2/h0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f13788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13790d;

    public g0(e0 e0Var, float f11, String str) {
        this.f13788b = e0Var;
        this.f13789c = f11;
        this.f13790d = str;
    }

    @Override // b5.h1
    public final b4.s create() {
        h0 h0Var = new h0();
        h0Var.f13796o = this.f13788b;
        h0Var.f13797p = this.f13789c;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f13788b == g0Var.f13788b && this.f13789c == g0Var.f13789c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13789c) + (this.f13788b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = this.f13790d;
        o2Var.f7309c.b(Float.valueOf(this.f13789c), "fraction");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        h0 h0Var = (h0) sVar;
        h0Var.f13796o = this.f13788b;
        h0Var.f13797p = this.f13789c;
    }
}
