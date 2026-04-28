package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f11150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11151i;

    public l0(f fVar, int i11) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 6);
        this.f11150h = fVar;
        this.f11151i = i11;
    }

    @Override // a30.d
    public final boolean P(int i11, Parcel parcel, Parcel parcel2) {
        int i12 = this.f11151i;
        if (i11 == 1) {
            int i13 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) j00.h.a(parcel, Bundle.CREATOR);
            j00.h.c(parcel);
            i0.i(this.f11150h, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11150h.onPostInitHandler(i13, strongBinder, bundle, i12);
            this.f11150h = null;
        } else if (i11 == 2) {
            parcel.readInt();
            j00.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i11 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            p0 p0Var = (p0) j00.h.a(parcel, p0.CREATOR);
            j00.h.c(parcel);
            f fVar = this.f11150h;
            i0.i(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            i0.h(p0Var);
            fVar.zzc(p0Var);
            Bundle bundle2 = p0Var.f11169a;
            i0.i(this.f11150h, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11150h.onPostInitHandler(i14, strongBinder2, bundle2, i12);
            this.f11150h = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
