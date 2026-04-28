package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends rz.a {
    public static final Parcelable.Creator<h0> CREATOR = new g0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114a;

    public h0(long j9) {
        this.f114a = Long.valueOf(j9).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && this.f114a == ((h0) obj).f114a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f114a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 8);
        parcel.writeLong(this.f114a);
        lx.u.i0(iH0, parcel);
    }
}
