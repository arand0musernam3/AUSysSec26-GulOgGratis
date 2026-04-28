package h10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import e10.b0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends rz.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new b0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21018b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        long j9 = this.f21017a;
        u.g0(parcel, 2, 8);
        parcel.writeLong(j9);
        long j11 = this.f21018b;
        u.g0(parcel, 3, 8);
        parcel.writeLong(j11);
        u.i0(iH0, parcel);
    }
}
