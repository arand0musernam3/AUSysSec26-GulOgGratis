package h10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import e10.b0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new b0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f21011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21014f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        int i12 = this.f21009a;
        u.g0(parcel, 2, 4);
        parcel.writeInt(i12);
        u.b0(this.f21010b, parcel, 3);
        double d3 = this.f21011c;
        u.g0(parcel, 4, 8);
        parcel.writeDouble(d3);
        u.b0(this.f21012d, parcel, 5);
        long j9 = this.f21013e;
        u.g0(parcel, 6, 8);
        parcel.writeLong(j9);
        int i13 = this.f21014f;
        u.g0(parcel, 7, 4);
        parcel.writeInt(i13);
        u.i0(iH0, parcel);
    }
}
