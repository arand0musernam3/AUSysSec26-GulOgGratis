package zendesk.analyticskit.android.internal.di;

import o00.x0;
import oa0.j;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitNetworkModule_ProvideKotlinSerializationFactory implements c {
    private final c jsonProvider;
    private final AnalyticsKitNetworkModule module;

    private AnalyticsKitNetworkModule_ProvideKotlinSerializationFactory(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        this.module = analyticsKitNetworkModule;
        this.jsonProvider = cVar;
    }

    public static AnalyticsKitNetworkModule_ProvideKotlinSerializationFactory create(AnalyticsKitNetworkModule analyticsKitNetworkModule, c cVar) {
        return new AnalyticsKitNetworkModule_ProvideKotlinSerializationFactory(analyticsKitNetworkModule, cVar);
    }

    public static j provideKotlinSerialization(AnalyticsKitNetworkModule analyticsKitNetworkModule, n90.c cVar) {
        j jVarProvideKotlinSerialization = analyticsKitNetworkModule.provideKotlinSerialization(cVar);
        x0.o(jVarProvideKotlinSerialization);
        return jVarProvideKotlinSerialization;
    }

    @Override // t70.a
    public j get() {
        return provideKotlinSerialization(this.module, (n90.c) this.jsonProvider.get());
    }
}
