package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11208a;

    public /* synthetic */ v(int i11) {
        this.f11208a = i11;
    }

    public static void a(k kVar, Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        int i12 = kVar.f11136a;
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(i12);
        int i13 = kVar.f11137b;
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(i13);
        int i14 = kVar.f11138c;
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(i14);
        lx.u.b0(kVar.f11139d, parcel, 4);
        lx.u.W(parcel, 5, kVar.f11140e);
        lx.u.e0(parcel, 6, kVar.f11141f, i11);
        lx.u.S(parcel, 7, kVar.f11142g);
        lx.u.a0(parcel, 8, kVar.f11143h, i11);
        lx.u.e0(parcel, 10, kVar.f11144i, i11);
        lx.u.e0(parcel, 11, kVar.f11145j, i11);
        boolean z11 = kVar.f11146k;
        lx.u.g0(parcel, 12, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i15 = kVar.l;
        lx.u.g0(parcel, 13, 4);
        parcel.writeInt(i15);
        boolean z12 = kVar.f11147m;
        lx.u.g0(parcel, 14, 4);
        parcel.writeInt(z12 ? 1 : 0);
        lx.u.b0(kVar.f11148n, parcel, 15);
        lx.u.i0(iH0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zM = true;
        int iR = 0;
        int iR2 = 0;
        boolean zM2 = false;
        int iR3 = 0;
        int iR4 = 0;
        boolean zM3 = false;
        int iR5 = 0;
        boolean zM4 = false;
        int iR6 = 0;
        int iR7 = 0;
        int iR8 = 0;
        int iR9 = 0;
        boolean zM5 = false;
        int iR10 = 0;
        int iR11 = 0;
        int iR12 = 0;
        String strW = null;
        String strW2 = null;
        String strW3 = null;
        String strW4 = null;
        ArrayList arrayListU = null;
        String strW5 = null;
        String strW6 = null;
        ArrayList arrayListU2 = null;
        String strW7 = null;
        String strW8 = null;
        String strW9 = null;
        String strW10 = null;
        ArrayList arrayListY = null;
        String strW11 = null;
        Bundle bundleQ = null;
        String strW12 = null;
        e10.c cVar = null;
        String strW13 = null;
        d.b bVar = null;
        Bundle bundleQ2 = null;
        Bundle bundleQ3 = null;
        Account account = null;
        ArrayList arrayListA = null;
        switch (this.f11208a) {
            case 0:
                int iX = jf.e.X(parcel);
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 1) {
                        iR = jf.e.R(i11, parcel);
                    } else if (c3 != 2) {
                        jf.e.W(i11, parcel);
                    } else {
                        strW = jf.e.w(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new g(iR, strW);
            case 1:
                int iX2 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iR12 = jf.e.R(i12, parcel);
                    } else if (c7 != 2) {
                        jf.e.W(i12, parcel);
                    } else {
                        arrayListA = jf.e.A(parcel, i12, p.CREATOR);
                    }
                }
                jf.e.B(iX2, parcel);
                return new t(iR12, arrayListA);
            case 2:
                int iX3 = jf.e.X(parcel);
                int iR13 = -1;
                long jT = 0;
                long jT2 = 0;
                int iR14 = 0;
                int iR15 = 0;
                int iR16 = 0;
                int iR17 = 0;
                String strW14 = null;
                String strW15 = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iR14 = jf.e.R(i13, parcel);
                            break;
                        case 2:
                            iR15 = jf.e.R(i13, parcel);
                            break;
                        case 3:
                            iR16 = jf.e.R(i13, parcel);
                            break;
                        case 4:
                            jT = jf.e.T(i13, parcel);
                            break;
                        case 5:
                            jT2 = jf.e.T(i13, parcel);
                            break;
                        case 6:
                            strW14 = jf.e.w(i13, parcel);
                            break;
                        case 7:
                            strW15 = jf.e.w(i13, parcel);
                            break;
                        case '\b':
                            iR17 = jf.e.R(i13, parcel);
                            break;
                        case '\t':
                            iR13 = jf.e.R(i13, parcel);
                            break;
                        default:
                            jf.e.W(i13, parcel);
                            break;
                    }
                }
                jf.e.B(iX3, parcel);
                return new p(iR14, iR15, iR16, jT, jT2, strW14, strW15, iR17, iR13);
            case 3:
                int iX4 = jf.e.X(parcel);
                int iR18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        iR11 = jf.e.R(i14, parcel);
                    } else if (c8 == 2) {
                        account = (Account) jf.e.v(parcel, i14, Account.CREATOR);
                    } else if (c8 == 3) {
                        iR18 = jf.e.R(i14, parcel);
                    } else if (c8 != 4) {
                        jf.e.W(i14, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) jf.e.v(parcel, i14, GoogleSignInAccount.CREATOR);
                    }
                }
                jf.e.B(iX4, parcel);
                return new b0(iR11, account, iR18, googleSignInAccount);
            case 4:
                int iX5 = jf.e.X(parcel);
                int iR19 = 0;
                boolean zM6 = false;
                boolean zM7 = false;
                IBinder iBinderQ = null;
                pz.b bVar2 = null;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        iR19 = jf.e.R(i15, parcel);
                    } else if (c11 == 2) {
                        iBinderQ = jf.e.Q(i15, parcel);
                    } else if (c11 == 3) {
                        bVar2 = (pz.b) jf.e.v(parcel, i15, pz.b.CREATOR);
                    } else if (c11 == 4) {
                        zM6 = jf.e.M(i15, parcel);
                    } else if (c11 != 5) {
                        jf.e.W(i15, parcel);
                    } else {
                        zM7 = jf.e.M(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                return new c0(iR19, iBinderQ, bVar2, zM6, zM7);
            case 5:
                int iX6 = jf.e.X(parcel);
                int iR20 = 0;
                boolean zM8 = false;
                boolean zM9 = false;
                int iR21 = 0;
                int iR22 = 0;
                while (parcel.dataPosition() < iX6) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iR20 = jf.e.R(i16, parcel);
                    } else if (c12 == 2) {
                        zM8 = jf.e.M(i16, parcel);
                    } else if (c12 == 3) {
                        zM9 = jf.e.M(i16, parcel);
                    } else if (c12 == 4) {
                        iR21 = jf.e.R(i16, parcel);
                    } else if (c12 != 5) {
                        jf.e.W(i16, parcel);
                    } else {
                        iR22 = jf.e.R(i16, parcel);
                    }
                }
                jf.e.B(iX6, parcel);
                return new s(iR20, zM8, zM9, iR21, iR22);
            case 6:
                int iX7 = jf.e.X(parcel);
                pz.d[] dVarArr = null;
                j jVar = null;
                while (parcel.dataPosition() < iX7) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        bundleQ3 = jf.e.q(i17, parcel);
                    } else if (c13 == 2) {
                        dVarArr = (pz.d[]) jf.e.z(parcel, i17, pz.d.CREATOR);
                    } else if (c13 == 3) {
                        iR10 = jf.e.R(i17, parcel);
                    } else if (c13 != 4) {
                        jf.e.W(i17, parcel);
                    } else {
                        jVar = (j) jf.e.v(parcel, i17, j.CREATOR);
                    }
                }
                jf.e.B(iX7, parcel);
                p0 p0Var = new p0();
                p0Var.f11169a = bundleQ3;
                p0Var.f11170b = dVarArr;
                p0Var.f11171c = iR10;
                p0Var.f11172d = jVar;
                return p0Var;
            case 7:
                int iX8 = jf.e.X(parcel);
                boolean zM10 = false;
                boolean zM11 = false;
                int iR23 = 0;
                s sVar = null;
                int[] iArrT = null;
                int[] iArrT2 = null;
                while (parcel.dataPosition() < iX8) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            sVar = (s) jf.e.v(parcel, i18, s.CREATOR);
                            break;
                        case 2:
                            zM10 = jf.e.M(i18, parcel);
                            break;
                        case 3:
                            zM11 = jf.e.M(i18, parcel);
                            break;
                        case 4:
                            iArrT = jf.e.t(i18, parcel);
                            break;
                        case 5:
                            iR23 = jf.e.R(i18, parcel);
                            break;
                        case 6:
                            iArrT2 = jf.e.t(i18, parcel);
                            break;
                        default:
                            jf.e.W(i18, parcel);
                            break;
                    }
                }
                jf.e.B(iX8, parcel);
                return new j(sVar, zM10, zM11, iArrT, iR23, iArrT2);
            case 8:
                int iX9 = jf.e.X(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = k.f11134o;
                pz.d[] dVarArr2 = k.f11135p;
                pz.d[] dVarArr3 = dVarArr2;
                int iR24 = 0;
                int iR25 = 0;
                int iR26 = 0;
                boolean zM12 = false;
                int iR27 = 0;
                boolean zM13 = false;
                String strW16 = null;
                IBinder iBinderQ2 = null;
                Account account2 = null;
                String strW17 = null;
                while (parcel.dataPosition() < iX9) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iR24 = jf.e.R(i19, parcel);
                            break;
                        case 2:
                            iR25 = jf.e.R(i19, parcel);
                            break;
                        case 3:
                            iR26 = jf.e.R(i19, parcel);
                            break;
                        case 4:
                            strW16 = jf.e.w(i19, parcel);
                            break;
                        case 5:
                            iBinderQ2 = jf.e.Q(i19, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) jf.e.z(parcel, i19, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = jf.e.q(i19, parcel);
                            break;
                        case '\b':
                            account2 = (Account) jf.e.v(parcel, i19, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            jf.e.W(i19, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (pz.d[]) jf.e.z(parcel, i19, pz.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (pz.d[]) jf.e.z(parcel, i19, pz.d.CREATOR);
                            break;
                        case '\f':
                            zM12 = jf.e.M(i19, parcel);
                            break;
                        case '\r':
                            iR27 = jf.e.R(i19, parcel);
                            break;
                        case 14:
                            zM13 = jf.e.M(i19, parcel);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            strW17 = jf.e.w(i19, parcel);
                            break;
                    }
                }
                jf.e.B(iX9, parcel);
                return new k(iR24, iR25, iR26, strW16, iBinderQ2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zM12, iR27, zM13, strW17);
            case 9:
                int iX10 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX10) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        jf.e.W(i21, parcel);
                    } else {
                        bundleQ2 = jf.e.q(i21, parcel);
                    }
                }
                jf.e.B(iX10, parcel);
                return new com.google.firebase.messaging.y(bundleQ2);
            case 10:
                d.d dVar = new d.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i22 = d.c.f13655h;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.b.f13654d);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d.b)) {
                        d.a aVar = new d.a();
                        aVar.f13653g = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (d.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f13657a = bVar;
                return dVar;
            case 11:
                int iX11 = jf.e.X(parcel);
                e10.b bVar3 = null;
                UserAddress userAddress = null;
                e10.n nVar = null;
                String strW18 = null;
                Bundle bundleQ4 = null;
                String strW19 = null;
                Bundle bundleQ5 = null;
                while (parcel.dataPosition() < iX11) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strW13 = jf.e.w(i23, parcel);
                            break;
                        case 2:
                            bVar3 = (e10.b) jf.e.v(parcel, i23, e10.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) jf.e.v(parcel, i23, UserAddress.CREATOR);
                            break;
                        case 4:
                            nVar = (e10.n) jf.e.v(parcel, i23, e10.n.CREATOR);
                            break;
                        case 5:
                            strW18 = jf.e.w(i23, parcel);
                            break;
                        case 6:
                            bundleQ4 = jf.e.q(i23, parcel);
                            break;
                        case 7:
                            strW19 = jf.e.w(i23, parcel);
                            break;
                        case '\b':
                            bundleQ5 = jf.e.q(i23, parcel);
                            break;
                        default:
                            jf.e.W(i23, parcel);
                            break;
                    }
                }
                jf.e.B(iX11, parcel);
                e10.l lVar = new e10.l();
                lVar.f15520a = strW13;
                lVar.f15521b = bVar3;
                lVar.f15522c = userAddress;
                lVar.f15523d = nVar;
                lVar.f15524e = strW18;
                lVar.f15525f = bundleQ4;
                lVar.f15526g = strW19;
                lVar.f15527h = bundleQ5;
                return lVar;
            case 12:
                int iX12 = jf.e.X(parcel);
                boolean zM14 = false;
                boolean zM15 = false;
                e10.r rVar = null;
                ArrayList arrayListU3 = null;
                e10.o oVar = null;
                e10.s sVar2 = null;
                String strW20 = null;
                byte[] bArrR = null;
                Bundle bundleQ6 = null;
                while (parcel.dataPosition() < iX12) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            zM5 = jf.e.M(i24, parcel);
                            break;
                        case 2:
                            zM14 = jf.e.M(i24, parcel);
                            break;
                        case 3:
                            cVar = (e10.c) jf.e.v(parcel, i24, e10.c.CREATOR);
                            break;
                        case 4:
                            zM15 = jf.e.M(i24, parcel);
                            break;
                        case 5:
                            rVar = (e10.r) jf.e.v(parcel, i24, e10.r.CREATOR);
                            break;
                        case 6:
                            arrayListU3 = jf.e.u(i24, parcel);
                            break;
                        case 7:
                            oVar = (e10.o) jf.e.v(parcel, i24, e10.o.CREATOR);
                            break;
                        case '\b':
                            sVar2 = (e10.s) jf.e.v(parcel, i24, e10.s.CREATOR);
                            break;
                        case '\t':
                            zM = jf.e.M(i24, parcel);
                            break;
                        case '\n':
                            strW20 = jf.e.w(i24, parcel);
                            break;
                        case 11:
                            bundleQ6 = jf.e.q(i24, parcel);
                            break;
                        case '\f':
                            bArrR = jf.e.r(i24, parcel);
                            break;
                        default:
                            jf.e.W(i24, parcel);
                            break;
                    }
                }
                jf.e.B(iX12, parcel);
                e10.m mVar = new e10.m();
                mVar.f15528a = zM5;
                mVar.f15529b = zM14;
                mVar.f15530c = cVar;
                mVar.f15531d = zM15;
                mVar.f15532e = rVar;
                mVar.f15533f = arrayListU3;
                mVar.f15534g = oVar;
                mVar.f15535h = sVar2;
                mVar.f15536i = zM;
                mVar.f15537j = strW20;
                mVar.f15538k = bArrR;
                mVar.l = bundleQ6;
                return mVar;
            case 13:
                int iX13 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX13) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 2) {
                        iR9 = jf.e.R(i25, parcel);
                    } else if (c14 != 3) {
                        jf.e.W(i25, parcel);
                    } else {
                        strW12 = jf.e.w(i25, parcel);
                    }
                }
                jf.e.B(iX13, parcel);
                e10.n nVar2 = new e10.n();
                nVar2.f15539a = iR9;
                nVar2.f15540b = strW12;
                return nVar2;
            case 14:
                int iX14 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX14) {
                    int i26 = parcel.readInt();
                    char c15 = (char) i26;
                    if (c15 == 2) {
                        iR8 = jf.e.R(i26, parcel);
                    } else if (c15 != 3) {
                        jf.e.W(i26, parcel);
                    } else {
                        bundleQ = jf.e.q(i26, parcel);
                    }
                }
                jf.e.B(iX14, parcel);
                return new e10.o(iR8, bundleQ);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iX15 = jf.e.X(parcel);
                int iR28 = 0;
                String strW21 = null;
                while (parcel.dataPosition() < iX15) {
                    int i27 = parcel.readInt();
                    char c16 = (char) i27;
                    if (c16 == 2) {
                        strW11 = jf.e.w(i27, parcel);
                    } else if (c16 == 3) {
                        strW21 = jf.e.w(i27, parcel);
                    } else if (c16 == 4) {
                        iR7 = jf.e.R(i27, parcel);
                    } else if (c16 != 5) {
                        jf.e.W(i27, parcel);
                    } else {
                        iR28 = jf.e.R(i27, parcel);
                    }
                }
                jf.e.B(iX15, parcel);
                return new e10.x(strW11, strW21, iR7, iR28);
            case 16:
                int iX16 = jf.e.X(parcel);
                while (parcel.dataPosition() < iX16) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        jf.e.W(i28, parcel);
                    } else {
                        arrayListY = jf.e.y(i28, parcel);
                    }
                }
                jf.e.B(iX16, parcel);
                e10.r rVar2 = new e10.r();
                rVar2.f15544a = arrayListY;
                return rVar2;
            case 17:
                int iX17 = jf.e.X(parcel);
                String strW22 = null;
                while (parcel.dataPosition() < iX17) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        iR6 = jf.e.R(i29, parcel);
                    } else if (c17 == 2) {
                        strW10 = jf.e.w(i29, parcel);
                    } else if (c17 != 3) {
                        jf.e.W(i29, parcel);
                    } else {
                        strW22 = jf.e.w(i29, parcel);
                    }
                }
                jf.e.B(iX17, parcel);
                e10.s sVar3 = new e10.s();
                sVar3.f15545a = iR6;
                sVar3.f15546b = strW10;
                sVar3.f15547c = strW22;
                return sVar3;
            case 18:
                int iX18 = jf.e.X(parcel);
                Bundle bundleQ7 = null;
                while (parcel.dataPosition() < iX18) {
                    int i31 = parcel.readInt();
                    char c18 = (char) i31;
                    if (c18 == 2) {
                        strW9 = jf.e.w(i31, parcel);
                    } else if (c18 != 3) {
                        jf.e.W(i31, parcel);
                    } else {
                        bundleQ7 = jf.e.q(i31, parcel);
                    }
                }
                jf.e.B(iX18, parcel);
                e10.y yVar = new e10.y();
                yVar.f15569a = strW9;
                yVar.f15570b = bundleQ7;
                return yVar;
            case 19:
                int iX19 = jf.e.X(parcel);
                String strW23 = null;
                String strW24 = null;
                String strW25 = null;
                String strW26 = null;
                String strW27 = null;
                String strW28 = null;
                String strW29 = null;
                String strW30 = null;
                String strW31 = null;
                while (parcel.dataPosition() < iX19) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            strW8 = jf.e.w(i32, parcel);
                            break;
                        case 3:
                            strW23 = jf.e.w(i32, parcel);
                            break;
                        case 4:
                            strW24 = jf.e.w(i32, parcel);
                            break;
                        case 5:
                            strW25 = jf.e.w(i32, parcel);
                            break;
                        case 6:
                            strW26 = jf.e.w(i32, parcel);
                            break;
                        case 7:
                            strW27 = jf.e.w(i32, parcel);
                            break;
                        case '\b':
                            strW28 = jf.e.w(i32, parcel);
                            break;
                        case '\t':
                            strW29 = jf.e.w(i32, parcel);
                            break;
                        case '\n':
                            strW30 = jf.e.w(i32, parcel);
                            break;
                        case 11:
                            zM4 = jf.e.M(i32, parcel);
                            break;
                        case '\f':
                            strW31 = jf.e.w(i32, parcel);
                            break;
                        default:
                            jf.e.W(i32, parcel);
                            break;
                    }
                }
                jf.e.B(iX19, parcel);
                e10.w wVar = new e10.w();
                wVar.f15554a = strW8;
                wVar.f15555b = strW23;
                wVar.f15556c = strW24;
                wVar.f15557d = strW25;
                wVar.f15558e = strW26;
                wVar.f15559f = strW27;
                wVar.f15560g = strW28;
                wVar.f15561h = strW29;
                wVar.f15562i = strW30;
                wVar.f15563j = zM4;
                wVar.f15564k = strW31;
                return wVar;
            case 20:
                int iX20 = jf.e.X(parcel);
                String strW32 = null;
                String strW33 = null;
                UserAddress userAddress2 = null;
                while (parcel.dataPosition() < iX20) {
                    int i33 = parcel.readInt();
                    char c19 = (char) i33;
                    if (c19 == 1) {
                        strW7 = jf.e.w(i33, parcel);
                    } else if (c19 == 2) {
                        strW32 = jf.e.w(i33, parcel);
                    } else if (c19 == 3) {
                        strW33 = jf.e.w(i33, parcel);
                    } else if (c19 == 4) {
                        iR5 = jf.e.R(i33, parcel);
                    } else if (c19 != 5) {
                        jf.e.W(i33, parcel);
                    } else {
                        userAddress2 = (UserAddress) jf.e.v(parcel, i33, UserAddress.CREATOR);
                    }
                }
                jf.e.B(iX20, parcel);
                e10.b bVar4 = new e10.b();
                bVar4.f15471a = strW7;
                bVar4.f15472b = strW32;
                bVar4.f15473c = strW33;
                bVar4.f15474d = iR5;
                bVar4.f15475e = userAddress2;
                return bVar4;
            case 21:
                int iX21 = jf.e.X(parcel);
                boolean zM16 = true;
                int iR29 = 0;
                while (parcel.dataPosition() < iX21) {
                    int i34 = parcel.readInt();
                    char c21 = (char) i34;
                    if (c21 == 1) {
                        arrayListU2 = jf.e.u(i34, parcel);
                    } else if (c21 == 2) {
                        zM16 = jf.e.M(i34, parcel);
                    } else if (c21 == 3) {
                        zM3 = jf.e.M(i34, parcel);
                    } else if (c21 != 4) {
                        jf.e.W(i34, parcel);
                    } else {
                        iR29 = jf.e.R(i34, parcel);
                    }
                }
                jf.e.B(iX21, parcel);
                e10.c cVar2 = new e10.c();
                cVar2.f15477a = arrayListU2;
                cVar2.f15478b = zM16;
                cVar2.f15479c = zM3;
                cVar2.f15480d = iR29;
                return cVar2;
            case 22:
                int iX22 = jf.e.X(parcel);
                int iR30 = 0;
                while (parcel.dataPosition() < iX22) {
                    int i35 = parcel.readInt();
                    char c22 = (char) i35;
                    if (c22 == 1) {
                        iR4 = jf.e.R(i35, parcel);
                    } else if (c22 != 2) {
                        jf.e.W(i35, parcel);
                    } else {
                        iR30 = jf.e.R(i35, parcel);
                    }
                }
                jf.e.B(iX22, parcel);
                e10.d dVar2 = new e10.d();
                dVar2.f15481a = iR4;
                dVar2.f15482b = iR30;
                return dVar2;
            case 23:
                int iX23 = jf.e.X(parcel);
                String strW34 = null;
                e10.x xVar = null;
                String strW35 = null;
                e10.w wVar2 = null;
                e10.w wVar3 = null;
                String[] strArrX = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                e10.e[] eVarArr = null;
                e10.n nVar3 = null;
                while (parcel.dataPosition() < iX23) {
                    int i36 = parcel.readInt();
                    switch ((char) i36) {
                        case 2:
                            strW6 = jf.e.w(i36, parcel);
                            break;
                        case 3:
                            strW34 = jf.e.w(i36, parcel);
                            break;
                        case 4:
                            xVar = (e10.x) jf.e.v(parcel, i36, e10.x.CREATOR);
                            break;
                        case 5:
                            strW35 = jf.e.w(i36, parcel);
                            break;
                        case 6:
                            wVar2 = (e10.w) jf.e.v(parcel, i36, e10.w.CREATOR);
                            break;
                        case 7:
                            wVar3 = (e10.w) jf.e.v(parcel, i36, e10.w.CREATOR);
                            break;
                        case '\b':
                            strArrX = jf.e.x(i36, parcel);
                            break;
                        case '\t':
                            userAddress3 = (UserAddress) jf.e.v(parcel, i36, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) jf.e.v(parcel, i36, UserAddress.CREATOR);
                            break;
                        case 11:
                            eVarArr = (e10.e[]) jf.e.z(parcel, i36, e10.e.CREATOR);
                            break;
                        case '\f':
                            nVar3 = (e10.n) jf.e.v(parcel, i36, e10.n.CREATOR);
                            break;
                        default:
                            jf.e.W(i36, parcel);
                            break;
                    }
                }
                jf.e.B(iX23, parcel);
                FullWallet fullWallet = new FullWallet();
                fullWallet.f12157a = strW6;
                fullWallet.f12158b = strW34;
                fullWallet.f12159c = xVar;
                fullWallet.f12160d = strW35;
                fullWallet.f12161e = wVar2;
                fullWallet.f12162f = wVar3;
                fullWallet.f12163g = strArrX;
                fullWallet.f12164h = userAddress3;
                fullWallet.f12165i = userAddress4;
                fullWallet.f12166j = eVarArr;
                fullWallet.f12167k = nVar3;
                return fullWallet;
            case 24:
                int iX24 = jf.e.X(parcel);
                String strW36 = null;
                while (parcel.dataPosition() < iX24) {
                    int i37 = parcel.readInt();
                    char c23 = (char) i37;
                    if (c23 == 2) {
                        strW5 = jf.e.w(i37, parcel);
                    } else if (c23 == 3) {
                        strW36 = jf.e.w(i37, parcel);
                    } else if (c23 != 4) {
                        jf.e.W(i37, parcel);
                    } else {
                        iR3 = jf.e.R(i37, parcel);
                    }
                }
                jf.e.B(iX24, parcel);
                e10.e eVar = new e10.e();
                eVar.f15483a = strW5;
                eVar.f15484b = strW36;
                eVar.f15485c = iR3;
                return eVar;
            case 25:
                int iX25 = jf.e.X(parcel);
                String strW37 = null;
                String strW38 = null;
                ArrayList arrayListU4 = null;
                String strW39 = null;
                while (parcel.dataPosition() < iX25) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case 2:
                            arrayListU = jf.e.u(i38, parcel);
                            break;
                        case 3:
                        default:
                            jf.e.W(i38, parcel);
                            break;
                        case 4:
                            strW37 = jf.e.w(i38, parcel);
                            break;
                        case 5:
                            strW38 = jf.e.w(i38, parcel);
                            break;
                        case 6:
                            arrayListU4 = jf.e.u(i38, parcel);
                            break;
                        case 7:
                            zM2 = jf.e.M(i38, parcel);
                            break;
                        case '\b':
                            strW39 = jf.e.w(i38, parcel);
                            break;
                    }
                }
                jf.e.B(iX25, parcel);
                e10.f fVar = new e10.f();
                fVar.f15486a = arrayListU;
                fVar.f15487b = strW37;
                fVar.f15488c = strW38;
                fVar.f15489d = arrayListU4;
                fVar.f15490e = zM2;
                fVar.f15491f = strW39;
                return fVar;
            case 26:
                int iX26 = jf.e.X(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayListA2 = arrayList;
                ArrayList arrayListA3 = arrayList2;
                ArrayList arrayListA4 = arrayList3;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int iR31 = 0;
                boolean zM17 = false;
                String strW40 = null;
                String strW41 = null;
                String strW42 = null;
                String strW43 = null;
                String strW44 = null;
                String strW45 = null;
                String strW46 = null;
                String strW47 = null;
                String strW48 = null;
                String strW49 = null;
                h10.f fVar2 = null;
                String strW50 = null;
                String strW51 = null;
                h10.c cVar3 = null;
                ArrayList arrayList6 = new ArrayList();
                while (parcel.dataPosition() < iX26) {
                    int i39 = parcel.readInt();
                    switch ((char) i39) {
                        case 2:
                            strW40 = jf.e.w(i39, parcel);
                            break;
                        case 3:
                            strW41 = jf.e.w(i39, parcel);
                            break;
                        case 4:
                            strW42 = jf.e.w(i39, parcel);
                            break;
                        case 5:
                            strW43 = jf.e.w(i39, parcel);
                            break;
                        case 6:
                            strW44 = jf.e.w(i39, parcel);
                            break;
                        case 7:
                            strW45 = jf.e.w(i39, parcel);
                            break;
                        case '\b':
                            strW46 = jf.e.w(i39, parcel);
                            break;
                        case '\t':
                            strW47 = jf.e.w(i39, parcel);
                            break;
                        case '\n':
                            strW48 = jf.e.w(i39, parcel);
                            break;
                        case 11:
                            strW49 = jf.e.w(i39, parcel);
                            break;
                        case '\f':
                            iR31 = jf.e.R(i39, parcel);
                            break;
                        case '\r':
                            arrayListA2 = jf.e.A(parcel, i39, h10.h.CREATOR);
                            break;
                        case 14:
                            fVar2 = (h10.f) jf.e.v(parcel, i39, h10.f.CREATOR);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            arrayListA3 = jf.e.A(parcel, i39, LatLng.CREATOR);
                            break;
                        case 16:
                            strW50 = jf.e.w(i39, parcel);
                            break;
                        case 17:
                            strW51 = jf.e.w(i39, parcel);
                            break;
                        case 18:
                            arrayListA4 = jf.e.A(parcel, i39, h10.b.CREATOR);
                            break;
                        case 19:
                            zM17 = jf.e.M(i39, parcel);
                            break;
                        case 20:
                            arrayList4 = jf.e.A(parcel, i39, h10.g.CREATOR);
                            break;
                        case 21:
                            arrayList5 = jf.e.A(parcel, i39, h10.e.CREATOR);
                            break;
                        case 22:
                            arrayList6 = jf.e.A(parcel, i39, h10.g.CREATOR);
                            break;
                        case 23:
                            cVar3 = (h10.c) jf.e.v(parcel, i39, h10.c.CREATOR);
                            break;
                        default:
                            jf.e.W(i39, parcel);
                            break;
                    }
                }
                jf.e.B(iX26, parcel);
                return new e10.g(strW40, strW41, strW42, strW43, strW44, strW45, strW46, strW47, strW48, strW49, iR31, arrayListA2, fVar2, arrayListA3, strW50, strW51, arrayListA4, zM17, arrayList4, arrayList5, arrayList6, cVar3);
            case 27:
                int iX27 = jf.e.X(parcel);
                String strW52 = null;
                String[] strArrX2 = null;
                String strW53 = null;
                e10.w wVar4 = null;
                e10.w wVar5 = null;
                e10.g[] gVarArr = null;
                e10.h[] hVarArr = null;
                UserAddress userAddress5 = null;
                UserAddress userAddress6 = null;
                e10.e[] eVarArr2 = null;
                while (parcel.dataPosition() < iX27) {
                    int i41 = parcel.readInt();
                    switch ((char) i41) {
                        case 2:
                            strW4 = jf.e.w(i41, parcel);
                            break;
                        case 3:
                            strW52 = jf.e.w(i41, parcel);
                            break;
                        case 4:
                            strArrX2 = jf.e.x(i41, parcel);
                            break;
                        case 5:
                            strW53 = jf.e.w(i41, parcel);
                            break;
                        case 6:
                            wVar4 = (e10.w) jf.e.v(parcel, i41, e10.w.CREATOR);
                            break;
                        case 7:
                            wVar5 = (e10.w) jf.e.v(parcel, i41, e10.w.CREATOR);
                            break;
                        case '\b':
                            gVarArr = (e10.g[]) jf.e.z(parcel, i41, e10.g.CREATOR);
                            break;
                        case '\t':
                            hVarArr = (e10.h[]) jf.e.z(parcel, i41, e10.h.CREATOR);
                            break;
                        case '\n':
                            userAddress5 = (UserAddress) jf.e.v(parcel, i41, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress6 = (UserAddress) jf.e.v(parcel, i41, UserAddress.CREATOR);
                            break;
                        case '\f':
                            eVarArr2 = (e10.e[]) jf.e.z(parcel, i41, e10.e.CREATOR);
                            break;
                        default:
                            jf.e.W(i41, parcel);
                            break;
                    }
                }
                jf.e.B(iX27, parcel);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.f12168a = strW4;
                maskedWallet.f12169b = strW52;
                maskedWallet.f12170c = strArrX2;
                maskedWallet.f12171d = strW53;
                maskedWallet.f12172e = wVar4;
                maskedWallet.f12173f = wVar5;
                maskedWallet.f12174g = gVarArr;
                maskedWallet.f12175h = hVarArr;
                maskedWallet.f12176i = userAddress5;
                maskedWallet.f12177j = userAddress6;
                maskedWallet.f12178k = eVarArr2;
                return maskedWallet;
            case 28:
                int iX28 = jf.e.X(parcel);
                String strW54 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < iX28) {
                    int i42 = parcel.readInt();
                    char c24 = (char) i42;
                    if (c24 == 1) {
                        iR2 = jf.e.R(i42, parcel);
                    } else if (c24 == 2) {
                        strW3 = jf.e.w(i42, parcel);
                    } else if (c24 == 3) {
                        strW54 = jf.e.w(i42, parcel);
                    } else if (c24 != 4) {
                        jf.e.W(i42, parcel);
                    } else {
                        commonWalletObject = (CommonWalletObject) jf.e.v(parcel, i42, CommonWalletObject.CREATOR);
                    }
                }
                jf.e.B(iX28, parcel);
                return new e10.h(iR2, strW3, strW54, commonWalletObject);
            default:
                int iX29 = jf.e.X(parcel);
                e10.d dVar3 = null;
                while (parcel.dataPosition() < iX29) {
                    int i43 = parcel.readInt();
                    char c25 = (char) i43;
                    if (c25 == 1) {
                        strW2 = jf.e.w(i43, parcel);
                    } else if (c25 != 2) {
                        jf.e.W(i43, parcel);
                    } else {
                        dVar3 = (e10.d) jf.e.v(parcel, i43, e10.d.CREATOR);
                    }
                }
                jf.e.B(iX29, parcel);
                e10.k kVar = new e10.k();
                kVar.f15518a = strW2;
                kVar.f15519b = dVar3;
                return kVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f11208a) {
            case 0:
                return new g[i11];
            case 1:
                return new t[i11];
            case 2:
                return new p[i11];
            case 3:
                return new b0[i11];
            case 4:
                return new c0[i11];
            case 5:
                return new s[i11];
            case 6:
                return new p0[i11];
            case 7:
                return new j[i11];
            case 8:
                return new k[i11];
            case 9:
                return new com.google.firebase.messaging.y[i11];
            case 10:
                return new d.d[i11];
            case 11:
                return new e10.l[i11];
            case 12:
                return new e10.m[i11];
            case 13:
                return new e10.n[i11];
            case 14:
                return new e10.o[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new e10.x[i11];
            case 16:
                return new e10.r[i11];
            case 17:
                return new e10.s[i11];
            case 18:
                return new e10.y[i11];
            case 19:
                return new e10.w[i11];
            case 20:
                return new e10.b[i11];
            case 21:
                return new e10.c[i11];
            case 22:
                return new e10.d[i11];
            case 23:
                return new FullWallet[i11];
            case 24:
                return new e10.e[i11];
            case 25:
                return new e10.f[i11];
            case 26:
                return new e10.g[i11];
            case 27:
                return new MaskedWallet[i11];
            case 28:
                return new e10.h[i11];
            default:
                return new e10.k[i11];
        }
    }
}
