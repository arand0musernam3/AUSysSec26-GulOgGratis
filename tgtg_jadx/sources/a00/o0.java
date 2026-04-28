package a00;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.braze.models.FeatureFlag;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends rz.a {
    public static final Parcelable.Creator<o0> CREATOR = new g0(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f136b;

    public o0(boolean z11, k00.q0 q0Var) {
        this.f135a = z11;
        this.f136b = q0Var;
    }

    public final JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f135a) {
                jSONObject.put(FeatureFlag.ENABLED, true);
            }
            k00.q0 q0Var = this.f136b;
            byte[] bArrL = q0Var == null ? null : q0Var.l();
            if (bArrL != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrL, 32), 11));
                if (bArrL.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrL, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e5) {
            a40.d0.o("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e5);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f135a == o0Var.f135a && com.google.android.gms.common.internal.i0.k(this.f136b, o0Var.f136b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f135a), this.f136b});
    }

    public final String toString() {
        return w.a0.p("AuthenticationExtensionsPrfOutputs{", d().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f135a ? 1 : 0);
        k00.q0 q0Var = this.f136b;
        lx.u.T(parcel, 2, q0Var == null ? null : q0Var.l());
        lx.u.i0(iH0, parcel);
    }
}
