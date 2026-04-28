package b10;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.n0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends rz.a implements p {
    public static final Parcelable.Creator<b> CREATOR = new n0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f5547c;

    public b(int i11, int i12, Intent intent) {
        this.f5545a = i11;
        this.f5546b = i12;
        this.f5547c = intent;
    }

    @Override // com.google.android.gms.common.api.p
    public final Status c() {
        return this.f5546b == 0 ? Status.f11054e : Status.f11058i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f5545a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f5546b);
        u.a0(parcel, 3, this.f5547c, i11);
        u.i0(iH0, parcel);
    }
}
