package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f37126a = new o0();

    @NotNull
    public static final Parcelable.Creator<o0> CREATOR = new a0(13);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(LocationPickerActivity.class, jb.u.x(new Pair("ORIGIN", f70.i.DEEP_LINK)), false, false, false, 1212, null, Integer.valueOf(R.anim.slide_in_from_bottom_to_top), Integer.valueOf(R.anim.stay), false, 604);
    }

    @Override // qj.m
    public final String b() {
        return "location";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o0);
    }

    public final int hashCode() {
        return 2117167660;
    }

    public final String toString() {
        return "LocationPickerDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
