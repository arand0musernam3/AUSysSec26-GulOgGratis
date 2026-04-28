package zendesk.ui.android.conversation.conversationextension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionLoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "FAILED", "SUCCESS", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationExtensionLoadingState {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ ConversationExtensionLoadingState[] $VALUES;
    public static final ConversationExtensionLoadingState IDLE = new ConversationExtensionLoadingState("IDLE", 0);
    public static final ConversationExtensionLoadingState LOADING = new ConversationExtensionLoadingState("LOADING", 1);
    public static final ConversationExtensionLoadingState FAILED = new ConversationExtensionLoadingState("FAILED", 2);
    public static final ConversationExtensionLoadingState SUCCESS = new ConversationExtensionLoadingState("SUCCESS", 3);

    private static final /* synthetic */ ConversationExtensionLoadingState[] $values() {
        return new ConversationExtensionLoadingState[]{IDLE, LOADING, FAILED, SUCCESS};
    }

    static {
        ConversationExtensionLoadingState[] conversationExtensionLoadingStateArr$values = $values();
        $VALUES = conversationExtensionLoadingStateArr$values;
        $ENTRIES = n.w(conversationExtensionLoadingStateArr$values);
    }

    private ConversationExtensionLoadingState(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static ConversationExtensionLoadingState valueOf(String str) {
        return (ConversationExtensionLoadingState) Enum.valueOf(ConversationExtensionLoadingState.class, str);
    }

    public static ConversationExtensionLoadingState[] values() {
        return (ConversationExtensionLoadingState[]) $VALUES.clone();
    }
}
