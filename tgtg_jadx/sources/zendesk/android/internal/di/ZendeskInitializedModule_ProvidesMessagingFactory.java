package zendesk.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.android.messaging.Messaging;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskInitializedModule_ProvidesMessagingFactory implements c {
    private final ZendeskInitializedModule module;

    private ZendeskInitializedModule_ProvidesMessagingFactory(ZendeskInitializedModule zendeskInitializedModule) {
        this.module = zendeskInitializedModule;
    }

    public static ZendeskInitializedModule_ProvidesMessagingFactory create(ZendeskInitializedModule zendeskInitializedModule) {
        return new ZendeskInitializedModule_ProvidesMessagingFactory(zendeskInitializedModule);
    }

    public static Messaging providesMessaging(ZendeskInitializedModule zendeskInitializedModule) {
        Messaging messaging = zendeskInitializedModule.getMessaging();
        x0.o(messaging);
        return messaging;
    }

    @Override // t70.a
    public Messaging get() {
        return providesMessaging(this.module);
    }
}
