package wi;

import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.payment.Price;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Price f43430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryOptionMethod f43431b;

    public d(Price price, DeliveryOptionMethod deliveryOptionMethod) {
        deliveryOptionMethod.getClass();
        this.f43430a = price;
        this.f43431b = deliveryOptionMethod;
    }

    @Override // wi.c
    public final String a() {
        return "MDO_PICKUP_TITLE";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f43430a, dVar.f43430a) && this.f43431b == dVar.f43431b && Intrinsics.areEqual("MDO_PICKUP_TITLE", "MDO_PICKUP_TITLE");
    }

    public final int hashCode() {
        return ((this.f43431b.hashCode() + ((this.f43430a == null ? 0 : r0.hashCode()) * 31)) * 31) - 707963396;
    }

    public final String toString() {
        return "DeliveryOptionTitleElement(price=" + this.f43430a + ", deliveryOptionMethod=" + this.f43431b + ", elementId=MDO_PICKUP_TITLE)";
    }
}
