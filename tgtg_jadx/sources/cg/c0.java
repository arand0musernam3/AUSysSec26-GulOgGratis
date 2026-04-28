package cg;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7945c;

    public c0(int i11, int i12, int i13) {
        this.f7943a = i11;
        this.f7944b = i12;
        this.f7945c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f7943a == c0Var.f7943a && this.f7944b == c0Var.f7944b && this.f7945c == c0Var.f7945c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7945c) + r8.k.b(this.f7944b, Integer.hashCode(this.f7943a) * 31, 31);
    }

    public final String toString() {
        return r8.k.i(this.f7945c, ")", r8.k.r(this.f7943a, this.f7944b, "LottieMarkerHapticWave(intervals=", ", frequency=", ", intensity="));
    }
}
