package zendesk.messaging.android.internal.conversationslistscreen.di;

import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageSerializer;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListLocalStorageModule_ProvidesConversationsListStorageTypeFactory implements c {
    private final c conversationsListLocalStorageSerializerProvider;
    private final ConversationsListLocalStorageModule module;

    private ConversationsListLocalStorageModule_ProvidesConversationsListStorageTypeFactory(ConversationsListLocalStorageModule conversationsListLocalStorageModule, c cVar) {
        this.module = conversationsListLocalStorageModule;
        this.conversationsListLocalStorageSerializerProvider = cVar;
    }

    public static ConversationsListLocalStorageModule_ProvidesConversationsListStorageTypeFactory create(ConversationsListLocalStorageModule conversationsListLocalStorageModule, c cVar) {
        return new ConversationsListLocalStorageModule_ProvidesConversationsListStorageTypeFactory(conversationsListLocalStorageModule, cVar);
    }

    public static StorageType providesConversationsListStorageType(ConversationsListLocalStorageModule conversationsListLocalStorageModule, ConversationsListLocalStorageSerializer conversationsListLocalStorageSerializer) {
        StorageType storageTypeProvidesConversationsListStorageType = conversationsListLocalStorageModule.providesConversationsListStorageType(conversationsListLocalStorageSerializer);
        x0.o(storageTypeProvidesConversationsListStorageType);
        return storageTypeProvidesConversationsListStorageType;
    }

    @Override // t70.a
    public StorageType get() {
        return providesConversationsListStorageType(this.module, (ConversationsListLocalStorageSerializer) this.conversationsListLocalStorageSerializerProvider.get());
    }
}
