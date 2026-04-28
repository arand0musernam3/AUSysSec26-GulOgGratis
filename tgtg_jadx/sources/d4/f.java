package d4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f14048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final se.b f14049d;

    public f(int i11, long j9, g gVar, se.b bVar) {
        this.f14046a = i11;
        this.f14047b = j9;
        this.f14048c = gVar;
        this.f14049d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14046a == fVar.f14046a && this.f14047b == fVar.f14047b && this.f14048c == fVar.f14048c && Intrinsics.areEqual(this.f14049d, fVar.f14049d);
    }

    public final int hashCode() {
        int iHashCode = (this.f14048c.hashCode() + e0.f.b(Integer.hashCode(this.f14046a) * 31, 31, this.f14047b)) * 31;
        se.b bVar = this.f14049d;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f14046a + ", timestamp=" + this.f14047b + ", type=" + this.f14048c + ", structureCompat=" + this.f14049d + ')';
    }
}
