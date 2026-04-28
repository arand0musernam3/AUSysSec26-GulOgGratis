package r00;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import lx.u;
import qj.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends rz.a {
    public static final Parcelable.Creator<f> CREATOR = new f1(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f37516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f37517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RemoteViews f37518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f37519d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.c0(parcel, 1, this.f37516a);
        u.X(parcel, 2, this.f37517b);
        u.a0(parcel, 3, this.f37518c, i11);
        u.T(parcel, 4, this.f37519d);
        u.i0(iH0, parcel);
    }
}
