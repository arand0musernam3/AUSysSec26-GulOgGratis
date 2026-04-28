package v00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends rz.a {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = new s00.e(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f41670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f41671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f41672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f41673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLngBounds f41674e;

    public i(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f41670a = latLng;
        this.f41671b = latLng2;
        this.f41672c = latLng3;
        this.f41673d = latLng4;
        this.f41674e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f41670a.equals(iVar.f41670a) && this.f41671b.equals(iVar.f41671b) && this.f41672c.equals(iVar.f41672c) && this.f41673d.equals(iVar.f41673d) && this.f41674e.equals(iVar.f41674e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41670a, this.f41671b, this.f41672c, this.f41673d, this.f41674e});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(this.f41670a, "nearLeft");
        qVar.b(this.f41671b, "nearRight");
        qVar.b(this.f41672c, "farLeft");
        qVar.b(this.f41673d, "farRight");
        qVar.b(this.f41674e, "latLngBounds");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 2, this.f41670a, i11);
        u.a0(parcel, 3, this.f41671b, i11);
        u.a0(parcel, 4, this.f41672c, i11);
        u.a0(parcel, 5, this.f41673d, i11);
        u.a0(parcel, 6, this.f41674e, i11);
        u.i0(iH0, parcel);
    }
}
