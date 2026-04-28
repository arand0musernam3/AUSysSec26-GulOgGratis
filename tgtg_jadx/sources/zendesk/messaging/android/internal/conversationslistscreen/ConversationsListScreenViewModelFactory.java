package zendesk.messaging.android.internal.conversationslistscreen;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.viewmodel.CreationExtras;
import k.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006$"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModelFactory;", "Landroidx/lifecycle/a;", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;", "repository", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "visibleScreenTracker", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lk/h;", "activity", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;Lzendesk/messaging/android/internal/VisibleScreenTracker;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lk/h;Landroid/os/Bundle;)V", "Landroidx/lifecycle/l1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/c1;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/c1;)Landroidx/lifecycle/l1;", "Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListScreenViewModelFactory extends androidx.lifecycle.a {

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @NotNull
    private final MessagingSettings messagingSettings;

    @NotNull
    private final ConversationsListRepository repository;

    @NotNull
    private final VisibleScreenTracker visibleScreenTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListScreenViewModelFactory(@NotNull MessagingSettings messagingSettings, @NotNull ConversationKit conversationKit, @NotNull ConversationsListRepository conversationsListRepository, @NotNull VisibleScreenTracker visibleScreenTracker, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull h hVar, @Nullable Bundle bundle) {
        super(hVar, bundle);
        messagingSettings.getClass();
        conversationKit.getClass();
        conversationsListRepository.getClass();
        visibleScreenTracker.getClass();
        messagingEventDispatcher.getClass();
        analyticsProcessor.getClass();
        hVar.getClass();
        this.messagingSettings = messagingSettings;
        this.conversationKit = conversationKit;
        this.repository = conversationsListRepository;
        this.visibleScreenTracker = visibleScreenTracker;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.analyticsProcessor = analyticsProcessor;
    }

    @Override // androidx.lifecycle.a
    @NotNull
    public <T extends l1> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull c1 handle) {
        key.getClass();
        modelClass.getClass();
        handle.getClass();
        return new ConversationsListScreenViewModel(this.messagingSettings, this.conversationKit, this.repository, this.visibleScreenTracker, this.messagingEventDispatcher, this.analyticsProcessor);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }

    public /* synthetic */ ConversationsListScreenViewModelFactory(MessagingSettings messagingSettings, ConversationKit conversationKit, ConversationsListRepository conversationsListRepository, VisibleScreenTracker visibleScreenTracker, MessagingEventDispatcher messagingEventDispatcher, AnalyticsProcessor analyticsProcessor, h hVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagingSettings, conversationKit, conversationsListRepository, visibleScreenTracker, messagingEventDispatcher, analyticsProcessor, hVar, (i11 & 128) != 0 ? null : bundle);
    }
}
