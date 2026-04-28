package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46790c;

    public z1(long j9, long j11, boolean z11) {
        this.f46788a = j9;
        this.f46789b = j11;
        this.f46790c = z11;
    }

    public final z1 a(z1 z1Var) {
        return new z1(h4.b.f(this.f46788a, z1Var.f46788a), Math.max(this.f46789b, z1Var.f46789b), this.f46790c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return h4.b.b(this.f46788a, z1Var.f46788a) && this.f46789b == z1Var.f46789b && this.f46790c == z1Var.f46790c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46790c) + e0.f.b(Long.hashCode(this.f46788a) * 31, 31, this.f46789b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb2.append((Object) h4.b.h(this.f46788a));
        sb2.append(", timeMillis=");
        sb2.append(this.f46789b);
        sb2.append(", shouldApplyImmediately=");
        return r8.k.q(sb2, this.f46790c, ')');
    }
}
