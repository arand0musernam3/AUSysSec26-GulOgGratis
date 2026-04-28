package h2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh2/h1;", "Lb5/h1;", "Lh2/k1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class h1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f21126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f21127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2 f21128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21130f;

    public h1(Function0 function0, g1 g1Var, h2 h2Var, boolean z11, boolean z12) {
        this.f21126b = function0;
        this.f21127c = g1Var;
        this.f21128d = h2Var;
        this.f21129e = z11;
        this.f21130f = z12;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new k1(this.f21126b, this.f21127c, this.f21128d, this.f21129e, this.f21130f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f21126b == h1Var.f21126b && Intrinsics.areEqual(this.f21127c, h1Var.f21127c) && this.f21128d == h1Var.f21128d && this.f21129e == h1Var.f21129e && this.f21130f == h1Var.f21130f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21130f) + r8.k.e((this.f21128d.hashCode() + ((this.f21127c.hashCode() + (this.f21126b.hashCode() * 31)) * 31)) * 31, 31, this.f21129e);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        k1 k1Var = (k1) sVar;
        k1Var.f21149o = this.f21126b;
        k1Var.f21150p = this.f21127c;
        h2 h2Var = k1Var.f21151q;
        h2 h2Var2 = this.f21128d;
        if (h2Var != h2Var2) {
            k1Var.f21151q = h2Var2;
            b5.m.g(k1Var).G();
        }
        boolean z11 = k1Var.f21152r;
        boolean z12 = this.f21129e;
        boolean z13 = this.f21130f;
        if (z11 == z12 && k1Var.f21153s == z13) {
            return;
        }
        k1Var.f21152r = z12;
        k1Var.f21153s = z13;
        k1Var.L0();
        b5.m.g(k1Var).G();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
