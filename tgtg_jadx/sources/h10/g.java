package h10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import e10.b0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends rz.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new b0(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21020b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f21019a, parcel, 2);
        u.b0(this.f21020b, parcel, 3);
        u.i0(iH0, parcel);
    }
}
