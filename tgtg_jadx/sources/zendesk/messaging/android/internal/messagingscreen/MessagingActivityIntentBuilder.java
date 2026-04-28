package zendesk.messaging.android.internal.messagingscreen;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.ZendeskCredentials;
import zendesk.android.messaging.MessagingScreen;
import zendesk.messaging.android.internal.IntentDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\rR/\u0010\u0006\u001a\u00020\u0007*\u00020\r2\u0006\u0010\f\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\b\u001a\u00020\t*\u00020\r2\u0006\u0010\f\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingActivityIntentBuilder;", "", "context", "Landroid/content/Context;", "credentials", "Lzendesk/android/ZendeskCredentials;", "conversationId", "", "messagingScreen", "Lzendesk/android/messaging/MessagingScreen;", "<init>", "(Landroid/content/Context;Lzendesk/android/ZendeskCredentials;Ljava/lang/String;Lzendesk/android/messaging/MessagingScreen;)V", "<set-?>", "Landroid/content/Intent;", "getConversationId$zendesk_messaging_messaging_android", "(Landroid/content/Intent;)Ljava/lang/String;", "setConversationId$zendesk_messaging_messaging_android", "(Landroid/content/Intent;Ljava/lang/String;)V", "conversationId$delegate", "Lzendesk/messaging/android/internal/IntentDelegate$String;", "getMessagingScreen$zendesk_messaging_messaging_android", "(Landroid/content/Intent;)Lzendesk/android/messaging/MessagingScreen;", "setMessagingScreen$zendesk_messaging_messaging_android", "(Landroid/content/Intent;Lzendesk/android/messaging/MessagingScreen;)V", "messagingScreen$delegate", "Lzendesk/messaging/android/internal/IntentDelegate$MessagingScreenDelegate;", "intent", "withFlags", "flags", "", "build", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingActivityIntentBuilder {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty2(new MutablePropertyReference2Impl(MessagingActivityIntentBuilder.class, "conversationId", "getConversationId$zendesk_messaging_messaging_android(Landroid/content/Intent;)Ljava/lang/String;", 0)), Reflection.mutableProperty2(new MutablePropertyReference2Impl(MessagingActivityIntentBuilder.class, "messagingScreen", "getMessagingScreen$zendesk_messaging_messaging_android(Landroid/content/Intent;)Lzendesk/android/messaging/MessagingScreen;", 0))};

    /* JADX INFO: renamed from: conversationId$delegate, reason: from kotlin metadata */
    @NotNull
    private final IntentDelegate.String conversationId;

    @NotNull
    private final Intent intent;

    /* JADX INFO: renamed from: messagingScreen$delegate, reason: from kotlin metadata */
    @NotNull
    private final IntentDelegate.MessagingScreenDelegate messagingScreen;

    public MessagingActivityIntentBuilder(@NotNull Context context, @NotNull ZendeskCredentials zendeskCredentials, @Nullable String str, @NotNull MessagingScreen messagingScreen) {
        context.getClass();
        zendeskCredentials.getClass();
        messagingScreen.getClass();
        this.conversationId = new IntentDelegate.String(MessagingActivity.CONVERSATION_ID_KEY);
        this.messagingScreen = new IntentDelegate.MessagingScreenDelegate(MessagingActivity.MESSAGING_SCREEN_KEY, new MessagingScreen.MostRecentActiveConversation((MessagingScreen.ExitAction) null, 1, (DefaultConstructorMarker) null));
        Intent intent = new Intent(context, (Class<?>) MessagingActivity.class);
        this.intent = intent;
        MessagingActivityIntentBuilderKt.setCredentials(intent, ZendeskCredentials.INSTANCE.toQuery(zendeskCredentials));
        if (str != null) {
            setConversationId$zendesk_messaging_messaging_android(intent, str);
        }
        setMessagingScreen$zendesk_messaging_messaging_android(intent, messagingScreen);
    }

    @NotNull
    /* JADX INFO: renamed from: build, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final String getConversationId$zendesk_messaging_messaging_android(@NotNull Intent intent) {
        intent.getClass();
        return this.conversationId.getValue(intent, $$delegatedProperties[0]);
    }

    @NotNull
    public final MessagingScreen getMessagingScreen$zendesk_messaging_messaging_android(@NotNull Intent intent) {
        intent.getClass();
        return this.messagingScreen.getValue(intent, $$delegatedProperties[1]);
    }

    public final void setConversationId$zendesk_messaging_messaging_android(@NotNull Intent intent, @NotNull String str) {
        intent.getClass();
        str.getClass();
        this.conversationId.setValue(intent, $$delegatedProperties[0], str);
    }

    public final void setMessagingScreen$zendesk_messaging_messaging_android(@NotNull Intent intent, @NotNull MessagingScreen messagingScreen) {
        intent.getClass();
        messagingScreen.getClass();
        this.messagingScreen.setValue(intent, $$delegatedProperties[1], messagingScreen);
    }

    @NotNull
    public final MessagingActivityIntentBuilder withFlags(int flags) {
        this.intent.setFlags(flags);
        return this;
    }

    public /* synthetic */ MessagingActivityIntentBuilder(Context context, ZendeskCredentials zendeskCredentials, String str, MessagingScreen messagingScreen, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, zendeskCredentials, (i11 & 4) != 0 ? null : str, messagingScreen);
    }
}
