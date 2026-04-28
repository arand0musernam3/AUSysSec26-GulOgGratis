package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f11111g;

    public e0(IBinder iBinder) {
        this.f11111g = iBinder;
    }

    public final void a(l0 l0Var, k kVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(l0Var);
            parcelObtain.writeInt(1);
            v.a(kVar, parcelObtain, 0);
            this.f11111g.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11111g;
    }
}
