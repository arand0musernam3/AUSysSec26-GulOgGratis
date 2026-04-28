package cy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import ax.s0;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f13490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f13491b;

    public c0(Parcel parcel) {
        HashMap map;
        int i11 = parcel.readInt();
        if (i11 < 0) {
            map = null;
        } else {
            map = new HashMap();
            for (int i12 = 0; i12 < i11; i12++) {
                map.put(parcel.readString(), parcel.readString());
            }
        }
        this.f13490a = map != null ? new LinkedHashMap(map) : null;
    }

    public final void a(String str, String str2) {
        if (this.f13490a == null) {
            this.f13490a = new HashMap();
        }
        HashMap map = this.f13490a;
        if (map != null) {
        }
    }

    public final String c(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", e());
            j(jSONObject);
        } catch (JSONException e5) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e5.getMessage());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final u d() {
        u uVar = this.f13491b;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    public abstract String e();

    public String f() {
        return "fb" + ax.a0.b() + "://authorize/";
    }

    public final void g(String str) {
        String strB;
        r rVar = d().f13586g;
        if (rVar == null || (strB = rVar.f13556d) == null) {
            strB = ax.a0.b();
        }
        bx.m mVar = new bx.m(d().e(), strB);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", strB);
        ax.a0 a0Var = ax.a0.f4849a;
        if (s0.c()) {
            mVar.g(bundle, "fb_dialogs_web_login_dialog_complete");
        }
    }

    public boolean h(int i11, int i12, Intent intent) {
        return false;
    }

    public final void i(Bundle bundle, r rVar) {
        String string = bundle.getString("code");
        if (n0.x(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        String strF = f();
        String str = rVar.f13569r;
        if (str == null) {
            str = "";
        }
        strF.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", string);
        bundle2.putString("client_id", ax.a0.b());
        bundle2.putString("redirect_uri", strF);
        bundle2.putString("code_verifier", str);
        String str2 = ax.h0.f4915j;
        ax.h0 h0VarY = qb.e.y(null, "oauth/access_token", null);
        h0VarY.k(ax.l0.GET);
        h0VarY.f4920d = bundle2;
        ax.k0 k0VarC = h0VarY.c();
        ax.w wVar = k0VarC.f4943c;
        if (wVar != null) {
            throw new FacebookServiceException(wVar, wVar.a());
        }
        try {
            JSONObject jSONObject = k0VarC.f4942b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || n0.x(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e5) {
            throw new FacebookException("Fail to process code exchange response: " + e5.getMessage());
        }
    }

    public abstract int k(r rVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        HashMap map = this.f13490a;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public void b() {
    }

    public void j(JSONObject jSONObject) {
    }
}
