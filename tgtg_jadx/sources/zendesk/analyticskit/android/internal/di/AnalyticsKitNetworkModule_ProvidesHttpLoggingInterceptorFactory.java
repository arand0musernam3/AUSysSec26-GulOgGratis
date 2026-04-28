package zendesk.analyticskit.android.internal.di;

import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvidesHttpLoggingInterceptorFactory implements c {
    private final AnalyticsKitNetworkModule module;

    private AnalyticsKitNetworkModule_ProvidesHttpLoggingInterceptorFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule) {
        this.module = analyticsKitNetworkModule;
    }

    public static AnalyticsKitNetworkModule_ProvidesHttpLoggingInterceptorFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule) {
        return new AnalyticsKitNetworkModule_ProvidesHttpLoggingInterceptorFactory(analyticsKitNetworkModule);
    }

    public static ha0.c providesHttpLoggingInterceptor(AnalyticsKitNetworkModule analyticsKitNetworkModule) {
        ha0.c cVarProvidesHttpLoggingInterceptor = analyticsKitNetworkModule.providesHttpLoggingInterceptor();
        x0.o(cVarProvidesHttpLoggingInterceptor);
        return cVarProvidesHttpLoggingInterceptor;
    }

    @Override // t70.a
    public ha0.c get() {
        return providesHttpLoggingInterceptor(this.module);
    }
}
