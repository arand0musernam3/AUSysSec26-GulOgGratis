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
public final class CameraPosition extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new e(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f12141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12144d;

    public CameraPosition(LatLng latLng, float f11, float f12, float f13) {
        i0.i(latLng, "camera target must not be null.");
        boolean z11 = false;
        if (f12 >= 0.0f && f12 <= 90.0f) {
            z11 = true;
        }
        i0.c(z11, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f12));
        this.f12141a = latLng;
        this.f12142b = f11;
        this.f12143c = f12 + 0.0f;
        this.f12144d = (((double) f13) <= 0.0d ? (f13 % 360.0f) + 360.0f : f13) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f12141a.equals(cameraPosition.f12141a) && Float.floatToIntBits(this.f12142b) == Float.floatToIntBits(cameraPosition.f12142b) && Float.floatToIntBits(this.f12143c) == Float.floatToIntBits(cameraPosition.f12143c) && Float.floatToIntBits(this.f12144d) == Float.floatToIntBits(cameraPosition.f12144d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12141a, Float.valueOf(this.f12142b), Float.valueOf(this.f12143c), Float.valueOf(this.f12144d)});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(this.f12141a, "target");
        qVar.b(Float.valueOf(this.f12142b), "zoom");
        qVar.b(Float.valueOf(this.f12143c), "tilt");
        qVar.b(Float.valueOf(this.f12144d), "bearing");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 2, this.f12141a, i11);
        u.g0(parcel, 3, 4);
        parcel.writeFloat(this.f12142b);
        u.g0(parcel, 4, 4);
        parcel.writeFloat(this.f12143c);
        u.g0(parcel, 5, 4);
        parcel.writeFloat(this.f12144d);
        u.i0(iH0, parcel);
    }
}
