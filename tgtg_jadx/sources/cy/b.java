package cy;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13472a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13472a) {
            case 0:
                parcel.getClass();
                return new c(parcel);
            case 1:
                parcel.getClass();
                i iVar = new i();
                iVar.f13512a = parcel.readString();
                iVar.f13513b = parcel.readString();
                iVar.f13514c = parcel.readString();
                iVar.f13515d = parcel.readLong();
                iVar.f13516e = parcel.readLong();
                return iVar;
            case 2:
                parcel.getClass();
                return new l(parcel);
            case 3:
                parcel.getClass();
                return new n(parcel);
            case 4:
                parcel.getClass();
                return new o(parcel);
            case 5:
                parcel.getClass();
                return new p(parcel);
            case 6:
                parcel.getClass();
                u uVar = new u();
                uVar.f13581b = -1;
                Parcelable[] parcelableArray = parcel.readParcelableArray(c0.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = parcelableArray.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        uVar.f13580a = (c0[]) arrayList.toArray(new c0[0]);
                        uVar.f13581b = parcel.readInt();
                        uVar.f13586g = (r) parcel.readParcelable(r.class.getClassLoader());
                        HashMap mapE = n0.E(parcel);
                        uVar.f13587h = mapE != null ? new LinkedHashMap(mapE) : null;
                        HashMap mapE2 = n0.E(parcel);
                        uVar.f13588i = mapE2 != null ? new LinkedHashMap(mapE2) : null;
                        return uVar;
                    }
                    Parcelable parcelable = parcelableArray[i11];
                    c0 c0Var = parcelable instanceof c0 ? (c0) parcelable : null;
                    if (c0Var != null) {
                        c0Var.f13491b = uVar;
                    }
                    if (c0Var != null) {
                        arrayList.add(c0Var);
                    }
                    i11++;
                }
                break;
            case 7:
                parcel.getClass();
                return new r(parcel);
            case 8:
                parcel.getClass();
                return new t(parcel);
            default:
                parcel.getClass();
                return new l0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f13472a) {
            case 0:
                return new c[i11];
            case 1:
                return new i[i11];
            case 2:
                return new l[i11];
            case 3:
                return new n[i11];
            case 4:
                return new o[i11];
            case 5:
                return new p[i11];
            case 6:
                return new u[i11];
            case 7:
                return new r[i11];
            case 8:
                return new t[i11];
            default:
                return new l0[i11];
        }
    }
}
