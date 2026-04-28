package zendesk.android.settings.internal;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsRepository_Factory implements c {
    private final c settingsRestClientProvider;

    private SettingsRepository_Factory(c cVar) {
        this.settingsRestClientProvider = cVar;
    }

    public static SettingsRepository_Factory create(c cVar) {
        return new SettingsRepository_Factory(cVar);
    }

    public static SettingsRepository newInstance(SettingsRestClient settingsRestClient) {
        return new SettingsRepository(settingsRestClient);
    }

    @Override // t70.a
    public SettingsRepository get() {
        return newInstance((SettingsRestClient) this.settingsRestClientProvider.get());
    }
}
