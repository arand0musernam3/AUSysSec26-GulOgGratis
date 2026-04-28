package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import android.content.Context;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w70.a;
import z70.c;
import z70.e;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.model.Author;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageType;
import zendesk.conversationkit.android.model.Participant;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001]B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u0004\u0018\u00010\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b,\u0010-J)\u0010/\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J)\u00103\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0014H\u0002¢\u0006\u0004\b3\u00100J1\u00107\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u00142\u0006\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u0010;J!\u0010>\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010\u00142\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\b>\u0010;J\u0013\u0010@\u001a\u00020\u0014*\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ \u0010G\u001a\u00020D2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020BH\u0080@¢\u0006\u0004\bE\u0010FJJ\u0010O\u001a\u00020D2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020D2\u0006\u0010+\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020%2\u0006\u0010C\u001a\u00020BH\u0080@¢\u0006\u0004\bM\u0010NJ\u001f\u0010R\u001a\u00020D2\u0006\u0010H\u001a\u00020D2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bP\u0010QJ\u001f\u0010W\u001a\u00020D2\u0006\u0010T\u001a\u00020S2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010YR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ZR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\¨\u0006^"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper;", "", "Landroid/content/Context;", "context", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter;", "logTimestampFormatter", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;", "conversationsListLocalStorageIO", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "conversationTitleProvider", "<init>", "(Landroid/content/Context;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter;Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;Lzendesk/messaging/android/internal/ConversationTitleProvider;)V", "Ljava/util/Date;", "timeStamp", "getDefaultDateTimestamp", "(Ljava/util/Date;)Ljava/util/Date;", "", "isMyself", "", "conversationId", "Lzendesk/conversationkit/android/model/Message;", "messageToShowBusinessInfo", "Lkotlin/Pair;", "getBusinessParticipantNameAndAvatar", "(ZLjava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/Conversation;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "", "getListOfMessagesFromBusinessOrderedByLatest", "(Lzendesk/conversationkit/android/model/Conversation;)Ljava/util/List;", "messagesNotMySelfToShow", "getLatestMessageToCollectBusinessInfo", "(Ljava/util/List;ZLzendesk/conversationkit/android/model/Conversation;)Lzendesk/conversationkit/android/model/Message;", "getLatestMessage", "(Lzendesk/conversationkit/android/model/Conversation;)Lzendesk/conversationkit/android/model/Message;", "", "getUnreadMessages", "(Lzendesk/conversationkit/android/model/Conversation;)I", "timestamp", "getDateTimestamp", "(Ljava/util/Date;)Ljava/lang/String;", InAppMessageBase.MESSAGE, "getMessageContent", "(Lzendesk/conversationkit/android/model/Message;)Ljava/lang/String;", "participantName", "formatMessageOwner", "(Lzendesk/conversationkit/android/model/Message;ZLjava/lang/String;)Ljava/lang/String;", "latestMessageToShow", "conversationTitle", "formatLatestMessageToShow", "content", "author", "shouldShowAuthor", "formatMessageContentWithAuthor", "(Ljava/lang/String;ZLjava/lang/String;Z)Ljava/lang/String;", "authorName", "formatBusinessMessage", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "iconUrl", "fallbackIconUrl", "resolveIcon", "Lzendesk/conversationkit/android/model/MessageAction;", "getText", "(Lzendesk/conversationkit/android/model/MessageAction;)Ljava/lang/String;", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "mapToConversationEntry$zendesk_messaging_messaging_android", "(Lzendesk/conversationkit/android/model/Conversation;Lzendesk/messaging/android/internal/model/MessagingTheme;Lx70/c;)Ljava/lang/Object;", "mapToConversationEntry", "conversationEntry", "Lzendesk/conversationkit/android/model/Participant;", "myself", "shouldIncreaseCount", "conversationUnreadCurrentNumber", "updateConversationEntryWithNewMessage$zendesk_messaging_messaging_android", "(Lzendesk/conversationkit/android/model/Conversation;Lzendesk/core/ui/android/internal/model/ConversationEntry;Lzendesk/conversationkit/android/model/Message;Lzendesk/conversationkit/android/model/Participant;ZILzendesk/messaging/android/internal/model/MessagingTheme;Lx70/c;)Ljava/lang/Object;", "updateConversationEntryWithNewMessage", "updateConversationEntryWithLatestTimeStamp$zendesk_messaging_messaging_android", "(Lzendesk/core/ui/android/internal/model/ConversationEntry;Lzendesk/messaging/android/internal/model/MessagingTheme;)Lzendesk/core/ui/android/internal/model/ConversationEntry;", "updateConversationEntryWithLatestTimeStamp", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "loadMoreStatus", "mapToLoadMoreEntry$zendesk_messaging_messaging_android", "(Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;Lzendesk/messaging/android/internal/model/MessagingTheme;)Lzendesk/core/ui/android/internal/model/ConversationEntry;", "mapToLoadMoreEntry", "Landroid/content/Context;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter;", "Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;", "Lzendesk/messaging/android/internal/ConversationTitleProvider;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationLogEntryMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationLogEntryMapper.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,452:1\n1#2:453\n827#3:454\n855#3,2:455\n1056#3:457\n1999#3,14:458\n*S KotlinDebug\n*F\n+ 1 ConversationLogEntryMapper.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper\n*L\n178#1:454\n178#1:455,2\n180#1:457\n195#1:458,14\n*E\n"})
public final class ConversationLogEntryMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String EMPTY = "";

    @NotNull
    private final Context context;

    @NotNull
    private final ConversationTitleProvider conversationTitleProvider;

    @NotNull
    private final ConversationsListLocalStorageIO conversationsListLocalStorageIO;

    @NotNull
    private final ConversationLogTimestampFormatter logTimestampFormatter;

    @NotNull
    private final MessagingSettings messagingSettings;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.CAROUSEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.FORM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper$getBusinessParticipantNameAndAvatar$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper", f = "ConversationLogEntryMapper.kt", l = {147, 162}, m = "getBusinessParticipantNameAndAvatar")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationLogEntryMapper.this.getBusinessParticipantNameAndAvatar(false, null, null, this);
        }
    }

    public ConversationLogEntryMapper(@NotNull Context context, @NotNull ConversationLogTimestampFormatter conversationLogTimestampFormatter, @NotNull MessagingSettings messagingSettings, @NotNull ConversationsListLocalStorageIO conversationsListLocalStorageIO, @NotNull ConversationTitleProvider conversationTitleProvider) {
        context.getClass();
        conversationLogTimestampFormatter.getClass();
        messagingSettings.getClass();
        conversationsListLocalStorageIO.getClass();
        conversationTitleProvider.getClass();
        this.context = context;
        this.logTimestampFormatter = conversationLogTimestampFormatter;
        this.messagingSettings = messagingSettings;
        this.conversationsListLocalStorageIO = conversationsListLocalStorageIO;
        this.conversationTitleProvider = conversationTitleProvider;
    }

    private final String formatBusinessMessage(String authorName, String content) {
        return authorName.length() > 0 ? k.m(authorName, ": ", content) : content;
    }

    private final String formatLatestMessageToShow(Message latestMessageToShow, boolean isMyself, String conversationTitle) {
        Author author;
        String displayName = (latestMessageToShow == null || (author = latestMessageToShow.getAuthor()) == null) ? null : author.getDisplayName();
        boolean z11 = !Intrinsics.areEqual(conversationTitle, displayName);
        String messageContent = getMessageContent(latestMessageToShow);
        if (latestMessageToShow == null) {
            isMyself = false;
        }
        return formatMessageContentWithAuthor(messageContent, isMyself, displayName, z11);
    }

    private final String formatMessageContentWithAuthor(String content, boolean isMyself, String author, boolean shouldShowAuthor) {
        if (!isMyself) {
            return (!shouldShowAuthor || author == null) ? content : formatBusinessMessage(author, content);
        }
        String string = this.context.getString(R.string.zma_conversation_list_item_description_sender_you, content);
        string.getClass();
        return string;
    }

    private final String formatMessageOwner(Message message, boolean isMyself, String participantName) {
        Author author;
        String displayName;
        if (!isMyself) {
            return (message == null || (author = message.getAuthor()) == null || (displayName = author.getDisplayName()) == null) ? participantName.length() == 0 ? this.messagingSettings.getTitle() : participantName : displayName;
        }
        String string = this.context.getString(zendesk.ui.android.R.string.zuia_conversation_list_item_message_author_name_as_end_user_accessibility_label);
        string.getClass();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r10 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getBusinessParticipantNameAndAvatar(boolean r7, java.lang.String r8, zendesk.conversationkit.android.model.Message r9, x70.c<? super kotlin.Pair<java.lang.String, java.lang.String>> r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper.getBusinessParticipantNameAndAvatar(boolean, java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    private final String getDateTimestamp(Date timestamp) {
        return timestamp != null ? this.logTimestampFormatter.formatWhenConversationWasUpdatedAt$zendesk_messaging_messaging_android(timestamp, new Date()) : "";
    }

    private final Date getDefaultDateTimestamp(Date timeStamp) {
        return timeStamp == null ? new Date() : timeStamp;
    }

    private final Message getLatestMessage(Conversation conversation) {
        Object obj;
        Iterator<T> it = conversation.getMessages().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date timestamp = ((Message) next).getTimestamp();
                do {
                    Object next2 = it.next();
                    Date timestamp2 = ((Message) next2).getTimestamp();
                    if (timestamp.compareTo(timestamp2) < 0) {
                        next = next2;
                        timestamp = timestamp2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final Message getLatestMessageToCollectBusinessInfo(List<Message> messagesNotMySelfToShow, boolean isMyself, Conversation conversation) {
        return isMyself ? getLatestMessage(conversation) : (Message) CollectionsKt.W(messagesNotMySelfToShow);
    }

    private final List<Message> getListOfMessagesFromBusinessOrderedByLatest(Conversation conversation) {
        List<Message> messages = conversation.getMessages();
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (!((Message) obj).isAuthoredBy(conversation.getMyself())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.l0(arrayList, new Comparator() { // from class: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper$getListOfMessagesFromBusinessOrderedByLatest$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t11) {
                return a.a(((Message) t9).getTimestamp(), ((Message) t11).getTimestamp());
            }
        });
    }

    private final String getMessageContent(Message message) {
        if (message == null) {
            String string = this.context.getString(R.string.zma_conversation_list_item_description_no_messages);
            string.getClass();
            return string;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getContent().getMessageContentType().ordinal()];
        if (i11 == 1) {
            MessageContent content = message.getContent();
            content.getClass();
            String text = ((MessageContent.Text) content).getText();
            if (text.length() != 0) {
                return text;
            }
            MessageContent content2 = message.getContent();
            content2.getClass();
            List<MessageAction> actions = ((MessageContent.Text) content2).getActions();
            return actions != null ? CollectionsKt.U(actions, null, null, null, new zendesk.core.android.internal.a(this, 4), 31) : "";
        }
        if (i11 == 2) {
            String string2 = this.context.getString(R.string.zma_conversation_list_item_description_file);
            string2.getClass();
            return string2;
        }
        if (i11 == 3) {
            String string3 = this.context.getString(R.string.zma_conversation_list_item_description_image);
            string3.getClass();
            return string3;
        }
        Context context = this.context;
        if (i11 == 4) {
            String string4 = context.getString(R.string.zma_conversation_list_item_description_carousel);
            string4.getClass();
            return string4;
        }
        if (i11 != 5) {
            String string5 = context.getString(R.string.zma_conversation_list_item_description_no_messages);
            string5.getClass();
            return string5;
        }
        String string6 = context.getString(R.string.zma_conversation_list_item_description_form);
        string6.getClass();
        return string6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMessageContent$lambda$8$lambda$7(ConversationLogEntryMapper conversationLogEntryMapper, MessageAction messageAction) {
        messageAction.getClass();
        return conversationLogEntryMapper.getText(messageAction);
    }

    private final String getText(MessageAction messageAction) {
        return messageAction instanceof MessageAction.Reply ? ((MessageAction.Reply) messageAction).getText() : messageAction instanceof MessageAction.Buy ? ((MessageAction.Buy) messageAction).getText() : messageAction instanceof MessageAction.Link ? ((MessageAction.Link) messageAction).getText() : messageAction instanceof MessageAction.Postback ? ((MessageAction.Postback) messageAction).getText() : messageAction instanceof MessageAction.LocationRequest ? ((MessageAction.LocationRequest) messageAction).getText() : messageAction instanceof MessageAction.WebView ? ((MessageAction.WebView) messageAction).getText() : "";
    }

    private final int getUnreadMessages(Conversation conversation) {
        Participant myself = conversation.getMyself();
        if (myself != null) {
            return myself.getUnreadCount();
        }
        return 0;
    }

    private final String resolveIcon(String iconUrl, String fallbackIconUrl) {
        return iconUrl == null ? fallbackIconUrl : iconUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapToConversationEntry$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Conversation r26, @org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.model.MessagingTheme r27, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.core.ui.android.internal.model.ConversationEntry> r28) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper.mapToConversationEntry$zendesk_messaging_messaging_android(zendesk.conversationkit.android.model.Conversation, zendesk.messaging.android.internal.model.MessagingTheme, x70.c):java.lang.Object");
    }

    @NotNull
    public final ConversationEntry mapToLoadMoreEntry$zendesk_messaging_messaging_android(@NotNull ConversationEntry.LoadMoreStatus loadMoreStatus, @NotNull MessagingTheme messagingTheme) {
        loadMoreStatus.getClass();
        messagingTheme.getClass();
        String load_more_id = ConversationEntry.INSTANCE.getLOAD_MORE_ID();
        String string = this.context.getString(R.string.zuia_conversations_list_tap_to_retry_message_label);
        string.getClass();
        return new ConversationEntry.LoadMore(load_more_id, messagingTheme.getOnBackgroundColor(), messagingTheme.getPrimaryColor(), loadMoreStatus, string);
    }

    @NotNull
    public final ConversationEntry updateConversationEntryWithLatestTimeStamp$zendesk_messaging_messaging_android(@NotNull ConversationEntry conversationEntry, @NotNull MessagingTheme messagingTheme) {
        conversationEntry.getClass();
        messagingTheme.getClass();
        int notifyColor = messagingTheme.getNotifyColor();
        int onNotifyColor = messagingTheme.getOnNotifyColor();
        int onBackgroundColor = messagingTheme.getOnBackgroundColor();
        Date dateTimeStamp = conversationEntry.getDateTimeStamp();
        return ConversationEntry.ConversationItem.copy$default((ConversationEntry.ConversationItem) conversationEntry, null, getDefaultDateTimestamp(dateTimeStamp), getDateTimestamp(dateTimeStamp), null, null, null, null, null, 0, null, notifyColor, onNotifyColor, onBackgroundColor, onBackgroundColor, onBackgroundColor, onBackgroundColor, onBackgroundColor, 1017, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationEntryWithNewMessage$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Conversation r34, @org.jetbrains.annotations.NotNull zendesk.core.ui.android.internal.model.ConversationEntry r35, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r36, @org.jetbrains.annotations.Nullable zendesk.conversationkit.android.model.Participant r37, boolean r38, int r39, @org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.model.MessagingTheme r40, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.core.ui.android.internal.model.ConversationEntry> r41) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper.updateConversationEntryWithNewMessage$zendesk_messaging_messaging_android(zendesk.conversationkit.android.model.Conversation, zendesk.core.ui.android.internal.model.ConversationEntry, zendesk.conversationkit.android.model.Message, zendesk.conversationkit.android.model.Participant, boolean, int, zendesk.messaging.android.internal.model.MessagingTheme, x70.c):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper$Companion;", "", "<init>", "()V", "EMPTY", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
