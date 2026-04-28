package m00;

import a3.i3;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends a30.d implements s00.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28659i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3 f28660h;

    public g(i3 i3Var) {
        super("com.google.android.gms.location.ILocationCallback", 8);
        this.f28660h = i3Var;
    }

    @Override // a30.d
    public final boolean O(int i11, Parcel parcel) {
        i3 i3Var = this.f28660h;
        if (i11 == 1) {
            LocationResult locationResult = (LocationResult) b.a(parcel, LocationResult.CREATOR);
            b.c(parcel);
            i3Var.z().a(new jd.f(locationResult, 9));
            return true;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return false;
            }
            U();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) b.a(parcel, LocationAvailability.CREATOR);
        b.c(parcel);
        i3Var.z().a(new ky.o(locationAvailability, 2));
        return true;
    }

    public final void U() {
        this.f28660h.z().a(new jb.b(this));
    }
}
