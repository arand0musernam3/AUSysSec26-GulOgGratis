package zendesk.core.ui.android.internal.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/core/ui/android/internal/model/MessagePosition;", "", "<init>", "(Ljava/lang/String;I)V", "STANDALONE", "GROUP_TOP", "GROUP_MIDDLE", "GROUP_BOTTOM", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagePosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessagePosition[] $VALUES;
    public static final MessagePosition STANDALONE = new MessagePosition("STANDALONE", 0);
    public static final MessagePosition GROUP_TOP = new MessagePosition("GROUP_TOP", 1);
    public static final MessagePosition GROUP_MIDDLE = new MessagePosition("GROUP_MIDDLE", 2);
    public static final MessagePosition GROUP_BOTTOM = new MessagePosition("GROUP_BOTTOM", 3);

    private static final /* synthetic */ MessagePosition[] $values() {
        return new MessagePosition[]{STANDALONE, GROUP_TOP, GROUP_MIDDLE, GROUP_BOTTOM};
    }

    static {
        MessagePosition[] messagePositionArr$values = $values();
        $VALUES = messagePositionArr$values;
        $ENTRIES = n.w(messagePositionArr$values);
    }

    private MessagePosition(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessagePosition valueOf(String str) {
        return (MessagePosition) Enum.valueOf(MessagePosition.class, str);
    }

    public static MessagePosition[] values() {
        return (MessagePosition[]) $VALUES.clone();
    }
}
