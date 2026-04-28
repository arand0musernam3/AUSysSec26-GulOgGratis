package zendesk.android.internal.proactivemessaging.di;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingModule_ProvidesCampaignTriggerServiceFactory implements c {
    private final ProactiveMessagingModule module;
    private final c retrofitProvider;

    private ProactiveMessagingModule_ProvidesCampaignTriggerServiceFactory(ProactiveMessagingModule proactiveMessagingModule, c cVar) {
        this.module = proactiveMessagingModule;
        this.retrofitProvider = cVar;
    }

    public static ProactiveMessagingModule_ProvidesCampaignTriggerServiceFactory create(ProactiveMessagingModule proactiveMessagingModule, c cVar) {
        return new ProactiveMessagingModule_ProvidesCampaignTriggerServiceFactory(proactiveMessagingModule, cVar);
    }

    public static ProactiveMessagingService providesCampaignTriggerService(ProactiveMessagingModule proactiveMessagingModule, o0 o0Var) {
        ProactiveMessagingService proactiveMessagingServiceProvidesCampaignTriggerService = proactiveMessagingModule.providesCampaignTriggerService(o0Var);
        x0.o(proactiveMessagingServiceProvidesCampaignTriggerService);
        return proactiveMessagingServiceProvidesCampaignTriggerService;
    }

    @Override // t70.a
    public ProactiveMessagingService get() {
        return providesCampaignTriggerService(this.module, (o0) this.retrofitProvider.get());
    }
}
