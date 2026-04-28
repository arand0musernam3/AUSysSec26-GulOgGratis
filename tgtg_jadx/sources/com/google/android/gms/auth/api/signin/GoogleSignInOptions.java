package com.google.android.gms.auth.api.signin;

import a60.r;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jz.l;
import lx.u;
import org.json.JSONArray;
import org.json.JSONObject;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInOptions extends a implements d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final GoogleSignInOptions f11018k;
    public static final Scope l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Scope f11019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f11020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r f11021o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f11024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f11030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11031j;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        l = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f11019m = scope3;
        f11020n = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f11020n)) {
            Scope scope4 = f11019m;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f11018k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f11020n)) {
            Scope scope5 = f11019m;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new l(6);
        f11021o = new r(17);
    }

    public GoogleSignInOptions(int i11, ArrayList arrayList, Account account, boolean z11, boolean z12, boolean z13, String str, String str2, HashMap map, String str3) {
        this.f11022a = i11;
        this.f11023b = arrayList;
        this.f11024c = account;
        this.f11025d = z11;
        this.f11026e = z12;
        this.f11027f = z13;
        this.f11028g = str;
        this.f11029h = str2;
        this.f11030i = new ArrayList(map.values());
        this.f11031j = str3;
    }

    public static GoogleSignInOptions d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(new Scope(1, jSONArray.getString(i11)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap e(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lz.a aVar = (lz.a) it.next();
                map.put(Integer.valueOf(aVar.f28428b), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f11028g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f11023b;
            String str2 = googleSignInOptions.f11028g;
            if (this.f11030i.isEmpty() && googleSignInOptions.f11030i.isEmpty()) {
                ArrayList arrayList2 = this.f11023b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.f11024c;
                    Account account2 = googleSignInOptions.f11024c;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.f11027f == googleSignInOptions.f11027f && this.f11025d == googleSignInOptions.f11025d && this.f11026e == googleSignInOptions.f11026e) {
                        return TextUtils.equals(this.f11031j, googleSignInOptions.f11031j);
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11023b;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((Scope) arrayList2.get(i11)).f11053b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f11024c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f11028g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f11027f ? 1 : 0)) * 31) + (this.f11025d ? 1 : 0)) * 31) + (this.f11026e ? 1 : 0)) * 31;
        String str2 = this.f11031j;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11022a);
        u.f0(parcel, 2, new ArrayList(this.f11023b));
        u.a0(parcel, 3, this.f11024c, i11);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f11025d ? 1 : 0);
        u.g0(parcel, 5, 4);
        parcel.writeInt(this.f11026e ? 1 : 0);
        u.g0(parcel, 6, 4);
        parcel.writeInt(this.f11027f ? 1 : 0);
        u.b0(this.f11028g, parcel, 7);
        u.b0(this.f11029h, parcel, 8);
        u.f0(parcel, 9, this.f11030i);
        u.b0(this.f11031j, parcel, 10);
        u.i0(iH0, parcel);
    }
}
