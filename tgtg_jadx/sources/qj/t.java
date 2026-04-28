package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f37143a = new t();

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new oa.i(23);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(Co2eSavedActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return "me/impact-co2";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t);
    }

    public final int hashCode() {
        return -484816437;
    }

    public final String toString() {
        return "Co2eSavedDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
