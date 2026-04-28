package zendesk.android.internal.proactivemessaging.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import wt.a;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingService;
import zendesk.android.internal.storage.ZendeskStorageSerializer;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzendesk/android/internal/proactivemessaging/di/ProactiveMessagingModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/storage/android/Storage;", "providesProactiveMessagingStorage", "(Landroid/content/Context;Lzendesk/android/messaging/model/MessagingSettings;)Lzendesk/storage/android/Storage;", "Loa0/o0;", "retrofit", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingService;", "providesCampaignTriggerService", "(Loa0/o0;)Lzendesk/android/internal/proactivemessaging/ProactiveMessagingService;", "Lkotlin/Function0;", "", "providesCurrentTimeProvider", "()Lkotlin/jvm/functions/Function0;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProactiveMessagingModule {

    @NotNull
    public static final String CURRENT_TIME_PROVIDER = "CURRENT_TIME_PROVIDER";

    @NotNull
    public static final String PROACTIVE_MESSAGING_STORAGE = "PROACTIVE_MESSAGING_STORAGE";

    @NotNull
    private static final String proactiveMessagingStorageNamespace = "zendesk.android.internal.proactivemessaging";

    @ZendeskInitializedComponentScope
    @NotNull
    public final ProactiveMessagingService providesCampaignTriggerService(@NotNull o0 retrofit) {
        retrofit.getClass();
        Object objB = retrofit.b(ProactiveMessagingService.class);
        objB.getClass();
        return (ProactiveMessagingService) objB;
    }

    @ZendeskInitializedComponentScope
    @NotNull
    public final Function0<Long> providesCurrentTimeProvider() {
        return new a(28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ZendeskInitializedComponentScope
    @NotNull
    public final Storage providesProactiveMessagingStorage(@NotNull Context context, @NotNull MessagingSettings messagingSettings) {
        context.getClass();
        messagingSettings.getClass();
        return StorageFactory.INSTANCE.create(proactiveMessagingStorageNamespace, context, new StorageType.Complex(new ZendeskStorageSerializer(null, 1, 0 == true ? 1 : 0)), messagingSettings.getIntegrationId());
    }
}
