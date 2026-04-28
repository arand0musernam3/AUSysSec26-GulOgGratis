package e10;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.badge.BadgeCTA;
import com.app.tgtg.model.remote.badge.BadgeCollection;
import com.app.tgtg.model.remote.badge.BadgeProgress;
import com.app.tgtg.model.remote.badge.BadgeUserStatus;
import com.app.tgtg.model.remote.order.Order;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15476a;

    public /* synthetic */ b0(int i11) {
        this.f15476a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z11;
        switch (this.f15476a) {
            case 0:
                int iX = jf.e.X(parcel);
                int iR = 0;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        jf.e.W(i11, parcel);
                    } else {
                        iR = jf.e.R(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                i iVar = new i();
                iVar.f15516a = iR;
                return iVar;
            case 1:
                int iX2 = jf.e.X(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        jf.e.W(i12, parcel);
                    } else {
                        pendingIntent = (PendingIntent) jf.e.v(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                jf.e.B(iX2, parcel);
                j jVar = new j();
                jVar.f15517a = pendingIntent;
                return jVar;
            case 2:
                int iX3 = jf.e.X(parcel);
                String strW = null;
                int iR2 = 0;
                int iR3 = 0;
                int iR4 = 0;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iR2 = jf.e.R(i13, parcel);
                    } else if (c3 == 2) {
                        iR3 = jf.e.R(i13, parcel);
                    } else if (c3 == 3) {
                        iR4 = jf.e.R(i13, parcel);
                    } else if (c3 != 4) {
                        jf.e.W(i13, parcel);
                    } else {
                        strW = jf.e.w(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                ButtonOptions buttonOptions = new ButtonOptions();
                buttonOptions.f12183e = false;
                buttonOptions.f12179a = iR2;
                buttonOptions.f12180b = iR3;
                buttonOptions.f12181c = iR4;
                i0.h(strW);
                buttonOptions.f12182d = strW;
                return buttonOptions;
            case 3:
                int iX4 = jf.e.X(parcel);
                String strW2 = null;
                String strW3 = null;
                String strW4 = null;
                String strW5 = null;
                String strW6 = null;
                String strW7 = null;
                int iR5 = 0;
                boolean zM = false;
                String strW8 = null;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strW2 = jf.e.w(i14, parcel);
                            break;
                        case 2:
                            iR5 = jf.e.R(i14, parcel);
                            break;
                        case 3:
                            zM = jf.e.M(i14, parcel);
                            break;
                        case 4:
                            strW8 = jf.e.w(i14, parcel);
                            break;
                        case 5:
                            strW3 = jf.e.w(i14, parcel);
                            break;
                        case 6:
                            strW4 = jf.e.w(i14, parcel);
                            break;
                        case 7:
                            strW5 = jf.e.w(i14, parcel);
                            break;
                        case '\b':
                            strW6 = jf.e.w(i14, parcel);
                            break;
                        case '\t':
                            strW7 = jf.e.w(i14, parcel);
                            break;
                        default:
                            jf.e.W(i14, parcel);
                            break;
                    }
                }
                jf.e.B(iX4, parcel);
                f10.a aVar = new f10.a();
                aVar.f17044a = strW2;
                aVar.f17045b = iR5;
                aVar.f17046c = zM;
                aVar.f17047d = strW8;
                aVar.f17048e = strW3;
                aVar.f17049f = strW4;
                aVar.f17050g = strW5;
                aVar.f17051h = strW6;
                aVar.f17052i = strW7;
                return aVar;
            case 4:
                return new f30.b((PendingIntent) parcel.readParcelable(f30.a.class.getClassLoader()), parcel.readInt() != 0);
            case 5:
                parcel.getClass();
                int i15 = parcel.readInt();
                String string = parcel.readString();
                BadgeUserStatus badgeUserStatusValueOf = BadgeUserStatus.valueOf(parcel.readString());
                BadgeProgress badgeProgressCreateFromParcel = parcel.readInt() == 0 ? null : BadgeProgress.CREATOR.createFromParcel(parcel);
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                string.getClass();
                badgeUserStatusValueOf.getClass();
                gh.c cVar = new gh.c();
                cVar.f20438a = i15;
                cVar.f20439b = string;
                cVar.f20440c = badgeUserStatusValueOf;
                cVar.f20441d = badgeProgressCreateFromParcel;
                cVar.f20442e = numValueOf;
                return cVar;
            case 6:
                parcel.getClass();
                String string2 = parcel.readString();
                gh.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : gh.c.CREATOR.createFromParcel(parcel);
                gh.c cVarCreateFromParcel2 = parcel.readInt() != 0 ? gh.c.CREATOR.createFromParcel(parcel) : null;
                gh.f fVar = new gh.f();
                fVar.f20445a = string2;
                fVar.f20446b = cVarCreateFromParcel;
                fVar.f20447c = cVarCreateFromParcel2;
                return fVar;
            case 7:
                parcel.getClass();
                int i16 = parcel.readInt();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                BadgeProgress badgeProgressCreateFromParcel2 = parcel.readInt() == 0 ? null : BadgeProgress.CREATOR.createFromParcel(parcel);
                BadgeCTA badgeCTACreateFromParcel = parcel.readInt() != 0 ? BadgeCTA.CREATOR.createFromParcel(parcel) : null;
                w.a0.C(string3, string4, string6);
                gh.i iVar2 = new gh.i();
                iVar2.f20449a = i16;
                iVar2.f20450b = string3;
                iVar2.f20451c = string4;
                iVar2.f20452d = string5;
                iVar2.f20453e = string6;
                iVar2.f20454f = badgeProgressCreateFromParcel2;
                iVar2.f20455g = badgeCTACreateFromParcel;
                return iVar2;
            case 8:
                parcel.getClass();
                Badge badgeCreateFromParcel = parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel);
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                int iC = 0;
                while (iC != i17) {
                    iC = b3.i.c(BadgeCollection.CREATOR, parcel, arrayList4, iC, 1);
                }
                gh.l lVar = new gh.l();
                lVar.f20458a = badgeCreateFromParcel;
                lVar.f20459b = arrayList4;
                return lVar;
            case 9:
                parcel.getClass();
                return new h.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new h.g((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                int iX5 = jf.e.X(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                int iR6 = 0;
                boolean zM2 = false;
                String strW9 = null;
                String strW10 = null;
                String strW11 = null;
                String strW12 = null;
                String strW13 = null;
                String strW14 = null;
                String strW15 = null;
                String strW16 = null;
                h10.f fVar2 = null;
                String strW17 = null;
                String strW18 = null;
                while (parcel.dataPosition() < iX5) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strW9 = jf.e.w(i18, parcel);
                            break;
                        case 3:
                            strW10 = jf.e.w(i18, parcel);
                            break;
                        case 4:
                            strW11 = jf.e.w(i18, parcel);
                            break;
                        case 5:
                            strW12 = jf.e.w(i18, parcel);
                            break;
                        case 6:
                            strW13 = jf.e.w(i18, parcel);
                            break;
                        case 7:
                            strW14 = jf.e.w(i18, parcel);
                            break;
                        case '\b':
                            strW15 = jf.e.w(i18, parcel);
                            break;
                        case '\t':
                            strW16 = jf.e.w(i18, parcel);
                            break;
                        case '\n':
                            iR6 = jf.e.R(i18, parcel);
                            break;
                        case 11:
                            arrayList5 = jf.e.A(parcel, i18, h10.h.CREATOR);
                            break;
                        case '\f':
                            fVar2 = (h10.f) jf.e.v(parcel, i18, h10.f.CREATOR);
                            break;
                        case '\r':
                            arrayList6 = jf.e.A(parcel, i18, LatLng.CREATOR);
                            break;
                        case 14:
                            strW17 = jf.e.w(i18, parcel);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            strW18 = jf.e.w(i18, parcel);
                            break;
                        case 16:
                            arrayList7 = jf.e.A(parcel, i18, h10.b.CREATOR);
                            break;
                        case 17:
                            zM2 = jf.e.M(i18, parcel);
                            break;
                        case 18:
                            arrayList8 = jf.e.A(parcel, i18, h10.g.CREATOR);
                            break;
                        case 19:
                            arrayList9 = jf.e.A(parcel, i18, h10.e.CREATOR);
                            break;
                        case 20:
                            arrayList10 = jf.e.A(parcel, i18, h10.g.CREATOR);
                            break;
                        default:
                            jf.e.W(i18, parcel);
                            break;
                    }
                }
                jf.e.B(iX5, parcel);
                return new CommonWalletObject(strW9, strW10, strW11, strW12, strW13, strW14, strW15, strW16, iR6, arrayList5, fVar2, arrayList6, strW17, strW18, arrayList7, zM2, arrayList8, arrayList9, arrayList10);
            case 12:
                int iX6 = jf.e.X(parcel);
                String strW19 = null;
                String strW20 = null;
                while (parcel.dataPosition() < iX6) {
                    int i19 = parcel.readInt();
                    char c7 = (char) i19;
                    if (c7 == 2) {
                        strW19 = jf.e.w(i19, parcel);
                    } else if (c7 != 3) {
                        jf.e.W(i19, parcel);
                    } else {
                        strW20 = jf.e.w(i19, parcel);
                    }
                }
                jf.e.B(iX6, parcel);
                h10.a aVar2 = new h10.a();
                aVar2.f21001a = strW19;
                aVar2.f21002b = strW20;
                return aVar2;
            case 13:
                int iX7 = jf.e.X(parcel);
                ArrayList arrayList11 = new ArrayList();
                String strW21 = null;
                String strW22 = null;
                while (parcel.dataPosition() < iX7) {
                    int i21 = parcel.readInt();
                    char c8 = (char) i21;
                    if (c8 == 2) {
                        strW21 = jf.e.w(i21, parcel);
                    } else if (c8 == 3) {
                        strW22 = jf.e.w(i21, parcel);
                    } else if (c8 != 4) {
                        jf.e.W(i21, parcel);
                    } else {
                        arrayList11 = jf.e.A(parcel, i21, h10.a.CREATOR);
                    }
                }
                jf.e.B(iX7, parcel);
                return new h10.b(strW21, strW22, arrayList11);
            case 14:
                int iX8 = jf.e.X(parcel);
                int iR7 = -1;
                long jT = 0;
                String strW23 = null;
                int iR8 = 0;
                double d3 = 0.0d;
                String strW24 = null;
                while (parcel.dataPosition() < iX8) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            iR8 = jf.e.R(i22, parcel);
                            break;
                        case 3:
                            strW23 = jf.e.w(i22, parcel);
                            break;
                        case 4:
                            jf.e.Y(parcel, i22, 8);
                            d3 = parcel.readDouble();
                            break;
                        case 5:
                            strW24 = jf.e.w(i22, parcel);
                            break;
                        case 6:
                            jT = jf.e.T(i22, parcel);
                            break;
                        case 7:
                            iR7 = jf.e.R(i22, parcel);
                            break;
                        default:
                            jf.e.W(i22, parcel);
                            break;
                    }
                }
                jf.e.B(iX8, parcel);
                h10.d dVar = new h10.d();
                dVar.f21009a = iR8;
                dVar.f21010b = strW23;
                dVar.f21011c = d3;
                dVar.f21012d = strW24;
                dVar.f21013e = jT;
                dVar.f21014f = iR7;
                return dVar;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iX9 = jf.e.X(parcel);
                String strW25 = null;
                h10.d dVar2 = null;
                h10.f fVar3 = null;
                while (parcel.dataPosition() < iX9) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 2) {
                        strW25 = jf.e.w(i23, parcel);
                    } else if (c11 == 3) {
                        dVar2 = (h10.d) jf.e.v(parcel, i23, h10.d.CREATOR);
                    } else if (c11 != 5) {
                        jf.e.W(i23, parcel);
                    } else {
                        fVar3 = (h10.f) jf.e.v(parcel, i23, h10.f.CREATOR);
                    }
                }
                jf.e.B(iX9, parcel);
                h10.c cVar2 = new h10.c();
                cVar2.f21006a = strW25;
                cVar2.f21007b = dVar2;
                cVar2.f21008c = fVar3;
                return cVar2;
            case 16:
                int iX10 = jf.e.X(parcel);
                String strW26 = null;
                String strW27 = null;
                while (parcel.dataPosition() < iX10) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 2) {
                        strW26 = jf.e.w(i24, parcel);
                    } else if (c12 != 3) {
                        jf.e.W(i24, parcel);
                    } else {
                        strW27 = jf.e.w(i24, parcel);
                    }
                }
                jf.e.B(iX10, parcel);
                h10.e eVar = new h10.e();
                eVar.f21015a = strW26;
                eVar.f21016b = strW27;
                return eVar;
            case 17:
                int iX11 = jf.e.X(parcel);
                long jT2 = 0;
                long jT3 = 0;
                while (parcel.dataPosition() < iX11) {
                    int i25 = parcel.readInt();
                    char c13 = (char) i25;
                    if (c13 == 2) {
                        jT2 = jf.e.T(i25, parcel);
                    } else if (c13 != 3) {
                        jf.e.W(i25, parcel);
                    } else {
                        jT3 = jf.e.T(i25, parcel);
                    }
                }
                jf.e.B(iX11, parcel);
                h10.f fVar4 = new h10.f();
                fVar4.f21017a = jT2;
                fVar4.f21018b = jT3;
                return fVar4;
            case 18:
                int iX12 = jf.e.X(parcel);
                String strW28 = null;
                String strW29 = null;
                while (parcel.dataPosition() < iX12) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 2) {
                        strW28 = jf.e.w(i26, parcel);
                    } else if (c14 != 3) {
                        jf.e.W(i26, parcel);
                    } else {
                        strW29 = jf.e.w(i26, parcel);
                    }
                }
                jf.e.B(iX12, parcel);
                h10.g gVar = new h10.g();
                gVar.f21019a = strW28;
                gVar.f21020b = strW29;
                return gVar;
            case 19:
                int iX13 = jf.e.X(parcel);
                String strW30 = null;
                String strW31 = null;
                h10.f fVar5 = null;
                h10.g gVar2 = null;
                h10.g gVar3 = null;
                while (parcel.dataPosition() < iX13) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 2) {
                        strW30 = jf.e.w(i27, parcel);
                    } else if (c15 == 3) {
                        strW31 = jf.e.w(i27, parcel);
                    } else if (c15 == 4) {
                        fVar5 = (h10.f) jf.e.v(parcel, i27, h10.f.CREATOR);
                    } else if (c15 == 5) {
                        gVar2 = (h10.g) jf.e.v(parcel, i27, h10.g.CREATOR);
                    } else if (c15 != 6) {
                        jf.e.W(i27, parcel);
                    } else {
                        gVar3 = (h10.g) jf.e.v(parcel, i27, h10.g.CREATOR);
                    }
                }
                jf.e.B(iX13, parcel);
                h10.h hVar = new h10.h();
                hVar.f21021a = strW30;
                hVar.f21022b = strW31;
                hVar.f21023c = fVar5;
                hVar.f21024d = gVar2;
                hVar.f21025e = gVar3;
                return hVar;
            case 20:
                h20.m mVar = new h20.m();
                mVar.f21341a = parcel.readInt();
                mVar.f21342b = (e20.z) parcel.readParcelable(h20.m.class.getClassLoader());
                return mVar;
            case 21:
                he.h hVar2 = new he.h(parcel);
                hVar2.f21915a = parcel.readString();
                hVar2.f21917c = parcel.readFloat();
                hVar2.f21918d = parcel.readInt() == 1;
                hVar2.f21919e = parcel.readString();
                hVar2.f21920f = parcel.readInt();
                hVar2.f21921g = parcel.readInt();
                return hVar2;
            case 22:
                parcel.getClass();
                int i28 = parcel.readInt();
                hk.a aVarValueOf = hk.a.valueOf(parcel.readString());
                int i29 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i29);
                int iC2 = 0;
                while (iC2 != i29) {
                    iC2 = b3.i.c(hk.d.CREATOR, parcel, arrayList12, iC2, 1);
                }
                return new hk.c(i28, aVarValueOf, arrayList12, parcel.readInt() == 0 ? null : Order.CREATOR.createFromParcel(parcel));
            case 23:
                parcel.getClass();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i31 = parcel.readInt();
                    arrayList = new ArrayList(i31);
                    for (int i32 = 0; i32 != i31; i32++) {
                        arrayList.add(Integer.valueOf(parcel.readInt()));
                    }
                }
                int i33 = parcel.readInt();
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i34 = parcel.readInt();
                    arrayList2 = new ArrayList(i34);
                    for (int i35 = 0; i35 != i34; i35++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i36 = parcel.readInt();
                    arrayList3 = new ArrayList(i36);
                    for (int i37 = 0; i37 != i36; i37++) {
                        arrayList3.add(Integer.valueOf(parcel.readInt()));
                    }
                }
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                return new hk.d(numValueOf2, arrayList, i33, numValueOf3, arrayList2, arrayList3, z12, parcel.readInt() != 0 ? z11 : false, parcel.readInt() == 0 ? null : hk.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? hk.b.valueOf(parcel.readString()) : null, parcel.readInt() != 0 ? z11 : false, parcel.readString(), parcel.createStringArrayList());
            case 24:
                int iX14 = jf.e.X(parcel);
                boolean zM3 = false;
                int iR9 = 0;
                boolean zM4 = false;
                jz.d dVar3 = null;
                jz.a aVar3 = null;
                String strW32 = null;
                jz.c cVar3 = null;
                jz.b bVar = null;
                while (parcel.dataPosition() < iX14) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case 1:
                            dVar3 = (jz.d) jf.e.v(parcel, i38, jz.d.CREATOR);
                            break;
                        case 2:
                            aVar3 = (jz.a) jf.e.v(parcel, i38, jz.a.CREATOR);
                            break;
                        case 3:
                            strW32 = jf.e.w(i38, parcel);
                            break;
                        case 4:
                            zM3 = jf.e.M(i38, parcel);
                            break;
                        case 5:
                            iR9 = jf.e.R(i38, parcel);
                            break;
                        case 6:
                            cVar3 = (jz.c) jf.e.v(parcel, i38, jz.c.CREATOR);
                            break;
                        case 7:
                            bVar = (jz.b) jf.e.v(parcel, i38, jz.b.CREATOR);
                            break;
                        case '\b':
                            zM4 = jf.e.M(i38, parcel);
                            break;
                        default:
                            jf.e.W(i38, parcel);
                            break;
                    }
                }
                jf.e.B(iX14, parcel);
                return new jz.e(dVar3, aVar3, strW32, zM3, iR9, cVar3, bVar, zM4);
            case 25:
                int iX15 = jf.e.X(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iX15) {
                    int i39 = parcel.readInt();
                    if (((char) i39) != 1) {
                        jf.e.W(i39, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) jf.e.v(parcel, i39, PendingIntent.CREATOR);
                    }
                }
                jf.e.B(iX15, parcel);
                return new jz.f(pendingIntent2);
            case 26:
                int iX16 = jf.e.X(parcel);
                boolean zM5 = false;
                int iR10 = 0;
                String strW33 = null;
                String strW34 = null;
                String strW35 = null;
                String strW36 = null;
                while (parcel.dataPosition() < iX16) {
                    int i41 = parcel.readInt();
                    switch ((char) i41) {
                        case 1:
                            strW33 = jf.e.w(i41, parcel);
                            break;
                        case 2:
                            strW34 = jf.e.w(i41, parcel);
                            break;
                        case 3:
                            strW35 = jf.e.w(i41, parcel);
                            break;
                        case 4:
                            strW36 = jf.e.w(i41, parcel);
                            break;
                        case 5:
                            zM5 = jf.e.M(i41, parcel);
                            break;
                        case 6:
                            iR10 = jf.e.R(i41, parcel);
                            break;
                        default:
                            jf.e.W(i41, parcel);
                            break;
                    }
                }
                jf.e.B(iX16, parcel);
                return new jz.g(strW33, strW34, strW35, strW36, zM5, iR10);
            case 27:
                int iX17 = jf.e.X(parcel);
                boolean zM6 = false;
                boolean zM7 = false;
                boolean zM8 = false;
                String strW37 = null;
                String strW38 = null;
                String strW39 = null;
                ArrayList arrayListY = null;
                while (parcel.dataPosition() < iX17) {
                    int i42 = parcel.readInt();
                    switch ((char) i42) {
                        case 1:
                            zM6 = jf.e.M(i42, parcel);
                            break;
                        case 2:
                            strW37 = jf.e.w(i42, parcel);
                            break;
                        case 3:
                            strW38 = jf.e.w(i42, parcel);
                            break;
                        case 4:
                            zM7 = jf.e.M(i42, parcel);
                            break;
                        case 5:
                            strW39 = jf.e.w(i42, parcel);
                            break;
                        case 6:
                            arrayListY = jf.e.y(i42, parcel);
                            break;
                        case 7:
                            zM8 = jf.e.M(i42, parcel);
                            break;
                        default:
                            jf.e.W(i42, parcel);
                            break;
                    }
                }
                jf.e.B(iX17, parcel);
                return new jz.a(zM6, strW37, strW38, zM7, strW39, arrayListY, zM8);
            case 28:
                int iX18 = jf.e.X(parcel);
                String strW40 = null;
                boolean zM9 = false;
                while (parcel.dataPosition() < iX18) {
                    int i43 = parcel.readInt();
                    char c16 = (char) i43;
                    if (c16 == 1) {
                        zM9 = jf.e.M(i43, parcel);
                    } else if (c16 != 2) {
                        jf.e.W(i43, parcel);
                    } else {
                        strW40 = jf.e.w(i43, parcel);
                    }
                }
                jf.e.B(iX18, parcel);
                return new jz.b(zM9, strW40);
            default:
                int iX19 = jf.e.X(parcel);
                byte[] bArrR = null;
                boolean zM10 = false;
                String strW41 = null;
                while (parcel.dataPosition() < iX19) {
                    int i44 = parcel.readInt();
                    char c17 = (char) i44;
                    if (c17 == 1) {
                        zM10 = jf.e.M(i44, parcel);
                    } else if (c17 == 2) {
                        bArrR = jf.e.r(i44, parcel);
                    } else if (c17 != 3) {
                        jf.e.W(i44, parcel);
                    } else {
                        strW41 = jf.e.w(i44, parcel);
                    }
                }
                jf.e.B(iX19, parcel);
                return new jz.c(strW41, zM10, bArrR);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f15476a) {
            case 0:
                return new i[i11];
            case 1:
                return new j[i11];
            case 2:
                return new ButtonOptions[i11];
            case 3:
                return new f10.a[i11];
            case 4:
                return new f30.a[i11];
            case 5:
                return new gh.c[i11];
            case 6:
                return new gh.f[i11];
            case 7:
                return new gh.i[i11];
            case 8:
                return new gh.l[i11];
            case 9:
                return new h.a[i11];
            case 10:
                return new h.g[i11];
            case 11:
                return new CommonWalletObject[i11];
            case 12:
                return new h10.a[i11];
            case 13:
                return new h10.b[i11];
            case 14:
                return new h10.d[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new h10.c[i11];
            case 16:
                return new h10.e[i11];
            case 17:
                return new h10.f[i11];
            case 18:
                return new h10.g[i11];
            case 19:
                return new h10.h[i11];
            case 20:
                return new h20.m[i11];
            case 21:
                return new he.h[i11];
            case 22:
                return new hk.c[i11];
            case 23:
                return new hk.d[i11];
            case 24:
                return new jz.e[i11];
            case 25:
                return new jz.f[i11];
            case 26:
                return new jz.g[i11];
            case 27:
                return new jz.a[i11];
            case 28:
                return new jz.b[i11];
            default:
                return new jz.c[i11];
        }
    }
}
