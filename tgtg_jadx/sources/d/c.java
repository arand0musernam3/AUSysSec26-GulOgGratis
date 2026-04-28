package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13655h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f13656g;

    public c(d dVar) {
        this.f13656g = dVar;
        attachInterface(this, b.f13654d);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        String str = b.f13654d;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i11 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i11 != 1) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        this.f13656g.a(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
