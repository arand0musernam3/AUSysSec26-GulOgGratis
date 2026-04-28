package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f37070a = new c1();

    @NotNull
    public static final Parcelable.Creator<c1> CREATOR = new a0(27);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(ManufacturerItemDetailsActivity.class, null, true, false, false, null, null, null, null, false, 1018);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c1);
    }

    public final int hashCode() {
        return 118397668;
    }

    public final String toString() {
        return "PaymentManufactureDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
