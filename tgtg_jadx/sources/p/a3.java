package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends y7.b {
    public static final Parcelable.Creator<a3> CREATOR = new z3.q(14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33853d;

    public a3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f33852c = parcel.readInt();
        this.f33853d = parcel.readInt() != 0;
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f33852c);
        parcel.writeInt(this.f33853d ? 1 : 0);
    }
}
