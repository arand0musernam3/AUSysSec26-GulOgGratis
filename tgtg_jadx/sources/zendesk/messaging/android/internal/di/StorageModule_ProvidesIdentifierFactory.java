package zendesk.messaging.android.internal.di;

import s70.c;
import zendesk.android.messaging.model.MessagingSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class StorageModule_ProvidesIdentifierFactory implements c {
    private final c messagingSettingsProvider;
    private final StorageModule module;

    private StorageModule_ProvidesIdentifierFactory(StorageModule storageModule, c cVar) {
        this.module = storageModule;
        this.messagingSettingsProvider = cVar;
    }

    public static StorageModule_ProvidesIdentifierFactory create(StorageModule storageModule, c cVar) {
        return new StorageModule_ProvidesIdentifierFactory(storageModule, cVar);
    }

    public static String providesIdentifier(StorageModule storageModule, MessagingSettings messagingSettings) {
        return storageModule.providesIdentifier(messagingSettings);
    }

    @Override // t70.a
    public String get() {
        return providesIdentifier(this.module, (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
