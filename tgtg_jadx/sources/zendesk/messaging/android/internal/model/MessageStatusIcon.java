package zendesk.messaging.android.internal.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageStatusIcon;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ICON", "TAIL_SENDING", "TAIL_SENT", "FAILED", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageStatusIcon {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageStatusIcon[] $VALUES;
    public static final MessageStatusIcon NO_ICON = new MessageStatusIcon("NO_ICON", 0);
    public static final MessageStatusIcon TAIL_SENDING = new MessageStatusIcon("TAIL_SENDING", 1);
    public static final MessageStatusIcon TAIL_SENT = new MessageStatusIcon("TAIL_SENT", 2);
    public static final MessageStatusIcon FAILED = new MessageStatusIcon("FAILED", 3);

    private static final /* synthetic */ MessageStatusIcon[] $values() {
        return new MessageStatusIcon[]{NO_ICON, TAIL_SENDING, TAIL_SENT, FAILED};
    }

    static {
        MessageStatusIcon[] messageStatusIconArr$values = $values();
        $VALUES = messageStatusIconArr$values;
        $ENTRIES = n.w(messageStatusIconArr$values);
    }

    private MessageStatusIcon(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageStatusIcon valueOf(String str) {
        return (MessageStatusIcon) Enum.valueOf(MessageStatusIcon.class, str);
    }

    public static MessageStatusIcon[] values() {
        return (MessageStatusIcon[]) $VALUES.clone();
    }
}
