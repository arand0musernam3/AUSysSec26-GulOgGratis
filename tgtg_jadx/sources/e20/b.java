package e20;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends y7.b {
    public static final Parcelable.Creator<b> CREATOR = new z3.q(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15583c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15583c = parcel.readInt() == 1;
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f15583c ? 1 : 0);
    }
}
