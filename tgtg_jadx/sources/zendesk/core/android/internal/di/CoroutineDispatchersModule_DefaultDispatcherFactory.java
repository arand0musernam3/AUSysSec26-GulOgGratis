package zendesk.core.android.internal.di;

import o00.x0;
import s70.c;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineDispatchersModule_DefaultDispatcherFactory implements c {
    private final CoroutineDispatchersModule module;

    private CoroutineDispatchersModule_DefaultDispatcherFactory(CoroutineDispatchersModule coroutineDispatchersModule) {
        this.module = coroutineDispatchersModule;
    }

    public static CoroutineDispatchersModule_DefaultDispatcherFactory create(CoroutineDispatchersModule coroutineDispatchersModule) {
        return new CoroutineDispatchersModule_DefaultDispatcherFactory(coroutineDispatchersModule);
    }

    public static x defaultDispatcher(CoroutineDispatchersModule coroutineDispatchersModule) {
        x xVarDefaultDispatcher = coroutineDispatchersModule.defaultDispatcher();
        x0.o(xVarDefaultDispatcher);
        return xVarDefaultDispatcher;
    }

    @Override // t70.a
    public x get() {
        return defaultDispatcher(this.module);
    }
}
