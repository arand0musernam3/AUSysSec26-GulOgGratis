package cy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.activity.result.ActivityResultLauncher;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i11, Parcel parcel) {
        super(parcel);
        this.f13507c = i11;
        switch (i11) {
            case 1:
                super(parcel);
                break;
            default:
                this.f13508d = ax.k.FACEBOOK_APPLICATION_WEB;
                break;
        }
    }

    @Override // cy.c0
    public boolean h(int i11, int i12, Intent intent) {
        String string;
        String string2;
        Object obj;
        switch (this.f13507c) {
            case 0:
                r rVar = d().f13586g;
                if (intent == null) {
                    m(new t(rVar, s.CANCEL, null, "Operation canceled", null));
                    return true;
                }
                if (i12 == 0) {
                    Bundle extras = intent.getExtras();
                    if (extras == null || (string = extras.getString(StatusResponseUtils.RESULT_ERROR)) == null) {
                        string = extras != null ? extras.getString("error_type") : null;
                    }
                    String string3 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
                    if (!Intrinsics.areEqual("CONNECTION_FAILURE", string3)) {
                        m(new t(rVar, s.CANCEL, null, string, null));
                        return true;
                    }
                    if (extras != null && (string2 = extras.getString("error_message")) != null) {
                        string = string2;
                    } else if (extras != null) {
                        string = extras.getString("error_description");
                    }
                    ArrayList arrayList = new ArrayList();
                    if (string != null) {
                        arrayList.add(string);
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                    m(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList), string3));
                    return true;
                }
                if (i12 != -1) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("Unexpected resultCode from authorization.");
                    m(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList2), null));
                    return true;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    m(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList3), null));
                    return true;
                }
                String string4 = extras2.getString(StatusResponseUtils.RESULT_ERROR);
                if (string4 == null) {
                    string4 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                string = obj2 != null ? obj2.toString() : null;
                String string5 = extras2.getString("error_message");
                if (string5 == null) {
                    string5 = extras2.getString("error_description");
                }
                String string6 = extras2.getString("e2e");
                if (!n0.x(string6)) {
                    g(string6);
                }
                if (string4 != null || string != null || string5 != null || rVar == null) {
                    q(rVar, string4, string5, string);
                    return true;
                }
                if (!extras2.containsKey("code") || n0.x(extras2.getString("code"))) {
                    r(extras2, rVar);
                    return true;
                }
                ax.a0.c().execute(new a40.q(this, rVar, extras2, 15));
                return true;
            default:
                return super.h(i11, i12, intent);
        }
    }

    public void l(Bundle bundle, r rVar) {
        rVar.getClass();
        f0 f0Var = rVar.f13565n;
        String strF = rVar.f13557e;
        if (strF == null || strF.length() == 0) {
            strF = f();
        }
        bundle.putString("redirect_uri", strF);
        f0 f0Var2 = f0.INSTAGRAM;
        boolean z11 = f0Var == f0Var2;
        String str = rVar.f13556d;
        if (z11) {
            bundle.putString("app_id", str);
        } else {
            bundle.putString("client_id", str);
        }
        bundle.putString("e2e", b0.z.t());
        if (f0Var == f0Var2) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (rVar.f13554b.contains("openid")) {
                bundle.putString("nonce", rVar.f13568q);
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", rVar.f13570s);
        a aVar = rVar.f13571t;
        bundle.putString("code_challenge_method", aVar != null ? aVar.name() : null);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", rVar.f13562j);
        bundle.putString("login_behavior", rVar.f13553a.name());
        ax.a0 a0Var = ax.a0.f4849a;
        bundle.putString("sdk", "android-18.2.3");
        if (o() != null) {
            bundle.putString("sso", o());
        }
        bundle.putString("cct_prefetching", ax.a0.f4861n ? "1" : "0");
        if (rVar.f13566o) {
            bundle.putString("fx_app", f0Var.toString());
        }
        if (rVar.f13567p) {
            bundle.putString("skip_dedupe", "true");
        }
        String str2 = rVar.l;
        if (str2 != null) {
            bundle.putString("messenger_page_id", str2);
            bundle.putString("reset_messenger_state", rVar.f13564m ? "1" : "0");
        }
    }

    public void m(t tVar) {
        if (tVar != null) {
            d().d(tVar);
        } else {
            d().j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle n(cy.r r8) {
        /*
            r7 = this;
            r8.getClass()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r8.f13554b
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L27
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            goto L27
        L15:
            java.util.Set r1 = r8.f13554b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = ","
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            java.lang.String r2 = "scope"
            r0.putString(r2, r1)
            r7.a(r2, r1)
        L27:
            cy.e r1 = r8.f13555c
            if (r1 != 0) goto L2d
            cy.e r1 = cy.e.NONE
        L2d:
            java.lang.String r2 = "default_audience"
            java.lang.String r1 = r1.a()
            r0.putString(r2, r1)
            java.lang.String r8 = r8.f13559g
            java.lang.String r8 = r7.c(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = ax.b.l
            ax.b r8 = pd.g.v()
            if (r8 == 0) goto L4c
            java.lang.String r8 = r8.f4875e
            goto L4d
        L4c:
            r8 = 0
        L4d:
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            java.lang.String r3 = "access_token"
            if (r8 == 0) goto L80
            cy.u r4 = r7.d()
            androidx.fragment.app.o0 r4 = r4.e()
            if (r4 == 0) goto L60
            goto L64
        L60:
            android.content.Context r4 = ax.a0.a()
        L64:
            java.lang.String r5 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)
            if (r4 == 0) goto L80
            r0.putString(r3, r8)
            r7.a(r3, r2)
            goto L90
        L80:
            cy.u r8 = r7.d()
            androidx.fragment.app.o0 r8 = r8.e()
            if (r8 == 0) goto L8d
            tx.n0.c(r8)
        L8d:
            r7.a(r3, r1)
        L90:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "cbt"
            r0.putString(r3, r8)
            ax.a0 r8 = ax.a0.f4849a
            boolean r8 = ax.s0.c()
            if (r8 == 0) goto La6
            r1 = r2
        La6:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.g0.n(cy.r):android.os.Bundle");
    }

    public String o() {
        return null;
    }

    public ax.k p() {
        return (ax.k) this.f13508d;
    }

    public void q(r rVar, String str, String str2, String str3) {
        if (str != null && Intrinsics.areEqual(str, "logged_out")) {
            c.f13484j = true;
            m(null);
            return;
        }
        if (CollectionsKt.I(kotlin.collections.d0.h("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m(null);
            return;
        }
        if (CollectionsKt.I(kotlin.collections.d0.h("access_denied", "OAuthAccessDeniedException"), str)) {
            m(new t(rVar, s.CANCEL, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList), str3));
    }

    public void r(Bundle bundle, r rVar) {
        try {
            m(new t(rVar, s.SUCCESS, b0.a0.n(rVar.f13554b, bundle, p(), rVar.f13556d), b0.a0.p(bundle, rVar.f13568q), null, null));
        } catch (FacebookException e5) {
            String message = e5.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public void s(r rVar, Bundle bundle, FacebookException facebookException) {
        t tVar;
        rVar.getClass();
        u uVarD = d();
        String strValueOf = null;
        this.f13508d = null;
        String str = rVar.f13557e;
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, f())) {
            if (facebookException instanceof FacebookOperationCanceledException) {
                uVarD.d(new t(uVarD.f13586g, s.CANCEL, null, "User canceled log in.", null));
                return;
            }
            if (facebookException != null) {
                this.f13508d = null;
                String message = facebookException.getMessage();
                if (facebookException instanceof FacebookServiceException) {
                    ax.w wVar = ((FacebookServiceException) facebookException).f10987b;
                    strValueOf = String.valueOf(wVar.f5019b);
                    message = wVar.toString();
                }
                String str2 = strValueOf;
                r rVar2 = uVarD.f13586g;
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                uVarD.d(new t(rVar2, s.ERROR, null, TextUtils.join(": ", arrayList), str2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f13508d = bundle.getString("e2e");
            }
            try {
                ax.b bVarN = b0.a0.n(rVar.f13554b, bundle, p(), rVar.f13556d);
                tVar = new t(uVarD.f13586g, s.SUCCESS, bVarN, b0.a0.p(bundle, rVar.f13568q), null, null);
                if (uVarD.e() != null) {
                    try {
                        CookieSyncManager.createInstance(uVarD.e()).sync();
                    } catch (Exception unused) {
                    }
                    if (bVarN != null) {
                        String str3 = bVarN.f4875e;
                        Context contextE = d().e();
                        if (contextE == null) {
                            contextE = ax.a0.a();
                        }
                        contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str3).apply();
                    }
                }
            } catch (FacebookException e5) {
                r rVar3 = uVarD.f13586g;
                String message2 = e5.getMessage();
                ArrayList arrayList2 = new ArrayList();
                if (message2 != null) {
                    arrayList2.add(message2);
                }
                tVar = new t(rVar3, s.ERROR, null, TextUtils.join(": ", arrayList2), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            tVar = new t(uVarD.f13586g, s.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f13508d = null;
            String message3 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                ax.w wVar2 = ((FacebookServiceException) facebookException).f10987b;
                strValueOf = String.valueOf(wVar2.f5019b);
                message3 = wVar2.toString();
            }
            String str4 = strValueOf;
            r rVar4 = uVarD.f13586g;
            ArrayList arrayList3 = new ArrayList();
            if (message3 != null) {
                arrayList3.add(message3);
            }
            tVar = new t(rVar4, s.ERROR, null, TextUtils.join(": ", arrayList3), str4);
        }
        if (!n0.x((String) this.f13508d)) {
            g((String) this.f13508d);
        }
        uVarD.d(tVar);
    }

    public boolean t(Intent intent) {
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = ax.a0.a().getPackageManager().queryIntentActivities(intent, 65536);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return false;
        }
        v vVar = d().f13582c;
        Unit unit = null;
        if (vVar == null) {
            vVar = null;
        }
        if (vVar != null) {
            ActivityResultLauncher activityResultLauncher = vVar.f13594d;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("launcher");
                activityResultLauncher = null;
            }
            if (activityResultLauncher != null) {
                activityResultLauncher.a(intent, null);
                unit = Unit.f26487a;
            }
        }
        return unit != null;
    }

    public /* synthetic */ g0() {
        this.f13507c = 1;
    }

    public g0(u uVar) {
        this.f13507c = 0;
        this.f13491b = uVar;
        this.f13508d = ax.k.FACEBOOK_APPLICATION_WEB;
    }
}
