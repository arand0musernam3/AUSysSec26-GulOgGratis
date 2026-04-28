package oz;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33810a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f33810a) {
            case 0:
                int iX = jf.e.X(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        jf.e.W(i11, parcel);
                    } else {
                        intent = (Intent) jf.e.v(parcel, i11, Intent.CREATOR);
                    }
                }
                jf.e.B(iX, parcel);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        switch (this.f33810a) {
            case 0:
                return new a[i11];
            default:
                return new g[i11];
        }
    }
}
