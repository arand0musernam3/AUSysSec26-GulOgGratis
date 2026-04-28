package x10;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new s00.e(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f43641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f43642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f43643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f43644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43647g;

    public b(l lVar, l lVar2, c cVar, l lVar3, int i11) {
        Objects.requireNonNull(lVar, "start cannot be null");
        Objects.requireNonNull(lVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f43641a = lVar;
        this.f43642b = lVar2;
        this.f43644d = lVar3;
        this.f43645e = i11;
        this.f43643c = cVar;
        if (lVar3 != null && lVar.f43695a.compareTo(lVar3.f43695a) > 0) {
            i4.a.f("start Month cannot be after current Month");
            throw null;
        }
        if (lVar3 != null && lVar3.f43695a.compareTo(lVar2.f43695a) > 0) {
            i4.a.f("current Month cannot be after end Month");
            throw null;
        }
        if (i11 < 0 || i11 > r.c(null).getMaximum(7)) {
            i4.a.f("firstDayOfWeek is not valid");
            throw null;
        }
        this.f43647g = lVar.e(lVar2) + 1;
        this.f43646f = (lVar2.f43697c - lVar.f43697c) + 1;
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
        return this.f43641a.equals(bVar.f43641a) && this.f43642b.equals(bVar.f43642b) && Objects.equals(this.f43644d, bVar.f43644d) && this.f43645e == bVar.f43645e && this.f43643c.equals(bVar.f43643c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43641a, this.f43642b, this.f43644d, Integer.valueOf(this.f43645e), this.f43643c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f43641a, 0);
        parcel.writeParcelable(this.f43642b, 0);
        parcel.writeParcelable(this.f43644d, 0);
        parcel.writeParcelable(this.f43643c, 0);
        parcel.writeInt(this.f43645e);
    }
}
