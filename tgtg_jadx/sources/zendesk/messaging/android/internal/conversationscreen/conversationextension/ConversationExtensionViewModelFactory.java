package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ea.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModelFactory;", "Landroidx/lifecycle/a;", "Lea/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "<init>", "(Lea/f;Landroid/os/Bundle;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;)V", "Landroidx/lifecycle/l1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/c1;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/c1;)Landroidx/lifecycle/l1;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationExtensionViewModelFactory extends androidx.lifecycle.a {

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionViewModelFactory(@NotNull f fVar, @Nullable Bundle bundle, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull MessagingEventDispatcher messagingEventDispatcher) {
        super(fVar, bundle);
        fVar.getClass();
        analyticsProcessor.getClass();
        messagingEventDispatcher.getClass();
        this.analyticsProcessor = analyticsProcessor;
        this.messagingEventDispatcher = messagingEventDispatcher;
    }

    @Override // androidx.lifecycle.a
    @NotNull
    public <T extends l1> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull c1 handle) {
        key.getClass();
        modelClass.getClass();
        handle.getClass();
        return new ConversationExtensionViewModel(handle, null, this.analyticsProcessor, this.messagingEventDispatcher, 2, null);
    }

    public /* synthetic */ ConversationExtensionViewModelFactory(f fVar, Bundle bundle, AnalyticsProcessor analyticsProcessor, MessagingEventDispatcher messagingEventDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? null : bundle, analyticsProcessor, messagingEventDispatcher);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }
}
