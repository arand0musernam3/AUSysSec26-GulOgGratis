package zendesk.conversationkit.android.model;

import a80.a;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;
import zendesk.core.android.internal.serializer.EnumIgnoreUnknownSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h(with = ConversationRoutingStatusSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "QUEUED", "ASSIGNED", "UNKNOWN", "ConversationRoutingStatusSerializer", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationRoutingStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConversationRoutingStatus[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("queued")
    public static final ConversationRoutingStatus QUEUED = new ConversationRoutingStatus("QUEUED", 0);

    @g("assigned")
    public static final ConversationRoutingStatus ASSIGNED = new ConversationRoutingStatus("ASSIGNED", 1);
    public static final ConversationRoutingStatus UNKNOWN = new ConversationRoutingStatus("UNKNOWN", 2);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/conversationkit/android/model/ConversationRoutingStatus$ConversationRoutingStatusSerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Conversation.kt\nzendesk/conversationkit/android/model/ConversationRoutingStatus$ConversationRoutingStatusSerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,198:1\n37#2:199\n36#2,3:200\n*S KotlinDebug\n*F\n+ 1 Conversation.kt\nzendesk/conversationkit/android/model/ConversationRoutingStatus$ConversationRoutingStatusSerializer\n*L\n124#1:199\n124#1:200,3\n*E\n"})
    public static final class ConversationRoutingStatusSerializer extends EnumIgnoreUnknownSerializer<ConversationRoutingStatus> {

        @NotNull
        public static final ConversationRoutingStatusSerializer INSTANCE = new ConversationRoutingStatusSerializer();

        private ConversationRoutingStatusSerializer() {
            super((Enum[]) ConversationRoutingStatus.getEntries().toArray(new ConversationRoutingStatus[0]), ConversationRoutingStatus.UNKNOWN);
        }
    }

    private static final /* synthetic */ ConversationRoutingStatus[] $values() {
        return new ConversationRoutingStatus[]{QUEUED, ASSIGNED, UNKNOWN};
    }

    static {
        ConversationRoutingStatus[] conversationRoutingStatusArr$values = $values();
        $VALUES = conversationRoutingStatusArr$values;
        $ENTRIES = n.w(conversationRoutingStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private ConversationRoutingStatus(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ConversationRoutingStatus valueOf(String str) {
        return (ConversationRoutingStatus) Enum.valueOf(ConversationRoutingStatus.class, str);
    }

    public static ConversationRoutingStatus[] values() {
        return (ConversationRoutingStatus[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/ConversationRoutingStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/ConversationRoutingStatus;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ConversationRoutingStatusSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
