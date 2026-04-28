package zendesk.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskInitializedModule_ProvidesConversationKitFactory implements c {
    private final ZendeskInitializedModule module;

    private ZendeskInitializedModule_ProvidesConversationKitFactory(ZendeskInitializedModule zendeskInitializedModule) {
        this.module = zendeskInitializedModule;
    }

    public static ZendeskInitializedModule_ProvidesConversationKitFactory create(ZendeskInitializedModule zendeskInitializedModule) {
        return new ZendeskInitializedModule_ProvidesConversationKitFactory(zendeskInitializedModule);
    }

    public static ConversationKit providesConversationKit(ZendeskInitializedModule zendeskInitializedModule) {
        ConversationKit conversationKit = zendeskInitializedModule.getConversationKit();
        x0.o(conversationKit);
        return conversationKit;
    }

    @Override // t70.a
    public ConversationKit get() {
        return providesConversationKit(this.module);
    }
}
