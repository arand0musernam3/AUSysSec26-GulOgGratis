package qj;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.order.OrderType;
import java.util.HashMap;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37062a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        HashMap map;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        switch (this.f37062a) {
            case 0:
                parcel.getClass();
                String strM205unboximpl = ItemId.CREATOR.createFromParcel(parcel).m205unboximpl();
                if (parcel.readInt() == 0) {
                    map = null;
                } else {
                    int i11 = parcel.readInt();
                    HashMap map5 = new HashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        map5.put(parcel.readString(), parcel.readString());
                    }
                    map = map5;
                }
                return new b0(strM205unboximpl, map);
            case 1:
                parcel.getClass();
                parcel.readInt();
                return c0.f37069a;
            case 2:
                parcel.getClass();
                return new d0(parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                parcel.readInt();
                return e0.f37076a;
            case 4:
                parcel.getClass();
                parcel.readInt();
                return f0.f37080a;
            case 5:
                parcel.getClass();
                return new g0(parcel.readString());
            case 6:
                parcel.getClass();
                String strM205unboximpl2 = ItemId.CREATOR.createFromParcel(parcel).m205unboximpl();
                if (parcel.readInt() == 0) {
                    map2 = null;
                } else {
                    int i13 = parcel.readInt();
                    HashMap map6 = new HashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        map6.put(parcel.readString(), parcel.readString());
                    }
                    map2 = map6;
                }
                return new h0(strM205unboximpl2, map2);
            case 7:
                parcel.getClass();
                return new i0(parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                parcel.readInt();
                return j0.f37110a;
            case 9:
                parcel.getClass();
                return new k0(parcel.readString());
            case 10:
                parcel.getClass();
                return new l0(parcel.readString());
            case 11:
                parcel.getClass();
                String strM205unboximpl3 = ItemId.CREATOR.createFromParcel(parcel).m205unboximpl();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    map3 = null;
                } else {
                    int i15 = parcel.readInt();
                    HashMap map7 = new HashMap(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        map7.put(parcel.readString(), parcel.readString());
                    }
                    map3 = map7;
                }
                return new m0(strM205unboximpl3, string, map3);
            case 12:
                parcel.getClass();
                return new n0(parcel.readString());
            case 13:
                parcel.getClass();
                parcel.readInt();
                return o0.f37126a;
            case 14:
                parcel.getClass();
                parcel.readInt();
                return p0.f37130a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                parcel.getClass();
                parcel.readInt();
                return q0.f37134a;
            case 16:
                parcel.getClass();
                return new r0((Uri) parcel.readParcelable(r0.class.getClassLoader()));
            case 17:
                parcel.getClass();
                parcel.readInt();
                return s0.f37141a;
            case 18:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    map4 = null;
                } else {
                    int i17 = parcel.readInt();
                    HashMap map8 = new HashMap(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        map8.put(parcel.readString(), parcel.readString());
                    }
                    map4 = map8;
                }
                return new t0(map4);
            case 19:
                parcel.getClass();
                return new u0(parcel.readString(), OrderType.valueOf(parcel.readString()));
            case 20:
                parcel.getClass();
                parcel.readInt();
                return v0.f37152a;
            case 21:
                parcel.getClass();
                parcel.readInt();
                return w0.f37154a;
            case 22:
                parcel.getClass();
                return new x0(parcel.readString());
            case 23:
                parcel.getClass();
                return new y0(parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                parcel.readInt();
                return z0.f37161a;
            case 25:
                parcel.getClass();
                parcel.readInt();
                return a1.f37063a;
            case 26:
                parcel.getClass();
                parcel.readInt();
                return b1.f37068a;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return c1.f37070a;
            case 28:
                parcel.getClass();
                parcel.readInt();
                return d1.f37073a;
            default:
                parcel.getClass();
                parcel.readInt();
                return e1.f37077a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f37062a) {
            case 0:
                return new b0[i11];
            case 1:
                return new c0[i11];
            case 2:
                return new d0[i11];
            case 3:
                return new e0[i11];
            case 4:
                return new f0[i11];
            case 5:
                return new g0[i11];
            case 6:
                return new h0[i11];
            case 7:
                return new i0[i11];
            case 8:
                return new j0[i11];
            case 9:
                return new k0[i11];
            case 10:
                return new l0[i11];
            case 11:
                return new m0[i11];
            case 12:
                return new n0[i11];
            case 13:
                return new o0[i11];
            case 14:
                return new p0[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new q0[i11];
            case 16:
                return new r0[i11];
            case 17:
                return new s0[i11];
            case 18:
                return new t0[i11];
            case 19:
                return new u0[i11];
            case 20:
                return new v0[i11];
            case 21:
                return new w0[i11];
            case 22:
                return new x0[i11];
            case 23:
                return new y0[i11];
            case 24:
                return new z0[i11];
            case 25:
                return new a1[i11];
            case 26:
                return new b1[i11];
            case 27:
                return new c1[i11];
            case 28:
                return new d1[i11];
            default:
                return new e1[i11];
        }
    }
}
