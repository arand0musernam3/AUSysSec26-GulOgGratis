package i3;

import a3.y0;
import b5.h1;
import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li3/f0;", "Lb5/h1;", "Li3/e0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f23113b;

    public f0(y0 y0Var) {
        this.f23113b = y0Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        e0 e0Var = new e0();
        e0Var.f23110o = this.f23113b;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f23113b == ((f0) obj).f23113b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23113b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "parentSemantics";
        o2Var.f7309c.b(this.f23113b, "properties");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        e0 e0Var = (e0) sVar;
        e0Var.f23110o = this.f23113b;
        b5.m.g(e0Var).G();
    }
}
