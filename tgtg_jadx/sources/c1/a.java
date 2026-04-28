package c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6.i f6837c;

    public a(int i11, int i12, e6.i iVar) {
        this.f6835a = i11;
        this.f6836b = i12;
        this.f6837c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6835a == aVar.f6835a && this.f6836b == aVar.f6836b && this.f6837c.equals(aVar.f6837c);
    }

    public final int hashCode() {
        return ((((this.f6835a ^ 1000003) * 1000003) ^ this.f6836b) * 1000003) ^ this.f6837c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f6835a + ", rotationDegrees=" + this.f6836b + ", completer=" + this.f6837c + "}";
    }
}
