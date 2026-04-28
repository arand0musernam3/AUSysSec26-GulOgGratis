package d2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/a2;", "Lb5/h1;", "Ld2/c2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f13735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c50.p f13736c;

    public a2(z1 z1Var, c50.p pVar) {
        this.f13735b = z1Var;
        this.f13736c = pVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        c2 c2Var = new c2();
        c2Var.f13768o = this.f13735b;
        return c2Var;
    }

    public final boolean equals(Object obj) {
        a2 a2Var = obj instanceof a2 ? (a2) obj : null;
        if (a2Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f13735b, a2Var.f13735b);
    }

    public final int hashCode() {
        return this.f13735b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13736c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((c2) sVar).f13768o = this.f13735b;
    }
}
