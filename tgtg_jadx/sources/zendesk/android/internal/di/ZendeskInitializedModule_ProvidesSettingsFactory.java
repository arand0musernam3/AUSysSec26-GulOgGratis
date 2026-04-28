package zendesk.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.android.messaging.model.MessagingSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskInitializedModule_ProvidesSettingsFactory implements c {
    private final ZendeskInitializedModule module;

    private ZendeskInitializedModule_ProvidesSettingsFactory(ZendeskInitializedModule zendeskInitializedModule) {
        this.module = zendeskInitializedModule;
    }

    public static ZendeskInitializedModule_ProvidesSettingsFactory create(ZendeskInitializedModule zendeskInitializedModule) {
        return new ZendeskInitializedModule_ProvidesSettingsFactory(zendeskInitializedModule);
    }

    public static MessagingSettings providesSettings(ZendeskInitializedModule zendeskInitializedModule) {
        MessagingSettings settings = zendeskInitializedModule.getSettings();
        x0.o(settings);
        return settings;
    }

    @Override // t70.a
    public MessagingSettings get() {
        return providesSettings(this.module);
    }
}
