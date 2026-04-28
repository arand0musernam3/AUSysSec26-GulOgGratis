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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/braze/BrazeFlushPushDeliveryReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "com/braze/x", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeFlushPushDeliveryReceiver extends BroadcastReceiver {
    public static final x Companion = new x();
    public static final String FLUSH_BRAZE_PUSH_DELIVERIES_ACTION = "com.braze.FLUSH_PUSH_DELIVERY";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return e0.f.k("BrazeFlushPushDeliveryReceiver received intent: ", intent.getAction());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o1(4, intent), 7, (Object) null);
        if (Intrinsics.areEqual(intent.getAction(), FLUSH_BRAZE_PUSH_DELIVERIES_ACTION)) {
            BrazeInternal.INSTANCE.performPushDeliveryFlush(context);
        }
    }
}
