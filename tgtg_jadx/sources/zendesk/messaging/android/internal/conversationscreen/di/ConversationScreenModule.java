package zendesk.messaging.android.internal.conversationscreen.di;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.m1;
import ea.f;
import k.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.NewMessagesDividerHandler;
import zendesk.messaging.android.internal.UploadFileResourceProvider;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.ExponentialBackoffFullJitter;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0081\u0001\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/di/ConversationScreenModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lzendesk/messaging/android/internal/UploadFileResourceProvider;", "providesResourceProvider", "(Landroid/content/Context;)Lzendesk/messaging/android/internal/UploadFileResourceProvider;", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;", "messageLogEntryMapper", "Lzendesk/messaging/android/internal/NewMessagesDividerHandler;", "newMessagesDividerHandler", "Lk/h;", "activity", "Lea/f;", "savedStateRegistryOwner", "Landroid/os/Bundle;", "defaultArgs", "Lv80/b0;", "sdkCoroutineScope", "uploadFileResourceProvider", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;", "conversationScreenRepository", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "conversationTitleProvider", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleEventObserver", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;", "providesConversationViewModelFactory", "(Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;Lzendesk/messaging/android/internal/NewMessagesDividerHandler;Lk/h;Lea/f;Landroid/os/Bundle;Lv80/b0;Lzendesk/messaging/android/internal/UploadFileResourceProvider;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;Lzendesk/messaging/android/internal/ConversationTitleProvider;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;", "Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;", "providesImageViewerViewModelFactory", "(Lea/f;Landroid/os/Bundle;)Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationScreenModule {
    @NotNull
    public final ConversationScreenViewModelFactory providesConversationViewModelFactory(@NotNull MessagingSettings messagingSettings, @NotNull MessageLogEntryMapper messageLogEntryMapper, @NotNull NewMessagesDividerHandler newMessagesDividerHandler, @NotNull h activity, @NotNull f savedStateRegistryOwner, @Nullable Bundle defaultArgs, @NotNull b0 sdkCoroutineScope, @NotNull UploadFileResourceProvider uploadFileResourceProvider, @NotNull ConversationScreenRepository conversationScreenRepository, @NotNull ConversationTitleProvider conversationTitleProvider, @NotNull ConversationKit conversationKit, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull ProcessLifecycleEventObserver processLifecycleEventObserver, @NotNull AnalyticsProcessor analyticsProcessor) {
        messagingSettings.getClass();
        messageLogEntryMapper.getClass();
        newMessagesDividerHandler.getClass();
        activity.getClass();
        savedStateRegistryOwner.getClass();
        sdkCoroutineScope.getClass();
        uploadFileResourceProvider.getClass();
        conversationScreenRepository.getClass();
        conversationTitleProvider.getClass();
        conversationKit.getClass();
        messagingEventDispatcher.getClass();
        processLifecycleEventObserver.getClass();
        analyticsProcessor.getClass();
        long millis = conversationKit.getConfig().getRestRetryPolicy().getTimeUnit().toMillis(conversationKit.getConfig().getRestRetryPolicy().getAggressive());
        VisibleScreenTracker visibleScreenTracker = VisibleScreenTracker.INSTANCE;
        return new ConversationScreenViewModelFactory(messagingSettings, messageLogEntryMapper, newMessagesDividerHandler, visibleScreenTracker, sdkCoroutineScope, uploadFileResourceProvider, conversationScreenRepository, new ConversationTypingEvents(processLifecycleEventObserver, m1.c(activity), visibleScreenTracker, sdkCoroutineScope), conversationTitleProvider, new WaitTimeBannerService(conversationKit, sdkCoroutineScope, new ExponentialBackoffFullJitter(millis, ((long) conversationKit.getConfig().getRestRetryPolicy().getMaxRetries()) * millis)), messagingEventDispatcher, analyticsProcessor, savedStateRegistryOwner, defaultArgs);
    }

    @NotNull
    public final ImageViewerViewModelFactory providesImageViewerViewModelFactory(@NotNull f savedStateRegistryOwner, @Nullable Bundle defaultArgs) {
        savedStateRegistryOwner.getClass();
        return new ImageViewerViewModelFactory(savedStateRegistryOwner, defaultArgs);
    }

    @NotNull
    public final UploadFileResourceProvider providesResourceProvider(@NotNull Context context) {
        context.getClass();
        return new UploadFileResourceProvider(context);
    }
}
