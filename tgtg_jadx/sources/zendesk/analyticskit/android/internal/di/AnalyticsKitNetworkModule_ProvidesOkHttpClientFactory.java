package zendesk.analyticskit.android.internal.di;

import java.io.File;
import o00.x0;
import q90.d0;
import s70.c;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvidesOkHttpClientFactory implements c {
    private final c cacheDirProvider;
    private final c headerInterceptorProvider;
    private final c loggingInterceptorProvider;
    private final AnalyticsKitNetworkModule module;

    private AnalyticsKitNetworkModule_ProvidesOkHttpClientFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar, c cVar2, c cVar3) {
        this.module = analyticsKitNetworkModule;
        this.loggingInterceptorProvider = cVar;
        this.headerInterceptorProvider = cVar2;
        this.cacheDirProvider = cVar3;
    }

    public static AnalyticsKitNetworkModule_ProvidesOkHttpClientFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar, c cVar2, c cVar3) {
        return new AnalyticsKitNetworkModule_ProvidesOkHttpClientFactory(analyticsKitNetworkModule, cVar, cVar2, cVar3);
    }

    public static d0 providesOkHttpClient(AnalyticsKitNetworkModule analyticsKitNetworkModule, ha0.c cVar, HeaderInterceptor headerInterceptor, File file) {
        d0 d0VarProvidesOkHttpClient = analyticsKitNetworkModule.providesOkHttpClient(cVar, headerInterceptor, file);
        x0.o(d0VarProvidesOkHttpClient);
        return d0VarProvidesOkHttpClient;
    }

    @Override // t70.a
    public d0 get() {
        return providesOkHttpClient(this.module, (ha0.c) this.loggingInterceptorProvider.get(), (HeaderInterceptor) this.headerInterceptorProvider.get(), (File) this.cacheDirProvider.get());
    }
}
