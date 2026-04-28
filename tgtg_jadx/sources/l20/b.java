package l20;

import android.os.Parcel;
import android.os.Parcelable;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends y7.b {
    public static final Parcelable.Creator<b> CREATOR = new q(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26792c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f26792c = parcel.readString();
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f26792c);
    }
}
