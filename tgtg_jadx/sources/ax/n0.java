package ax;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4972a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4972a) {
            case 0:
                parcel.getClass();
                return new o0(parcel);
            case 1:
                int iX = jf.e.X(parcel);
                String strW = null;
                String strW2 = null;
                String strW3 = null;
                String strW4 = null;
                String strW5 = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                String strW9 = null;
                String strW10 = null;
                String strW11 = null;
                String strW12 = null;
                String strW13 = null;
                boolean zM = false;
                String strW14 = null;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    boolean z11 = zM;
                    switch ((char) i11) {
                        case 2:
                            strW = jf.e.w(i11, parcel);
                            break;
                        case 3:
                            strW14 = jf.e.w(i11, parcel);
                            break;
                        case 4:
                            strW2 = jf.e.w(i11, parcel);
                            break;
                        case 5:
                            strW3 = jf.e.w(i11, parcel);
                            break;
                        case 6:
                            strW4 = jf.e.w(i11, parcel);
                            break;
                        case 7:
                            strW5 = jf.e.w(i11, parcel);
                            break;
                        case '\b':
                            strW6 = jf.e.w(i11, parcel);
                            break;
                        case '\t':
                            strW7 = jf.e.w(i11, parcel);
                            break;
                        case '\n':
                            strW8 = jf.e.w(i11, parcel);
                            break;
                        case 11:
                            strW9 = jf.e.w(i11, parcel);
                            break;
                        case '\f':
                            strW10 = jf.e.w(i11, parcel);
                            break;
                        case '\r':
                            strW11 = jf.e.w(i11, parcel);
                            break;
                        case 14:
                            zM = jf.e.M(i11, parcel);
                            continue;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            strW13 = jf.e.w(i11, parcel);
                            break;
                        case 16:
                            strW12 = jf.e.w(i11, parcel);
                            break;
                        default:
                            jf.e.W(i11, parcel);
                            break;
                    }
                    zM = z11;
                }
                boolean z12 = zM;
                jf.e.B(iX, parcel);
                UserAddress userAddress = new UserAddress();
                userAddress.f11217a = strW;
                userAddress.f11218b = strW14;
                userAddress.f11219c = strW2;
                userAddress.f11220d = strW3;
                userAddress.f11221e = strW4;
                userAddress.f11222f = strW5;
                userAddress.f11223g = strW6;
                userAddress.f11224h = strW7;
                userAddress.f11225i = strW8;
                userAddress.f11226j = strW9;
                userAddress.f11227k = strW10;
                userAddress.l = strW11;
                userAddress.f11228m = z12;
                userAddress.f11229n = strW13;
                userAddress.f11230o = strW12;
                return userAddress;
            case 2:
                int iX2 = jf.e.X(parcel);
                Intent intent = null;
                int iR = 0;
                int iR2 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c3 = (char) i12;
                    if (c3 == 1) {
                        iR = jf.e.R(i12, parcel);
                    } else if (c3 == 2) {
                        iR2 = jf.e.R(i12, parcel);
                    } else if (c3 != 3) {
                        jf.e.W(i12, parcel);
                    } else {
                        intent = (Intent) jf.e.v(parcel, i12, Intent.CREATOR);
                    }
                }
                jf.e.B(iX2, parcel);
                return new b10.b(iR, iR2, intent);
            case 3:
                int iX3 = jf.e.X(parcel);
                ArrayList arrayListY = null;
                String strW15 = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        arrayListY = jf.e.y(i13, parcel);
                    } else if (c7 != 2) {
                        jf.e.W(i13, parcel);
                    } else {
                        strW15 = jf.e.w(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new b10.d(strW15, arrayListY);
            case 4:
                int iX4 = jf.e.X(parcel);
                pz.b bVar = null;
                int iR3 = 0;
                com.google.android.gms.common.internal.c0 c0Var = null;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        iR3 = jf.e.R(i14, parcel);
                    } else if (c8 == 2) {
                        bVar = (pz.b) jf.e.v(parcel, i14, pz.b.CREATOR);
                    } else if (c8 != 3) {
                        jf.e.W(i14, parcel);
                    } else {
                        c0Var = (com.google.android.gms.common.internal.c0) jf.e.v(parcel, i14, com.google.android.gms.common.internal.c0.CREATOR);
                    }
                }
                jf.e.B(iX4, parcel);
                return new b10.e(iR3, bVar, c0Var);
            case 5:
                int iX5 = jf.e.X(parcel);
                boolean zM2 = false;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        jf.e.W(i15, parcel);
                    } else {
                        zM2 = jf.e.M(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                return new c00.a(zM2);
            case 6:
                int iX6 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    jf.e.W(parcel.readInt(), parcel);
                }
                jf.e.B(iX6, parcel);
                return new c00.b();
            case 7:
                int iX7 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX7) {
                    jf.e.W(parcel.readInt(), parcel);
                }
                jf.e.B(iX7, parcel);
                return new c00.c();
            case 8:
                int iX8 = jf.e.X(parcel);
                boolean zM3 = false;
                while (parcel.dataPosition() < iX8) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        jf.e.W(i16, parcel);
                    } else {
                        zM3 = jf.e.M(i16, parcel);
                    }
                }
                jf.e.B(iX8, parcel);
                return new c00.d(zM3);
            case 9:
                int iX9 = jf.e.X(parcel);
                boolean zM4 = false;
                while (parcel.dataPosition() < iX9) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        jf.e.W(i17, parcel);
                    } else {
                        zM4 = jf.e.M(i17, parcel);
                    }
                }
                jf.e.B(iX9, parcel);
                return new c00.e(zM4);
            case 10:
                int iX10 = jf.e.X(parcel);
                PendingIntent pendingIntent = null;
                c00.h hVar = null;
                while (parcel.dataPosition() < iX10) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        pendingIntent = (PendingIntent) jf.e.v(parcel, i18, PendingIntent.CREATOR);
                    } else if (c11 != 2) {
                        jf.e.W(i18, parcel);
                    } else {
                        hVar = (c00.h) jf.e.v(parcel, i18, c00.h.CREATOR);
                    }
                }
                jf.e.B(iX10, parcel);
                return new c00.f(pendingIntent, hVar);
            case 11:
                int iX11 = jf.e.X(parcel);
                String strW16 = null;
                Bundle bundleQ = null;
                Bundle bundleQ2 = null;
                String strW17 = null;
                String strW18 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iX11) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strW16 = jf.e.w(i19, parcel);
                            break;
                        case 2:
                            bundleQ = jf.e.q(i19, parcel);
                            break;
                        case 3:
                            bundleQ2 = jf.e.q(i19, parcel);
                            break;
                        case 4:
                            strW17 = jf.e.w(i19, parcel);
                            break;
                        case 5:
                            strW18 = jf.e.w(i19, parcel);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) jf.e.v(parcel, i19, ResultReceiver.CREATOR);
                            break;
                        default:
                            jf.e.W(i19, parcel);
                            break;
                    }
                }
                jf.e.B(iX11, parcel);
                return new c00.g(strW16, bundleQ, bundleQ2, strW17, strW18, resultReceiver);
            case 12:
                int iX12 = jf.e.X(parcel);
                String strW19 = null;
                Bundle bundleQ3 = null;
                while (parcel.dataPosition() < iX12) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        strW19 = jf.e.w(i21, parcel);
                    } else if (c12 != 2) {
                        jf.e.W(i21, parcel);
                    } else {
                        bundleQ3 = jf.e.q(i21, parcel);
                    }
                }
                jf.e.B(iX12, parcel);
                return new c00.h(bundleQ3, strW19);
            case 13:
                int iX13 = jf.e.X(parcel);
                String strW20 = null;
                Bundle bundleQ4 = null;
                while (parcel.dataPosition() < iX13) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        strW20 = jf.e.w(i22, parcel);
                    } else if (c13 != 2) {
                        jf.e.W(i22, parcel);
                    } else {
                        bundleQ4 = jf.e.q(i22, parcel);
                    }
                }
                jf.e.B(iX13, parcel);
                return new c00.i(bundleQ4, strW20);
            case 14:
                int iX14 = jf.e.X(parcel);
                String strW21 = "";
                String strW22 = strW21;
                String strW23 = strW22;
                Bundle bundleQ5 = null;
                Bundle bundleQ6 = null;
                String strW24 = null;
                while (parcel.dataPosition() < iX14) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strW21 = jf.e.w(i23, parcel);
                            break;
                        case 2:
                            bundleQ5 = jf.e.q(i23, parcel);
                            break;
                        case 3:
                            bundleQ6 = jf.e.q(i23, parcel);
                            break;
                        case 4:
                            strW24 = jf.e.w(i23, parcel);
                            break;
                        case 5:
                            strW22 = jf.e.w(i23, parcel);
                            break;
                        case 6:
                            strW23 = jf.e.w(i23, parcel);
                            break;
                        default:
                            jf.e.W(i23, parcel);
                            break;
                    }
                }
                jf.e.B(iX14, parcel);
                return new c00.j(strW21, bundleQ5, bundleQ6, strW24, strW22, strW23);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iX15 = jf.e.X(parcel);
                Bundle bundleQ7 = null;
                while (parcel.dataPosition() < iX15) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        jf.e.W(i24, parcel);
                    } else {
                        bundleQ7 = jf.e.q(i24, parcel);
                    }
                }
                jf.e.B(iX15, parcel);
                return new c00.k(bundleQ7);
            case 16:
                int iX16 = jf.e.X(parcel);
                Bundle bundleQ8 = null;
                while (parcel.dataPosition() < iX16) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        jf.e.W(i25, parcel);
                    } else {
                        bundleQ8 = jf.e.q(i25, parcel);
                    }
                }
                jf.e.B(iX16, parcel);
                return new c00.l(bundleQ8);
            case 17:
                int iX17 = jf.e.X(parcel);
                ArrayList arrayListA = null;
                Bundle bundleQ9 = null;
                String strW25 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < iX17) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 1) {
                        arrayListA = jf.e.A(parcel, i26, c00.j.CREATOR);
                    } else if (c14 == 2) {
                        bundleQ9 = jf.e.q(i26, parcel);
                    } else if (c14 == 3) {
                        strW25 = jf.e.w(i26, parcel);
                    } else if (c14 != 4) {
                        jf.e.W(i26, parcel);
                    } else {
                        resultReceiver2 = (ResultReceiver) jf.e.v(parcel, i26, ResultReceiver.CREATOR);
                    }
                }
                jf.e.B(iX17, parcel);
                return new GetCredentialRequest(arrayListA, bundleQ9, strW25, resultReceiver2);
            case 18:
                int iX18 = jf.e.X(parcel);
                c00.i iVar = null;
                while (parcel.dataPosition() < iX18) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        jf.e.W(i27, parcel);
                    } else {
                        iVar = (c00.i) jf.e.v(parcel, i27, c00.i.CREATOR);
                    }
                }
                jf.e.B(iX18, parcel);
                return new c00.m(iVar);
            case 19:
                int iX19 = jf.e.X(parcel);
                Bundle bundleQ10 = null;
                while (parcel.dataPosition() < iX19) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        jf.e.W(i28, parcel);
                    } else {
                        bundleQ10 = jf.e.q(i28, parcel);
                    }
                }
                jf.e.B(iX19, parcel);
                return new c00.n(bundleQ10);
            case 20:
                int iX20 = jf.e.X(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iX20) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        jf.e.W(i29, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) jf.e.v(parcel, i29, PendingIntent.CREATOR);
                    }
                }
                jf.e.B(iX20, parcel);
                return new c00.o(pendingIntent2);
            case 21:
                int iX21 = jf.e.X(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iX21) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        jf.e.W(i31, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) jf.e.v(parcel, i31, PendingIntent.CREATOR);
                    }
                }
                jf.e.B(iX21, parcel);
                return new c00.p(pendingIntent3);
            case 22:
                int iX22 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX22) {
                    jf.e.W(parcel.readInt(), parcel);
                }
                jf.e.B(iX22, parcel);
                return new c00.q();
            case 23:
                int iX23 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX23) {
                    jf.e.W(parcel.readInt(), parcel);
                }
                jf.e.B(iX23, parcel);
                return new c00.r();
            case 24:
                int iX24 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX24) {
                    jf.e.W(parcel.readInt(), parcel);
                }
                jf.e.B(iX24, parcel);
                return new c00.s();
            case 25:
                int iX25 = jf.e.X(parcel);
                String strW26 = null;
                String strW27 = null;
                Bundle bundleQ11 = null;
                while (parcel.dataPosition() < iX25) {
                    int i32 = parcel.readInt();
                    char c15 = (char) i32;
                    if (c15 == 1) {
                        strW26 = jf.e.w(i32, parcel);
                    } else if (c15 == 2) {
                        strW27 = jf.e.w(i32, parcel);
                    } else if (c15 != 3) {
                        jf.e.W(i32, parcel);
                    } else {
                        bundleQ11 = jf.e.q(i32, parcel);
                    }
                }
                jf.e.B(iX25, parcel);
                return new c00.t(strW26, strW27, bundleQ11);
            case 26:
                int iX26 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX26) {
                    jf.e.W(parcel.readInt(), parcel);
                }
                jf.e.B(iX26, parcel);
                return new c00.u();
            case 27:
                parcel.getClass();
                return new cg.a(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Function0) parcel.readSerializable());
            case 28:
                parcel.getClass();
                return new cg.p(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Function0) parcel.readSerializable());
            default:
                parcel.getClass();
                return new cg.u(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Function0) parcel.readSerializable(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f4972a) {
            case 0:
                return new o0[i11];
            case 1:
                return new UserAddress[i11];
            case 2:
                return new b10.b[i11];
            case 3:
                return new b10.d[i11];
            case 4:
                return new b10.e[i11];
            case 5:
                return new c00.a[i11];
            case 6:
                return new c00.b[i11];
            case 7:
                return new c00.c[i11];
            case 8:
                return new c00.d[i11];
            case 9:
                return new c00.e[i11];
            case 10:
                return new c00.f[i11];
            case 11:
                return new c00.g[i11];
            case 12:
                return new c00.h[i11];
            case 13:
                return new c00.i[i11];
            case 14:
                return new c00.j[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new c00.k[i11];
            case 16:
                return new c00.l[i11];
            case 17:
                return new GetCredentialRequest[i11];
            case 18:
                return new c00.m[i11];
            case 19:
                return new c00.n[i11];
            case 20:
                return new c00.o[i11];
            case 21:
                return new c00.p[i11];
            case 22:
                return new c00.q[i11];
            case 23:
                return new c00.r[i11];
            case 24:
                return new c00.s[i11];
            case 25:
                return new c00.t[i11];
            case 26:
                return new c00.u[i11];
            case 27:
                return new cg.a[i11];
            case 28:
                return new cg.p[i11];
            default:
                return new cg.u[i11];
        }
    }
}
