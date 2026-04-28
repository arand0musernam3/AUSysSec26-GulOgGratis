package qj;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.widget.RemoteViews;
import androidx.versionedparcelable.ParcelImpl;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37081a;

    public /* synthetic */ f1(int i11) {
        this.f37081a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.f37081a) {
            case 0:
                parcel.getClass();
                return new g1(parcel.readString(), parcel.readString());
            case 1:
                parcel.getClass();
                parcel.readInt();
                return h1.f37099a;
            case 2:
                parcel.getClass();
                parcel.readInt();
                return i1.f37108a;
            case 3:
                parcel.getClass();
                return new j1(parcel.readString());
            case 4:
                parcel.getClass();
                parcel.readInt();
                return k1.f37114a;
            case 5:
                parcel.getClass();
                parcel.readInt();
                return l1.f37117a;
            case 6:
                parcel.getClass();
                return new m1(parcel.readString());
            case 7:
                parcel.getClass();
                return new n1(parcel.readString());
            case 8:
                parcel.getClass();
                return new o1(SearchFilter.CREATOR.createFromParcel(parcel), parcel.readString());
            case 9:
                parcel.getClass();
                return new p1(parcel.readString());
            case 10:
                parcel.getClass();
                parcel.readInt();
                return q1.f37135a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return r1.f37138a;
            case 12:
                parcel.getClass();
                parcel.readInt();
                return s1.f37142a;
            case 13:
                int iX = jf.e.X(parcel);
                byte[] bArrR = null;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        jf.e.W(i11, parcel);
                    } else {
                        bArrR = jf.e.r(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new r00.b(bArrR);
            case 14:
                int iX2 = jf.e.X(parcel);
                byte[] bArrR2 = null;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        jf.e.W(i12, parcel);
                    } else {
                        bArrR2 = jf.e.r(i12, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new r00.c(bArrR2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iX3 = jf.e.X(parcel);
                byte[] bArrR3 = null;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        jf.e.W(i13, parcel);
                    } else {
                        bArrR3 = jf.e.r(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new r00.d(bArrR3);
            case 16:
                int iX4 = jf.e.X(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        jf.e.W(i14, parcel);
                    } else {
                        pendingIntent = (PendingIntent) jf.e.v(parcel, i14, PendingIntent.CREATOR);
                    }
                }
                jf.e.B(iX4, parcel);
                return new r00.e(pendingIntent);
            case 17:
                int iX5 = jf.e.X(parcel);
                String[] strArrX = null;
                int[] iArrT = null;
                RemoteViews remoteViews = null;
                byte[] bArrR4 = null;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    char c3 = (char) i15;
                    if (c3 == 1) {
                        strArrX = jf.e.x(i15, parcel);
                    } else if (c3 == 2) {
                        iArrT = jf.e.t(i15, parcel);
                    } else if (c3 == 3) {
                        remoteViews = (RemoteViews) jf.e.v(parcel, i15, RemoteViews.CREATOR);
                    } else if (c3 != 4) {
                        jf.e.W(i15, parcel);
                    } else {
                        bArrR4 = jf.e.r(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                r00.f fVar = new r00.f();
                fVar.f37516a = strArrX;
                fVar.f37517b = iArrT;
                fVar.f37518c = remoteViews;
                fVar.f37519d = bArrR4;
                return fVar;
            case 18:
                return new ParcelImpl(parcel);
            case 19:
                parcel.getClass();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i16 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i16);
                    int iC = 0;
                    while (iC != i16) {
                        iC = b3.i.c(FavouriteWidgetItem.CREATOR, parcel, arrayList2, iC, 1);
                    }
                    arrayList = arrayList2;
                }
                return new rg.g(string, arrayList);
            case 20:
                parcel.getClass();
                parcel.readInt();
                return rg.h.INSTANCE;
            case 21:
                parcel.getClass();
                parcel.readInt();
                return rg.i.INSTANCE;
            case 22:
                parcel.getClass();
                parcel.readInt();
                return rg.j.INSTANCE;
            case 23:
                parcel.getClass();
                parcel.readInt();
                return rg.k.INSTANCE;
            case 24:
                parcel.getClass();
                parcel.readInt();
                return rg.l.INSTANCE;
            case 25:
                parcel.getClass();
                parcel.readInt();
                return rg.n.INSTANCE;
            case 26:
                parcel.getClass();
                return new rg.q(parcel.readString());
            case 27:
                int iX6 = jf.e.X(parcel);
                m00.i iVar = null;
                int iR = 0;
                boolean zM = false;
                long jT = Long.MAX_VALUE;
                while (parcel.dataPosition() < iX6) {
                    int i17 = parcel.readInt();
                    char c7 = (char) i17;
                    if (c7 == 1) {
                        jT = jf.e.T(i17, parcel);
                    } else if (c7 == 2) {
                        iR = jf.e.R(i17, parcel);
                    } else if (c7 == 3) {
                        zM = jf.e.M(i17, parcel);
                    } else if (c7 != 5) {
                        jf.e.W(i17, parcel);
                    } else {
                        iVar = (m00.i) jf.e.v(parcel, i17, m00.i.CREATOR);
                    }
                }
                jf.e.B(iX6, parcel);
                return new s00.a(jT, iR, zM, iVar);
            case 28:
                int iX7 = jf.e.X(parcel);
                s00.g[] gVarArr = null;
                long jT2 = 0;
                int iR2 = 1;
                int iR3 = 1;
                int iR4 = 1000;
                while (parcel.dataPosition() < iX7) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iR2 = jf.e.R(i18, parcel);
                            break;
                        case 2:
                            iR3 = jf.e.R(i18, parcel);
                            break;
                        case 3:
                            jT2 = jf.e.T(i18, parcel);
                            break;
                        case 4:
                            iR4 = jf.e.R(i18, parcel);
                            break;
                        case 5:
                            gVarArr = (s00.g[]) jf.e.z(parcel, i18, s00.g.CREATOR);
                            break;
                        case 6:
                            jf.e.M(i18, parcel);
                            break;
                        default:
                            jf.e.W(i18, parcel);
                            break;
                    }
                }
                jf.e.B(iX7, parcel);
                return new LocationAvailability(iR4, iR2, iR3, jT2, gVarArr);
            default:
                int iX8 = jf.e.X(parcel);
                WorkSource workSource = new WorkSource();
                m00.i iVar2 = null;
                boolean zM2 = false;
                int iR5 = 0;
                int iR6 = 0;
                boolean zM3 = false;
                long jT3 = -1;
                float fO = 0.0f;
                int iR7 = Integer.MAX_VALUE;
                long jT4 = Long.MAX_VALUE;
                long jT5 = Long.MAX_VALUE;
                long jT6 = 0;
                long jT7 = 600000;
                long jT8 = 3600000;
                int iR8 = 102;
                while (parcel.dataPosition() < iX8) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iR8 = jf.e.R(i19, parcel);
                            break;
                        case 2:
                            jT8 = jf.e.T(i19, parcel);
                            break;
                        case 3:
                            jT7 = jf.e.T(i19, parcel);
                            break;
                        case 4:
                        case 14:
                        default:
                            jf.e.W(i19, parcel);
                            break;
                        case 5:
                            jT4 = jf.e.T(i19, parcel);
                            break;
                        case 6:
                            iR7 = jf.e.R(i19, parcel);
                            break;
                        case 7:
                            fO = jf.e.O(i19, parcel);
                            break;
                        case '\b':
                            jT6 = jf.e.T(i19, parcel);
                            break;
                        case '\t':
                            zM2 = jf.e.M(i19, parcel);
                            break;
                        case '\n':
                            jT5 = jf.e.T(i19, parcel);
                            break;
                        case 11:
                            jT3 = jf.e.T(i19, parcel);
                            break;
                        case '\f':
                            iR5 = jf.e.R(i19, parcel);
                            break;
                        case '\r':
                            iR6 = jf.e.R(i19, parcel);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            zM3 = jf.e.M(i19, parcel);
                            break;
                        case 16:
                            workSource = (WorkSource) jf.e.v(parcel, i19, WorkSource.CREATOR);
                            break;
                        case 17:
                            iVar2 = (m00.i) jf.e.v(parcel, i19, m00.i.CREATOR);
                            break;
                    }
                }
                jf.e.B(iX8, parcel);
                return new LocationRequest(iR8, jT8, jT7, jT6, jT4, jT5, iR7, fO, zM2, jT3, iR5, iR6, zM3, workSource, iVar2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f37081a) {
            case 0:
                return new g1[i11];
            case 1:
                return new h1[i11];
            case 2:
                return new i1[i11];
            case 3:
                return new j1[i11];
            case 4:
                return new k1[i11];
            case 5:
                return new l1[i11];
            case 6:
                return new m1[i11];
            case 7:
                return new n1[i11];
            case 8:
                return new o1[i11];
            case 9:
                return new p1[i11];
            case 10:
                return new q1[i11];
            case 11:
                return new r1[i11];
            case 12:
                return new s1[i11];
            case 13:
                return new r00.b[i11];
            case 14:
                return new r00.c[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new r00.d[i11];
            case 16:
                return new r00.e[i11];
            case 17:
                return new r00.f[i11];
            case 18:
                return new ParcelImpl[i11];
            case 19:
                return new rg.g[i11];
            case 20:
                return new rg.h[i11];
            case 21:
                return new rg.i[i11];
            case 22:
                return new rg.j[i11];
            case 23:
                return new rg.k[i11];
            case 24:
                return new rg.l[i11];
            case 25:
                return new rg.n[i11];
            case 26:
                return new rg.q[i11];
            case 27:
                return new s00.a[i11];
            case 28:
                return new LocationAvailability[i11];
            default:
                return new LocationRequest[i11];
        }
    }
}
