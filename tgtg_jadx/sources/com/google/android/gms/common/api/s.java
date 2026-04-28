package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f11090b = new s(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11091a;

    public /* synthetic */ s(int i11) {
        this.f11091a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11091a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return i.f11066d;
                }
                int iX = jf.e.X(parcel);
                boolean zM = false;
                j jVar = null;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 1) {
                        jVar = (j) jf.e.v(parcel, i11, j.CREATOR);
                    } else if (c3 != 2) {
                        jf.e.W(i11, parcel);
                    } else {
                        zM = jf.e.M(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new i(jVar, zM);
            case 1:
                int iX2 = jf.e.X(parcel);
                int iR = 0;
                boolean zM2 = true;
                int iR2 = 0;
                int iR3 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iR = jf.e.R(i12, parcel);
                    } else if (c7 == 2) {
                        iR2 = jf.e.R(i12, parcel);
                    } else if (c7 == 3) {
                        iR3 = jf.e.R(i12, parcel);
                    } else if (c7 != 4) {
                        jf.e.W(i12, parcel);
                    } else {
                        zM2 = jf.e.M(i12, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new j(iR, iR2, iR3, zM2);
            case 2:
                int iX3 = jf.e.X(parcel);
                String strW = null;
                int iR4 = 0;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        iR4 = jf.e.R(i13, parcel);
                    } else if (c8 != 2) {
                        jf.e.W(i13, parcel);
                    } else {
                        strW = jf.e.w(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new Scope(iR4, strW);
            default:
                int iX4 = jf.e.X(parcel);
                String strW2 = null;
                pz.b bVar = null;
                int iR5 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iR5 = jf.e.R(i14, parcel);
                    } else if (c11 == 2) {
                        strW2 = jf.e.w(i14, parcel);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) jf.e.v(parcel, i14, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        jf.e.W(i14, parcel);
                    } else {
                        bVar = (pz.b) jf.e.v(parcel, i14, pz.b.CREATOR);
                    }
                }
                jf.e.B(iX4, parcel);
                return new Status(iR5, strW2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        switch (this.f11091a) {
            case 0:
                return new i[i11];
            case 1:
                return new j[i11];
            case 2:
                return new Scope[i11];
            default:
                return new Status[i11];
        }
    }
}
