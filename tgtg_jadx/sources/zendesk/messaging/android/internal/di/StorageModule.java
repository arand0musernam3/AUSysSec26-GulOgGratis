package zendesk.messaging.android.internal.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorageSerializer;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/di/StorageModule;", "", "<init>", "()V", "providesStorageType", "Lzendesk/storage/android/StorageType;", "messagingStorageSerializer", "Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorageSerializer;", "providesIdentifier", "", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "providesStorage", "Lzendesk/storage/android/Storage;", "context", "Landroid/content/Context;", "storageType", "identifier", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StorageModule {

    @NotNull
    private static final String STORAGE_IDENTIFIER = "STORAGE_IDENTIFIER";

    @MessagingScope
    @Nullable
    public final String providesIdentifier(@NotNull MessagingSettings messagingSettings) {
        messagingSettings.getClass();
        return messagingSettings.getIntegrationId();
    }

    @MessagingScope
    @NotNull
    public final Storage providesStorage(@NotNull Context context, @NotNull StorageType storageType, @Nullable String identifier) {
        context.getClass();
        storageType.getClass();
        return StorageFactory.INSTANCE.create(DefaultMessaging.MESSAGING_NAMESPACE, context, storageType, identifier);
    }

    @MessagingScope
    @NotNull
    public final StorageType providesStorageType(@NotNull MessagingStorageSerializer messagingStorageSerializer) {
        messagingStorageSerializer.getClass();
        return new StorageType.Complex(messagingStorageSerializer);
    }
}
