package ok;

import com.app.tgtg.model.remote.item.LatLngInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLngInfo f32587a;

    public e0(LatLngInfo latLngInfo) {
        latLngInfo.getClass();
        this.f32587a = latLngInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.areEqual(this.f32587a, ((e0) obj).f32587a) && Intrinsics.areEqual("Directions", "Directions");
    }

    public final int hashCode() {
        return (this.f32587a.hashCode() * 31) - 2077047564;
    }

    public final String toString() {
        return "GoToMap(latLngInfo=" + this.f32587a + ", source=Directions)";
    }
}
