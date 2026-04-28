package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k6 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11565a;

    public /* synthetic */ k6(int i11) {
        this.f11565a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11565a) {
            case 0:
                int iX = jf.e.X(parcel);
                Bundle bundleQ = null;
                String strW = null;
                boolean zM = false;
                long jT = 0;
                long jT2 = 0;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 1) {
                        jT = jf.e.T(i11, parcel);
                    } else if (c3 == 2) {
                        jT2 = jf.e.T(i11, parcel);
                    } else if (c3 == 3) {
                        zM = jf.e.M(i11, parcel);
                    } else if (c3 == 7) {
                        bundleQ = jf.e.q(i11, parcel);
                    } else if (c3 != '\b') {
                        jf.e.W(i11, parcel);
                    } else {
                        strW = jf.e.w(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new j6(jT, jT2, zM, bundleQ, strW);
            case 1:
                int iX2 = jf.e.X(parcel);
                String strW2 = null;
                int iR = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iR = jf.e.R(i12, parcel);
                    } else if (c7 == 2) {
                        strW2 = jf.e.w(i12, parcel);
                    } else if (c7 != 3) {
                        jf.e.W(i12, parcel);
                    } else {
                        intent = (Intent) jf.e.v(parcel, i12, Intent.CREATOR);
                    }
                }
                jf.e.B(iX2, parcel);
                return new l6(iR, strW2, intent);
            case 2:
                int iX3 = jf.e.X(parcel);
                u9[] u9VarArr = null;
                int iR2 = 0;
                String[] strArrX = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 2) {
                        iR2 = jf.e.R(i13, parcel);
                    } else if (c8 == 3) {
                        u9VarArr = (u9[]) jf.e.z(parcel, i13, u9.CREATOR);
                    } else if (c8 != 4) {
                        jf.e.W(i13, parcel);
                    } else {
                        strArrX = jf.e.x(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new q9(iR2, u9VarArr, strArrX);
            case 3:
                int iX4 = jf.e.X(parcel);
                long jT3 = 0;
                String strW3 = null;
                String strW4 = null;
                q9[] q9VarArr = null;
                byte[] bArrR = null;
                boolean zM2 = false;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strW3 = jf.e.w(i14, parcel);
                            break;
                        case 3:
                            strW4 = jf.e.w(i14, parcel);
                            break;
                        case 4:
                            q9VarArr = (q9[]) jf.e.z(parcel, i14, q9.CREATOR);
                            break;
                        case 5:
                            zM2 = jf.e.M(i14, parcel);
                            break;
                        case 6:
                            bArrR = jf.e.r(i14, parcel);
                            break;
                        case 7:
                            jT3 = jf.e.T(i14, parcel);
                            break;
                        default:
                            jf.e.W(i14, parcel);
                            break;
                    }
                }
                jf.e.B(iX4, parcel);
                return new r9(strW3, strW4, q9VarArr, zM2, bArrR, jT3);
            case 4:
                int iX5 = jf.e.X(parcel);
                byte[] bArrR2 = null;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        jf.e.W(i15, parcel);
                    } else {
                        bArrR2 = jf.e.r(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                return new s9(bArrR2);
            case 5:
                int iX6 = jf.e.X(parcel);
                String strW5 = null;
                byte[] bArrR3 = null;
                byte[][] bArrS = null;
                byte[][] bArrS2 = null;
                byte[][] bArrS3 = null;
                byte[][] bArrS4 = null;
                int[] iArrT = null;
                byte[][] bArrS5 = null;
                int[] iArrT2 = null;
                byte[][] bArrS6 = null;
                while (parcel.dataPosition() < iX6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strW5 = jf.e.w(i16, parcel);
                            break;
                        case 3:
                            bArrR3 = jf.e.r(i16, parcel);
                            break;
                        case 4:
                            bArrS = jf.e.s(i16, parcel);
                            break;
                        case 5:
                            bArrS2 = jf.e.s(i16, parcel);
                            break;
                        case 6:
                            bArrS3 = jf.e.s(i16, parcel);
                            break;
                        case 7:
                            bArrS4 = jf.e.s(i16, parcel);
                            break;
                        case '\b':
                            iArrT = jf.e.t(i16, parcel);
                            break;
                        case '\t':
                            bArrS5 = jf.e.s(i16, parcel);
                            break;
                        case '\n':
                            iArrT2 = jf.e.t(i16, parcel);
                            break;
                        case 11:
                            bArrS6 = jf.e.s(i16, parcel);
                            break;
                        default:
                            jf.e.W(i16, parcel);
                            break;
                    }
                }
                jf.e.B(iX6, parcel);
                return new t9(strW5, bArrR3, bArrS, bArrS2, bArrS3, bArrS4, iArrT, bArrS5, iArrT2, bArrS6);
            case 6:
                int iX7 = jf.e.X(parcel);
                boolean zM3 = false;
                int iR3 = 0;
                int iR4 = 0;
                int iR5 = 0;
                String strW6 = null;
                String strW7 = null;
                byte[] bArrR4 = null;
                double d3 = 0.0d;
                long jT4 = 0;
                while (parcel.dataPosition() < iX7) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strW6 = jf.e.w(i17, parcel);
                            break;
                        case 3:
                            jT4 = jf.e.T(i17, parcel);
                            break;
                        case 4:
                            zM3 = jf.e.M(i17, parcel);
                            break;
                        case 5:
                            jf.e.Y(parcel, i17, 8);
                            d3 = parcel.readDouble();
                            break;
                        case 6:
                            strW7 = jf.e.w(i17, parcel);
                            break;
                        case 7:
                            bArrR4 = jf.e.r(i17, parcel);
                            break;
                        case '\b':
                            iR3 = jf.e.R(i17, parcel);
                            break;
                        case '\t':
                            iR4 = jf.e.R(i17, parcel);
                            break;
                        case '\n':
                            iR5 = jf.e.R(i17, parcel);
                            break;
                        default:
                            jf.e.W(i17, parcel);
                            break;
                    }
                }
                jf.e.B(iX7, parcel);
                return new u9(strW6, jT4, zM3, d3, strW7, bArrR4, iR3, iR4, iR5);
            case 7:
                int iX8 = jf.e.X(parcel);
                boolean zM4 = false;
                String strW8 = null;
                String strW9 = null;
                u9 u9Var = null;
                while (parcel.dataPosition() < iX8) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 2) {
                        strW8 = jf.e.w(i18, parcel);
                    } else if (c11 == 3) {
                        strW9 = jf.e.w(i18, parcel);
                    } else if (c11 == 4) {
                        u9Var = (u9) jf.e.v(parcel, i18, u9.CREATOR);
                    } else if (c11 != 5) {
                        jf.e.W(i18, parcel);
                    } else {
                        zM4 = jf.e.M(i18, parcel);
                    }
                }
                jf.e.B(iX8, parcel);
                return new v9(strW8, strW9, u9Var, zM4);
            case 8:
                int iX9 = jf.e.X(parcel);
                ArrayList arrayListA = null;
                while (parcel.dataPosition() < iX9) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        jf.e.W(i19, parcel);
                    } else {
                        arrayListA = jf.e.A(parcel, i19, v9.CREATOR);
                    }
                }
                jf.e.B(iX9, parcel);
                return new w9(arrayListA);
            default:
                int iX10 = jf.e.X(parcel);
                int iR6 = 0;
                int iR7 = 0;
                while (parcel.dataPosition() < iX10) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        iR6 = jf.e.R(i21, parcel);
                    } else if (c12 != 2) {
                        jf.e.W(i21, parcel);
                    } else {
                        iR7 = jf.e.R(i21, parcel);
                    }
                }
                jf.e.B(iX10, parcel);
                return new x9(iR6, iR7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        switch (this.f11565a) {
            case 0:
                return new j6[i11];
            case 1:
                return new l6[i11];
            case 2:
                return new q9[i11];
            case 3:
                return new r9[i11];
            case 4:
                return new s9[i11];
            case 5:
                return new t9[i11];
            case 6:
                return new u9[i11];
            case 7:
                return new v9[i11];
            case 8:
                return new w9[i11];
            default:
                return new x9[i11];
        }
    }
}
