package zendesk.guidekit.android.internal.di.module;

import o00.x0;
import s70.c;
import zendesk.guidekit.android.model.GuideKitSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class GuideKitModule_ProvidesBaseUrlFactory implements c {
    private final GuideKitModule module;
    private final c settingsProvider;

    private GuideKitModule_ProvidesBaseUrlFactory(GuideKitModule guideKitModule, c cVar) {
        this.module = guideKitModule;
        this.settingsProvider = cVar;
    }

    public static GuideKitModule_ProvidesBaseUrlFactory create(GuideKitModule guideKitModule, c cVar) {
        return new GuideKitModule_ProvidesBaseUrlFactory(guideKitModule, cVar);
    }

    public static String providesBaseUrl(GuideKitModule guideKitModule, GuideKitSettings guideKitSettings) {
        String strProvidesBaseUrl = guideKitModule.providesBaseUrl(guideKitSettings);
        x0.o(strProvidesBaseUrl);
        return strProvidesBaseUrl;
    }

    @Override // t70.a
    public String get() {
        return providesBaseUrl(this.module, (GuideKitSettings) this.settingsProvider.get());
    }
}
