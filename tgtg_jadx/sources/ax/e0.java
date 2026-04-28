package ax;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e0> CREATOR = new a00.p0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f4899b;

    public e0(Parcel parcel) {
        this.f4898a = parcel.readString();
        this.f4899b = parcel.readParcelable(a0.a().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f4898a);
        parcel.writeParcelable(this.f4899b, i11);
    }

    public e0(Parcelable parcelable) {
        this.f4898a = "image/png";
        this.f4899b = parcelable;
    }
}
