package n80;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final m f30725e = new m(null);

    static {
        new n(1L, 0L);
    }

    public n(long j9, long j11) {
        super(j9, j11, 1L);
    }

    @Override // n80.k
    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (isEmpty() && ((n) obj).isEmpty()) {
            return true;
        }
        n nVar = (n) obj;
        return this.f30718a == nVar.f30718a && this.f30719b == nVar.f30719b;
    }

    @Override // n80.k
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j9 = this.f30718a;
        long j11 = ((long) 31) * (j9 ^ (j9 >>> 32));
        long j12 = this.f30719b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    @Override // n80.k
    public final boolean isEmpty() {
        return this.f30718a > this.f30719b;
    }

    @Override // n80.k
    public final String toString() {
        return this.f30718a + ".." + this.f30719b;
    }
}
