package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends rz.a {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11083d;

    public j(int i11, int i12, int i13, boolean z11) {
        this.f11080a = i11;
        this.f11081b = i12;
        this.f11082c = i13;
        this.f11083d = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11080a == jVar.f11080a && this.f11081b == jVar.f11081b && this.f11082c == jVar.f11082c && this.f11083d == jVar.f11083d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11080a), Integer.valueOf(this.f11081b), Integer.valueOf(this.f11082c), Boolean.valueOf(this.f11083d)});
    }

    public final String toString() {
        int i11 = this.f11080a;
        int length = String.valueOf(i11).length();
        int i12 = this.f11081b;
        int length2 = String.valueOf(i12).length();
        int i13 = this.f11082c;
        int length3 = String.valueOf(i13).length();
        boolean z11 = this.f11083d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z11).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i11);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i12);
        sb2.append(", processingReason=");
        sb2.append(i13);
        sb2.append(", isUserData=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11080a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f11081b);
        u.g0(parcel, 3, 4);
        parcel.writeInt(this.f11082c);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f11083d ? 1 : 0);
        u.i0(iH0, parcel);
    }
}
