package y00;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends rz.a {
    public static final Parcelable.Creator<y3> CREATOR = new s00.e(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45328c;

    public y3(int i11, long j9, String str) {
        this.f45326a = str;
        this.f45327b = j9;
        this.f45328c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f45326a, parcel, 1);
        lx.u.g0(parcel, 2, 8);
        parcel.writeLong(this.f45327b);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f45328c);
        lx.u.i0(iH0, parcel);
    }
}
