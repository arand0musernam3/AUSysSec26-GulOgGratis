package f4;

import b4.s;
import b5.o0;
import b5.r;
import b5.y1;
import c5.y;
import i4.v0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s implements r, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v0 f17322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o4.d f17323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o4.b f17324q;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f17322o, qVar.f17322o) && Intrinsics.areEqual(this.f17323p, qVar.f17323p);
    }

    public final int hashCode() {
        return this.f17323p.hashCode() + (this.f17322o.hashCode() * 31);
    }

    @Override // b5.y1
    public final void l0() {
        this.f17324q = null;
        b5.o.h(this);
    }

    @Override // b5.r
    public final void n(o0 o0Var) {
        o4.b bVar;
        o4.b bVar2 = this.f17324q;
        if (bVar2 == null) {
            k8.d dVarB = ((y) b5.m.h(this)).getGraphicsContext().b();
            v0 v0Var = this.f17322o;
            o4.d dVar = this.f17323p;
            dVarB.getClass();
            o4.b bVar3 = new o4.b(v0Var, dVar, dVarB);
            this.f17324q = bVar3;
            bVar = bVar3;
        } else {
            bVar = bVar2;
        }
        bVar.g(o0Var, o0Var.f5908a.d(), 1.0f, null);
        o0Var.b();
    }
}
