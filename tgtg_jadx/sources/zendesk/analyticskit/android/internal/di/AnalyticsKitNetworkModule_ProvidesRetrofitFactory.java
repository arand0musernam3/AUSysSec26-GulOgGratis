package zendesk.analyticskit.android.internal.di;

import o00.x0;
import oa0.j;
import oa0.o0;
import q90.d0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvidesRetrofitFactory implements c {
    private final c baseUrlProvider;
    private final c converterFactoryProvider;
    private final AnalyticsKitNetworkModule module;
    private final c okHttpClientProvider;

    private AnalyticsKitNetworkModule_ProvidesRetrofitFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar, c cVar2, c cVar3) {
        this.module = analyticsKitNetworkModule;
        this.baseUrlProvider = cVar;
        this.okHttpClientProvider = cVar2;
        this.converterFactoryProvider = cVar3;
    }

    public static AnalyticsKitNetworkModule_ProvidesRetrofitFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar, c cVar2, c cVar3) {
        return new AnalyticsKitNetworkModule_ProvidesRetrofitFactory(analyticsKitNetworkModule, cVar, cVar2, cVar3);
    }

    public static o0 providesRetrofit(AnalyticsKitNetworkModule analyticsKitNetworkModule, String str, d0 d0Var, j jVar) {
        o0 o0VarProvidesRetrofit = analyticsKitNetworkModule.providesRetrofit(str, d0Var, jVar);
        x0.o(o0VarProvidesRetrofit);
        return o0VarProvidesRetrofit;
    }

    @Override // t70.a
    public o0 get() {
        return providesRetrofit(this.module, (String) this.baseUrlProvider.get(), (d0) this.okHttpClientProvider.get(), (j) this.converterFactoryProvider.get());
    }
}
