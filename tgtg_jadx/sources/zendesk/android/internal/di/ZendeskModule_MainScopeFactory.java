package zendesk.android.internal.di;

import o00.x0;
import s70.c;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskModule_MainScopeFactory implements c {
    private final ZendeskModule module;

    private ZendeskModule_MainScopeFactory(ZendeskModule zendeskModule) {
        this.module = zendeskModule;
    }

    public static ZendeskModule_MainScopeFactory create(ZendeskModule zendeskModule) {
        return new ZendeskModule_MainScopeFactory(zendeskModule);
    }

    public static b0 mainScope(ZendeskModule zendeskModule) {
        b0 b0VarMainScope = zendeskModule.mainScope();
        x0.o(b0VarMainScope);
        return b0VarMainScope;
    }

    @Override // t70.a
    public b0 get() {
        return mainScope(this.module);
    }
}
