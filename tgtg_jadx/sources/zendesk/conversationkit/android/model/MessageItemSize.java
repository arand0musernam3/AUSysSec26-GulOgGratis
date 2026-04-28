package zendesk.conversationkit.android.model;

import a80.a;
import db0.b;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageItemSize;", "", "<init>", "(Ljava/lang/String;I)V", "COMPACT", "LARGE", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageItemSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageItemSize[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final MessageItemSize COMPACT = new MessageItemSize("COMPACT", 0);
    public static final MessageItemSize LARGE = new MessageItemSize("LARGE", 1);

    private static final /* synthetic */ MessageItemSize[] $values() {
        return new MessageItemSize[]{COMPACT, LARGE};
    }

    static {
        MessageItemSize[] messageItemSizeArr$values = $values();
        $VALUES = messageItemSizeArr$values;
        $ENTRIES = n.w(messageItemSizeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new b(23));
    }

    private MessageItemSize(String str, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        MessageItemSize[] messageItemSizeArrValues = values();
        messageItemSizeArrValues.getClass();
        return new i90.a("zendesk.conversationkit.android.model.MessageItemSize", (Enum[]) messageItemSizeArrValues);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageItemSize valueOf(String str) {
        return (MessageItemSize) Enum.valueOf(MessageItemSize.class, str);
    }

    public static MessageItemSize[] values() {
        return (MessageItemSize[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageItemSize$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageItemSize;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageItemSize.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
