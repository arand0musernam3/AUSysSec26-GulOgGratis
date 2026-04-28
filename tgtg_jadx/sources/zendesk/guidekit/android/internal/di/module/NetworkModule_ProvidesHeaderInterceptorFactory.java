package zendesk.guidekit.android.internal.di.module;

import o00.x0;
import s70.c;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_ProvidesHeaderInterceptorFactory implements c {
    private final c localeProvider;
    private final NetworkModule module;

    private NetworkModule_ProvidesHeaderInterceptorFactory(NetworkModule networkModule, c cVar) {
        this.module = networkModule;
        this.localeProvider = cVar;
    }

    public static NetworkModule_ProvidesHeaderInterceptorFactory create(NetworkModule networkModule, c cVar) {
        return new NetworkModule_ProvidesHeaderInterceptorFactory(networkModule, cVar);
    }

    public static HeaderInterceptor providesHeaderInterceptor(NetworkModule networkModule, LocaleProvider localeProvider) {
        HeaderInterceptor headerInterceptorProvidesHeaderInterceptor = networkModule.providesHeaderInterceptor(localeProvider);
        x0.o(headerInterceptorProvidesHeaderInterceptor);
        return headerInterceptorProvidesHeaderInterceptor;
    }

    @Override // t70.a
    public HeaderInterceptor get() {
        return providesHeaderInterceptor(this.module, (LocaleProvider) this.localeProvider.get());
    }
}
