package zendesk.core.ui.android.internal.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lzendesk/core/ui/android/internal/model/MessageActionSize;", "", "analyticsValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "FULL", "TALL", "COMPACT", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageActionSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageActionSize[] $VALUES;

    @NotNull
    private final String analyticsValue;
    public static final MessageActionSize FULL = new MessageActionSize("FULL", 0, "normal");
    public static final MessageActionSize TALL = new MessageActionSize("TALL", 1, "tall");
    public static final MessageActionSize COMPACT = new MessageActionSize("COMPACT", 2, "small");

    private static final /* synthetic */ MessageActionSize[] $values() {
        return new MessageActionSize[]{FULL, TALL, COMPACT};
    }

    static {
        MessageActionSize[] messageActionSizeArr$values = $values();
        $VALUES = messageActionSizeArr$values;
        $ENTRIES = n.w(messageActionSizeArr$values);
    }

    private MessageActionSize(String str, int i11, String str2) {
        this.analyticsValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageActionSize valueOf(String str) {
        return (MessageActionSize) Enum.valueOf(MessageActionSize.class, str);
    }

    public static MessageActionSize[] values() {
        return (MessageActionSize[]) $VALUES.clone();
    }

    @NotNull
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
