package android.support.v4.media.session;

import a00.p0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new p0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1675e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1671a);
        parcel.writeInt(this.f1673c);
        parcel.writeInt(this.f1674d);
        parcel.writeInt(this.f1675e);
        parcel.writeInt(this.f1672b);
    }
}
