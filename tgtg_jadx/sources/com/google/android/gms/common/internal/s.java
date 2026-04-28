package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends rz.a {

    @NonNull
    public static final Parcelable.Creator<s> CREATOR = new v(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11193e;

    public s(int i11, boolean z11, boolean z12, int i12, int i13) {
        this.f11189a = i11;
        this.f11190b = z11;
        this.f11191c = z12;
        this.f11192d = i12;
        this.f11193e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11189a);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f11190b ? 1 : 0);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f11191c ? 1 : 0);
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(this.f11192d);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f11193e);
        lx.u.i0(iH0, parcel);
    }
}
