package xo;

import b3.i;
import r8.k;
import z5.f;
import z5.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f44482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f44483f;

    public b(boolean z11, boolean z12, boolean z13, long j9, float f11, float f12) {
        this.f44478a = z11;
        this.f44479b = z12;
        this.f44480c = z13;
        this.f44481d = j9;
        this.f44482e = f11;
        this.f44483f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f44478a == bVar.f44478a && this.f44479b == bVar.f44479b && this.f44480c == bVar.f44480c && this.f44481d == bVar.f44481d && f.c(this.f44482e, bVar.f44482e) && Float.compare(this.f44483f, bVar.f44483f) == 0 && Float.compare(1.8f, 1.8f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.8f) + k.a(k.a(e0.f.b(k.e(k.e(Boolean.hashCode(this.f44478a) * 31, 31, this.f44479b), 31, this.f44480c), 31, this.f44481d), this.f44482e, 31), this.f44483f, 31);
    }

    public final String toString() {
        String strC = h.c(this.f44481d);
        String strD = f.d(this.f44482e);
        StringBuilder sbP = i.p("ScreenSizing(isSmallScreen=", this.f44478a, ", isVerySmallScreen=", this.f44479b, ", isManufacturer=");
        sbP.append(this.f44480c);
        sbP.append(", imageSize=");
        sbP.append(strC);
        sbP.append(", cardImageHeight=");
        sbP.append(strD);
        sbP.append(", maxScaleX=");
        sbP.append(this.f44483f);
        sbP.append(", maxScaleY=1.8)");
        return sbP.toString();
    }
}
