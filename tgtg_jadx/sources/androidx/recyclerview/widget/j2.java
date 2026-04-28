package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends y7.b {
    public static final Parcelable.Creator<j2> CREATOR = new i2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f3792c;

    public j2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3792c = parcel.readParcelable(classLoader == null ? y1.class.getClassLoader() : classLoader);
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeParcelable(this.f3792c, 0);
    }
}
