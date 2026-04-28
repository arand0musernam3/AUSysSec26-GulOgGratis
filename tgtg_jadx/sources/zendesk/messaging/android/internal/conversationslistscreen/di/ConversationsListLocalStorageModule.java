package zendesk.messaging.android.internal.conversationslistscreen.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOImpl;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOKt;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageSerializer;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/di/ConversationsListLocalStorageModule;", "", "<init>", "()V", "providesConversationsListStorageType", "Lzendesk/storage/android/StorageType;", "conversationsListLocalStorageSerializer", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageSerializer;", "providesConversationsListStorage", "Lzendesk/storage/android/Storage;", "context", "Landroid/content/Context;", "storageType", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "BindsModule", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListLocalStorageModule {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/di/ConversationsListLocalStorageModule$BindsModule;", "", "providesConversationsListLocalStorage", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;", "conversationsListLocalStorageIOImpl", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BindsModule {
        @ConversationListActivityScope
        @NotNull
        ConversationsListLocalStorageIO providesConversationsListLocalStorage(@NotNull ConversationsListLocalStorageIOImpl conversationsListLocalStorageIOImpl);
    }

    @ConversationListActivityScope
    @NotNull
    public final Storage providesConversationsListStorage(@NotNull Context context, @NotNull StorageType storageType, @NotNull MessagingSettings messagingSettings) {
        context.getClass();
        storageType.getClass();
        messagingSettings.getClass();
        return StorageFactory.INSTANCE.create(ConversationsListLocalStorageIOKt.MULTICONVO_NAMESPACE, context, storageType, messagingSettings.getIntegrationId());
    }

    @ConversationListActivityScope
    @NotNull
    public final StorageType providesConversationsListStorageType(@NotNull ConversationsListLocalStorageSerializer conversationsListLocalStorageSerializer) {
        conversationsListLocalStorageSerializer.getClass();
        return new StorageType.Complex(conversationsListLocalStorageSerializer);
    }
}
