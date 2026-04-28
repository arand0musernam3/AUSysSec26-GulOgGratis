package zz;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends m5 {
    public final yz.a O(yz.b bVar, String str, int i11) {
        Parcel parcelL = L();
        j00.h.b(parcelL, bVar);
        parcelL.writeString(str);
        parcelL.writeInt(i11);
        Parcel parcelC = C(2, parcelL);
        yz.a aVarU = yz.b.U(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarU;
    }

    public final yz.a P(yz.b bVar, String str, int i11) {
        Parcel parcelL = L();
        j00.h.b(parcelL, bVar);
        parcelL.writeString(str);
        parcelL.writeInt(i11);
        Parcel parcelC = C(4, parcelL);
        yz.a aVarU = yz.b.U(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarU;
    }

    public final yz.a Q(yz.b bVar, String str, boolean z11, long j9) {
        Parcel parcelL = L();
        j00.h.b(parcelL, bVar);
        parcelL.writeString(str);
        parcelL.writeInt(z11 ? 1 : 0);
        parcelL.writeLong(j9);
        Parcel parcelC = C(7, parcelL);
        yz.a aVarU = yz.b.U(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarU;
    }

    public final yz.a R(yz.b bVar, String str, int i11, yz.b bVar2) {
        Parcel parcelL = L();
        j00.h.b(parcelL, bVar);
        parcelL.writeString(str);
        parcelL.writeInt(i11);
        j00.h.b(parcelL, bVar2);
        Parcel parcelC = C(8, parcelL);
        yz.a aVarU = yz.b.U(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarU;
    }
}
