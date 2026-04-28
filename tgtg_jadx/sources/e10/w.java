package e10;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends rz.a {
    public static final Parcelable.Creator<w> CREATOR = new com.google.android.gms.common.internal.v(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15564k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15554a, parcel, 2);
        lx.u.b0(this.f15555b, parcel, 3);
        lx.u.b0(this.f15556c, parcel, 4);
        lx.u.b0(this.f15557d, parcel, 5);
        lx.u.b0(this.f15558e, parcel, 6);
        lx.u.b0(this.f15559f, parcel, 7);
        lx.u.b0(this.f15560g, parcel, 8);
        lx.u.b0(this.f15561h, parcel, 9);
        lx.u.b0(this.f15562i, parcel, 10);
        boolean z11 = this.f15563j;
        lx.u.g0(parcel, 11, 4);
        parcel.writeInt(z11 ? 1 : 0);
        lx.u.b0(this.f15564k, parcel, 12);
        lx.u.i0(iH0, parcel);
    }
}
