package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends rz.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new v(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11113b;

    public g(int i11, String str) {
        this.f11112a = i11;
        this.f11113b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f11112a == this.f11112a && i0.k(gVar.f11113b, this.f11113b);
    }

    public final int hashCode() {
        return this.f11112a;
    }

    public final String toString() {
        int i11 = this.f11112a;
        int length = String.valueOf(i11).length();
        String str = this.f11113b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i11);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11112a);
        lx.u.b0(this.f11113b, parcel, 2);
        lx.u.i0(iH0, parcel);
    }
}
