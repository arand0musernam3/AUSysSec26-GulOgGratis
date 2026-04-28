package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends rz.a {
    public static final Parcelable.Creator<t0> CREATOR = new g0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f176a;

    public t0(boolean z11) {
        this.f176a = Boolean.valueOf(z11).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t0) && this.f176a == ((t0) obj).f176a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f176a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f176a ? 1 : 0);
        lx.u.i0(iH0, parcel);
    }
}
