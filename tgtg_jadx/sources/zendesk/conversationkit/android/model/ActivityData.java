package zendesk.conversationkit.android.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lzendesk/conversationkit/android/model/ActivityData;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TYPING_START", "TYPING_STOP", "CONVERSATION_READ", "CONVERSATION_ROUTING_QUEUED", "CONVERSATION_ROUTING_ASSIGNED", "CONVERSATION_ROUTING_CLEARED", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityData {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActivityData[] $VALUES;

    @NotNull
    private final String type;
    public static final ActivityData TYPING_START = new ActivityData("TYPING_START", 0, "typing:start");
    public static final ActivityData TYPING_STOP = new ActivityData("TYPING_STOP", 1, "typing:stop");
    public static final ActivityData CONVERSATION_READ = new ActivityData("CONVERSATION_READ", 2, "conversation:read");
    public static final ActivityData CONVERSATION_ROUTING_QUEUED = new ActivityData("CONVERSATION_ROUTING_QUEUED", 3, "conversation:routing:queued");
    public static final ActivityData CONVERSATION_ROUTING_ASSIGNED = new ActivityData("CONVERSATION_ROUTING_ASSIGNED", 4, "conversation:routing:assigned");
    public static final ActivityData CONVERSATION_ROUTING_CLEARED = new ActivityData("CONVERSATION_ROUTING_CLEARED", 5, "conversation:routing:cleared");

    private static final /* synthetic */ ActivityData[] $values() {
        return new ActivityData[]{TYPING_START, TYPING_STOP, CONVERSATION_READ, CONVERSATION_ROUTING_QUEUED, CONVERSATION_ROUTING_ASSIGNED, CONVERSATION_ROUTING_CLEARED};
    }

    static {
        ActivityData[] activityDataArr$values = $values();
        $VALUES = activityDataArr$values;
        $ENTRIES = n.w(activityDataArr$values);
    }

    private ActivityData(String str, int i11, String str2) {
        this.type = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ActivityData valueOf(String str) {
        return (ActivityData) Enum.valueOf(ActivityData.class, str);
    }

    public static ActivityData[] values() {
        return (ActivityData[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
