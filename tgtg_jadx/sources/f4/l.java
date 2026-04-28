package f4;

import b4.s;
import b5.h1;
import c5.l3;
import c5.o2;
import i4.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf4/l;", "Lb5/h1;", "Lf4/m;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class l extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4.b f17302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b4.f f17303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z4.m f17304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f17306f;

    public l(n4.b bVar, b4.f fVar, z4.m mVar, float f11, w wVar) {
        this.f17302b = bVar;
        this.f17303c = fVar;
        this.f17304d = mVar;
        this.f17305e = f11;
        this.f17306f = wVar;
    }

    @Override // b5.h1
    public final s create() {
        m mVar = new m();
        mVar.f17307o = this.f17302b;
        mVar.f17308p = true;
        mVar.f17309q = this.f17303c;
        mVar.f17310r = this.f17304d;
        mVar.f17311s = this.f17305e;
        mVar.f17312t = this.f17306f;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f17302b, lVar.f17302b) && Intrinsics.areEqual(this.f17303c, lVar.f17303c) && Intrinsics.areEqual(this.f17304d, lVar.f17304d) && Float.compare(this.f17305e, lVar.f17305e) == 0 && Intrinsics.areEqual(this.f17306f, lVar.f17306f);
    }

    public final int hashCode() {
        int iA = r8.k.a((this.f17304d.hashCode() + ((this.f17303c.hashCode() + r8.k.e(this.f17302b.hashCode() * 31, 31, true)) * 31)) * 31, this.f17305e, 31);
        w wVar = this.f17306f;
        return iA + (wVar == null ? 0 : wVar.hashCode());
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "paint";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f17302b, "painter");
        l3Var.b(Boolean.TRUE, "sizeToIntrinsics");
        l3Var.b(this.f17303c, "alignment");
        l3Var.b(this.f17304d, "contentScale");
        l3Var.b(Float.valueOf(this.f17305e), "alpha");
        l3Var.b(this.f17306f, "colorFilter");
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f17302b + ", sizeToIntrinsics=true, alignment=" + this.f17303c + ", contentScale=" + this.f17304d + ", alpha=" + this.f17305e + ", colorFilter=" + this.f17306f + ')';
    }

    @Override // b5.h1
    public final void update(s sVar) {
        m mVar = (m) sVar;
        boolean z11 = mVar.f17308p;
        n4.b bVar = this.f17302b;
        boolean z12 = (z11 && h4.e.a(mVar.f17307o.h(), bVar.h())) ? false : true;
        mVar.f17307o = bVar;
        mVar.f17308p = true;
        mVar.f17309q = this.f17303c;
        mVar.f17310r = this.f17304d;
        mVar.f17311s = this.f17305e;
        mVar.f17312t = this.f17306f;
        if (z12) {
            b5.m.g(mVar).F();
        }
        b5.o.h(mVar);
    }
}
