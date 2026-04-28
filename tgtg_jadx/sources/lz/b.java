package lz;

import a60.r;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f28430c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f28431d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f28432a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f28433b;

    public b(Context context) {
        this.f28433b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        i0.h(context);
        ReentrantLock reentrantLock = f28430c;
        reentrantLock.lock();
        try {
            if (f28431d == null) {
                f28431d = new b(context.getApplicationContext());
            }
            b bVar = f28431d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String f(String str, String str2) {
        return e0.f.n(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strE2) && (strE = e(f("googleSignInAccount", strE2))) != null) {
            try {
                return GoogleSignInAccount.d(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        i0.h(googleSignInAccount);
        i0.h(googleSignInOptions);
        String str = googleSignInAccount.f11014h;
        d("defaultGoogleSignInAccount", str);
        String strF = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f11007a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f11008b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f11009c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f11010d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f11016j;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f11017k;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f11011e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f11012f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f11013g);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f11015i;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, r.f907b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f11053b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            d(strF, jSONObject.toString());
            String strF2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f11029h;
            String str10 = googleSignInOptions.f11028g;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.f11023b;
                Collections.sort(arrayList, GoogleSignInOptions.f11021o);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f11053b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f11024c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f11025d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f11027f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f11026e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(strF2, jSONObject2.toString());
            } catch (JSONException e5) {
                org.bouncycastle.jce.provider.a.m(e5);
            }
        } catch (JSONException e11) {
            org.bouncycastle.jce.provider.a.m(e11);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.f28432a;
        reentrantLock.lock();
        try {
            this.f28433b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f28432a;
        reentrantLock.lock();
        try {
            return this.f28433b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
