package oz;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends rz.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f33799a;

    public a(Intent intent) {
        this.f33799a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 1, this.f33799a, i11);
        u.i0(iH0, parcel);
    }
}
