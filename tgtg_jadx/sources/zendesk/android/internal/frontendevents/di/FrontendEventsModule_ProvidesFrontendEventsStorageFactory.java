package zendesk.android.internal.frontendevents.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class FrontendEventsModule_ProvidesFrontendEventsStorageFactory implements c {
    private final c contextProvider;
    private final c messagingSettingsProvider;
    private final FrontendEventsModule module;

    private FrontendEventsModule_ProvidesFrontendEventsStorageFactory(FrontendEventsModule frontendEventsModule, c cVar, c cVar2) {
        this.module = frontendEventsModule;
        this.contextProvider = cVar;
        this.messagingSettingsProvider = cVar2;
    }

    public static FrontendEventsModule_ProvidesFrontendEventsStorageFactory create(FrontendEventsModule frontendEventsModule, c cVar, c cVar2) {
        return new FrontendEventsModule_ProvidesFrontendEventsStorageFactory(frontendEventsModule, cVar, cVar2);
    }

    public static Storage providesFrontendEventsStorage(FrontendEventsModule frontendEventsModule, Context context, MessagingSettings messagingSettings) {
        Storage storageProvidesFrontendEventsStorage = frontendEventsModule.providesFrontendEventsStorage(context, messagingSettings);
        x0.o(storageProvidesFrontendEventsStorage);
        return storageProvidesFrontendEventsStorage;
    }

    @Override // t70.a
    public Storage get() {
        return providesFrontendEventsStorage(this.module, (Context) this.contextProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
