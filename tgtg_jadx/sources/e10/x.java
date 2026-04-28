package e10;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends rz.a {
    public static final Parcelable.Creator<x> CREATOR = new com.google.android.gms.common.internal.v(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15568d;

    public x(String str, String str2, int i11, int i12) {
        this.f15565a = str;
        this.f15566b = str2;
        this.f15567c = i11;
        this.f15568d = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15565a, parcel, 2);
        lx.u.b0(this.f15566b, parcel, 3);
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(this.f15567c);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f15568d);
        lx.u.i0(iH0, parcel);
    }
}
