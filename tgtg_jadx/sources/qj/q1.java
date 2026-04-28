package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f37135a = new q1();

    @NotNull
    public static final Parcelable.Creator<q1> CREATOR = new f1(10);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q1);
    }

    public final int hashCode() {
        return -2118251249;
    }

    public final String toString() {
        return "VoucherListDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
