package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47280a;

    public /* synthetic */ j(long j9) {
        this.f47280a = j9;
    }

    public static long a(int i11, int i12, int i13, long j9) {
        if ((i13 & 1) != 0) {
            i11 = (int) (j9 >> 32);
        }
        if ((i13 & 2) != 0) {
            i12 = (int) (j9 & 4294967295L);
        }
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final boolean b(long j9, long j11) {
        return j9 == j11;
    }

    public static final long c(long j9, long j11) {
        return (((long) (((int) (j9 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L);
    }

    public static final long d(long j9, long j11) {
        return (((long) (((int) (j9 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L);
    }

    public static String e(long j9) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j9 >> 32));
        sb2.append(", ");
        return r8.k.o(sb2, (int) (j9 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f47280a == ((j) obj).f47280a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47280a);
    }

    public final String toString() {
        return e(this.f47280a);
    }
}
