package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34413d;

    public u(float f11, float f12) {
        super(3);
        this.f34412c = f11;
        this.f34413d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f34412c, uVar.f34412c) == 0 && Float.compare(this.f34413d, uVar.f34413d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34413d) + (Float.hashCode(this.f34412c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f34412c);
        sb2.append(", dy=");
        return r8.k.n(sb2, this.f34413d, ')');
    }
}
