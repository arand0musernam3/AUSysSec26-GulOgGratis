package zendesk.analyticskit.android.internal.di;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.analyticskit.android.internal.data.AnalyticsService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvidesAnalyticsServiceFactory implements c {
    private final AnalyticsKitNetworkModule module;
    private final c retrofitProvider;

    private AnalyticsKitNetworkModule_ProvidesAnalyticsServiceFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        this.module = analyticsKitNetworkModule;
        this.retrofitProvider = cVar;
    }

    public static AnalyticsKitNetworkModule_ProvidesAnalyticsServiceFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        return new AnalyticsKitNetworkModule_ProvidesAnalyticsServiceFactory(analyticsKitNetworkModule, cVar);
    }

    public static AnalyticsService providesAnalyticsService(AnalyticsKitNetworkModule analyticsKitNetworkModule, o0 o0Var) {
        AnalyticsService analyticsServiceProvidesAnalyticsService = analyticsKitNetworkModule.providesAnalyticsService(o0Var);
        x0.o(analyticsServiceProvidesAnalyticsService);
        return analyticsServiceProvidesAnalyticsService;
    }

    @Override // t70.a
    public AnalyticsService get() {
        return providesAnalyticsService(this.module, (o0) this.retrofitProvider.get());
    }
}
