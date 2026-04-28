package v1;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/z;", "Lb5/h1;", "Lv1/y;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class z extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4.x0 f41898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4.v0 f41899d;

    public z(float f11, i4.x0 x0Var, i4.v0 v0Var) {
        this.f41897b = f11;
        this.f41898c = x0Var;
        this.f41899d = v0Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new y(this.f41897b, this.f41898c, this.f41899d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return z5.f.c(this.f41897b, zVar.f41897b) && Intrinsics.areEqual(this.f41898c, zVar.f41898c) && Intrinsics.areEqual(this.f41899d, zVar.f41899d);
    }

    public final int hashCode() {
        return this.f41899d.hashCode() + ((this.f41898c.hashCode() + (Float.hashCode(this.f41897b) * 31)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "border";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(new z5.f(this.f41897b), "width");
        long j9 = this.f41898c.f23332a;
        l3Var.b(new i4.v(j9), "color");
        o2Var.f7308b = new i4.v(j9);
        l3Var.b(this.f41899d, "shape");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderModifierNodeElement(width=");
        r8.k.u(this.f41897b, ", brush=", sb2);
        sb2.append(this.f41898c);
        sb2.append(", shape=");
        sb2.append(this.f41899d);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        y yVar = (y) sVar;
        float f11 = yVar.f41881r;
        f4.b bVar = yVar.f41884u;
        float f12 = this.f41897b;
        if (!z5.f.c(f11, f12)) {
            yVar.f41881r = f12;
            bVar.L0();
        }
        i4.x0 x0Var = yVar.f41882s;
        i4.x0 x0Var2 = this.f41898c;
        if (!Intrinsics.areEqual(x0Var, x0Var2)) {
            yVar.f41882s = x0Var2;
            bVar.L0();
        }
        i4.v0 v0Var = yVar.f41883t;
        i4.v0 v0Var2 = this.f41899d;
        if (Intrinsics.areEqual(v0Var, v0Var2)) {
            return;
        }
        yVar.f41883t = v0Var2;
        bVar.L0();
        b5.m.g(yVar).G();
    }
}
