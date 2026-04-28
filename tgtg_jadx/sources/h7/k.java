package h7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21574c;

    public k(String str, int i11, int i12) {
        this.f21572a = str;
        this.f21573b = i11;
        this.f21574c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f21572a.equals(kVar.f21572a) && this.f21573b == kVar.f21573b && this.f21574c == kVar.f21574c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f21573b);
        Integer numValueOf2 = Integer.valueOf(this.f21574c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f21572a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayShapeCompat{ spec=");
        sb2.append(Integer.valueOf(this.f21572a.hashCode()));
        sb2.append(" displayWidth=");
        sb2.append(this.f21573b);
        sb2.append(" displayHeight=");
        return r8.k.i(this.f21574c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb2);
    }
}
