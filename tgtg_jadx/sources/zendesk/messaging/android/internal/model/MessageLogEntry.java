package zendesk.messaging.android.internal.model;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.core.ui.android.internal.model.MessagePosition;
import zendesk.core.ui.android.internal.model.MessageShape;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "MessageContainer", "TypingIndicatorContainer", "MessagesDivider", "TimestampDivider", "QuickReply", "LoadMore", "ImageMessageContainer", "FileMessageContainer", "TextMessageContainer", "FormMessageContainer", "CarouselContainer", "Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$LoadMore;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$MessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$MessagesDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$QuickReply;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TypingIndicatorContainer;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessageLogEntry {

    @NotNull
    private final String id;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$MessagesDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", TextBundle.TEXT_ENTRY, "type", "Lzendesk/messaging/android/internal/model/MessageLogType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessageLogType;)V", "getId", "()Ljava/lang/String;", "getText", "getType", "()Lzendesk/messaging/android/internal/model/MessageLogType;", "setType", "(Lzendesk/messaging/android/internal/model/MessageLogType;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessagesDivider extends MessageLogEntry {

        @NotNull
        private final String id;

        @NotNull
        private final String text;

        @NotNull
        private MessageLogType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagesDivider(@NotNull String str, @NotNull String str2, @NotNull MessageLogType messageLogType) {
            super(str, null);
            str.getClass();
            str2.getClass();
            messageLogType.getClass();
            this.id = str;
            this.text = str2;
            this.type = messageLogType;
        }

        public static /* synthetic */ MessagesDivider copy$default(MessagesDivider messagesDivider, String str, String str2, MessageLogType messageLogType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messagesDivider.id;
            }
            if ((i11 & 2) != 0) {
                str2 = messagesDivider.text;
            }
            if ((i11 & 4) != 0) {
                messageLogType = messagesDivider.type;
            }
            return messagesDivider.copy(str, str2, messageLogType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageLogType getType() {
            return this.type;
        }

        @NotNull
        public final MessagesDivider copy(@NotNull String id2, @NotNull String text, @NotNull MessageLogType type) {
            id2.getClass();
            text.getClass();
            type.getClass();
            return new MessagesDivider(id2, text, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagesDivider)) {
                return false;
            }
            MessagesDivider messagesDivider = (MessagesDivider) other;
            return Intrinsics.areEqual(this.id, messagesDivider.id) && Intrinsics.areEqual(this.text, messagesDivider.text) && this.type == messagesDivider.type;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final MessageLogType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + l1.b(this.id.hashCode() * 31, 31, this.text);
        }

        public final void setType(@NotNull MessageLogType messageLogType) {
            messageLogType.getClass();
            this.type = messageLogType;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.text;
            MessageLogType messageLogType = this.type;
            StringBuilder sbT = f.t("MessagesDivider(id=", str, ", text=", str2, ", type=");
            sbT.append(messageLogType);
            sbT.append(")");
            return sbT.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$QuickReply;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", "replies", "", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getReplies", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QuickReply extends MessageLogEntry {

        @NotNull
        private final String id;

        @NotNull
        private final List<MessageAction.Reply> replies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickReply(@NotNull String str, @NotNull List<MessageAction.Reply> list) {
            super(str, null);
            str.getClass();
            list.getClass();
            this.id = str;
            this.replies = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuickReply copy$default(QuickReply quickReply, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = quickReply.id;
            }
            if ((i11 & 2) != 0) {
                list = quickReply.replies;
            }
            return quickReply.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<MessageAction.Reply> component2() {
            return this.replies;
        }

        @NotNull
        public final QuickReply copy(@NotNull String id2, @NotNull List<MessageAction.Reply> replies) {
            id2.getClass();
            replies.getClass();
            return new QuickReply(id2, replies);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickReply)) {
                return false;
            }
            QuickReply quickReply = (QuickReply) other;
            return Intrinsics.areEqual(this.id, quickReply.id) && Intrinsics.areEqual(this.replies, quickReply.replies);
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final List<MessageAction.Reply> getReplies() {
            return this.replies;
        }

        public int hashCode() {
            return this.replies.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "QuickReply(id=" + this.id + ", replies=" + this.replies + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$TypingIndicatorContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAvatarUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TypingIndicatorContainer extends MessageLogEntry {

        @NotNull
        private final String avatarUrl;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypingIndicatorContainer(@NotNull String str, @NotNull String str2) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.id = str;
            this.avatarUrl = str2;
        }

        public static /* synthetic */ TypingIndicatorContainer copy$default(TypingIndicatorContainer typingIndicatorContainer, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = typingIndicatorContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = typingIndicatorContainer.avatarUrl;
            }
            return typingIndicatorContainer.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final TypingIndicatorContainer copy(@NotNull String id2, @NotNull String avatarUrl) {
            id2.getClass();
            avatarUrl.getClass();
            return new TypingIndicatorContainer(id2, avatarUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TypingIndicatorContainer)) {
                return false;
            }
            TypingIndicatorContainer typingIndicatorContainer = (TypingIndicatorContainer) other;
            return Intrinsics.areEqual(this.id, typingIndicatorContainer.id) && Intrinsics.areEqual(this.avatarUrl, typingIndicatorContainer.avatarUrl);
        }

        @NotNull
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.avatarUrl.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("TypingIndicatorContainer(id=", this.id, ", avatarUrl=", this.avatarUrl, ")");
        }
    }

    private MessageLogEntry(String str) {
        this.id = str;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    public /* synthetic */ MessageLogEntry(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "MessageTimeDivider", "MessageDayDivider", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider$MessageDayDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider$MessageTimeDivider;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class TimestampDivider extends MessageLogEntry {

        @NotNull
        private final String id;

        @NotNull
        private final String timestamp;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider$MessageDayDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider;", "id", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MessageDayDivider extends TimestampDivider {

            @NotNull
            private final String id;

            @NotNull
            private final String timestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MessageDayDivider(@NotNull String str, @NotNull String str2) {
                super(str, str2, null);
                str.getClass();
                str2.getClass();
                this.id = str;
                this.timestamp = str2;
            }

            public static /* synthetic */ MessageDayDivider copy$default(MessageDayDivider messageDayDivider, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = messageDayDivider.id;
                }
                if ((i11 & 2) != 0) {
                    str2 = messageDayDivider.timestamp;
                }
                return messageDayDivider.copy(str, str2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final MessageDayDivider copy(@NotNull String id2, @NotNull String timestamp) {
                id2.getClass();
                timestamp.getClass();
                return new MessageDayDivider(id2, timestamp);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MessageDayDivider)) {
                    return false;
                }
                MessageDayDivider messageDayDivider = (MessageDayDivider) other;
                return Intrinsics.areEqual(this.id, messageDayDivider.id) && Intrinsics.areEqual(this.timestamp, messageDayDivider.timestamp);
            }

            @Override // zendesk.messaging.android.internal.model.MessageLogEntry.TimestampDivider, zendesk.messaging.android.internal.model.MessageLogEntry
            @NotNull
            public String getId() {
                return this.id;
            }

            @Override // zendesk.messaging.android.internal.model.MessageLogEntry.TimestampDivider
            @NotNull
            public String getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return this.timestamp.hashCode() + (this.id.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.d("MessageDayDivider(id=", this.id, ", timestamp=", this.timestamp, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider$MessageTimeDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TimestampDivider;", "id", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MessageTimeDivider extends TimestampDivider {

            @NotNull
            private final String id;

            @NotNull
            private final String timestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MessageTimeDivider(@NotNull String str, @NotNull String str2) {
                super(str, str2, null);
                str.getClass();
                str2.getClass();
                this.id = str;
                this.timestamp = str2;
            }

            public static /* synthetic */ MessageTimeDivider copy$default(MessageTimeDivider messageTimeDivider, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = messageTimeDivider.id;
                }
                if ((i11 & 2) != 0) {
                    str2 = messageTimeDivider.timestamp;
                }
                return messageTimeDivider.copy(str, str2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final MessageTimeDivider copy(@NotNull String id2, @NotNull String timestamp) {
                id2.getClass();
                timestamp.getClass();
                return new MessageTimeDivider(id2, timestamp);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MessageTimeDivider)) {
                    return false;
                }
                MessageTimeDivider messageTimeDivider = (MessageTimeDivider) other;
                return Intrinsics.areEqual(this.id, messageTimeDivider.id) && Intrinsics.areEqual(this.timestamp, messageTimeDivider.timestamp);
            }

            @Override // zendesk.messaging.android.internal.model.MessageLogEntry.TimestampDivider, zendesk.messaging.android.internal.model.MessageLogEntry
            @NotNull
            public String getId() {
                return this.id;
            }

            @Override // zendesk.messaging.android.internal.model.MessageLogEntry.TimestampDivider
            @NotNull
            public String getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return this.timestamp.hashCode() + (this.id.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.d("MessageTimeDivider(id=", this.id, ", timestamp=", this.timestamp, ")");
            }
        }

        private TimestampDivider(String str, String str2) {
            super(str, null);
            this.id = str;
            this.timestamp = str2;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public String getTimestamp() {
            return this.timestamp;
        }

        public /* synthetic */ TimestampDivider(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$LoadMore;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", "failedRetryText", "status", "Lzendesk/messaging/android/internal/model/LoadMoreStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/LoadMoreStatus;)V", "getId", "()Ljava/lang/String;", "getFailedRetryText", "getStatus", "()Lzendesk/messaging/android/internal/model/LoadMoreStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadMore extends MessageLogEntry {

        @Nullable
        private final String failedRetryText;

        @NotNull
        private final String id;

        @NotNull
        private final LoadMoreStatus status;

        public /* synthetic */ LoadMore(String str, String str2, LoadMoreStatus loadMoreStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, (i11 & 2) != 0 ? null : str2, loadMoreStatus);
        }

        public static /* synthetic */ LoadMore copy$default(LoadMore loadMore, String str, String str2, LoadMoreStatus loadMoreStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadMore.id;
            }
            if ((i11 & 2) != 0) {
                str2 = loadMore.failedRetryText;
            }
            if ((i11 & 4) != 0) {
                loadMoreStatus = loadMore.status;
            }
            return loadMore.copy(str, str2, loadMoreStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFailedRetryText() {
            return this.failedRetryText;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final LoadMoreStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final LoadMore copy(@NotNull String id2, @Nullable String failedRetryText, @NotNull LoadMoreStatus status) {
            id2.getClass();
            status.getClass();
            return new LoadMore(id2, failedRetryText, status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMore)) {
                return false;
            }
            LoadMore loadMore = (LoadMore) other;
            return Intrinsics.areEqual(this.id, loadMore.id) && Intrinsics.areEqual(this.failedRetryText, loadMore.failedRetryText) && this.status == loadMore.status;
        }

        @Nullable
        public final String getFailedRetryText() {
            return this.failedRetryText;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final LoadMoreStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.failedRetryText;
            return this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.failedRetryText;
            LoadMoreStatus loadMoreStatus = this.status;
            StringBuilder sbT = f.t("LoadMore(id=", str, ", failedRetryText=", str2, ", status=");
            sbT.append(loadMoreStatus);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMore(@NotNull String str, @Nullable String str2, @NotNull LoadMoreStatus loadMoreStatus) {
            super(str, null);
            str.getClass();
            loadMoreStatus.getClass();
            this.id = str;
            this.failedRetryText = str2;
            this.status = loadMoreStatus;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u00068"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", AnnotatedPrivateKey.LABEL, "avatarUrl", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "authorizationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageDirection;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/core/ui/android/internal/model/MessageShape;Lzendesk/conversationkit/android/model/MessageStatus;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/model/MessageReceipt;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "getAvatarUrl", "getDirection", "()Lzendesk/core/ui/android/internal/model/MessageDirection;", "getPosition", "()Lzendesk/core/ui/android/internal/model/MessagePosition;", "getShape", "()Lzendesk/core/ui/android/internal/model/MessageShape;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getReceipt", "()Lzendesk/messaging/android/internal/model/MessageReceipt;", "getAuthorizationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageMessageContainer extends MessageLogEntry {

        @Nullable
        private final String authorizationToken;

        @Nullable
        private final String avatarUrl;

        @NotNull
        private final MessageDirection direction;

        @NotNull
        private final String id;

        @Nullable
        private final String label;

        @NotNull
        private final Message message;

        @NotNull
        private final MessagePosition position;

        @Nullable
        private final MessageReceipt receipt;

        @NotNull
        private final MessageShape shape;

        @NotNull
        private final MessageStatus status;

        public /* synthetic */ ImageMessageContainer(String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, messageDirection, (i11 & 16) != 0 ? MessagePosition.STANDALONE : messagePosition, (i11 & 32) != 0 ? MessageShape.STANDALONE : messageShape, messageStatus, message, (i11 & 256) != 0 ? null : messageReceipt, (i11 & 512) != 0 ? null : str4);
        }

        public static /* synthetic */ ImageMessageContainer copy$default(ImageMessageContainer imageMessageContainer, String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageMessageContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = imageMessageContainer.label;
            }
            if ((i11 & 4) != 0) {
                str3 = imageMessageContainer.avatarUrl;
            }
            if ((i11 & 8) != 0) {
                messageDirection = imageMessageContainer.direction;
            }
            if ((i11 & 16) != 0) {
                messagePosition = imageMessageContainer.position;
            }
            if ((i11 & 32) != 0) {
                messageShape = imageMessageContainer.shape;
            }
            if ((i11 & 64) != 0) {
                messageStatus = imageMessageContainer.status;
            }
            if ((i11 & 128) != 0) {
                message = imageMessageContainer.message;
            }
            if ((i11 & 256) != 0) {
                messageReceipt = imageMessageContainer.receipt;
            }
            if ((i11 & 512) != 0) {
                str4 = imageMessageContainer.authorizationToken;
            }
            MessageReceipt messageReceipt2 = messageReceipt;
            String str5 = str4;
            MessageStatus messageStatus2 = messageStatus;
            Message message2 = message;
            MessagePosition messagePosition2 = messagePosition;
            MessageShape messageShape2 = messageShape;
            return imageMessageContainer.copy(str, str2, str3, messageDirection, messagePosition2, messageShape2, messageStatus2, message2, messageReceipt2, str5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getAuthorizationToken() {
            return this.authorizationToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final ImageMessageContainer copy(@NotNull String id2, @Nullable String label, @Nullable String avatarUrl, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, @NotNull MessageStatus status, @NotNull Message message, @Nullable MessageReceipt receipt, @Nullable String authorizationToken) {
            id2.getClass();
            direction.getClass();
            position.getClass();
            shape.getClass();
            status.getClass();
            message.getClass();
            return new ImageMessageContainer(id2, label, avatarUrl, direction, position, shape, status, message, receipt, authorizationToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageMessageContainer)) {
                return false;
            }
            ImageMessageContainer imageMessageContainer = (ImageMessageContainer) other;
            return Intrinsics.areEqual(this.id, imageMessageContainer.id) && Intrinsics.areEqual(this.label, imageMessageContainer.label) && Intrinsics.areEqual(this.avatarUrl, imageMessageContainer.avatarUrl) && this.direction == imageMessageContainer.direction && this.position == imageMessageContainer.position && this.shape == imageMessageContainer.shape && Intrinsics.areEqual(this.status, imageMessageContainer.status) && Intrinsics.areEqual(this.message, imageMessageContainer.message) && Intrinsics.areEqual(this.receipt, imageMessageContainer.receipt) && Intrinsics.areEqual(this.authorizationToken, imageMessageContainer.authorizationToken);
        }

        @Nullable
        public final String getAuthorizationToken() {
            return this.authorizationToken;
        }

        @Nullable
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessagePosition getPosition() {
            return this.position;
        }

        @Nullable
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        public final MessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (this.message.hashCode() + ((this.status.hashCode() + ((this.shape.hashCode() + ((this.position.hashCode() + ((this.direction.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            MessageReceipt messageReceipt = this.receipt;
            int iHashCode4 = (iHashCode3 + (messageReceipt == null ? 0 : messageReceipt.hashCode())) * 31;
            String str3 = this.authorizationToken;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.label;
            String str3 = this.avatarUrl;
            MessageDirection messageDirection = this.direction;
            MessagePosition messagePosition = this.position;
            MessageShape messageShape = this.shape;
            MessageStatus messageStatus = this.status;
            Message message = this.message;
            MessageReceipt messageReceipt = this.receipt;
            String str4 = this.authorizationToken;
            StringBuilder sbT = f.t("ImageMessageContainer(id=", str, ", label=", str2, ", avatarUrl=");
            sbT.append(str3);
            sbT.append(", direction=");
            sbT.append(messageDirection);
            sbT.append(", position=");
            sbT.append(messagePosition);
            sbT.append(", shape=");
            sbT.append(messageShape);
            sbT.append(", status=");
            sbT.append(messageStatus);
            sbT.append(", message=");
            sbT.append(message);
            sbT.append(", receipt=");
            sbT.append(messageReceipt);
            sbT.append(", authorizationToken=");
            sbT.append(str4);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageMessageContainer(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull MessageDirection messageDirection, @NotNull MessagePosition messagePosition, @NotNull MessageShape messageShape, @NotNull MessageStatus messageStatus, @NotNull Message message, @Nullable MessageReceipt messageReceipt, @Nullable String str4) {
            super(str, null);
            str.getClass();
            messageDirection.getClass();
            messagePosition.getClass();
            messageShape.getClass();
            messageStatus.getClass();
            message.getClass();
            this.id = str;
            this.label = str2;
            this.avatarUrl = str3;
            this.direction = messageDirection;
            this.position = messagePosition;
            this.shape = messageShape;
            this.status = messageStatus;
            this.message = message;
            this.receipt = messageReceipt;
            this.authorizationToken = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Js\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", AnnotatedPrivateKey.LABEL, "avatarUrl", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "size", "Lzendesk/messaging/android/internal/model/MessageSize;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageDirection;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/core/ui/android/internal/model/MessageShape;Lzendesk/messaging/android/internal/model/MessageSize;Lzendesk/conversationkit/android/model/MessageStatus;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/model/MessageReceipt;)V", "getId", "()Ljava/lang/String;", "getLabel", "getAvatarUrl", "getDirection", "()Lzendesk/core/ui/android/internal/model/MessageDirection;", "getPosition", "()Lzendesk/core/ui/android/internal/model/MessagePosition;", "getShape", "()Lzendesk/core/ui/android/internal/model/MessageShape;", "getSize", "()Lzendesk/messaging/android/internal/model/MessageSize;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getReceipt", "()Lzendesk/messaging/android/internal/model/MessageReceipt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CarouselContainer extends MessageLogEntry {

        @Nullable
        private final String avatarUrl;

        @NotNull
        private final MessageDirection direction;

        @NotNull
        private final String id;

        @Nullable
        private final String label;

        @NotNull
        private final Message message;

        @NotNull
        private final MessagePosition position;

        @Nullable
        private final MessageReceipt receipt;

        @NotNull
        private final MessageShape shape;

        @NotNull
        private final MessageSize size;

        @NotNull
        private final MessageStatus status;

        public /* synthetic */ CarouselContainer(String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, messageDirection, (i11 & 16) != 0 ? MessagePosition.STANDALONE : messagePosition, (i11 & 32) != 0 ? MessageShape.STANDALONE : messageShape, (i11 & 64) != 0 ? MessageSize.NORMAL : messageSize, messageStatus, message, (i11 & 512) != 0 ? null : messageReceipt);
        }

        public static /* synthetic */ CarouselContainer copy$default(CarouselContainer carouselContainer, String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = carouselContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = carouselContainer.label;
            }
            if ((i11 & 4) != 0) {
                str3 = carouselContainer.avatarUrl;
            }
            if ((i11 & 8) != 0) {
                messageDirection = carouselContainer.direction;
            }
            if ((i11 & 16) != 0) {
                messagePosition = carouselContainer.position;
            }
            if ((i11 & 32) != 0) {
                messageShape = carouselContainer.shape;
            }
            if ((i11 & 64) != 0) {
                messageSize = carouselContainer.size;
            }
            if ((i11 & 128) != 0) {
                messageStatus = carouselContainer.status;
            }
            if ((i11 & 256) != 0) {
                message = carouselContainer.message;
            }
            if ((i11 & 512) != 0) {
                messageReceipt = carouselContainer.receipt;
            }
            Message message2 = message;
            MessageReceipt messageReceipt2 = messageReceipt;
            MessageSize messageSize2 = messageSize;
            MessageStatus messageStatus2 = messageStatus;
            MessagePosition messagePosition2 = messagePosition;
            MessageShape messageShape2 = messageShape;
            return carouselContainer.copy(str, str2, str3, messageDirection, messagePosition2, messageShape2, messageSize2, messageStatus2, message2, messageReceipt2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final MessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final CarouselContainer copy(@NotNull String id2, @Nullable String label, @Nullable String avatarUrl, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, @NotNull MessageSize size, @NotNull MessageStatus status, @NotNull Message message, @Nullable MessageReceipt receipt) {
            id2.getClass();
            direction.getClass();
            position.getClass();
            shape.getClass();
            size.getClass();
            status.getClass();
            message.getClass();
            return new CarouselContainer(id2, label, avatarUrl, direction, position, shape, size, status, message, receipt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarouselContainer)) {
                return false;
            }
            CarouselContainer carouselContainer = (CarouselContainer) other;
            return Intrinsics.areEqual(this.id, carouselContainer.id) && Intrinsics.areEqual(this.label, carouselContainer.label) && Intrinsics.areEqual(this.avatarUrl, carouselContainer.avatarUrl) && this.direction == carouselContainer.direction && this.position == carouselContainer.position && this.shape == carouselContainer.shape && this.size == carouselContainer.size && Intrinsics.areEqual(this.status, carouselContainer.status) && Intrinsics.areEqual(this.message, carouselContainer.message) && Intrinsics.areEqual(this.receipt, carouselContainer.receipt);
        }

        @Nullable
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessagePosition getPosition() {
            return this.position;
        }

        @Nullable
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (this.message.hashCode() + ((this.status.hashCode() + ((this.size.hashCode() + ((this.shape.hashCode() + ((this.position.hashCode() + ((this.direction.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            MessageReceipt messageReceipt = this.receipt;
            return iHashCode3 + (messageReceipt != null ? messageReceipt.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.label;
            String str3 = this.avatarUrl;
            MessageDirection messageDirection = this.direction;
            MessagePosition messagePosition = this.position;
            MessageShape messageShape = this.shape;
            MessageSize messageSize = this.size;
            MessageStatus messageStatus = this.status;
            Message message = this.message;
            MessageReceipt messageReceipt = this.receipt;
            StringBuilder sbT = f.t("CarouselContainer(id=", str, ", label=", str2, ", avatarUrl=");
            sbT.append(str3);
            sbT.append(", direction=");
            sbT.append(messageDirection);
            sbT.append(", position=");
            sbT.append(messagePosition);
            sbT.append(", shape=");
            sbT.append(messageShape);
            sbT.append(", size=");
            sbT.append(messageSize);
            sbT.append(", status=");
            sbT.append(messageStatus);
            sbT.append(", message=");
            sbT.append(message);
            sbT.append(", receipt=");
            sbT.append(messageReceipt);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselContainer(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull MessageDirection messageDirection, @NotNull MessagePosition messagePosition, @NotNull MessageShape messageShape, @NotNull MessageSize messageSize, @NotNull MessageStatus messageStatus, @NotNull Message message, @Nullable MessageReceipt messageReceipt) {
            super(str, null);
            str.getClass();
            messageDirection.getClass();
            messagePosition.getClass();
            messageShape.getClass();
            messageSize.getClass();
            messageStatus.getClass();
            message.getClass();
            this.id = str;
            this.label = str2;
            this.avatarUrl = str3;
            this.direction = messageDirection;
            this.position = messagePosition;
            this.shape = messageShape;
            this.size = messageSize;
            this.status = messageStatus;
            this.message = message;
            this.receipt = messageReceipt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Js\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", AnnotatedPrivateKey.LABEL, "avatarUrl", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "size", "Lzendesk/messaging/android/internal/model/MessageSize;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageDirection;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/core/ui/android/internal/model/MessageShape;Lzendesk/messaging/android/internal/model/MessageSize;Lzendesk/conversationkit/android/model/MessageStatus;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/model/MessageReceipt;)V", "getId", "()Ljava/lang/String;", "getLabel", "getAvatarUrl", "getDirection", "()Lzendesk/core/ui/android/internal/model/MessageDirection;", "getPosition", "()Lzendesk/core/ui/android/internal/model/MessagePosition;", "getShape", "()Lzendesk/core/ui/android/internal/model/MessageShape;", "getSize", "()Lzendesk/messaging/android/internal/model/MessageSize;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getReceipt", "()Lzendesk/messaging/android/internal/model/MessageReceipt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileMessageContainer extends MessageLogEntry {

        @Nullable
        private final String avatarUrl;

        @NotNull
        private final MessageDirection direction;

        @NotNull
        private final String id;

        @Nullable
        private final String label;

        @NotNull
        private final Message message;

        @NotNull
        private final MessagePosition position;

        @Nullable
        private final MessageReceipt receipt;

        @NotNull
        private final MessageShape shape;

        @NotNull
        private final MessageSize size;

        @NotNull
        private final MessageStatus status;

        public /* synthetic */ FileMessageContainer(String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, messageDirection, (i11 & 16) != 0 ? MessagePosition.STANDALONE : messagePosition, (i11 & 32) != 0 ? MessageShape.STANDALONE : messageShape, (i11 & 64) != 0 ? MessageSize.NORMAL : messageSize, messageStatus, message, (i11 & 512) != 0 ? null : messageReceipt);
        }

        public static /* synthetic */ FileMessageContainer copy$default(FileMessageContainer fileMessageContainer, String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fileMessageContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = fileMessageContainer.label;
            }
            if ((i11 & 4) != 0) {
                str3 = fileMessageContainer.avatarUrl;
            }
            if ((i11 & 8) != 0) {
                messageDirection = fileMessageContainer.direction;
            }
            if ((i11 & 16) != 0) {
                messagePosition = fileMessageContainer.position;
            }
            if ((i11 & 32) != 0) {
                messageShape = fileMessageContainer.shape;
            }
            if ((i11 & 64) != 0) {
                messageSize = fileMessageContainer.size;
            }
            if ((i11 & 128) != 0) {
                messageStatus = fileMessageContainer.status;
            }
            if ((i11 & 256) != 0) {
                message = fileMessageContainer.message;
            }
            if ((i11 & 512) != 0) {
                messageReceipt = fileMessageContainer.receipt;
            }
            Message message2 = message;
            MessageReceipt messageReceipt2 = messageReceipt;
            MessageSize messageSize2 = messageSize;
            MessageStatus messageStatus2 = messageStatus;
            MessagePosition messagePosition2 = messagePosition;
            MessageShape messageShape2 = messageShape;
            return fileMessageContainer.copy(str, str2, str3, messageDirection, messagePosition2, messageShape2, messageSize2, messageStatus2, message2, messageReceipt2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final MessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final FileMessageContainer copy(@NotNull String id2, @Nullable String label, @Nullable String avatarUrl, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, @NotNull MessageSize size, @NotNull MessageStatus status, @NotNull Message message, @Nullable MessageReceipt receipt) {
            id2.getClass();
            direction.getClass();
            position.getClass();
            shape.getClass();
            size.getClass();
            status.getClass();
            message.getClass();
            return new FileMessageContainer(id2, label, avatarUrl, direction, position, shape, size, status, message, receipt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileMessageContainer)) {
                return false;
            }
            FileMessageContainer fileMessageContainer = (FileMessageContainer) other;
            return Intrinsics.areEqual(this.id, fileMessageContainer.id) && Intrinsics.areEqual(this.label, fileMessageContainer.label) && Intrinsics.areEqual(this.avatarUrl, fileMessageContainer.avatarUrl) && this.direction == fileMessageContainer.direction && this.position == fileMessageContainer.position && this.shape == fileMessageContainer.shape && this.size == fileMessageContainer.size && Intrinsics.areEqual(this.status, fileMessageContainer.status) && Intrinsics.areEqual(this.message, fileMessageContainer.message) && Intrinsics.areEqual(this.receipt, fileMessageContainer.receipt);
        }

        @Nullable
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessagePosition getPosition() {
            return this.position;
        }

        @Nullable
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (this.message.hashCode() + ((this.status.hashCode() + ((this.size.hashCode() + ((this.shape.hashCode() + ((this.position.hashCode() + ((this.direction.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            MessageReceipt messageReceipt = this.receipt;
            return iHashCode3 + (messageReceipt != null ? messageReceipt.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.label;
            String str3 = this.avatarUrl;
            MessageDirection messageDirection = this.direction;
            MessagePosition messagePosition = this.position;
            MessageShape messageShape = this.shape;
            MessageSize messageSize = this.size;
            MessageStatus messageStatus = this.status;
            Message message = this.message;
            MessageReceipt messageReceipt = this.receipt;
            StringBuilder sbT = f.t("FileMessageContainer(id=", str, ", label=", str2, ", avatarUrl=");
            sbT.append(str3);
            sbT.append(", direction=");
            sbT.append(messageDirection);
            sbT.append(", position=");
            sbT.append(messagePosition);
            sbT.append(", shape=");
            sbT.append(messageShape);
            sbT.append(", size=");
            sbT.append(messageSize);
            sbT.append(", status=");
            sbT.append(messageStatus);
            sbT.append(", message=");
            sbT.append(message);
            sbT.append(", receipt=");
            sbT.append(messageReceipt);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileMessageContainer(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull MessageDirection messageDirection, @NotNull MessagePosition messagePosition, @NotNull MessageShape messageShape, @NotNull MessageSize messageSize, @NotNull MessageStatus messageStatus, @NotNull Message message, @Nullable MessageReceipt messageReceipt) {
            super(str, null);
            str.getClass();
            messageDirection.getClass();
            messagePosition.getClass();
            messageShape.getClass();
            messageSize.getClass();
            messageStatus.getClass();
            message.getClass();
            this.id = str;
            this.label = str2;
            this.avatarUrl = str3;
            this.direction = messageDirection;
            this.position = messagePosition;
            this.shape = messageShape;
            this.size = messageSize;
            this.status = messageStatus;
            this.message = message;
            this.receipt = messageReceipt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Js\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", AnnotatedPrivateKey.LABEL, "avatarUrl", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "size", "Lzendesk/messaging/android/internal/model/MessageSize;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageDirection;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/core/ui/android/internal/model/MessageShape;Lzendesk/messaging/android/internal/model/MessageSize;Lzendesk/conversationkit/android/model/MessageStatus;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/model/MessageReceipt;)V", "getId", "()Ljava/lang/String;", "getLabel", "getAvatarUrl", "getDirection", "()Lzendesk/core/ui/android/internal/model/MessageDirection;", "getPosition", "()Lzendesk/core/ui/android/internal/model/MessagePosition;", "getShape", "()Lzendesk/core/ui/android/internal/model/MessageShape;", "getSize", "()Lzendesk/messaging/android/internal/model/MessageSize;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getReceipt", "()Lzendesk/messaging/android/internal/model/MessageReceipt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormMessageContainer extends MessageLogEntry {

        @Nullable
        private final String avatarUrl;

        @NotNull
        private final MessageDirection direction;

        @NotNull
        private final String id;

        @Nullable
        private final String label;

        @NotNull
        private final Message message;

        @NotNull
        private final MessagePosition position;

        @Nullable
        private final MessageReceipt receipt;

        @NotNull
        private final MessageShape shape;

        @NotNull
        private final MessageSize size;

        @NotNull
        private final MessageStatus status;

        public /* synthetic */ FormMessageContainer(String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, messageDirection, (i11 & 16) != 0 ? MessagePosition.STANDALONE : messagePosition, (i11 & 32) != 0 ? MessageShape.STANDALONE : messageShape, (i11 & 64) != 0 ? MessageSize.NORMAL : messageSize, messageStatus, message, (i11 & 512) != 0 ? null : messageReceipt);
        }

        public static /* synthetic */ FormMessageContainer copy$default(FormMessageContainer formMessageContainer, String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = formMessageContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = formMessageContainer.label;
            }
            if ((i11 & 4) != 0) {
                str3 = formMessageContainer.avatarUrl;
            }
            if ((i11 & 8) != 0) {
                messageDirection = formMessageContainer.direction;
            }
            if ((i11 & 16) != 0) {
                messagePosition = formMessageContainer.position;
            }
            if ((i11 & 32) != 0) {
                messageShape = formMessageContainer.shape;
            }
            if ((i11 & 64) != 0) {
                messageSize = formMessageContainer.size;
            }
            if ((i11 & 128) != 0) {
                messageStatus = formMessageContainer.status;
            }
            if ((i11 & 256) != 0) {
                message = formMessageContainer.message;
            }
            if ((i11 & 512) != 0) {
                messageReceipt = formMessageContainer.receipt;
            }
            Message message2 = message;
            MessageReceipt messageReceipt2 = messageReceipt;
            MessageSize messageSize2 = messageSize;
            MessageStatus messageStatus2 = messageStatus;
            MessagePosition messagePosition2 = messagePosition;
            MessageShape messageShape2 = messageShape;
            return formMessageContainer.copy(str, str2, str3, messageDirection, messagePosition2, messageShape2, messageSize2, messageStatus2, message2, messageReceipt2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final MessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final FormMessageContainer copy(@NotNull String id2, @Nullable String label, @Nullable String avatarUrl, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, @NotNull MessageSize size, @NotNull MessageStatus status, @NotNull Message message, @Nullable MessageReceipt receipt) {
            id2.getClass();
            direction.getClass();
            position.getClass();
            shape.getClass();
            size.getClass();
            status.getClass();
            message.getClass();
            return new FormMessageContainer(id2, label, avatarUrl, direction, position, shape, size, status, message, receipt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormMessageContainer)) {
                return false;
            }
            FormMessageContainer formMessageContainer = (FormMessageContainer) other;
            return Intrinsics.areEqual(this.id, formMessageContainer.id) && Intrinsics.areEqual(this.label, formMessageContainer.label) && Intrinsics.areEqual(this.avatarUrl, formMessageContainer.avatarUrl) && this.direction == formMessageContainer.direction && this.position == formMessageContainer.position && this.shape == formMessageContainer.shape && this.size == formMessageContainer.size && Intrinsics.areEqual(this.status, formMessageContainer.status) && Intrinsics.areEqual(this.message, formMessageContainer.message) && Intrinsics.areEqual(this.receipt, formMessageContainer.receipt);
        }

        @Nullable
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessagePosition getPosition() {
            return this.position;
        }

        @Nullable
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (this.message.hashCode() + ((this.status.hashCode() + ((this.size.hashCode() + ((this.shape.hashCode() + ((this.position.hashCode() + ((this.direction.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            MessageReceipt messageReceipt = this.receipt;
            return iHashCode3 + (messageReceipt != null ? messageReceipt.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.label;
            String str3 = this.avatarUrl;
            MessageDirection messageDirection = this.direction;
            MessagePosition messagePosition = this.position;
            MessageShape messageShape = this.shape;
            MessageSize messageSize = this.size;
            MessageStatus messageStatus = this.status;
            Message message = this.message;
            MessageReceipt messageReceipt = this.receipt;
            StringBuilder sbT = f.t("FormMessageContainer(id=", str, ", label=", str2, ", avatarUrl=");
            sbT.append(str3);
            sbT.append(", direction=");
            sbT.append(messageDirection);
            sbT.append(", position=");
            sbT.append(messagePosition);
            sbT.append(", shape=");
            sbT.append(messageShape);
            sbT.append(", size=");
            sbT.append(messageSize);
            sbT.append(", status=");
            sbT.append(messageStatus);
            sbT.append(", message=");
            sbT.append(message);
            sbT.append(", receipt=");
            sbT.append(messageReceipt);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormMessageContainer(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull MessageDirection messageDirection, @NotNull MessagePosition messagePosition, @NotNull MessageShape messageShape, @NotNull MessageSize messageSize, @NotNull MessageStatus messageStatus, @NotNull Message message, @Nullable MessageReceipt messageReceipt) {
            super(str, null);
            str.getClass();
            messageDirection.getClass();
            messagePosition.getClass();
            messageShape.getClass();
            messageSize.getClass();
            messageStatus.getClass();
            message.getClass();
            this.id = str;
            this.label = str2;
            this.avatarUrl = str3;
            this.direction = messageDirection;
            this.position = messagePosition;
            this.shape = messageShape;
            this.size = messageSize;
            this.status = messageStatus;
            this.message = message;
            this.receipt = messageReceipt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Js\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$MessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", AnnotatedPrivateKey.LABEL, "avatarUrl", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "size", "Lzendesk/messaging/android/internal/model/MessageSize;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageDirection;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/core/ui/android/internal/model/MessageShape;Lzendesk/messaging/android/internal/model/MessageSize;Lzendesk/conversationkit/android/model/MessageStatus;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/model/MessageReceipt;)V", "getId", "()Ljava/lang/String;", "getLabel", "getAvatarUrl", "getDirection", "()Lzendesk/core/ui/android/internal/model/MessageDirection;", "getPosition", "()Lzendesk/core/ui/android/internal/model/MessagePosition;", "getShape", "()Lzendesk/core/ui/android/internal/model/MessageShape;", "getSize", "()Lzendesk/messaging/android/internal/model/MessageSize;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getReceipt", "()Lzendesk/messaging/android/internal/model/MessageReceipt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageContainer extends MessageLogEntry {

        @Nullable
        private final String avatarUrl;

        @NotNull
        private final MessageDirection direction;

        @NotNull
        private final String id;

        @Nullable
        private final String label;

        @NotNull
        private final Message message;

        @NotNull
        private final MessagePosition position;

        @Nullable
        private final MessageReceipt receipt;

        @NotNull
        private final MessageShape shape;

        @NotNull
        private final MessageSize size;

        @NotNull
        private final MessageStatus status;

        public /* synthetic */ MessageContainer(String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, messageDirection, (i11 & 16) != 0 ? MessagePosition.STANDALONE : messagePosition, (i11 & 32) != 0 ? MessageShape.STANDALONE : messageShape, (i11 & 64) != 0 ? MessageSize.NORMAL : messageSize, messageStatus, message, (i11 & 512) != 0 ? null : messageReceipt);
        }

        public static /* synthetic */ MessageContainer copy$default(MessageContainer messageContainer, String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messageContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = messageContainer.label;
            }
            if ((i11 & 4) != 0) {
                str3 = messageContainer.avatarUrl;
            }
            if ((i11 & 8) != 0) {
                messageDirection = messageContainer.direction;
            }
            if ((i11 & 16) != 0) {
                messagePosition = messageContainer.position;
            }
            if ((i11 & 32) != 0) {
                messageShape = messageContainer.shape;
            }
            if ((i11 & 64) != 0) {
                messageSize = messageContainer.size;
            }
            if ((i11 & 128) != 0) {
                messageStatus = messageContainer.status;
            }
            if ((i11 & 256) != 0) {
                message = messageContainer.message;
            }
            if ((i11 & 512) != 0) {
                messageReceipt = messageContainer.receipt;
            }
            Message message2 = message;
            MessageReceipt messageReceipt2 = messageReceipt;
            MessageSize messageSize2 = messageSize;
            MessageStatus messageStatus2 = messageStatus;
            MessagePosition messagePosition2 = messagePosition;
            MessageShape messageShape2 = messageShape;
            return messageContainer.copy(str, str2, str3, messageDirection, messagePosition2, messageShape2, messageSize2, messageStatus2, message2, messageReceipt2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final MessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessageContainer copy(@NotNull String id2, @Nullable String label, @Nullable String avatarUrl, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, @NotNull MessageSize size, @NotNull MessageStatus status, @NotNull Message message, @Nullable MessageReceipt receipt) {
            id2.getClass();
            direction.getClass();
            position.getClass();
            shape.getClass();
            size.getClass();
            status.getClass();
            message.getClass();
            return new MessageContainer(id2, label, avatarUrl, direction, position, shape, size, status, message, receipt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageContainer)) {
                return false;
            }
            MessageContainer messageContainer = (MessageContainer) other;
            return Intrinsics.areEqual(this.id, messageContainer.id) && Intrinsics.areEqual(this.label, messageContainer.label) && Intrinsics.areEqual(this.avatarUrl, messageContainer.avatarUrl) && this.direction == messageContainer.direction && this.position == messageContainer.position && this.shape == messageContainer.shape && this.size == messageContainer.size && Intrinsics.areEqual(this.status, messageContainer.status) && Intrinsics.areEqual(this.message, messageContainer.message) && Intrinsics.areEqual(this.receipt, messageContainer.receipt);
        }

        @Nullable
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessagePosition getPosition() {
            return this.position;
        }

        @Nullable
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (this.message.hashCode() + ((this.status.hashCode() + ((this.size.hashCode() + ((this.shape.hashCode() + ((this.position.hashCode() + ((this.direction.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            MessageReceipt messageReceipt = this.receipt;
            return iHashCode3 + (messageReceipt != null ? messageReceipt.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.label;
            String str3 = this.avatarUrl;
            MessageDirection messageDirection = this.direction;
            MessagePosition messagePosition = this.position;
            MessageShape messageShape = this.shape;
            MessageSize messageSize = this.size;
            MessageStatus messageStatus = this.status;
            Message message = this.message;
            MessageReceipt messageReceipt = this.receipt;
            StringBuilder sbT = f.t("MessageContainer(id=", str, ", label=", str2, ", avatarUrl=");
            sbT.append(str3);
            sbT.append(", direction=");
            sbT.append(messageDirection);
            sbT.append(", position=");
            sbT.append(messagePosition);
            sbT.append(", shape=");
            sbT.append(messageShape);
            sbT.append(", size=");
            sbT.append(messageSize);
            sbT.append(", status=");
            sbT.append(messageStatus);
            sbT.append(", message=");
            sbT.append(message);
            sbT.append(", receipt=");
            sbT.append(messageReceipt);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageContainer(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull MessageDirection messageDirection, @NotNull MessagePosition messagePosition, @NotNull MessageShape messageShape, @NotNull MessageSize messageSize, @NotNull MessageStatus messageStatus, @NotNull Message message, @Nullable MessageReceipt messageReceipt) {
            super(str, null);
            str.getClass();
            messageDirection.getClass();
            messagePosition.getClass();
            messageShape.getClass();
            messageSize.getClass();
            messageStatus.getClass();
            message.getClass();
            this.id = str;
            this.label = str2;
            this.avatarUrl = str3;
            this.direction = messageDirection;
            this.position = messagePosition;
            this.shape = messageShape;
            this.size = messageSize;
            this.status = messageStatus;
            this.message = message;
            this.receipt = messageReceipt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Js\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "id", "", AnnotatedPrivateKey.LABEL, "avatarUrl", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "size", "Lzendesk/messaging/android/internal/model/MessageSize;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageDirection;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/core/ui/android/internal/model/MessageShape;Lzendesk/messaging/android/internal/model/MessageSize;Lzendesk/conversationkit/android/model/MessageStatus;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/model/MessageReceipt;)V", "getId", "()Ljava/lang/String;", "getLabel", "getAvatarUrl", "getDirection", "()Lzendesk/core/ui/android/internal/model/MessageDirection;", "getPosition", "()Lzendesk/core/ui/android/internal/model/MessagePosition;", "getShape", "()Lzendesk/core/ui/android/internal/model/MessageShape;", "getSize", "()Lzendesk/messaging/android/internal/model/MessageSize;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getReceipt", "()Lzendesk/messaging/android/internal/model/MessageReceipt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextMessageContainer extends MessageLogEntry {

        @Nullable
        private final String avatarUrl;

        @NotNull
        private final MessageDirection direction;

        @NotNull
        private final String id;

        @Nullable
        private final String label;

        @NotNull
        private final Message message;

        @NotNull
        private final MessagePosition position;

        @Nullable
        private final MessageReceipt receipt;

        @NotNull
        private final MessageShape shape;

        @NotNull
        private final MessageSize size;

        @NotNull
        private final MessageStatus status;

        public /* synthetic */ TextMessageContainer(String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, messageDirection, (i11 & 16) != 0 ? MessagePosition.STANDALONE : messagePosition, (i11 & 32) != 0 ? MessageShape.STANDALONE : messageShape, (i11 & 64) != 0 ? MessageSize.NORMAL : messageSize, messageStatus, message, (i11 & 512) != 0 ? null : messageReceipt);
        }

        public static /* synthetic */ TextMessageContainer copy$default(TextMessageContainer textMessageContainer, String str, String str2, String str3, MessageDirection messageDirection, MessagePosition messagePosition, MessageShape messageShape, MessageSize messageSize, MessageStatus messageStatus, Message message, MessageReceipt messageReceipt, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textMessageContainer.id;
            }
            if ((i11 & 2) != 0) {
                str2 = textMessageContainer.label;
            }
            if ((i11 & 4) != 0) {
                str3 = textMessageContainer.avatarUrl;
            }
            if ((i11 & 8) != 0) {
                messageDirection = textMessageContainer.direction;
            }
            if ((i11 & 16) != 0) {
                messagePosition = textMessageContainer.position;
            }
            if ((i11 & 32) != 0) {
                messageShape = textMessageContainer.shape;
            }
            if ((i11 & 64) != 0) {
                messageSize = textMessageContainer.size;
            }
            if ((i11 & 128) != 0) {
                messageStatus = textMessageContainer.status;
            }
            if ((i11 & 256) != 0) {
                message = textMessageContainer.message;
            }
            if ((i11 & 512) != 0) {
                messageReceipt = textMessageContainer.receipt;
            }
            Message message2 = message;
            MessageReceipt messageReceipt2 = messageReceipt;
            MessageSize messageSize2 = messageSize;
            MessageStatus messageStatus2 = messageStatus;
            MessagePosition messagePosition2 = messagePosition;
            MessageShape messageShape2 = messageShape;
            return textMessageContainer.copy(str, str2, str3, messageDirection, messagePosition2, messageShape2, messageSize2, messageStatus2, message2, messageReceipt2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final MessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final TextMessageContainer copy(@NotNull String id2, @Nullable String label, @Nullable String avatarUrl, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, @NotNull MessageSize size, @NotNull MessageStatus status, @NotNull Message message, @Nullable MessageReceipt receipt) {
            id2.getClass();
            direction.getClass();
            position.getClass();
            shape.getClass();
            size.getClass();
            status.getClass();
            message.getClass();
            return new TextMessageContainer(id2, label, avatarUrl, direction, position, shape, size, status, message, receipt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextMessageContainer)) {
                return false;
            }
            TextMessageContainer textMessageContainer = (TextMessageContainer) other;
            return Intrinsics.areEqual(this.id, textMessageContainer.id) && Intrinsics.areEqual(this.label, textMessageContainer.label) && Intrinsics.areEqual(this.avatarUrl, textMessageContainer.avatarUrl) && this.direction == textMessageContainer.direction && this.position == textMessageContainer.position && this.shape == textMessageContainer.shape && this.size == textMessageContainer.size && Intrinsics.areEqual(this.status, textMessageContainer.status) && Intrinsics.areEqual(this.message, textMessageContainer.message) && Intrinsics.areEqual(this.receipt, textMessageContainer.receipt);
        }

        @Nullable
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final MessageDirection getDirection() {
            return this.direction;
        }

        @Override // zendesk.messaging.android.internal.model.MessageLogEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessagePosition getPosition() {
            return this.position;
        }

        @Nullable
        public final MessageReceipt getReceipt() {
            return this.receipt;
        }

        @NotNull
        public final MessageShape getShape() {
            return this.shape;
        }

        @NotNull
        public final MessageSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (this.message.hashCode() + ((this.status.hashCode() + ((this.size.hashCode() + ((this.shape.hashCode() + ((this.position.hashCode() + ((this.direction.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            MessageReceipt messageReceipt = this.receipt;
            return iHashCode3 + (messageReceipt != null ? messageReceipt.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.label;
            String str3 = this.avatarUrl;
            MessageDirection messageDirection = this.direction;
            MessagePosition messagePosition = this.position;
            MessageShape messageShape = this.shape;
            MessageSize messageSize = this.size;
            MessageStatus messageStatus = this.status;
            Message message = this.message;
            MessageReceipt messageReceipt = this.receipt;
            StringBuilder sbT = f.t("TextMessageContainer(id=", str, ", label=", str2, ", avatarUrl=");
            sbT.append(str3);
            sbT.append(", direction=");
            sbT.append(messageDirection);
            sbT.append(", position=");
            sbT.append(messagePosition);
            sbT.append(", shape=");
            sbT.append(messageShape);
            sbT.append(", size=");
            sbT.append(messageSize);
            sbT.append(", status=");
            sbT.append(messageStatus);
            sbT.append(", message=");
            sbT.append(message);
            sbT.append(", receipt=");
            sbT.append(messageReceipt);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextMessageContainer(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull MessageDirection messageDirection, @NotNull MessagePosition messagePosition, @NotNull MessageShape messageShape, @NotNull MessageSize messageSize, @NotNull MessageStatus messageStatus, @NotNull Message message, @Nullable MessageReceipt messageReceipt) {
            super(str, null);
            str.getClass();
            messageDirection.getClass();
            messagePosition.getClass();
            messageShape.getClass();
            messageSize.getClass();
            messageStatus.getClass();
            message.getClass();
            this.id = str;
            this.label = str2;
            this.avatarUrl = str3;
            this.direction = messageDirection;
            this.position = messagePosition;
            this.shape = messageShape;
            this.size = messageSize;
            this.status = messageStatus;
            this.message = message;
            this.receipt = messageReceipt;
        }
    }
}
