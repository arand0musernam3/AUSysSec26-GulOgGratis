package h10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import e10.b0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends rz.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new b0(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f21023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f21024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f21025e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f21021a, parcel, 2);
        u.b0(this.f21022b, parcel, 3);
        u.a0(parcel, 4, this.f21023c, i11);
        u.a0(parcel, 5, this.f21024d, i11);
        u.a0(parcel, 6, this.f21025e, i11);
        u.i0(iH0, parcel);
    }
}
