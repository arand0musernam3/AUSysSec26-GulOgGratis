package zendesk.messaging.android.internal.messagingscreen;

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
import zendesk.messaging.android.internal.MessagingEntryPointHandler;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;", "Landroidx/lifecycle/a;", "Lzendesk/messaging/android/internal/MessagingEntryPointHandler;", "messagingEntryPointHandler", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lea/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lzendesk/messaging/android/internal/MessagingEntryPointHandler;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lea/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/l1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/c1;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/c1;)Landroidx/lifecycle/l1;", "Lzendesk/messaging/android/internal/MessagingEntryPointHandler;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingScreenViewModelFactory extends androidx.lifecycle.a {

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final MessagingEntryPointHandler messagingEntryPointHandler;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagingScreenViewModelFactory(@NotNull MessagingEntryPointHandler messagingEntryPointHandler, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull f fVar, @Nullable Bundle bundle) {
        super(fVar, bundle);
        messagingEntryPointHandler.getClass();
        analyticsProcessor.getClass();
        messagingEventDispatcher.getClass();
        fVar.getClass();
        this.messagingEntryPointHandler = messagingEntryPointHandler;
        this.analyticsProcessor = analyticsProcessor;
        this.messagingEventDispatcher = messagingEventDispatcher;
    }

    @Override // androidx.lifecycle.a
    @NotNull
    public <T extends l1> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull c1 handle) {
        key.getClass();
        modelClass.getClass();
        handle.getClass();
        return new MessagingScreenViewModel(this.messagingEntryPointHandler, null, handle, this.analyticsProcessor, this.messagingEventDispatcher, 2, null);
    }

    public /* synthetic */ MessagingScreenViewModelFactory(MessagingEntryPointHandler messagingEntryPointHandler, AnalyticsProcessor analyticsProcessor, MessagingEventDispatcher messagingEventDispatcher, f fVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagingEntryPointHandler, analyticsProcessor, messagingEventDispatcher, fVar, (i11 & 16) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }
}
