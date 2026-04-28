package zendesk.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskModule_ProvideProcessLifecycleEventObserverFactory implements c {
    private final ZendeskModule module;

    private ZendeskModule_ProvideProcessLifecycleEventObserverFactory(ZendeskModule zendeskModule) {
        this.module = zendeskModule;
    }

    public static ZendeskModule_ProvideProcessLifecycleEventObserverFactory create(ZendeskModule zendeskModule) {
        return new ZendeskModule_ProvideProcessLifecycleEventObserverFactory(zendeskModule);
    }

    public static ProcessLifecycleEventObserver provideProcessLifecycleEventObserver(ZendeskModule zendeskModule) {
        ProcessLifecycleEventObserver processLifecycleEventObserverProvideProcessLifecycleEventObserver = zendeskModule.provideProcessLifecycleEventObserver();
        x0.o(processLifecycleEventObserverProvideProcessLifecycleEventObserver);
        return processLifecycleEventObserverProvideProcessLifecycleEventObserver;
    }

    @Override // t70.a
    public ProcessLifecycleEventObserver get() {
        return provideProcessLifecycleEventObserver(this.module);
    }
}
