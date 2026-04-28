package wi;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryOptionMethod f43433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43437f;

    public e(int i11, DeliveryOptionMethod deliveryOptionMethod, String str, boolean z11, int i12, boolean z12) {
        deliveryOptionMethod.getClass();
        this.f43432a = i11;
        this.f43433b = deliveryOptionMethod;
        this.f43434c = str;
        this.f43435d = z11;
        this.f43436e = i12;
        this.f43437f = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L45
        L4:
            boolean r1 = r5 instanceof wi.e
            r2 = 0
            if (r1 != 0) goto La
            goto L44
        La:
            wi.e r5 = (wi.e) r5
            int r1 = r4.f43432a
            int r3 = r5.f43432a
            if (r1 == r3) goto L13
            goto L44
        L13:
            com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod r1 = r4.f43433b
            com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod r3 = r5.f43433b
            if (r1 == r3) goto L1a
            goto L44
        L1a:
            java.lang.String r1 = r5.f43434c
            java.lang.String r3 = r4.f43434c
            if (r3 != 0) goto L26
            if (r1 != 0) goto L24
            r1 = r0
            goto L2d
        L24:
            r1 = r2
            goto L2d
        L26:
            if (r1 != 0) goto L29
            goto L24
        L29:
            boolean r1 = com.app.tgtg.model.remote.ParcelDeliveryOptionId.m225equalsimpl0(r3, r1)
        L2d:
            if (r1 != 0) goto L30
            goto L44
        L30:
            boolean r1 = r4.f43435d
            boolean r3 = r5.f43435d
            if (r1 == r3) goto L37
            goto L44
        L37:
            int r1 = r4.f43436e
            int r3 = r5.f43436e
            if (r1 == r3) goto L3e
            goto L44
        L3e:
            boolean r1 = r4.f43437f
            boolean r5 = r5.f43437f
            if (r1 == r5) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.f43433b.hashCode() + (Integer.hashCode(this.f43432a) * 31)) * 31;
        String str = this.f43434c;
        return Boolean.hashCode(this.f43437f) + r8.k.b(this.f43436e, r8.k.e((iHashCode + (str == null ? 0 : ParcelDeliveryOptionId.m226hashCodeimpl(str))) * 31, 31, this.f43435d), 31);
    }

    public final String toString() {
        String str = this.f43434c;
        String strM227toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : ParcelDeliveryOptionId.m227toStringimpl(str);
        StringBuilder sb2 = new StringBuilder("MdoCardData(pos=");
        sb2.append(this.f43432a);
        sb2.append(", deliveryOptionMethod=");
        sb2.append(this.f43433b);
        sb2.append(", selectedPickupOptionId=");
        r8.k.z(sb2, strM227toStringimpl, ", isOverview=", this.f43435d, ", homeCount=");
        sb2.append(this.f43436e);
        sb2.append(", isMultiItem=");
        sb2.append(this.f43437f);
        sb2.append(")");
        return sb2.toString();
    }
}
