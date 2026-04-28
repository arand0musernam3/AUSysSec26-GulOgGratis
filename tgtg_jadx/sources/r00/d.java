package r00;

import android.os.Parcel;
import android.os.Parcelable;
import lx.u;
import qj.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {
    public static final Parcelable.Creator<d> CREATOR = new f1(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37514a;

    public d(byte[] bArr) {
        this.f37514a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.T(parcel, 1, this.f37514a);
        u.i0(iH0, parcel);
    }
}
