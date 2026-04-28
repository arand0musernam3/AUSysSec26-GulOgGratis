package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends m {

    @NotNull
    public static final Parcelable.Creator<u0> CREATOR = new a0(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderType f37150b;

    public u0(String str, OrderType orderType) {
        str.getClass();
        orderType.getClass();
        this.f37149a = str;
        this.f37150b = orderType;
    }

    @Override // qj.m
    public final f70.b a() {
        androidx.core.app.n nVar = new androidx.core.app.n(this.f37150b);
        nVar.f2637d = OrderId.m210constructorimpl(this.f37149a);
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        nVar.f2639f = iVar;
        nVar.f2634a = true;
        nVar.f2635b = true;
        return nVar.b();
    }

    @Override // qj.m
    public final String b() {
        return "receipts/details";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(this.f37149a, u0Var.f37149a) && this.f37150b == u0Var.f37150b;
    }

    public final int hashCode() {
        return this.f37150b.hashCode() + (this.f37149a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderDetailsDeepLink(orderId=" + this.f37149a + ", orderType=" + this.f37150b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37149a);
        parcel.writeString(this.f37150b.name());
    }
}
