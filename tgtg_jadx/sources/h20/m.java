package h20;

import android.os.Parcel;
import android.os.Parcelable;
import e10.b0;
import e20.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new b0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f21342b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f21341a);
        parcel.writeParcelable(this.f21342b, 0);
    }
}
