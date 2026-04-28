package wi;

import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickupOptionLocal f43427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryOptionMethod f43428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43429c;

    public b(PickupOptionLocal pickupOptionLocal, DeliveryOptionMethod deliveryOptionMethod, String str) {
        deliveryOptionMethod.getClass();
        str.getClass();
        this.f43427a = pickupOptionLocal;
        this.f43428b = deliveryOptionMethod;
        this.f43429c = str;
    }

    @Override // wi.c
    public final String a() {
        return this.f43429c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f43427a, bVar.f43427a) && this.f43428b == bVar.f43428b && Intrinsics.areEqual(this.f43429c, bVar.f43429c);
    }

    public final int hashCode() {
        return this.f43429c.hashCode() + ((this.f43428b.hashCode() + (this.f43427a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryOptionItemElement(pickupOptionLocal=");
        sb2.append(this.f43427a);
        sb2.append(", deliveryOptionMethod=");
        sb2.append(this.f43428b);
        sb2.append(", elementId=");
        return r8.k.p(sb2, this.f43429c, ")");
    }
}
