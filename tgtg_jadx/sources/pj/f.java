package pj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import oa.i;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new i(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f35436f;

    public f(int i11, int i12, String str, int i13, int i14, Integer num) {
        str.getClass();
        this.f35431a = i11;
        this.f35432b = i12;
        this.f35433c = str;
        this.f35434d = i13;
        this.f35435e = i14;
        this.f35436f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f35431a == fVar.f35431a && this.f35432b == fVar.f35432b && Intrinsics.areEqual(this.f35433c, fVar.f35433c) && this.f35434d == fVar.f35434d && this.f35435e == fVar.f35435e && Intrinsics.areEqual(this.f35436f, fVar.f35436f);
    }

    public final int hashCode() {
        int iB = k.b(this.f35435e, k.b(this.f35434d, l1.b(k.b(this.f35432b, Integer.hashCode(this.f35431a) * 31, 31), 31, this.f35433c), 31), 31);
        Integer num = this.f35436f;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = k.r(this.f35431a, this.f35432b, "TrackingConsentServiceDescription(header=", ", purpose=", ", policyLink=");
        sbR.append(this.f35433c);
        sbR.append(", expiry=");
        sbR.append(this.f35434d);
        sbR.append(", provider=");
        sbR.append(this.f35435e);
        sbR.append(", name=");
        sbR.append(this.f35436f);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f35431a);
        parcel.writeInt(this.f35432b);
        parcel.writeString(this.f35433c);
        parcel.writeInt(this.f35434d);
        parcel.writeInt(this.f35435e);
        Integer num = this.f35436f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            b3.i.w(parcel, 1, num);
        }
    }
}
