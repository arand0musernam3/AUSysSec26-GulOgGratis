package z1;

import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz1/i1;", "Lb5/h1;", "Lz1/k1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 extends b5.h1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final yj.m f46538j = new yj.m(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f46539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f46540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2.l f46542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i80.n f46544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i80.n f46545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f46546i;

    public i1(c0 c0Var, h2 h2Var, boolean z11, b2.l lVar, boolean z12, le.v vVar, i80.n nVar, boolean z13) {
        this.f46539b = c0Var;
        this.f46540c = h2Var;
        this.f46541d = z11;
        this.f46542e = lVar;
        this.f46543f = z12;
        this.f46544g = vVar;
        this.f46545h = nVar;
        this.f46546i = z13;
    }

    @Override // b5.h1
    public final b4.s create() {
        yj.m mVar = f46538j;
        boolean z11 = this.f46541d;
        b2.l lVar = this.f46542e;
        h2 h2Var = this.f46540c;
        k1 k1Var = new k1(mVar, z11, lVar, h2Var);
        k1Var.I = this.f46539b;
        k1Var.J = h2Var;
        k1Var.K = this.f46543f;
        k1Var.L = this.f46544g;
        k1Var.M = this.f46545h;
        k1Var.N = this.f46546i;
        return k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.areEqual(this.f46539b, i1Var.f46539b) && this.f46540c == i1Var.f46540c && this.f46541d == i1Var.f46541d && Intrinsics.areEqual(this.f46542e, i1Var.f46542e) && this.f46543f == i1Var.f46543f && Intrinsics.areEqual(this.f46544g, i1Var.f46544g) && Intrinsics.areEqual(this.f46545h, i1Var.f46545h) && this.f46546i == i1Var.f46546i;
    }

    public final int hashCode() {
        int iE = r8.k.e((this.f46540c.hashCode() + (this.f46539b.hashCode() * 31)) * 31, 31, this.f46541d);
        b2.l lVar = this.f46542e;
        return Boolean.hashCode(this.f46546i) + ((this.f46545h.hashCode() + ((this.f46544g.hashCode() + r8.k.e((iE + (lVar != null ? lVar.hashCode() : 0)) * 31, 31, this.f46543f)) * 31)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "draggable";
        c5.l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f46540c, InAppMessageBase.ORIENTATION);
        l3Var.b(Boolean.valueOf(this.f46541d), FeatureFlag.ENABLED);
        l3Var.b(Boolean.valueOf(this.f46546i), "reverseDirection");
        l3Var.b(this.f46542e, "interactionSource");
        l3Var.b(Boolean.valueOf(this.f46543f), "startDragImmediately");
        l3Var.b(this.f46544g, "onDragStarted");
        l3Var.b(this.f46545h, "onDragStopped");
        l3Var.b(this.f46539b, "state");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        boolean z11;
        boolean z12;
        k1 k1Var = (k1) sVar;
        c0 c0Var = k1Var.I;
        c0 c0Var2 = this.f46539b;
        if (Intrinsics.areEqual(c0Var, c0Var2)) {
            z11 = false;
        } else {
            k1Var.I = c0Var2;
            z11 = true;
        }
        h2 h2Var = k1Var.J;
        h2 h2Var2 = this.f46540c;
        if (h2Var != h2Var2) {
            k1Var.J = h2Var2;
            z11 = true;
        }
        boolean z13 = k1Var.N;
        boolean z14 = this.f46546i;
        if (z13 != z14) {
            k1Var.N = z14;
            z12 = true;
        } else {
            z12 = z11;
        }
        k1Var.L = this.f46544g;
        k1Var.M = this.f46545h;
        k1Var.K = this.f46543f;
        k1Var.f1(f46538j, this.f46541d, this.f46542e, h2Var2, z12);
    }
}
