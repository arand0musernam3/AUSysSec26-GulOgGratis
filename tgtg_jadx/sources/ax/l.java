package ax;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.h2;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new a00.p0(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f4947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f4948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4949e;

    public l(String str, String str2) {
        str2.getClass();
        tx.j.k(str, "token");
        tx.j.k(str2, "expectedNonce");
        boolean zC = false;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        if (listSplit$default.size() != 3) {
            i4.a.f("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) listSplit$default.get(0);
        String str4 = (String) listSplit$default.get(1);
        String str5 = (String) listSplit$default.get(2);
        this.f4945a = str;
        this.f4946b = str2;
        n nVar = new n(str3);
        this.f4947c = nVar;
        this.f4948d = new m(str4, str2);
        try {
            String strB = ay.a.b(nVar.f4971c);
            if (strB != null) {
                zC = ay.a.c(ay.a.a(strB), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (zC) {
            this.f4949e = str5;
        } else {
            i4.a.f("Invalid Signature");
            throw null;
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f4945a);
        jSONObject.put("expected_nonce", this.f4946b);
        n nVar = this.f4947c;
        nVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", nVar.f4969a);
        jSONObject2.put("typ", nVar.f4970b);
        jSONObject2.put("kid", nVar.f4971c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f4948d.a());
        jSONObject.put("signature", this.f4949e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f4945a, lVar.f4945a) && Intrinsics.areEqual(this.f4946b, lVar.f4946b) && Intrinsics.areEqual(this.f4947c, lVar.f4947c) && Intrinsics.areEqual(this.f4948d, lVar.f4948d) && Intrinsics.areEqual(this.f4949e, lVar.f4949e);
    }

    public final int hashCode() {
        return this.f4949e.hashCode() + ((this.f4948d.hashCode() + ((this.f4947c.hashCode() + l1.b(l1.b(527, 31, this.f4945a), 31, this.f4946b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f4945a);
        parcel.writeString(this.f4946b);
        parcel.writeParcelable(this.f4947c, i11);
        parcel.writeParcelable(this.f4948d, i11);
        parcel.writeString(this.f4949e);
    }

    public l(Parcel parcel) {
        String string = parcel.readString();
        tx.j.m(string, "token");
        this.f4945a = string;
        String string2 = parcel.readString();
        tx.j.m(string2, "expectedNonce");
        this.f4946b = string2;
        Parcelable parcelable = parcel.readParcelable(n.class.getClassLoader());
        if (parcelable != null) {
            this.f4947c = (n) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(m.class.getClassLoader());
            if (parcelable2 != null) {
                this.f4948d = (m) parcelable2;
                String string3 = parcel.readString();
                tx.j.m(string3, "signature");
                this.f4949e = string3;
                return;
            }
            h2.b("Required value was null.");
            throw null;
        }
        h2.b("Required value was null.");
        throw null;
    }
}
