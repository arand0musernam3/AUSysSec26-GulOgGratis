package zendesk.conversationkit.android.internal.faye;

import a80.a;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.braze.models.inappmessage.InAppMessageBase;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsFayeMessageType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MESSAGE", "ACTIVITY", "CONVERSATION_ADDED", "CONVERSATION_REMOVED", "CONVERSATION_UPDATE", "USER_MERGE", "UPLOAD_FAILED", "UNKNOWN", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WsFayeMessageType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WsFayeMessageType[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;

    @g(InAppMessageBase.MESSAGE)
    public static final WsFayeMessageType MESSAGE = new WsFayeMessageType("MESSAGE", 0, InAppMessageBase.MESSAGE);

    @g("activity")
    public static final WsFayeMessageType ACTIVITY = new WsFayeMessageType("ACTIVITY", 1, "activity");

    @g("conversation:added")
    public static final WsFayeMessageType CONVERSATION_ADDED = new WsFayeMessageType("CONVERSATION_ADDED", 2, "conversation:added");

    @g("conversation:removed")
    public static final WsFayeMessageType CONVERSATION_REMOVED = new WsFayeMessageType("CONVERSATION_REMOVED", 3, "conversation:removed");

    @g("conversation:update")
    public static final WsFayeMessageType CONVERSATION_UPDATE = new WsFayeMessageType("CONVERSATION_UPDATE", 4, "conversation:update");

    @g("user:merge")
    public static final WsFayeMessageType USER_MERGE = new WsFayeMessageType("USER_MERGE", 5, "user:merge");

    @g("upload:failed")
    public static final WsFayeMessageType UPLOAD_FAILED = new WsFayeMessageType("UPLOAD_FAILED", 6, "upload:failed");

    @g(PaymentMethodTypes.UNKNOWN)
    public static final WsFayeMessageType UNKNOWN = new WsFayeMessageType("UNKNOWN", 7, PaymentMethodTypes.UNKNOWN);

    private static final /* synthetic */ WsFayeMessageType[] $values() {
        return new WsFayeMessageType[]{MESSAGE, ACTIVITY, CONVERSATION_ADDED, CONVERSATION_REMOVED, CONVERSATION_UPDATE, USER_MERGE, UPLOAD_FAILED, UNKNOWN};
    }

    static {
        WsFayeMessageType[] wsFayeMessageTypeArr$values = $values();
        $VALUES = wsFayeMessageTypeArr$values;
        $ENTRIES = n.w(wsFayeMessageTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new yu.a(26));
    }

    private WsFayeMessageType(String str, int i11, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return c1.e("zendesk.conversationkit.android.internal.faye.WsFayeMessageType", values(), new String[]{InAppMessageBase.MESSAGE, "activity", "conversation:added", "conversation:removed", "conversation:update", "user:merge", "upload:failed", PaymentMethodTypes.UNKNOWN}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static WsFayeMessageType valueOf(String str) {
        return (WsFayeMessageType) Enum.valueOf(WsFayeMessageType.class, str);
    }

    public static WsFayeMessageType[] values() {
        return (WsFayeMessageType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/WsFayeMessageType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/faye/WsFayeMessageType;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) WsFayeMessageType.$cachedSerializer$delegate.getValue();
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
