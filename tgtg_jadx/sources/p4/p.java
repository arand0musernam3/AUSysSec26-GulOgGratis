package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34395f;

    public p(float f11, float f12, float f13, float f14) {
        super(2);
        this.f34392c = f11;
        this.f34393d = f12;
        this.f34394e = f13;
        this.f34395f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f34392c, pVar.f34392c) == 0 && Float.compare(this.f34393d, pVar.f34393d) == 0 && Float.compare(this.f34394e, pVar.f34394e) == 0 && Float.compare(this.f34395f, pVar.f34395f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34395f) + r8.k.a(r8.k.a(Float.hashCode(this.f34392c) * 31, this.f34393d, 31), this.f34394e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f34392c);
        sb2.append(", y1=");
        sb2.append(this.f34393d);
        sb2.append(", x2=");
        sb2.append(this.f34394e);
        sb2.append(", y2=");
        return r8.k.n(sb2, this.f34395f, ')');
    }
}
