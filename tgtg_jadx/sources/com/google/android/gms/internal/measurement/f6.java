package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f6 extends m5 implements g6 {
    public f6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final int c() {
        Parcel parcelK = K(2, L());
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void h(String str, String str2, Bundle bundle, long j9) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        o5.b(parcelL, bundle);
        parcelL.writeLong(j9);
        M(1, parcelL);
    }
}
