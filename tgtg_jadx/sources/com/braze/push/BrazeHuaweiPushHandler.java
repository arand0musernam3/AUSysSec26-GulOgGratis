package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Constants;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeHuaweiPushHandler;", "", "<init>", "()V", "handleHmsRemoteMessageData", "", "context", "Landroid/content/Context;", "hmsRemoteMessageData", "", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeHuaweiPushHandler {

    @NotNull
    public static final BrazeHuaweiPushHandler INSTANCE = new BrazeHuaweiPushHandler();

    private BrazeHuaweiPushHandler() {
    }

    public static final boolean handleHmsRemoteMessageData(@NotNull Context context, @Nullable Map<String, String> hmsRemoteMessageData) {
        context.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeHuaweiPushHandler brazeHuaweiPushHandler = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b(hmsRemoteMessageData, 1), 6, (Object) null);
        if (hmsRemoteMessageData == null || hmsRemoteMessageData.isEmpty()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new k(4), 6, (Object) null);
            return false;
        }
        Bundle bundle = BundleUtils.toBundle(hmsRemoteMessageData);
        if (!bundle.containsKey(Constants.BRAZE_PUSH_BRAZE_KEY) || !Intrinsics.areEqual("true", bundle.getString(Constants.BRAZE_PUSH_BRAZE_KEY))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new k(5), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c(bundle, 0), 6, (Object) null);
        Intent intent = new Intent(BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION);
        intent.putExtras(bundle);
        BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$0(Map map) {
        return "Handling Huawei remote message: " + map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$1() {
        return "Remote message data was null. Remote message did not originate from Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$2() {
        return "Remote message did not originate from Braze. Not consuming remote message";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$3(Bundle bundle) {
        return "Got remote message from Huawei: " + bundle;
    }
}
