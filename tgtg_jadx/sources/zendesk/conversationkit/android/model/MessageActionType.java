package zendesk.conversationkit.android.model;

import a80.a;
import db0.b;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lzendesk/conversationkit/android/model/MessageActionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$zendesk_conversationkit_conversationkit_android", "()Ljava/lang/String;", "BUY", "LINK", "LOCATION_REQUEST", "POSTBACK", "REPLY", "SHARE", "WEBVIEW", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageActionType[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final MessageActionType BUY = new MessageActionType("BUY", 0, "buy");
    public static final MessageActionType LINK = new MessageActionType("LINK", 1, "link");
    public static final MessageActionType LOCATION_REQUEST = new MessageActionType("LOCATION_REQUEST", 2, "locationRequest");
    public static final MessageActionType POSTBACK = new MessageActionType("POSTBACK", 3, "postback");
    public static final MessageActionType REPLY = new MessageActionType("REPLY", 4, "reply");
    public static final MessageActionType SHARE = new MessageActionType("SHARE", 5, "share");
    public static final MessageActionType WEBVIEW = new MessageActionType("WEBVIEW", 6, "webview");

    private static final /* synthetic */ MessageActionType[] $values() {
        return new MessageActionType[]{BUY, LINK, LOCATION_REQUEST, POSTBACK, REPLY, SHARE, WEBVIEW};
    }

    static {
        MessageActionType[] messageActionTypeArr$values = $values();
        $VALUES = messageActionTypeArr$values;
        $ENTRIES = n.w(messageActionTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new b(8));
    }

    private MessageActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        MessageActionType[] messageActionTypeArrValues = values();
        messageActionTypeArrValues.getClass();
        return new i90.a("zendesk.conversationkit.android.model.MessageActionType", (Enum[]) messageActionTypeArrValues);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageActionType valueOf(String str) {
        return (MessageActionType) Enum.valueOf(MessageActionType.class, str);
    }

    public static MessageActionType[] values() {
        return (MessageActionType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/model/MessageActionType$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/conversationkit/android/model/MessageActionType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMessageAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageAction.kt\nzendesk/conversationkit/android/model/MessageActionType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageActionType.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final MessageActionType findByValue(@NotNull String value) {
            value.getClass();
            for (MessageActionType messageActionType : MessageActionType.values()) {
                if (Intrinsics.areEqual(messageActionType.getValue(), value)) {
                    return messageActionType;
                }
            }
            return null;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
