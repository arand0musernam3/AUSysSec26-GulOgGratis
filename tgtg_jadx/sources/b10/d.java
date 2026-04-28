package b10;

import android.os.Parcel;
import android.os.Parcelable;
import ax.n0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import java.util.ArrayList;
import java.util.List;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a implements p {
    public static final Parcelable.Creator<d> CREATOR = new n0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5549b;

    public d(String str, ArrayList arrayList) {
        this.f5548a = arrayList;
        this.f5549b = str;
    }

    @Override // com.google.android.gms.common.api.p
    public final Status c() {
        return this.f5549b != null ? Status.f11054e : Status.f11058i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.d0(parcel, 1, this.f5548a);
        u.b0(this.f5549b, parcel, 2);
        u.i0(iH0, parcel);
    }
}
