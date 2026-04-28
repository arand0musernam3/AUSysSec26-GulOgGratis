package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jz.l;
import lx.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new l(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f11011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f11015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11017k;
    public final HashSet l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j9, String str6, ArrayList arrayList, String str7, String str8) {
        this.f11007a = str;
        this.f11008b = str2;
        this.f11009c = str3;
        this.f11010d = str4;
        this.f11011e = uri;
        this.f11012f = str5;
        this.f11013g = j9;
        this.f11014h = str6;
        this.f11015i = arrayList;
        this.f11016j = str7;
        this.f11017k = str8;
    }

    public static GoogleSignInAccount d(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j9 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(new Scope(1, jSONArray.getString(i11)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        i0.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j9, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f11012f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f11014h.equals(this.f11014h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f11015i);
        hashSet.addAll(googleSignInAccount.l);
        HashSet hashSet2 = new HashSet(this.f11015i);
        hashSet2.addAll(this.l);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f11014h.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f11015i);
        hashSet.addAll(this.l);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f11007a, parcel, 2);
        u.b0(this.f11008b, parcel, 3);
        u.b0(this.f11009c, parcel, 4);
        u.b0(this.f11010d, parcel, 5);
        u.a0(parcel, 6, this.f11011e, i11);
        u.b0(this.f11012f, parcel, 7);
        u.g0(parcel, 8, 8);
        parcel.writeLong(this.f11013g);
        u.b0(this.f11014h, parcel, 9);
        u.f0(parcel, 10, this.f11015i);
        u.b0(this.f11016j, parcel, 11);
        u.b0(this.f11017k, parcel, 12);
        u.i0(iH0, parcel);
    }
}
