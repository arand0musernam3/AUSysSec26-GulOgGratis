package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d4 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44688a;

    public /* synthetic */ d4(int i11) {
        this.f44688a = i11;
    }

    public static void a(o4 o4Var, Parcel parcel) {
        int i11 = o4Var.f45051a;
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(i11);
        lx.u.b0(o4Var.f45052b, parcel, 2);
        long j9 = o4Var.f45053c;
        lx.u.g0(parcel, 3, 8);
        parcel.writeLong(j9);
        Long l = o4Var.f45054d;
        if (l != null) {
            lx.u.g0(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        lx.u.b0(o4Var.f45055e, parcel, 6);
        lx.u.b0(o4Var.f45056f, parcel, 7);
        Double d3 = o4Var.f45057g;
        if (d3 != null) {
            lx.u.g0(parcel, 8, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        lx.u.i0(iH0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f44688a) {
            case 0:
                int iX = jf.e.X(parcel);
                ArrayList arrayListU = null;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        jf.e.W(i11, parcel);
                    } else {
                        arrayListU = jf.e.u(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new c4(arrayListU);
            case 1:
                int iX2 = jf.e.X(parcel);
                ArrayList arrayListA = null;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        jf.e.W(i12, parcel);
                    } else {
                        arrayListA = jf.e.A(parcel, i12, b4.CREATOR);
                    }
                }
                jf.e.B(iX2, parcel);
                return new e4(arrayListA);
            case 2:
                int iX3 = jf.e.X(parcel);
                String strW = null;
                Long lValueOf = null;
                Float fP = null;
                String strW2 = null;
                String strW3 = null;
                Double dValueOf = null;
                long jT = 0;
                int iR = 0;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iR = jf.e.R(i13, parcel);
                            break;
                        case 2:
                            strW = jf.e.w(i13, parcel);
                            break;
                        case 3:
                            jT = jf.e.T(i13, parcel);
                            break;
                        case 4:
                            int iU = jf.e.U(i13, parcel);
                            if (iU == 0) {
                                lValueOf = null;
                            } else {
                                jf.e.Z(parcel, iU, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            fP = jf.e.P(i13, parcel);
                            break;
                        case 6:
                            strW2 = jf.e.w(i13, parcel);
                            break;
                        case 7:
                            strW3 = jf.e.w(i13, parcel);
                            break;
                        case '\b':
                            int iU2 = jf.e.U(i13, parcel);
                            if (iU2 == 0) {
                                dValueOf = null;
                            } else {
                                jf.e.Z(parcel, iU2, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            jf.e.W(i13, parcel);
                            break;
                    }
                }
                jf.e.B(iX3, parcel);
                return new o4(iR, strW, jT, lValueOf, fP, strW2, strW3, dValueOf);
            case 3:
                int iX4 = jf.e.X(parcel);
                long jT2 = 0;
                long jT3 = 0;
                long jT4 = 0;
                long jT5 = 0;
                long jT6 = 0;
                long jT7 = 0;
                long jT8 = 0;
                long jT9 = 0;
                boolean zM = false;
                int iR2 = 0;
                boolean zM2 = false;
                boolean zM3 = false;
                int iR3 = 0;
                int iR4 = 0;
                String strW4 = "";
                String strW5 = strW4;
                String strW6 = strW5;
                String strW7 = strW6;
                String strW8 = null;
                String strW9 = null;
                String strW10 = null;
                String strW11 = null;
                String strW12 = null;
                String strW13 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListY = null;
                String strW14 = null;
                String strW15 = null;
                int iR5 = 100;
                boolean zM4 = true;
                boolean zM5 = true;
                long jT10 = -2147483648L;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strW8 = jf.e.w(i14, parcel);
                            break;
                        case 3:
                            strW9 = jf.e.w(i14, parcel);
                            break;
                        case 4:
                            strW10 = jf.e.w(i14, parcel);
                            break;
                        case 5:
                            strW11 = jf.e.w(i14, parcel);
                            break;
                        case 6:
                            jT2 = jf.e.T(i14, parcel);
                            break;
                        case 7:
                            jT3 = jf.e.T(i14, parcel);
                            break;
                        case '\b':
                            strW12 = jf.e.w(i14, parcel);
                            break;
                        case '\t':
                            zM4 = jf.e.M(i14, parcel);
                            break;
                        case '\n':
                            zM = jf.e.M(i14, parcel);
                            break;
                        case 11:
                            jT10 = jf.e.T(i14, parcel);
                            break;
                        case '\f':
                            strW13 = jf.e.w(i14, parcel);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            jf.e.W(i14, parcel);
                            break;
                        case 14:
                            jT4 = jf.e.T(i14, parcel);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            iR2 = jf.e.R(i14, parcel);
                            break;
                        case 16:
                            zM5 = jf.e.M(i14, parcel);
                            break;
                        case 18:
                            zM2 = jf.e.M(i14, parcel);
                            break;
                        case 21:
                            int iU3 = jf.e.U(i14, parcel);
                            if (iU3 == 0) {
                                boolValueOf = null;
                            } else {
                                jf.e.Z(parcel, iU3, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jT5 = jf.e.T(i14, parcel);
                            break;
                        case 23:
                            arrayListY = jf.e.y(i14, parcel);
                            break;
                        case 25:
                            strW4 = jf.e.w(i14, parcel);
                            break;
                        case 26:
                            strW5 = jf.e.w(i14, parcel);
                            break;
                        case 27:
                            strW14 = jf.e.w(i14, parcel);
                            break;
                        case 28:
                            zM3 = jf.e.M(i14, parcel);
                            break;
                        case 29:
                            jT6 = jf.e.T(i14, parcel);
                            break;
                        case 30:
                            iR5 = jf.e.R(i14, parcel);
                            break;
                        case BERTags.DATE /* 31 */:
                            strW6 = jf.e.w(i14, parcel);
                            break;
                        case ' ':
                            iR3 = jf.e.R(i14, parcel);
                            break;
                        case BERTags.DURATION /* 34 */:
                            jT7 = jf.e.T(i14, parcel);
                            break;
                        case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                            strW15 = jf.e.w(i14, parcel);
                            break;
                        case '$':
                            strW7 = jf.e.w(i14, parcel);
                            break;
                        case '%':
                            jT8 = jf.e.T(i14, parcel);
                            break;
                        case '&':
                            iR4 = jf.e.R(i14, parcel);
                            break;
                        case '\'':
                            jT9 = jf.e.T(i14, parcel);
                            break;
                    }
                }
                jf.e.B(iX4, parcel);
                return new t4(strW8, strW9, strW10, strW11, jT2, jT3, strW12, zM4, zM, jT10, strW13, jT4, iR2, zM5, zM2, boolValueOf, jT5, arrayListY, strW4, strW5, strW14, zM3, jT6, iR5, strW6, iR3, jT7, strW15, strW7, jT8, iR4, jT9);
            default:
                parcel.getClass();
                int i15 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList.add(zn.e.valueOf(parcel.readString()));
                }
                return new zn.c(arrayList);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f44688a) {
            case 0:
                return new c4[i11];
            case 1:
                return new e4[i11];
            case 2:
                return new o4[i11];
            case 3:
                return new t4[i11];
            default:
                return new zn.c[i11];
        }
    }
}
