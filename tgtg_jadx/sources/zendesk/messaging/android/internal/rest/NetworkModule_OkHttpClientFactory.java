package zendesk.messaging.android.internal.rest;

import o00.x0;
import q90.d0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkModule_OkHttpClientFactory implements c {
    private final c headerFactoryProvider;
    private final NetworkModule module;

    private NetworkModule_OkHttpClientFactory(NetworkModule networkModule, c cVar) {
        this.module = networkModule;
        this.headerFactoryProvider = cVar;
    }

    public static NetworkModule_OkHttpClientFactory create(NetworkModule networkModule, c cVar) {
        return new NetworkModule_OkHttpClientFactory(networkModule, cVar);
    }

    public static d0 okHttpClient(NetworkModule networkModule, HeaderFactory headerFactory) {
        d0 d0VarOkHttpClient = networkModule.okHttpClient(headerFactory);
        x0.o(d0VarOkHttpClient);
        return d0VarOkHttpClient;
    }

    @Override // t70.a
    public d0 get() {
        return okHttpClient(this.module, (HeaderFactory) this.headerFactoryProvider.get());
    }
}
