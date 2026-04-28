package zendesk.android.internal.frontendevents;

import s70.c;
import zendesk.android.internal.di.ZendeskComponentConfig;
import zendesk.android.internal.network.NetworkData;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class FrontendEventsRepository_Factory implements c {
    private final c conversationKitProvider;
    private final c frontendEventsApiProvider;
    private final c frontendEventsStorageProvider;
    private final c localeProvider;
    private final c networkDataProvider;
    private final c zendeskComponentConfigProvider;

    private FrontendEventsRepository_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        this.frontendEventsApiProvider = cVar;
        this.zendeskComponentConfigProvider = cVar2;
        this.frontendEventsStorageProvider = cVar3;
        this.conversationKitProvider = cVar4;
        this.networkDataProvider = cVar5;
        this.localeProvider = cVar6;
    }

    public static FrontendEventsRepository_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        return new FrontendEventsRepository_Factory(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static FrontendEventsRepository newInstance(FrontendEventsApi frontendEventsApi, ZendeskComponentConfig zendeskComponentConfig, FrontendEventsStorage frontendEventsStorage, ConversationKit conversationKit, NetworkData networkData, LocaleProvider localeProvider) {
        return new FrontendEventsRepository(frontendEventsApi, zendeskComponentConfig, frontendEventsStorage, conversationKit, networkData, localeProvider);
    }

    @Override // t70.a
    public FrontendEventsRepository get() {
        return newInstance((FrontendEventsApi) this.frontendEventsApiProvider.get(), (ZendeskComponentConfig) this.zendeskComponentConfigProvider.get(), (FrontendEventsStorage) this.frontendEventsStorageProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (NetworkData) this.networkDataProvider.get(), (LocaleProvider) this.localeProvider.get());
    }
}
