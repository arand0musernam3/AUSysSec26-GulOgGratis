package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34415d;

    public v(float f11, float f12) {
        super(3);
        this.f34414c = f11;
        this.f34415d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f34414c, vVar.f34414c) == 0 && Float.compare(this.f34415d, vVar.f34415d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34415d) + (Float.hashCode(this.f34414c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f34414c);
        sb2.append(", dy=");
        return r8.k.n(sb2, this.f34415d, ')');
    }
}
