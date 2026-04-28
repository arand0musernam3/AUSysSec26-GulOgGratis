package zendesk.messaging.android.internal;

import android.content.Context;
import s70.c;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogTimestampFormatter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationTitleProvider_Factory implements c {
    private final c contextProvider;
    private final c is24HourFormatProvider;
    private final c localeProvider;
    private final c timestampFormatterProvider;

    private ConversationTitleProvider_Factory(c cVar, c cVar2, c cVar3, c cVar4) {
        this.contextProvider = cVar;
        this.localeProvider = cVar2;
        this.timestampFormatterProvider = cVar3;
        this.is24HourFormatProvider = cVar4;
    }

    public static ConversationTitleProvider_Factory create(c cVar, c cVar2, c cVar3, c cVar4) {
        return new ConversationTitleProvider_Factory(cVar, cVar2, cVar3, cVar4);
    }

    public static ConversationTitleProvider newInstance(Context context, LocaleProvider localeProvider, ConversationLogTimestampFormatter conversationLogTimestampFormatter, boolean z11) {
        return new ConversationTitleProvider(context, localeProvider, conversationLogTimestampFormatter, z11);
    }

    @Override // t70.a
    public ConversationTitleProvider get() {
        return newInstance((Context) this.contextProvider.get(), (LocaleProvider) this.localeProvider.get(), (ConversationLogTimestampFormatter) this.timestampFormatterProvider.get(), ((Boolean) this.is24HourFormatProvider.get()).booleanValue());
    }
}
