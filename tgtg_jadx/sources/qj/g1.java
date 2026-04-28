package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends m {

    @NotNull
    public static final Parcelable.Creator<g1> CREATOR = new f1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37094b;

    public g1(String str, String str2) {
        this.f37093a = str;
        this.f37094b = str2;
    }

    @Override // qj.m
    public final f70.b a() {
        String str = this.f37094b;
        if (str != null) {
            androidx.core.app.n nVar = new androidx.core.app.n(OrderType.MAGICBAG);
            nVar.f2638e = str;
            f70.i iVar = f70.i.DEEP_LINK;
            iVar.getClass();
            nVar.f2639f = iVar;
            nVar.f2634a = true;
            nVar.f2635b = true;
            return nVar.b();
        }
        String str2 = this.f37093a;
        if (str2 == null) {
            return new f70.b(OrderListActivity.class, null, false, false, false, 1000, null, null, null, false, 990);
        }
        androidx.core.app.n nVar2 = new androidx.core.app.n(OrderType.MAGICBAG);
        nVar2.f2637d = OrderId.m210constructorimpl(str2);
        f70.i iVar2 = f70.i.DEEP_LINK;
        iVar2.getClass();
        nVar2.f2639f = iVar2;
        nVar2.f2634a = true;
        nVar2.f2635b = true;
        return nVar2.b();
    }

    @Override // qj.m
    public final cv.i c() {
        return cv.i.NOTIFICATION_OPENED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.areEqual(this.f37093a, g1Var.f37093a) && Intrinsics.areEqual(this.f37094b, g1Var.f37094b);
    }

    public final int hashCode() {
        String str = this.f37093a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f37094b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("RatingDeepLink(orderId=", this.f37093a, ", invitationId=", this.f37094b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37093a);
        parcel.writeString(this.f37094b);
    }
}
