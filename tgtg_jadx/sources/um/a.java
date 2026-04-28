package um;

import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasketItem f41387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41388b;

    public a(BasketItem basketItem, String str) {
        str.getClass();
        this.f41387a = basketItem;
        this.f41388b = str;
    }

    @Override // um.d
    public final String a() {
        return this.f41388b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f41387a, aVar.f41387a) && Intrinsics.areEqual(this.f41388b, aVar.f41388b);
    }

    public final int hashCode() {
        return this.f41388b.hashCode() + (this.f41387a.hashCode() * 31);
    }

    public final String toString() {
        return "BasketItemElement(basketItem=" + this.f41387a + ", elementId=" + this.f41388b + ")";
    }
}
