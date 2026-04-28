package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import lx.u;
import rz.a;
import s00.e;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LatLng extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLng> CREATOR = new e(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f12146b;

    public LatLng(double d3, double d11) {
        if (d11 < -180.0d || d11 >= 180.0d) {
            this.f12146b = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f12146b = d11;
        }
        this.f12145a = Math.max(-90.0d, Math.min(90.0d, d3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f12145a) == Double.doubleToLongBits(latLng.f12145a) && Double.doubleToLongBits(this.f12146b) == Double.doubleToLongBits(latLng.f12146b);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f12145a);
        long j9 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f12146b);
        return ((((int) j9) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.f12145a + MessageLogView.COMMA_SEPARATOR + this.f12146b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 2, 8);
        parcel.writeDouble(this.f12145a);
        u.g0(parcel, 3, 8);
        parcel.writeDouble(this.f12146b);
        u.i0(iH0, parcel);
    }
}
