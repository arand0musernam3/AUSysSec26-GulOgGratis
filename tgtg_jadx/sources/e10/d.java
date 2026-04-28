package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.gms.common.internal.v(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15482b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        int i12 = this.f15481a;
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(i12);
        int i13 = this.f15482b;
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(i13);
        lx.u.i0(iH0, parcel);
    }
}
