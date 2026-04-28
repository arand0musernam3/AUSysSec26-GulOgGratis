package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f37152a = new v0();

    @NotNull
    public static final Parcelable.Creator<v0> CREATOR = new a0(20);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(OrderListActivity.class, null, false, false, false, 1000, null, null, null, false, 990);
    }

    @Override // qj.m
    public final String b() {
        return "me/orderhistory";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v0);
    }

    public final int hashCode() {
        return -1174111057;
    }

    public final String toString() {
        return "OrderHistoryDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
