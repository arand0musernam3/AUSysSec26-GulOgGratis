package zendesk.android.internal.proactivemessaging;

import s70.c;
import v80.b0;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessageJwtDecoder;
import zendesk.android.settings.internal.SettingsRepository;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingRepository_Factory implements c {
    private final c coroutineScopeProvider;
    private final c proactiveMessageJwtDecoderProvider;
    private final c proactiveMessagingServiceProvider;
    private final c settingsRepositoryProvider;
    private final c storageProvider;

    private ProactiveMessagingRepository_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.settingsRepositoryProvider = cVar;
        this.storageProvider = cVar2;
        this.proactiveMessageJwtDecoderProvider = cVar3;
        this.proactiveMessagingServiceProvider = cVar4;
        this.coroutineScopeProvider = cVar5;
    }

    public static ProactiveMessagingRepository_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        return new ProactiveMessagingRepository_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static ProactiveMessagingRepository newInstance(SettingsRepository settingsRepository, ProactiveMessagingStorage proactiveMessagingStorage, ProactiveMessageJwtDecoder proactiveMessageJwtDecoder, ProactiveMessagingService proactiveMessagingService, b0 b0Var) {
        return new ProactiveMessagingRepository(settingsRepository, proactiveMessagingStorage, proactiveMessageJwtDecoder, proactiveMessagingService, b0Var);
    }

    @Override // t70.a
    public ProactiveMessagingRepository get() {
        return newInstance((SettingsRepository) this.settingsRepositoryProvider.get(), (ProactiveMessagingStorage) this.storageProvider.get(), (ProactiveMessageJwtDecoder) this.proactiveMessageJwtDecoderProvider.get(), (ProactiveMessagingService) this.proactiveMessagingServiceProvider.get(), (b0) this.coroutineScopeProvider.get());
    }
}
