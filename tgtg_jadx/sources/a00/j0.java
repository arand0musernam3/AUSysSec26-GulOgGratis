package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends rz.a {
    public static final Parcelable.Creator<j0> CREATOR = new g0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119a;

    public j0(String str) {
        com.google.android.gms.common.internal.i0.h(str);
        this.f119a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.f119a.equals(((j0) obj).f119a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f119a, parcel, 1);
        lx.u.i0(iH0, parcel);
    }
}
