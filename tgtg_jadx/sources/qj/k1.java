package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.model.local.AppConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f37114a = new k1();

    @NotNull
    public static final Parcelable.Creator<k1> CREATOR = new f1(4);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(ManageAccountActivity.class, null, false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_STORE_SIGNUP), null, null, null, false, 990);
    }

    @Override // qj.m
    public final String b() {
        return "settings";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k1);
    }

    public final int hashCode() {
        return 2073228268;
    }

    public final String toString() {
        return "SettingsDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
