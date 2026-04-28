package yn;

import com.app.tgtg.model.remote.order.OrderType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderType f46280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46282c;

    public e(OrderType orderType, boolean z11, boolean z12) {
        orderType.getClass();
        this.f46280a = orderType;
        this.f46281b = z11;
        this.f46282c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f46280a == eVar.f46280a && this.f46281b == eVar.f46281b && this.f46282c == eVar.f46282c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46282c) + r8.k.e(this.f46280a.hashCode() * 31, 31, this.f46281b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Primary(orderType=");
        sb2.append(this.f46280a);
        sb2.append(", isEdible=");
        sb2.append(this.f46281b);
        sb2.append(", showNextDayDelivery=");
        return j4.s.o(sb2, this.f46282c, ")");
    }
}
