package e10;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends rz.a {

    @NonNull
    public static final Parcelable.Creator<o> CREATOR = new com.google.android.gms.common.internal.v(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f15542b;

    public o(int i11, Bundle bundle) {
        new Bundle();
        this.f15541a = i11;
        this.f15542b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f15541a);
        lx.u.S(parcel, 3, this.f15542b);
        lx.u.i0(iH0, parcel);
    }
}
