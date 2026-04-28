package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17019c;

    public z2(int i11, int i12, int i13) {
        this.f17017a = i11;
        this.f17018b = i12;
        this.f17019c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return this.f17017a == z2Var.f17017a && this.f17018b == z2Var.f17018b && this.f17019c == z2Var.f17019c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17019c) + r8.k.b(this.f17018b, Integer.hashCode(this.f17017a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputConfigData(width=");
        sb2.append(this.f17017a);
        sb2.append(", height=");
        sb2.append(this.f17018b);
        sb2.append(", format=");
        return r8.k.o(sb2, this.f17019c, ')');
    }
}
