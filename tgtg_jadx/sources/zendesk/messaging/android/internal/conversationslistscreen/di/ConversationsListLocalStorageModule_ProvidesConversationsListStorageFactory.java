package zendesk.messaging.android.internal.conversationslistscreen.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListLocalStorageModule_ProvidesConversationsListStorageFactory implements c {
    private final c contextProvider;
    private final c messagingSettingsProvider;
    private final ConversationsListLocalStorageModule module;
    private final c storageTypeProvider;

    private ConversationsListLocalStorageModule_ProvidesConversationsListStorageFactory(ConversationsListLocalStorageModule conversationsListLocalStorageModule, c cVar, c cVar2, c cVar3) {
        this.module = conversationsListLocalStorageModule;
        this.contextProvider = cVar;
        this.storageTypeProvider = cVar2;
        this.messagingSettingsProvider = cVar3;
    }

    public static ConversationsListLocalStorageModule_ProvidesConversationsListStorageFactory create(ConversationsListLocalStorageModule conversationsListLocalStorageModule, c cVar, c cVar2, c cVar3) {
        return new ConversationsListLocalStorageModule_ProvidesConversationsListStorageFactory(conversationsListLocalStorageModule, cVar, cVar2, cVar3);
    }

    public static Storage providesConversationsListStorage(ConversationsListLocalStorageModule conversationsListLocalStorageModule, Context context, StorageType storageType, MessagingSettings messagingSettings) {
        Storage storageProvidesConversationsListStorage = conversationsListLocalStorageModule.providesConversationsListStorage(context, storageType, messagingSettings);
        x0.o(storageProvidesConversationsListStorage);
        return storageProvidesConversationsListStorage;
    }

    @Override // t70.a
    public Storage get() {
        return providesConversationsListStorage(this.module, (Context) this.contextProvider.get(), (StorageType) this.storageTypeProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
