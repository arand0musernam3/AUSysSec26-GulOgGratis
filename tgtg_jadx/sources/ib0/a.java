package ib0;

import zendesk.android.internal.ZendeskFactory;
import zendesk.android.internal.di.ZendeskComponent;
import zendesk.android.internal.frontendevents.analyticsevents.ProactiveMessagingAnalyticsManager;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements ConversationKitEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23772b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f23771a = i11;
        this.f23772b = obj;
    }

    @Override // zendesk.conversationkit.android.ConversationKitEventListener
    public final void onEvent(ConversationKitEvent conversationKitEvent) {
        switch (this.f23771a) {
            case 0:
                MessagingEventDispatcher._init_$lambda$0((MessagingEventDispatcher) this.f23772b, conversationKitEvent);
                break;
            case 1:
                ZendeskFactory.initialiseConversationKit$lambda$2((ZendeskComponent) this.f23772b, conversationKitEvent);
                break;
            case 2:
                ProactiveMessagingAnalyticsManager.subscribe$lambda$0((ProactiveMessagingAnalyticsManager) this.f23772b, conversationKitEvent);
                break;
            default:
                WaitTimeBannerService.listener$lambda$0((WaitTimeBannerService) this.f23772b, conversationKitEvent);
                break;
        }
    }
}
