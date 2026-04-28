package zendesk.android.internal.network;

import java.io.File;
import o00.x0;
import q90.d0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_OkHttpClientFactory implements c {
    private final c cacheDirProvider;
    private final c headerFactoryProvider;
    private final NetworkModule module;

    private NetworkModule_OkHttpClientFactory(NetworkModule networkModule, c cVar, c cVar2) {
        this.module = networkModule;
        this.headerFactoryProvider = cVar;
        this.cacheDirProvider = cVar2;
    }

    public static NetworkModule_OkHttpClientFactory create(NetworkModule networkModule, c cVar, c cVar2) {
        return new NetworkModule_OkHttpClientFactory(networkModule, cVar, cVar2);
    }

    public static d0 okHttpClient(NetworkModule networkModule, HeaderFactory headerFactory, File file) {
        d0 d0VarOkHttpClient = networkModule.okHttpClient(headerFactory, file);
        x0.o(d0VarOkHttpClient);
        return d0VarOkHttpClient;
    }

    @Override // t70.a
    public d0 get() {
        return okHttpClient(this.module, (HeaderFactory) this.headerFactoryProvider.get(), (File) this.cacheDirProvider.get());
    }
}
