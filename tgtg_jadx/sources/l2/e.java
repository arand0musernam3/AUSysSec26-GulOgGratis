package l2;

import c5.l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b, l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26789a;

    public e(float f11) {
        this.f26789a = f11;
        if (f11 < 0.0f || f11 > 100.0f) {
            c2.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // l2.b
    public final float a(long j9, z5.c cVar) {
        return (this.f26789a / 100.0f) * h4.e.c(j9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f26789a, ((e) obj).f26789a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26789a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f26789a + "%)";
    }
}
