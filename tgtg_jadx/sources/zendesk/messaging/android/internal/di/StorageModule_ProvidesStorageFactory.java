package zendesk.messaging.android.internal.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class StorageModule_ProvidesStorageFactory implements c {
    private final c contextProvider;
    private final c identifierProvider;
    private final StorageModule module;
    private final c storageTypeProvider;

    private StorageModule_ProvidesStorageFactory(StorageModule storageModule, c cVar, c cVar2, c cVar3) {
        this.module = storageModule;
        this.contextProvider = cVar;
        this.storageTypeProvider = cVar2;
        this.identifierProvider = cVar3;
    }

    public static StorageModule_ProvidesStorageFactory create(StorageModule storageModule, c cVar, c cVar2, c cVar3) {
        return new StorageModule_ProvidesStorageFactory(storageModule, cVar, cVar2, cVar3);
    }

    public static Storage providesStorage(StorageModule storageModule, Context context, StorageType storageType, String str) {
        Storage storageProvidesStorage = storageModule.providesStorage(context, storageType, str);
        x0.o(storageProvidesStorage);
        return storageProvidesStorage;
    }

    @Override // t70.a
    public Storage get() {
        return providesStorage(this.module, (Context) this.contextProvider.get(), (StorageType) this.storageTypeProvider.get(), (String) this.identifierProvider.get());
    }
}
