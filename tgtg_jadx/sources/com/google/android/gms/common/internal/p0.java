package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends rz.a {
    public static final Parcelable.Creator<p0> CREATOR = new v(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f11169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pz.d[] f11170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f11172d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.S(parcel, 1, this.f11169a);
        lx.u.e0(parcel, 2, this.f11170b, i11);
        int i12 = this.f11171c;
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(i12);
        lx.u.a0(parcel, 4, this.f11172d, i11);
        lx.u.i0(iH0, parcel);
    }
}
