package gj;

import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterChipOption f20507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20508b;

    public o(FilterChipOption filterChipOption, List list) {
        filterChipOption.getClass();
        list.getClass();
        this.f20507a = filterChipOption;
        this.f20508b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f20507a, oVar.f20507a) && Intrinsics.areEqual(this.f20508b, oVar.f20508b);
    }

    public final int hashCode() {
        return this.f20508b.hashCode() + (this.f20507a.hashCode() * 31);
    }

    public final String toString() {
        return "SheetOpened(chip=" + this.f20507a + ", sortOptions=" + this.f20508b + ")";
    }
}
