package pj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import oa.i;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f35417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f35420d;

    public b(a aVar, int i11, int i12, ArrayList arrayList) {
        aVar.getClass();
        this.f35417a = aVar;
        this.f35418b = i11;
        this.f35419c = i12;
        this.f35420d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35417a == bVar.f35417a && this.f35418b == bVar.f35418b && this.f35419c == bVar.f35419c && Intrinsics.areEqual(this.f35420d, bVar.f35420d);
    }

    public final int hashCode() {
        return this.f35420d.hashCode() + k.b(this.f35419c, k.b(this.f35418b, this.f35417a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TrackingConsentCategory(category=" + this.f35417a + ", title=" + this.f35418b + ", header=" + this.f35419c + ", descriptions=" + this.f35420d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f35417a.name());
        parcel.writeInt(this.f35418b);
        parcel.writeInt(this.f35419c);
        ArrayList arrayList = this.f35420d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e) it.next()).writeToParcel(parcel, i11);
        }
    }
}
