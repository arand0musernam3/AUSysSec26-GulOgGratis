package ad;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1221b;

    public a(int i11) {
        this.f1221b = i11;
        if (i11 > 0) {
            return;
        }
        i4.a.f("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1221b == ((a) obj).f1221b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1221b;
    }

    public final String toString() {
        return String.valueOf(this.f1221b);
    }
}
