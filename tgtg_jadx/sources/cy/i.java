package cy;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13516e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f13512a);
        parcel.writeString(this.f13513b);
        parcel.writeString(this.f13514c);
        parcel.writeLong(this.f13515d);
        parcel.writeLong(this.f13516e);
    }
}
