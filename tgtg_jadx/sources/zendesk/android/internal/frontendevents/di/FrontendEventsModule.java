package zendesk.android.internal.frontendevents.di;

import android.content.Context;
import kotlin.Metadata;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.frontendevents.FrontendEventsApi;
import zendesk.android.internal.frontendevents.pageviewevents.DefaultPageViewEvents;
import zendesk.android.internal.frontendevents.pageviewevents.PageViewEvents;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lzendesk/android/internal/frontendevents/di/FrontendEventsModule;", "", "<init>", "()V", "Loa0/o0;", "retrofit", "Lzendesk/android/internal/frontendevents/FrontendEventsApi;", "providesFrontendEventsApi", "(Loa0/o0;)Lzendesk/android/internal/frontendevents/FrontendEventsApi;", "Landroid/content/Context;", "context", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/storage/android/Storage;", "providesFrontendEventsStorage", "(Landroid/content/Context;Lzendesk/android/messaging/model/MessagingSettings;)Lzendesk/storage/android/Storage;", "Companion", "BindsModule", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrontendEventsModule {

    @NotNull
    public static final String FRONTEND_EVENTS_STORAGE = "FRONTEND_EVENTS_STORAGE";

    @NotNull
    private static final String PAGEVIEWS_STORAGE_NAMESPACE = "pageviews";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lzendesk/android/internal/frontendevents/di/FrontendEventsModule$BindsModule;", "", "providesPageViewEvents", "Lzendesk/android/internal/frontendevents/pageviewevents/PageViewEvents;", "defaultPageViewEvents", "Lzendesk/android/internal/frontendevents/pageviewevents/DefaultPageViewEvents;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BindsModule {
        @ZendeskInitializedComponentScope
        @NotNull
        PageViewEvents providesPageViewEvents(@NotNull DefaultPageViewEvents defaultPageViewEvents);
    }

    @ZendeskInitializedComponentScope
    @NotNull
    public final FrontendEventsApi providesFrontendEventsApi(@NotNull o0 retrofit) {
        retrofit.getClass();
        Object objB = retrofit.b(FrontendEventsApi.class);
        objB.getClass();
        return (FrontendEventsApi) objB;
    }

    @ZendeskInitializedComponentScope
    @NotNull
    public final Storage providesFrontendEventsStorage(@NotNull Context context, @NotNull MessagingSettings messagingSettings) {
        context.getClass();
        messagingSettings.getClass();
        return StorageFactory.INSTANCE.create(PAGEVIEWS_STORAGE_NAMESPACE, context, StorageType.Basic.INSTANCE, messagingSettings.getIntegrationId());
    }
}
