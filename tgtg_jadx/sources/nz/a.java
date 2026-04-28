package nz;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements c, IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f31451g;

    public a(IBinder iBinder) {
        this.f31451g = iBinder;
    }

    public final void a(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f31451g.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31451g;
    }
}
