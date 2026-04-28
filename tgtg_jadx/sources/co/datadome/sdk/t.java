package co.datadome.sdk;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.z f8708a;

    public t(w2.z zVar) {
        this.f8708a = zVar;
    }

    @JavascriptInterface
    public void onAdditionalChallengeRedirection(int i11) {
        v.a("onAdditionalChallengeRedirection with xddb: " + i11);
        ChallengeActivity challengeActivity = (ChallengeActivity) this.f8708a.f43084c;
        boolean zBooleanValue = q.g(i11).booleanValue() ^ true;
        KProperty[] kPropertyArr = ChallengeActivity.f8613m;
        challengeActivity.l.setValue(challengeActivity, ChallengeActivity.f8613m[1], Boolean.valueOf(zBooleanValue));
    }

    @JavascriptInterface
    public void onCaptchaSuccess(String str) {
        w2.z zVar = this.f8708a;
        ChallengeActivity challengeActivity = (ChallengeActivity) zVar.f43084c;
        v.a("Captcha challenge resolved and got cookie: " + str);
        if (TextUtils.isEmpty(str) || Intrinsics.areEqual((String) zVar.f43083b, str)) {
            return;
        }
        str.getClass();
        if (kotlin.text.y.p(str, "datadome=", false)) {
            CookieManager.getInstance().setCookie(challengeActivity.f8621h, str);
            Intent intent = new Intent();
            intent.setAction("co.datadome.sdk.CAPTCHA_RESULT");
            intent.putExtra("captcha_result", -1);
            intent.putExtra("cookie", str);
            intent.putExtra("captcha_url", challengeActivity.f8616c);
            int intExtra = challengeActivity.getIntent().getIntExtra("request_id", -1);
            if (intExtra >= 0) {
                intent.putExtra("request_id", intExtra);
            }
            d9.c.a(challengeActivity).c(intent);
            challengeActivity.finish();
        }
    }
}
