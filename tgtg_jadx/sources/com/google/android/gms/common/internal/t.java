package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends rz.a {

    @NonNull
    public static final Parcelable.Creator<t> CREATOR = new v(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11196b;

    public t(int i11, List list) {
        this.f11195a = i11;
        this.f11196b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11195a);
        lx.u.f0(parcel, 2, this.f11196b);
        lx.u.i0(iH0, parcel);
    }
}
