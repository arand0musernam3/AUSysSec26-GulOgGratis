package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import android.content.Context;
import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationLogEntryMapper_Factory implements c {
    private final c contextProvider;
    private final c conversationTitleProvider;
    private final c conversationsListLocalStorageIOProvider;
    private final c logTimestampFormatterProvider;
    private final c messagingSettingsProvider;

    private ConversationLogEntryMapper_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.contextProvider = cVar;
        this.logTimestampFormatterProvider = cVar2;
        this.messagingSettingsProvider = cVar3;
        this.conversationsListLocalStorageIOProvider = cVar4;
        this.conversationTitleProvider = cVar5;
    }

    public static ConversationLogEntryMapper_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        return new ConversationLogEntryMapper_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static ConversationLogEntryMapper newInstance(Context context, ConversationLogTimestampFormatter conversationLogTimestampFormatter, MessagingSettings messagingSettings, ConversationsListLocalStorageIO conversationsListLocalStorageIO, ConversationTitleProvider conversationTitleProvider) {
        return new ConversationLogEntryMapper(context, conversationLogTimestampFormatter, messagingSettings, conversationsListLocalStorageIO, conversationTitleProvider);
    }

    @Override // t70.a
    public ConversationLogEntryMapper get() {
        return newInstance((Context) this.contextProvider.get(), (ConversationLogTimestampFormatter) this.logTimestampFormatterProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get(), (ConversationsListLocalStorageIO) this.conversationsListLocalStorageIOProvider.get(), (ConversationTitleProvider) this.conversationTitleProvider.get());
    }
}
