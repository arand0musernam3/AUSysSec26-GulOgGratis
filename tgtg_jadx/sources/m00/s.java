package m00;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends rz.a implements com.google.android.gms.common.api.p {
    public static final Parcelable.Creator<s> CREATOR = new jz.l(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f28696a;

    public s(Status status) {
        this.f28696a = status;
    }

    @Override // com.google.android.gms.common.api.p
    public final Status c() {
        return this.f28696a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 1, this.f28696a, i11);
        lx.u.i0(iH0, parcel);
    }
}
