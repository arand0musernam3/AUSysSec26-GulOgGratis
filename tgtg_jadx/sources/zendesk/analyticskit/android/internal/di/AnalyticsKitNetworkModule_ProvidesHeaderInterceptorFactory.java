package zendesk.analyticskit.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvidesHeaderInterceptorFactory implements c {
    private final c localeProvider;
    private final AnalyticsKitNetworkModule module;

    private AnalyticsKitNetworkModule_ProvidesHeaderInterceptorFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        this.module = analyticsKitNetworkModule;
        this.localeProvider = cVar;
    }

    public static AnalyticsKitNetworkModule_ProvidesHeaderInterceptorFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        return new AnalyticsKitNetworkModule_ProvidesHeaderInterceptorFactory(analyticsKitNetworkModule, cVar);
    }

    public static HeaderInterceptor providesHeaderInterceptor(AnalyticsKitNetworkModule analyticsKitNetworkModule, LocaleProvider localeProvider) {
        HeaderInterceptor headerInterceptorProvidesHeaderInterceptor = analyticsKitNetworkModule.providesHeaderInterceptor(localeProvider);
        x0.o(headerInterceptorProvidesHeaderInterceptor);
        return headerInterceptorProvidesHeaderInterceptor;
    }

    @Override // t70.a
    public HeaderInterceptor get() {
        return providesHeaderInterceptor(this.module, (LocaleProvider) this.localeProvider.get());
    }
}
