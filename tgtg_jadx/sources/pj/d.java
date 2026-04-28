package pj;

import android.os.Parcel;
import android.os.Parcelable;
import oa.i;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new i(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35425b;

    public d(int i11, int i12) {
        this.f35424a = i11;
        this.f35425b = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f35424a == dVar.f35424a && this.f35425b == dVar.f35425b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35425b) + (Integer.hashCode(this.f35424a) * 31);
    }

    public final String toString() {
        return k.g(this.f35424a, this.f35425b, "TrackingConsentDataStorageDescription(header=", ", body=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f35424a);
        parcel.writeInt(this.f35425b);
    }
}
