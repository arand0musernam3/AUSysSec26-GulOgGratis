package vd;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f42224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f42225d;

    public d(float f11, float f12, float f13, float f14) {
        this.f42222a = f11;
        this.f42223b = f12;
        this.f42224c = f13;
        this.f42225d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f42222a, dVar.f42222a) == 0 && Float.compare(this.f42223b, dVar.f42223b) == 0 && Float.compare(this.f42224c, dVar.f42224c) == 0 && Float.compare(this.f42225d, dVar.f42225d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42225d) + k.a(k.a(Float.hashCode(this.f42222a) * 31, this.f42223b, 31), this.f42224c, 31);
    }

    public final String toString() {
        return "ViewBox(left=" + this.f42222a + ", top=" + this.f42223b + ", right=" + this.f42224c + ", bottom=" + this.f42225d + ")";
    }
}
