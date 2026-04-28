package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends rz.a {

    @NonNull
    public static final Parcelable.Creator<o> CREATOR = new p0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134a;

    public o(String str) {
        com.google.android.gms.common.internal.i0.h(str);
        this.f134a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f134a.equals(((o) obj).f134a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f134a});
    }

    public final String toString() {
        return r8.k.p(new StringBuilder("FidoAppIdExtension{appid='"), this.f134a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f134a, parcel, 2);
        lx.u.i0(iH0, parcel);
    }
}
