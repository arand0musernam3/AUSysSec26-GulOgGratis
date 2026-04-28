package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x6 extends n5 implements g6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s30.b f12033g;

    public x6(s30.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f12033g = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f12033g);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
        long j9 = parcel.readLong();
        o5.d(parcel);
        h(string, string2, bundle, j9);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final int c() {
        return System.identityHashCode(this.f12033g);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void h(String str, String str2, Bundle bundle, long j9) {
        this.f12033g.a(str, str2, bundle, j9);
    }
}
