package v00;

import android.os.Parcel;
import android.os.RemoteException;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n00.c f41650a;

    public f(n00.c cVar) {
        this.f41650a = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            n00.c cVar = this.f41650a;
            n00.c cVar2 = ((f) obj).f41650a;
            n00.a aVar = (n00.a) cVar;
            Parcel parcelL = aVar.L();
            n00.d.d(parcelL, cVar2);
            Parcel parcelJ = aVar.J(16, parcelL);
            boolean z11 = parcelJ.readInt() != 0;
            parcelJ.recycle();
            return z11;
        } catch (RemoteException e5) {
            y.l(e5);
            return false;
        }
    }

    public final int hashCode() {
        try {
            n00.a aVar = (n00.a) this.f41650a;
            Parcel parcelJ = aVar.J(17, aVar.L());
            int i11 = parcelJ.readInt();
            parcelJ.recycle();
            return i11;
        } catch (RemoteException e5) {
            y.l(e5);
            return 0;
        }
    }
}
