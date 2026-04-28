package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends rz.a {

    @NonNull
    public static final Parcelable.Creator<b0> CREATOR = new g0(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81b;

    static {
        new b0(a0.SUPPORTED.toString(), null);
        new b0(a0.NOT_SUPPORTED.toString(), null);
    }

    public b0(String str, String str2) {
        com.google.android.gms.common.internal.i0.h(str);
        try {
            this.f80a = a0.a(str);
            this.f81b = str2;
        } catch (TokenBinding$UnsupportedTokenBindingStatusException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k00.a.h(this.f80a, b0Var.f80a) && k00.a.h(this.f81b, b0Var.f81b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80a, this.f81b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f80a.toString(), parcel, 2);
        lx.u.b0(this.f81b, parcel, 3);
        lx.u.i0(iH0, parcel);
    }
}
