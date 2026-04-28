package i4;

import b5.h1;
import b5.s1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li4/p;", "Lb5/h1;", "Li4/q;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class p extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f23276b;

    public p(Function1 function1) {
        this.f23276b = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new q(this.f23276b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f23276b == ((p) obj).f23276b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23276b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "graphicsLayer";
        o2Var.f7309c.b(this.f23276b, "block");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        s1 s1Var;
        q qVar = (q) sVar;
        Function1 function1 = this.f23276b;
        qVar.f23277o = function1;
        if (qVar.getNode().isAttached() && (s1Var = b5.m.e(qVar, 2).f5967q) != null) {
            s1Var.B1(function1, true);
        }
    }
}
