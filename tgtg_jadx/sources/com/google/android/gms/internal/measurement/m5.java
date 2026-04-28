package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m5 implements IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IBinder f11627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11628i;

    public /* synthetic */ m5(IBinder iBinder, String str, int i11) {
        this.f11626g = i11;
        this.f11627h = iBinder;
        this.f11628i = str;
    }

    public Parcel C(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11627h.transact(i11, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e5) {
                parcelObtain.recycle();
                throw e5;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel J(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11627h.transact(i11, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e5) {
                parcelObtain.recycle();
                throw e5;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel K(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11627h.transact(i11, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e5) {
                parcelObtain.recycle();
                throw e5;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel L() {
        switch (this.f11626g) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f11628i);
                return parcelObtain;
            case 1:
            case 2:
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f11628i);
                return parcelObtain2;
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f11628i);
                return parcelObtain3;
            case 4:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(this.f11628i);
                return parcelObtain4;
        }
    }

    public void M(int i11, Parcel parcel) {
        Parcel parcelObtain;
        switch (this.f11626g) {
            case 0:
                parcelObtain = Parcel.obtain();
                try {
                    this.f11627h.transact(i11, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            case 4:
                parcelObtain = Parcel.obtain();
                try {
                    this.f11627h.transact(i11, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            case 5:
                parcelObtain = Parcel.obtain();
                try {
                    this.f11627h.transact(i11, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            default:
                try {
                    this.f11627h.transact(i11, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
        }
    }

    public void N(Parcel parcel) {
        try {
            this.f11627h.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11628i);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f11626g) {
        }
        return this.f11627h;
    }

    public void b(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f11627h.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
