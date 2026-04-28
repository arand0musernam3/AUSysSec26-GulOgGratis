package ax;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new a00.p0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4971c;

    public n(String str) throws JSONException {
        str.getClass();
        tx.j.k(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        bArrDecode.getClass();
        Charset charset = Charsets.UTF_8;
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString("alg");
            strOptString.getClass();
            boolean z11 = strOptString.length() > 0 && Intrinsics.areEqual(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            strOptString2.getClass();
            boolean z12 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString("typ");
            strOptString3.getClass();
            boolean z13 = strOptString3.length() > 0;
            if (z11 && z12 && z13) {
                byte[] bArrDecode2 = Base64.decode(str, 0);
                bArrDecode2.getClass();
                JSONObject jSONObject2 = new JSONObject(new String(bArrDecode2, charset));
                String string = jSONObject2.getString("alg");
                string.getClass();
                this.f4969a = string;
                String string2 = jSONObject2.getString("typ");
                string2.getClass();
                this.f4970b = string2;
                String string3 = jSONObject2.getString("kid");
                string3.getClass();
                this.f4971c = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        i4.a.f("Invalid Header");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f4969a, nVar.f4969a) && Intrinsics.areEqual(this.f4970b, nVar.f4970b) && Intrinsics.areEqual(this.f4971c, nVar.f4971c);
    }

    public final int hashCode() {
        return this.f4971c.hashCode() + l1.b(l1.b(527, 31, this.f4969a), 31, this.f4970b);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f4969a);
        jSONObject.put("typ", this.f4970b);
        jSONObject.put("kid", this.f4971c);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f4969a);
        parcel.writeString(this.f4970b);
        parcel.writeString(this.f4971c);
    }

    public n(Parcel parcel) {
        String string = parcel.readString();
        tx.j.m(string, "alg");
        this.f4969a = string;
        String string2 = parcel.readString();
        tx.j.m(string2, "typ");
        this.f4970b = string2;
        String string3 = parcel.readString();
        tx.j.m(string3, "kid");
        this.f4971c = string3;
    }
}
