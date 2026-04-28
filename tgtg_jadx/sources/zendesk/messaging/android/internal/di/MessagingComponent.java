package zendesk.messaging.android.internal.di;

import android.content.Context;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.x;
import zendesk.android.ZendeskCredentials;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.di.ConversationExtensionFragmentComponent;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationFragmentComponent;
import zendesk.messaging.android.internal.conversationscreen.di.ImageViewerComponent;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideArticleFragmentComponent;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationListFragmentComponent;
import zendesk.messaging.android.internal.di.MessagingActivityComponent;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.validation.ConversationFieldManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001 J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lzendesk/messaging/android/internal/di/MessagingComponent;", "", "Lzendesk/messaging/android/internal/di/MessagingActivityComponent$Factory;", "messagingActivityComponent", "()Lzendesk/messaging/android/internal/di/MessagingActivityComponent$Factory;", "Lzendesk/messaging/android/internal/conversationscreen/di/ImageViewerComponent$Factory;", "imageViewerActivityComponent", "()Lzendesk/messaging/android/internal/conversationscreen/di/ImageViewerComponent$Factory;", "Lzendesk/messaging/android/internal/conversationscreen/di/ConversationFragmentComponent$Factory;", "conversationFragmentComponent", "()Lzendesk/messaging/android/internal/conversationscreen/di/ConversationFragmentComponent$Factory;", "Lzendesk/messaging/android/internal/conversationslistscreen/di/ConversationListFragmentComponent$Factory;", "conversationListFragmentComponent", "()Lzendesk/messaging/android/internal/conversationslistscreen/di/ConversationListFragmentComponent$Factory;", "Lzendesk/messaging/android/internal/validation/ConversationFieldManager;", "conversationFieldManager", "()Lzendesk/messaging/android/internal/validation/ConversationFieldManager;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleFragmentComponent$Factory;", "guideArticleFragmentComponent", "()Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleFragmentComponent$Factory;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/di/ConversationExtensionFragmentComponent$Factory;", "conversationExtensionFragmentComponent", "()Lzendesk/messaging/android/internal/conversationscreen/conversationextension/di/ConversationExtensionFragmentComponent$Factory;", "Lv80/x;", "mainDispatcher", "()Lv80/x;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "()Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "()Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Factory", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@MessagingScope
public interface MessagingComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J©\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\b\b\u0001\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lzendesk/messaging/android/internal/di/MessagingComponent$Factory;", "", "Landroid/content/Context;", "context", "Lzendesk/android/ZendeskCredentials;", "zendeskCredentials", "", "baseUrl", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lkotlin/Function1;", "Lzendesk/android/events/ZendeskEvent;", "", "dispatchEvent", "Lv80/b0;", "coroutineScope", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_LIGHT_COLORS, MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lkotlin/Function0;", "Ljava/util/Date;", MessagingComponentKt.CURRENT_TIME_PROVIDER, MessagingComponentKt.ID_PROVIDER, "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleEventObserver", "Lzendesk/messaging/android/internal/di/MessagingComponent;", "create", "(Landroid/content/Context;Lzendesk/android/ZendeskCredentials;Ljava/lang/String;Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/conversationkit/android/ConversationKit;Lkotlin/jvm/functions/Function1;Lv80/b0;Lzendesk/android/messaging/model/UserColors;Lzendesk/android/messaging/model/UserColors;Lzendesk/core/android/internal/app/FeatureFlagManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;)Lzendesk/messaging/android/internal/di/MessagingComponent;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MessagingComponent create(@NotNull Context context, @NotNull ZendeskCredentials zendeskCredentials, @NotNull String baseUrl, @NotNull MessagingSettings messagingSettings, @NotNull ConversationKit conversationKit, @NotNull Function1<? super ZendeskEvent, Unit> dispatchEvent, @NotNull b0 coroutineScope, @NotNull UserColors userLightColors, @NotNull UserColors userDarkColors, @NotNull FeatureFlagManager featureFlagManager, @NotNull Function0<? extends Date> currentTimeProvider, @NotNull Function0<String> idProvider, @NotNull ProcessLifecycleEventObserver processLifecycleEventObserver);
    }

    @NotNull
    AnalyticsProcessor analyticsProcessor();

    @NotNull
    ConversationExtensionFragmentComponent.Factory conversationExtensionFragmentComponent();

    @NotNull
    ConversationFieldManager conversationFieldManager();

    @NotNull
    ConversationFragmentComponent.Factory conversationFragmentComponent();

    @NotNull
    ConversationListFragmentComponent.Factory conversationListFragmentComponent();

    @NotNull
    GuideArticleFragmentComponent.Factory guideArticleFragmentComponent();

    @NotNull
    ImageViewerComponent.Factory imageViewerActivityComponent();

    @NotNull
    x mainDispatcher();

    @NotNull
    MessagingActivityComponent.Factory messagingActivityComponent();

    @NotNull
    MessagingEventDispatcher messagingEventDispatcher();
}
