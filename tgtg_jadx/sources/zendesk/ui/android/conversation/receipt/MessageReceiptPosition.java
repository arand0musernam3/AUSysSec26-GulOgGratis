package zendesk.ui.android.conversation.receipt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzendesk/ui/android/conversation/receipt/MessageReceiptPosition;", "", "<init>", "(Ljava/lang/String;I)V", "INBOUND", "INBOUND_FAILED", "OUTBOUND_SENDING", "OUTBOUND_SENT", "OUTBOUND_FAILED", "NONE", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageReceiptPosition {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ MessageReceiptPosition[] $VALUES;
    public static final MessageReceiptPosition INBOUND = new MessageReceiptPosition("INBOUND", 0);
    public static final MessageReceiptPosition INBOUND_FAILED = new MessageReceiptPosition("INBOUND_FAILED", 1);
    public static final MessageReceiptPosition OUTBOUND_SENDING = new MessageReceiptPosition("OUTBOUND_SENDING", 2);
    public static final MessageReceiptPosition OUTBOUND_SENT = new MessageReceiptPosition("OUTBOUND_SENT", 3);
    public static final MessageReceiptPosition OUTBOUND_FAILED = new MessageReceiptPosition("OUTBOUND_FAILED", 4);
    public static final MessageReceiptPosition NONE = new MessageReceiptPosition("NONE", 5);

    private static final /* synthetic */ MessageReceiptPosition[] $values() {
        return new MessageReceiptPosition[]{INBOUND, INBOUND_FAILED, OUTBOUND_SENDING, OUTBOUND_SENT, OUTBOUND_FAILED, NONE};
    }

    static {
        MessageReceiptPosition[] messageReceiptPositionArr$values = $values();
        $VALUES = messageReceiptPositionArr$values;
        $ENTRIES = n.w(messageReceiptPositionArr$values);
    }

    private MessageReceiptPosition(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static MessageReceiptPosition valueOf(String str) {
        return (MessageReceiptPosition) Enum.valueOf(MessageReceiptPosition.class, str);
    }

    public static MessageReceiptPosition[] values() {
        return (MessageReceiptPosition[]) $VALUES.clone();
    }
}
