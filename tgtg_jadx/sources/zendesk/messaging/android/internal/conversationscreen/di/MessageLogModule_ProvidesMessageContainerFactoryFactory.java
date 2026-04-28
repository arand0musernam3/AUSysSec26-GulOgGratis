package zendesk.messaging.android.internal.conversationscreen.di;

import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.conversationscreen.MessageContainerFactory;
import zendesk.messaging.android.internal.conversationscreen.MessageLogLabelProvider;
import zendesk.messaging.android.internal.conversationscreen.MessageLogTimestampFormatter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessageLogModule_ProvidesMessageContainerFactoryFactory implements c {
    private final c messageLogLabelProvider;
    private final c messageLogTimestampFormatterProvider;
    private final MessageLogModule module;

    private MessageLogModule_ProvidesMessageContainerFactoryFactory(MessageLogModule messageLogModule, c cVar, c cVar2) {
        this.module = messageLogModule;
        this.messageLogLabelProvider = cVar;
        this.messageLogTimestampFormatterProvider = cVar2;
    }

    public static MessageLogModule_ProvidesMessageContainerFactoryFactory create(MessageLogModule messageLogModule, c cVar, c cVar2) {
        return new MessageLogModule_ProvidesMessageContainerFactoryFactory(messageLogModule, cVar, cVar2);
    }

    public static MessageContainerFactory providesMessageContainerFactory(MessageLogModule messageLogModule, MessageLogLabelProvider messageLogLabelProvider, MessageLogTimestampFormatter messageLogTimestampFormatter) {
        MessageContainerFactory messageContainerFactoryProvidesMessageContainerFactory = messageLogModule.providesMessageContainerFactory(messageLogLabelProvider, messageLogTimestampFormatter);
        x0.o(messageContainerFactoryProvidesMessageContainerFactory);
        return messageContainerFactoryProvidesMessageContainerFactory;
    }

    @Override // t70.a
    public MessageContainerFactory get() {
        return providesMessageContainerFactory(this.module, (MessageLogLabelProvider) this.messageLogLabelProvider.get(), (MessageLogTimestampFormatter) this.messageLogTimestampFormatterProvider.get());
    }
}
