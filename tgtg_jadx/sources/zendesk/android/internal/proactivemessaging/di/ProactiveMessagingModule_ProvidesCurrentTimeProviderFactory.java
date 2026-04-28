package zendesk.android.internal.proactivemessaging.di;

import kotlin.jvm.functions.Function0;
import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingModule_ProvidesCurrentTimeProviderFactory implements c {
    private final ProactiveMessagingModule module;

    private ProactiveMessagingModule_ProvidesCurrentTimeProviderFactory(ProactiveMessagingModule proactiveMessagingModule) {
        this.module = proactiveMessagingModule;
    }

    public static ProactiveMessagingModule_ProvidesCurrentTimeProviderFactory create(ProactiveMessagingModule proactiveMessagingModule) {
        return new ProactiveMessagingModule_ProvidesCurrentTimeProviderFactory(proactiveMessagingModule);
    }

    public static Function0<Long> providesCurrentTimeProvider(ProactiveMessagingModule proactiveMessagingModule) {
        Function0<Long> function0ProvidesCurrentTimeProvider = proactiveMessagingModule.providesCurrentTimeProvider();
        x0.o(function0ProvidesCurrentTimeProvider);
        return function0ProvidesCurrentTimeProvider;
    }

    @Override // t70.a
    public Function0<Long> get() {
        return providesCurrentTimeProvider(this.module);
    }
}
