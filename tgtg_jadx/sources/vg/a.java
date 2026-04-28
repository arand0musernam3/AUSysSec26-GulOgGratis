package vg;

import com.app.tgtg.model.remote.item.LatLngInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f42317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLngInfo f42318b;

    public a(f fVar, LatLngInfo latLngInfo) {
        fVar.getClass();
        latLngInfo.getClass();
        this.f42317a = fVar;
        this.f42318b = latLngInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42317a == aVar.f42317a && Intrinsics.areEqual(this.f42318b, aVar.f42318b);
    }

    public final int hashCode() {
        return this.f42318b.hashCode() + (this.f42317a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressPickerMapState(source=" + this.f42317a + ", latLng=" + this.f42318b + ")";
    }
}
