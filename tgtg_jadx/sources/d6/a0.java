package d6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f14429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14432f;

    public /* synthetic */ a0(int i11) {
        this((i11 & 1) != 0, (i11 & 2) != 0, (i11 & 4) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f14427a == a0Var.f14427a && this.f14428b == a0Var.f14428b && this.f14429c == a0Var.f14429c && this.f14430d == a0Var.f14430d && this.f14431e == a0Var.f14431e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14431e) + r8.k.e((this.f14429c.hashCode() + r8.k.e(Boolean.hashCode(this.f14427a) * 31, 31, this.f14428b)) * 31, 31, this.f14430d);
    }

    public a0(boolean z11, boolean z12, boolean z13) {
        k0 k0Var = k0.Inherit;
        this.f14427a = z11;
        this.f14428b = z12;
        this.f14429c = k0Var;
        this.f14430d = z13;
        this.f14431e = true;
        this.f14432f = "";
    }
}
