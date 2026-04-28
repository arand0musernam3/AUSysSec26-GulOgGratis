package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di;

import android.os.Bundle;
import ea.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.guidekit.android.GuideKit;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModelFactory;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleViewerModule;", "", "<init>", "()V", "Lzendesk/guidekit/android/GuideKit;", "guideKit", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lea/f;", "savedStateRegistryOwner", "Landroid/os/Bundle;", "defaultArgs", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModelFactory;", "providesGuideArticleViewerViewModelFactory", "(Lzendesk/guidekit/android/GuideKit;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lea/f;Landroid/os/Bundle;)Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModelFactory;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideArticleViewerModule {
    @NotNull
    public final GuideArticleViewerViewModelFactory providesGuideArticleViewerViewModelFactory(@NotNull GuideKit guideKit, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull f savedStateRegistryOwner, @Nullable Bundle defaultArgs) {
        guideKit.getClass();
        messagingEventDispatcher.getClass();
        savedStateRegistryOwner.getClass();
        return new GuideArticleViewerViewModelFactory(guideKit, messagingEventDispatcher, savedStateRegistryOwner, defaultArgs);
    }
}
