package zendesk.messaging.android.internal;

import android.content.Context;
import com.braze.models.FeatureFlag;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.internal.ZendeskError;
import zendesk.android.messaging.MessagingScreen;
import zendesk.logger.Logger;
import zendesk.messaging.android.Messaging;
import zendesk.messaging.android.MessagingError;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0016\u0010\u0014\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/StubMessaging;", "Lzendesk/messaging/android/Messaging;", "<init>", "()V", "LOG_TAG", "", "showMessaging", "", "context", "Landroid/content/Context;", "intentFlags", "", "screen", "Lzendesk/android/messaging/MessagingScreen;", "getUnreadMessageCount", "conversationId", "setConversationFields", "fields", "", "", "setConversationTags", "tags", "", "clearConversationFields", "clearConversationTags", "enableAnalyticsTracking", FeatureFlag.ENABLED, "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StubMessaging implements Messaging {

    @NotNull
    public static final StubMessaging INSTANCE = new StubMessaging();

    @NotNull
    private static final String LOG_TAG = "Messaging";

    private StubMessaging() {
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationFields() {
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationTags() {
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void enableAnalyticsTracking(boolean enabled) {
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount(@NotNull String conversationId) {
        conversationId.getClass();
        return 0;
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationFields(@NotNull Map<String, ? extends Object> fields) {
        fields.getClass();
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationTags(@NotNull List<String> tags) {
        tags.getClass();
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen) {
        context.getClass();
        screen.getClass();
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount() {
        return 0;
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, int intentFlags) {
        context.getClass();
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context) {
        context.getClass();
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen, int intentFlags) {
        context.getClass();
        screen.getClass();
        Logger.e(LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), MessagingError.NotInitialized.INSTANCE, new Object[0]);
    }
}
