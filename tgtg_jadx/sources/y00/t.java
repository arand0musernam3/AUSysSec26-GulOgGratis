package y00;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends rz.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new s00.e(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f45137a;

    public t(Bundle bundle) {
        this.f45137a = bundle;
    }

    public final Object d(String str) {
        return this.f45137a.get(str);
    }

    public final Double e() {
        return Double.valueOf(this.f45137a.getDouble("value"));
    }

    public final String g() {
        return this.f45137a.getString("currency");
    }

    public final Bundle h() {
        return new Bundle(this.f45137a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.f45137a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.S(parcel, 2, h());
        lx.u.i0(iH0, parcel);
    }
}
