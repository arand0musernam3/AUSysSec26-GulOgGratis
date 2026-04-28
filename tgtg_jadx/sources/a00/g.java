package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends j {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new g0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00.q0 f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k00.q0 f106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k00.q0 f107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k00.q0 f108e;

    public g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.i0.h(bArr);
        k00.q0 q0VarJ = k00.q0.j(bArr.length, bArr);
        com.google.android.gms.common.internal.i0.h(bArr2);
        k00.q0 q0VarJ2 = k00.q0.j(bArr2.length, bArr2);
        com.google.android.gms.common.internal.i0.h(bArr3);
        k00.q0 q0VarJ3 = k00.q0.j(bArr3.length, bArr3);
        com.google.android.gms.common.internal.i0.h(bArr4);
        k00.q0 q0VarJ4 = k00.q0.j(bArr4.length, bArr4);
        k00.q0 q0VarJ5 = bArr5 == null ? null : k00.q0.j(bArr5.length, bArr5);
        this.f104a = q0VarJ;
        this.f105b = q0VarJ2;
        this.f106c = q0VarJ3;
        this.f107d = q0VarJ4;
        this.f108e = q0VarJ5;
    }

    public final JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", vz.c.c(this.f105b.l()));
            jSONObject.put("authenticatorData", vz.c.c(this.f106c.l()));
            jSONObject.put("signature", vz.c.c(this.f107d.l()));
            k00.q0 q0Var = this.f108e;
            if (q0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", vz.c.c(q0Var == null ? null : q0Var.l()));
            return jSONObject;
        } catch (JSONException e5) {
            a40.d0.o("Error encoding AuthenticatorAssertionResponse to JSON object", e5);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return com.google.android.gms.common.internal.i0.k(this.f104a, gVar.f104a) && com.google.android.gms.common.internal.i0.k(this.f105b, gVar.f105b) && com.google.android.gms.common.internal.i0.k(this.f106c, gVar.f106c) && com.google.android.gms.common.internal.i0.k(this.f107d, gVar.f107d) && com.google.android.gms.common.internal.i0.k(this.f108e, gVar.f108e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f104a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f105b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f106c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f107d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f108e}))});
    }

    public final String toString() {
        j30.g gVar = new j30.g(getClass().getSimpleName(), 4);
        k00.i0 i0Var = k00.k0.f25662d;
        byte[] bArrL = this.f104a.l();
        gVar.H(i0Var.c(bArrL.length, bArrL), "keyHandle");
        byte[] bArrL2 = this.f105b.l();
        gVar.H(i0Var.c(bArrL2.length, bArrL2), "clientDataJSON");
        byte[] bArrL3 = this.f106c.l();
        gVar.H(i0Var.c(bArrL3.length, bArrL3), "authenticatorData");
        byte[] bArrL4 = this.f107d.l();
        gVar.H(i0Var.c(bArrL4.length, bArrL4), "signature");
        k00.q0 q0Var = this.f108e;
        byte[] bArrL5 = q0Var == null ? null : q0Var.l();
        if (bArrL5 != null) {
            gVar.H(i0Var.c(bArrL5.length, bArrL5), "userHandle");
        }
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.T(parcel, 2, this.f104a.l());
        lx.u.T(parcel, 3, this.f105b.l());
        lx.u.T(parcel, 4, this.f106c.l());
        lx.u.T(parcel, 5, this.f107d.l());
        k00.q0 q0Var = this.f108e;
        lx.u.T(parcel, 6, q0Var == null ? null : q0Var.l());
        lx.u.i0(iH0, parcel);
    }
}
