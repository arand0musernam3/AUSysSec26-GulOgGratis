package h7;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f21513c;

    public a0(int i11, int i12, Point point) {
        int i13 = point.x;
        int i14 = point.y;
        this.f21511a = i11;
        this.f21512b = i12;
        this.f21513c = new Point(i13, i14);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f21511a == a0Var.f21511a && this.f21512b == a0Var.f21512b && this.f21513c.equals(a0Var.f21513c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21513c.hashCode() + (((this.f21511a * 31) + this.f21512b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i11 = this.f21511a;
        sb2.append(i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb2.append(", radius=");
        sb2.append(this.f21512b);
        sb2.append(", center=");
        sb2.append(this.f21513c);
        sb2.append('}');
        return sb2.toString();
    }
}
