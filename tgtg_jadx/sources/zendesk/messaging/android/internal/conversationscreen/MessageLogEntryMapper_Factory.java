package zendesk.messaging.android.internal.conversationscreen;

import java.util.Date;
import kotlin.jvm.functions.Function0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessageLogEntryMapper_Factory implements s70.c {
    private final s70.c currentTimeProvider;
    private final s70.c defaultDispatcherProvider;
    private final s70.c idProvider;
    private final s70.c labelProvider;
    private final s70.c messageContainerFactoryProvider;
    private final s70.c timestampFormatterProvider;

    private MessageLogEntryMapper_Factory(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5, s70.c cVar6) {
        this.messageContainerFactoryProvider = cVar;
        this.labelProvider = cVar2;
        this.timestampFormatterProvider = cVar3;
        this.currentTimeProvider = cVar4;
        this.idProvider = cVar5;
        this.defaultDispatcherProvider = cVar6;
    }

    public static MessageLogEntryMapper_Factory create(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4, s70.c cVar5, s70.c cVar6) {
        return new MessageLogEntryMapper_Factory(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static MessageLogEntryMapper newInstance(MessageContainerFactory messageContainerFactory, MessageLogLabelProvider messageLogLabelProvider, MessageLogTimestampFormatter messageLogTimestampFormatter, Function0<? extends Date> function0, Function0<String> function02, x xVar) {
        return new MessageLogEntryMapper(messageContainerFactory, messageLogLabelProvider, messageLogTimestampFormatter, function0, function02, xVar);
    }

    @Override // t70.a
    public MessageLogEntryMapper get() {
        return newInstance((MessageContainerFactory) this.messageContainerFactoryProvider.get(), (MessageLogLabelProvider) this.labelProvider.get(), (MessageLogTimestampFormatter) this.timestampFormatterProvider.get(), (Function0) this.currentTimeProvider.get(), (Function0) this.idProvider.get(), (x) this.defaultDispatcherProvider.get());
    }
}
