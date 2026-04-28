package co;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8782b;

    public p(int i11, int i12) {
        this.f8781a = i11;
        this.f8782b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8781a == pVar.f8781a && this.f8782b == pVar.f8782b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8782b) + (Integer.hashCode(this.f8781a) * 31);
    }

    public final String toString() {
        return r8.k.g(this.f8781a, this.f8782b, "BlobMargins(top=", ", bottom=", ")");
    }
}
