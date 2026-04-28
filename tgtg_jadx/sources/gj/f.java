package gj;

import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterChipOption f20498a;

    public f(FilterChipOption filterChipOption) {
        this.f20498a = filterChipOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f20498a, ((f) obj).f20498a);
    }

    public final int hashCode() {
        return this.f20498a.hashCode();
    }

    public final String toString() {
        return "CollectNowToggled(chip=" + this.f20498a + ")";
    }
}
