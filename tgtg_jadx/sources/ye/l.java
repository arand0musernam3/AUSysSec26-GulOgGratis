package ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45914a;

    public l(long j9) {
        this.f45914a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f45914a == ((l) obj).f45914a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45914a);
    }

    public final String toString() {
        return w.a0.r(new StringBuilder("ExitForeground(timestamp="), this.f45914a, ')');
    }
}
