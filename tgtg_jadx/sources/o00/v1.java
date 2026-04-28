package o00;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<v1> CREATOR = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31759c;

    public /* synthetic */ v1(Parcel parcel) {
        this.f31757a = parcel.readString();
        this.f31758b = parcel.readLong();
        this.f31759c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f31757a.compareTo(((v1) obj).f31757a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            return this.f31757a.equals(((v1) obj).f31757a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31757a.hashCode();
    }

    public final String toString() {
        return this.f31757a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31757a);
        parcel.writeLong(this.f31758b);
        parcel.writeInt(this.f31759c);
    }

    public v1(int i11, long j9, String str) {
        this.f31757a = str;
        this.f31758b = j9;
        this.f31759c = i11;
    }
}
