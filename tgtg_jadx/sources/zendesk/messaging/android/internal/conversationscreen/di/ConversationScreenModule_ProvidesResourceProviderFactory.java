package zendesk.messaging.android.internal.conversationscreen.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.UploadFileResourceProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationScreenModule_ProvidesResourceProviderFactory implements c {
    private final c contextProvider;
    private final ConversationScreenModule module;

    private ConversationScreenModule_ProvidesResourceProviderFactory(ConversationScreenModule conversationScreenModule, c cVar) {
        this.module = conversationScreenModule;
        this.contextProvider = cVar;
    }

    public static ConversationScreenModule_ProvidesResourceProviderFactory create(ConversationScreenModule conversationScreenModule, c cVar) {
        return new ConversationScreenModule_ProvidesResourceProviderFactory(conversationScreenModule, cVar);
    }

    public static UploadFileResourceProvider providesResourceProvider(ConversationScreenModule conversationScreenModule, Context context) {
        UploadFileResourceProvider uploadFileResourceProviderProvidesResourceProvider = conversationScreenModule.providesResourceProvider(context);
        x0.o(uploadFileResourceProviderProvidesResourceProvider);
        return uploadFileResourceProviderProvidesResourceProvider;
    }

    @Override // t70.a
    public UploadFileResourceProvider get() {
        return providesResourceProvider(this.module, (Context) this.contextProvider.get());
    }
}
