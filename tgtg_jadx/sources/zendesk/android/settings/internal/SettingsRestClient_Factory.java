package zendesk.android.settings.internal;

import s70.c;
import zendesk.android.internal.di.ZendeskComponentConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsRestClient_Factory implements c {
    private final c jsonProvider;
    private final c settingsApiProvider;
    private final c zendeskComponentConfigProvider;

    private SettingsRestClient_Factory(c cVar, c cVar2, c cVar3) {
        this.settingsApiProvider = cVar;
        this.jsonProvider = cVar2;
        this.zendeskComponentConfigProvider = cVar3;
    }

    public static SettingsRestClient_Factory create(c cVar, c cVar2, c cVar3) {
        return new SettingsRestClient_Factory(cVar, cVar2, cVar3);
    }

    public static SettingsRestClient newInstance(SettingsApi settingsApi, n90.c cVar, ZendeskComponentConfig zendeskComponentConfig) {
        return new SettingsRestClient(settingsApi, cVar, zendeskComponentConfig);
    }

    @Override // t70.a
    public SettingsRestClient get() {
        return newInstance((SettingsApi) this.settingsApiProvider.get(), (n90.c) this.jsonProvider.get(), (ZendeskComponentConfig) this.zendeskComponentConfigProvider.get());
    }
}
