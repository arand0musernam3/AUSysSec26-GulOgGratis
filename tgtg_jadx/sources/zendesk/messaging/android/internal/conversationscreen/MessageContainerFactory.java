package zendesk.messaging.android.internal.conversationscreen;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.conversationkit.android.model.MessageType;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.core.ui.android.internal.model.MessagePosition;
import zendesk.core.ui.android.internal.model.MessageShape;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessageReceipt;
import zendesk.messaging.android.internal.model.MessageSize;
import zendesk.messaging.android.internal.model.MessageStatusIcon;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J@\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory;", "", "labelProvider", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;", "timestampFormatter", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;", MessagingComponentKt.CURRENT_TIME_PROVIDER, "Lkotlin/Function0;", "Ljava/util/Date;", "<init>", "(Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;Lkotlin/jvm/functions/Function0;)V", "createMessageContainer", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "isLatestMessage", "", "authorizationToken", "", "createSingleMessageContainer", "createUnsupportedMessageContainer", "createCarouselMessageContainer", "createTextMessageContainer", "createImageMessageContainer", "createFileMessageContainer", "createFormMessageContainer", "getReceipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageContainerFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageContainerFactory.kt\nzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,491:1\n1#2:492\n808#3,11:493\n*S KotlinDebug\n*F\n+ 1 MessageContainerFactory.kt\nzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory\n*L\n288#1:493,11\n*E\n"})
public final class MessageContainerFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAXIMUM_FILE_SIZE_IN_MB = 50;

    @NotNull
    private final Function0<Date> currentTimeProvider;

    @NotNull
    private final MessageLogLabelProvider labelProvider;

    @NotNull
    private final MessageLogTimestampFormatter timestampFormatter;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.UNSUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageType.FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MessageType.FILE_UPLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MessageType.FORM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MessageType.FORM_RESPONSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MessageType.IMAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageContainerFactory(@NotNull MessageLogLabelProvider messageLogLabelProvider, @NotNull MessageLogTimestampFormatter messageLogTimestampFormatter, @NotNull Function0<? extends Date> function0) {
        messageLogLabelProvider.getClass();
        messageLogTimestampFormatter.getClass();
        function0.getClass();
        this.labelProvider = messageLogLabelProvider;
        this.timestampFormatter = messageLogTimestampFormatter;
        this.currentTimeProvider = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _init_$lambda$0() {
        return new Date();
    }

    private final List<MessageLogEntry> createCarouselMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage) {
        return c0.c(new MessageLogEntry.CarouselContainer(message.getId(), ((position == MessagePosition.STANDALONE || position == MessagePosition.GROUP_TOP) && direction == MessageDirection.INBOUND) ? message.getAuthor().getDisplayName() : null, message.getAuthor().getAvatarUrl(), direction, position, shape, MessageSize.FULL_WIDTH, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed)) ? getReceipt(message, direction) : null));
    }

    private final List<MessageLogEntry> createFileMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage) {
        String id2;
        MessageContent content = message.getContent();
        MessageContent.FormResponse formResponse = content instanceof MessageContent.FormResponse ? (MessageContent.FormResponse) content : null;
        if (formResponse == null || (id2 = formResponse.getQuotedMessageId()) == null) {
            id2 = message.getId();
        }
        String str = id2;
        String displayName = message.getAuthor().getDisplayName();
        MessagePosition messagePosition = MessagePosition.STANDALONE;
        if ((position != messagePosition && position != MessagePosition.GROUP_TOP) || direction != MessageDirection.INBOUND) {
            displayName = null;
        }
        return c0.c(new MessageLogEntry.FileMessageContainer(str, displayName, ((position == messagePosition || position == MessagePosition.GROUP_BOTTOM) && direction == MessageDirection.INBOUND) ? message.getAuthor().getAvatarUrl() : null, direction, position, shape, null, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed) || (message.getStatus() instanceof MessageStatus.DownloadFailed) || (message.getStatus() instanceof MessageStatus.Downloading)) ? getReceipt(message, direction) : null, 64, null));
    }

    private final List<MessageLogEntry> createFormMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage) {
        String id2;
        MessageContent content = message.getContent();
        MessageContent.FormResponse formResponse = content instanceof MessageContent.FormResponse ? (MessageContent.FormResponse) content : null;
        if (formResponse == null || (id2 = formResponse.getQuotedMessageId()) == null) {
            id2 = message.getId();
        }
        String str = id2;
        String displayName = message.getAuthor().getDisplayName();
        MessagePosition messagePosition = MessagePosition.STANDALONE;
        if ((position != messagePosition && position != MessagePosition.GROUP_TOP) || direction != MessageDirection.INBOUND) {
            displayName = null;
        }
        return c0.c(new MessageLogEntry.FormMessageContainer(str, displayName, ((position == messagePosition || position == MessagePosition.GROUP_BOTTOM) && direction == MessageDirection.INBOUND) ? message.getAuthor().getAvatarUrl() : null, direction, position, shape, null, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed)) ? getReceipt(message, direction) : null, 64, null));
    }

    private final List<MessageLogEntry> createImageMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage, String authorizationToken) {
        String id2 = message.getId();
        String displayName = message.getAuthor().getDisplayName();
        MessagePosition messagePosition = MessagePosition.STANDALONE;
        if ((position != messagePosition && position != MessagePosition.GROUP_TOP) || direction != MessageDirection.INBOUND) {
            displayName = null;
        }
        String avatarUrl = message.getAuthor().getAvatarUrl();
        if ((position != messagePosition && position != MessagePosition.GROUP_BOTTOM) || direction != MessageDirection.INBOUND) {
            avatarUrl = null;
        }
        return c0.c(new MessageLogEntry.ImageMessageContainer(id2, displayName, avatarUrl, direction, position, shape, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed)) ? getReceipt(message, direction) : null, authorizationToken));
    }

    private final List<MessageLogEntry> createSingleMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage) {
        String id2;
        MessageContent content = message.getContent();
        MessageContent.FormResponse formResponse = content instanceof MessageContent.FormResponse ? (MessageContent.FormResponse) content : null;
        if (formResponse == null || (id2 = formResponse.getQuotedMessageId()) == null) {
            id2 = message.getId();
        }
        String str = id2;
        String displayName = message.getAuthor().getDisplayName();
        MessagePosition messagePosition = MessagePosition.STANDALONE;
        if ((position != messagePosition && position != MessagePosition.GROUP_TOP) || direction != MessageDirection.INBOUND) {
            displayName = null;
        }
        return c0.c(new MessageLogEntry.MessageContainer(str, displayName, ((position == messagePosition || position == MessagePosition.GROUP_BOTTOM) && direction == MessageDirection.INBOUND) ? message.getAuthor().getAvatarUrl() : null, direction, position, shape, MessageSize.NORMAL, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed)) ? getReceipt(message, direction) : null));
    }

    private final List<MessageLogEntry> createTextMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage) {
        List<MessageAction> actions;
        ArrayList arrayList = new ArrayList();
        String id2 = message.getId();
        String displayName = message.getAuthor().getDisplayName();
        MessagePosition messagePosition = MessagePosition.STANDALONE;
        ArrayList arrayList2 = null;
        if ((position != messagePosition && position != MessagePosition.GROUP_TOP) || direction != MessageDirection.INBOUND) {
            displayName = null;
        }
        String avatarUrl = message.getAuthor().getAvatarUrl();
        if ((position != messagePosition && position != MessagePosition.GROUP_BOTTOM) || direction != MessageDirection.INBOUND) {
            avatarUrl = null;
        }
        arrayList.add(new MessageLogEntry.TextMessageContainer(id2, displayName, avatarUrl, direction, position, shape, null, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed)) ? getReceipt(message, direction) : null, 64, null));
        if (isLatestMessage) {
            MessageContent content = message.getContent();
            MessageContent.Text text = content instanceof MessageContent.Text ? (MessageContent.Text) content : null;
            if (text != null && (actions = text.getActions()) != null) {
                arrayList2 = new ArrayList();
                for (Object obj : actions) {
                    if (obj instanceof MessageAction.Reply) {
                        arrayList2.add(obj);
                    }
                }
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList.add(new MessageLogEntry.QuickReply(message.getId(), arrayList2));
            }
        }
        return arrayList;
    }

    private final List<MessageLogEntry> createUnsupportedMessageContainer(Message message, MessageDirection direction, MessagePosition position, MessageShape shape, boolean isLatestMessage) {
        String id2 = message.getId();
        String displayName = message.getAuthor().getDisplayName();
        MessagePosition messagePosition = MessagePosition.STANDALONE;
        if ((position != messagePosition && position != MessagePosition.GROUP_TOP) || direction != MessageDirection.INBOUND) {
            displayName = null;
        }
        String avatarUrl = message.getAuthor().getAvatarUrl();
        if ((position != messagePosition && position != MessagePosition.GROUP_BOTTOM) || direction != MessageDirection.INBOUND) {
            avatarUrl = null;
        }
        return c0.c(new MessageLogEntry.TextMessageContainer(id2, displayName, avatarUrl, direction, position, shape, MessageSize.NORMAL, message.getStatus(), message, (isLatestMessage || (message.getStatus() instanceof MessageStatus.Failed)) ? getReceipt(message, direction) : null));
    }

    private final MessageReceipt getReceipt(Message message, MessageDirection direction) {
        String strFormSubmissionFailed;
        MessageStatusIcon messageStatusIcon;
        Date received = message.getReceived();
        MessageStatus status = message.getStatus();
        boolean z11 = DateKtxKt.toTimestamp((Date) this.currentTimeProvider.invoke()) - DateKtxKt.toTimestamp(received) <= TimeConstants.ONE_MINUTE_DIFFERENCE;
        if (direction != MessageDirection.OUTBOUND) {
            strFormSubmissionFailed = ((status instanceof MessageStatus.Failed) && (message.getContent().getMessageContentType() == MessageType.FORM || message.getContent().getMessageContentType() == MessageType.FORM_RESPONSE)) ? this.labelProvider.formSubmissionFailed() : status instanceof MessageStatus.Downloading ? this.labelProvider.downloading() : status instanceof MessageStatus.DownloadFailed ? this.labelProvider.downloadFailed() : z11 ? this.labelProvider.justNow() : this.timestampFormatter.timeOnly(received);
        } else if (status instanceof MessageStatus.Pending) {
            strFormSubmissionFailed = this.labelProvider.sending();
        } else if (status instanceof MessageStatus.Failed) {
            MessageStatus.Failure failure = ((MessageStatus.Failed) status).getFailure();
            MessageStatus.Failure failure2 = MessageStatus.Failure.CONTENT_TOO_LARGE;
            MessageLogLabelProvider messageLogLabelProvider = this.labelProvider;
            strFormSubmissionFailed = failure == failure2 ? messageLogLabelProvider.exceedsMaxFileSize(50) : messageLogLabelProvider.tapToRetry();
        } else if (status instanceof MessageStatus.Downloading) {
            strFormSubmissionFailed = this.labelProvider.downloading();
        } else if (status instanceof MessageStatus.DownloadFailed) {
            strFormSubmissionFailed = this.labelProvider.downloadFailed();
        } else {
            MessageLogLabelProvider messageLogLabelProvider2 = this.labelProvider;
            strFormSubmissionFailed = z11 ? messageLogLabelProvider2.sentJustNow() : messageLogLabelProvider2.sentAt(this.timestampFormatter.timeOnly(received));
        }
        String str = strFormSubmissionFailed;
        if (status instanceof MessageStatus.Downloading) {
            messageStatusIcon = MessageStatusIcon.NO_ICON;
        } else if (status instanceof MessageStatus.Pending) {
            messageStatusIcon = MessageStatusIcon.TAIL_SENDING;
        } else if (status instanceof MessageStatus.Sent) {
            messageStatusIcon = MessageStatusIcon.TAIL_SENT;
        } else {
            if (!(status instanceof MessageStatus.Failed) && !(status instanceof MessageStatus.DownloadFailed)) {
                e40.a.f();
                return null;
            }
            messageStatusIcon = MessageStatusIcon.FAILED;
        }
        return new MessageReceipt(str, messageStatusIcon, false, 4, null);
    }

    @NotNull
    public final List<MessageLogEntry> createMessageContainer(@NotNull Message message, @NotNull MessageDirection direction, @NotNull MessagePosition position, @NotNull MessageShape shape, boolean isLatestMessage, @Nullable String authorizationToken) {
        message.getClass();
        direction.getClass();
        position.getClass();
        shape.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[message.getContent().getMessageContentType().ordinal()]) {
            case 1:
            case 2:
                return createSingleMessageContainer(message, direction, position, shape, isLatestMessage);
            case 3:
                return createCarouselMessageContainer(message, direction, position, shape, isLatestMessage);
            case 4:
                return createUnsupportedMessageContainer(message, direction, position, shape, isLatestMessage);
            case 5:
                return createTextMessageContainer(message, direction, position, shape, isLatestMessage);
            case 6:
            case 7:
                return createFileMessageContainer(message, direction, position, shape, isLatestMessage);
            case 8:
            case 9:
                return createFormMessageContainer(message, direction, position, shape, isLatestMessage);
            case 10:
                return createImageMessageContainer(message, direction, position, shape, isLatestMessage, authorizationToken);
            default:
                e40.a.f();
                return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory$Companion;", "", "<init>", "()V", "MAXIMUM_FILE_SIZE_IN_MB", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageContainerFactory(MessageLogLabelProvider messageLogLabelProvider, MessageLogTimestampFormatter messageLogTimestampFormatter, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageLogLabelProvider, messageLogTimestampFormatter, (i11 & 4) != 0 ? new n(7) : function0);
    }
}
