package e10;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends rz.a {
    public static final Parcelable.Creator<y> CREATOR = new com.google.android.gms.common.internal.v(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f15570b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15569a, parcel, 2);
        lx.u.S(parcel, 3, this.f15570b);
        lx.u.i0(iH0, parcel);
    }
}
