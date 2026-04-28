package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends rz.a {
    public static final Parcelable.Creator<k0> CREATOR = new g0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00.q0 f124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k00.q0 f126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f127d;

    public k0(k00.q0 q0Var, k00.q0 q0Var2, k00.q0 q0Var3, int i11) {
        this.f124a = q0Var;
        this.f125b = q0Var2;
        this.f126c = q0Var3;
        this.f127d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return com.google.android.gms.common.internal.i0.k(this.f124a, k0Var.f124a) && com.google.android.gms.common.internal.i0.k(this.f125b, k0Var.f125b) && com.google.android.gms.common.internal.i0.k(this.f126c, k0Var.f126c) && this.f127d == k0Var.f127d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f124a, this.f125b, this.f126c, Integer.valueOf(this.f127d)});
    }

    public final String toString() {
        k00.q0 q0Var = this.f124a;
        String strC = vz.c.c(q0Var == null ? null : q0Var.l());
        k00.q0 q0Var2 = this.f125b;
        String strC2 = vz.c.c(q0Var2 == null ? null : q0Var2.l());
        k00.q0 q0Var3 = this.f126c;
        String strC3 = vz.c.c(q0Var3 != null ? q0Var3.l() : null);
        StringBuilder sbT = e0.f.t("HmacSecretExtension{coseKeyAgreement=", strC, ", saltEnc=", strC2, ", saltAuth=");
        sbT.append(strC3);
        sbT.append(", getPinUvAuthProtocol=");
        return r8.k.i(this.f127d, "}", sbT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        k00.q0 q0Var = this.f124a;
        lx.u.T(parcel, 1, q0Var == null ? null : q0Var.l());
        k00.q0 q0Var2 = this.f125b;
        lx.u.T(parcel, 2, q0Var2 == null ? null : q0Var2.l());
        k00.q0 q0Var3 = this.f126c;
        lx.u.T(parcel, 3, q0Var3 != null ? q0Var3.l() : null);
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(this.f127d);
        lx.u.i0(iH0, parcel);
    }
}
