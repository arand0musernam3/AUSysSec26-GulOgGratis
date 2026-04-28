package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends rz.a {
    public static final Parcelable.Creator<c4> CREATOR = new d4(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44662a;

    public c4(ArrayList arrayList) {
        this.f44662a = arrayList;
    }

    public static c4 d(z2... z2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(z2VarArr[0].a()));
        return new c4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.Y(parcel, 1, this.f44662a);
        lx.u.i0(iH0, parcel);
    }
}
