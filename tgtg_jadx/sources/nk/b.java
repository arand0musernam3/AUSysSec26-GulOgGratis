package nk;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new jz.l(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30976a;

    public b(int i11) {
        this.f30976a = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f30976a == ((b) obj).f30976a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30976a);
    }

    public final String toString() {
        return r8.k.h(this.f30976a, "DynamicPrice(description=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f30976a);
    }
}
