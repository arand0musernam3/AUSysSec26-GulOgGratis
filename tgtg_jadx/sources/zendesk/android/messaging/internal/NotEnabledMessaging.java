package zendesk.android.messaging.internal;

import android.content.Context;
import com.braze.models.FeatureFlag;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.Zendesk;
import zendesk.android.internal.ZendeskError;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingScreen;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¨\u0006\u001b"}, d2 = {"Lzendesk/android/messaging/internal/NotEnabledMessaging;", "Lzendesk/android/messaging/Messaging;", "<init>", "()V", "showMessaging", "", "context", "Landroid/content/Context;", "intentFlags", "", "screen", "Lzendesk/android/messaging/MessagingScreen;", "getUnreadMessageCount", "conversationId", "", "setConversationFields", "fields", "", "", "setConversationTags", "tags", "", "clearConversationFields", "clearConversationTags", "enableAnalyticsTracking", FeatureFlag.ENABLED, "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotEnabledMessaging implements Messaging {

    @NotNull
    public static final NotEnabledMessaging INSTANCE = new NotEnabledMessaging();

    private NotEnabledMessaging() {
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationFields() {
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationTags() {
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void enableAnalyticsTracking(boolean enabled) {
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount(@NotNull String conversationId) {
        conversationId.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
        return 0;
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationFields(@NotNull Map<String, ? extends Object> fields) {
        fields.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationTags(@NotNull List<String> tags) {
        tags.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen) {
        context.getClass();
        screen.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount() {
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
        return 0;
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, int intentFlags) {
        context.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context) {
        context.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen, int intentFlags) {
        context.getClass();
        screen.getClass();
        ZendeskError.SdkNotEnabled sdkNotEnabled = ZendeskError.SdkNotEnabled.INSTANCE;
        Logger.e(Zendesk.LOG_TAG, sdkNotEnabled.getMessage(), sdkNotEnabled, new Object[0]);
    }
}
