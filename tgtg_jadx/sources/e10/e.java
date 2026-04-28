package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new com.google.android.gms.common.internal.v(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15485c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15483a, parcel, 2);
        lx.u.b0(this.f15484b, parcel, 3);
        int i12 = this.f15485c;
        if (i12 != 1 && i12 != 2 && i12 != 3) {
            i12 = 0;
        }
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(i12);
        lx.u.i0(iH0, parcel);
    }
}
