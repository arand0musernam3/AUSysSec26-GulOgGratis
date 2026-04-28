package zendesk.messaging.android.internal.conversationscreen;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.NewMessagesDividerHandler;
import zendesk.messaging.android.internal.UploadFileResourceProvider;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010!*\u00020 2\u0006\u0010#\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105¨\u00066"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModelFactory;", "Landroidx/lifecycle/a;", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;", "messageLogEntryMapper", "Lzendesk/messaging/android/internal/NewMessagesDividerHandler;", "newMessagesDividerHandler", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "visibleScreenTracker", "Lv80/b0;", "sdkCoroutineScope", "Lzendesk/messaging/android/internal/UploadFileResourceProvider;", "uploadFileResourceProvider", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;", "conversationScreenRepository", "Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;", "typingEvents", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "conversationTitleProvider", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;", "waitTimeBannerService", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lea/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;Lzendesk/messaging/android/internal/NewMessagesDividerHandler;Lzendesk/messaging/android/internal/VisibleScreenTracker;Lv80/b0;Lzendesk/messaging/android/internal/UploadFileResourceProvider;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;Lzendesk/messaging/android/internal/ConversationTitleProvider;Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lea/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/l1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/c1;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/c1;)Landroidx/lifecycle/l1;", "Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;", "Lzendesk/messaging/android/internal/NewMessagesDividerHandler;", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "Lv80/b0;", "Lzendesk/messaging/android/internal/UploadFileResourceProvider;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationScreenViewModelFactory extends androidx.lifecycle.a {

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final ConversationScreenRepository conversationScreenRepository;

    @NotNull
    private final ConversationTitleProvider conversationTitleProvider;

    @NotNull
    private final MessageLogEntryMapper messageLogEntryMapper;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @NotNull
    private final MessagingSettings messagingSettings;

    @NotNull
    private final NewMessagesDividerHandler newMessagesDividerHandler;

    @NotNull
    private final b0 sdkCoroutineScope;

    @NotNull
    private final ConversationTypingEvents typingEvents;

    @NotNull
    private final UploadFileResourceProvider uploadFileResourceProvider;

    @NotNull
    private final VisibleScreenTracker visibleScreenTracker;

    @NotNull
    private final WaitTimeBannerService waitTimeBannerService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenViewModelFactory(@NotNull MessagingSettings messagingSettings, @NotNull MessageLogEntryMapper messageLogEntryMapper, @NotNull NewMessagesDividerHandler newMessagesDividerHandler, @NotNull VisibleScreenTracker visibleScreenTracker, @NotNull b0 b0Var, @NotNull UploadFileResourceProvider uploadFileResourceProvider, @NotNull ConversationScreenRepository conversationScreenRepository, @NotNull ConversationTypingEvents conversationTypingEvents, @NotNull ConversationTitleProvider conversationTitleProvider, @NotNull WaitTimeBannerService waitTimeBannerService, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull ea.f fVar, @Nullable Bundle bundle) {
        super(fVar, bundle);
        messagingSettings.getClass();
        messageLogEntryMapper.getClass();
        newMessagesDividerHandler.getClass();
        visibleScreenTracker.getClass();
        b0Var.getClass();
        uploadFileResourceProvider.getClass();
        conversationScreenRepository.getClass();
        conversationTypingEvents.getClass();
        conversationTitleProvider.getClass();
        waitTimeBannerService.getClass();
        messagingEventDispatcher.getClass();
        analyticsProcessor.getClass();
        fVar.getClass();
        this.messagingSettings = messagingSettings;
        this.messageLogEntryMapper = messageLogEntryMapper;
        this.newMessagesDividerHandler = newMessagesDividerHandler;
        this.visibleScreenTracker = visibleScreenTracker;
        this.sdkCoroutineScope = b0Var;
        this.uploadFileResourceProvider = uploadFileResourceProvider;
        this.conversationScreenRepository = conversationScreenRepository;
        this.typingEvents = conversationTypingEvents;
        this.conversationTitleProvider = conversationTitleProvider;
        this.waitTimeBannerService = waitTimeBannerService;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.analyticsProcessor = analyticsProcessor;
    }

    @Override // androidx.lifecycle.a
    @NotNull
    public <T extends l1> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull c1 handle) {
        key.getClass();
        modelClass.getClass();
        handle.getClass();
        return new ConversationScreenViewModel(this.messagingSettings, this.messageLogEntryMapper, this.newMessagesDividerHandler, handle, this.visibleScreenTracker, this.sdkCoroutineScope, this.uploadFileResourceProvider, this.conversationScreenRepository, this.typingEvents, this.conversationTitleProvider, this.waitTimeBannerService, this.messagingEventDispatcher, this.analyticsProcessor);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }

    public /* synthetic */ ConversationScreenViewModelFactory(MessagingSettings messagingSettings, MessageLogEntryMapper messageLogEntryMapper, NewMessagesDividerHandler newMessagesDividerHandler, VisibleScreenTracker visibleScreenTracker, b0 b0Var, UploadFileResourceProvider uploadFileResourceProvider, ConversationScreenRepository conversationScreenRepository, ConversationTypingEvents conversationTypingEvents, ConversationTitleProvider conversationTitleProvider, WaitTimeBannerService waitTimeBannerService, MessagingEventDispatcher messagingEventDispatcher, AnalyticsProcessor analyticsProcessor, ea.f fVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagingSettings, messageLogEntryMapper, newMessagesDividerHandler, visibleScreenTracker, b0Var, uploadFileResourceProvider, conversationScreenRepository, conversationTypingEvents, conversationTitleProvider, waitTimeBannerService, messagingEventDispatcher, analyticsProcessor, fVar, (i11 & 8192) != 0 ? null : bundle);
    }
}
