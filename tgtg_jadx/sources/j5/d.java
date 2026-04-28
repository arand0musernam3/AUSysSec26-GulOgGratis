package j5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24620b;

    public d(int i11, int i12) {
        this.f24619a = i11;
        this.f24620b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24619a == dVar.f24619a && this.f24620b == dVar.f24620b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24620b) + (Integer.hashCode(this.f24619a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f24619a);
        sb2.append(", columnCount=");
        return r8.k.o(sb2, this.f24620b, ')');
    }
}
