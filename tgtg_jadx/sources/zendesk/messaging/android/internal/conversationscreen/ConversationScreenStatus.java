package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SUCCESS", "LOADING", "FAILED", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationScreenStatus {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ConversationScreenStatus[] $VALUES;
    public static final ConversationScreenStatus IDLE = new ConversationScreenStatus("IDLE", 0);
    public static final ConversationScreenStatus SUCCESS = new ConversationScreenStatus("SUCCESS", 1);
    public static final ConversationScreenStatus LOADING = new ConversationScreenStatus("LOADING", 2);
    public static final ConversationScreenStatus FAILED = new ConversationScreenStatus("FAILED", 3);

    private static final /* synthetic */ ConversationScreenStatus[] $values() {
        return new ConversationScreenStatus[]{IDLE, SUCCESS, LOADING, FAILED};
    }

    static {
        ConversationScreenStatus[] conversationScreenStatusArr$values = $values();
        $VALUES = conversationScreenStatusArr$values;
        $ENTRIES = v0.n.w(conversationScreenStatusArr$values);
    }

    private ConversationScreenStatus(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ConversationScreenStatus valueOf(String str) {
        return (ConversationScreenStatus) Enum.valueOf(ConversationScreenStatus.class, str);
    }

    public static ConversationScreenStatus[] values() {
        return (ConversationScreenStatus[]) $VALUES.clone();
    }
}
