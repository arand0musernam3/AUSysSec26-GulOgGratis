package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/braze/BrazeBootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "handleIncomingIntent", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Companion", "com/braze/w", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeBootReceiver extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final w Companion = new w();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$1(Intent intent) {
        return "Received broadcast message. Message: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$2() {
        return "Boot complete intent received. Initializing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$3(Intent intent) {
        return "Unknown intent " + intent + " received. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return "Failed to process incoming intent " + intent;
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new o1(2, intent), 6, (Object) null);
        if (!Intrinsics.areEqual(BOOT_COMPLETE_ACTION, intent.getAction())) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new o1(3, intent), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new w1(1), 6, (Object) null);
        Braze.INSTANCE.getInstance(context);
        BrazeInternal.INSTANCE.deleteRegisteredGeofenceCache(context);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            handleIncomingIntent(context, intent);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new o1(1, intent), 4, (Object) null);
        }
    }
}
