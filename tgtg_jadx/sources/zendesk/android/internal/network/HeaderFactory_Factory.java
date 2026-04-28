package zendesk.android.internal.network;

import s70.c;
import zendesk.android.internal.di.ZendeskComponentConfig;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderFactory_Factory implements c {
    private final c componentConfigProvider;
    private final c localeProvider;
    private final c networkDataProvider;

    private HeaderFactory_Factory(c cVar, c cVar2, c cVar3) {
        this.componentConfigProvider = cVar;
        this.networkDataProvider = cVar2;
        this.localeProvider = cVar3;
    }

    public static HeaderFactory_Factory create(c cVar, c cVar2, c cVar3) {
        return new HeaderFactory_Factory(cVar, cVar2, cVar3);
    }

    public static HeaderFactory newInstance(ZendeskComponentConfig zendeskComponentConfig, NetworkData networkData, LocaleProvider localeProvider) {
        return new HeaderFactory(zendeskComponentConfig, networkData, localeProvider);
    }

    @Override // t70.a
    public HeaderFactory get() {
        return newInstance((ZendeskComponentConfig) this.componentConfigProvider.get(), (NetworkData) this.networkDataProvider.get(), (LocaleProvider) this.localeProvider.get());
    }
}
