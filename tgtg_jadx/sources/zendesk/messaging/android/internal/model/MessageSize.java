package zendesk.messaging.android.internal.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageSize;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "FULL_WIDTH", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageSize[] $VALUES;
    public static final MessageSize NORMAL = new MessageSize("NORMAL", 0);
    public static final MessageSize FULL_WIDTH = new MessageSize("FULL_WIDTH", 1);

    private static final /* synthetic */ MessageSize[] $values() {
        return new MessageSize[]{NORMAL, FULL_WIDTH};
    }

    static {
        MessageSize[] messageSizeArr$values = $values();
        $VALUES = messageSizeArr$values;
        $ENTRIES = n.w(messageSizeArr$values);
    }

    private MessageSize(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageSize valueOf(String str) {
        return (MessageSize) Enum.valueOf(MessageSize.class, str);
    }

    public static MessageSize[] values() {
        return (MessageSize[]) $VALUES.clone();
    }
}
