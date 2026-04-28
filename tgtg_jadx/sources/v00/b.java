package v00;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import n00.j;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f41635a;

    public b(j jVar) {
        i0.h(jVar);
        this.f41635a = jVar;
    }

    public final String a() {
        try {
            n00.h hVar = (n00.h) this.f41635a;
            Parcel parcelJ = hVar.J(2, hVar.L());
            String string = parcelJ.readString();
            parcelJ.recycle();
            return string;
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        try {
            j jVar = this.f41635a;
            j jVar2 = ((b) obj).f41635a;
            n00.h hVar = (n00.h) jVar;
            Parcel parcelL = hVar.L();
            n00.d.d(parcelL, jVar2);
            Parcel parcelJ = hVar.J(17, parcelL);
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
            n00.h hVar = (n00.h) this.f41635a;
            Parcel parcelJ = hVar.J(18, hVar.L());
            int i11 = parcelJ.readInt();
            parcelJ.recycle();
            return i11;
        } catch (RemoteException e5) {
            y.l(e5);
            return 0;
        }
    }
}
