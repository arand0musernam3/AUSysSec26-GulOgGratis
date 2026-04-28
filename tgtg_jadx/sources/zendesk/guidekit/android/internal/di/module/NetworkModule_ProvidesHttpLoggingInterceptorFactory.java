package zendesk.guidekit.android.internal.di.module;

import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_ProvidesHttpLoggingInterceptorFactory implements c {
    private final NetworkModule module;

    private NetworkModule_ProvidesHttpLoggingInterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvidesHttpLoggingInterceptorFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvidesHttpLoggingInterceptorFactory(networkModule);
    }

    public static ha0.c providesHttpLoggingInterceptor(NetworkModule networkModule) {
        ha0.c cVarProvidesHttpLoggingInterceptor = networkModule.providesHttpLoggingInterceptor();
        x0.o(cVarProvidesHttpLoggingInterceptor);
        return cVarProvidesHttpLoggingInterceptor;
    }

    @Override // t70.a
    public ha0.c get() {
        return providesHttpLoggingInterceptor(this.module);
    }
}
