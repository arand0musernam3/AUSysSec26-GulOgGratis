package m3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29278a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f29278a) {
            case 0:
                return new g1(parcel.readFloat());
            case 1:
                return new h1(parcel.readInt());
            default:
                return new i1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f29278a) {
            case 0:
                return new g1[i11];
            case 1:
                return new h1[i11];
            default:
                return new i1[i11];
        }
    }
}
