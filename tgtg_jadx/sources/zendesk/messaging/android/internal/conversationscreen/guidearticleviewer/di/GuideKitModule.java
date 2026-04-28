package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.guidekit.android.GuideKit;
import zendesk.guidekit.android.GuideKitFactory;
import zendesk.guidekit.android.model.GuideKitSettings;
import zendesk.messaging.android.internal.di.MessagingScope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideKitModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "baseUrl", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lv80/b0;", "coroutineScope", "Lzendesk/guidekit/android/GuideKit;", "providesGuideKit", "(Landroid/content/Context;Ljava/lang/String;Lzendesk/android/messaging/model/MessagingSettings;Lv80/b0;)Lzendesk/guidekit/android/GuideKit;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideKitModule {
    @MessagingScope
    @NotNull
    public final GuideKit providesGuideKit(@NotNull Context context, @NotNull String baseUrl, @NotNull MessagingSettings messagingSettings, @NotNull b0 coroutineScope) {
        context.getClass();
        baseUrl.getClass();
        messagingSettings.getClass();
        coroutineScope.getClass();
        return GuideKitFactory.INSTANCE.create(new GuideKitSettings(baseUrl, messagingSettings.getIdentifier()), context, coroutineScope);
    }
}
