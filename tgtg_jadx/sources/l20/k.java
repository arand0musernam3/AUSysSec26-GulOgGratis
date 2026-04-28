package l20;

import android.os.Parcel;
import android.os.Parcelable;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends y7.b {
    public static final Parcelable.Creator<k> CREATOR = new q(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26811d;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f26810c = parcel.readString();
        this.f26811d = parcel.readInt();
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f26810c);
        parcel.writeInt(this.f26811d);
    }
}
