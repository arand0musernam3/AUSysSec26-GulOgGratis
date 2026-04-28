package zendesk.core.ui.android.internal.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/core/ui/android/internal/model/MessageShape;", "", "<init>", "(Ljava/lang/String;I)V", "STANDALONE", "GROUP_TOP", "GROUP_MIDDLE", "GROUP_BOTTOM", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageShape {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageShape[] $VALUES;
    public static final MessageShape STANDALONE = new MessageShape("STANDALONE", 0);
    public static final MessageShape GROUP_TOP = new MessageShape("GROUP_TOP", 1);
    public static final MessageShape GROUP_MIDDLE = new MessageShape("GROUP_MIDDLE", 2);
    public static final MessageShape GROUP_BOTTOM = new MessageShape("GROUP_BOTTOM", 3);

    private static final /* synthetic */ MessageShape[] $values() {
        return new MessageShape[]{STANDALONE, GROUP_TOP, GROUP_MIDDLE, GROUP_BOTTOM};
    }

    static {
        MessageShape[] messageShapeArr$values = $values();
        $VALUES = messageShapeArr$values;
        $ENTRIES = n.w(messageShapeArr$values);
    }

    private MessageShape(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageShape valueOf(String str) {
        return (MessageShape) Enum.valueOf(MessageShape.class, str);
    }

    public static MessageShape[] values() {
        return (MessageShape[]) $VALUES.clone();
    }
}
