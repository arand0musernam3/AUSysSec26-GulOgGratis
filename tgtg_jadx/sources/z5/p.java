package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47291a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public static String b(long j9) {
        return a(j9, 0L) ? "Unspecified" : a(j9, 4294967296L) ? "Sp" : a(j9, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f47291a == ((p) obj).f47291a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47291a);
    }

    public final String toString() {
        return b(this.f47291a);
    }
}
