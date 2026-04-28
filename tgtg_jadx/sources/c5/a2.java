package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f7107c = new a2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7109b;

    public a2(long j9, long j11) {
        this.f7108a = j9;
        this.f7109b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            return z5.l.a(this.f7108a, a2Var.f7108a) && this.f7109b == a2Var.f7109b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7109b) + (Long.hashCode(this.f7108a) * 31);
    }
}
