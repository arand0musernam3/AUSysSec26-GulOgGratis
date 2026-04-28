package oa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.local.DeeplinkC2CReferralData;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import java.util.ArrayList;
import java.util.HashMap;
import op.l;
import org.bouncycastle.iana.AEADAlgorithm;
import p.h0;
import pz.o;
import qj.k;
import qj.n;
import qj.p;
import qj.q;
import qj.r;
import qj.s;
import qj.t;
import qj.u;
import qj.v;
import qj.w;
import qj.x;
import qj.y;
import qj.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32260a;

    public /* synthetic */ i(int i11) {
        this.f32260a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap map;
        switch (this.f32260a) {
            case 0:
                return new j(parcel);
            case 1:
                parcel.getClass();
                return new l(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? LatLngInfo.CREATOR.createFromParcel(parcel) : null);
            case 2:
                p.h hVar = new p.h();
                hVar.f33907a = parcel.readInt();
                return hVar;
            case 3:
                h0 h0Var = new h0(parcel);
                h0Var.f33908a = parcel.readByte() != 0;
                return h0Var;
            case 4:
                p20.d dVar = new p20.d(parcel);
                dVar.f34144a = parcel.readFloat();
                dVar.f34145b = parcel.readFloat();
                ArrayList arrayList3 = new ArrayList();
                dVar.f34146c = arrayList3;
                parcel.readList(arrayList3, Float.class.getClassLoader());
                dVar.f34147d = parcel.readFloat();
                dVar.f34148e = parcel.createBooleanArray()[0];
                return dVar;
            case 5:
                return new p20.g(parcel);
            case 6:
                parcel.getClass();
                pj.a aVarValueOf = pj.a.valueOf(parcel.readString());
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC = 0;
                while (iC != i13) {
                    iC = b3.i.c(pj.e.CREATOR, parcel, arrayList4, iC, 1);
                }
                return new pj.b(aVarValueOf, i11, i12, arrayList4);
            case 7:
                parcel.getClass();
                return new pj.c(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 8:
                parcel.getClass();
                return new pj.d(parcel.readInt(), parcel.readInt());
            case 9:
                parcel.getClass();
                int i14 = parcel.readInt();
                ArrayList arrayList5 = null;
                pj.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : pj.c.CREATOR.createFromParcel(parcel);
                int iC2 = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i15 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        arrayList6.add(Integer.valueOf(parcel.readInt()));
                    }
                    arrayList = arrayList6;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i17 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(i17);
                    int iC3 = 0;
                    while (iC3 != i17) {
                        iC3 = b3.i.c(pj.f.CREATOR, parcel, arrayList7, iC3, 1);
                    }
                    arrayList2 = arrayList7;
                }
                if (parcel.readInt() != 0) {
                    int i18 = parcel.readInt();
                    arrayList5 = new ArrayList(i18);
                    while (iC2 != i18) {
                        iC2 = b3.i.c(pj.d.CREATOR, parcel, arrayList5, iC2, 1);
                    }
                }
                return new pj.e(i14, cVarCreateFromParcel, arrayList, arrayList2, arrayList5);
            case 10:
                parcel.getClass();
                return new pj.f(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 11:
                int iX = jf.e.X(parcel);
                PendingIntent pendingIntent = null;
                String strW = null;
                Integer numS = null;
                int iR = 0;
                int iR2 = 0;
                while (parcel.dataPosition() < iX) {
                    int i19 = parcel.readInt();
                    char c3 = (char) i19;
                    if (c3 == 1) {
                        iR = jf.e.R(i19, parcel);
                    } else if (c3 == 2) {
                        iR2 = jf.e.R(i19, parcel);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) jf.e.v(parcel, i19, PendingIntent.CREATOR);
                    } else if (c3 == 4) {
                        strW = jf.e.w(i19, parcel);
                    } else if (c3 != 5) {
                        jf.e.W(i19, parcel);
                    } else {
                        numS = jf.e.S(i19, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new pz.b(iR, iR2, pendingIntent, strW, numS);
            case 12:
                int iX2 = jf.e.X(parcel);
                int iR3 = 0;
                boolean zM = false;
                long jT = -1;
                String strW2 = null;
                while (parcel.dataPosition() < iX2) {
                    int i21 = parcel.readInt();
                    char c7 = (char) i21;
                    if (c7 == 1) {
                        strW2 = jf.e.w(i21, parcel);
                    } else if (c7 == 2) {
                        iR3 = jf.e.R(i21, parcel);
                    } else if (c7 == 3) {
                        jT = jf.e.T(i21, parcel);
                    } else if (c7 != 4) {
                        jf.e.W(i21, parcel);
                    } else {
                        zM = jf.e.M(i21, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new pz.d(strW2, iR3, jT, zM);
            case 13:
                int iX3 = jf.e.X(parcel);
                long jT2 = -1;
                boolean zM2 = false;
                int iR4 = 0;
                int iR5 = 0;
                String strW3 = null;
                while (parcel.dataPosition() < iX3) {
                    int i22 = parcel.readInt();
                    char c8 = (char) i22;
                    if (c8 == 1) {
                        zM2 = jf.e.M(i22, parcel);
                    } else if (c8 == 2) {
                        strW3 = jf.e.w(i22, parcel);
                    } else if (c8 == 3) {
                        iR4 = jf.e.R(i22, parcel);
                    } else if (c8 == 4) {
                        iR5 = jf.e.R(i22, parcel);
                    } else if (c8 != 5) {
                        jf.e.W(i22, parcel);
                    } else {
                        jT2 = jf.e.T(i22, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new o(zM2, strW3, iR4, iR5, jT2);
            case 14:
                parcel.getClass();
                parcel.readInt();
                return qj.j.f37109a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                parcel.getClass();
                return new k(parcel.readString());
            case 16:
                parcel.getClass();
                return new qj.l(parcel.readString());
            case 17:
                parcel.getClass();
                parcel.readInt();
                return n.f37122a;
            case 18:
                parcel.getClass();
                return new qj.o(parcel.readInt() != 0);
            case 19:
                parcel.getClass();
                return new p(parcel.readString());
            case 20:
                parcel.getClass();
                return new q(DeeplinkC2CReferralData.CREATOR.createFromParcel(parcel), parcel.readString());
            case 21:
                parcel.getClass();
                return new r(parcel.readString());
            case 22:
                parcel.getClass();
                String strM205unboximpl = ItemId.CREATOR.createFromParcel(parcel).m205unboximpl();
                if (parcel.readInt() == 0) {
                    map = null;
                } else {
                    int i23 = parcel.readInt();
                    HashMap map2 = new HashMap(i23);
                    for (int i24 = 0; i24 != i23; i24++) {
                        map2.put(parcel.readString(), parcel.readString());
                    }
                    map = map2;
                }
                return new s(strM205unboximpl, map);
            case 23:
                parcel.getClass();
                parcel.readInt();
                return t.f37143a;
            case 24:
                parcel.getClass();
                return new u(parcel.readString());
            case 25:
                parcel.getClass();
                return new v(parcel.readInt() != 0);
            case 26:
                parcel.getClass();
                return new w(parcel.readString());
            case 27:
                parcel.getClass();
                return new x(parcel.readString());
            case 28:
                parcel.getClass();
                return new y(parcel.readString());
            default:
                parcel.getClass();
                parcel.readInt();
                return z.f37160a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f32260a) {
            case 0:
                return new j[i11];
            case 1:
                return new l[i11];
            case 2:
                return new p.h[i11];
            case 3:
                return new h0[i11];
            case 4:
                return new p20.d[i11];
            case 5:
                return new p20.g[i11];
            case 6:
                return new pj.b[i11];
            case 7:
                return new pj.c[i11];
            case 8:
                return new pj.d[i11];
            case 9:
                return new pj.e[i11];
            case 10:
                return new pj.f[i11];
            case 11:
                return new pz.b[i11];
            case 12:
                return new pz.d[i11];
            case 13:
                return new o[i11];
            case 14:
                return new qj.j[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new k[i11];
            case 16:
                return new qj.l[i11];
            case 17:
                return new n[i11];
            case 18:
                return new qj.o[i11];
            case 19:
                return new p[i11];
            case 20:
                return new q[i11];
            case 21:
                return new r[i11];
            case 22:
                return new s[i11];
            case 23:
                return new t[i11];
            case 24:
                return new u[i11];
            case 25:
                return new v[i11];
            case 26:
                return new w[i11];
            case 27:
                return new x[i11];
            case 28:
                return new y[i11];
            default:
                return new z[i11];
        }
    }
}
