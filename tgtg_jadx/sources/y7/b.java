package y7;

import android.os.Parcel;
import android.os.Parcelable;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f45418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45417b = new a();
    public static final Parcelable.Creator<b> CREATOR = new q(20);

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f45418a = parcelable == f45417b ? null : parcelable;
        } else {
            i4.a.f("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f45418a, i11);
    }

    public b() {
        this.f45418a = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f45418a = parcelable == null ? f45417b : parcelable;
    }
}
