package s00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38511f;

    public d(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f38506a = z11;
        this.f38507b = z12;
        this.f38508c = z13;
        this.f38509d = z14;
        this.f38510e = z15;
        this.f38511f = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f38506a ? 1 : 0);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f38507b ? 1 : 0);
        u.g0(parcel, 3, 4);
        parcel.writeInt(this.f38508c ? 1 : 0);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f38509d ? 1 : 0);
        u.g0(parcel, 5, 4);
        parcel.writeInt(this.f38510e ? 1 : 0);
        u.g0(parcel, 6, 4);
        parcel.writeInt(this.f38511f ? 1 : 0);
        u.i0(iH0, parcel);
    }
}
