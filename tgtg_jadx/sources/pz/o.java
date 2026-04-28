package pz;

import android.os.Parcel;
import android.os.Parcelable;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends rz.a {
    public static final Parcelable.Creator<o> CREATOR = new oa.i(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35688e;

    public o(boolean z11, String str, int i11, int i12, long j9) {
        this.f35684a = z11;
        this.f35685b = str;
        this.f35686c = ex.i.Q(i11) - 1;
        this.f35687d = dx.f.z(i12) - 1;
        this.f35688e = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f35684a ? 1 : 0);
        u.b0(this.f35685b, parcel, 2);
        u.g0(parcel, 3, 4);
        parcel.writeInt(this.f35686c);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f35687d);
        u.g0(parcel, 5, 8);
        parcel.writeLong(this.f35688e);
        u.i0(iH0, parcel);
    }
}
