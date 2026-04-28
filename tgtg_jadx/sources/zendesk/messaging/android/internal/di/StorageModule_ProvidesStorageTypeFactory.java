package zendesk.messaging.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorageSerializer;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class StorageModule_ProvidesStorageTypeFactory implements c {
    private final c messagingStorageSerializerProvider;
    private final StorageModule module;

    private StorageModule_ProvidesStorageTypeFactory(StorageModule storageModule, c cVar) {
        this.module = storageModule;
        this.messagingStorageSerializerProvider = cVar;
    }

    public static StorageModule_ProvidesStorageTypeFactory create(StorageModule storageModule, c cVar) {
        return new StorageModule_ProvidesStorageTypeFactory(storageModule, cVar);
    }

    public static StorageType providesStorageType(StorageModule storageModule, MessagingStorageSerializer messagingStorageSerializer) {
        StorageType storageTypeProvidesStorageType = storageModule.providesStorageType(messagingStorageSerializer);
        x0.o(storageTypeProvidesStorageType);
        return storageTypeProvidesStorageType;
    }

    @Override // t70.a
    public StorageType get() {
        return providesStorageType(this.module, (MessagingStorageSerializer) this.messagingStorageSerializerProvider.get());
    }
}
