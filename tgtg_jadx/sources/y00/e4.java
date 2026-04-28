package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e4 extends rz.a {
    public static final Parcelable.Creator<e4> CREATOR = new d4(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44745a;

    public e4(ArrayList arrayList) {
        this.f44745a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.f0(parcel, 1, this.f44745a);
        lx.u.i0(iH0, parcel);
    }
}
