package gj;

import com.app.tgtg.model.remote.mapService.response.FilterDiet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterDiet f20502a;

    public j(FilterDiet filterDiet) {
        filterDiet.getClass();
        this.f20502a = filterDiet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.areEqual(this.f20502a, ((j) obj).f20502a);
    }

    public final int hashCode() {
        return this.f20502a.hashCode();
    }

    public final String toString() {
        return "DietToggled(diet=" + this.f20502a + ")";
    }
}
