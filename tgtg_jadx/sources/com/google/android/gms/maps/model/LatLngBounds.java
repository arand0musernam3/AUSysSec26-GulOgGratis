package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.q;
import java.util.Arrays;
import lx.u;
import rz.a;
import s00.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new e(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f12147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f12148b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        i0.i(latLng, "southwest must not be null.");
        i0.i(latLng2, "northeast must not be null.");
        double d3 = latLng2.f12145a;
        double d11 = latLng.f12145a;
        i0.c(d3 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(d3));
        this.f12147a = latLng;
        this.f12148b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f12147a.equals(latLngBounds.f12147a) && this.f12148b.equals(latLngBounds.f12148b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12147a, this.f12148b});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(this.f12147a, "southwest");
        qVar.b(this.f12148b, "northeast");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 2, this.f12147a, i11);
        u.a0(parcel, 3, this.f12148b, i11);
        u.i0(iH0, parcel);
    }
}
