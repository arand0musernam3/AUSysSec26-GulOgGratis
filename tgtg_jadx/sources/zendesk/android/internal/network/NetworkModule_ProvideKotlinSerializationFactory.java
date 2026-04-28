package zendesk.android.internal.network;

import o00.x0;
import oa0.j;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_ProvideKotlinSerializationFactory implements c {
    private final c jsonProvider;
    private final NetworkModule module;

    private NetworkModule_ProvideKotlinSerializationFactory(NetworkModule networkModule, c cVar) {
        this.module = networkModule;
        this.jsonProvider = cVar;
    }

    public static NetworkModule_ProvideKotlinSerializationFactory create(NetworkModule networkModule, c cVar) {
        return new NetworkModule_ProvideKotlinSerializationFactory(networkModule, cVar);
    }

    public static j provideKotlinSerialization(NetworkModule networkModule, n90.c cVar) {
        j jVarProvideKotlinSerialization = networkModule.provideKotlinSerialization(cVar);
        x0.o(jVarProvideKotlinSerialization);
        return jVarProvideKotlinSerialization;
    }

    @Override // t70.a
    public j get() {
        return provideKotlinSerialization(this.module, (n90.c) this.jsonProvider.get());
    }
}
