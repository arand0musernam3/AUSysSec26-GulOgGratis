package zendesk.android.internal.di;

import android.content.Context;
import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskModule_ApplicationContextFactory implements c {
    private final ZendeskModule module;

    private ZendeskModule_ApplicationContextFactory(ZendeskModule zendeskModule) {
        this.module = zendeskModule;
    }

    public static Context applicationContext(ZendeskModule zendeskModule) {
        Context applicationContext = zendeskModule.getApplicationContext();
        x0.o(applicationContext);
        return applicationContext;
    }

    public static ZendeskModule_ApplicationContextFactory create(ZendeskModule zendeskModule) {
        return new ZendeskModule_ApplicationContextFactory(zendeskModule);
    }

    @Override // t70.a
    public Context get() {
        return applicationContext(this.module);
    }
}
