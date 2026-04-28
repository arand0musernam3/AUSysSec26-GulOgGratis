package gj;

import com.app.tgtg.model.remote.mapService.response.FilterChipId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterChipId f20495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20496b;

    public d(FilterChipId filterChipId, boolean z11) {
        filterChipId.getClass();
        this.f20495a = filterChipId;
        this.f20496b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20495a == dVar.f20495a && this.f20496b == dVar.f20496b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20496b) + (this.f20495a.hashCode() * 31);
    }

    public final String toString() {
        return "ChipApplied(chipId=" + this.f20495a + ", captureMapReloadBaseline=" + this.f20496b + ")";
    }
}
