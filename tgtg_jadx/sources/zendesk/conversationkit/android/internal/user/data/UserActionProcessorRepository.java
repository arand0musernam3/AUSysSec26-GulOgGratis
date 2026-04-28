package zendesk.conversationkit.android.internal.user.data;

import android.webkit.WebStorage;
import com.app.tgtg.model.local.AppConstants;
import com.braze.models.inappmessage.InAppMessageBase;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.internal.ConnectivityObserver;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.AuthorType;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationType;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001b\u0010\u0018J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b!\u0010\u0018J6\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b$\u0010%J.\u0010&\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b&\u0010'J \u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0086@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b.\u0010\u001fJ\u0010\u0010/\u001a\u00020 H\u0086@¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020 ¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020)H\u0086@¢\u0006\u0004\b2\u0010\u001fJ\u0018\u00104\u001a\u00020 2\u0006\u00103\u001a\u00020)H\u0086@¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b7\u0010\u0018J\u0010\u00108\u001a\u00020 H\u0086@¢\u0006\u0004\b8\u0010\u001fJ\u0018\u0010:\u001a\u00020 2\u0006\u00109\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b:\u0010\u0018J \u0010=\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010<\u001a\u00020;H\u0086@¢\u0006\u0004\b=\u0010>J \u0010B\u001a\u00020A2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010@\u001a\u00020?H\u0086@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020;2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010D\u001a\u00020;H\u0086@¢\u0006\u0004\bE\u0010>J \u0010F\u001a\u00020;2\u0006\u0010D\u001a\u00020;2\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bF\u0010GJ \u0010J\u001a\u00020 2\u0006\u0010I\u001a\u00020H2\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u0004\u0018\u00010\u00132\u0006\u0010M\u001a\u00020LH\u0086@¢\u0006\u0004\bN\u0010OJ\u0018\u0010Q\u001a\u00020 2\u0006\u0010P\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bQ\u0010\u0018J \u0010S\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bS\u0010TJ\u0018\u0010W\u001a\u00020 2\u0006\u0010V\u001a\u00020UH\u0086@¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020UH\u0086@¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010[\u001a\u00020 2\u0006\u0010Z\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b[\u0010\u0018J\u0018\u0010]\u001a\u00020 2\u0006\u0010\\\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b]\u0010\u0018J\u0018\u0010`\u001a\u00020 2\u0006\u0010_\u001a\u00020^H\u0086@¢\u0006\u0004\b`\u0010aJ\u0018\u0010b\u001a\u00020^2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bb\u0010cJ\u0018\u0010d\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bd\u0010cJ \u0010e\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010D\u001a\u00020;H\u0086@¢\u0006\u0004\be\u0010>J(\u0010h\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bh\u0010iJ(\u0010j\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bj\u0010iJ\u0018\u0010l\u001a\u00020k2\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bl\u0010\u0018J\u0018\u0010n\u001a\u00020 2\u0006\u0010m\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bn\u0010\u0018J\u0018\u0010p\u001a\u00020\u00132\u0006\u0010o\u001a\u00020\u0013H\u0082@¢\u0006\u0004\bp\u0010qJ>\u0010u\u001a\u00020\u00132\b\b\u0002\u0010s\u001a\u00020r2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0082@¢\u0006\u0004\bu\u0010vJ\u001c\u0010w\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\bw\u0010xJ.\u0010y\u001a\u00020 2\u0006\u0010o\u001a\u00020\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0082@¢\u0006\u0004\by\u0010zJ\u0018\u0010|\u001a\u00020 2\u0006\u0010{\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b|\u0010}J(\u0010\u0081\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010~2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0082\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u00020;2\u0006\u0010D\u001a\u00020;2\u0006\u0010\u0016\u001a\u00020\u0011H\u0082@¢\u0006\u0005\b\u0083\u0001\u0010GJ\u001a\u0010\u0084\u0001\u001a\u00020 2\u0006\u0010o\u001a\u00020\u0013H\u0082@¢\u0006\u0005\b\u0084\u0001\u0010qJ\u001b\u0010\u0086\u0001\u001a\u00020 2\u0007\u0010\u0085\u0001\u001a\u00020\u001dH\u0082@¢\u0006\u0005\b\u0086\u0001\u0010}J\u001a\u0010\u0087\u0001\u001a\u00020\u00132\u0006\u0010M\u001a\u00020LH\u0082@¢\u0006\u0005\b\u0087\u0001\u0010OJ#\u0010\u0088\u0001\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010\u0016\u001a\u00020\u0011H\u0082@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u008a\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u008b\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008c\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008d\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;", "", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;", "userActionProcessorInMemoryDataSource", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorLocalDataSource;", "userActionProcessorLocalDataSource", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRemoteDataSource;", "userActionProcessorRemoteDataSource", "Lzendesk/conversationkit/android/model/Config;", "config", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "connectivityObserver", "<init>", "(Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorLocalDataSource;Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRemoteDataSource;Lzendesk/conversationkit/android/model/Config;Lzendesk/conversationkit/android/internal/ConnectivityObserver;)V", "", "proactiveMessageId", "", "", "metadata", "Lzendesk/conversationkit/android/model/Conversation;", "createConversation", "(Ljava/lang/Integer;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "conversationId", "refreshConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getProactiveMessageConversation", "(Ljava/lang/Integer;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getConversationRemotely", "getPersistedConversation", "Lzendesk/conversationkit/android/model/User;", "getUser", "(Lx70/c;)Ljava/lang/Object;", "", "removeConversationById", "Lzendesk/conversationkit/android/model/ConversationStatus;", "status", "updateConversationById", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "updateConversationMetadata", "(Ljava/lang/String;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "offset", "", "fromCache", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "getConversations", "(IZLx70/c;)Ljava/lang/Object;", "refreshUser", "clearStorage", "clearWebStorage", "()V", "shouldReAuthenticateUser", "reAuthenticateUser", "updateReAuthenticateUser", "(ZLx70/c;)Ljava/lang/Object;", "jwt", "login", "logout", "deviceLocale", "updateAppUserLocale", "Lzendesk/conversationkit/android/model/Message;", "newMessage", "updateConversation", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "", "beforeTimestamp", "Lzendesk/conversationkit/android/model/MessageList;", "loadMoreMessages", "(Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", InAppMessageBase.MESSAGE, "createPendingMessage", "sendMessage", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ActivityData;", "activityData", "sendActivityData", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ActivityEvent;", "activityEvent", "processActivityEventReceived", "(Lzendesk/conversationkit/android/model/ActivityEvent;Lx70/c;)Ljava/lang/Object;", "pushNotificationToken", "updatePushToken", "actionId", "sendPostbackAction", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/VisitType;", "visitType", "setVisitType", "(Lzendesk/conversationkit/android/model/VisitType;Lx70/c;)Ljava/lang/Object;", "getVisitType", "pushToken", "setPushToken", "integrationId", "setIntegrationId", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "proactiveMessage", "setProactiveMessage", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Lx70/c;)Ljava/lang/Object;", "getProactiveMessage", "(ILx70/c;)Ljava/lang/Object;", "clearProactiveMessage", "updateDownloadingAttachment", "fileName", "messageId", "updateDownloadingStatusSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "updateDownloadingStatusFailed", "Lzendesk/conversationkit/android/model/WaitTimeDataResponse;", "getWaitTimeForConversation", "newJWT", "updateUserJwt", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "saveConversation", "(Lzendesk/conversationkit/android/model/Conversation;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ConversationType;", "conversationType", "signedCampaignData", "createConversationFromNetwork", "(Lzendesk/conversationkit/android/model/ConversationType;Ljava/lang/String;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "getProactiveCampaignData", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "saveConversationWithMetadata", "(Lzendesk/conversationkit/android/model/Conversation;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "newUser", "saveUser", "(Lzendesk/conversationkit/android/model/User;Lx70/c;)Ljava/lang/Object;", "T", "Lkotlin/Function0;", "call", "executeWithUnknownHostExceptionRetry", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "sendMessageRestRequest", "saveConversationToLocalStorage", "user", "saveUserToLocalStorage", "processConversationReadActivity", "processConversationRoutingActivity", "(Lzendesk/conversationkit/android/model/ActivityEvent;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorLocalDataSource;", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRemoteDataSource;", "Lzendesk/conversationkit/android/model/Config;", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserActionProcessorRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActionProcessorRepository.kt\nzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1014:1\n638#1,5:1016\n1#2:1015\n774#3:1021\n865#3,2:1022\n1563#3:1024\n1634#3,2:1025\n774#3:1027\n865#3,2:1028\n1636#3:1030\n*S KotlinDebug\n*F\n+ 1 UserActionProcessorRepository.kt\nzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository\n*L\n141#1:1016,5\n691#1:1021\n691#1:1022,2\n707#1:1024\n707#1:1025,2\n708#1:1027\n708#1:1028,2\n707#1:1030\n*E\n"})
public final class UserActionProcessorRepository {
    private static final long REMOTE_CALL_RETRY_TIMEOUT = TimeConstants.ONE_MINUTE_DIFFERENCE;

    @NotNull
    private final Config config;

    @NotNull
    private final ConnectivityObserver connectivityObserver;

    @NotNull
    private final UserActionProcessorInMemoryDataSource userActionProcessorInMemoryDataSource;

    @NotNull
    private final UserActionProcessorLocalDataSource userActionProcessorLocalDataSource;

    @NotNull
    private final UserActionProcessorRemoteDataSource userActionProcessorRemoteDataSource;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActivityData.values().length];
            try {
                iArr[ActivityData.CONVERSATION_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityData.CONVERSATION_ROUTING_QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityData.CONVERSATION_ROUTING_ASSIGNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityData.CONVERSATION_ROUTING_CLEARED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuthorType.values().length];
            try {
                iArr2[AuthorType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AuthorType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$createConversation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {66, 77, 76, 80}, m = "createConversation")
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
            return UserActionProcessorRepository.this.createConversation(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$createConversationFromNetwork$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {108, 112, 113, 114, 107}, m = "createConversationFromNetwork")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03421 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C03421(x70.c<? super C03421> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.createConversationFromNetwork(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$createPendingMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {577, 578}, m = "createPendingMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03431 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03431(x70.c<? super C03431> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.createPendingMessage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getConversationRemotely$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {188, 189, 187, BERTags.PRIVATE}, m = "getConversationRemotely")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03441 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03441(x70.c<? super C03441> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getConversationRemotely(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {314, 317, 320, 327, 328, 326, 331}, m = "getConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03451 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03451(x70.c<? super C03451> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getConversations(0, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getPersistedConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {205, 206, 207}, m = "getPersistedConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03461 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03461(x70.c<? super C03461> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getPersistedConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveCampaignData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {128}, m = "getProactiveCampaignData")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03471 extends c {
        int label;
        /* synthetic */ Object result;

        public C03471(x70.c<? super C03471> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getProactiveCampaignData(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {909}, m = "getProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03481 extends c {
        int label;
        /* synthetic */ Object result;

        public C03481(x70.c<? super C03481> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getProactiveMessage(0, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveMessageConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {167, 169, 170, 171, 172, 166, 174}, m = "getProactiveMessageConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03491 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C03491(x70.c<? super C03491> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getProactiveMessageConversation(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getWaitTimeForConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {992, 991}, m = "getWaitTimeForConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03501 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03501(x70.c<? super C03501> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.getWaitTimeForConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$loadMoreMessages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {535, 540, 539, 545, 550, 550, 551}, m = "loadMoreMessages")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03511 extends c {
        double D$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03511(x70.c<? super C03511> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.loadMoreMessages(null, 0.0d, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$login$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {429, 429, 434, 435, 436, 437, 432, 439, 440}, m = "login")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03521 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C03521(x70.c<? super C03521> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.login(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$logout$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {457, 461, 462, 463, 459}, m = "logout")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03531 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C03531(x70.c<? super C03531> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.logout(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processActivityEventReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {749, 751, 755}, m = "processActivityEventReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03541 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03541(x70.c<? super C03541> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.processActivityEventReceived(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processConversationReadActivity$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {778, 783, 788, 788, 789}, m = "processConversationReadActivity")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03551 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03551(x70.c<? super C03551> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.processConversationReadActivity(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processConversationRoutingActivity$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {809, 813}, m = "processConversationRoutingActivity")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03561 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03561(x70.c<? super C03561> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.processConversationRoutingActivity(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$refreshConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {142, 144, 145, 143, 142, 144, 145, 143, 149}, m = "refreshConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03571 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03571(x70.c<? super C03571> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.refreshConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$refreshUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {350, 351, 349, 353}, m = "refreshUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03581 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03581(x70.c<? super C03581> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.refreshUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {90, 91, 91, 92}, m = "saveConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03591 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03591(x70.c<? super C03591> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.saveConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversationWithMetadata$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {291, 295}, m = "saveConversationWithMetadata")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03601 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03601(x70.c<? super C03601> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.saveConversationWithMetadata(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {368, 369}, m = "saveUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03611 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03611(x70.c<? super C03611> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.saveUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$sendActivityData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {725, 727, 728, 729, 724}, m = "sendActivityData")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03621 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C03621(x70.c<? super C03621> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.sendActivityData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {606, 609, 610, 614, 619, 620, 620, 625}, m = "sendMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03631 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C03631(x70.c<? super C03631> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.sendMessage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$sendMessageRestRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {655, 660, 661, 662, AppConstants.REQUEST_CODE_FILTER, 667, 672, 673, 674, 666}, m = "sendMessageRestRequest")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03641 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C03641(x70.c<? super C03641> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.sendMessageRestRequest(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$sendPostbackAction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {844, 846, 847, 848, 843}, m = "sendPostbackAction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03651 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C03651(x70.c<? super C03651> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.sendPostbackAction(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateAppUserLocale$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {481, 480}, m = "updateAppUserLocale")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03661 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03661(x70.c<? super C03661> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updateAppUserLocale(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {502, 504, 508, 508, 509}, m = "updateConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03671 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03671(x70.c<? super C03671> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updateConversation(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversationById$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {253, 258, 259}, m = "updateConversationById")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03681 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03681(x70.c<? super C03681> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updateConversationById(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversationMetadata$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {275, 276, 277, 280, 274, 282}, m = "updateConversationMetadata")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03691 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C03691(x70.c<? super C03691> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updateConversationMetadata(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateDownloadingAttachment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {932, 933}, m = "updateDownloadingAttachment")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03701 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03701(x70.c<? super C03701> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updateDownloadingAttachment(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updatePushToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {825, 826, 824}, m = "updatePushToken")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03711 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03711(x70.c<? super C03711> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updatePushToken(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateUserJwt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository", f = "UserActionProcessorRepository.kt", l = {1003, 1006, 1007}, m = "updateUserJwt")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03721 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03721(x70.c<? super C03721> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRepository.this.updateUserJwt(null, this);
        }
    }

    public UserActionProcessorRepository(@NotNull UserActionProcessorInMemoryDataSource userActionProcessorInMemoryDataSource, @NotNull UserActionProcessorLocalDataSource userActionProcessorLocalDataSource, @NotNull UserActionProcessorRemoteDataSource userActionProcessorRemoteDataSource, @NotNull Config config, @NotNull ConnectivityObserver connectivityObserver) {
        userActionProcessorInMemoryDataSource.getClass();
        userActionProcessorLocalDataSource.getClass();
        userActionProcessorRemoteDataSource.getClass();
        config.getClass();
        connectivityObserver.getClass();
        this.userActionProcessorInMemoryDataSource = userActionProcessorInMemoryDataSource;
        this.userActionProcessorLocalDataSource = userActionProcessorLocalDataSource;
        this.userActionProcessorRemoteDataSource = userActionProcessorRemoteDataSource;
        this.config = config;
        this.connectivityObserver = connectivityObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createConversationFromNetwork(zendesk.conversationkit.android.model.ConversationType r12, java.lang.String r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14, x70.c<? super zendesk.conversationkit.android.model.Conversation> r15) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.createConversationFromNetwork(zendesk.conversationkit.android.model.ConversationType, java.lang.String, java.util.Map, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object createConversationFromNetwork$default(UserActionProcessorRepository userActionProcessorRepository, ConversationType conversationType, String str, Map map, x70.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            conversationType = ConversationType.PERSONAL;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            map = null;
        }
        return userActionProcessorRepository.createConversationFromNetwork(conversationType, str, map, cVar);
    }

    private final <T> T executeWithUnknownHostExceptionRetry(Function0<? extends T> call) {
        try {
            return (T) call.invoke();
        } catch (UnknownHostException unused) {
            return (T) call.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProactiveCampaignData(java.lang.Integer r6, x70.c<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03471
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveCampaignData$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveCampaignData$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveCampaignData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ba0.g.M(r7)
            goto L43
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r7)
            if (r6 == 0) goto L4c
            int r6 = r6.intValue()
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r7 = r5.userActionProcessorLocalDataSource
            r0.label = r4
            java.lang.Object r7 = r7.getProactiveMessage(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            zendesk.conversationkit.android.model.ProactiveMessage r7 = (zendesk.conversationkit.android.model.ProactiveMessage) r7
            if (r7 == 0) goto L4c
            java.lang.String r6 = r7.getJwt()
            return r6
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getProactiveCampaignData(java.lang.Integer, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processConversationReadActivity(zendesk.conversationkit.android.model.ActivityEvent r10, x70.c<? super zendesk.conversationkit.android.model.Conversation> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.processConversationReadActivity(zendesk.conversationkit.android.model.ActivityEvent, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processConversationRoutingActivity(zendesk.conversationkit.android.model.ActivityEvent r6, java.lang.String r7, x70.c<? super zendesk.conversationkit.android.model.Conversation> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03561
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processConversationRoutingActivity$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processConversationRoutingActivity$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processConversationRoutingActivity$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            ba0.g.M(r8)
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r8)
            goto L47
        L39:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r8 = r5.userActionProcessorInMemoryDataSource
            r0.label = r4
            java.lang.Object r8 = r8.updateConversationRoutingStatus(r6, r7, r0)
            if (r8 != r1) goto L47
            goto L55
        L47:
            zendesk.conversationkit.android.model.Conversation r8 = (zendesk.conversationkit.android.model.Conversation) r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r6 = r5.userActionProcessorLocalDataSource
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r6 = r6.saveConversation(r8, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.processConversationRoutingActivity(zendesk.conversationkit.android.model.ActivityEvent, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveConversation(zendesk.conversationkit.android.model.Conversation r10, x70.c<? super zendesk.conversationkit.android.model.Conversation> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03591
            if (r0 == 0) goto L13
            r0 = r11
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversation$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L63
            if (r2 == r7) goto L5b
            if (r2 == r6) goto L48
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L35
            java.lang.Object r10 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r10 = (zendesk.conversationkit.android.model.Conversation) r10
            ba0.g.M(r11)
            return r10
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L3c:
            java.lang.Object r10 = r0.L$1
            zendesk.conversationkit.android.model.Conversation r10 = (zendesk.conversationkit.android.model.Conversation) r10
            java.lang.Object r2 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r2 = (zendesk.conversationkit.android.model.Conversation) r2
            ba0.g.M(r11)
            goto L99
        L48:
            java.lang.Object r10 = r0.L$2
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r10 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository) r10
            java.lang.Object r2 = r0.L$1
            zendesk.conversationkit.android.model.Conversation r2 = (zendesk.conversationkit.android.model.Conversation) r2
            java.lang.Object r6 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            ba0.g.M(r11)
            r8 = r2
            r2 = r11
            r11 = r8
            goto L86
        L5b:
            java.lang.Object r10 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r10 = (zendesk.conversationkit.android.model.Conversation) r10
            ba0.g.M(r11)
            goto L73
        L63:
            ba0.g.M(r11)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r11 = r9.userActionProcessorInMemoryDataSource
            r0.L$0 = r10
            r0.label = r7
            java.lang.Object r11 = r11.saveConversation(r10, r0)
            if (r11 != r1) goto L73
            goto La5
        L73:
            zendesk.conversationkit.android.model.Conversation r11 = (zendesk.conversationkit.android.model.Conversation) r11
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r9
            r0.label = r6
            java.lang.Object r2 = r9.getUser(r0)
            if (r2 != r1) goto L84
            goto La5
        L84:
            r6 = r10
            r10 = r9
        L86:
            zendesk.conversationkit.android.model.User r2 = (zendesk.conversationkit.android.model.User) r2
            r0.L$0 = r6
            r0.L$1 = r11
            r0.L$2 = r3
            r0.label = r5
            java.lang.Object r10 = r10.saveUserToLocalStorage(r2, r0)
            if (r10 != r1) goto L97
            goto La5
        L97:
            r10 = r11
            r2 = r6
        L99:
            r0.L$0 = r10
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r11 = r9.saveConversationToLocalStorage(r2, r0)
            if (r11 != r1) goto La6
        La5:
            return r1
        La6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.saveConversation(zendesk.conversationkit.android.model.Conversation, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveConversationToLocalStorage(Conversation conversation, x70.c<? super Unit> cVar) {
        List<Message> messages = conversation.getMessages();
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (((Message) obj).getStatus() instanceof MessageStatus.Sent) {
                arrayList.add(obj);
            }
        }
        Object objSaveConversation = this.userActionProcessorLocalDataSource.saveConversation(Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, arrayList, false, null, null, null, null, 129023, null), cVar);
        return objSaveConversation == a.COROUTINE_SUSPENDED ? objSaveConversation : Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r7.saveConversation(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveConversationWithMetadata(zendesk.conversationkit.android.model.Conversation r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, x70.c<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03601
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversationWithMetadata$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversationWithMetadata$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveConversationWithMetadata$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            goto L57
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            java.lang.Object r6 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            ba0.g.M(r8)
            goto L49
        L39:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r8 = r5.userActionProcessorInMemoryDataSource
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.updateConversationMetadata(r6, r7, r0)
            if (r7 != r1) goto L49
            goto L56
        L49:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r7 = r5.userActionProcessorLocalDataSource
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r6 = r7.saveConversation(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.saveConversationWithMetadata(zendesk.conversationkit.android.model.Conversation, java.util.Map, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (saveUserToLocalStorage(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveUser(zendesk.conversationkit.android.model.User r6, x70.c<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03611
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$saveUser$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r7)
            goto L55
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            java.lang.Object r6 = r0.L$0
            zendesk.conversationkit.android.model.User r6 = (zendesk.conversationkit.android.model.User) r6
            ba0.g.M(r7)
            goto L49
        L39:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r7 = r5.userActionProcessorInMemoryDataSource
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.updateUser(r6, r0)
            if (r7 != r1) goto L49
            goto L54
        L49:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r5.saveUserToLocalStorage(r6, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.saveUser(zendesk.conversationkit.android.model.User, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveUserToLocalStorage(User user, x70.c<? super Unit> cVar) {
        List<Conversation> conversations = user.getConversations();
        ArrayList arrayList = new ArrayList(e0.o(conversations, 10));
        for (Conversation conversation : conversations) {
            List<Message> messages = conversation.getMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : messages) {
                if (((Message) obj).getStatus() instanceof MessageStatus.Sent) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, arrayList2, false, null, null, null, null, 129023, null));
        }
        Object objUpdateUser = this.userActionProcessorLocalDataSource.updateUser(User.copy$default(user, null, null, null, null, null, null, null, arrayList, null, null, null, null, false, 8063, null), cVar);
        return objUpdateUser == a.COROUTINE_SUSPENDED ? objUpdateUser : Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[PHI: r1 r2 r3 r5 r7 r8 r9 r10 r11
      0x005a: PHI (r1v29 java.lang.String) = (r1v26 java.lang.String), (r1v33 java.lang.String) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r2v29 java.lang.String) = (r2v25 java.lang.String), (r2v32 java.lang.String) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r3v32 java.lang.Object) = (r3v31 java.lang.Object), (r3v1 java.lang.Object) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r5v28 zendesk.conversationkit.android.model.Message) = (r5v24 zendesk.conversationkit.android.model.Message), (r5v31 zendesk.conversationkit.android.model.Message) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r7v24 java.lang.String) = (r7v20 java.lang.String), (r7v27 java.lang.String) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r8v24 java.util.Date) = (r8v20 java.util.Date), (r8v26 java.util.Date) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r9v26 java.lang.String) = (r9v22 java.lang.String), (r9v29 java.lang.String) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r10v22 java.lang.String) = (r10v18 java.lang.String), (r10v25 java.lang.String) binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r11v15 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r11v13 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r11v18 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:61:0x029b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7 A[PHI: r1 r2 r3 r5 r7 r8 r9 r10 r11 r12
      0x00e7: PHI (r1v13 java.lang.String) = (r1v10 java.lang.String), (r1v17 java.lang.String) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r2v13 java.lang.String) = (r2v9 java.lang.String), (r2v16 java.lang.String) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r3v19 java.lang.Object) = (r3v18 java.lang.Object), (r3v1 java.lang.Object) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r5v13 zendesk.conversationkit.android.model.MessageContent$FileUpload) = 
      (r5v9 zendesk.conversationkit.android.model.MessageContent$FileUpload)
      (r5v16 zendesk.conversationkit.android.model.MessageContent$FileUpload)
     binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r7v9 java.lang.String) = (r7v5 java.lang.String), (r7v12 java.lang.String) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r8v11 java.util.Date) = (r8v7 java.util.Date), (r8v14 java.util.Date) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r9v12 java.lang.String) = (r9v8 java.lang.String), (r9v15 java.lang.String) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r10v11 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r10v7 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r10v14 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r11v7 java.lang.String) = (r11v3 java.lang.String), (r11v10 java.lang.String) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r12v5 zendesk.conversationkit.android.model.Message) = (r12v3 zendesk.conversationkit.android.model.Message), (r12v8 zendesk.conversationkit.android.model.Message) binds: [B:42:0x01f0, B:22:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessageRestRequest(zendesk.conversationkit.android.model.Message r18, java.lang.String r19, x70.c<? super zendesk.conversationkit.android.model.Message> r20) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.sendMessageRestRequest(zendesk.conversationkit.android.model.Message, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object clearProactiveMessage(int i11, @NotNull x70.c<? super Unit> cVar) {
        Object objClearProactiveMessage = this.userActionProcessorLocalDataSource.clearProactiveMessage(i11, cVar);
        return objClearProactiveMessage == a.COROUTINE_SUSPENDED ? objClearProactiveMessage : Unit.f26487a;
    }

    @Nullable
    public final Object clearStorage(@NotNull x70.c<? super Unit> cVar) {
        Object objClear = this.userActionProcessorLocalDataSource.clear(cVar);
        return objClear == a.COROUTINE_SUSPENDED ? objClear : Unit.f26487a;
    }

    public final void clearWebStorage() {
        WebStorage.getInstance().deleteAllData();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[PHI: r12
      0x00bf: PHI (r12v14 java.lang.Object) = (r12v13 java.lang.Object), (r12v1 java.lang.Object) binds: [B:41:0x00bc, B:19:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createConversation(@org.jetbrains.annotations.Nullable java.lang.Integer r10, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r11, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.createConversation(java.lang.Integer, java.util.Map, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createPendingMessage(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r7, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Message> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03431
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$createPendingMessage$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$createPendingMessage$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$createPendingMessage$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            return r8
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            zendesk.conversationkit.android.model.Message r7 = (zendesk.conversationkit.android.model.Message) r7
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            ba0.g.M(r8)
            goto L6d
        L3e:
            ba0.g.M(r8)
            zendesk.conversationkit.android.model.MessageContent r8 = r7.getContent()
            boolean r8 = r8 instanceof zendesk.conversationkit.android.model.MessageContent.Text
            if (r8 == 0) goto L60
            zendesk.conversationkit.android.model.MessageContent r8 = r7.getContent()
            zendesk.conversationkit.android.model.MessageContent$Text r8 = (zendesk.conversationkit.android.model.MessageContent.Text) r8
            java.lang.String r8 = r8.getText()
            boolean r8 = kotlin.text.StringsKt.H(r8)
            if (r8 != 0) goto L5a
            goto L60
        L5a:
            zendesk.conversationkit.android.internal.exception.MessageContentIsBlankException r6 = new zendesk.conversationkit.android.internal.exception.MessageContentIsBlankException
            r6.<init>()
            throw r6
        L60:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r5.getPersistedConversation(r6, r0)
            if (r8 != r1) goto L6d
            goto L80
        L6d:
            zendesk.conversationkit.android.model.Conversation r8 = (zendesk.conversationkit.android.model.Conversation) r8
            if (r8 == 0) goto L82
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r8 = r5.userActionProcessorInMemoryDataSource
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r8.createPendingMessage(r6, r7, r0)
            if (r6 != r1) goto L81
        L80:
            return r1
        L81:
            return r6
        L82:
            zendesk.conversationkit.android.internal.exception.ConversationNotFoundException r6 = new zendesk.conversationkit.android.internal.exception.ConversationNotFoundException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.createPendingMessage(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[PHI: r10
      0x00a3: PHI (r10v12 java.lang.Object) = (r10v11 java.lang.Object), (r10v1 java.lang.Object) binds: [B:30:0x00a0, B:18:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversationRemotely(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03441
            if (r0 == 0) goto L13
            r0 = r10
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getConversationRemotely$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getConversationRemotely$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getConversationRemotely$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5b
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            ba0.g.M(r10)
            return r10
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L37:
            ba0.g.M(r10)
            goto La3
        L3c:
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r2
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            ba0.g.M(r10)
            goto L8d
        L4c:
            java.lang.Object r9 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r9 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r10)
            r7 = r2
            r2 = r9
            r9 = r7
            goto L72
        L5b:
            ba0.g.M(r10)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r10 = r8.userActionProcessorRemoteDataSource
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r2 = r8.userActionProcessorInMemoryDataSource
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r6
            java.lang.Object r2 = r2.getUser(r0)
            if (r2 != r1) goto L6f
            goto Lad
        L6f:
            r7 = r2
            r2 = r10
            r10 = r7
        L72:
            zendesk.conversationkit.android.model.User r10 = (zendesk.conversationkit.android.model.User) r10
            java.lang.String r10 = zendesk.conversationkit.android.internal.user.UserExtensionsKt.getAuthorization(r10)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r6 = r8.userActionProcessorInMemoryDataSource
            r0.L$0 = r9
            r0.L$1 = r2
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r5 = r6.getUser(r0)
            if (r5 != r1) goto L89
            goto Lad
        L89:
            r7 = r5
            r5 = r9
            r9 = r10
            r10 = r7
        L8d:
            zendesk.conversationkit.android.model.User r10 = (zendesk.conversationkit.android.model.User) r10
            java.lang.String r10 = r10.getId()
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r10 = r2.getConversation(r9, r5, r10, r0)
            if (r10 != r1) goto La3
            goto Lad
        La3:
            zendesk.conversationkit.android.model.Conversation r10 = (zendesk.conversationkit.android.model.Conversation) r10
            r0.label = r3
            java.lang.Object r9 = r8.saveConversation(r10, r0)
            if (r9 != r1) goto Lae
        Lad:
            return r1
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getConversationRemotely(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r7 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[PHI: r2 r5 r6 r7
      0x00be: PHI (r2v3 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r2v2 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r2v5 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:41:0x00bb, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r5v9 int) = (r5v7 int), (r5v10 int) binds: [B:41:0x00bb, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v10 java.lang.String) binds: [B:41:0x00bb, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r7v14 java.lang.Object) = (r7v13 java.lang.Object), (r7v1 java.lang.Object) binds: [B:41:0x00bb, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[PHI: r7
      0x00d3: PHI (r7v18 java.lang.Object) = (r7v17 java.lang.Object), (r7v1 java.lang.Object) binds: [B:44:0x00d0, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversations(int r5, boolean r6, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.ConversationsPagination> r7) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getConversations(int, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPersistedConversation(@org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03461
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getPersistedConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getPersistedConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getPersistedConversation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r8 = (zendesk.conversationkit.android.model.Conversation) r8
            ba0.g.M(r9)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L39:
            ba0.g.M(r9)
            goto L68
        L3d:
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            ba0.g.M(r9)
            goto L57
        L45:
            ba0.g.M(r9)
            if (r8 == 0) goto L7c
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r9 = r7.userActionProcessorInMemoryDataSource
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.getConversation(r8, r0)
            if (r9 != r1) goto L57
            goto L78
        L57:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            if (r9 != 0) goto L7b
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r9 = r7.userActionProcessorLocalDataSource
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r9 = r9.getConversation(r8, r0)
            if (r9 != r1) goto L68
            goto L78
        L68:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            if (r9 == 0) goto L7a
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r8 = r7.userActionProcessorInMemoryDataSource
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r8 = r8.saveConversation(r9, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            return r9
        L7a:
            return r6
        L7b:
            return r9
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getPersistedConversation(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProactiveMessage(int r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.ProactiveMessage> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03481
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r6 = r4.userActionProcessorLocalDataSource
            r0.label = r3
            java.lang.Object r6 = r6.getProactiveMessage(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.model.ProactiveMessage r6 = (zendesk.conversationkit.android.model.ProactiveMessage) r6
            if (r6 == 0) goto L41
            return r6
        L41:
            zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException r5 = new zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getProactiveMessage(int, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[PHI: r1 r2 r3 r4 r11 r12 r13
      0x004e: PHI (r1v21 java.lang.String) = (r1v17 java.lang.String), (r1v24 java.lang.String) binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r2v14 java.lang.String) = (r2v10 java.lang.String), (r2v17 java.lang.String) binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r3v8 java.lang.String) = (r3v4 java.lang.String), (r3v11 java.lang.String) binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r4v4 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r4v2 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r4v7 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r11v16 java.lang.String) = (r11v13 java.lang.String), (r11v20 java.lang.String) binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r12v16 java.lang.String) = (r12v12 java.lang.String), (r12v18 java.lang.String) binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r13v18 java.lang.Object) = (r13v17 java.lang.Object), (r13v1 java.lang.Object) binds: [B:38:0x0136, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[PHI: r1 r2 r11 r12 r13
      0x00fc: PHI (r1v13 java.lang.String) = (r1v9 java.lang.String), (r1v16 java.lang.String) binds: [B:31:0x00f9, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r2v6 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r2v4 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r2v9 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:31:0x00f9, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r11v9 java.lang.String) = (r11v6 java.lang.String), (r11v11 java.lang.String) binds: [B:31:0x00f9, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r12v8 java.lang.String) = (r12v4 java.lang.String), (r12v11 java.lang.String) binds: [B:31:0x00f9, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r13v11 java.lang.Object) = (r13v10 java.lang.Object), (r13v1 java.lang.Object) binds: [B:31:0x00f9, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153 A[PHI: r13
      0x0153: PHI (r13v20 java.lang.Object) = (r13v19 java.lang.Object), (r13v1 java.lang.Object) binds: [B:41:0x0150, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProactiveMessageConversation(@org.jetbrains.annotations.Nullable java.lang.Integer r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r13) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getProactiveMessageConversation(java.lang.Integer, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object getUser(@NotNull x70.c<? super User> cVar) {
        return this.userActionProcessorInMemoryDataSource.getUser(cVar);
    }

    @Nullable
    public final Object getVisitType(@NotNull x70.c<? super VisitType> cVar) {
        return this.userActionProcessorLocalDataSource.getVisitType(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getWaitTimeForConversation(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.WaitTimeDataResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03501
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getWaitTimeForConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getWaitTimeForConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$getWaitTimeForConversation$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            return r8
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L31:
            java.lang.Object r7 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r7 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r7
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r8)
            goto L55
        L3d:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r8 = r6.userActionProcessorRemoteDataSource
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r2 = r6.userActionProcessorInMemoryDataSource
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r2.getUser(r0)
            if (r2 != r1) goto L51
            goto L68
        L51:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L55:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            java.lang.String r8 = zendesk.conversationkit.android.internal.user.UserExtensionsKt.getAuthorization(r8)
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = r7.fetchWaitTimeData(r8, r2, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.getWaitTimeForConversation(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreMessages(@org.jetbrains.annotations.NotNull java.lang.String r9, double r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.MessageList> r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.loadMoreMessages(java.lang.String, double, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r11 == r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[PHI: r1 r3 r4 r5 r10 r11
      0x0058: PHI (r1v16 java.lang.String) = (r1v12 java.lang.String), (r1v19 java.lang.String) binds: [B:53:0x0144, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r3v13 java.lang.String) = (r3v9 java.lang.String), (r3v15 java.lang.String) binds: [B:53:0x0144, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r4v8 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r4v4 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r4v11 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:53:0x0144, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r5v5 java.lang.String) = (r5v3 java.lang.String), (r5v8 java.lang.String) binds: [B:53:0x0144, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r10v21 java.lang.String) = (r10v17 java.lang.String), (r10v25 java.lang.String) binds: [B:53:0x0144, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r11v25 java.lang.Object) = (r11v24 java.lang.Object), (r11v1 java.lang.Object) binds: [B:53:0x0144, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0 A[PHI: r10
      0x00e0: PHI (r10v4 java.lang.String) = (r10v1 java.lang.String), (r10v5 java.lang.String) binds: [B:28:0x00c2, B:33:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d A[PHI: r1 r3 r10 r11
      0x010d: PHI (r1v8 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r1v4 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r1v11 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:42:0x0109, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r3v5 java.lang.String) = (r3v3 java.lang.String), (r3v8 java.lang.String) binds: [B:42:0x0109, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r10v13 java.lang.String) = (r10v10 java.lang.String), (r10v15 java.lang.String) binds: [B:42:0x0109, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r11v18 java.lang.Object) = (r11v17 java.lang.Object), (r11v1 java.lang.Object) binds: [B:42:0x0109, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161 A[PHI: r11
      0x0161: PHI (r11v28 java.lang.Object) = (r11v27 java.lang.Object), (r11v1 java.lang.Object) binds: [B:56:0x015e, B:16:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171 A[PHI: r10
      0x0171: PHI (r10v28 zendesk.conversationkit.android.model.User) = (r10v27 zendesk.conversationkit.android.model.User), (r10v30 zendesk.conversationkit.android.model.User) binds: [B:59:0x016e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.User> r11) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.login(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r1.logout(r2, r3, r4, (java.lang.String) r10, r6) != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.logout(x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processActivityEventReceived(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.ActivityEvent r8, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03541
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processActivityEventReceived$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processActivityEventReceived$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$processActivityEventReceived$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r9)
            goto L7e
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L34:
            ba0.g.M(r9)
            goto L8c
        L38:
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.model.ActivityEvent r8 = (zendesk.conversationkit.android.model.ActivityEvent) r8
            ba0.g.M(r9)
            goto L52
        L40:
            ba0.g.M(r9)
            java.lang.String r9 = r8.getConversationId()
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r7.getPersistedConversation(r9, r0)
            if (r9 != r1) goto L52
            goto L8b
        L52:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            zendesk.conversationkit.android.model.ActivityData r2 = r8.getActivityData()
            if (r2 != 0) goto L5c
            r2 = -1
            goto L64
        L5c:
            int[] r6 = zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r6[r2]
        L64:
            r6 = 0
            if (r2 == r5) goto L81
            if (r2 == r4) goto L6f
            if (r2 == r3) goto L6f
            r4 = 4
            if (r2 == r4) goto L6f
            return r9
        L6f:
            java.lang.String r9 = r8.getConversationId()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r9 = r7.processConversationRoutingActivity(r8, r9, r0)
            if (r9 != r1) goto L7e
            goto L8b
        L7e:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            return r9
        L81:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r9 = r7.processConversationReadActivity(r8, r0)
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.processActivityEventReceived(zendesk.conversationkit.android.model.ActivityEvent, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        if (r9 != r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[PHI: r8
      0x0108: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v26 java.lang.String) binds: [B:51:0x0105, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136 A[PHI: r2 r4 r8 r9
      0x0136: PHI (r2v6 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) = 
      (r2v5 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
      (r2v22 zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource)
     binds: [B:58:0x0133, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v17 java.lang.String) binds: [B:58:0x0133, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v30 java.lang.String) binds: [B:58:0x0133, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v1 java.lang.Object) binds: [B:58:0x0133, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshConversation(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r9) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.refreshConversation(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[PHI: r9
      0x0095: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:30:0x0092, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshUser(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.User> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03581
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$refreshUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$refreshUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$refreshUser$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.model.User r0 = (zendesk.conversationkit.android.model.User) r0
            ba0.g.M(r9)
            return r0
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3b:
            ba0.g.M(r9)
            goto L95
        L3f:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r5 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r5
            ba0.g.M(r9)
            goto L81
        L4b:
            java.lang.Object r2 = r0.L$0
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r2
            ba0.g.M(r9)
            goto L68
        L53:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r9 = r8.userActionProcessorRemoteDataSource
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r2 = r8.userActionProcessorInMemoryDataSource
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r2 = r2.getUser(r0)
            if (r2 != r1) goto L65
            goto La1
        L65:
            r7 = r2
            r2 = r9
            r9 = r7
        L68:
            zendesk.conversationkit.android.model.User r9 = (zendesk.conversationkit.android.model.User) r9
            java.lang.String r9 = zendesk.conversationkit.android.internal.user.UserExtensionsKt.getAuthorization(r9)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r6 = r8.userActionProcessorInMemoryDataSource
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r5 = r6.getUser(r0)
            if (r5 != r1) goto L7d
            goto La1
        L7d:
            r7 = r2
            r2 = r9
            r9 = r5
            r5 = r7
        L81:
            zendesk.conversationkit.android.model.User r9 = (zendesk.conversationkit.android.model.User) r9
            zendesk.conversationkit.android.model.AuthenticationType r9 = r9.getAuthenticationType()
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r9 = r5.getAppUser(r2, r9, r0)
            if (r9 != r1) goto L95
            goto La1
        L95:
            zendesk.conversationkit.android.model.User r9 = (zendesk.conversationkit.android.model.User) r9
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r0 = r8.saveUser(r9, r0)
            if (r0 != r1) goto La2
        La1:
            return r1
        La2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.refreshUser(x70.c):java.lang.Object");
    }

    @Nullable
    public final Object removeConversationById(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object objRemoveConversationById = this.userActionProcessorLocalDataSource.removeConversationById(str, cVar);
        return objRemoveConversationById == a.COROUTINE_SUSPENDED ? objRemoveConversationById : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        if (r1.sendActivityData(r2, r3, r4, r5, (java.lang.String) r13, r7, r8) != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendActivityData(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.ActivityData r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.sendActivityData(zendesk.conversationkit.android.model.ActivityData, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd A[Catch: all -> 0x0048, MessageAlreadyInConversationException -> 0x004b, PHI: r2 r5 r7
      0x00fd: PHI (r2v8 java.lang.Object) = (r2v7 java.lang.Object), (r2v1 java.lang.Object) binds: [B:50:0x00f9, B:33:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r5v12 ??) = (r5v34 ??), (r5v35 ??) binds: [B:50:0x00f9, B:33:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r7v8 zendesk.conversationkit.android.model.Message) = (r7v5 zendesk.conversationkit.android.model.Message), (r7v10 zendesk.conversationkit.android.model.Message) binds: [B:50:0x00f9, B:33:0x0099] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {MessageAlreadyInConversationException -> 0x004b, blocks: (B:14:0x0044, B:21:0x005e, B:62:0x0140, B:27:0x0079, B:58:0x0129, B:30:0x008a, B:55:0x0117, B:33:0x0099, B:52:0x00fd, B:36:0x00a7, B:49:0x00ee, B:45:0x00da), top: B:79:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[Catch: all -> 0x0048, MessageAlreadyInConversationException -> 0x004b, PHI: r0 r2 r5 r7
      0x0117: PHI (r0v21 zendesk.conversationkit.android.model.Message) = (r0v18 zendesk.conversationkit.android.model.Message), (r0v23 zendesk.conversationkit.android.model.Message) binds: [B:53:0x0113, B:30:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v1 java.lang.Object) binds: [B:53:0x0113, B:30:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r5v15 ??) = (r5v32 ??), (r5v33 ??) binds: [B:53:0x0113, B:30:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r7v11 zendesk.conversationkit.android.model.Message) = (r7v8 zendesk.conversationkit.android.model.Message), (r7v13 zendesk.conversationkit.android.model.Message) binds: [B:53:0x0113, B:30:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {MessageAlreadyInConversationException -> 0x004b, blocks: (B:14:0x0044, B:21:0x005e, B:62:0x0140, B:27:0x0079, B:58:0x0129, B:30:0x008a, B:55:0x0117, B:33:0x0099, B:52:0x00fd, B:36:0x00a7, B:49:0x00ee, B:45:0x00da), top: B:79:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129 A[Catch: all -> 0x0048, MessageAlreadyInConversationException -> 0x004b, PHI: r0 r5 r7
      0x0129: PHI (r0v24 zendesk.conversationkit.android.model.Message) = (r0v21 zendesk.conversationkit.android.model.Message), (r0v27 zendesk.conversationkit.android.model.Message) binds: [B:56:0x0126, B:27:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r5v18 ??) = (r5v30 ??), (r5v31 ??) binds: [B:56:0x0126, B:27:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r7v14 zendesk.conversationkit.android.model.Message) = (r7v11 zendesk.conversationkit.android.model.Message), (r7v17 zendesk.conversationkit.android.model.Message) binds: [B:56:0x0126, B:27:0x0079] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {MessageAlreadyInConversationException -> 0x004b, blocks: (B:14:0x0044, B:21:0x005e, B:62:0x0140, B:27:0x0079, B:58:0x0129, B:30:0x008a, B:55:0x0117, B:33:0x0099, B:52:0x00fd, B:36:0x00a7, B:49:0x00ee, B:45:0x00da), top: B:79:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29, types: [zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource] */
    /* JADX WARN: Type inference failed for: r2v9, types: [zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Message> r26) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.sendMessage(zendesk.conversationkit.android.model.Message, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if (r1.sendPostbackAction(r2, r3, r4, r5, (java.lang.String) r13, r7, r8) != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendPostbackAction(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.sendPostbackAction(java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object setIntegrationId(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object integrationId = this.userActionProcessorLocalDataSource.setIntegrationId(str, cVar);
        return integrationId == a.COROUTINE_SUSPENDED ? integrationId : Unit.f26487a;
    }

    @Nullable
    public final Object setProactiveMessage(@NotNull ProactiveMessage proactiveMessage, @NotNull x70.c<? super Unit> cVar) {
        Object proactiveMessage2 = this.userActionProcessorLocalDataSource.setProactiveMessage(proactiveMessage, cVar);
        return proactiveMessage2 == a.COROUTINE_SUSPENDED ? proactiveMessage2 : Unit.f26487a;
    }

    @Nullable
    public final Object setPushToken(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object pushToken = this.userActionProcessorLocalDataSource.setPushToken(str, cVar);
        return pushToken == a.COROUTINE_SUSPENDED ? pushToken : Unit.f26487a;
    }

    @Nullable
    public final Object setVisitType(@NotNull VisitType visitType, @NotNull x70.c<? super Unit> cVar) {
        Object visitType2 = this.userActionProcessorLocalDataSource.setVisitType(visitType, cVar);
        return visitType2 == a.COROUTINE_SUSPENDED ? visitType2 : Unit.f26487a;
    }

    @Nullable
    public final Object shouldReAuthenticateUser(@NotNull x70.c<? super Boolean> cVar) {
        return this.userActionProcessorInMemoryDataSource.shouldReAuthenticateUser(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7.updateAppUserLocale(r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAppUserLocale(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03661
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateAppUserLocale$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateAppUserLocale$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateAppUserLocale$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            goto L67
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L31:
            java.lang.Object r7 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r7 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r7
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r8)
            goto L53
        L3d:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r8 = r6.userActionProcessorRemoteDataSource
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r6.getUser(r0)
            if (r2 != r1) goto L4f
            goto L66
        L4f:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L53:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            java.lang.String r8 = zendesk.conversationkit.android.internal.user.UserExtensionsKt.getAuthorization(r8)
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = r7.updateAppUserLocale(r8, r2, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updateAppUserLocale(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversation(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r11, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03671
            if (r0 == 0) goto L13
            r0 = r12
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L65
            if (r2 == r7) goto L58
            if (r2 == r6) goto L54
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L38
            java.lang.Object r10 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r10 = (zendesk.conversationkit.android.model.Conversation) r10
            ba0.g.M(r12)
            return r10
        L38:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L3f:
            java.lang.Object r10 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r10 = (zendesk.conversationkit.android.model.Conversation) r10
            ba0.g.M(r12)
            goto Laa
        L48:
            java.lang.Object r10 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r10 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository) r10
            java.lang.Object r11 = r0.L$0
            zendesk.conversationkit.android.model.Conversation r11 = (zendesk.conversationkit.android.model.Conversation) r11
            ba0.g.M(r12)
            goto L9a
        L54:
            ba0.g.M(r12)
            goto L88
        L58:
            java.lang.Object r10 = r0.L$1
            r11 = r10
            zendesk.conversationkit.android.model.Message r11 = (zendesk.conversationkit.android.model.Message) r11
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            ba0.g.M(r12)
            goto L75
        L65:
            ba0.g.M(r12)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r7
            java.lang.Object r12 = r9.getPersistedConversation(r10, r0)
            if (r12 != r1) goto L75
            goto Lb4
        L75:
            zendesk.conversationkit.android.model.Conversation r12 = (zendesk.conversationkit.android.model.Conversation) r12
            if (r12 == 0) goto Lb6
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r12 = r9.userActionProcessorInMemoryDataSource
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r6
            java.lang.Object r12 = r12.addMessageToConversationAndCommit(r10, r11, r0)
            if (r12 != r1) goto L88
            goto Lb4
        L88:
            zendesk.conversationkit.android.model.Conversation r12 = (zendesk.conversationkit.android.model.Conversation) r12
            r0.L$0 = r12
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r9.getUser(r0)
            if (r10 != r1) goto L97
            goto Lb4
        L97:
            r11 = r12
            r12 = r10
            r10 = r9
        L9a:
            zendesk.conversationkit.android.model.User r12 = (zendesk.conversationkit.android.model.User) r12
            r0.L$0 = r11
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r10 = r10.saveUserToLocalStorage(r12, r0)
            if (r10 != r1) goto La9
            goto Lb4
        La9:
            r10 = r11
        Laa:
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r9.saveConversationToLocalStorage(r10, r0)
            if (r11 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            return r10
        Lb6:
            zendesk.conversationkit.android.internal.exception.ConversationNotFoundException r10 = new zendesk.conversationkit.android.internal.exception.ConversationNotFoundException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updateConversation(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationById(@org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.ConversationStatus r30, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r31, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r32
            boolean r2 = r1 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03681
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversationById$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03681) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversationById$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateConversationById$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L54
            if (r4 == r7) goto L44
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L35
            java.lang.Object r2 = r2.L$0
            zendesk.conversationkit.android.model.Conversation r2 = (zendesk.conversationkit.android.model.Conversation) r2
            ba0.g.M(r1)
            return r2
        L35:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L3c:
            java.lang.Object r4 = r2.L$0
            zendesk.conversationkit.android.model.Conversation r4 = (zendesk.conversationkit.android.model.Conversation) r4
            ba0.g.M(r1)
            goto La5
        L44:
            java.lang.Object r4 = r2.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r7 = r2.L$0
            zendesk.conversationkit.android.model.ConversationStatus r7 = (zendesk.conversationkit.android.model.ConversationStatus) r7
            ba0.g.M(r1)
            r22 = r7
        L51:
            r23 = r4
            goto L6e
        L54:
            ba0.g.M(r1)
            r1 = r30
            r2.L$0 = r1
            r4 = r31
            r2.L$1 = r4
            r2.label = r7
            r7 = r29
            java.lang.Object r7 = r0.getPersistedConversation(r7, r2)
            if (r7 != r3) goto L6a
            goto Lb1
        L6a:
            r22 = r1
            r1 = r7
            goto L51
        L6e:
            r8 = r1
            zendesk.conversationkit.android.model.Conversation r8 = (zendesk.conversationkit.android.model.Conversation) r8
            if (r8 == 0) goto Lb3
            r26 = 106495(0x19fff, float:1.49231E-40)
            r27 = 0
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
            r24 = 0
            r25 = 0
            zendesk.conversationkit.android.model.Conversation r4 = zendesk.conversationkit.android.model.Conversation.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r4 == 0) goto Lb3
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r1 = r0.userActionProcessorInMemoryDataSource
            r2.L$0 = r4
            r7 = 0
            r2.L$1 = r7
            r2.label = r6
            java.lang.Object r1 = r1.saveConversation(r4, r2)
            if (r1 != r3) goto La5
            goto Lb1
        La5:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r1 = r0.userActionProcessorLocalDataSource
            r2.L$0 = r4
            r2.label = r5
            java.lang.Object r1 = r1.saveConversation(r4, r2)
            if (r1 != r3) goto Lb2
        Lb1:
            return r3
        Lb2:
            return r4
        Lb3:
            zendesk.conversationkit.android.internal.exception.ConversationNotFoundException r1 = new zendesk.conversationkit.android.internal.exception.ConversationNotFoundException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updateConversationById(java.lang.String, zendesk.conversationkit.android.model.ConversationStatus, java.util.Map, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0153, code lost:
    
        if (saveConversationWithMetadata((zendesk.conversationkit.android.model.Conversation) r14, r12, r8) != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148 A[PHI: r12 r14
      0x0148: PHI (r12v18 java.util.Map<java.lang.String, ? extends java.lang.Object>) = 
      (r12v14 java.util.Map<java.lang.String, ? extends java.lang.Object>)
      (r12v21 java.util.Map<java.lang.String, ? extends java.lang.Object>)
     binds: [B:37:0x0145, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r14v17 java.lang.Object) = (r14v16 java.lang.Object), (r14v1 java.lang.Object) binds: [B:37:0x0145, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversationMetadata(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updateConversationMetadata(java.lang.String, java.util.Map, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDownloadingAttachment(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r7, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03701
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateDownloadingAttachment$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateDownloadingAttachment$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateDownloadingAttachment$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            return r8
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            zendesk.conversationkit.android.model.Message r7 = (zendesk.conversationkit.android.model.Message) r7
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            ba0.g.M(r8)
            goto L4e
        L3e:
            ba0.g.M(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r5.getPersistedConversation(r6, r0)
            if (r8 != r1) goto L4e
            goto L61
        L4e:
            zendesk.conversationkit.android.model.Conversation r8 = (zendesk.conversationkit.android.model.Conversation) r8
            if (r8 == 0) goto L63
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r8 = r5.userActionProcessorInMemoryDataSource
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r8.updateDownloadingAttachment(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        L63:
            zendesk.conversationkit.android.internal.exception.ConversationNotFoundException r6 = new zendesk.conversationkit.android.internal.exception.ConversationNotFoundException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updateDownloadingAttachment(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object updateDownloadingStatusFailed(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull x70.c<? super Conversation> cVar) {
        return this.userActionProcessorInMemoryDataSource.updateDownloadingStatus(str, new MessageStatus.DownloadFailed(null, 1, null), str2, str3, cVar);
    }

    @Nullable
    public final Object updateDownloadingStatusSuccess(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull x70.c<? super Conversation> cVar) {
        return this.userActionProcessorInMemoryDataSource.updateDownloadingStatus(str, new MessageStatus.Sent(null, 1, null), str2, str3, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r2.updatePushToken(r8, (java.lang.String) r9, r4, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updatePushToken(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03711
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updatePushToken$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updatePushToken$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updatePushToken$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L45
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ba0.g.M(r9)
            goto L96
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            java.lang.Object r8 = r0.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r2
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            ba0.g.M(r9)
            goto L84
        L45:
            java.lang.Object r8 = r0.L$1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r8 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource) r8
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r9)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L69
        L54:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource r9 = r7.userActionProcessorRemoteDataSource
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r2 = r7.getUser(r0)
            if (r2 != r1) goto L66
            goto L95
        L66:
            r6 = r2
            r2 = r9
            r9 = r6
        L69:
            zendesk.conversationkit.android.model.User r9 = (zendesk.conversationkit.android.model.User) r9
            java.lang.String r9 = zendesk.conversationkit.android.internal.user.UserExtensionsKt.getAuthorization(r9)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource r5 = r7.userActionProcessorLocalDataSource
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r4 = r5.getClientId(r0)
            if (r4 != r1) goto L80
            goto L95
        L80:
            r6 = r4
            r4 = r8
            r8 = r9
            r9 = r6
        L84:
            java.lang.String r9 = (java.lang.String) r9
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r8 = r2.updatePushToken(r8, r9, r4, r0)
            if (r8 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updatePushToken(java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object updateReAuthenticateUser(boolean z11, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdateReAuthenticateUser = this.userActionProcessorInMemoryDataSource.updateReAuthenticateUser(z11, cVar);
        return objUpdateReAuthenticateUser == a.COROUTINE_SUSPENDED ? objUpdateReAuthenticateUser : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (saveUserToLocalStorage(r4, r2) != r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateUserJwt(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03721
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateUserJwt$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.C03721) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateUserJwt$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository$updateUserJwt$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L4a
            if (r4 == r7) goto L40
            if (r4 == r6) goto L38
            if (r4 != r5) goto L31
            ba0.g.M(r1)
            goto L90
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L38:
            java.lang.Object r4 = r2.L$0
            zendesk.conversationkit.android.model.User r4 = (zendesk.conversationkit.android.model.User) r4
            ba0.g.M(r1)
            goto L84
        L40:
            java.lang.Object r4 = r2.L$0
            java.lang.String r4 = (java.lang.String) r4
            ba0.g.M(r1)
        L47:
            r19 = r4
            goto L5c
        L4a:
            ba0.g.M(r1)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r1 = r0.userActionProcessorInMemoryDataSource
            r4 = r24
            r2.L$0 = r4
            r2.label = r7
            java.lang.Object r1 = r1.getUser(r2)
            if (r1 != r3) goto L47
            goto L8f
        L5c:
            r7 = r1
            zendesk.conversationkit.android.model.User r7 = (zendesk.conversationkit.android.model.User) r7
            r21 = 6143(0x17ff, float:8.608E-42)
            r22 = 0
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
            r20 = 0
            zendesk.conversationkit.android.model.User r4 = zendesk.conversationkit.android.model.User.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r1 = r0.userActionProcessorInMemoryDataSource
            r2.L$0 = r4
            r2.label = r6
            java.lang.Object r1 = r1.updateUser(r4, r2)
            if (r1 != r3) goto L84
            goto L8f
        L84:
            r1 = 0
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r1 = r0.saveUserToLocalStorage(r4, r2)
            if (r1 != r3) goto L90
        L8f:
            return r3
        L90:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository.updateUserJwt(java.lang.String, x70.c):java.lang.Object");
    }
}
