package f30;

import android.os.Parcel;
import android.os.Parcelable;
import e10.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b0(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f17273a, 0);
        parcel.writeInt(bVar.f17274b ? 1 : 0);
    }
}
