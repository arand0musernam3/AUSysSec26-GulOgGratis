package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new g0(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f95b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f96c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f97d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f98e;

    public e(e0 e0Var, n0 n0Var, f fVar, o0 o0Var, String str) {
        this.f94a = e0Var;
        this.f95b = n0Var;
        this.f96c = fVar;
        this.f97d = o0Var;
        this.f98e = str;
    }

    public final JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            f fVar = this.f96c;
            if (fVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", fVar.f100a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e5) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e5);
                }
            }
            e0 e0Var = this.f94a;
            if (e0Var != null) {
                jSONObject.put("uvm", e0Var.d());
            }
            o0 o0Var = this.f97d;
            if (o0Var != null) {
                jSONObject.put("prf", o0Var.d());
            }
            String str = this.f98e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            a40.d0.o("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.google.android.gms.common.internal.i0.k(this.f94a, eVar.f94a) && com.google.android.gms.common.internal.i0.k(this.f95b, eVar.f95b) && com.google.android.gms.common.internal.i0.k(this.f96c, eVar.f96c) && com.google.android.gms.common.internal.i0.k(this.f97d, eVar.f97d) && com.google.android.gms.common.internal.i0.k(this.f98e, eVar.f98e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f94a, this.f95b, this.f96c, this.f97d, this.f98e});
    }

    public final String toString() {
        return w.a0.p("AuthenticationExtensionsClientOutputs{", d().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 1, this.f94a, i11);
        lx.u.a0(parcel, 2, this.f95b, i11);
        lx.u.a0(parcel, 3, this.f96c, i11);
        lx.u.a0(parcel, 4, this.f97d, i11);
        lx.u.b0(this.f98e, parcel, 5);
        lx.u.i0(iH0, parcel);
    }
}
