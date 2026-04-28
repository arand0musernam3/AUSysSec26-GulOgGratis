package zendesk.android.internal.frontendevents.analyticsevents;

import ib0.a;
import j4.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.u;
import v80.b0;
import v80.f0;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.frontendevents.FrontendEventsRepository;
import zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsAction;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.model.ProactiveMessageStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzendesk/android/internal/frontendevents/analyticsevents/ProactiveMessagingAnalyticsManager;", "", "Lzendesk/android/internal/frontendevents/FrontendEventsRepository;", "frontendEventsRepository", "Lv80/b0;", "coroutineScope", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "<init>", "(Lzendesk/android/internal/frontendevents/FrontendEventsRepository;Lv80/b0;Lzendesk/conversationkit/android/ConversationKit;)V", "", "subscribe", "()V", "Lzendesk/android/internal/frontendevents/FrontendEventsRepository;", "Lv80/b0;", "Lzendesk/conversationkit/android/ConversationKit;", "", "visitorId", "Ljava/lang/String;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProactiveMessagingAnalyticsManager {

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final FrontendEventsRepository frontendEventsRepository;

    @NotNull
    private final String visitorId;

    public ProactiveMessagingAnalyticsManager(@NotNull FrontendEventsRepository frontendEventsRepository, @NotNull b0 b0Var, @NotNull ConversationKit conversationKit) {
        frontendEventsRepository.getClass();
        b0Var.getClass();
        conversationKit.getClass();
        this.frontendEventsRepository = frontendEventsRepository;
        this.coroutineScope = b0Var;
        this.conversationKit = conversationKit;
        this.visitorId = s.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$0(ProactiveMessagingAnalyticsManager proactiveMessagingAnalyticsManager, ConversationKitEvent conversationKitEvent) {
        u uVar;
        conversationKitEvent.getClass();
        if (conversationKitEvent instanceof ConversationKitEvent.ProactiveMessageStatusChanged) {
            ProactiveMessageStatus status = ((ConversationKitEvent.ProactiveMessageStatusChanged) conversationKitEvent).getStatus();
            if (status instanceof ProactiveMessageStatus.NotificationHasBeenDisplayed) {
                ProactiveMessageStatus.NotificationHasBeenDisplayed notificationHasBeenDisplayed = (ProactiveMessageStatus.NotificationHasBeenDisplayed) status;
                uVar = new u(ProactiveCampaignAnalyticsAction.SENT, notificationHasBeenDisplayed.getProactiveMessage().getCampaignId(), Integer.valueOf(notificationHasBeenDisplayed.getProactiveMessage().getCampaignVersion()));
            } else if (status instanceof ProactiveMessageStatus.ConversationHasBeenRepliedTo) {
                ProactiveMessageStatus.ConversationHasBeenRepliedTo conversationHasBeenRepliedTo = (ProactiveMessageStatus.ConversationHasBeenRepliedTo) status;
                uVar = new u(ProactiveCampaignAnalyticsAction.REPLIED_TO, conversationHasBeenRepliedTo.getProactiveMessage().getCampaignId(), Integer.valueOf(conversationHasBeenRepliedTo.getProactiveMessage().getCampaignVersion()));
            } else if (status instanceof ProactiveMessageStatus.NotificationHasBeenClicked) {
                ProactiveMessageStatus.NotificationHasBeenClicked notificationHasBeenClicked = (ProactiveMessageStatus.NotificationHasBeenClicked) status;
                uVar = new u(ProactiveCampaignAnalyticsAction.OPENED, notificationHasBeenClicked.getProactiveMessage().getCampaignId(), Integer.valueOf(notificationHasBeenClicked.getProactiveMessage().getCampaignVersion()));
            } else {
                uVar = null;
            }
            if (uVar != null) {
                f0.B(proactiveMessagingAnalyticsManager.coroutineScope, null, null, new ProactiveMessagingAnalyticsManager$subscribe$1$1(proactiveMessagingAnalyticsManager, (String) uVar.f40860b, (ProactiveCampaignAnalyticsAction) uVar.f40859a, ((Number) uVar.f40861c).intValue(), null), 3);
            }
        }
    }

    public final void subscribe() {
        this.conversationKit.addEventListener(new a(this, 2));
    }
}
