package h20;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends y7.b {
    public static final Parcelable.Creator<r> CREATOR = new z3.q(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f21351c;

    public r(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21351c = parcel.readBundle(classLoader == null ? r.class.getClassLoader() : classLoader);
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeBundle(this.f21351c);
    }
}
