package v1;

import android.view.View;
import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/f1;", "Lb5/h1;", "Lv1/h1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f41718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f41719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f41720d;

    public f1(Function1 function1, Function1 function12, r1 r1Var) {
        this.f41718b = function1;
        this.f41719c = function12;
        this.f41720d = r1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new h1(this.f41718b, this.f41719c, this.f41720d);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f41720d.hashCode() + r8.k.d(r8.k.e(r8.k.a(r8.k.a(e0.f.b(r8.k.e(r8.k.a(this.f41718b.hashCode() * 961, Float.NaN, 31), 31, true), 31, 9205357640488583168L), Float.NaN, 31), Float.NaN, 31), 31, true), 31, this.f41719c);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "magnifier";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f41718b, "sourceCenter");
        l3Var.b(null, "magnifierCenter");
        l3Var.b(Float.valueOf(Float.NaN), "zoom");
        l3Var.b(new z5.h(9205357640488583168L), "size");
        l3Var.b(new z5.f(Float.NaN), "cornerRadius");
        l3Var.b(new z5.f(Float.NaN), "elevation");
        l3Var.b(Boolean.TRUE, "clippingEnabled");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        h1 h1Var = (h1) sVar;
        float f11 = h1Var.f41741q;
        long j9 = h1Var.f41743s;
        float f12 = h1Var.f41744t;
        boolean z11 = h1Var.f41742r;
        float f13 = h1Var.f41745u;
        boolean z12 = h1Var.f41746v;
        r1 r1Var = h1Var.f41747w;
        View view = h1Var.f41748x;
        z5.c cVar = h1Var.f41749y;
        h1Var.f41739o = this.f41718b;
        h1Var.f41741q = Float.NaN;
        h1Var.f41742r = true;
        h1Var.f41743s = 9205357640488583168L;
        h1Var.f41744t = Float.NaN;
        h1Var.f41745u = Float.NaN;
        h1Var.f41746v = true;
        h1Var.f41740p = this.f41719c;
        r1 r1Var2 = this.f41720d;
        h1Var.f41747w = r1Var2;
        View viewN = b5.o.n(h1Var);
        z5.c cVar2 = b5.m.g(h1Var).f5889z;
        if (h1Var.f41750z != null) {
            j5.a0 a0Var = i1.f41764a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f11)) && Float.NaN != f11 && !r1Var2.a()) || 9205357640488583168L != j9 || !z5.f.c(Float.NaN, f12) || !z5.f.c(Float.NaN, f13) || true != z11 || true != z12 || !Intrinsics.areEqual(r1Var2, r1Var) || !Intrinsics.areEqual(viewN, view) || !Intrinsics.areEqual(cVar2, cVar)) {
                h1Var.M0();
            }
        }
        h1Var.N0();
    }
}
