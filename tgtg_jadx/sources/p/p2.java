package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends y7.b {
    public static final Parcelable.Creator<p2> CREATOR = new z3.q(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33979c;

    public p2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f33979c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" isIconified=");
        return j4.s.o(sb2, this.f33979c, "}");
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeValue(Boolean.valueOf(this.f33979c));
    }
}
