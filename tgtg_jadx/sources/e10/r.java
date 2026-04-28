package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends rz.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new com.google.android.gms.common.internal.v(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15544a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.d0(parcel, 1, this.f15544a);
        lx.u.i0(iH0, parcel);
    }
}
