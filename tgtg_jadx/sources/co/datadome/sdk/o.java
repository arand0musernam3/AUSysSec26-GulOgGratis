package co.datadome.sdk;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import co.datadome.sdk.DataDomeSDK;

/* JADX INFO: loaded from: classes.dex */
public final class o extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataDomeSDKListener f8675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f8676b;

    public o(q qVar, DataDomeSDKListener dataDomeSDKListener) {
        this.f8676b = qVar;
        this.f8675a = dataDomeSDKListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("captcha_result", 0);
        DataDomeSDKListener dataDomeSDKListener = this.f8675a;
        q qVar = this.f8676b;
        if (intExtra == -1) {
            qVar.f8694n = false;
            String stringExtra = intent.getStringExtra("cookie");
            String stringExtra2 = intent.getStringExtra("captcha_url");
            Log.i("DataDome", "Did resolve challenge with cookie " + stringExtra);
            qVar.f8699s.clear();
            qVar.c(stringExtra);
            if (dataDomeSDKListener != null) {
                dataDomeSDKListener.onCaptchaDismissed();
                dataDomeSDKListener.onCaptchaSuccess();
            }
            qVar.logEvent(DataDomeSDK.Events.CAPTCHA_SUCCESS.getEvent("sdk"));
            v.a("Challenge succeed with url " + stringExtra2);
            if (qVar.f8682a.booleanValue()) {
                q.resetHandlingResponseInProgress();
                Intent intent2 = new Intent();
                intent2.setAction("co.datadome.sdk.CAPTCHA_RESULT");
                intent2.putExtra("captcha_result", 0);
                d9.c.a(((Application) qVar.f8689h.get()).getApplicationContext()).c(intent2);
            }
            qVar.f8682a = Boolean.FALSE;
            qVar.f8695o = true;
            if (qVar.f8693m != null) {
                int intExtra2 = intent.getIntExtra("request_id", -1);
                qVar.f8693m.onComplete(intExtra2 < 0 ? null : Integer.valueOf(intExtra2));
            }
        } else if (intExtra == 1) {
            if (dataDomeSDKListener != null) {
                dataDomeSDKListener.onCaptchaLoaded();
            }
            qVar.f8694n = true;
        } else {
            if (dataDomeSDKListener != null && !qVar.f8695o) {
                dataDomeSDKListener.onCaptchaDismissed();
                dataDomeSDKListener.onCaptchaCancelled();
            }
            DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener = qVar.f8693m;
            if (dataDomeSDKManualIntegrationListener != null && !qVar.f8695o) {
                dataDomeSDKManualIntegrationListener.onDismiss();
            }
            qVar.f8694n = false;
            qVar.f8682a = Boolean.FALSE;
            q.resetHandlingResponseInProgress();
            qVar.logEvent(DataDomeSDK.Events.CAPTCHA_FAILURE.getEvent("sdk"));
            v.a("onReceive ->  challenge dismissed");
        }
        if (intExtra == -1 || intExtra == 0) {
            qVar.f8685d = Boolean.valueOf(qVar.f8695o);
            q.f8679x.open();
        }
    }
}
