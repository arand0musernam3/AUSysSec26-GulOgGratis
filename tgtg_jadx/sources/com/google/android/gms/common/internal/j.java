package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends rz.a {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new v(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f11127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f11132f;

    public j(s sVar, boolean z11, boolean z12, int[] iArr, int i11, int[] iArr2) {
        this.f11127a = sVar;
        this.f11128b = z11;
        this.f11129c = z12;
        this.f11130d = iArr;
        this.f11131e = i11;
        this.f11132f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 1, this.f11127a, i11);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f11128b ? 1 : 0);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f11129c ? 1 : 0);
        lx.u.X(parcel, 4, this.f11130d);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f11131e);
        lx.u.X(parcel, 6, this.f11132f);
        lx.u.i0(iH0, parcel);
    }
}
