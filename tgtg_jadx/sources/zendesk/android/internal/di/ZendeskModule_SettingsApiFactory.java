package zendesk.android.internal.di;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.android.settings.internal.SettingsApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskModule_SettingsApiFactory implements c {
    private final ZendeskModule module;
    private final c retrofitProvider;

    private ZendeskModule_SettingsApiFactory(ZendeskModule zendeskModule, c cVar) {
        this.module = zendeskModule;
        this.retrofitProvider = cVar;
    }

    public static ZendeskModule_SettingsApiFactory create(ZendeskModule zendeskModule, c cVar) {
        return new ZendeskModule_SettingsApiFactory(zendeskModule, cVar);
    }

    public static SettingsApi settingsApi(ZendeskModule zendeskModule, o0 o0Var) {
        SettingsApi settingsApi = zendeskModule.settingsApi(o0Var);
        x0.o(settingsApi);
        return settingsApi;
    }

    @Override // t70.a
    public SettingsApi get() {
        return settingsApi(this.module, (o0) this.retrofitProvider.get());
    }
}
