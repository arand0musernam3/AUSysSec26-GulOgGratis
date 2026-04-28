package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends rz.a {
    public static final Parcelable.Creator<c0> CREATOR = new v(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f11101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pz.b f11102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11104e;

    public c0(int i11, IBinder iBinder, pz.b bVar, boolean z11, boolean z12) {
        this.f11100a = i11;
        this.f11101b = iBinder;
        this.f11102c = bVar;
        this.f11103d = z11;
        this.f11104e = z12;
    }

    public final boolean equals(Object obj) {
        Object v0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!this.f11102c.equals(c0Var.f11102c)) {
            return false;
        }
        Object v0Var2 = null;
        IBinder iBinder = this.f11101b;
        if (iBinder == null) {
            v0Var = null;
        } else {
            int i11 = a.f11092h;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            v0Var = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new v0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        IBinder iBinder2 = c0Var.f11101b;
        if (iBinder2 != null) {
            int i12 = a.f11092h;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            v0Var2 = iInterfaceQueryLocalInterface2 instanceof n ? (n) iInterfaceQueryLocalInterface2 : new v0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        return i0.k(v0Var, v0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11100a);
        lx.u.W(parcel, 2, this.f11101b);
        lx.u.a0(parcel, 3, this.f11102c, i11);
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(this.f11103d ? 1 : 0);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f11104e ? 1 : 0);
        lx.u.i0(iH0, parcel);
    }
}
