package zendesk.messaging.android.internal.di;

import android.os.Bundle;
import ea.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.MessagingEntryPointHandler;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModelFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/di/MessagingScreenModule;", "", "<init>", "()V", "Lzendesk/messaging/android/internal/MessagingEntryPointHandler;", "messagingEntryPointHandler", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lea/f;", "savedStateRegistryOwner", "Landroid/os/Bundle;", "defaultArgs", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;", "providesMessagingScreenViewModelFactory", "(Lzendesk/messaging/android/internal/MessagingEntryPointHandler;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lea/f;Landroid/os/Bundle;)Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingScreenModule {
    @NotNull
    public final MessagingScreenViewModelFactory providesMessagingScreenViewModelFactory(@NotNull MessagingEntryPointHandler messagingEntryPointHandler, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull f savedStateRegistryOwner, @Nullable Bundle defaultArgs) {
        messagingEntryPointHandler.getClass();
        analyticsProcessor.getClass();
        messagingEventDispatcher.getClass();
        savedStateRegistryOwner.getClass();
        return new MessagingScreenViewModelFactory(messagingEntryPointHandler, analyticsProcessor, messagingEventDispatcher, savedStateRegistryOwner, defaultArgs);
    }
}
