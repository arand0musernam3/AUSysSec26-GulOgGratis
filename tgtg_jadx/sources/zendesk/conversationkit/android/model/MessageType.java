package zendesk.conversationkit.android.model;

import a80.a;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import db0.c;
import i90.h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.i18n.TextBundle;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/model/MessageType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$zendesk_conversationkit_conversationkit_android", "()Ljava/lang/String;", "UNSUPPORTED", "TEXT", "FILE_UPLOAD", "FILE", "IMAGE", "CAROUSEL", "LIST", "LOCATION", "FORM", "FORM_RESPONSE", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageType[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final MessageType UNSUPPORTED = new MessageType("UNSUPPORTED", 0, "unsupported");
    public static final MessageType TEXT = new MessageType("TEXT", 1, TextBundle.TEXT_ENTRY);
    public static final MessageType FILE_UPLOAD = new MessageType("FILE_UPLOAD", 2, "file_upload");
    public static final MessageType FILE = new MessageType("FILE", 3, "file");
    public static final MessageType IMAGE = new MessageType("IMAGE", 4, "image");
    public static final MessageType CAROUSEL = new MessageType("CAROUSEL", 5, "carousel");
    public static final MessageType LIST = new MessageType("LIST", 6, DefaultIssuerListDelegate.ANALYTICS_TARGET);
    public static final MessageType LOCATION = new MessageType("LOCATION", 7, "location");
    public static final MessageType FORM = new MessageType("FORM", 8, "form");
    public static final MessageType FORM_RESPONSE = new MessageType("FORM_RESPONSE", 9, "formResponse");

    private static final /* synthetic */ MessageType[] $values() {
        return new MessageType[]{UNSUPPORTED, TEXT, FILE_UPLOAD, FILE, IMAGE, CAROUSEL, LIST, LOCATION, FORM, FORM_RESPONSE};
    }

    static {
        MessageType[] messageTypeArr$values = $values();
        $VALUES = messageTypeArr$values;
        $ENTRIES = n.w(messageTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new c(6));
    }

    private MessageType(String str, int i11, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        MessageType[] messageTypeArrValues = values();
        messageTypeArrValues.getClass();
        return new i90.a("zendesk.conversationkit.android.model.MessageType", (Enum[]) messageTypeArrValues);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/model/MessageType$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/conversationkit/android/model/MessageType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\nzendesk/conversationkit/android/model/MessageType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,917:1\n1#2:918\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final MessageType findByValue(@NotNull String value) {
            Object next;
            value.getClass();
            Iterator<E> it = MessageType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((MessageType) next).getValue(), value)) {
                    break;
                }
            }
            MessageType messageType = (MessageType) next;
            return messageType == null ? MessageType.UNSUPPORTED : messageType;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
