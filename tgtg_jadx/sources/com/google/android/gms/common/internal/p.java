package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends rz.a {

    @NonNull
    public static final Parcelable.Creator<p> CREATOR = new v(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11168i;

    public p(int i11, int i12, int i13, long j9, long j11, String str, String str2, int i14, int i15) {
        this.f11160a = i11;
        this.f11161b = i12;
        this.f11162c = i13;
        this.f11163d = j9;
        this.f11164e = j11;
        this.f11165f = str;
        this.f11166g = str2;
        this.f11167h = i14;
        this.f11168i = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11160a);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f11161b);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f11162c);
        lx.u.g0(parcel, 4, 8);
        parcel.writeLong(this.f11163d);
        lx.u.g0(parcel, 5, 8);
        parcel.writeLong(this.f11164e);
        lx.u.b0(this.f11165f, parcel, 6);
        lx.u.b0(this.f11166g, parcel, 7);
        lx.u.g0(parcel, 8, 4);
        parcel.writeInt(this.f11167h);
        lx.u.g0(parcel, 9, 4);
        parcel.writeInt(this.f11168i);
        lx.u.i0(iH0, parcel);
    }
}
