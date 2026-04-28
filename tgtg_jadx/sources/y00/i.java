package y00;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends rz.a {
    public static final Parcelable.Creator<i> CREATOR = new s00.e(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f44849a;

    public i(Bundle bundle) {
        this.f44849a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.S(parcel, 1, this.f44849a);
        lx.u.i0(iH0, parcel);
    }
}
