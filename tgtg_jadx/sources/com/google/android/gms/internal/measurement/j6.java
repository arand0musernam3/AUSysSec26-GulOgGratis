package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j6 extends rz.a {
    public static final Parcelable.Creator<j6> CREATOR = new k6(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f11515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11516e;

    public j6(long j9, long j11, boolean z11, Bundle bundle, String str) {
        this.f11512a = j9;
        this.f11513b = j11;
        this.f11514c = z11;
        this.f11515d = bundle;
        this.f11516e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 8);
        parcel.writeLong(this.f11512a);
        lx.u.g0(parcel, 2, 8);
        parcel.writeLong(this.f11513b);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f11514c ? 1 : 0);
        lx.u.S(parcel, 7, this.f11515d);
        lx.u.b0(this.f11516e, parcel, 8);
        lx.u.i0(iH0, parcel);
    }
}
