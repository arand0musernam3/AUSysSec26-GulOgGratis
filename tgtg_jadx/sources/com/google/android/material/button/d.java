package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends y7.b {
    public static final Parcelable.Creator<d> CREATOR = new q(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12374c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            d.class.getClassLoader();
        }
        this.f12374c = parcel.readInt() == 1;
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f12374c ? 1 : 0);
    }
}
