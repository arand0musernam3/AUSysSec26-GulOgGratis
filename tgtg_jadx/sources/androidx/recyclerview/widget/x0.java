package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Parcelable {
    public static final Parcelable.Creator<x0> CREATOR = new w0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3969c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3967a);
        parcel.writeInt(this.f3968b);
        parcel.writeInt(this.f3969c ? 1 : 0);
    }
}
