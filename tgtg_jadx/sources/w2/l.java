package w2;

import a3.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw2/l;", "Lb5/h1;", "Lw2/o;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class l extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5.e0 f42961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.y f42962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2.e1 f42963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r5.s f42966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l3 f42967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r5.m f42968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g4.v f42969j;

    public l(r5.e0 e0Var, r5.y yVar, m2.e1 e1Var, boolean z11, boolean z12, r5.s sVar, l3 l3Var, r5.m mVar, g4.v vVar) {
        this.f42961b = e0Var;
        this.f42962c = yVar;
        this.f42963d = e1Var;
        this.f42964e = z11;
        this.f42965f = z12;
        this.f42966g = sVar;
        this.f42967h = l3Var;
        this.f42968i = mVar;
        this.f42969j = vVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        o oVar = new o();
        oVar.f42998q = this.f42961b;
        oVar.f42999r = this.f42962c;
        oVar.f43000s = this.f42963d;
        oVar.f43001t = this.f42964e;
        oVar.f43002u = this.f42965f;
        oVar.f43003v = this.f42966g;
        l3 l3Var = this.f42967h;
        oVar.f43004w = l3Var;
        oVar.f43005x = this.f42968i;
        oVar.f43006y = this.f42969j;
        l3Var.f453f = new m(oVar, 4);
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f42961b, lVar.f42961b) && Intrinsics.areEqual(this.f42962c, lVar.f42962c) && Intrinsics.areEqual(this.f42963d, lVar.f42963d) && this.f42964e == lVar.f42964e && this.f42965f == lVar.f42965f && Intrinsics.areEqual(this.f42966g, lVar.f42966g) && Intrinsics.areEqual(this.f42967h, lVar.f42967h) && Intrinsics.areEqual(this.f42968i, lVar.f42968i) && Intrinsics.areEqual(this.f42969j, lVar.f42969j);
    }

    public final int hashCode() {
        return this.f42969j.hashCode() + ((this.f42968i.hashCode() + ((this.f42967h.hashCode() + ((this.f42966g.hashCode() + r8.k.e(r8.k.e(r8.k.e((this.f42963d.hashCode() + ((this.f42962c.hashCode() + (this.f42961b.hashCode() * 31)) * 31)) * 31, 31, this.f42964e), 31, this.f42965f), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f42961b + ", value=" + this.f42962c + ", state=" + this.f42963d + ", readOnly=" + this.f42964e + ", enabled=" + this.f42965f + ", isPassword=false, offsetMapping=" + this.f42966g + ", manager=" + this.f42967h + ", imeOptions=" + this.f42968i + ", focusRequester=" + this.f42969j + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        o oVar = (o) sVar;
        boolean z11 = oVar.f43002u;
        boolean z12 = false;
        boolean z13 = z11 && !oVar.f43001t;
        r5.m mVar = oVar.f43005x;
        l3 l3Var = oVar.f43004w;
        boolean z14 = this.f42964e;
        boolean z15 = this.f42965f;
        if (z15 && !z14) {
            z12 = true;
        }
        oVar.f42998q = this.f42961b;
        r5.y yVar = this.f42962c;
        oVar.f42999r = yVar;
        oVar.f43000s = this.f42963d;
        oVar.f43001t = z14;
        oVar.f43002u = z15;
        oVar.f43003v = this.f42966g;
        l3 l3Var2 = this.f42967h;
        oVar.f43004w = l3Var2;
        r5.m mVar2 = this.f42968i;
        oVar.f43005x = mVar2;
        oVar.f43006y = this.f42969j;
        if (z15 != z11 || z12 != z13 || !Intrinsics.areEqual(mVar2, mVar) || !m5.t0.d(yVar.f37715b)) {
            b5.m.g(oVar).G();
        }
        if (Intrinsics.areEqual(l3Var2, l3Var)) {
            return;
        }
        l3Var2.f453f = new m(oVar, 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
