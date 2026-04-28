package s00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends rz.a implements p {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f38504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f38505b;

    public c(Status status, d dVar) {
        this.f38504a = status;
        this.f38505b = dVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final Status c() {
        return this.f38504a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 1, this.f38504a, i11);
        u.a0(parcel, 2, this.f38505b, i11);
        u.i0(iH0, parcel);
    }
}
