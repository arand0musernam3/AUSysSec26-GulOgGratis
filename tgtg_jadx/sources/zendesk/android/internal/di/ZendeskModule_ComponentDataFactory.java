package zendesk.android.internal.di;

import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskModule_ComponentDataFactory implements c {
    private final ZendeskModule module;

    private ZendeskModule_ComponentDataFactory(ZendeskModule zendeskModule) {
        this.module = zendeskModule;
    }

    public static ZendeskComponentConfig componentData(ZendeskModule zendeskModule) {
        ZendeskComponentConfig componentConfig = zendeskModule.getComponentConfig();
        x0.o(componentConfig);
        return componentConfig;
    }

    public static ZendeskModule_ComponentDataFactory create(ZendeskModule zendeskModule) {
        return new ZendeskModule_ComponentDataFactory(zendeskModule);
    }

    @Override // t70.a
    public ZendeskComponentConfig get() {
        return componentData(this.module);
    }
}
