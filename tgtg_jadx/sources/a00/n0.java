package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends rz.a {
    public static final Parcelable.Creator<n0> CREATOR = new g0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00.q0 f132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f133b;

    public n0(k00.q0 q0Var, k00.q0 q0Var2) {
        this.f132a = q0Var;
        this.f133b = q0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return com.google.android.gms.common.internal.i0.k(this.f132a, n0Var.f132a) && com.google.android.gms.common.internal.i0.k(this.f133b, n0Var.f133b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f132a, this.f133b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        k00.q0 q0Var = this.f132a;
        lx.u.T(parcel, 1, q0Var == null ? null : q0Var.l());
        k00.q0 q0Var2 = this.f133b;
        lx.u.T(parcel, 2, q0Var2 != null ? q0Var2.l() : null);
        lx.u.i0(iH0, parcel);
    }
}
