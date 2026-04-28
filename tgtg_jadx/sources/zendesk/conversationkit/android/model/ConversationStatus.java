package zendesk.conversationkit.android.model;

import a80.a;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import m90.c1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/ConversationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "IDLE", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConversationStatus[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("active")
    public static final ConversationStatus ACTIVE = new ConversationStatus("ACTIVE", 0);

    @g("idle")
    public static final ConversationStatus IDLE = new ConversationStatus("IDLE", 1);

    private static final /* synthetic */ ConversationStatus[] $values() {
        return new ConversationStatus[]{ACTIVE, IDLE};
    }

    static {
        ConversationStatus[] conversationStatusArr$values = $values();
        $VALUES = conversationStatusArr$values;
        $ENTRIES = n.w(conversationStatusArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new db0.a(0));
    }

    private ConversationStatus(String str, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return c1.e("zendesk.conversationkit.android.model.ConversationStatus", values(), new String[]{"active", "idle"}, new Annotation[][]{null, null});
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ConversationStatus valueOf(String str) {
        return (ConversationStatus) Enum.valueOf(ConversationStatus.class, str);
    }

    public static ConversationStatus[] values() {
        return (ConversationStatus[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/ConversationStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/ConversationStatus;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ConversationStatus.$cachedSerializer$delegate.getValue();
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
