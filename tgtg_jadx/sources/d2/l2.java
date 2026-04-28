package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/l2;", "Lb5/h1;", "Ld2/n2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f13842g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l2(float f11, float f12, float f13, float f14, boolean z11, Function1 function1, int i11) {
        Function1 function12;
        boolean z12;
        float f15;
        f11 = (i11 & 1) != 0 ? Float.NaN : f11;
        f12 = (i11 & 2) != 0 ? Float.NaN : f12;
        f13 = (i11 & 4) != 0 ? Float.NaN : f13;
        if ((i11 & 8) != 0) {
            function12 = function1;
            z12 = z11;
            f15 = Float.NaN;
        } else {
            function12 = function1;
            z12 = z11;
            f15 = f14;
        }
        this(f11, f12, f13, f15, z12, function12);
    }

    @Override // b5.h1
    public final b4.s create() {
        n2 n2Var = new n2();
        n2Var.f13861o = this.f13837b;
        n2Var.f13862p = this.f13838c;
        n2Var.f13863q = this.f13839d;
        n2Var.f13864r = this.f13840e;
        n2Var.f13865s = this.f13841f;
        return n2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return z5.f.c(this.f13837b, l2Var.f13837b) && z5.f.c(this.f13838c, l2Var.f13838c) && z5.f.c(this.f13839d, l2Var.f13839d) && z5.f.c(this.f13840e, l2Var.f13840e) && this.f13841f == l2Var.f13841f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13841f) + r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f13837b) * 31, this.f13838c, 31), this.f13839d, 31), this.f13840e, 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13842g.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        n2 n2Var = (n2) sVar;
        n2Var.f13861o = this.f13837b;
        n2Var.f13862p = this.f13838c;
        n2Var.f13863q = this.f13839d;
        n2Var.f13864r = this.f13840e;
        n2Var.f13865s = this.f13841f;
    }

    public l2(float f11, float f12, float f13, float f14, boolean z11, Function1 function1) {
        this.f13837b = f11;
        this.f13838c = f12;
        this.f13839d = f13;
        this.f13840e = f14;
        this.f13841f = z11;
        this.f13842g = function1;
    }
}
