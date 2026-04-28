package pj;

import android.os.Parcel;
import android.os.Parcelable;
import oa.i;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new i(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35423c;

    public c(int i11, int i12, int i13) {
        this.f35421a = i11;
        this.f35422b = i12;
        this.f35423c = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f35421a == cVar.f35421a && this.f35422b == cVar.f35422b && this.f35423c == cVar.f35423c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35423c) + k.b(this.f35422b, Integer.hashCode(this.f35421a) * 31, 31);
    }

    public final String toString() {
        return k.i(this.f35423c, ")", k.r(this.f35421a, this.f35422b, "TrackingConsentDataStorageBodyWithLink(body=", ", linkTitle=", ", linkUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f35421a);
        parcel.writeInt(this.f35422b);
        parcel.writeInt(this.f35423c);
    }
}
