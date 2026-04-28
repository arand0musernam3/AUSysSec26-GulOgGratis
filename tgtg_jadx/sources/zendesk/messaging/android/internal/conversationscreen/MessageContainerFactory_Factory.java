package zendesk.messaging.android.internal.conversationscreen;

import java.util.Date;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessageContainerFactory_Factory implements s70.c {
    private final s70.c currentTimeProvider;
    private final s70.c labelProvider;
    private final s70.c timestampFormatterProvider;

    private MessageContainerFactory_Factory(s70.c cVar, s70.c cVar2, s70.c cVar3) {
        this.labelProvider = cVar;
        this.timestampFormatterProvider = cVar2;
        this.currentTimeProvider = cVar3;
    }

    public static MessageContainerFactory_Factory create(s70.c cVar, s70.c cVar2, s70.c cVar3) {
        return new MessageContainerFactory_Factory(cVar, cVar2, cVar3);
    }

    public static MessageContainerFactory newInstance(MessageLogLabelProvider messageLogLabelProvider, MessageLogTimestampFormatter messageLogTimestampFormatter, Function0<? extends Date> function0) {
        return new MessageContainerFactory(messageLogLabelProvider, messageLogTimestampFormatter, function0);
    }

    @Override // t70.a
    public MessageContainerFactory get() {
        return newInstance((MessageLogLabelProvider) this.labelProvider.get(), (MessageLogTimestampFormatter) this.timestampFormatterProvider.get(), (Function0) this.currentTimeProvider.get());
    }
}
