package h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21181b;

    public n(int i11, int i12) {
        this.f21180a = i11;
        this.f21181b = i12;
        if (!(i11 >= 0)) {
            c2.a.a("negative start index");
        }
        if (i12 >= i11) {
            return;
        }
        c2.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f21180a == nVar.f21180a && this.f21181b == nVar.f21181b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21181b) + (Integer.hashCode(this.f21180a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f21180a);
        sb2.append(", end=");
        return r8.k.o(sb2, this.f21181b, ')');
    }
}
