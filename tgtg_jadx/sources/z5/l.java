package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47286a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public static String b(long j9) {
        return ((int) (j9 >> 32)) + " x " + ((int) (j9 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f47286a == ((l) obj).f47286a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47286a);
    }

    public final String toString() {
        return b(this.f47286a);
    }
}
