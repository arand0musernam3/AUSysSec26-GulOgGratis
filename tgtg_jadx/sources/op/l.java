package op;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.LatLngInfo;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LatLngInfo f32913f;

    @NotNull
    public static final k Companion = new k();

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new oa.i(1);

    public /* synthetic */ l(int i11, Long l, long j9, String str, String str2, String str3, LatLngInfo latLngInfo) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, j.f32907a.getDescriptor());
            throw null;
        }
        this.f32908a = l;
        this.f32909b = j9;
        this.f32910c = str;
        this.f32911d = str2;
        if ((i11 & 16) == 0) {
            this.f32912e = null;
        } else {
            this.f32912e = str3;
        }
        if ((i11 & 32) == 0) {
            this.f32913f = null;
        } else {
            this.f32913f = latLngInfo;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f32908a, lVar.f32908a) && this.f32909b == lVar.f32909b && Intrinsics.areEqual(this.f32910c, lVar.f32910c) && Intrinsics.areEqual(this.f32911d, lVar.f32911d) && Intrinsics.areEqual(this.f32912e, lVar.f32912e) && Intrinsics.areEqual(this.f32913f, lVar.f32913f);
    }

    public final int hashCode() {
        Long l = this.f32908a;
        int iB = l1.b(l1.b(e0.f.b((l == null ? 0 : l.hashCode()) * 31, 31, this.f32909b), 31, this.f32910c), 31, this.f32911d);
        String str = this.f32912e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        LatLngInfo latLngInfo = this.f32913f;
        return iHashCode + (latLngInfo != null ? latLngInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Station(id=");
        sb2.append(this.f32908a);
        sb2.append(", placeId=");
        sb2.append(this.f32909b);
        s.A(sb2, ", name=", this.f32910c, ", nameNative=", this.f32911d);
        sb2.append(", stationCode=");
        sb2.append(this.f32912e);
        sb2.append(", location=");
        sb2.append(this.f32913f);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        Long l = this.f32908a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.f32909b);
        parcel.writeString(this.f32910c);
        parcel.writeString(this.f32911d);
        parcel.writeString(this.f32912e);
        LatLngInfo latLngInfo = this.f32913f;
        if (latLngInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            latLngInfo.writeToParcel(parcel, i11);
        }
    }

    public l(Long l, long j9, String str, String str2, String str3, LatLngInfo latLngInfo) {
        str.getClass();
        str2.getClass();
        this.f32908a = l;
        this.f32909b = j9;
        this.f32910c = str;
        this.f32911d = str2;
        this.f32912e = str3;
        this.f32913f = latLngInfo;
    }
}
