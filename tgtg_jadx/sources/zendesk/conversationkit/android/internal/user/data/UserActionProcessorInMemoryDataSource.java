package zendesk.conversationkit.android.internal.user.data;

import com.braze.models.inappmessage.InAppMessageBase;
import e90.a;
import e90.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.conversationkit.android.model.User;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u0005H\u0086@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b#\u0010$J.\u0010%\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0086@¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b(\u0010\u001cJ\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020'H\u0086@¢\u0006\u0004\b*\u0010+J.\u00100\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00052\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010/\u001a\u00020'H\u0086@¢\u0006\u0004\b0\u00101J \u00103\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00052\u0006\u00102\u001a\u00020-H\u0086@¢\u0006\u0004\b3\u00104J \u00106\u001a\u00020-2\u0006\u0010 \u001a\u00020\u00052\u0006\u00105\u001a\u00020-H\u0086@¢\u0006\u0004\b6\u00104J(\u00109\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00052\u0006\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b9\u0010:J\"\u0010<\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b<\u0010=J,\u0010?\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b?\u0010@J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0086@¢\u0006\u0004\bA\u0010\u001cJ\u001e\u0010C\u001a\u00020\u000f2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0086@¢\u0006\u0004\bC\u0010DJ \u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020E2\u0006\u0010 \u001a\u00020\u0005H\u0086@¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00052\u0006\u00105\u001a\u00020-H\u0086@¢\u0006\u0004\bI\u00104J0\u0010N\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0086@¢\u0006\u0004\bN\u0010OR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010PR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;", "", "Lzendesk/conversationkit/android/model/User;", "user", "", "", "Lzendesk/conversationkit/android/model/Conversation;", "conversations", "<init>", "(Lzendesk/conversationkit/android/model/User;Ljava/util/Map;)V", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "saveConversationAsynchronously", "(Lzendesk/conversationkit/android/model/Conversation;)Lzendesk/conversationkit/android/model/Conversation;", "", "metadata", "", "updateUserConversationsMetadata", "(Lzendesk/conversationkit/android/model/Conversation;Ljava/util/Map;)V", "updateInMemoryConversationsMetadata", "sortAndCommitConversationToMemory", "updateInMemoryConversationAsynchronously", "updateUserConversationsAsynchronously", "(Lzendesk/conversationkit/android/model/Conversation;)Lzendesk/conversationkit/android/model/User;", "Ljava/util/Date;", "fallbackTime", "messageCreatedAtDate", "(Lzendesk/conversationkit/android/model/Conversation;Ljava/util/Date;)Ljava/util/Date;", "getUser", "(Lx70/c;)Ljava/lang/Object;", "newUser", "updateUser", "(Lzendesk/conversationkit/android/model/User;Lx70/c;)Ljava/lang/Object;", "conversationId", "getConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "saveConversation", "(Lzendesk/conversationkit/android/model/Conversation;Lx70/c;)Ljava/lang/Object;", "updateConversationMetadata", "(Lzendesk/conversationkit/android/model/Conversation;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "", "shouldReAuthenticateUser", "reAuthenticateUser", "updateReAuthenticateUser", "(ZLx70/c;)Ljava/lang/Object;", "", "Lzendesk/conversationkit/android/model/Message;", "newMessages", "hasPrevious", "updateConversationMessages", "(Ljava/lang/String;Ljava/util/List;ZLx70/c;)Ljava/lang/Object;", "newMessage", "addMessageToConversationAndCommit", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", InAppMessageBase.MESSAGE, "createPendingMessage", "networkMessage", "messageLocalId", "replacePendingMessage", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "lastRead", "updateConversationBusinessLastRead", "(Ljava/lang/String;Ljava/util/Date;Lx70/c;)Ljava/lang/Object;", "userId", "updateConversationParticipants", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lx70/c;)Ljava/lang/Object;", "getConversations", "newConversations", "saveConversations", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ActivityEvent;", "activityEvent", "updateConversationRoutingStatus", "(Lzendesk/conversationkit/android/model/ActivityEvent;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "updateDownloadingAttachment", "fileName", "Lzendesk/conversationkit/android/model/MessageStatus;", "downloadStatus", "messageId", "updateDownloadingStatus", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageStatus;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/User;", "Ljava/util/Map;", "Z", "Le90/a;", "persistenceMutex", "Le90/a;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserActionProcessorInMemoryDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActionProcessorInMemoryDataSource.kt\nzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,661:1\n116#2,11:662\n116#2,11:673\n116#2,11:684\n116#2,11:695\n116#2,11:706\n116#2,11:721\n116#2,11:732\n116#2,8:782\n125#2,2:800\n116#2,8:802\n125#2,2:818\n116#2,8:820\n125#2,2:834\n116#2,8:850\n125#2,2:864\n116#2,11:866\n116#2,8:877\n125#2,2:889\n116#2,10:891\n116#2,8:901\n125#2,2:911\n116#2,10:913\n116#2,8:923\n125#2,2:934\n116#2,8:936\n125#2:946\n827#3:717\n855#3,2:718\n1056#3:720\n774#3:743\n865#3,2:744\n774#3:746\n865#3,2:747\n1669#3,8:749\n1563#3:757\n1634#3,2:758\n295#3,2:760\n1636#3:762\n774#3:763\n865#3:764\n1761#3,3:765\n866#3:768\n1563#3:769\n1634#3,3:770\n827#3:773\n855#3:774\n1761#3,3:775\n856#3:778\n827#3:779\n855#3,2:780\n1761#3,2:790\n1761#3,3:792\n1763#3:795\n1563#3:796\n1634#3,3:797\n1869#3,2:810\n1761#3,3:812\n827#3:815\n855#3,2:816\n1761#3,3:828\n827#3:831\n855#3,2:832\n1999#3,14:836\n1761#3,3:858\n827#3:861\n855#3,2:862\n1563#3:885\n1634#3,3:886\n1869#3,2:909\n827#3:931\n855#3,2:932\n295#3,2:944\n827#3:947\n855#3,2:948\n*S KotlinDebug\n*F\n+ 1 UserActionProcessorInMemoryDataSource.kt\nzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource\n*L\n50#1:662,11\n57#1:673,11\n70#1:684,11\n85#1:695,11\n102#1:706,11\n148#1:721,11\n155#1:732,11\n264#1:782,8\n264#1:800,2\n302#1:802,8\n302#1:818,2\n359#1:820,8\n359#1:834,2\n440#1:850,8\n440#1:864,2\n475#1:866,11\n499#1:877,8\n499#1:889,2\n521#1:891,10\n537#1:901,8\n537#1:911,2\n563#1:913,10\n592#1:923,8\n592#1:934,2\n638#1:936,8\n638#1:946\n113#1:717\n113#1:718,2\n137#1:720\n171#1:743\n171#1:744,2\n176#1:746\n176#1:747,2\n178#1:749,8\n179#1:757\n179#1:758,2\n180#1:760,2\n179#1:762\n205#1:763\n205#1:764\n206#1:765,3\n205#1:768\n211#1:769\n211#1:770,3\n214#1:773\n214#1:774\n215#1:775,3\n214#1:778\n233#1:779\n233#1:780,2\n267#1:790,2\n268#1:792,3\n267#1:795\n276#1:796\n276#1:797,3\n308#1:810,2\n314#1:812,3\n325#1:815\n325#1:816,2\n361#1:828,3\n389#1:831\n389#1:832,2\n413#1:836,14\n442#1:858,3\n450#1:861\n450#1:862,2\n502#1:885\n502#1:886,3\n538#1:909,2\n601#1:931\n601#1:932,2\n640#1:944,2\n652#1:947\n652#1:948,2\n*E\n"})
public final class UserActionProcessorInMemoryDataSource {

    @NotNull
    private final Map<String, Conversation> conversations;

    @NotNull
    private final a persistenceMutex;
    private boolean shouldReAuthenticateUser;

    @NotNull
    private User user;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$addMessageToConversationAndCommit$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "addMessageToConversationAndCommit")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return UserActionProcessorInMemoryDataSource.this.addMessageToConversationAndCommit(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$createPendingMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "createPendingMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03151 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03151(x70.c<? super C03151> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.createPendingMessage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "getConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03161 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03161(x70.c<? super C03161> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.getConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "getConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03171 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03171(x70.c<? super C03171> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.getConversations(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "getUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03181 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03181(x70.c<? super C03181> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.getUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$replacePendingMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "replacePendingMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03191 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C03191(x70.c<? super C03191> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.replacePendingMessage(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "saveConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03201 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03201(x70.c<? super C03201> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.saveConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "saveConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03211 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03211(x70.c<? super C03211> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.saveConversations(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$shouldReAuthenticateUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "shouldReAuthenticateUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03221 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03221(x70.c<? super C03221> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.shouldReAuthenticateUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationBusinessLastRead$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateConversationBusinessLastRead")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03231 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03231(x70.c<? super C03231> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateConversationBusinessLastRead(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationMessages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateConversationMessages")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03241 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C03241(x70.c<? super C03241> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateConversationMessages(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationMetadata$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateConversationMetadata")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03251 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03251(x70.c<? super C03251> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateConversationMetadata(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationParticipants$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateConversationParticipants")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03261 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C03261(x70.c<? super C03261> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateConversationParticipants(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationRoutingStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateConversationRoutingStatus")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03271 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03271(x70.c<? super C03271> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateConversationRoutingStatus(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateDownloadingAttachment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateDownloadingAttachment")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03281 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03281(x70.c<? super C03281> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateDownloadingAttachment(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateDownloadingStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateDownloadingStatus")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03291 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C03291(x70.c<? super C03291> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateDownloadingStatus(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateReAuthenticateUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateReAuthenticateUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03301 extends c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C03301(x70.c<? super C03301> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateReAuthenticateUser(false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource", f = "UserActionProcessorInMemoryDataSource.kt", l = {667}, m = "updateUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03311 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03311(x70.c<? super C03311> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorInMemoryDataSource.this.updateUser(null, this);
        }
    }

    public UserActionProcessorInMemoryDataSource(@NotNull User user, @NotNull Map<String, Conversation> map) {
        user.getClass();
        map.getClass();
        this.user = user;
        this.conversations = map;
        this.persistenceMutex = d.a();
    }

    private final Date messageCreatedAtDate(Conversation conversation, Date fallbackTime) {
        Object obj;
        Date received;
        Iterator<T> it = conversation.getMessages().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date received2 = ((Message) next).getReceived();
                do {
                    Object next2 = it.next();
                    Date received3 = ((Message) next2).getReceived();
                    if (received2.compareTo(received3) < 0) {
                        next = next2;
                        received2 = received3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Message message = (Message) obj;
        if (message != null && (received = message.getReceived()) != null) {
            fallbackTime = received;
        }
        return DateKtxKt.plusMillis(fallbackTime, 1);
    }

    private final Conversation saveConversationAsynchronously(Conversation conversation) {
        updateUserConversationsAsynchronously(conversation);
        return updateInMemoryConversationAsynchronously(conversation);
    }

    private final Conversation sortAndCommitConversationToMemory(Conversation conversation) {
        Conversation conversationCopy$default = Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, CollectionsKt.l0(conversation.getMessages(), new Comparator() { // from class: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$sortAndCommitConversationToMemory$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t11) {
                return w70.a.a(((Message) t9).getTimestamp(), ((Message) t11).getTimestamp());
            }
        }), false, null, null, null, null, 129023, null);
        this.conversations.put(conversation.getId(), conversationCopy$default);
        return conversationCopy$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Conversation updateInMemoryConversationAsynchronously(Conversation conversation) {
        Object next;
        Conversation conversation2 = this.conversations.get(conversation.getId());
        String str = null;
        Object[] objArr = 0;
        List<Message> messages = conversation2 != null ? conversation2.getMessages() : null;
        if (messages == null) {
            messages = n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            Message message = (Message) obj;
            if ((message.getStatus() instanceof MessageStatus.Pending) || (message.getStatus() instanceof MessageStatus.Failed) || (message.getStatus() instanceof MessageStatus.Downloading) || (message.getStatus() instanceof MessageStatus.DownloadFailed)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).getStatus() instanceof MessageStatus.DownloadFailed) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListD0 = CollectionsKt.d0(arrayList, conversation.getMessages());
        HashSet hashSet = new HashSet();
        ArrayList<Message> arrayList3 = new ArrayList();
        for (Object obj3 : arrayListD0) {
            if (hashSet.add(((Message) obj3).getId())) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(e0.o(arrayList3, 10));
        for (Message messageCopy$default : arrayList3) {
            Iterator<T> it = messages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Message) next).getId(), messageCopy$default.getId())) {
                    break;
                }
            }
            Message message2 = (Message) next;
            if (message2 != null) {
                messageCopy$default = ((messageCopy$default.getContent() instanceof MessageContent.Image) && (message2.getContent() instanceof MessageContent.FileUpload)) ? Message.copy$default(messageCopy$default, null, null, null, message2.getCreated(), null, 0.0d, MessageContent.Image.copy$default((MessageContent.Image) messageCopy$default.getContent(), null, null, ((MessageContent.FileUpload) message2.getContent()).getUri(), null, 0L, null, null, null, null, null, null, 2043, null), null, null, message2.getLocalId(), null, 1463, null) : Message.copy$default(messageCopy$default, null, null, null, message2.getCreated(), null, 0.0d, null, null, null, message2.getLocalId(), null, 1527, null);
            }
            arrayList4.add(messageCopy$default);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            Message message3 = (Message) obj4;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((Message) it2.next()).getId(), message3.getId())) {
                        arrayList5.add(obj4);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList6 = new ArrayList(e0.o(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Message.copy$default((Message) it3.next(), null, null, new MessageStatus.DownloadFailed(str, 1, objArr == true ? 1 : 0), null, null, 0.0d, null, null, null, null, null, 2043, null));
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : arrayList4) {
            Message message4 = (Message) obj5;
            if (!arrayList6.isEmpty()) {
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    if (Intrinsics.areEqual(((Message) it4.next()).getId(), message4.getId())) {
                        break;
                    }
                }
            }
            arrayList7.add(obj5);
        }
        return sortAndCommitConversationToMemory(Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, CollectionsKt.d0(arrayList6, arrayList7), false, null, null, null, null, 129023, null));
    }

    private final void updateInMemoryConversationsMetadata(Conversation conversation, Map<String, ? extends Object> metadata) {
        this.conversations.put(conversation.getId(), Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, null, false, null, metadata, null, null, 114687, null));
    }

    private final User updateUserConversationsAsynchronously(Conversation conversation) {
        List<Conversation> conversations = this.user.getConversations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : conversations) {
            if (!Intrinsics.areEqual(((Conversation) obj).getId(), conversation.getId())) {
                arrayList.add(obj);
            }
        }
        User userCopy$default = User.copy$default(this.user, null, null, null, null, null, null, null, CollectionsKt.e0(arrayList, Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, CollectionsKt.n0(1, conversation.getMessages()), false, null, null, null, null, 129023, null)), null, null, null, null, false, 8063, null);
        this.user = userCopy$default;
        return userCopy$default;
    }

    private final void updateUserConversationsMetadata(Conversation conversation, Map<String, ? extends Object> metadata) {
        List<Conversation> conversations = this.user.getConversations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : conversations) {
            if (!Intrinsics.areEqual(((Conversation) obj).getId(), conversation.getId())) {
                arrayList.add(obj);
            }
        }
        this.user = User.copy$default(this.user, null, null, null, null, null, null, null, CollectionsKt.e0(arrayList, Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, null, false, null, metadata, null, null, 114687, null)), null, null, null, null, false, 8063, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, zendesk.conversationkit.android.model.Message] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v15, types: [T, zendesk.conversationkit.android.model.Message] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addMessageToConversationAndCommit(@org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r30) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.addMessageToConversationAndCommit(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createPendingMessage(@org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Message> r30) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.createPendingMessage(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversation(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03161
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversation$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            e90.a r5 = (e90.a) r5
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r6)
            e90.a r6 = r4.persistenceMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            java.util.Map<java.lang.String, zendesk.conversationkit.android.model.Conversation> r1 = r4.conversations     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L57
            zendesk.conversationkit.android.model.Conversation r5 = (zendesk.conversationkit.android.model.Conversation) r5     // Catch: java.lang.Throwable -> L57
            r6.e(r0)
            return r5
        L57:
            r5 = move-exception
            r6.e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.getConversation(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversations(@org.jetbrains.annotations.NotNull x70.c<? super java.util.List<zendesk.conversationkit.android.model.Conversation>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03171
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversations$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversations$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getConversations$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r5)
            goto L43
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            e90.a r5 = r4.persistenceMutex
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            r5 = 0
            java.util.Map<java.lang.String, zendesk.conversationkit.android.model.Conversation> r1 = r4.conversations     // Catch: java.lang.Throwable -> L54
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L54
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L54
            java.util.List r1 = kotlin.collections.CollectionsKt.r0(r1)     // Catch: java.lang.Throwable -> L54
            r0.e(r5)
            return r1
        L54:
            r1 = move-exception
            r0.e(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.getConversations(x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.User> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03181
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$getUser$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r5)
            goto L43
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            e90.a r5 = r4.persistenceMutex
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            r5 = 0
            zendesk.conversationkit.android.model.User r1 = r4.user     // Catch: java.lang.Throwable -> L4a
            r0.e(r5)
            return r1
        L4a:
            r1 = move-exception
            r0.e(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.getUser(x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replacePendingMessage(@org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r31) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.replacePendingMessage(java.lang.String, zendesk.conversationkit.android.model.Message, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveConversation(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Conversation r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03201
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversation$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            e90.a r5 = (e90.a) r5
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r0 = (zendesk.conversationkit.android.model.Conversation) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r6)
            e90.a r6 = r4.persistenceMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            zendesk.conversationkit.android.model.Conversation r5 = r4.saveConversationAsynchronously(r5)     // Catch: java.lang.Throwable -> L53
            r6.e(r0)
            return r5
        L53:
            r5 = move-exception
            r6.e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.saveConversation(zendesk.conversationkit.android.model.Conversation, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveConversations(@org.jetbrains.annotations.NotNull java.util.List<zendesk.conversationkit.android.model.Conversation> r26, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r27
            boolean r2 = r0 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03211
            if (r2 == 0) goto L17
            r2 = r0
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversations$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03211) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversations$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$saveConversations$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.L$1
            e90.a r3 = (e90.a) r3
            java.lang.Object r2 = r2.L$0
            java.util.List r2 = (java.util.List) r2
            ba0.g.M(r0)
            goto L50
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L3a:
            ba0.g.M(r0)
            e90.a r0 = r1.persistenceMutex
            r4 = r26
            r2.L$0 = r4
            r2.L$1 = r0
            r2.label = r5
            java.lang.Object r2 = r0.g(r2)
            if (r2 != r3) goto L4e
            return r3
        L4e:
            r3 = r0
            r2 = r4
        L50:
            r4 = 0
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L7a
        L55:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L7a
            r5 = r2
            zendesk.conversationkit.android.model.Conversation r5 = (zendesk.conversationkit.android.model.Conversation) r5     // Catch: java.lang.Throwable -> L7a
            java.util.Map<java.lang.String, zendesk.conversationkit.android.model.Conversation> r2 = r1.conversations     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r5.getId()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L7a
            zendesk.conversationkit.android.model.Conversation r2 = (zendesk.conversationkit.android.model.Conversation) r2     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L7c
            java.util.List r2 = r2.getMessages()     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L77
            goto L7c
        L77:
            r17 = r2
            goto L81
        L7a:
            r0 = move-exception
            goto Lb0
        L7c:
            java.util.List r2 = r5.getMessages()     // Catch: java.lang.Throwable -> L7a
            goto L77
        L81:
            r23 = 129023(0x1f7ff, float:1.808E-40)
            r24 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            zendesk.conversationkit.android.model.Conversation r2 = zendesk.conversationkit.android.model.Conversation.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L7a
            java.util.Map<java.lang.String, zendesk.conversationkit.android.model.Conversation> r6 = r1.conversations     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> L7a
            r6.put(r5, r2)     // Catch: java.lang.Throwable -> L7a
            goto L55
        Laa:
            kotlin.Unit r0 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L7a
            r3.e(r4)
            return r0
        Lb0:
            r3.e(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.saveConversations(java.util.List, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shouldReAuthenticateUser(@org.jetbrains.annotations.NotNull x70.c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03221
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$shouldReAuthenticateUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$shouldReAuthenticateUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$shouldReAuthenticateUser$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r5)
            goto L43
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            e90.a r5 = r4.persistenceMutex
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            r5 = 0
            boolean r1 = r4.shouldReAuthenticateUser     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4e
            r0.e(r5)
            return r1
        L4e:
            r1 = move-exception
            r0.e(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.shouldReAuthenticateUser(x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationBusinessLastRead(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.Nullable java.util.Date r25, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r26) throws java.lang.Throwable {
        /*
            r23 = this;
            r1 = r23
            r0 = r26
            boolean r2 = r0 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03231
            if (r2 == 0) goto L17
            r2 = r0
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationBusinessLastRead$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03231) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationBusinessLastRead$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationBusinessLastRead$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L38
            java.lang.Object r3 = r2.L$2
            e90.a r3 = (e90.a) r3
            java.lang.Object r4 = r2.L$1
            java.util.Date r4 = (java.util.Date) r4
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r0)
            r11 = r4
            goto L5a
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L3f:
            ba0.g.M(r0)
            e90.a r0 = r1.persistenceMutex
            r4 = r24
            r2.L$0 = r4
            r6 = r25
            r2.L$1 = r6
            r2.L$2 = r0
            r2.label = r5
            java.lang.Object r2 = r0.g(r2)
            if (r2 != r3) goto L57
            return r3
        L57:
            r3 = r0
            r2 = r4
            r11 = r6
        L5a:
            r4 = 0
            java.util.Map<java.lang.String, zendesk.conversationkit.android.model.Conversation> r0 = r1.conversations     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L9c
            zendesk.conversationkit.android.model.Conversation r0 = (zendesk.conversationkit.android.model.Conversation) r0     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L92
            r21 = 130943(0x1ff7f, float:1.8349E-40)
            r22 = 0
            r2 = r4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r2 = r3
            r3 = r0
            zendesk.conversationkit.android.model.Conversation r0 = zendesk.conversationkit.android.model.Conversation.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L8f
            zendesk.conversationkit.android.model.Conversation r0 = r1.saveConversationAsynchronously(r0)     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            r2.e(r3)
            return r0
        L8f:
            r0 = move-exception
            r3 = 0
            goto L9f
        L92:
            r2 = r3
            r3 = r4
            zendesk.conversationkit.android.internal.exception.ConversationNotFoundException r0 = new zendesk.conversationkit.android.internal.exception.ConversationNotFoundException     // Catch: java.lang.Throwable -> L9a
            r0.<init>()     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        L9a:
            r0 = move-exception
            goto L9f
        L9c:
            r0 = move-exception
            r2 = r3
            r3 = r4
        L9f:
            r2.e(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateConversationBusinessLastRead(java.lang.String, java.util.Date, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationMessages(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull java.util.List<zendesk.conversationkit.android.model.Message> r28, boolean r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r30) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateConversationMessages(java.lang.String, java.util.List, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationMetadata(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Conversation r5, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03251
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationMetadata$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationMetadata$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationMetadata$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            e90.a r5 = (e90.a) r5
            java.lang.Object r6 = r0.L$1
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r0 = (zendesk.conversationkit.android.model.Conversation) r0
            ba0.g.M(r7)
            r7 = r5
            r5 = r0
            goto L50
        L35:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L3c:
            ba0.g.M(r7)
            e90.a r7 = r4.persistenceMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.g(r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = 0
            r4.updateUserConversationsMetadata(r5, r6)     // Catch: java.lang.Throwable -> L5d
            r4.updateInMemoryConversationsMetadata(r5, r6)     // Catch: java.lang.Throwable -> L5d
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L5d
            r7.e(r0)
            return r5
        L5d:
            r5 = move-exception
            r7.e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateConversationMetadata(zendesk.conversationkit.android.model.Conversation, java.util.Map, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationParticipants(@org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.Nullable java.lang.String r33, @org.jetbrains.annotations.Nullable java.util.Date r34, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r35) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateConversationParticipants(java.lang.String, java.lang.String, java.util.Date, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationRoutingStatus(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.ActivityEvent r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r29) {
        /*
            r26 = this;
            r1 = r26
            r0 = r29
            boolean r2 = r0 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03271
            if (r2 == 0) goto L17
            r2 = r0
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationRoutingStatus$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03271) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationRoutingStatus$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateConversationRoutingStatus$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L37
            java.lang.Object r3 = r2.L$2
            e90.a r3 = (e90.a) r3
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.L$0
            zendesk.conversationkit.android.model.ActivityEvent r2 = (zendesk.conversationkit.android.model.ActivityEvent) r2
            ba0.g.M(r0)
            goto L59
        L37:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L3e:
            ba0.g.M(r0)
            e90.a r0 = r1.persistenceMutex
            r4 = r27
            r2.L$0 = r4
            r6 = r28
            r2.L$1 = r6
            r2.L$2 = r0
            r2.label = r5
            java.lang.Object r2 = r0.g(r2)
            if (r2 != r3) goto L56
            return r3
        L56:
            r3 = r0
            r2 = r4
            r4 = r6
        L59:
            r5 = 0
            java.util.Map<java.lang.String, zendesk.conversationkit.android.model.Conversation> r0 = r1.conversations     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L75
            r6 = r0
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto La4
            zendesk.conversationkit.android.model.ActivityData r0 = r2.getActivityData()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L77
            zendesk.conversationkit.android.model.ConversationRoutingStatus r0 = zendesk.conversationkit.android.model.ActivityDataKt.toConversationRoutingStatus(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L72
            goto L77
        L72:
            r22 = r0
            goto L7c
        L75:
            r0 = move-exception
            goto Laa
        L77:
            zendesk.conversationkit.android.model.ConversationRoutingStatus r0 = r6.getRoutingStatus()     // Catch: java.lang.Throwable -> L75
            goto L72
        L7c:
            r24 = 98303(0x17fff, float:1.37752E-40)
            r25 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            zendesk.conversationkit.android.model.Conversation r0 = zendesk.conversationkit.android.model.Conversation.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L75
            zendesk.conversationkit.android.model.Conversation r0 = r1.saveConversationAsynchronously(r0)     // Catch: java.lang.Throwable -> L75
            r3.e(r5)
            return r0
        La4:
            zendesk.conversationkit.android.internal.exception.ConversationNotFoundException r0 = new zendesk.conversationkit.android.internal.exception.ConversationNotFoundException     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        Laa:
            r3.e(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateConversationRoutingStatus(zendesk.conversationkit.android.model.ActivityEvent, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDownloadingAttachment(@org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r30) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateDownloadingAttachment(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDownloadingStatus(@org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.MessageStatus r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateDownloadingStatus(java.lang.String, zendesk.conversationkit.android.model.MessageStatus, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateReAuthenticateUser(boolean r5, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03301
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateReAuthenticateUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateReAuthenticateUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateReAuthenticateUser$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r6)
            goto L47
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            e90.a r6 = r4.persistenceMutex
            r0.L$0 = r6
            r0.Z$0 = r5
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r6
        L47:
            r6 = 0
            r4.shouldReAuthenticateUser = r5     // Catch: java.lang.Throwable -> L50
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L50
            r0.e(r6)
            return r5
        L50:
            r5 = move-exception
            r0.e(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateReAuthenticateUser(boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.User r5, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03311
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.C03311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource$updateUser$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            e90.a r5 = (e90.a) r5
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.model.User r0 = (zendesk.conversationkit.android.model.User) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r6)
            e90.a r6 = r4.persistenceMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            r4.user = r5     // Catch: java.lang.Throwable -> L53
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L53
            r6.e(r0)
            return r5
        L53:
            r5 = move-exception
            r6.e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource.updateUser(zendesk.conversationkit.android.model.User, x70.c):java.lang.Object");
    }

    public /* synthetic */ UserActionProcessorInMemoryDataSource(User user, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, (i11 & 2) != 0 ? new HashMap() : map);
    }
}
