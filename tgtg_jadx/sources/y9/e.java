package y9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IBinder f45657g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45657g;
    }

    @Override // y9.f
    public final void k(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(f.f45658e);
            parcelObtain.writeStringArray(strArr);
            this.f45657g.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
