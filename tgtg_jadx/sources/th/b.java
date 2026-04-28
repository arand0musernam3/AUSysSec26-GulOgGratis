package th;

import com.app.tgtg.model.remote.item.response.CateringItem;
import f70.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CateringItem f40183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40184b;

    public b(CateringItem cateringItem) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f40183a = cateringItem;
        this.f40184b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f40183a, bVar.f40183a) && this.f40184b == bVar.f40184b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40184b) + (this.f40183a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenAllergensBottomSheet(item=" + this.f40183a + ", timestamp=" + this.f40184b + ")";
    }
}
