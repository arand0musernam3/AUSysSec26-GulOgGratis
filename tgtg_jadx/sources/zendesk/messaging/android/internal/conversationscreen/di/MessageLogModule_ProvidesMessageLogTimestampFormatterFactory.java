package zendesk.messaging.android.internal.conversationscreen.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.android.internal.conversationscreen.MessageLogTimestampFormatter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessageLogModule_ProvidesMessageLogTimestampFormatterFactory implements c {
    private final c contextProvider;
    private final c localeProvider;
    private final MessageLogModule module;

    private MessageLogModule_ProvidesMessageLogTimestampFormatterFactory(MessageLogModule messageLogModule, c cVar, c cVar2) {
        this.module = messageLogModule;
        this.contextProvider = cVar;
        this.localeProvider = cVar2;
    }

    public static MessageLogModule_ProvidesMessageLogTimestampFormatterFactory create(MessageLogModule messageLogModule, c cVar, c cVar2) {
        return new MessageLogModule_ProvidesMessageLogTimestampFormatterFactory(messageLogModule, cVar, cVar2);
    }

    public static MessageLogTimestampFormatter providesMessageLogTimestampFormatter(MessageLogModule messageLogModule, Context context, LocaleProvider localeProvider) {
        MessageLogTimestampFormatter messageLogTimestampFormatterProvidesMessageLogTimestampFormatter = messageLogModule.providesMessageLogTimestampFormatter(context, localeProvider);
        x0.o(messageLogTimestampFormatterProvidesMessageLogTimestampFormatter);
        return messageLogTimestampFormatterProvidesMessageLogTimestampFormatter;
    }

    @Override // t70.a
    public MessageLogTimestampFormatter get() {
        return providesMessageLogTimestampFormatter(this.module, (Context) this.contextProvider.get(), (LocaleProvider) this.localeProvider.get());
    }
}
