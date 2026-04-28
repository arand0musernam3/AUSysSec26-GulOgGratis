package com.braze.dispatch;

import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.requests.o;
import com.braze.storage.z2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public final void a(BrazeConfigurationProvider brazeConfigurationProvider, z2 z2Var, o oVar, String str) {
        brazeConfigurationProvider.getClass();
        z2Var.getClass();
        oVar.getClass();
        str.getClass();
        com.braze.requests.b bVar = (com.braze.requests.b) oVar;
        bVar.f10360f = str;
        bVar.f10361g = brazeConfigurationProvider.getBrazeApiKey().f10175a;
        bVar.f10362h = Constants.BRAZE_SDK_VERSION;
        bVar.f10359e = Long.valueOf(DateTimeUtils.nowInSeconds());
        if (!brazeConfigurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tr.e(14), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new rv.a(z2Var, 11), 6, (Object) null);
            bVar.f10364j = z2Var.a();
        }
    }

    public static final String a(z2 z2Var) {
        return a0.p("Adding SDK Auth token to request '", z2Var.a(), "'");
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
