package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends rz.a {

    @NonNull
    public static final Parcelable.Creator<n> CREATOR = new com.google.android.gms.common.internal.v(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15540b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        int i12 = this.f15539a;
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(i12);
        lx.u.b0(this.f15540b, parcel, 3);
        lx.u.i0(iH0, parcel);
    }
}
