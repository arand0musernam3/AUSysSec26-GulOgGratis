package um;

import com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetRecommendedManufacturerItemsResponse f41391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41393c = "BASKET_RECOMMEND_CAROUSEL";

    public c(GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse, int i11) {
        this.f41391a = getRecommendedManufacturerItemsResponse;
        this.f41392b = i11;
    }

    @Override // um.d
    public final String a() {
        return this.f41393c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f41391a, cVar.f41391a) && this.f41392b == cVar.f41392b && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f41393c, cVar.f41393c);
    }

    public final int hashCode() {
        return this.f41393c.hashCode() + r8.k.b(this.f41392b, this.f41391a.hashCode() * 31, 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasketRecommendedItemsElement(basketItem=");
        sb2.append(this.f41391a);
        sb2.append(", maxItemLimit=");
        sb2.append(this.f41392b);
        sb2.append(", bucketId=null, elementId=");
        return r8.k.p(sb2, this.f41393c, ")");
    }
}
