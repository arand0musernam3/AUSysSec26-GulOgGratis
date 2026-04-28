package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.f1;
import com.braze.models.inappmessage.l;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import j4.s;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v80.f0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazePushReceiver extends BroadcastReceiver {

    @NotNull
    private static final String ADM_ERROR_DESCRIPTION_KEY = "error_description";

    @NotNull
    private static final String ADM_ERROR_KEY = "error";

    @NotNull
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";

    @NotNull
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";

    @NotNull
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";

    @NotNull
    private static final String ADM_UNREGISTERED_KEY = "unregistered";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DELETED_MESSAGES_KEY = "deleted_messages";

    @NotNull
    public static final String FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION = "firebase_messaging_service_routing_action";

    @NotNull
    public static final String HMS_PUSH_SERVICE_ROUTING_ACTION = "hms_push_service_routing_action";

    @NotNull
    private static final String MESSAGE_TYPE_KEY = "message_type";

    @NotNull
    private static final String NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";

    @NotNull
    public static final BrazeNotificationPayload createPayload(@NotNull Context context, @NotNull BrazeConfigurationProvider brazeConfigurationProvider, @NotNull Bundle bundle, @NotNull Bundle bundle2) {
        return INSTANCE.createPayload(context, brazeConfigurationProvider, bundle, bundle2);
    }

    public static final boolean handleAdmRegistrationEventIfEnabled(@NotNull BrazeConfigurationProvider brazeConfigurationProvider, @NotNull Context context, @NotNull Intent intent) {
        return INSTANCE.handleAdmRegistrationEventIfEnabled(brazeConfigurationProvider, context, intent);
    }

    public static final boolean handleAdmRegistrationIntent(@NotNull Context context, @NotNull Intent intent) {
        return INSTANCE.handleAdmRegistrationIntent(context, intent);
    }

    public static final boolean handlePushNotificationPayload(@NotNull Context context, @NotNull Intent intent) {
        return INSTANCE.handlePushNotificationPayload(context, intent);
    }

    public static final void handleReceivedIntent(@NotNull Context context, @NotNull Intent intent) {
        INSTANCE.handleReceivedIntent(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        Companion.handleReceivedIntent$default(INSTANCE, context, intent, false, 4, null);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0007J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0002\b%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "<init>", "()V", "MESSAGE_TYPE_KEY", "", "DELETED_MESSAGES_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_INTENT_ACTION", "ADM_ERROR_KEY", "ADM_ERROR_DESCRIPTION_KEY", "ADM_REGISTRATION_ID_KEY", "ADM_UNREGISTERED_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "handlePush", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleReceivedIntent", "runOnThread", "", "handleAdmRegistrationEventIfEnabled", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "handleAdmRegistrationIntent", "handlePushNotificationPayload", "createPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "logNotificationMetadata", "payload", "logNotificationMetadata$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$4(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$5() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$6() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$10() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$7(String str, String str2) {
            return s.k("Error during ADM registration: ", str, " description: ", str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$8(String str) {
            return e0.f.k("Registering for ADM messages with registrationId: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$9(String str) {
            return e0.f.k("The device was un-registered from ADM: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, Intent intent) {
            Context applicationContext = context.getApplicationContext();
            String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new bs.b(14, action, intent), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            if (r8.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r8.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        
            if (r8.equals(com.braze.Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
        
            if (r8.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
        
            r1.handlePushNotificationPayload(r9, r10);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void handlePush$performWork(java.lang.String r8, android.content.Context r9, android.content.Intent r10, android.content.Context r11) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$0(Intent intent) {
            return "Received broadcast message. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$1(Intent intent) {
            return "Push action is null. Not handling intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$2() {
            return "Received a message not sent from Braze. Ignoring the message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12(int i11) {
            return r8.k.h(i11, "Firebase messaging 'total_deleted' reports ", " messages.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$13(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$16$lambda$15(String str) {
            return a0.p("Push with identifier '", str, "' has already been seen. Not displaying or forwarding push.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$17() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$18() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$19() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$20() {
            return "Received the initial Push Story notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$21(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$22() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$23(NotificationManagerCompat notificationManagerCompat) {
            return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompat.areNotificationsEnabled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$24() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$26() {
            return "Received silent push notification";
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            companion.handleReceivedIntent(context, intent, z11);
        }

        @NotNull
        public final BrazeNotificationPayload createPayload(@NotNull Context context, @NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull Bundle notificationExtras, @NotNull Bundle brazeExtras) {
            context.getClass();
            appConfigurationProvider.getClass();
            notificationExtras.getClass();
            brazeExtras.getClass();
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        public final boolean handleAdmRegistrationEventIfEnabled(@NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull Context context, @NotNull Intent intent) {
            appConfigurationProvider.getClass();
            context.getClass();
            intent.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new g(2, intent), 6, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new i(29), 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(28), 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        public final boolean handleAdmRegistrationIntent(@NotNull Context context, @NotNull Intent intent) {
            context.getClass();
            intent.getClass();
            String stringExtra = intent.getStringExtra("error");
            String stringExtra2 = intent.getStringExtra(BrazePushReceiver.ADM_ERROR_DESCRIPTION_KEY);
            String stringExtra3 = intent.getStringExtra(BrazePushReceiver.ADM_REGISTRATION_ID_KEY);
            String stringExtra4 = intent.getStringExtra(BrazePushReceiver.ADM_UNREGISTERED_KEY);
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f1(stringExtra, stringExtra2, 7), 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new a(stringExtra3, 20), 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(stringExtra4, 21), 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new j(1), 6, (Object) null);
            return false;
        }

        public final boolean handlePushNotificationPayload(@NotNull Context context, @NotNull Intent intent) {
            Companion companion;
            context.getClass();
            intent.getClass();
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(24), 7, (Object) null);
                return false;
            }
            if (Intrinsics.areEqual(BrazePushReceiver.DELETED_MESSAGES_KEY, intent.getStringExtra(BrazePushReceiver.MESSAGE_TYPE_KEY))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new l(intent.getIntExtra(BrazePushReceiver.NUMBER_OF_MESSAGES_DELETED_KEY, -1), 6), 6, (Object) null);
                return false;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new c(extras, 2), 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle(Constants.BRAZE_PUSH_EXTRAS_KEY, attachedBrazeExtras);
            if (!extras.containsKey(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
                extras.putLong(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS, DateTimeUtils.nowInMilliseconds());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            BrazeNotificationPayload brazeNotificationPayloadCreatePayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (brazeNotificationPayloadCreatePayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new j(5), 6, (Object) null);
                return false;
            }
            String pushUniqueId = brazeNotificationPayloadCreatePayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) BrazePushReceiver.INSTANCE, priority, (Throwable) null, false, (Function0) new a(pushUniqueId, 22), 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(brazeNotificationPayloadCreatePayload);
            if (brazeNotificationPayloadCreatePayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(6), 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(4), 7, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(25), 7, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(brazeNotificationPayloadCreatePayload);
            extras.putInt(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
            if (brazeNotificationPayloadCreatePayload.getIsPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(26), 7, (Object) null);
                    return false;
                }
                if (!extras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(27), 7, (Object) null);
                    extras.putBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                }
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d(brazeNotificationPayloadCreatePayload, 2), 6, (Object) null);
            Notification notificationCreateNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(brazeNotificationPayloadCreatePayload);
            if (notificationCreateNotification == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(0), 7, (Object) null);
                return false;
            }
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
            notificationManagerCompatFrom.getClass();
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h(notificationManagerCompatFrom, 5), 7, (Object) null);
            if (androidx.core.app.e.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                notificationManagerCompatFrom.notify(Constants.BRAZE_PUSH_NOTIFICATION_TAG, notificationId, notificationCreateNotification);
                companion = this;
            } else {
                companion = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(3), 7, (Object) null);
            }
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = brazeNotificationPayloadCreatePayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            companion.logNotificationMetadata$android_sdk_ui_release(context, brazeNotificationPayloadCreatePayload);
            return true;
        }

        public final void handleReceivedIntent(@NotNull Context context, @NotNull Intent intent, boolean runOnThread) {
            context.getClass();
            intent.getClass();
            if (runOnThread) {
                f0.B(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(@NotNull Context context, @NotNull BrazeNotificationPayload payload) {
            String campaignId;
            context.getClass();
            payload.getClass();
            if (payload.getIsPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long flushMinMinutes = payload.getFlushMinMinutes();
                if (flushMinMinutes < 0) {
                    flushMinMinutes = 0;
                }
                long flushMaxMinutes = payload.getFlushMaxMinutes();
                if (flushMaxMinutes < flushMinMinutes) {
                    flushMaxMinutes = flushMinMinutes;
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(flushMinMinutes);
                if (flushMaxMinutes > flushMinMinutes) {
                    l80.d dVar = l80.e.f27503a;
                    long millis2 = timeUnit.toMillis(flushMaxMinutes);
                    dVar.getClass();
                    millis = l80.e.f27504b.f(millis, millis2);
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }

        public final void handleReceivedIntent(@NotNull Context context, @NotNull Intent intent) {
            context.getClass();
            intent.getClass();
            handleReceivedIntent$default(this, context, intent, false, 4, null);
        }
    }

    public static final void handleReceivedIntent(@NotNull Context context, @NotNull Intent intent, boolean z11) {
        INSTANCE.handleReceivedIntent(context, intent, z11);
    }
}
