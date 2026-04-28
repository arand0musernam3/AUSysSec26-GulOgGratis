package z4;

import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz4/a0;", "Lb5/h1;", "Lz4/h0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i80.n f47089b;

    public a0(i80.n nVar) {
        this.f47089b = nVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        h0 h0Var = new h0();
        h0Var.f47131o = this.f47089b;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f47089b == ((a0) obj).f47089b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47089b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "layout";
        o2Var.f7309c.b(this.f47089b, "measure");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((h0) sVar).f47131o = this.f47089b;
    }
}
