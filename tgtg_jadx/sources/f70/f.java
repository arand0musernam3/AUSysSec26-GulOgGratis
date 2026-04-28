package f70;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17489b;

    public f(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str.getClass();
        this.f17488a = str;
        this.f17489b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f17488a, fVar.f17488a) && this.f17489b == fVar.f17489b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17489b) + (this.f17488a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbN = b3.i.n(this.f17489b, "ShowToastEvent(message=", this.f17488a, ", timestamp=");
        sbN.append(")");
        return sbN.toString();
    }
}
