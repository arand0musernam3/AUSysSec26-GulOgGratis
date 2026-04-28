package f4;

import b4.s;
import b5.h1;
import c5.l3;
import c5.o2;
import i4.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf4/p;", "Lb5/h1;", "Lf4/q;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f17320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o4.d f17321c;

    public p(v0 v0Var, o4.d dVar) {
        this.f17320b = v0Var;
        this.f17321c = dVar;
    }

    @Override // b5.h1
    public final s create() {
        q qVar = new q();
        qVar.f17322o = this.f17320b;
        qVar.f17323p = this.f17321c;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f17320b, pVar.f17320b) && Intrinsics.areEqual(this.f17321c, pVar.f17321c);
    }

    public final int hashCode() {
        return this.f17321c.hashCode() + (this.f17320b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "dropShadow";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f17320b, "shape");
        l3Var.b(this.f17321c, "dropShadow");
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.f17320b + ", shadow=" + this.f17321c + ')';
    }

    @Override // b5.h1
    public final void update(s sVar) {
        q qVar = (q) sVar;
        v0 v0Var = qVar.f17322o;
        v0 v0Var2 = this.f17320b;
        boolean zAreEqual = Intrinsics.areEqual(v0Var, v0Var2);
        o4.d dVar = this.f17321c;
        if (!zAreEqual || !Intrinsics.areEqual(qVar.f17323p, dVar)) {
            qVar.f17324q = null;
        }
        qVar.f17322o = v0Var2;
        qVar.f17323p = dVar;
    }
}
