package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends rz.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new l(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25496b;

    public k(String str, String str2) {
        i0.i(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        i0.f(strTrim, "Account identifier cannot be empty");
        this.f25495a = strTrim;
        i0.e(str2);
        this.f25496b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i0.k(this.f25495a, kVar.f25495a) && i0.k(this.f25496b, kVar.f25496b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25495a, this.f25496b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f25495a, parcel, 1);
        u.b0(this.f25496b, parcel, 2);
        u.i0(iH0, parcel);
    }
}
