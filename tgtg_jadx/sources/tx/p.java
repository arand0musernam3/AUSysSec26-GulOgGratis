package tx;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f40547o = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40548n;

    public static void g(p pVar) {
        super.cancel();
    }

    @Override // tx.u0
    public final Bundle c(String str) {
        Bundle bundleC = n0.C(Uri.parse(str).getQuery());
        String string = bundleC.getString("bridge_args");
        bundleC.remove("bridge_args");
        if (!n0.x(string)) {
            try {
                bundleC.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", f.a(new JSONObject(string)));
            } catch (JSONException unused) {
                ax.a0 a0Var = ax.a0.f4849a;
            }
        }
        String string2 = bundleC.getString("method_results");
        bundleC.remove("method_results");
        if (!n0.x(string2)) {
            try {
                bundleC.putBundle("com.facebook.platform.protocol.RESULT_ARGS", f.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                ax.a0 a0Var2 = ax.a0.f4849a;
            }
        }
        bundleC.remove("version");
        bundleC.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", h0.h());
        return bundleC;
    }

    @Override // tx.u0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        t0 t0Var = this.f40561d;
        if (!this.f40568k || this.f40566i || t0Var == null || !t0Var.isShown()) {
            super.cancel();
        } else {
            if (this.f40548n) {
                return;
            }
            this.f40548n = true;
            t0Var.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new m0.l(this, 23), MessageLogView.NEW_MESSAGE_VIEW_DELAY);
        }
    }
}
