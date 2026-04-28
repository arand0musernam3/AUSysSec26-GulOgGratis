package i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f23305d = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23308c;

    public /* synthetic */ u0() {
        this(g0.d(4278190080L), 0L, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return v.c(this.f23306a, u0Var.f23306a) && h4.b.b(this.f23307b, u0Var.f23307b) && this.f23308c == u0Var.f23308c;
    }

    public final int hashCode() {
        int i11 = v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Float.hashCode(this.f23308c) + e0.f.b(Long.hashCode(this.f23306a) * 31, 31, this.f23307b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        r8.k.x(this.f23306a, ", offset=", sb2);
        sb2.append((Object) h4.b.h(this.f23307b));
        sb2.append(", blurRadius=");
        return r8.k.n(sb2, this.f23308c, ')');
    }

    public u0(long j9, long j11, float f11) {
        this.f23306a = j9;
        this.f23307b = j11;
        this.f23308c = f11;
    }
}
