package t00;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.functions.Function0;
import oz.m;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39342h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f39343i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j30.g gVar, rt.e eVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 9);
        this.f39343i = eVar;
    }

    @Override // a30.d
    public final boolean P(int i11, Parcel parcel, Parcel parcel2) {
        n00.c aVar;
        u00.g gVar;
        switch (this.f39342h) {
            case 0:
                if (i11 == 1) {
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder == null) {
                        aVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        aVar = iInterfaceQueryLocalInterface instanceof n00.c ? (n00.c) iInterfaceQueryLocalInterface : new n00.a(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 5);
                    }
                    n00.d.b(parcel);
                    i0.h(aVar);
                    om.a aVar2 = (om.a) ((mp.a) this.f39343i).f30061b;
                    try {
                        n00.a aVar3 = (n00.a) aVar;
                        Parcel parcelJ = aVar3.J(4, aVar3.L());
                        LatLng latLng = (LatLng) n00.d.a(parcelJ, LatLng.CREATOR);
                        parcelJ.recycle();
                        latLng.getClass();
                        aVar2.invoke(new st.b(latLng.f12145a, latLng.f12146b));
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                    } catch (RemoteException e5) {
                        y.l(e5);
                        return false;
                    }
                }
                break;
            case 1:
                m mVar = (m) this.f39343i;
                if (i11 == 1) {
                    ((Function0) mVar.f33836b).invoke();
                } else if (i11 == 2) {
                    ((Function0) mVar.f33837c).invoke();
                }
                parcel2.writeNoException();
                break;
            case 2:
                if (i11 == 1) {
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 == null) {
                        gVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        gVar = iInterfaceQueryLocalInterface2 instanceof u00.g ? (u00.g) iInterfaceQueryLocalInterface2 : new u00.g(strongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 5);
                    }
                    n00.d.b(parcel);
                    ((rt.e) this.f39343i).f38238a.invoke(new rt.d(new m(gVar)));
                    parcel2.writeNoException();
                }
                break;
            case 3:
                if (i11 == 1) {
                    ((om.c) ((mp.a) this.f39343i).f30061b).invoke();
                    parcel2.writeNoException();
                }
                break;
            case 4:
                if (i11 == 1) {
                    int i12 = parcel.readInt();
                    n00.d.b(parcel);
                    ((b) this.f39343i).a(i12);
                    parcel2.writeNoException();
                }
                break;
            case 5:
                if (i11 == 1) {
                    Function0 function0 = (Function0) ((mp.a) this.f39343i).f30061b;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    parcel2.writeNoException();
                }
                break;
            case 6:
                if (i11 == 1) {
                    ((a) this.f39343i).b();
                    parcel2.writeNoException();
                }
                break;
            default:
                if (i11 == 1) {
                    LatLng latLng2 = (LatLng) n00.d.a(parcel, LatLng.CREATOR);
                    n00.d.b(parcel);
                    om.c cVar = (om.c) ((mp.a) this.f39343i).f30061b;
                    latLng2.getClass();
                    cVar.invoke();
                    parcel2.writeNoException();
                }
                break;
        }
        return true;
    }

    public g(m mVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 9);
        this.f39343i = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, mp.a aVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 9);
        this.f39343i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, mp.a aVar, byte b8) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 9);
        this.f39343i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, mp.a aVar, char c3) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 9);
        this.f39343i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, mp.a aVar, int i11) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 9);
        this.f39343i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, a aVar) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 9);
        this.f39343i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, b bVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 9);
        this.f39343i = bVar;
    }
}
