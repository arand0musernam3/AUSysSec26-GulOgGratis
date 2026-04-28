package com.braze.models.outgoing;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public final void a(BrazeConfigurationProvider brazeConfigurationProvider, JSONObject jSONObject, DeviceKey deviceKey, Object obj) {
        brazeConfigurationProvider.getClass();
        jSONObject.getClass();
        deviceKey.getClass();
        if (!brazeConfigurationProvider.isDeviceObjectAllowlistEnabled() || brazeConfigurationProvider.getDeviceObjectAllowlist().contains(deviceKey)) {
            jSONObject.putOpt(deviceKey.getKey(), obj);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new cw.b(deviceKey, 0), 6, (Object) null);
        }
    }

    public static final String a(DeviceKey deviceKey) {
        return "Not adding device key <" + deviceKey + "> to export due to allowlist restrictions.";
    }
}
