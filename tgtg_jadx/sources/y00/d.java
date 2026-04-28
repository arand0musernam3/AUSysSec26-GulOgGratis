package y00;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {
    public static final Parcelable.Creator<d> CREATOR = new s00.e(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44665c;

    public d(int i11, long j9, long j11) {
        this.f44663a = j9;
        this.f44664b = i11;
        this.f44665c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 8);
        parcel.writeLong(this.f44663a);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f44664b);
        lx.u.g0(parcel, 3, 8);
        parcel.writeLong(this.f44665c);
        lx.u.i0(iH0, parcel);
    }
}
