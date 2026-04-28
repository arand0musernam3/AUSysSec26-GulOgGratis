package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f37109a = new j();

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new oa.i(14);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return "settings/accountdetails";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j);
    }

    public final int hashCode() {
        return 809632478;
    }

    public final String toString() {
        return "AccountDetailsDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
