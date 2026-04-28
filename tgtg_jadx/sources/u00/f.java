package u00;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends m5 {
    public final a O() {
        a aVar;
        Parcel parcelJ = J(4, L());
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 5);
        }
        parcelJ.recycle();
        return aVar;
    }

    public final h P(yz.b bVar, GoogleMapOptions googleMapOptions) {
        h hVar;
        Parcel parcelL = L();
        n00.d.d(parcelL, bVar);
        n00.d.c(parcelL, googleMapOptions);
        Parcel parcelJ = J(3, parcelL);
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            hVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 5);
        }
        parcelJ.recycle();
        return hVar;
    }

    public final n00.g Q() {
        n00.g eVar;
        Parcel parcelJ = J(5, L());
        IBinder strongBinder = parcelJ.readStrongBinder();
        int i11 = n00.f.f30269h;
        if (strongBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            eVar = iInterfaceQueryLocalInterface instanceof n00.g ? (n00.g) iInterfaceQueryLocalInterface : new n00.e(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 5);
        }
        parcelJ.recycle();
        return eVar;
    }
}
