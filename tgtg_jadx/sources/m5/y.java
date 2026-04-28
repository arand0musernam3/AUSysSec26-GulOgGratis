package m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29672b;

    public y(long j9, long j11) {
        this.f29671a = j9;
        this.f29672b = j11;
        z5.p[] pVarArr = z5.o.f47288b;
        if ((j9 & 1095216660480L) == 0) {
            s5.a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j11 & 1095216660480L) == 0) {
            s5.a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return z5.o.a(this.f29671a, yVar.f29671a) && z5.o.a(this.f29672b, yVar.f29672b);
    }

    public final int hashCode() {
        z5.p[] pVarArr = z5.o.f47288b;
        return Integer.hashCode(7) + e0.f.b(Long.hashCode(this.f29671a) * 31, 31, this.f29672b);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) z5.o.d(this.f29671a)) + ", height=" + ((Object) z5.o.d(this.f29672b)) + ", placeholderVerticalAlign=" + ((Object) "TextCenter") + ')';
    }
}
