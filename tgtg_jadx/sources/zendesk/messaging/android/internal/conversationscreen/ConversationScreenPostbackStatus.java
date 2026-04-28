package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "LOADING", "FAILED", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationScreenPostbackStatus {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ConversationScreenPostbackStatus[] $VALUES;
    public static final ConversationScreenPostbackStatus SUCCESS = new ConversationScreenPostbackStatus("SUCCESS", 0);
    public static final ConversationScreenPostbackStatus LOADING = new ConversationScreenPostbackStatus("LOADING", 1);
    public static final ConversationScreenPostbackStatus FAILED = new ConversationScreenPostbackStatus("FAILED", 2);

    private static final /* synthetic */ ConversationScreenPostbackStatus[] $values() {
        return new ConversationScreenPostbackStatus[]{SUCCESS, LOADING, FAILED};
    }

    static {
        ConversationScreenPostbackStatus[] conversationScreenPostbackStatusArr$values = $values();
        $VALUES = conversationScreenPostbackStatusArr$values;
        $ENTRIES = v0.n.w(conversationScreenPostbackStatusArr$values);
    }

    private ConversationScreenPostbackStatus(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ConversationScreenPostbackStatus valueOf(String str) {
        return (ConversationScreenPostbackStatus) Enum.valueOf(ConversationScreenPostbackStatus.class, str);
    }

    public static ConversationScreenPostbackStatus[] values() {
        return (ConversationScreenPostbackStatus[]) $VALUES.clone();
    }
}
