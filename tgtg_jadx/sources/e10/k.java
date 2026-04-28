package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends rz.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new com.google.android.gms.common.internal.v(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f15519b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15518a, parcel, 1);
        lx.u.a0(parcel, 2, this.f15519b, i11);
        lx.u.i0(iH0, parcel);
    }
}
