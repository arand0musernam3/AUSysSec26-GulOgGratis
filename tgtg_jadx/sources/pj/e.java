package pj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import oa.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new i(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f35427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f35428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f35429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f35430e;

    public /* synthetic */ e(int i11, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i12) {
        this(i11, (i12 & 2) != 0 ? null : cVar, (i12 & 4) != 0 ? null : arrayList, (i12 & 8) != 0 ? null : arrayList2, (i12 & 16) != 0 ? null : arrayList3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f35426a == eVar.f35426a && Intrinsics.areEqual(this.f35427b, eVar.f35427b) && Intrinsics.areEqual(this.f35428c, eVar.f35428c) && Intrinsics.areEqual(this.f35429d, eVar.f35429d) && Intrinsics.areEqual(this.f35430e, eVar.f35430e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35426a) * 31;
        c cVar = this.f35427b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ArrayList arrayList = this.f35428c;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f35429d;
        int iHashCode4 = (iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.f35430e;
        return iHashCode4 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingConsentDescription(header=" + this.f35426a + ", linkBody=" + this.f35427b + ", bulletPoints=" + this.f35428c + ", serviceDescriptions=" + this.f35429d + ", storageDescriptions=" + this.f35430e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f35426a);
        c cVar = this.f35427b;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i11);
        }
        ArrayList arrayList = this.f35428c;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeInt(((Number) it.next()).intValue());
            }
        }
        ArrayList arrayList2 = this.f35429d;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((f) it2.next()).writeToParcel(parcel, i11);
            }
        }
        ArrayList arrayList3 = this.f35430e;
        if (arrayList3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList3.size());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((d) it3.next()).writeToParcel(parcel, i11);
        }
    }

    public e(int i11, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f35426a = i11;
        this.f35427b = cVar;
        this.f35428c = arrayList;
        this.f35429d = arrayList2;
        this.f35430e = arrayList3;
    }
}
