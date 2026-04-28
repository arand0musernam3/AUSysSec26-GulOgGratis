package h2;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21114a;

    public h(int i11) {
        this.f21114a = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f21114a == ((h) obj).f21114a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21114a);
    }

    public final String toString() {
        return r8.k.o(new StringBuilder("DefaultLazyKey(index="), this.f21114a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f21114a);
    }
}
