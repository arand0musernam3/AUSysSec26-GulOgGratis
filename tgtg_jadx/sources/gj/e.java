package gj;

import com.app.tgtg.model.remote.mapService.response.FilterChipId;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterChipId f20497a;

    public e(FilterChipId filterChipId) {
        filterChipId.getClass();
        this.f20497a = filterChipId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f20497a == ((e) obj).f20497a;
    }

    public final int hashCode() {
        return this.f20497a.hashCode();
    }

    public final String toString() {
        return "ChipReset(chipId=" + this.f20497a + ")";
    }
}
