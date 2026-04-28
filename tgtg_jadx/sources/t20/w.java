package t20;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends y7.b {
    public static final Parcelable.Creator<w> CREATOR = new z3.q(17);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f39775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39776d;

    public w(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f39775c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f39776d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f39775c) + "}";
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        TextUtils.writeToParcel(this.f39775c, parcel, i11);
        parcel.writeInt(this.f39776d ? 1 : 0);
    }
}
