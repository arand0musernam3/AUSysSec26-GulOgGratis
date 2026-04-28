package a00;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.braze.h2;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends rz.a {
    public static final Parcelable.Creator<l0> CREATOR = new g0(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f129b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f130a;

    public l0(byte[][] bArr) {
        com.google.android.gms.common.internal.i0.b(bArr != null);
        com.google.android.gms.common.internal.i0.b(1 == ((bArr.length & 1) ^ 1));
        int i11 = 0;
        while (i11 < bArr.length) {
            com.google.android.gms.common.internal.i0.b(i11 == 0 || bArr[i11] != null);
            int i12 = i11 + 1;
            com.google.android.gms.common.internal.i0.b(bArr[i12] != null);
            int length = bArr[i12].length;
            com.google.android.gms.common.internal.i0.b(length == 32 || length == 64);
            i11 += 2;
        }
        this.f130a = bArr;
    }

    public static l0 d(JSONObject jSONObject, boolean z11) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z11) {
                    arrayList.add(h(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(i(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(vz.c.b(next));
                    if (z11) {
                        arrayList.add(h(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(i(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new l0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject e(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] g(byte[] bArr) {
        b20.b bVar;
        k00.c0 c0Var;
        int i11 = k00.f0.f25639a;
        k00.g0 g0Var = k00.e0.f25636a;
        int i12 = g0Var.f25642f;
        MessageDigest messageDigest = g0Var.f25641e;
        if (g0Var.f25643g) {
            try {
                bVar = new b20.b((MessageDigest) messageDigest.clone(), i12);
            } catch (CloneNotSupportedException unused) {
                try {
                    bVar = new b20.b(MessageDigest.getInstance(messageDigest.getAlgorithm()), i12);
                } catch (NoSuchAlgorithmException e5) {
                    i4.a.d(e5);
                    return null;
                }
            }
        } else {
            bVar = new b20.b(MessageDigest.getInstance(messageDigest.getAlgorithm()), i12);
        }
        MessageDigest messageDigest2 = (MessageDigest) bVar.f5569c;
        byte[] bArr2 = f129b;
        bArr2.getClass();
        int length = bArr2.length;
        if (bVar.f5568b) {
            h2.b("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (bVar.f5568b) {
            h2.b("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr, 0, length2);
        if (bVar.f5568b) {
            h2.b("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        bVar.f5568b = true;
        int i13 = bVar.f5567a;
        if (i13 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = k00.d0.f25632a;
            c0Var = new k00.c0(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i13);
            char[] cArr2 = k00.d0.f25632a;
            c0Var = new k00.c0(bArrCopyOf);
        }
        return (byte[]) c0Var.f25630b.clone();
    }

    public static byte[] h(JSONObject jSONObject) throws JSONException {
        byte[] bArrB = vz.c.b(jSONObject.getString("first"));
        if (bArrB.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrB;
        }
        byte[] bArrB2 = vz.c.b(jSONObject.getString("second"));
        if (bArrB2.length == 32) {
            return k00.a.j(bArrB, bArrB2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] i(JSONObject jSONObject) {
        byte[] bArrG = g(vz.c.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrG : k00.a.j(bArrG, g(vz.c.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return Arrays.deepEquals(this.f130a, ((l0) obj).f130a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f130a) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.f130a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i11 = 0; i11 < bArr.length; i11 += 2) {
                if (bArr[i11] == null) {
                    jSONObject.put("eval", e(bArr[i11 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(vz.c.c(bArr[i11]), e(bArr[i11 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e5) {
            return w.a0.p("PrfExtension{Exception:", e5.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.U(parcel, 1, this.f130a);
        lx.u.i0(iH0, parcel);
    }
}
