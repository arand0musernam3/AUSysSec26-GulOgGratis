package zendesk.core.ui.android.internal.model;

import a80.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lzendesk/core/ui/android/internal/model/MessageSourceType;", "", "value", "", "analyticValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getAnalyticValue", "ULTIMATE", "BOT", "AGENT", "AGENT_COPILOT", "SURVEY", "API", "USER", "Companion", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageSourceType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageSourceType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String analyticValue;

    @NotNull
    private final String value;
    public static final MessageSourceType ULTIMATE = new MessageSourceType("ULTIMATE", 0, "ultimate", "bot");
    public static final MessageSourceType BOT = new MessageSourceType("BOT", 1, "zd:answerBot", "bot");
    public static final MessageSourceType AGENT = new MessageSourceType("AGENT", 2, "zd:agentWorkspace", "agent");
    public static final MessageSourceType AGENT_COPILOT = new MessageSourceType("AGENT_COPILOT", 3, "zd:agentCopilot", "copilot");
    public static final MessageSourceType SURVEY = new MessageSourceType("SURVEY", 4, "zd:surveys", "bot");
    public static final MessageSourceType API = new MessageSourceType("API", 5, "api", "api");
    public static final MessageSourceType USER = new MessageSourceType("USER", 6, "user", "user");

    private static final /* synthetic */ MessageSourceType[] $values() {
        return new MessageSourceType[]{ULTIMATE, BOT, AGENT, AGENT_COPILOT, SURVEY, API, USER};
    }

    static {
        MessageSourceType[] messageSourceTypeArr$values = $values();
        $VALUES = messageSourceTypeArr$values;
        $ENTRIES = n.w(messageSourceTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private MessageSourceType(String str, int i11, String str2, String str3) {
        this.value = str2;
        this.analyticValue = str3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageSourceType valueOf(String str) {
        return (MessageSourceType) Enum.valueOf(MessageSourceType.class, str);
    }

    public static MessageSourceType[] values() {
        return (MessageSourceType[]) $VALUES.clone();
    }

    @NotNull
    public final String getAnalyticValue() {
        return this.analyticValue;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lzendesk/core/ui/android/internal/model/MessageSourceType$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "value", "", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMessageSourceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageSourceType.kt\nzendesk/core/ui/android/internal/model/MessageSourceType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageSourceType findByValue(@NotNull String value) {
            Object next;
            value.getClass();
            Iterator<E> it = MessageSourceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((MessageSourceType) next).getValue(), value)) {
                    break;
                }
            }
            MessageSourceType messageSourceType = (MessageSourceType) next;
            return messageSourceType == null ? MessageSourceType.BOT : messageSourceType;
        }

        private Companion() {
        }
    }
}
