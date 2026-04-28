package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.n;
import androidx.core.app.s;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/braze/push/BrazeNotificationActionUtils;", "", "<init>", "()V", "Landroidx/core/app/s;", "notificationBuilder", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "", "addNotificationActions", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "handleNotificationActionClicked", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButton", "addNotificationAction", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;)V", "", "actionType", "logNotificationActionClicked", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeNotificationActionUtils {

    @NotNull
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$10(Bundle bundle) {
        return "Added action with bundle: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$7() {
        return "Cannot add notification action with null context from payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$8(String str) {
        return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$9(String str) {
        return a0.p("Adding notification action with type: ", str, " Setting intent class to trampoline activity");
    }

    public static final void addNotificationActions(@NotNull s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(10), 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(11), 7, (Object) null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h(actionButton, 2), 6, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$0() {
        return "Context cannot be null when adding notification buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$1() {
        return "No action buttons present. Not adding notification actions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$2(BrazeNotificationPayload.ActionButton actionButton) {
        return "Adding action button: " + actionButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:18:0x003f, B:29:0x005c, B:32:0x0067, B:34:0x006d, B:36:0x0074, B:38:0x0081, B:40:0x0087, B:42:0x0094, B:44:0x00a3, B:46:0x00a7, B:41:0x0091, B:21:0x0048, B:24:0x0051, B:26:0x0055, B:48:0x00b9, B:50:0x00cc), top: B:55:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:18:0x003f, B:29:0x005c, B:32:0x0067, B:34:0x006d, B:36:0x0074, B:38:0x0081, B:40:0x0087, B:42:0x0094, B:44:0x00a3, B:46:0x00a7, B:41:0x0091, B:21:0x0048, B:24:0x0051, B:26:0x0055, B:48:0x00b9, B:50:0x00cc), top: B:55:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:18:0x003f, B:29:0x005c, B:32:0x0067, B:34:0x006d, B:36:0x0074, B:38:0x0081, B:40:0x0087, B:42:0x0094, B:44:0x00a3, B:46:0x00a7, B:41:0x0091, B:21:0x0048, B:24:0x0051, B:26:0x0055, B:48:0x00b9, B:50:0x00cc), top: B:55:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void handleNotificationActionClicked(@org.jetbrains.annotations.NotNull android.content.Context r12, @org.jetbrains.annotations.NotNull android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked(android.content.Context, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$3() {
        return "Notification action button type was blank or null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$4() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$5() {
        return "Unknown notification action button clicked. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$6() {
        return "Caught exception while handling notification action button click.";
    }

    public final void addNotificationAction(@NotNull s notificationBuilder, @NotNull BrazeNotificationPayload payload, @NotNull BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        notificationBuilder.getClass();
        payload.getClass();
        actionButton.getClass();
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k(12), 7, (Object) null);
            return;
        }
        Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        String type = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if (Intrinsics.areEqual(Constants.BRAZE_PUSH_ACTION_TYPE_NONE, type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(type, 9), 6, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(type, 10), 6, (Object) null);
            Intent intent2 = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
        }
        n nVar = new n(null, actionButton.getText(), activity, new Bundle());
        ((Bundle) nVar.f2639f).putAll(new Bundle(bundle));
        notificationBuilder.f2665b.add(nVar.a());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c(bundle, 1), 6, (Object) null);
    }

    public final void logNotificationActionClicked(@NotNull Context context, @NotNull Intent intent, @Nullable String actionType) {
        context.getClass();
        intent.getClass();
        Braze.INSTANCE.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY), intent.getStringExtra(Constants.BRAZE_ACTION_ID_KEY), actionType);
    }
}
