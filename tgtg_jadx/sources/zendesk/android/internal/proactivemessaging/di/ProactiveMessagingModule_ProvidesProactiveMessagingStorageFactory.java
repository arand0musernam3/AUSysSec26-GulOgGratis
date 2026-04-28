package zendesk.android.internal.proactivemessaging.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingModule_ProvidesProactiveMessagingStorageFactory implements c {
    private final c contextProvider;
    private final c messagingSettingsProvider;
    private final ProactiveMessagingModule module;

    private ProactiveMessagingModule_ProvidesProactiveMessagingStorageFactory(ProactiveMessagingModule proactiveMessagingModule, c cVar, c cVar2) {
        this.module = proactiveMessagingModule;
        this.contextProvider = cVar;
        this.messagingSettingsProvider = cVar2;
    }

    public static ProactiveMessagingModule_ProvidesProactiveMessagingStorageFactory create(ProactiveMessagingModule proactiveMessagingModule, c cVar, c cVar2) {
        return new ProactiveMessagingModule_ProvidesProactiveMessagingStorageFactory(proactiveMessagingModule, cVar, cVar2);
    }

    public static Storage providesProactiveMessagingStorage(ProactiveMessagingModule proactiveMessagingModule, Context context, MessagingSettings messagingSettings) {
        Storage storageProvidesProactiveMessagingStorage = proactiveMessagingModule.providesProactiveMessagingStorage(context, messagingSettings);
        x0.o(storageProvidesProactiveMessagingStorage);
        return storageProvidesProactiveMessagingStorage;
    }

    @Override // t70.a
    public Storage get() {
        return providesProactiveMessagingStorage(this.module, (Context) this.contextProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
