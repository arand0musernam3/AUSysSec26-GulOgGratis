package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import android.content.Context;
import s70.c;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationLogTimestampFormatter_Factory implements c {
    private final c contextProvider;
    private final c is24HourFormatProvider;
    private final c localeProvider;

    private ConversationLogTimestampFormatter_Factory(c cVar, c cVar2, c cVar3) {
        this.contextProvider = cVar;
        this.localeProvider = cVar2;
        this.is24HourFormatProvider = cVar3;
    }

    public static ConversationLogTimestampFormatter_Factory create(c cVar, c cVar2, c cVar3) {
        return new ConversationLogTimestampFormatter_Factory(cVar, cVar2, cVar3);
    }

    public static ConversationLogTimestampFormatter newInstance(Context context, LocaleProvider localeProvider, boolean z11) {
        return new ConversationLogTimestampFormatter(context, localeProvider, z11);
    }

    @Override // t70.a
    public ConversationLogTimestampFormatter get() {
        return newInstance((Context) this.contextProvider.get(), (LocaleProvider) this.localeProvider.get(), ((Boolean) this.is24HourFormatProvider.get()).booleanValue());
    }
}
