package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v9 extends rz.a {
    public static final Parcelable.Creator<v9> CREATOR = new k6(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9 f11964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11965d;

    public v9(String str, String str2, u9 u9Var, boolean z11) {
        this.f11962a = str;
        this.f11963b = str2;
        this.f11964c = u9Var;
        this.f11965d = z11;
    }

    public final void d(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.f11962a);
        sb2.append(", ");
        sb2.append(this.f11963b);
        sb2.append(", ");
        this.f11964c.d(sb2);
        sb2.append(", ");
        sb2.append(this.f11965d);
        sb2.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return gg.c(this.f11962a, v9Var.f11962a) && gg.c(this.f11963b, v9Var.f11963b) && gg.c(this.f11964c, v9Var.f11964c) && this.f11965d == v9Var.f11965d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        d(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f11962a, parcel, 2);
        lx.u.b0(this.f11963b, parcel, 3);
        lx.u.a0(parcel, 4, this.f11964c, i11);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f11965d ? 1 : 0);
        lx.u.i0(iH0, parcel);
    }
}
