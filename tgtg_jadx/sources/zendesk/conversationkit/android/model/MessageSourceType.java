package zendesk.conversationkit.android.model;

import a80.a;
import db0.b;
import i90.h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lzendesk/conversationkit/android/model/MessageSourceType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ULTIMATE", "BOT", "AGENT", "AGENT_COPILOT", "SURVEY", "USER", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageSourceType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageSourceType[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    @NotNull
    private static final String ANDROID = "android";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final MessageSourceType ULTIMATE = new MessageSourceType("ULTIMATE", 0, "ultimate");
    public static final MessageSourceType BOT = new MessageSourceType("BOT", 1, "zd:answerBot");
    public static final MessageSourceType AGENT = new MessageSourceType("AGENT", 2, "zd:agentWorkspace");
    public static final MessageSourceType AGENT_COPILOT = new MessageSourceType("AGENT_COPILOT", 3, "zd:agentCopilot");
    public static final MessageSourceType SURVEY = new MessageSourceType("SURVEY", 4, "zd:surveys");
    public static final MessageSourceType USER = new MessageSourceType("USER", 5, "user");

    private static final /* synthetic */ MessageSourceType[] $values() {
        return new MessageSourceType[]{ULTIMATE, BOT, AGENT, AGENT_COPILOT, SURVEY, USER};
    }

    static {
        MessageSourceType[] messageSourceTypeArr$values = $values();
        $VALUES = messageSourceTypeArr$values;
        $ENTRIES = n.w(messageSourceTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new b(25));
    }

    private MessageSourceType(String str, int i11, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        MessageSourceType[] messageSourceTypeArrValues = values();
        messageSourceTypeArrValues.getClass();
        return new i90.a("zendesk.conversationkit.android.model.MessageSourceType", (Enum[]) messageSourceTypeArrValues);
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
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lzendesk/conversationkit/android/model/MessageSourceType$Companion;", "", "<init>", "()V", "ANDROID", "", "findByValue", "Lzendesk/conversationkit/android/model/MessageSourceType;", "value", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\nzendesk/conversationkit/android/model/MessageSourceType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,917:1\n1#2:918\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageSourceType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final MessageSourceType findByValue(@NotNull String value) {
            Object next;
            value.getClass();
            if (Intrinsics.areEqual(value, "android")) {
                return MessageSourceType.USER;
            }
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

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
