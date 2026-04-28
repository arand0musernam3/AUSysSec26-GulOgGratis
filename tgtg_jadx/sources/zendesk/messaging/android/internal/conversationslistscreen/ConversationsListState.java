package zendesk.messaging.android.internal.conversationslistscreen;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED_ENTRY_POINT", "FAILED_CONVERSATIONS", "LOADING", "IDLE", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListState {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ConversationsListState[] $VALUES;
    public static final ConversationsListState SUCCESS = new ConversationsListState("SUCCESS", 0);
    public static final ConversationsListState FAILED_ENTRY_POINT = new ConversationsListState("FAILED_ENTRY_POINT", 1);
    public static final ConversationsListState FAILED_CONVERSATIONS = new ConversationsListState("FAILED_CONVERSATIONS", 2);
    public static final ConversationsListState LOADING = new ConversationsListState("LOADING", 3);
    public static final ConversationsListState IDLE = new ConversationsListState("IDLE", 4);

    private static final /* synthetic */ ConversationsListState[] $values() {
        return new ConversationsListState[]{SUCCESS, FAILED_ENTRY_POINT, FAILED_CONVERSATIONS, LOADING, IDLE};
    }

    static {
        ConversationsListState[] conversationsListStateArr$values = $values();
        $VALUES = conversationsListStateArr$values;
        $ENTRIES = n.w(conversationsListStateArr$values);
    }

    private ConversationsListState(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ConversationsListState valueOf(String str) {
        return (ConversationsListState) Enum.valueOf(ConversationsListState.class, str);
    }

    public static ConversationsListState[] values() {
        return (ConversationsListState[]) $VALUES.clone();
    }
}
