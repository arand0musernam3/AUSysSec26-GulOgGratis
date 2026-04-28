package v00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new s00.e(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41649a;

    public e(String str) {
        i0.i(str, "json must not be null");
        this.f41649a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f41649a, parcel, 2);
        u.i0(iH0, parcel);
    }
}
