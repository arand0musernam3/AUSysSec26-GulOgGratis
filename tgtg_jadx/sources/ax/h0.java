package ax;

import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.components.core.Address;
import com.facebook.FacebookException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f4915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f4916k;
    public static volatile String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f4919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f4920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f4923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f4924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4925i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        charArray.getClass();
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i11 = 0; i11 < iNextInt; i11++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f4915j = sb2.toString();
        f4916k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public h0(b bVar, String str, Bundle bundle, l0 l0Var, c0 c0Var) {
        this.f4917a = bVar;
        this.f4918b = str;
        this.f4922f = null;
        j(c0Var);
        k(l0Var);
        if (bundle != null) {
            this.f4920d = new Bundle(bundle);
        } else {
            this.f4920d = new Bundle();
        }
        this.f4922f = a0.d();
    }

    public static String f() {
        String strB = a0.b();
        tx.j.n();
        String str = a0.f4856h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strB.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return strB + '|' + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f4920d
            java.lang.String r1 = r6.e()
            r2 = 0
            if (r1 == 0) goto L10
            java.lang.String r3 = "|"
            boolean r3 = kotlin.text.StringsKt.z(r1, r3, r2)
            goto L11
        L10:
            r3 = r2
        L11:
            java.lang.String r4 = "access_token"
            if (r1 == 0) goto L26
            java.lang.String r5 = "IG"
            boolean r1 = kotlin.text.y.p(r1, r5, r2)
            if (r1 == 0) goto L26
            if (r3 != 0) goto L26
            boolean r1 = r6.i()
            if (r1 == 0) goto L26
            goto L3d
        L26:
            java.lang.String r1 = ax.a0.e()
            java.lang.String r2 = "instagram.com"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 1
            if (r1 != 0) goto L34
            goto L39
        L34:
            boolean r1 = r6.i()
            r2 = r2 ^ r1
        L39:
            if (r2 != 0) goto L45
            if (r3 != 0) goto L45
        L3d:
            java.lang.String r1 = f()
            r0.putString(r4, r1)
            goto L4e
        L45:
            java.lang.String r1 = r6.e()
            if (r1 == 0) goto L4e
            r0.putString(r4, r1)
        L4e:
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L73
            ax.a0 r1 = ax.a0.f4849a
            tx.j.n()
            java.lang.String r1 = ax.a0.f4856h
            if (r1 == 0) goto L6b
            boolean r1 = tx.n0.x(r1)
            if (r1 == 0) goto L73
            java.lang.String r1 = "h0"
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
            goto L73
        L6b:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."
            r0.<init>(r1)
            throw r0
        L73:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            ax.m0 r0 = ax.m0.GRAPH_API_DEBUG_INFO
            ax.a0.g(r0)
            ax.m0 r0 = ax.m0.GRAPH_API_DEBUG_WARNING
            ax.a0.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.h0.a():void");
    }

    public final String b(String str, boolean z11) {
        if (!z11 && this.f4924h == l0.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f4920d.keySet()) {
            Object obj = this.f4920d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (qb.e.x(obj)) {
                builderBuildUpon.appendQueryParameter(str2, qb.e.o(obj).toString());
            } else if (this.f4924h != l0.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                i4.a.f(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public final k0 c() {
        List listT = kotlin.collections.y.T(new h0[]{this});
        listT.getClass();
        ArrayList arrayListU = qb.e.u(new j0(listT));
        if (arrayListU.size() == 1) {
            return (k0) arrayListU.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final i0 d() {
        List listT = kotlin.collections.y.T(new h0[]{this});
        listT.getClass();
        j0 j0Var = new j0(listT);
        tx.j.l(j0Var);
        i0 i0Var = new i0(j0Var);
        i0Var.executeOnExecutor(a0.c(), new Void[0]);
        return i0Var;
    }

    public final String e() {
        Bundle bundle = this.f4920d;
        b bVar = this.f4917a;
        if (bVar != null) {
            if (!bundle.containsKey("access_token")) {
                String str = bVar.f4875e;
                tx.f0.f40508d.B(str);
                return str;
            }
        } else if (!bundle.containsKey("access_token")) {
            return f();
        }
        return this.f4920d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.f4924h == l0.POST && (str2 = this.f4918b) != null && kotlin.text.y.j(str2, "/videos", false)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{a0.e()}, 1));
        } else {
            String strE = a0.e();
            strE.getClass();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{strE}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final String h(String str) {
        if (!(!Intrinsics.areEqual(a0.e(), "instagram.com") ? true : !i())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{a0.f4866s}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Pattern pattern = f4916k;
        String str2 = this.f4918b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f4922f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.f4918b;
        if (str == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("^/?");
        sb2.append(a0.b());
        sb2.append("/?.*");
        return this.f4925i || Pattern.matches(sb2.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(c0 c0Var) {
        a0.g(m0.GRAPH_API_DEBUG_INFO);
        a0.g(m0.GRAPH_API_DEBUG_WARNING);
        this.f4923g = c0Var;
    }

    public final void k(l0 l0Var) {
        if (l0Var == null) {
            l0Var = l0.GET;
        }
        this.f4924h = l0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f4917a;
        if (obj == null) {
            obj = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f4918b);
        sb2.append(", graphObject: ");
        sb2.append(this.f4919c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f4924h);
        sb2.append(", parameters: ");
        sb2.append(this.f4920d);
        sb2.append("}");
        return sb2.toString();
    }
}
