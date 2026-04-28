package of;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f32490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f32491b;

    public g(Boolean bool, Double d3) {
        this.f32490a = bool;
        this.f32491b = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f32490a, gVar.f32490a) && Intrinsics.areEqual((Object) this.f32491b, (Object) gVar.f32491b);
    }

    public final int hashCode() {
        Boolean bool = this.f32490a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.f32491b;
        return iHashCode + (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateConfig(enabled=" + this.f32490a + ", sampleRate=" + this.f32491b + ')';
    }
}
