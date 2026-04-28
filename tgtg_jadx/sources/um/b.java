package um;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseItemMnuV2 f41389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41390b;

    public b(BaseItemMnuV2 baseItemMnuV2, String str) {
        str.getClass();
        this.f41389a = baseItemMnuV2;
        this.f41390b = str;
    }

    @Override // um.d
    public final String a() {
        return this.f41390b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f41389a, bVar.f41389a) && Intrinsics.areEqual(this.f41390b, bVar.f41390b);
    }

    public final int hashCode() {
        return this.f41390b.hashCode() + (this.f41389a.hashCode() * 31);
    }

    public final String toString() {
        return "BasketRecommendedItemElement(basketItem=" + this.f41389a + ", elementId=" + this.f41390b + ")";
    }
}
