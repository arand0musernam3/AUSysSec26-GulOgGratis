package p2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34127a;

    public a(int i11) {
        this.f34127a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f34127a == ((a) obj).f34127a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34127a;
    }
}
