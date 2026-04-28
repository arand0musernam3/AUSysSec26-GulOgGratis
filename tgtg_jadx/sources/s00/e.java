package s00;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.Order;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ky.o;
import org.bouncycastle.iana.AEADAlgorithm;
import y00.b4;
import y00.o4;
import y00.t;
import y00.u;
import y00.y3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38512a;

    public /* synthetic */ e(int i11) {
        this.f38512a = i11;
    }

    public static void a(u uVar, Parcel parcel, int i11) {
        String str = uVar.f45195a;
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(str, parcel, 2);
        lx.u.a0(parcel, 3, uVar.f45196b, i11);
        lx.u.b0(uVar.f45197c, parcel, 4);
        long j9 = uVar.f45198d;
        lx.u.g0(parcel, 5, 8);
        parcel.writeLong(j9);
        long j11 = uVar.f45199e;
        lx.u.g0(parcel, 6, 8);
        parcel.writeLong(j11);
        lx.u.i0(iH0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        View view;
        ArrayList arrayList;
        boolean z11;
        switch (this.f38512a) {
            case 0:
                int iX = jf.e.X(parcel);
                List listA = LocationResult.f12118b;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        jf.e.W(i11, parcel);
                    } else {
                        listA = jf.e.A(parcel, i11, Location.CREATOR);
                    }
                }
                jf.e.B(iX, parcel);
                return new LocationResult(listA);
            case 1:
                int iX2 = jf.e.X(parcel);
                boolean zM = false;
                ArrayList arrayListA = null;
                boolean zM2 = false;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    char c3 = (char) i12;
                    if (c3 == 1) {
                        arrayListA = jf.e.A(parcel, i12, LocationRequest.CREATOR);
                    } else if (c3 == 2) {
                        zM = jf.e.M(i12, parcel);
                    } else if (c3 != 3) {
                        jf.e.W(i12, parcel);
                    } else {
                        zM2 = jf.e.M(i12, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new b(arrayListA, zM, zM2);
            case 2:
                int iX3 = jf.e.X(parcel);
                Status status = null;
                d dVar = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        status = (Status) jf.e.v(parcel, i13, Status.CREATOR);
                    } else if (c7 != 2) {
                        jf.e.W(i13, parcel);
                    } else {
                        dVar = (d) jf.e.v(parcel, i13, d.CREATOR);
                    }
                }
                jf.e.B(iX3, parcel);
                return new c(status, dVar);
            case 3:
                int iX4 = jf.e.X(parcel);
                boolean zM3 = false;
                boolean zM4 = false;
                boolean zM5 = false;
                boolean zM6 = false;
                boolean zM7 = false;
                boolean zM8 = false;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            zM3 = jf.e.M(i14, parcel);
                            break;
                        case 2:
                            zM4 = jf.e.M(i14, parcel);
                            break;
                        case 3:
                            zM5 = jf.e.M(i14, parcel);
                            break;
                        case 4:
                            zM6 = jf.e.M(i14, parcel);
                            break;
                        case 5:
                            zM7 = jf.e.M(i14, parcel);
                            break;
                        case 6:
                            zM8 = jf.e.M(i14, parcel);
                            break;
                        default:
                            jf.e.W(i14, parcel);
                            break;
                    }
                }
                jf.e.B(iX4, parcel);
                return new d(zM3, zM4, zM5, zM6, zM7, zM8);
            case 4:
                int iX5 = jf.e.X(parcel);
                long jT = -1;
                long jT2 = -1;
                int iR = 1;
                int iR2 = 1;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        iR = jf.e.R(i15, parcel);
                    } else if (c8 == 2) {
                        iR2 = jf.e.R(i15, parcel);
                    } else if (c8 == 3) {
                        jT = jf.e.T(i15, parcel);
                    } else if (c8 != 4) {
                        jf.e.W(i15, parcel);
                    } else {
                        jT2 = jf.e.T(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                return new g(iR, iR2, jT, jT2);
            case 5:
                s10.a aVar = new s10.a(parcel);
                aVar.f38736a = ((Integer) parcel.readValue(s10.a.class.getClassLoader())).intValue();
                return aVar;
            case 6:
                int iX6 = jf.e.X(parcel);
                int iR3 = 0;
                int iR4 = 0;
                byte bN = -1;
                byte bN2 = -1;
                CameraPosition cameraPosition = null;
                byte bN3 = -1;
                byte bN4 = -1;
                byte bN5 = -1;
                byte bN6 = -1;
                byte bN7 = -1;
                byte bN8 = -1;
                byte bN9 = -1;
                byte bN10 = -1;
                byte bN11 = -1;
                byte bN12 = -1;
                Float fP = null;
                Float fP2 = null;
                LatLngBounds latLngBounds = null;
                Integer numS = null;
                String strW = null;
                while (parcel.dataPosition() < iX6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            bN = jf.e.N(i16, parcel);
                            break;
                        case 3:
                            bN2 = jf.e.N(i16, parcel);
                            break;
                        case 4:
                            iR3 = jf.e.R(i16, parcel);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) jf.e.v(parcel, i16, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bN3 = jf.e.N(i16, parcel);
                            break;
                        case 7:
                            bN4 = jf.e.N(i16, parcel);
                            break;
                        case '\b':
                            bN5 = jf.e.N(i16, parcel);
                            break;
                        case '\t':
                            bN6 = jf.e.N(i16, parcel);
                            break;
                        case '\n':
                            bN7 = jf.e.N(i16, parcel);
                            break;
                        case 11:
                            bN8 = jf.e.N(i16, parcel);
                            break;
                        case '\f':
                            bN9 = jf.e.N(i16, parcel);
                            break;
                        case '\r':
                        case 22:
                        default:
                            jf.e.W(i16, parcel);
                            break;
                        case 14:
                            bN10 = jf.e.N(i16, parcel);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            bN11 = jf.e.N(i16, parcel);
                            break;
                        case 16:
                            fP = jf.e.P(i16, parcel);
                            break;
                        case 17:
                            fP2 = jf.e.P(i16, parcel);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) jf.e.v(parcel, i16, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            bN12 = jf.e.N(i16, parcel);
                            break;
                        case 20:
                            numS = jf.e.S(i16, parcel);
                            break;
                        case 21:
                            strW = jf.e.w(i16, parcel);
                            break;
                        case 23:
                            iR4 = jf.e.R(i16, parcel);
                            break;
                    }
                }
                jf.e.B(iX6, parcel);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.f12124c = -1;
                googleMapOptions.f12134n = null;
                googleMapOptions.f12135o = null;
                googleMapOptions.f12136p = null;
                googleMapOptions.f12138r = null;
                googleMapOptions.f12139s = null;
                googleMapOptions.f12122a = z20.b.G(bN);
                googleMapOptions.f12123b = z20.b.G(bN2);
                googleMapOptions.f12124c = iR3;
                googleMapOptions.f12125d = cameraPosition;
                googleMapOptions.f12126e = z20.b.G(bN3);
                googleMapOptions.f12127f = z20.b.G(bN4);
                googleMapOptions.f12128g = z20.b.G(bN5);
                googleMapOptions.f12129h = z20.b.G(bN6);
                googleMapOptions.f12130i = z20.b.G(bN7);
                googleMapOptions.f12131j = z20.b.G(bN8);
                googleMapOptions.f12132k = z20.b.G(bN9);
                googleMapOptions.l = z20.b.G(bN10);
                googleMapOptions.f12133m = z20.b.G(bN11);
                googleMapOptions.f12134n = fP;
                googleMapOptions.f12135o = fP2;
                googleMapOptions.f12136p = latLngBounds;
                googleMapOptions.f12137q = z20.b.G(bN12);
                googleMapOptions.f12138r = numS;
                googleMapOptions.f12139s = strW;
                googleMapOptions.f12140t = iR4;
                return googleMapOptions;
            case 7:
                int iX7 = jf.e.X(parcel);
                float fO = 0.0f;
                float fO2 = 0.0f;
                LatLng latLng = null;
                float fO3 = 0.0f;
                while (parcel.dataPosition() < iX7) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 2) {
                        latLng = (LatLng) jf.e.v(parcel, i17, LatLng.CREATOR);
                    } else if (c11 == 3) {
                        fO = jf.e.O(i17, parcel);
                    } else if (c11 == 4) {
                        fO3 = jf.e.O(i17, parcel);
                    } else if (c11 != 5) {
                        jf.e.W(i17, parcel);
                    } else {
                        fO2 = jf.e.O(i17, parcel);
                    }
                }
                jf.e.B(iX7, parcel);
                return new CameraPosition(latLng, fO, fO3, fO2);
            case 8:
                int iX8 = jf.e.X(parcel);
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                LatLng latLng5 = null;
                LatLngBounds latLngBounds2 = null;
                while (parcel.dataPosition() < iX8) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 2) {
                        latLng2 = (LatLng) jf.e.v(parcel, i18, LatLng.CREATOR);
                    } else if (c12 == 3) {
                        latLng3 = (LatLng) jf.e.v(parcel, i18, LatLng.CREATOR);
                    } else if (c12 == 4) {
                        latLng4 = (LatLng) jf.e.v(parcel, i18, LatLng.CREATOR);
                    } else if (c12 == 5) {
                        latLng5 = (LatLng) jf.e.v(parcel, i18, LatLng.CREATOR);
                    } else if (c12 != 6) {
                        jf.e.W(i18, parcel);
                    } else {
                        latLngBounds2 = (LatLngBounds) jf.e.v(parcel, i18, LatLngBounds.CREATOR);
                    }
                }
                jf.e.B(iX8, parcel);
                return new v00.i(latLng2, latLng3, latLng4, latLng5, latLngBounds2);
            case 9:
                int iX9 = jf.e.X(parcel);
                LatLng latLng6 = null;
                boolean zM9 = false;
                float fO4 = 0.0f;
                float fO5 = 0.0f;
                double d3 = 0.0d;
                ArrayList arrayListA2 = null;
                int iR5 = 0;
                int iR6 = 0;
                boolean zM10 = false;
                while (parcel.dataPosition() < iX9) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            latLng6 = (LatLng) jf.e.v(parcel, i19, LatLng.CREATOR);
                            break;
                        case 3:
                            jf.e.Y(parcel, i19, 8);
                            d3 = parcel.readDouble();
                            break;
                        case 4:
                            fO4 = jf.e.O(i19, parcel);
                            break;
                        case 5:
                            iR5 = jf.e.R(i19, parcel);
                            break;
                        case 6:
                            iR6 = jf.e.R(i19, parcel);
                            break;
                        case 7:
                            fO5 = jf.e.O(i19, parcel);
                            break;
                        case '\b':
                            zM10 = jf.e.M(i19, parcel);
                            break;
                        case '\t':
                            zM9 = jf.e.M(i19, parcel);
                            break;
                        case '\n':
                            arrayListA2 = jf.e.A(parcel, i19, v00.h.CREATOR);
                            break;
                        default:
                            jf.e.W(i19, parcel);
                            break;
                    }
                }
                jf.e.B(iX9, parcel);
                v00.c cVar = new v00.c();
                cVar.f41636a = latLng6;
                cVar.f41637b = d3;
                cVar.f41638c = fO4;
                cVar.f41639d = iR5;
                cVar.f41640e = iR6;
                cVar.f41641f = fO5;
                cVar.f41642g = zM10;
                cVar.f41643h = zM9;
                cVar.f41644i = arrayListA2;
                return cVar;
            case 10:
                int iX10 = jf.e.X(parcel);
                LatLng latLng7 = null;
                LatLng latLng8 = null;
                while (parcel.dataPosition() < iX10) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 2) {
                        latLng7 = (LatLng) jf.e.v(parcel, i21, LatLng.CREATOR);
                    } else if (c13 != 3) {
                        jf.e.W(i21, parcel);
                    } else {
                        latLng8 = (LatLng) jf.e.v(parcel, i21, LatLng.CREATOR);
                    }
                }
                jf.e.B(iX10, parcel);
                return new LatLngBounds(latLng7, latLng8);
            case 11:
                int iX11 = jf.e.X(parcel);
                double d11 = 0.0d;
                double d12 = 0.0d;
                while (parcel.dataPosition() < iX11) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 2) {
                        jf.e.Y(parcel, i22, 8);
                        d11 = parcel.readDouble();
                    } else if (c14 != 3) {
                        jf.e.W(i22, parcel);
                    } else {
                        jf.e.Y(parcel, i22, 8);
                        d12 = parcel.readDouble();
                    }
                }
                jf.e.B(iX11, parcel);
                return new LatLng(d11, d12);
            case 12:
                int iX12 = jf.e.X(parcel);
                String strW2 = null;
                while (parcel.dataPosition() < iX12) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 2) {
                        jf.e.W(i23, parcel);
                    } else {
                        strW2 = jf.e.w(i23, parcel);
                    }
                }
                jf.e.B(iX12, parcel);
                return new v00.e(strW2);
            case 13:
                int iX13 = jf.e.X(parcel);
                boolean zM11 = false;
                boolean zM12 = false;
                boolean zM13 = false;
                int iR7 = 0;
                int iR8 = 0;
                float fO6 = 1.0f;
                float fO7 = 0.5f;
                LatLng latLng9 = null;
                String strW3 = null;
                String strW4 = null;
                IBinder iBinderQ = null;
                float fO8 = 0.0f;
                float fO9 = 0.0f;
                IBinder iBinderQ2 = null;
                float fO10 = 0.0f;
                float fO11 = 0.0f;
                float fO12 = 0.0f;
                String strW5 = null;
                while (parcel.dataPosition() < iX13) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            latLng9 = (LatLng) jf.e.v(parcel, i24, LatLng.CREATOR);
                            break;
                        case 3:
                            strW3 = jf.e.w(i24, parcel);
                            break;
                        case 4:
                            strW4 = jf.e.w(i24, parcel);
                            break;
                        case 5:
                            iBinderQ = jf.e.Q(i24, parcel);
                            break;
                        case 6:
                            fO8 = jf.e.O(i24, parcel);
                            break;
                        case 7:
                            fO9 = jf.e.O(i24, parcel);
                            break;
                        case '\b':
                            zM11 = jf.e.M(i24, parcel);
                            break;
                        case '\t':
                            zM12 = jf.e.M(i24, parcel);
                            break;
                        case '\n':
                            zM13 = jf.e.M(i24, parcel);
                            break;
                        case 11:
                            fO10 = jf.e.O(i24, parcel);
                            break;
                        case '\f':
                            fO7 = jf.e.O(i24, parcel);
                            break;
                        case '\r':
                            fO11 = jf.e.O(i24, parcel);
                            break;
                        case 14:
                            fO6 = jf.e.O(i24, parcel);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            fO12 = jf.e.O(i24, parcel);
                            break;
                        case 16:
                        default:
                            jf.e.W(i24, parcel);
                            break;
                        case 17:
                            iR7 = jf.e.R(i24, parcel);
                            break;
                        case 18:
                            iBinderQ2 = jf.e.Q(i24, parcel);
                            break;
                        case 19:
                            iR8 = jf.e.R(i24, parcel);
                            break;
                        case 20:
                            strW5 = jf.e.w(i24, parcel);
                            break;
                    }
                }
                jf.e.B(iX13, parcel);
                v00.g gVar = new v00.g();
                gVar.f41655e = 0.5f;
                gVar.f41656f = 1.0f;
                gVar.f41658h = true;
                gVar.f41659i = false;
                gVar.f41660j = 0.0f;
                gVar.f41661k = 0.5f;
                gVar.l = 0.0f;
                gVar.f41662m = 1.0f;
                gVar.f41664o = 0;
                gVar.f41651a = latLng9;
                gVar.f41652b = strW3;
                gVar.f41653c = strW4;
                if (iBinderQ == null) {
                    view = null;
                    gVar.f41654d = null;
                } else {
                    view = null;
                    gVar.f41654d = new o(yz.b.U(iBinderQ));
                }
                gVar.f41655e = fO8;
                gVar.f41656f = fO9;
                gVar.f41657g = zM11;
                gVar.f41658h = zM12;
                gVar.f41659i = zM13;
                gVar.f41660j = fO10;
                gVar.f41661k = fO7;
                gVar.l = fO11;
                gVar.f41662m = fO6;
                gVar.f41663n = fO12;
                gVar.f41666q = iR8;
                gVar.f41664o = iR7;
                yz.a aVarU = yz.b.U(iBinderQ2);
                gVar.f41665p = aVarU == null ? view : (View) yz.b.V(aVarU);
                gVar.f41667r = strW5;
                return gVar;
            case 14:
                int iX14 = jf.e.X(parcel);
                Float fP3 = null;
                int iR9 = 0;
                while (parcel.dataPosition() < iX14) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 2) {
                        iR9 = jf.e.R(i25, parcel);
                    } else if (c15 != 3) {
                        jf.e.W(i25, parcel);
                    } else {
                        fP3 = jf.e.P(i25, parcel);
                    }
                }
                jf.e.B(iX14, parcel);
                return new v00.h(iR9, fP3);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                parcel.getClass();
                vj.e eVarValueOf = vj.e.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i26 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i26);
                    for (int i27 = 0; i27 != i26; i27++) {
                        arrayList2.add(vj.j.valueOf(parcel.readString()));
                    }
                    arrayList = arrayList2;
                }
                return new vj.c(eVarValueOf, arrayList);
            case 16:
                parcel.getClass();
                return new wq.a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                wr.h hVarValueOf = wr.h.valueOf(parcel.readString());
                wr.b bVarValueOf = parcel.readInt() == 0 ? null : wr.b.valueOf(parcel.readString());
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                wr.e eVarValueOf2 = parcel.readInt() == 0 ? null : wr.e.valueOf(parcel.readString());
                boolean z13 = parcel.readInt() != 0 ? z11 : false;
                Order orderCreateFromParcel = parcel.readInt() == 0 ? null : Order.CREATOR.createFromParcel(parcel);
                boolean z14 = parcel.readInt() != 0 ? z11 : false;
                String string = parcel.readString();
                OrderId orderIdCreateFromParcel = parcel.readInt() == 0 ? null : OrderId.CREATOR.createFromParcel(parcel);
                return new wr.g(hVarValueOf, bVarValueOf, z12, eVarValueOf2, z13, orderCreateFromParcel, z14, string, orderIdCreateFromParcel != null ? orderIdCreateFromParcel.m217unboximpl() : null);
            case 18:
                return new x10.b((x10.l) parcel.readParcelable(x10.l.class.getClassLoader()), (x10.l) parcel.readParcelable(x10.l.class.getClassLoader()), (x10.c) parcel.readParcelable(x10.c.class.getClassLoader()), (x10.l) parcel.readParcelable(x10.l.class.getClassLoader()), parcel.readInt());
            case 19:
                return new x10.c(parcel.readLong());
            case 20:
                return x10.l.a(parcel.readInt(), parcel.readInt());
            case 21:
                String string2 = parcel.readString();
                string2.getClass();
                int i28 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i28);
                for (int i29 = 0; i29 < i28; i29++) {
                    String string3 = parcel.readString();
                    string3.getClass();
                    String string4 = parcel.readString();
                    string4.getClass();
                    linkedHashMap.put(string3, string4);
                }
                return new xc.b(string2, linkedHashMap);
            case 22:
                parcel.getClass();
                return new xs.c(parcel.readString(), parcel.readString());
            case 23:
                int iX15 = jf.e.X(parcel);
                long jT3 = 0;
                long jT4 = 0;
                int iR10 = 0;
                while (parcel.dataPosition() < iX15) {
                    int i31 = parcel.readInt();
                    char c16 = (char) i31;
                    if (c16 == 1) {
                        jT3 = jf.e.T(i31, parcel);
                    } else if (c16 == 2) {
                        iR10 = jf.e.R(i31, parcel);
                    } else if (c16 != 3) {
                        jf.e.W(i31, parcel);
                    } else {
                        jT4 = jf.e.T(i31, parcel);
                    }
                }
                jf.e.B(iX15, parcel);
                return new y00.d(iR10, jT3, jT4);
            case 24:
                int iX16 = jf.e.X(parcel);
                String strW6 = null;
                String strW7 = null;
                o4 o4Var = null;
                String strW8 = null;
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                long jT5 = 0;
                long jT6 = 0;
                long jT7 = 0;
                boolean zM14 = false;
                while (parcel.dataPosition() < iX16) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            strW6 = jf.e.w(i32, parcel);
                            break;
                        case 3:
                            strW7 = jf.e.w(i32, parcel);
                            break;
                        case 4:
                            o4Var = (o4) jf.e.v(parcel, i32, o4.CREATOR);
                            break;
                        case 5:
                            jT5 = jf.e.T(i32, parcel);
                            break;
                        case 6:
                            zM14 = jf.e.M(i32, parcel);
                            break;
                        case 7:
                            strW8 = jf.e.w(i32, parcel);
                            break;
                        case '\b':
                            uVar = (u) jf.e.v(parcel, i32, u.CREATOR);
                            break;
                        case '\t':
                            jT6 = jf.e.T(i32, parcel);
                            break;
                        case '\n':
                            uVar2 = (u) jf.e.v(parcel, i32, u.CREATOR);
                            break;
                        case 11:
                            jT7 = jf.e.T(i32, parcel);
                            break;
                        case '\f':
                            uVar3 = (u) jf.e.v(parcel, i32, u.CREATOR);
                            break;
                        default:
                            jf.e.W(i32, parcel);
                            break;
                    }
                }
                jf.e.B(iX16, parcel);
                return new y00.e(strW6, strW7, o4Var, jT5, zM14, strW8, uVar, jT6, uVar2, jT7, uVar3);
            case 25:
                int iX17 = jf.e.X(parcel);
                Bundle bundleQ = null;
                while (parcel.dataPosition() < iX17) {
                    int i33 = parcel.readInt();
                    if (((char) i33) != 1) {
                        jf.e.W(i33, parcel);
                    } else {
                        bundleQ = jf.e.q(i33, parcel);
                    }
                }
                jf.e.B(iX17, parcel);
                return new y00.i(bundleQ);
            case 26:
                int iX18 = jf.e.X(parcel);
                Bundle bundleQ2 = null;
                while (parcel.dataPosition() < iX18) {
                    int i34 = parcel.readInt();
                    if (((char) i34) != 2) {
                        jf.e.W(i34, parcel);
                    } else {
                        bundleQ2 = jf.e.q(i34, parcel);
                    }
                }
                jf.e.B(iX18, parcel);
                return new t(bundleQ2);
            case 27:
                int iX19 = jf.e.X(parcel);
                long jT8 = 0;
                long jT9 = 0;
                String strW9 = null;
                t tVar = null;
                String strW10 = null;
                while (parcel.dataPosition() < iX19) {
                    int i35 = parcel.readInt();
                    char c17 = (char) i35;
                    if (c17 == 2) {
                        strW9 = jf.e.w(i35, parcel);
                    } else if (c17 == 3) {
                        tVar = (t) jf.e.v(parcel, i35, t.CREATOR);
                    } else if (c17 == 4) {
                        strW10 = jf.e.w(i35, parcel);
                    } else if (c17 == 5) {
                        jT8 = jf.e.T(i35, parcel);
                    } else if (c17 != 6) {
                        jf.e.W(i35, parcel);
                    } else {
                        jT9 = jf.e.T(i35, parcel);
                    }
                }
                jf.e.B(iX19, parcel);
                return new u(strW9, tVar, strW10, jT8, jT9);
            case 28:
                int iX20 = jf.e.X(parcel);
                int iR11 = 0;
                long jT10 = 0;
                String strW11 = null;
                while (parcel.dataPosition() < iX20) {
                    int i36 = parcel.readInt();
                    char c18 = (char) i36;
                    if (c18 == 1) {
                        strW11 = jf.e.w(i36, parcel);
                    } else if (c18 == 2) {
                        jT10 = jf.e.T(i36, parcel);
                    } else if (c18 != 3) {
                        jf.e.W(i36, parcel);
                    } else {
                        iR11 = jf.e.R(i36, parcel);
                    }
                }
                jf.e.B(iX20, parcel);
                return new y3(iR11, jT10, strW11);
            default:
                int iX21 = jf.e.X(parcel);
                byte[] bArrR = null;
                String strW12 = null;
                Bundle bundleQ3 = null;
                String strW13 = null;
                long jT11 = 0;
                long jT12 = 0;
                int iR12 = 0;
                while (parcel.dataPosition() < iX21) {
                    int i37 = parcel.readInt();
                    switch ((char) i37) {
                        case 1:
                            jT11 = jf.e.T(i37, parcel);
                            break;
                        case 2:
                            bArrR = jf.e.r(i37, parcel);
                            break;
                        case 3:
                            strW12 = jf.e.w(i37, parcel);
                            break;
                        case 4:
                            bundleQ3 = jf.e.q(i37, parcel);
                            break;
                        case 5:
                            iR12 = jf.e.R(i37, parcel);
                            break;
                        case 6:
                            jT12 = jf.e.T(i37, parcel);
                            break;
                        case 7:
                            strW13 = jf.e.w(i37, parcel);
                            break;
                        default:
                            jf.e.W(i37, parcel);
                            break;
                    }
                }
                jf.e.B(iX21, parcel);
                return new b4(jT11, bArrR, strW12, bundleQ3, iR12, jT12, strW13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f38512a) {
            case 0:
                return new LocationResult[i11];
            case 1:
                return new b[i11];
            case 2:
                return new c[i11];
            case 3:
                return new d[i11];
            case 4:
                return new g[i11];
            case 5:
                return new s10.a[i11];
            case 6:
                return new GoogleMapOptions[i11];
            case 7:
                return new CameraPosition[i11];
            case 8:
                return new v00.i[i11];
            case 9:
                return new v00.c[i11];
            case 10:
                return new LatLngBounds[i11];
            case 11:
                return new LatLng[i11];
            case 12:
                return new v00.e[i11];
            case 13:
                return new v00.g[i11];
            case 14:
                return new v00.h[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new vj.c[i11];
            case 16:
                return new wq.a[i11];
            case 17:
                return new wr.g[i11];
            case 18:
                return new x10.b[i11];
            case 19:
                return new x10.c[i11];
            case 20:
                return new x10.l[i11];
            case 21:
                return new xc.b[i11];
            case 22:
                return new xs.c[i11];
            case 23:
                return new y00.d[i11];
            case 24:
                return new y00.e[i11];
            case 25:
                return new y00.i[i11];
            case 26:
                return new t[i11];
            case 27:
                return new u[i11];
            case 28:
                return new y3[i11];
            default:
                return new b4[i11];
        }
    }
}
