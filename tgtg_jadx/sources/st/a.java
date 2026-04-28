package st;

import android.os.Parcel;
import android.os.RemoteException;
import ba0.g;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import qc.y;
import rt.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface a {
    static void a(a aVar, xk.a aVar2, float f11, int i11) {
        jb.b bVar;
        if ((i11 & 2) != 0) {
            f11 = 15.0f;
        }
        d dVar = (d) aVar;
        dVar.getClass();
        LatLngInfo latLngInfo = aVar2.f44436a;
        Integer num = aVar2.f44439d;
        if (latLngInfo != null) {
            if (num != null && num.intValue() == 0) {
                bVar = g.E(xz.b.L(latLngInfo), f11);
            } else {
                xk.b bVar2 = aVar2.f44437b;
                bVar2.getClass();
                v00.d dVar2 = new v00.d();
                dVar2.f41645a = Double.POSITIVE_INFINITY;
                dVar2.f41646b = Double.NEGATIVE_INFINITY;
                dVar2.f41647c = Double.NaN;
                dVar2.f41648d = Double.NaN;
                dVar2.a(xz.b.L(bVar2.f44440a));
                dVar2.a(xz.b.L(bVar2.f44441b));
                i0.j("no included points", !Double.isNaN(dVar2.f41647c));
                LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar2.f41645a, dVar2.f41647c), new LatLng(dVar2.f41646b, dVar2.f41648d));
                Integer num2 = aVar2.f44438c;
                num2.getClass();
                int iIntValue = num2.intValue();
                num.getClass();
                int iIntValue2 = num.intValue();
                try {
                    u00.a aVar3 = g.f6090e;
                    i0.i(aVar3, "CameraUpdateFactory is not initialized");
                    Parcel parcelL = aVar3.L();
                    n00.d.c(parcelL, latLngBounds);
                    parcelL.writeInt(iIntValue);
                    parcelL.writeInt(iIntValue2);
                    parcelL.writeInt(0);
                    Parcel parcelJ = aVar3.J(11, parcelL);
                    yz.a aVarU = yz.b.U(parcelJ.readStrongBinder());
                    parcelJ.recycle();
                    bVar = new jb.b(aVarU);
                } catch (RemoteException e5) {
                    y.l(e5);
                    return;
                }
            }
            try {
                u00.g gVar = (u00.g) dVar.f38233a.f33836b;
                yz.a aVar4 = (yz.a) bVar.f24851a;
                Parcel parcelL2 = gVar.L();
                n00.d.d(parcelL2, aVar4);
                gVar.M(4, parcelL2);
            } catch (RemoteException e11) {
                y.l(e11);
            }
        }
    }
}
