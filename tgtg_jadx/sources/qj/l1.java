package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f37117a = new l1();

    @NotNull
    public static final Parcelable.Creator<l1> CREATOR = new f1(5);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(SpecialRewardsActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return "settings/specialrewards";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l1);
    }

    public final int hashCode() {
        return 1744209332;
    }

    public final String toString() {
        return "SpecialRewardsDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
