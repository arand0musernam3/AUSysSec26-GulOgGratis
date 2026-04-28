package m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f29648b = k0.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29649c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29650a;

    public /* synthetic */ t0(long j9) {
        this.f29650a = j9;
    }

    public static final boolean a(long j9, long j11) {
        return (g(j9) <= g(j11)) & (f(j11) <= f(j9));
    }

    public static boolean b(long j9, Object obj) {
        return (obj instanceof t0) && j9 == ((t0) obj).f29650a;
    }

    public static final boolean c(long j9, long j11) {
        return j9 == j11;
    }

    public static final boolean d(long j9) {
        return ((int) (j9 >> 32)) == ((int) (j9 & 4294967295L));
    }

    public static final int e(long j9) {
        return f(j9) - g(j9);
    }

    public static final int f(long j9) {
        return Math.max((int) (j9 >> 32), (int) (j9 & 4294967295L));
    }

    public static final int g(long j9) {
        return Math.min((int) (j9 >> 32), (int) (j9 & 4294967295L));
    }

    public static final boolean h(long j9) {
        return ((int) (j9 >> 32)) > ((int) (j9 & 4294967295L));
    }

    public static String i(long j9) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j9 >> 32));
        sb2.append(", ");
        return r8.k.o(sb2, (int) (j9 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return b(this.f29650a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f29650a);
    }

    public final String toString() {
        return i(this.f29650a);
    }
}
