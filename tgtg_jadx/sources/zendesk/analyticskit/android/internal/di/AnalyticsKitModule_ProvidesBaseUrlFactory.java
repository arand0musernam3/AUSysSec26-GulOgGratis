package zendesk.analyticskit.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.analyticskit.android.model.AnalyticsSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitModule_ProvidesBaseUrlFactory implements c {
    private final AnalyticsKitModule module;
    private final c settingsProvider;

    private AnalyticsKitModule_ProvidesBaseUrlFactory(AnalyticsKitModule analyticsKitModule, c cVar) {
        this.module = analyticsKitModule;
        this.settingsProvider = cVar;
    }

    public static AnalyticsKitModule_ProvidesBaseUrlFactory create(AnalyticsKitModule analyticsKitModule, c cVar) {
        return new AnalyticsKitModule_ProvidesBaseUrlFactory(analyticsKitModule, cVar);
    }

    public static String providesBaseUrl(AnalyticsKitModule analyticsKitModule, AnalyticsSettings analyticsSettings) {
        String strProvidesBaseUrl = analyticsKitModule.providesBaseUrl(analyticsSettings);
        x0.o(strProvidesBaseUrl);
        return strProvidesBaseUrl;
    }

    @Override // t70.a
    public String get() {
        return providesBaseUrl(this.module, (AnalyticsSettings) this.settingsProvider.get());
    }
}
