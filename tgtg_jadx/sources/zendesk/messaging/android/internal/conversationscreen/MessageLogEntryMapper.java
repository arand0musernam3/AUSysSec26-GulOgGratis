package zendesk.messaging.android.internal.conversationscreen;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.f0;
import v80.x;
import zendesk.conversationkit.android.internal.extension.PrivateAttachmentUtilKt;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageKt;
import zendesk.conversationkit.android.model.MessageType;
import zendesk.conversationkit.android.model.Participant;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.core.ui.android.internal.model.MessagePosition;
import zendesk.core.ui.android.internal.model.MessageShape;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;
import zendesk.messaging.android.internal.model.LoadMoreStatus;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessageLogType;
import zendesk.messaging.android.internal.model.TypingUser;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 T2\u00020\u0001:\u0003UVTBK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u001e\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b&\u0010$J9\u0010(\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H\u0002¢\u0006\u0004\b-\u0010.J/\u00101\u001a\u0002002\u0006\u0010 \u001a\u00020\u00122\u0006\u0010/\u001a\u00020,2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u00102J?\u00109\u001a\u00020\u001d2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00112\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000206052\f\u00108\u001a\b\u0012\u0004\u0012\u0002030\u0019H\u0002¢\u0006\u0004\b9\u0010:JC\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020@2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bB\u0010CJF\u0010K\u001a\u00020H2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002060D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010F\u001a\u0002062\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000bH\u0080@¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010OR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper;", "", "Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory;", "messageContainerFactory", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;", "labelProvider", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;", "timestampFormatter", "Lkotlin/Function0;", "Ljava/util/Date;", MessagingComponentKt.CURRENT_TIME_PROVIDER, "", MessagingComponentKt.ID_PROVIDER, "Lv80/x;", "defaultDispatcher", "<init>", "(Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory;Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lv80/x;)V", "", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/conversationkit/android/model/Participant;", "currentUser", "lastReadMessage", "latestMessage", "", "addedDayDividers", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "destination", "authorizationToken", "", "mapIntoMessageLogEntry", "(Ljava/util/List;Lzendesk/conversationkit/android/model/Participant;Lzendesk/conversationkit/android/model/Message;Lzendesk/conversationkit/android/model/Message;Ljava/util/Set;Ljava/util/List;Ljava/lang/String;)V", "currentMessage", "previousMessage", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;", "compareWithPrevious", "(Lzendesk/conversationkit/android/model/Message;Lzendesk/conversationkit/android/model/Message;)Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;", "nextMessage", "compareWithNext", InAppMessageBase.MESSAGE, "handleTimestampDivider", "(Ljava/util/List;Lzendesk/conversationkit/android/model/Message;Lzendesk/conversationkit/android/model/Message;Ljava/util/Set;)V", "previousNeighbour", "nextNeighbour", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "getPosition", "(Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;)Lzendesk/core/ui/android/internal/model/MessagePosition;", "currentMessagePosition", "Lzendesk/core/ui/android/internal/model/MessageShape;", "getShape", "(Lzendesk/conversationkit/android/model/Message;Lzendesk/core/ui/android/internal/model/MessagePosition;Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;)Lzendesk/core/ui/android/internal/model/MessageShape;", "Lzendesk/conversationkit/android/model/MessageAction;", "messageActions", "", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;", "mapOfPostbackStatuses", "newMessageActions", "processMessageActions", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "Lzendesk/conversationkit/android/model/Conversation;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "newMessageDividerDate", "Lzendesk/messaging/android/internal/model/TypingUser;", "typingUser", "Lzendesk/messaging/android/internal/model/LoadMoreStatus;", "loadMoreStatus", "map", "(Lzendesk/conversationkit/android/model/Conversation;Ljava/util/Date;Lzendesk/messaging/android/internal/model/TypingUser;Lzendesk/messaging/android/internal/model/LoadMoreStatus;Ljava/lang/String;)Ljava/util/List;", "", "messageLogEntryList", "conversationScreenPostbackStatus", "actionId", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageLogEntryUpdatedPostback;", "mapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android", "(Ljava/util/Map;Ljava/util/List;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "mapMessageLogEntriesWithPostbackUpdates", "Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory;", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;", "Lkotlin/jvm/functions/Function0;", "Lv80/x;", "Lzendesk/conversationkit/android/model/MessageType;", "allowedGroupingTypes", "Ljava/util/List;", "Companion", "MessageNeighbour", "MessageLogEntryUpdatedPostback", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageLogEntryMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageLogEntryMapper.kt\nzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,634:1\n1617#2,9:635\n1869#2:644\n1870#2:646\n1626#2:647\n827#2:648\n855#2,2:649\n1563#2:651\n1634#2,3:652\n1056#2:655\n3307#2,10:656\n1878#2,3:666\n1761#2,3:670\n1869#2,2:673\n295#2,2:675\n1#3:645\n1#3:669\n*S KotlinDebug\n*F\n+ 1 MessageLogEntryMapper.kt\nzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper\n*L\n81#1:635,9\n81#1:644\n81#1:646\n81#1:647\n84#1:648\n84#1:649,2\n89#1:651\n89#1:652,3\n96#1:655\n113#1:656,10\n175#1:666,3\n349#1:670,3\n575#1:673,2\n92#1:675,2\n81#1:645\n*E\n"})
public final class MessageLogEntryMapper {

    @NotNull
    private static final String MESSAGE_DIVIDER_ID_PREFIX = "CONSTANT_MESSAGE_DIVIDER_ID_";

    @NotNull
    private static final String TYPING_INDICATOR_ID = "CONSTANT_TYPING_INDICATOR_ID";

    @NotNull
    private final List<MessageType> allowedGroupingTypes;

    @NotNull
    private final Function0<Date> currentTimeProvider;

    @NotNull
    private final x defaultDispatcher;

    @NotNull
    private final Function0<String> idProvider;

    @NotNull
    private final MessageLogLabelProvider labelProvider;

    @NotNull
    private final MessageContainerFactory messageContainerFactory;

    @NotNull
    private final MessageLogTimestampFormatter timestampFormatter;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageLogEntryUpdatedPostback;", "", "messageLogEntryList", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "showBanner", "", "updatedPostbackStatuses", "", "", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;", "<init>", "(Ljava/util/List;ZLjava/util/Map;)V", "getMessageLogEntryList", "()Ljava/util/List;", "getShowBanner", "()Z", "getUpdatedPostbackStatuses", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageLogEntryUpdatedPostback {

        @NotNull
        private final List<MessageLogEntry> messageLogEntryList;
        private final boolean showBanner;

        @NotNull
        private final Map<String, ConversationScreenPostbackStatus> updatedPostbackStatuses;

        /* JADX WARN: Multi-variable type inference failed */
        public MessageLogEntryUpdatedPostback(@NotNull List<? extends MessageLogEntry> list, boolean z11, @NotNull Map<String, ConversationScreenPostbackStatus> map) {
            list.getClass();
            map.getClass();
            this.messageLogEntryList = list;
            this.showBanner = z11;
            this.updatedPostbackStatuses = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageLogEntryUpdatedPostback copy$default(MessageLogEntryUpdatedPostback messageLogEntryUpdatedPostback, List list, boolean z11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = messageLogEntryUpdatedPostback.messageLogEntryList;
            }
            if ((i11 & 2) != 0) {
                z11 = messageLogEntryUpdatedPostback.showBanner;
            }
            if ((i11 & 4) != 0) {
                map = messageLogEntryUpdatedPostback.updatedPostbackStatuses;
            }
            return messageLogEntryUpdatedPostback.copy(list, z11, map);
        }

        @NotNull
        public final List<MessageLogEntry> component1() {
            return this.messageLogEntryList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShowBanner() {
            return this.showBanner;
        }

        @NotNull
        public final Map<String, ConversationScreenPostbackStatus> component3() {
            return this.updatedPostbackStatuses;
        }

        @NotNull
        public final MessageLogEntryUpdatedPostback copy(@NotNull List<? extends MessageLogEntry> messageLogEntryList, boolean showBanner, @NotNull Map<String, ConversationScreenPostbackStatus> updatedPostbackStatuses) {
            messageLogEntryList.getClass();
            updatedPostbackStatuses.getClass();
            return new MessageLogEntryUpdatedPostback(messageLogEntryList, showBanner, updatedPostbackStatuses);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageLogEntryUpdatedPostback)) {
                return false;
            }
            MessageLogEntryUpdatedPostback messageLogEntryUpdatedPostback = (MessageLogEntryUpdatedPostback) other;
            return Intrinsics.areEqual(this.messageLogEntryList, messageLogEntryUpdatedPostback.messageLogEntryList) && this.showBanner == messageLogEntryUpdatedPostback.showBanner && Intrinsics.areEqual(this.updatedPostbackStatuses, messageLogEntryUpdatedPostback.updatedPostbackStatuses);
        }

        @NotNull
        public final List<MessageLogEntry> getMessageLogEntryList() {
            return this.messageLogEntryList;
        }

        public final boolean getShowBanner() {
            return this.showBanner;
        }

        @NotNull
        public final Map<String, ConversationScreenPostbackStatus> getUpdatedPostbackStatuses() {
            return this.updatedPostbackStatuses;
        }

        public int hashCode() {
            return this.updatedPostbackStatuses.hashCode() + r8.k.e(this.messageLogEntryList.hashCode() * 31, 31, this.showBanner);
        }

        @NotNull
        public String toString() {
            return "MessageLogEntryUpdatedPostback(messageLogEntryList=" + this.messageLogEntryList + ", showBanner=" + this.showBanner + ", updatedPostbackStatuses=" + this.updatedPostbackStatuses + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageNeighbour;", "", "sameAuthor", "", "statusAllowGrouping", "dateAllowsGrouping", "allowsShapeGrouping", "<init>", "(ZZZZ)V", "getSameAuthor", "()Z", "getStatusAllowGrouping", "getDateAllowsGrouping", "getAllowsShapeGrouping", "allowsPositionGrouping", "getAllowsPositionGrouping", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageNeighbour {
        private final boolean allowsShapeGrouping;
        private final boolean dateAllowsGrouping;
        private final boolean sameAuthor;
        private final boolean statusAllowGrouping;

        public MessageNeighbour(boolean z11, boolean z12, boolean z13, boolean z14) {
            this.sameAuthor = z11;
            this.statusAllowGrouping = z12;
            this.dateAllowsGrouping = z13;
            this.allowsShapeGrouping = z14;
        }

        public static /* synthetic */ MessageNeighbour copy$default(MessageNeighbour messageNeighbour, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = messageNeighbour.sameAuthor;
            }
            if ((i11 & 2) != 0) {
                z12 = messageNeighbour.statusAllowGrouping;
            }
            if ((i11 & 4) != 0) {
                z13 = messageNeighbour.dateAllowsGrouping;
            }
            if ((i11 & 8) != 0) {
                z14 = messageNeighbour.allowsShapeGrouping;
            }
            return messageNeighbour.copy(z11, z12, z13, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSameAuthor() {
            return this.sameAuthor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getStatusAllowGrouping() {
            return this.statusAllowGrouping;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDateAllowsGrouping() {
            return this.dateAllowsGrouping;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getAllowsShapeGrouping() {
            return this.allowsShapeGrouping;
        }

        @NotNull
        public final MessageNeighbour copy(boolean sameAuthor, boolean statusAllowGrouping, boolean dateAllowsGrouping, boolean allowsShapeGrouping) {
            return new MessageNeighbour(sameAuthor, statusAllowGrouping, dateAllowsGrouping, allowsShapeGrouping);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageNeighbour)) {
                return false;
            }
            MessageNeighbour messageNeighbour = (MessageNeighbour) other;
            return this.sameAuthor == messageNeighbour.sameAuthor && this.statusAllowGrouping == messageNeighbour.statusAllowGrouping && this.dateAllowsGrouping == messageNeighbour.dateAllowsGrouping && this.allowsShapeGrouping == messageNeighbour.allowsShapeGrouping;
        }

        public final boolean getAllowsPositionGrouping() {
            return this.sameAuthor && this.statusAllowGrouping && this.dateAllowsGrouping;
        }

        public final boolean getAllowsShapeGrouping() {
            return this.allowsShapeGrouping;
        }

        public final boolean getDateAllowsGrouping() {
            return this.dateAllowsGrouping;
        }

        public final boolean getSameAuthor() {
            return this.sameAuthor;
        }

        public final boolean getStatusAllowGrouping() {
            return this.statusAllowGrouping;
        }

        public int hashCode() {
            return Boolean.hashCode(this.allowsShapeGrouping) + r8.k.e(r8.k.e(Boolean.hashCode(this.sameAuthor) * 31, 31, this.statusAllowGrouping), 31, this.dateAllowsGrouping);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.sameAuthor;
            boolean z12 = this.statusAllowGrouping;
            boolean z13 = this.dateAllowsGrouping;
            boolean z14 = this.allowsShapeGrouping;
            StringBuilder sbP = b3.i.p("MessageNeighbour(sameAuthor=", z11, ", statusAllowGrouping=", z12, ", dateAllowsGrouping=");
            sbP.append(z13);
            sbP.append(", allowsShapeGrouping=");
            sbP.append(z14);
            sbP.append(")");
            return sbP.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageLogEntryMapper(@NotNull MessageContainerFactory messageContainerFactory, @NotNull MessageLogLabelProvider messageLogLabelProvider, @NotNull MessageLogTimestampFormatter messageLogTimestampFormatter, @NotNull Function0<? extends Date> function0, @NotNull Function0<String> function02, @NotNull x xVar) {
        messageContainerFactory.getClass();
        messageLogLabelProvider.getClass();
        messageLogTimestampFormatter.getClass();
        function0.getClass();
        function02.getClass();
        xVar.getClass();
        this.messageContainerFactory = messageContainerFactory;
        this.labelProvider = messageLogLabelProvider;
        this.timestampFormatter = messageLogTimestampFormatter;
        this.currentTimeProvider = function0;
        this.idProvider = function02;
        this.defaultDispatcher = xVar;
        this.allowedGroupingTypes = d0.h(MessageType.TEXT, MessageType.FILE, MessageType.IMAGE, MessageType.UNSUPPORTED);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper.MessageNeighbour compareWithNext(zendesk.conversationkit.android.model.Message r10, zendesk.conversationkit.android.model.Message r11) {
        /*
            r9 = this;
            zendesk.conversationkit.android.model.MessageStatus r0 = r10.getStatus()
            boolean r0 = r0 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            r1 = 0
            if (r0 != 0) goto L27
            if (r11 == 0) goto L10
            zendesk.conversationkit.android.model.MessageStatus r0 = r11.getStatus()
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r0 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            if (r0 == 0) goto L16
            goto L27
        L16:
            zendesk.conversationkit.android.model.Author r0 = r10.getAuthor()
            if (r11 == 0) goto L21
            zendesk.conversationkit.android.model.Author r2 = r11.getAuthor()
            goto L22
        L21:
            r2 = r1
        L22:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            goto L41
        L27:
            zendesk.conversationkit.android.model.Author r0 = r10.getAuthor()
            java.lang.String r0 = r0.getUserId()
            if (r11 == 0) goto L3c
            zendesk.conversationkit.android.model.Author r2 = r11.getAuthor()
            if (r2 == 0) goto L3c
            java.lang.String r2 = r2.getUserId()
            goto L3d
        L3c:
            r2 = r1
        L3d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
        L41:
            r2 = 1
            r3 = 0
            if (r11 != 0) goto L47
        L45:
            r4 = r3
            goto L68
        L47:
            zendesk.conversationkit.android.model.MessageStatus r4 = r10.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            if (r4 != 0) goto L57
            zendesk.conversationkit.android.model.MessageStatus r4 = r10.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Sent
            if (r4 == 0) goto L45
        L57:
            zendesk.conversationkit.android.model.MessageStatus r4 = r11.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            if (r4 != 0) goto L67
            zendesk.conversationkit.android.model.MessageStatus r4 = r11.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Sent
            if (r4 == 0) goto L45
        L67:
            r4 = r2
        L68:
            if (r11 != 0) goto L6c
        L6a:
            r2 = r3
            goto L84
        L6c:
            java.util.Date r5 = r11.getReceived()
            long r5 = zendesk.core.android.internal.DateKtxKt.toTimestamp(r5)
            java.util.Date r10 = r10.getReceived()
            long r7 = zendesk.core.android.internal.DateKtxKt.toTimestamp(r10)
            long r5 = r5 - r7
            r7 = 900000(0xdbba0, double:4.44659E-318)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L6a
        L84:
            zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$MessageNeighbour r10 = new zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$MessageNeighbour
            java.util.List<zendesk.conversationkit.android.model.MessageType> r3 = r9.allowedGroupingTypes
            if (r11 == 0) goto L94
            zendesk.conversationkit.android.model.MessageContent r11 = r11.getContent()
            if (r11 == 0) goto L94
            zendesk.conversationkit.android.model.MessageType r1 = r11.getMessageContentType()
        L94:
            boolean r11 = kotlin.collections.CollectionsKt.I(r3, r1)
            r10.<init>(r0, r4, r2, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper.compareWithNext(zendesk.conversationkit.android.model.Message, zendesk.conversationkit.android.model.Message):zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$MessageNeighbour");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper.MessageNeighbour compareWithPrevious(zendesk.conversationkit.android.model.Message r10, zendesk.conversationkit.android.model.Message r11) {
        /*
            r9 = this;
            zendesk.conversationkit.android.model.MessageStatus r0 = r10.getStatus()
            boolean r0 = r0 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            r1 = 0
            if (r0 != 0) goto L27
            if (r11 == 0) goto L10
            zendesk.conversationkit.android.model.MessageStatus r0 = r11.getStatus()
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r0 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            if (r0 == 0) goto L16
            goto L27
        L16:
            zendesk.conversationkit.android.model.Author r0 = r10.getAuthor()
            if (r11 == 0) goto L21
            zendesk.conversationkit.android.model.Author r2 = r11.getAuthor()
            goto L22
        L21:
            r2 = r1
        L22:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            goto L41
        L27:
            zendesk.conversationkit.android.model.Author r0 = r10.getAuthor()
            java.lang.String r0 = r0.getUserId()
            if (r11 == 0) goto L3c
            zendesk.conversationkit.android.model.Author r2 = r11.getAuthor()
            if (r2 == 0) goto L3c
            java.lang.String r2 = r2.getUserId()
            goto L3d
        L3c:
            r2 = r1
        L3d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
        L41:
            r2 = 1
            r3 = 0
            if (r11 != 0) goto L47
        L45:
            r4 = r3
            goto L68
        L47:
            zendesk.conversationkit.android.model.MessageStatus r4 = r10.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            if (r4 != 0) goto L57
            zendesk.conversationkit.android.model.MessageStatus r4 = r10.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Sent
            if (r4 == 0) goto L45
        L57:
            zendesk.conversationkit.android.model.MessageStatus r4 = r11.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Pending
            if (r4 != 0) goto L67
            zendesk.conversationkit.android.model.MessageStatus r4 = r11.getStatus()
            boolean r4 = r4 instanceof zendesk.conversationkit.android.model.MessageStatus.Sent
            if (r4 == 0) goto L45
        L67:
            r4 = r2
        L68:
            if (r11 != 0) goto L6c
        L6a:
            r2 = r3
            goto L84
        L6c:
            java.util.Date r10 = r10.getReceived()
            long r5 = zendesk.core.android.internal.DateKtxKt.toTimestamp(r10)
            java.util.Date r10 = r11.getReceived()
            long r7 = zendesk.core.android.internal.DateKtxKt.toTimestamp(r10)
            long r5 = r5 - r7
            r7 = 900000(0xdbba0, double:4.44659E-318)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L6a
        L84:
            zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$MessageNeighbour r10 = new zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$MessageNeighbour
            java.util.List<zendesk.conversationkit.android.model.MessageType> r3 = r9.allowedGroupingTypes
            if (r11 == 0) goto L94
            zendesk.conversationkit.android.model.MessageContent r11 = r11.getContent()
            if (r11 == 0) goto L94
            zendesk.conversationkit.android.model.MessageType r1 = r11.getMessageContentType()
        L94:
            boolean r11 = kotlin.collections.CollectionsKt.I(r3, r1)
            r10.<init>(r0, r4, r2, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper.compareWithPrevious(zendesk.conversationkit.android.model.Message, zendesk.conversationkit.android.model.Message):zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$MessageNeighbour");
    }

    private final MessagePosition getPosition(MessageNeighbour previousNeighbour, MessageNeighbour nextNeighbour) {
        return (previousNeighbour.getAllowsPositionGrouping() || nextNeighbour.getAllowsPositionGrouping()) ? (previousNeighbour.getAllowsPositionGrouping() || !nextNeighbour.getAllowsPositionGrouping()) ? (!previousNeighbour.getAllowsPositionGrouping() || nextNeighbour.getAllowsPositionGrouping()) ? MessagePosition.GROUP_MIDDLE : MessagePosition.GROUP_BOTTOM : MessagePosition.GROUP_TOP : MessagePosition.STANDALONE;
    }

    private final MessageShape getShape(Message currentMessage, MessagePosition currentMessagePosition, MessageNeighbour previousNeighbour, MessageNeighbour nextNeighbour) {
        boolean z11 = true;
        boolean z12 = currentMessagePosition == MessagePosition.STANDALONE || !this.allowedGroupingTypes.contains(currentMessage.getContent().getMessageContentType()) || (currentMessagePosition == MessagePosition.GROUP_TOP && !nextNeighbour.getAllowsShapeGrouping()) || (currentMessagePosition == MessagePosition.GROUP_BOTTOM && !previousNeighbour.getAllowsShapeGrouping());
        boolean z13 = (currentMessagePosition == MessagePosition.GROUP_TOP && nextNeighbour.getAllowsShapeGrouping()) || (currentMessagePosition == MessagePosition.GROUP_MIDDLE && !previousNeighbour.getAllowsShapeGrouping());
        if ((currentMessagePosition != MessagePosition.GROUP_BOTTOM || !previousNeighbour.getAllowsShapeGrouping()) && (currentMessagePosition != MessagePosition.GROUP_MIDDLE || nextNeighbour.getAllowsShapeGrouping())) {
            z11 = false;
        }
        return z12 ? MessageShape.STANDALONE : z13 ? MessageShape.GROUP_TOP : z11 ? MessageShape.GROUP_BOTTOM : MessageShape.GROUP_MIDDLE;
    }

    private final void handleTimestampDivider(List<MessageLogEntry> list, Message message, Message message2, Set<Date> set) {
        boolean z11;
        MessageLogEntry.MessagesDivider messagesDivider;
        Date received = message.getReceived();
        String strK = e0.f.k(MESSAGE_DIVIDER_ID_PREFIX, message.getId());
        Date date = (Date) this.currentTimeProvider.invoke();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(received);
        boolean z12 = true;
        boolean z13 = (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        Set<Date> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            z11 = false;
        } else {
            for (Date date2 : set2) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(date2);
                if (calendar3.get(1) == calendar2.get(1) && calendar3.get(6) == calendar2.get(6)) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        if (message2 != null && DateKtxKt.toTimestamp(message.getReceived()) - DateKtxKt.toTimestamp(message2.getReceived()) < TimeConstants.FIFTEEN_MINUTES_DIFFERENCE) {
            z12 = false;
        }
        if (z13 && !z11) {
            set.add(message.getReceived());
            messagesDivider = new MessageLogEntry.MessagesDivider(strK, this.timestampFormatter.dayAndTime(message.getReceived()), MessageLogType.TimeStampDivider);
        } else if (z13 && z12) {
            messagesDivider = new MessageLogEntry.MessagesDivider(strK, this.timestampFormatter.dayAndTime(message.getReceived()), MessageLogType.TimeStampDivider);
        } else if (!z12) {
            return;
        } else {
            messagesDivider = new MessageLogEntry.MessagesDivider(strK, this.timestampFormatter.timeOnly(message.getReceived()), MessageLogType.TimeStampDivider);
        }
        list.add(messagesDivider);
    }

    public static /* synthetic */ List map$default(MessageLogEntryMapper messageLogEntryMapper, Conversation conversation, Date date, TypingUser typingUser, LoadMoreStatus loadMoreStatus, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            typingUser = TypingUser.None.INSTANCE;
        }
        TypingUser typingUser2 = typingUser;
        if ((i11 & 8) != 0) {
            loadMoreStatus = LoadMoreStatus.NONE;
        }
        return messageLogEntryMapper.map(conversation, date, typingUser2, loadMoreStatus, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message map$lambda$8$lambda$4$lambda$3(Conversation conversation, String str) {
        Object next;
        str.getClass();
        Iterator<T> it = conversation.getMessages().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Message) next).getId(), str)) {
                break;
            }
        }
        return (Message) next;
    }

    private final void mapIntoMessageLogEntry(List<Message> list, Participant participant, Message message, Message message2, Set<Date> set, List<MessageLogEntry> list2, String str) {
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            Message message3 = (Message) obj;
            Message message4 = (Message) CollectionsKt.Q(i11 - 1, list);
            MessageNeighbour messageNeighbourCompareWithPrevious = compareWithPrevious(message3, message4);
            MessageNeighbour messageNeighbourCompareWithNext = compareWithNext(message3, (Message) CollectionsKt.Q(i12, list));
            MessageDirection messageDirection = message3.isAuthoredBy(participant) ? MessageDirection.OUTBOUND : MessageDirection.INBOUND;
            MessagePosition position = getPosition(messageNeighbourCompareWithPrevious, messageNeighbourCompareWithNext);
            MessageShape shape = getShape(message3, position, messageNeighbourCompareWithPrevious, messageNeighbourCompareWithNext);
            if (message4 == null) {
                message4 = message;
            }
            handleTimestampDivider(list2, message3, message4, set);
            list2.addAll(this.messageContainerFactory.createMessageContainer(message3, messageDirection, position, shape, Intrinsics.areEqual(message2, message3), PrivateAttachmentUtilKt.resolveAuthTokenForPrivateAttachment(str, MessageKt.isPrivateAttachment(message3.getContent()))));
            i11 = i12;
        }
    }

    public static /* synthetic */ void mapIntoMessageLogEntry$default(MessageLogEntryMapper messageLogEntryMapper, List list, Participant participant, Message message, Message message2, Set set, List list2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            message = null;
        }
        messageLogEntryMapper.mapIntoMessageLogEntry(list, participant, message, message2, set, list2, str);
    }

    public static /* synthetic */ Object mapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android$default(MessageLogEntryMapper messageLogEntryMapper, Map map, List list, ConversationScreenPostbackStatus conversationScreenPostbackStatus, String str, x70.c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        return messageLogEntryMapper.mapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android(map, list, conversationScreenPostbackStatus, str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMessageActions(List<? extends MessageAction> messageActions, Map<String, ? extends ConversationScreenPostbackStatus> mapOfPostbackStatuses, List<MessageAction> newMessageActions) {
        for (MessageAction messageAction : messageActions) {
            if (messageAction instanceof MessageAction.Postback) {
                MessageAction.Postback postback = (MessageAction.Postback) messageAction;
                newMessageActions.add(MessageAction.Postback.copy$default(postback, null, null, null, null, mapOfPostbackStatuses.get(postback.getId()) != null && mapOfPostbackStatuses.get(postback.getId()) == ConversationScreenPostbackStatus.LOADING, 15, null));
            } else {
                newMessageActions.add(messageAction);
            }
        }
    }

    @NotNull
    public final List<MessageLogEntry> map(@NotNull Conversation conversation, @Nullable Date newMessageDividerDate, @NotNull TypingUser typingUser, @NotNull LoadMoreStatus loadMoreStatus, @Nullable String authorizationToken) {
        Pair pair;
        String string;
        conversation.getClass();
        typingUser.getClass();
        loadMoreStatus.getClass();
        ArrayList arrayList = new ArrayList();
        List<Message> messages = conversation.getMessages();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            MessageContent content = ((Message) it.next()).getContent();
            MessageContent.FormResponse formResponse = content instanceof MessageContent.FormResponse ? (MessageContent.FormResponse) content : null;
            String quotedMessageId = formResponse != null ? formResponse.getQuotedMessageId() : null;
            if (quotedMessageId != null) {
                arrayList2.add(quotedMessageId);
            }
        }
        List<Message> messages2 = conversation.getMessages();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : messages2) {
            Message message = (Message) obj;
            if (message.getContent().getMessageContentType() != MessageType.FORM || !arrayList2.contains(message.getId())) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(e0.o(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(MessageLogEntryMapperKt.overrideWithQuotedMessageDetails((Message) it2.next(), new i(conversation, 1)));
        }
        List listL0 = CollectionsKt.l0(arrayList4, new Comparator() { // from class: zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$map$lambda$8$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t11) {
                return w70.a.a(((Message) t9).getTimestamp(), ((Message) t11).getTimestamp());
            }
        });
        if (!listL0.isEmpty()) {
            if (loadMoreStatus != LoadMoreStatus.NONE) {
                arrayList.add(new MessageLogEntry.LoadMore(null, null, loadMoreStatus, 3, null));
            }
            Set<Date> linkedHashSet = new LinkedHashSet<>();
            if (newMessageDividerDate != null) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : listL0) {
                    if (((Message) obj2).getReceived().compareTo(newMessageDividerDate) < 0) {
                        arrayList5.add(obj2);
                    } else {
                        arrayList6.add(obj2);
                    }
                }
                pair = new Pair(arrayList5, arrayList6);
            } else {
                pair = new Pair(listL0, n0.f26529a);
            }
            List list = (List) pair.f26485a;
            List<Message> list2 = (List) pair.f26486b;
            mapIntoMessageLogEntry$default(this, list, conversation.getMyself(), null, (Message) (list2.isEmpty() ? CollectionsKt.W(list) : CollectionsKt.W(list2)), linkedHashSet, arrayList, authorizationToken, 2, null);
            if (!list2.isEmpty()) {
                if (!((Message) CollectionsKt.O(list2)).isAuthoredBy(conversation.getMyself())) {
                    if (newMessageDividerDate == null || (string = newMessageDividerDate.toString()) == null) {
                        string = (String) this.idProvider.invoke();
                    }
                    arrayList.add(new MessageLogEntry.MessagesDivider(string, this.labelProvider.newMessages(), MessageLogType.NewMessagesDivider));
                }
                mapIntoMessageLogEntry(list2, conversation.getMyself(), (Message) CollectionsKt.X(list), (Message) CollectionsKt.W(list2), linkedHashSet, arrayList, authorizationToken);
            }
            if (typingUser instanceof TypingUser.User) {
                arrayList.add(new MessageLogEntry.TypingIndicatorContainer(TYPING_INDICATOR_ID, ((TypingUser.User) typingUser).getAvatarUrl()));
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object mapMessageLogEntriesWithPostbackUpdates$zendesk_messaging_messaging_android(@NotNull Map<String, ConversationScreenPostbackStatus> map, @NotNull List<? extends MessageLogEntry> list, @NotNull ConversationScreenPostbackStatus conversationScreenPostbackStatus, @Nullable String str, @NotNull x70.c<? super MessageLogEntryUpdatedPostback> cVar) {
        return f0.K(this.defaultDispatcher, new MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2(map, str, conversationScreenPostbackStatus, list, this, null), cVar);
    }
}
