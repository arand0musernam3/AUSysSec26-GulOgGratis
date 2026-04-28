package zendesk.guidekit.android.internal.di.module;

import java.io.File;
import o00.x0;
import q90.d0;
import s70.c;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_ProvidesOkHttpClientFactory implements c {
    private final c cacheDirProvider;
    private final c headerInterceptorProvider;
    private final c loggingInterceptorProvider;
    private final NetworkModule module;

    private NetworkModule_ProvidesOkHttpClientFactory(NetworkModule networkModule, c cVar, c cVar2, c cVar3) {
        this.module = networkModule;
        this.loggingInterceptorProvider = cVar;
        this.headerInterceptorProvider = cVar2;
        this.cacheDirProvider = cVar3;
    }

    public static NetworkModule_ProvidesOkHttpClientFactory create(NetworkModule networkModule, c cVar, c cVar2, c cVar3) {
        return new NetworkModule_ProvidesOkHttpClientFactory(networkModule, cVar, cVar2, cVar3);
    }

    public static d0 providesOkHttpClient(NetworkModule networkModule, ha0.c cVar, HeaderInterceptor headerInterceptor, File file) {
        d0 d0VarProvidesOkHttpClient = networkModule.providesOkHttpClient(cVar, headerInterceptor, file);
        x0.o(d0VarProvidesOkHttpClient);
        return d0VarProvidesOkHttpClient;
    }

    @Override // t70.a
    public d0 get() {
        return providesOkHttpClient(this.module, (ha0.c) this.loggingInterceptorProvider.get(), (HeaderInterceptor) this.headerInterceptorProvider.get(), (File) this.cacheDirProvider.get());
    }
}
