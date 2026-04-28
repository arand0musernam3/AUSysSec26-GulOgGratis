package f3;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17250d;

    public b(float f11, float f12, float f13, float f14) {
        this.f17247a = f11;
        this.f17248b = f12;
        this.f17249c = f13;
        this.f17250d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17247a == bVar.f17247a && this.f17248b == bVar.f17248b && this.f17249c == bVar.f17249c && this.f17250d == bVar.f17250d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17250d) + k.a(k.a(Float.hashCode(this.f17247a) * 31, this.f17248b, 31), this.f17249c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f17247a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f17248b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f17249c);
        sb2.append(", pressedAlpha=");
        return k.n(sb2, this.f17250d, ')');
    }
}
