package q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35783a;

    public /* synthetic */ l(long j9) {
        this.f35783a = j9;
    }

    public static long a(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f35783a == ((l) obj).f35783a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35783a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j9 = this.f35783a;
        sb2.append((int) (j9 >> 32));
        sb2.append(", ");
        return r8.k.o(sb2, (int) (j9 & 4294967295L), ')');
    }
}
