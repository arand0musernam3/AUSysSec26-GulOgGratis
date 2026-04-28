package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w9 extends rz.a {
    public static final Parcelable.Creator<w9> CREATOR = new k6(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12002a;

    public w9(ArrayList arrayList) {
        this.f12002a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w9) {
            return this.f12002a.equals(((w9) obj).f12002a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlagOverrides(");
        boolean z11 = true;
        for (v9 v9Var : this.f12002a) {
            if (!z11) {
                sb2.append(", ");
            }
            v9Var.d(sb2);
            z11 = false;
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.f0(parcel, 2, this.f12002a);
        lx.u.i0(iH0, parcel);
    }
}
