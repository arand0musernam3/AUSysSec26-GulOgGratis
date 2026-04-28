package zendesk.android.internal.network;

import o00.x0;
import oa0.j;
import oa0.o0;
import q90.d0;
import s70.c;
import zendesk.android.internal.di.ZendeskComponentConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_RetrofitFactory implements c {
    private final c componentConfigProvider;
    private final c converterFactoryProvider;
    private final NetworkModule module;
    private final c okHttpClientProvider;

    private NetworkModule_RetrofitFactory(NetworkModule networkModule, c cVar, c cVar2, c cVar3) {
        this.module = networkModule;
        this.componentConfigProvider = cVar;
        this.okHttpClientProvider = cVar2;
        this.converterFactoryProvider = cVar3;
    }

    public static NetworkModule_RetrofitFactory create(NetworkModule networkModule, c cVar, c cVar2, c cVar3) {
        return new NetworkModule_RetrofitFactory(networkModule, cVar, cVar2, cVar3);
    }

    public static o0 retrofit(NetworkModule networkModule, ZendeskComponentConfig zendeskComponentConfig, d0 d0Var, j jVar) {
        o0 o0VarRetrofit = networkModule.retrofit(zendeskComponentConfig, d0Var, jVar);
        x0.o(o0VarRetrofit);
        return o0VarRetrofit;
    }

    @Override // t70.a
    public o0 get() {
        return retrofit(this.module, (ZendeskComponentConfig) this.componentConfigProvider.get(), (d0) this.okHttpClientProvider.get(), (j) this.converterFactoryProvider.get());
    }
}
