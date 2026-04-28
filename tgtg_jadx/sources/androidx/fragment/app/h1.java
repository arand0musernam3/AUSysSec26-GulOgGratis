package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Parcelable {
    public static final Parcelable.Creator<h1> CREATOR = new a00.p0(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3229b;

    public h1(String str, int i11) {
        this.f3228a = str;
        this.f3229b = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f3228a);
        parcel.writeInt(this.f3229b);
    }
}
