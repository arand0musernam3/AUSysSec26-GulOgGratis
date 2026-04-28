package zendesk.android.events;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/events/NewConversationSource;", "", "<init>", "(Ljava/lang/String;I)V", "CONVERSATION_LIST", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewConversationSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NewConversationSource[] $VALUES;
    public static final NewConversationSource CONVERSATION_LIST = new NewConversationSource("CONVERSATION_LIST", 0);

    private static final /* synthetic */ NewConversationSource[] $values() {
        return new NewConversationSource[]{CONVERSATION_LIST};
    }

    static {
        NewConversationSource[] newConversationSourceArr$values = $values();
        $VALUES = newConversationSourceArr$values;
        $ENTRIES = n.w(newConversationSourceArr$values);
    }

    private NewConversationSource(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static NewConversationSource valueOf(String str) {
        return (NewConversationSource) Enum.valueOf(NewConversationSource.class, str);
    }

    public static NewConversationSource[] values() {
        return (NewConversationSource[]) $VALUES.clone();
    }
}
