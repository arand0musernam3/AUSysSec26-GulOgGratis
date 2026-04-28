package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13783d;

    public f1(int i11, int i12, int i13, int i14) {
        this.f13780a = i11;
        this.f13781b = i12;
        this.f13782c = i13;
        this.f13783d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f13780a == f1Var.f13780a && this.f13781b == f1Var.f13781b && this.f13782c == f1Var.f13782c && this.f13783d == f1Var.f13783d;
    }

    public final int hashCode() {
        return (((((this.f13780a * 31) + this.f13781b) * 31) + this.f13782c) * 31) + this.f13783d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f13780a);
        sb2.append(", top=");
        sb2.append(this.f13781b);
        sb2.append(", right=");
        sb2.append(this.f13782c);
        sb2.append(", bottom=");
        return r8.k.o(sb2, this.f13783d, ')');
    }
}
