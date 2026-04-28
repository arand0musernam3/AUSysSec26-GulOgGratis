package zendesk.messaging.android.push;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/push/PushResponsibility;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGING_SHOULD_DISPLAY", "MESSAGING_SHOULD_NOT_DISPLAY", "NOT_FROM_MESSAGING", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushResponsibility {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ PushResponsibility[] $VALUES;
    public static final PushResponsibility MESSAGING_SHOULD_DISPLAY = new PushResponsibility("MESSAGING_SHOULD_DISPLAY", 0);
    public static final PushResponsibility MESSAGING_SHOULD_NOT_DISPLAY = new PushResponsibility("MESSAGING_SHOULD_NOT_DISPLAY", 1);
    public static final PushResponsibility NOT_FROM_MESSAGING = new PushResponsibility("NOT_FROM_MESSAGING", 2);

    private static final /* synthetic */ PushResponsibility[] $values() {
        return new PushResponsibility[]{MESSAGING_SHOULD_DISPLAY, MESSAGING_SHOULD_NOT_DISPLAY, NOT_FROM_MESSAGING};
    }

    static {
        PushResponsibility[] pushResponsibilityArr$values = $values();
        $VALUES = pushResponsibilityArr$values;
        $ENTRIES = n.w(pushResponsibilityArr$values);
    }

    private PushResponsibility(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static PushResponsibility valueOf(String str) {
        return (PushResponsibility) Enum.valueOf(PushResponsibility.class, str);
    }

    public static PushResponsibility[] values() {
        return (PushResponsibility[]) $VALUES.clone();
    }
}
