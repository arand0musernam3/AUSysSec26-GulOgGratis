package i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f23335b = g0.h(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23336c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23337a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public static String b(long j9) {
        return "TransformOrigin(packedValue=" + j9 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            return this.f23337a == ((z0) obj).f23337a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23337a);
    }

    public final String toString() {
        return b(this.f23337a);
    }
}
