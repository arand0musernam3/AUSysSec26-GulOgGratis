package w2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42944d;

    public j(int i11, int i12, int i13, int i14) {
        this.f42941a = i11;
        this.f42942b = i12;
        this.f42943c = i13;
        this.f42944d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f42941a == jVar.f42941a && this.f42942b == jVar.f42942b && this.f42943c == jVar.f42943c && this.f42944d == jVar.f42944d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42944d) + r8.k.b(this.f42943c, r8.k.b(this.f42942b, Integer.hashCode(this.f42941a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Change(preStart=");
        sb2.append(this.f42941a);
        sb2.append(", preEnd=");
        sb2.append(this.f42942b);
        sb2.append(", originalStart=");
        sb2.append(this.f42943c);
        sb2.append(", originalEnd=");
        return r8.k.o(sb2, this.f42944d, ')');
    }
}
