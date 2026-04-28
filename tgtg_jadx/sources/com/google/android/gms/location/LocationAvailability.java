package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import lx.u;
import qj.f1;
import rz.a;
import s00.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new f1(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g[] f12104e;

    public LocationAvailability(int i11, int i12, int i13, long j9, g[] gVarArr) {
        this.f12103d = i11 < 1000 ? 0 : 1000;
        this.f12100a = i12;
        this.f12101b = i13;
        this.f12102c = j9;
        this.f12104e = gVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f12100a == locationAvailability.f12100a && this.f12101b == locationAvailability.f12101b && this.f12102c == locationAvailability.f12102c && this.f12103d == locationAvailability.f12103d && Arrays.equals(this.f12104e, locationAvailability.f12104e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12103d)});
    }

    public final String toString() {
        boolean z11 = this.f12103d < 1000;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z11).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(z11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f12100a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f12101b);
        u.g0(parcel, 3, 8);
        parcel.writeLong(this.f12102c);
        u.g0(parcel, 4, 4);
        int i12 = this.f12103d;
        parcel.writeInt(i12);
        u.e0(parcel, 5, this.f12104e, i11);
        int i13 = i12 >= 1000 ? 0 : 1;
        u.g0(parcel, 6, 4);
        parcel.writeInt(i13);
        u.i0(iH0, parcel);
    }
}
