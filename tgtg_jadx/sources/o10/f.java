package o10;

import android.os.Parcel;
import android.os.Parcelable;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends y7.b {
    public static final Parcelable.Creator<f> CREATOR = new q(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31802d;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f31801c = parcel.readInt();
        this.f31802d = parcel.readInt() != 0;
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f31801c);
        parcel.writeInt(this.f31802d ? 1 : 0);
    }
}
