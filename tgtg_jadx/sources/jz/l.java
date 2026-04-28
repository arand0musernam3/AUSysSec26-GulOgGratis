package jz;

import a00.q;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Ingredient;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import m00.s;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25497a;

    public /* synthetic */ l(int i11) {
        this.f25497a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25497a) {
            case 0:
                int iX = jf.e.X(parcel);
                boolean zM = false;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        jf.e.W(i11, parcel);
                    } else {
                        zM = jf.e.M(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new d(zM);
            case 1:
                int iX2 = jf.e.X(parcel);
                int iR = 0;
                k kVar = null;
                String strW = null;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c3 = (char) i12;
                    if (c3 == 1) {
                        kVar = (k) jf.e.v(parcel, i12, k.CREATOR);
                    } else if (c3 == 2) {
                        strW = jf.e.w(i12, parcel);
                    } else if (c3 != 3) {
                        jf.e.W(i12, parcel);
                    } else {
                        iR = jf.e.R(i12, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new h(kVar, strW, iR);
            case 2:
                int iX3 = jf.e.X(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        jf.e.W(i13, parcel);
                    } else {
                        pendingIntent = (PendingIntent) jf.e.v(parcel, i13, PendingIntent.CREATOR);
                    }
                }
                jf.e.B(iX3, parcel);
                return new i(pendingIntent);
            case 3:
                int iX4 = jf.e.X(parcel);
                String strW2 = null;
                String strW3 = null;
                String strW4 = null;
                String strW5 = null;
                Uri uri = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                q qVar = null;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strW2 = jf.e.w(i14, parcel);
                            break;
                        case 2:
                            strW3 = jf.e.w(i14, parcel);
                            break;
                        case 3:
                            strW4 = jf.e.w(i14, parcel);
                            break;
                        case 4:
                            strW5 = jf.e.w(i14, parcel);
                            break;
                        case 5:
                            uri = (Uri) jf.e.v(parcel, i14, Uri.CREATOR);
                            break;
                        case 6:
                            strW6 = jf.e.w(i14, parcel);
                            break;
                        case 7:
                            strW7 = jf.e.w(i14, parcel);
                            break;
                        case '\b':
                            strW8 = jf.e.w(i14, parcel);
                            break;
                        case '\t':
                            qVar = (q) jf.e.v(parcel, i14, q.CREATOR);
                            break;
                        default:
                            jf.e.W(i14, parcel);
                            break;
                    }
                }
                jf.e.B(iX4, parcel);
                return new j(strW2, strW3, strW4, strW5, uri, strW6, strW7, strW8, qVar);
            case 4:
                int iX5 = jf.e.X(parcel);
                String strW9 = null;
                String strW10 = null;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 1) {
                        strW9 = jf.e.w(i15, parcel);
                    } else if (c7 != 2) {
                        jf.e.W(i15, parcel);
                    } else {
                        strW10 = jf.e.w(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                return new k(strW9, strW10);
            case 5:
                int iX6 = jf.e.X(parcel);
                String strW11 = null;
                String strW12 = null;
                String strW13 = null;
                String strW14 = null;
                Uri uri2 = null;
                String strW15 = null;
                String strW16 = null;
                ArrayList arrayListA = null;
                String strW17 = null;
                String strW18 = null;
                long jT = 0;
                while (parcel.dataPosition() < iX6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strW11 = jf.e.w(i16, parcel);
                            break;
                        case 3:
                            strW12 = jf.e.w(i16, parcel);
                            break;
                        case 4:
                            strW13 = jf.e.w(i16, parcel);
                            break;
                        case 5:
                            strW14 = jf.e.w(i16, parcel);
                            break;
                        case 6:
                            uri2 = (Uri) jf.e.v(parcel, i16, Uri.CREATOR);
                            break;
                        case 7:
                            strW15 = jf.e.w(i16, parcel);
                            break;
                        case '\b':
                            jT = jf.e.T(i16, parcel);
                            break;
                        case '\t':
                            strW16 = jf.e.w(i16, parcel);
                            break;
                        case '\n':
                            arrayListA = jf.e.A(parcel, i16, Scope.CREATOR);
                            break;
                        case 11:
                            strW17 = jf.e.w(i16, parcel);
                            break;
                        case '\f':
                            strW18 = jf.e.w(i16, parcel);
                            break;
                        default:
                            jf.e.W(i16, parcel);
                            break;
                    }
                }
                jf.e.B(iX6, parcel);
                return new GoogleSignInAccount(strW11, strW12, strW13, strW14, uri2, strW15, jT, strW16, arrayListA, strW17, strW18);
            case 6:
                int iX7 = jf.e.X(parcel);
                ArrayList arrayListA2 = null;
                ArrayList arrayListA3 = null;
                Account account = null;
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                int iR2 = 0;
                boolean zM2 = false;
                boolean zM3 = false;
                boolean zM4 = false;
                while (parcel.dataPosition() < iX7) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iR2 = jf.e.R(i17, parcel);
                            break;
                        case 2:
                            arrayListA3 = jf.e.A(parcel, i17, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) jf.e.v(parcel, i17, Account.CREATOR);
                            break;
                        case 4:
                            zM2 = jf.e.M(i17, parcel);
                            break;
                        case 5:
                            zM3 = jf.e.M(i17, parcel);
                            break;
                        case 6:
                            zM4 = jf.e.M(i17, parcel);
                            break;
                        case 7:
                            strW19 = jf.e.w(i17, parcel);
                            break;
                        case '\b':
                            strW20 = jf.e.w(i17, parcel);
                            break;
                        case '\t':
                            arrayListA2 = jf.e.A(parcel, i17, lz.a.CREATOR);
                            break;
                        case '\n':
                            strW21 = jf.e.w(i17, parcel);
                            break;
                        default:
                            jf.e.W(i17, parcel);
                            break;
                    }
                }
                jf.e.B(iX7, parcel);
                return new GoogleSignInOptions(iR2, arrayListA3, account, zM2, zM3, zM4, strW19, strW20, GoogleSignInOptions.e(arrayListA2), strW21);
            case 7:
                int iX8 = jf.e.X(parcel);
                String strW22 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strW23 = "";
                while (parcel.dataPosition() < iX8) {
                    int i18 = parcel.readInt();
                    char c8 = (char) i18;
                    if (c8 == 4) {
                        strW22 = jf.e.w(i18, parcel);
                    } else if (c8 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) jf.e.v(parcel, i18, GoogleSignInAccount.CREATOR);
                    } else if (c8 != '\b') {
                        jf.e.W(i18, parcel);
                    } else {
                        strW23 = jf.e.w(i18, parcel);
                    }
                }
                jf.e.B(iX8, parcel);
                return new SignInAccount(strW22, googleSignInAccount, strW23);
            case 8:
                int iX9 = jf.e.X(parcel);
                Bundle bundleQ = null;
                int iR3 = 0;
                int iR4 = 0;
                while (parcel.dataPosition() < iX9) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        iR3 = jf.e.R(i19, parcel);
                    } else if (c11 == 2) {
                        iR4 = jf.e.R(i19, parcel);
                    } else if (c11 != 3) {
                        jf.e.W(i19, parcel);
                    } else {
                        bundleQ = jf.e.q(i19, parcel);
                    }
                }
                jf.e.B(iX9, parcel);
                return new lz.a(iR3, iR4, bundleQ);
            case 9:
                int iX10 = jf.e.X(parcel);
                String strW24 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iX10) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 2) {
                        strW24 = jf.e.w(i21, parcel);
                    } else if (c12 != 5) {
                        jf.e.W(i21, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) jf.e.v(parcel, i21, GoogleSignInOptions.CREATOR);
                    }
                }
                jf.e.B(iX10, parcel);
                return new SignInConfiguration(strW24, googleSignInOptions);
            case 10:
                int iX11 = jf.e.X(parcel);
                IBinder iBinderQ = null;
                IBinder iBinderQ2 = null;
                PendingIntent pendingIntent2 = null;
                String strW25 = null;
                int iR5 = 0;
                while (parcel.dataPosition() < iX11) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        iR5 = jf.e.R(i22, parcel);
                    } else if (c13 == 2) {
                        iBinderQ = jf.e.Q(i22, parcel);
                    } else if (c13 == 3) {
                        iBinderQ2 = jf.e.Q(i22, parcel);
                    } else if (c13 == 4) {
                        pendingIntent2 = (PendingIntent) jf.e.v(parcel, i22, PendingIntent.CREATOR);
                    } else if (c13 != 6) {
                        jf.e.W(i22, parcel);
                    } else {
                        strW25 = jf.e.w(i22, parcel);
                    }
                }
                jf.e.B(iX11, parcel);
                return new m00.j(iR5, iBinderQ, iBinderQ2, pendingIntent2, strW25);
            case 11:
                int iX12 = jf.e.X(parcel);
                long jT2 = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayListA4 = null;
                boolean zM5 = false;
                boolean zM6 = false;
                boolean zM7 = false;
                boolean zM8 = false;
                while (parcel.dataPosition() < iX12) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        locationRequest = (LocationRequest) jf.e.v(parcel, i23, LocationRequest.CREATOR);
                    } else if (c14 == 5) {
                        arrayListA4 = jf.e.A(parcel, i23, com.google.android.gms.common.internal.g.CREATOR);
                    } else if (c14 == '\b') {
                        zM5 = jf.e.M(i23, parcel);
                    } else if (c14 != '\t') {
                        switch (c14) {
                            case 11:
                                zM7 = jf.e.M(i23, parcel);
                                break;
                            case '\f':
                                zM8 = jf.e.M(i23, parcel);
                                break;
                            case '\r':
                                jf.e.w(i23, parcel);
                                break;
                            case 14:
                                jT2 = jf.e.T(i23, parcel);
                                break;
                            default:
                                jf.e.W(i23, parcel);
                                break;
                        }
                    } else {
                        zM6 = jf.e.M(i23, parcel);
                    }
                }
                jf.e.B(iX12, parcel);
                return new m00.k(locationRequest, arrayListA4, zM5, zM6, zM7, zM8, jT2);
            case 12:
                int iX13 = jf.e.X(parcel);
                m00.k kVar2 = null;
                IBinder iBinderQ3 = null;
                IBinder iBinderQ4 = null;
                PendingIntent pendingIntent3 = null;
                IBinder iBinderQ5 = null;
                String strW26 = null;
                int iR6 = 1;
                while (parcel.dataPosition() < iX13) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iR6 = jf.e.R(i24, parcel);
                            break;
                        case 2:
                            kVar2 = (m00.k) jf.e.v(parcel, i24, m00.k.CREATOR);
                            break;
                        case 3:
                            iBinderQ3 = jf.e.Q(i24, parcel);
                            break;
                        case 4:
                            pendingIntent3 = (PendingIntent) jf.e.v(parcel, i24, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderQ4 = jf.e.Q(i24, parcel);
                            break;
                        case 6:
                            iBinderQ5 = jf.e.Q(i24, parcel);
                            break;
                        case 7:
                        default:
                            jf.e.W(i24, parcel);
                            break;
                        case '\b':
                            strW26 = jf.e.w(i24, parcel);
                            break;
                    }
                }
                jf.e.B(iX13, parcel);
                return new m00.l(iR6, kVar2, iBinderQ3, iBinderQ4, pendingIntent3, iBinderQ5, strW26);
            case 13:
                int iX14 = jf.e.X(parcel);
                String strW27 = null;
                String strW28 = null;
                String strW29 = null;
                ArrayList arrayListA5 = null;
                m00.i iVar = null;
                int iR7 = 0;
                while (parcel.dataPosition() < iX14) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        iR7 = jf.e.R(i25, parcel);
                    } else if (c15 == 3) {
                        strW27 = jf.e.w(i25, parcel);
                    } else if (c15 == 4) {
                        strW28 = jf.e.w(i25, parcel);
                    } else if (c15 == 6) {
                        strW29 = jf.e.w(i25, parcel);
                    } else if (c15 == 7) {
                        iVar = (m00.i) jf.e.v(parcel, i25, m00.i.CREATOR);
                    } else if (c15 != '\b') {
                        jf.e.W(i25, parcel);
                    } else {
                        arrayListA5 = jf.e.A(parcel, i25, pz.d.CREATOR);
                    }
                }
                jf.e.B(iX14, parcel);
                return new m00.i(iR7, strW27, strW28, strW29, arrayListA5, iVar);
            case 14:
                int iX15 = jf.e.X(parcel);
                Status status = null;
                while (parcel.dataPosition() < iX15) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        jf.e.W(i26, parcel);
                    } else {
                        status = (Status) jf.e.v(parcel, i26, Status.CREATOR);
                    }
                }
                jf.e.B(iX15, parcel);
                return new s(status);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m10.b bVar = new m10.b();
                bVar.f28729i = 255;
                bVar.f28731k = -2;
                bVar.l = -2;
                bVar.f28732m = -2;
                bVar.f28739t = Boolean.TRUE;
                bVar.f28721a = parcel.readInt();
                bVar.f28722b = (Integer) parcel.readSerializable();
                bVar.f28723c = (Integer) parcel.readSerializable();
                bVar.f28724d = (Integer) parcel.readSerializable();
                bVar.f28725e = (Integer) parcel.readSerializable();
                bVar.f28726f = (Integer) parcel.readSerializable();
                bVar.f28727g = (Integer) parcel.readSerializable();
                bVar.f28728h = (Integer) parcel.readSerializable();
                bVar.f28729i = parcel.readInt();
                bVar.f28730j = parcel.readString();
                bVar.f28731k = parcel.readInt();
                bVar.l = parcel.readInt();
                bVar.f28732m = parcel.readInt();
                bVar.f28734o = parcel.readString();
                bVar.f28735p = parcel.readString();
                bVar.f28736q = parcel.readInt();
                bVar.f28738s = (Integer) parcel.readSerializable();
                bVar.f28740u = (Integer) parcel.readSerializable();
                bVar.f28741v = (Integer) parcel.readSerializable();
                bVar.f28742w = (Integer) parcel.readSerializable();
                bVar.f28743x = (Integer) parcel.readSerializable();
                bVar.f28744y = (Integer) parcel.readSerializable();
                bVar.f28745z = (Integer) parcel.readSerializable();
                bVar.C = (Integer) parcel.readSerializable();
                bVar.A = (Integer) parcel.readSerializable();
                bVar.B = (Integer) parcel.readSerializable();
                bVar.f28739t = (Boolean) parcel.readSerializable();
                bVar.f28733n = (Locale) parcel.readSerializable();
                bVar.D = (Boolean) parcel.readSerializable();
                bVar.E = (Integer) parcel.readSerializable();
                return bVar;
            case 16:
                m7.f fVar = new m7.f(parcel);
                fVar.f29721a = parcel.readInt();
                return fVar;
            case 17:
                parcel.getClass();
                return new mq.b(parcel.readInt() != 0);
            case 18:
                parcel.getClass();
                parcel.readInt();
                return new mq.c();
            case 19:
                parcel.getClass();
                parcel.readInt();
                return new mq.d();
            case 20:
                int iX16 = jf.e.X(parcel);
                Bundle bundleQ2 = null;
                while (parcel.dataPosition() < iX16) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        jf.e.W(i27, parcel);
                    } else {
                        bundleQ2 = jf.e.q(i27, parcel);
                    }
                }
                jf.e.B(iX16, parcel);
                return new mz.a(bundleQ2);
            case 21:
                int iX17 = jf.e.X(parcel);
                Bundle bundleQ3 = null;
                while (parcel.dataPosition() < iX17) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        jf.e.W(i28, parcel);
                    } else {
                        bundleQ3 = jf.e.q(i28, parcel);
                    }
                }
                jf.e.B(iX17, parcel);
                return new mz.b(bundleQ3);
            case 22:
                int iX18 = jf.e.X(parcel);
                Bundle bundleQ4 = null;
                while (parcel.dataPosition() < iX18) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        jf.e.W(i29, parcel);
                    } else {
                        bundleQ4 = jf.e.q(i29, parcel);
                    }
                }
                jf.e.B(iX18, parcel);
                return new mz.c(bundleQ4);
            case 23:
                int iX19 = jf.e.X(parcel);
                Bundle bundleQ5 = null;
                while (parcel.dataPosition() < iX19) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        jf.e.W(i31, parcel);
                    } else {
                        bundleQ5 = jf.e.q(i31, parcel);
                    }
                }
                jf.e.B(iX19, parcel);
                return new mz.d(bundleQ5);
            case 24:
                int iX20 = jf.e.X(parcel);
                Bundle bundleQ6 = null;
                while (parcel.dataPosition() < iX20) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        jf.e.W(i32, parcel);
                    } else {
                        bundleQ6 = jf.e.q(i32, parcel);
                    }
                }
                jf.e.B(iX20, parcel);
                return new mz.e(bundleQ6);
            case 25:
                parcel.getClass();
                return new nk.b(parcel.readInt());
            case 26:
                parcel.getClass();
                parcel.readInt();
                return nk.c.f30977a;
            case 27:
                parcel.getClass();
                return new nk.d(Ingredient.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
            case 28:
                parcel.getClass();
                return new nk.e(ItemTagInfo.CREATOR.createFromParcel(parcel), (BasicItem) parcel.readParcelable(nk.e.class.getClassLoader()));
            default:
                parcel.getClass();
                return new nn.a(parcel.readString(), parcel.readString(), lv.q.valueOf(parcel.readString()), (Function0) parcel.readSerializable(), nn.b.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f25497a) {
            case 0:
                return new d[i11];
            case 1:
                return new h[i11];
            case 2:
                return new i[i11];
            case 3:
                return new j[i11];
            case 4:
                return new k[i11];
            case 5:
                return new GoogleSignInAccount[i11];
            case 6:
                return new GoogleSignInOptions[i11];
            case 7:
                return new SignInAccount[i11];
            case 8:
                return new lz.a[i11];
            case 9:
                return new SignInConfiguration[i11];
            case 10:
                return new m00.j[i11];
            case 11:
                return new m00.k[i11];
            case 12:
                return new m00.l[i11];
            case 13:
                return new m00.i[i11];
            case 14:
                return new s[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new m10.b[i11];
            case 16:
                return new m7.f[i11];
            case 17:
                return new mq.b[i11];
            case 18:
                return new mq.c[i11];
            case 19:
                return new mq.d[i11];
            case 20:
                return new mz.a[i11];
            case 21:
                return new mz.b[i11];
            case 22:
                return new mz.c[i11];
            case 23:
                return new mz.d[i11];
            case 24:
                return new mz.e[i11];
            case 25:
                return new nk.b[i11];
            case 26:
                return new nk.c[i11];
            case 27:
                return new nk.d[i11];
            case 28:
                return new nk.e[i11];
            default:
                return new nn.a[i11];
        }
    }
}
