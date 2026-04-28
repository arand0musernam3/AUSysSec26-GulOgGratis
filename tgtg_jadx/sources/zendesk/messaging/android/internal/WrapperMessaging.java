package zendesk.messaging.android.internal;

import android.content.Context;
import com.braze.models.FeatureFlag;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.Zendesk;
import zendesk.android.messaging.MessagingScreen;
import zendesk.messaging.android.Messaging;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lzendesk/messaging/android/internal/WrapperMessaging;", "Lzendesk/messaging/android/Messaging;", "zendesk", "Lzendesk/android/Zendesk;", "<init>", "(Lzendesk/android/Zendesk;)V", "showMessaging", "", "context", "Landroid/content/Context;", "intentFlags", "", "screen", "Lzendesk/android/messaging/MessagingScreen;", "getUnreadMessageCount", "conversationId", "", "setConversationFields", "fields", "", "", "setConversationTags", "tags", "", "clearConversationFields", "clearConversationTags", "enableAnalyticsTracking", FeatureFlag.ENABLED, "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WrapperMessaging implements Messaging {

    @NotNull
    public final Zendesk zendesk;

    public WrapperMessaging(@NotNull Zendesk zendesk2) {
        zendesk2.getClass();
        this.zendesk = zendesk2;
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationFields() {
        this.zendesk.getMessaging().clearConversationFields();
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationTags() {
        this.zendesk.getMessaging().clearConversationTags();
    }

    @Override // zendesk.android.messaging.Messaging
    public void enableAnalyticsTracking(boolean enabled) {
        this.zendesk.getMessaging().enableAnalyticsTracking(enabled);
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount(@NotNull String conversationId) {
        conversationId.getClass();
        return this.zendesk.getMessaging().getUnreadMessageCount(conversationId);
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationFields(@NotNull Map<String, ? extends Object> fields) {
        fields.getClass();
        this.zendesk.getMessaging().setConversationFields(fields);
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationTags(@NotNull List<String> tags) {
        tags.getClass();
        this.zendesk.getMessaging().setConversationTags(tags);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen) {
        context.getClass();
        screen.getClass();
        this.zendesk.getMessaging().showMessaging(context, screen);
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount() {
        return this.zendesk.getMessaging().getUnreadMessageCount();
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, int intentFlags) {
        context.getClass();
        this.zendesk.getMessaging().showMessaging(context, intentFlags);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context) {
        context.getClass();
        this.zendesk.getMessaging().showMessaging(context);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen, int intentFlags) {
        context.getClass();
        screen.getClass();
        this.zendesk.getMessaging().showMessaging(context, screen, intentFlags);
    }
}
