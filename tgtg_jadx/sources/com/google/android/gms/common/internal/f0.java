package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends m5 implements h0 {
    public final boolean O() {
        Parcel parcelC = C(7, L());
        int i11 = j00.h.f24361a;
        boolean z11 = parcelC.readInt() != 0;
        parcelC.recycle();
        return z11;
    }
}
