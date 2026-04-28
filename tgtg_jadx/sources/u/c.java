package u;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements b.a {
    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        String str = b.a.f5033a;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i11 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i11) {
            case 2:
                parcel.readInt();
                return true;
            case 3:
                parcel.readString();
                return true;
            case 4:
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 9:
                return true;
            case 10:
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                return true;
            case 11:
                return true;
            case 12:
                return true;
            default:
                return super.onTransact(i11, parcel, parcel2, i12);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
