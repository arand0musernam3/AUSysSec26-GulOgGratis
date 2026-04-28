package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new l(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25466a;

    public d(boolean z11) {
        this.f25466a = z11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && this.f25466a == ((d) obj).f25466a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f25466a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f25466a ? 1 : 0);
        u.i0(iH0, parcel);
    }
}
