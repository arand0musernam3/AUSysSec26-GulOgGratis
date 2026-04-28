package gj;

import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterCategory f20479a;

    public c(FilterCategory filterCategory) {
        filterCategory.getClass();
        this.f20479a = filterCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f20479a, ((c) obj).f20479a);
    }

    public final int hashCode() {
        return this.f20479a.hashCode();
    }

    public final String toString() {
        return "CategoryToggled(category=" + this.f20479a + ")";
    }
}
