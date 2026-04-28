package ta;

import android.os.Parcel;
import android.os.Parcelable;
import r8.k;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends y7.b {
    public static final Parcelable.Creator<h> CREATOR = new q(18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Parcelable f39918d;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? h.class.getClassLoader() : classLoader;
        this.f39917c = parcel.readInt();
        this.f39918d = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return k.i(this.f39917c, "}", sb2);
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f39917c);
        parcel.writeParcelable(this.f39918d, i11);
    }
}
