package zendesk.messaging.android.internal.conversationscreen.di;

import k.h;
import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.conversationscreen.MessageLogLabelProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessageLogModule_ProvidesMessageLogLabelProviderFactory implements c {
    private final c activityProvider;
    private final MessageLogModule module;

    private MessageLogModule_ProvidesMessageLogLabelProviderFactory(MessageLogModule messageLogModule, c cVar) {
        this.module = messageLogModule;
        this.activityProvider = cVar;
    }

    public static MessageLogModule_ProvidesMessageLogLabelProviderFactory create(MessageLogModule messageLogModule, c cVar) {
        return new MessageLogModule_ProvidesMessageLogLabelProviderFactory(messageLogModule, cVar);
    }

    public static MessageLogLabelProvider providesMessageLogLabelProvider(MessageLogModule messageLogModule, h hVar) {
        MessageLogLabelProvider messageLogLabelProviderProvidesMessageLogLabelProvider = messageLogModule.providesMessageLogLabelProvider(hVar);
        x0.o(messageLogLabelProviderProvidesMessageLogLabelProvider);
        return messageLogLabelProviderProvidesMessageLogLabelProvider;
    }

    @Override // t70.a
    public MessageLogLabelProvider get() {
        return providesMessageLogLabelProvider(this.module, (h) this.activityProvider.get());
    }
}
