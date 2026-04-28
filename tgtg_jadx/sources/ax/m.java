package ax;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new a00.p0(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4960k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f4961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f4962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f4963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f4964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f4965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f4966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f4968t;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.lang.String r11, java.lang.String r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.m.<init>(java.lang.String, java.lang.String):void");
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f4950a);
        jSONObject.put("iss", this.f4951b);
        jSONObject.put("aud", this.f4952c);
        jSONObject.put("nonce", this.f4953d);
        jSONObject.put("exp", this.f4954e);
        jSONObject.put("iat", this.f4955f);
        String str = this.f4956g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f4957h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f4958i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f4959j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f4960k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f4961m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f4962n;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f4963o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f4964p;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f4965q;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f4966r;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f4967s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f4968t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f4950a, mVar.f4950a) && Intrinsics.areEqual(this.f4951b, mVar.f4951b) && Intrinsics.areEqual(this.f4952c, mVar.f4952c) && Intrinsics.areEqual(this.f4953d, mVar.f4953d) && this.f4954e == mVar.f4954e && this.f4955f == mVar.f4955f && Intrinsics.areEqual(this.f4956g, mVar.f4956g) && Intrinsics.areEqual(this.f4957h, mVar.f4957h) && Intrinsics.areEqual(this.f4958i, mVar.f4958i) && Intrinsics.areEqual(this.f4959j, mVar.f4959j) && Intrinsics.areEqual(this.f4960k, mVar.f4960k) && Intrinsics.areEqual(this.l, mVar.l) && Intrinsics.areEqual(this.f4961m, mVar.f4961m) && Intrinsics.areEqual(this.f4962n, mVar.f4962n) && Intrinsics.areEqual(this.f4963o, mVar.f4963o) && Intrinsics.areEqual(this.f4964p, mVar.f4964p) && Intrinsics.areEqual(this.f4965q, mVar.f4965q) && Intrinsics.areEqual(this.f4966r, mVar.f4966r) && Intrinsics.areEqual(this.f4967s, mVar.f4967s) && Intrinsics.areEqual(this.f4968t, mVar.f4968t);
    }

    public final int hashCode() {
        int iB = l1.b(e0.f.b(e0.f.b(l1.b(l1.b(l1.b(l1.b(527, 31, this.f4950a), 31, this.f4951b), 31, this.f4952c), 31, this.f4953d), 31, this.f4954e), 31, this.f4955f), 31, this.f4956g);
        String str = this.f4957h;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4958i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4959j;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f4960k;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.l;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f4961m;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.f4962n;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.f4963o;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.f4964p;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.f4965q;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.f4966r;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.f4967s;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f4968t;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String string = a().toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f4950a);
        parcel.writeString(this.f4951b);
        parcel.writeString(this.f4952c);
        parcel.writeString(this.f4953d);
        parcel.writeLong(this.f4954e);
        parcel.writeLong(this.f4955f);
        parcel.writeString(this.f4956g);
        parcel.writeString(this.f4957h);
        parcel.writeString(this.f4958i);
        parcel.writeString(this.f4959j);
        parcel.writeString(this.f4960k);
        parcel.writeString(this.l);
        parcel.writeString(this.f4961m);
        Set set = this.f4962n;
        if (set == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(set));
        }
        parcel.writeString(this.f4963o);
        parcel.writeMap(this.f4964p);
        parcel.writeMap(this.f4965q);
        parcel.writeMap(this.f4966r);
        parcel.writeString(this.f4967s);
        parcel.writeString(this.f4968t);
    }

    public m(Parcel parcel) {
        String string = parcel.readString();
        tx.j.m(string, "jti");
        this.f4950a = string;
        String string2 = parcel.readString();
        tx.j.m(string2, "iss");
        this.f4951b = string2;
        String string3 = parcel.readString();
        tx.j.m(string3, "aud");
        this.f4952c = string3;
        String string4 = parcel.readString();
        tx.j.m(string4, "nonce");
        this.f4953d = string4;
        this.f4954e = parcel.readLong();
        this.f4955f = parcel.readLong();
        String string5 = parcel.readString();
        tx.j.m(string5, "sub");
        this.f4956g = string5;
        this.f4957h = parcel.readString();
        this.f4958i = parcel.readString();
        this.f4959j = parcel.readString();
        this.f4960k = parcel.readString();
        this.l = parcel.readString();
        this.f4961m = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f4962n = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f4963o = parcel.readString();
        HashMap hashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.f4964p = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(StringCompanionObject.INSTANCE.getClass().getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.f4965q = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(StringCompanionObject.class.getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.f4966r = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f4967s = parcel.readString();
        this.f4968t = parcel.readString();
    }
}
