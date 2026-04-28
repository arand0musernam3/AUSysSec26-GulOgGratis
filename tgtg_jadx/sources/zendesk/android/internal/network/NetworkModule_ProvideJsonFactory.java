package zendesk.android.internal.network;

import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_ProvideJsonFactory implements c {
    private final NetworkModule module;

    private NetworkModule_ProvideJsonFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvideJsonFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideJsonFactory(networkModule);
    }

    public static n90.c provideJson(NetworkModule networkModule) {
        n90.c cVarProvideJson = networkModule.provideJson();
        x0.o(cVarProvideJson);
        return cVarProvideJson;
    }

    @Override // t70.a
    public n90.c get() {
        return provideJson(this.module);
    }
}
