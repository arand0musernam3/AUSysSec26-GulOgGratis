package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends rz.a {
    public static final Parcelable.Creator<r0> CREATOR = new p0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160a;

    public r0(ArrayList arrayList) {
        com.google.android.gms.common.internal.i0.h(arrayList);
        this.f160a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        List list = ((r0) obj).f160a;
        List list2 = this.f160a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f160a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.f0(parcel, 1, this.f160a);
        lx.u.i0(iH0, parcel);
    }
}
