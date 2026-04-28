package zendesk.conversationkit.android.internal.user;

import ba0.g;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import y70.a;
import z70.c;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.ConversationKitError;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.ActionProcessor;
import zendesk.conversationkit.android.internal.ConnectivityObserver;
import zendesk.conversationkit.android.internal.ConversationKitDispatchers;
import zendesk.conversationkit.android.internal.DefaultConversationKitDispatchers;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.internal.attachments.AttachmentDownloader;
import zendesk.conversationkit.android.internal.extension.ServerType;
import zendesk.conversationkit.android.internal.faye.SunCoFayeClient;
import zendesk.conversationkit.android.internal.metadata.MetadataManager;
import zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationsPagination;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageList;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.WaitTimeDataResponse;
import zendesk.conversationkit.android.model.attachments.DownloadAttachmentStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001d\u0010\u0014J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020(H\u0082@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b+\u0010\u0014J\u0010\u0010,\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b,\u0010\u0014J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020-H\u0082@¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u000200H\u0082@¢\u0006\u0004\b1\u00102J\u0018\u00104\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u000203H\u0082@¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u000206H\u0082@¢\u0006\u0004\b7\u00108J\u0018\u0010:\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u000209H\u0082@¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010>J\u001f\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?H\u0002¢\u0006\u0004\bC\u0010DJ\u0018\u0010F\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020EH\u0082@¢\u0006\u0004\bF\u0010GJ\u0018\u0010I\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020HH\u0082@¢\u0006\u0004\bI\u0010JJ\u0018\u0010L\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020KH\u0082@¢\u0006\u0004\bL\u0010MJ\u0018\u0010O\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020NH\u0082@¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020QH\u0082@¢\u0006\u0004\bR\u0010SJ\u0018\u0010U\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020TH\u0082@¢\u0006\u0004\bU\u0010VJ\u0018\u0010X\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020WH\u0082@¢\u0006\u0004\bX\u0010YJ\u0018\u0010[\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020ZH\u0082@¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020]H\u0002¢\u0006\u0004\b^\u0010_J\u0018\u0010a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020`H\u0082@¢\u0006\u0004\ba\u0010bJ\u0018\u0010d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020cH\u0082@¢\u0006\u0004\bd\u0010eJ\u0018\u0010g\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020fH\u0082@¢\u0006\u0004\bg\u0010hJ\u0018\u0010k\u001a\u00020\u00172\u0006\u0010j\u001a\u00020iH\u0082@¢\u0006\u0004\bk\u0010lJ\u0018\u0010m\u001a\u00020\u00172\u0006\u0010j\u001a\u00020iH\u0082@¢\u0006\u0004\bm\u0010lJ\u0018\u0010o\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020nH\u0082@¢\u0006\u0004\bo\u0010pJ\u0018\u0010r\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020qH\u0082@¢\u0006\u0004\br\u0010sJ\u0018\u0010u\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020tH\u0082@¢\u0006\u0004\bu\u0010vJ\u0018\u0010x\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020wH\u0082@¢\u0006\u0004\bx\u0010yJ\u0018\u0010{\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020zH\u0082@¢\u0006\u0004\b{\u0010|J\u0010\u0010}\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b}\u0010\u0014J\u0010\u0010~\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b~\u0010\u0014J\u001b\u0010\u0080\u0001\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u007fH\u0082@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0083\u0001\u001a\u00020\u00172\u0007\u0010\u0016\u001a\u00030\u0082\u0001H\u0082@¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00172\u0007\u0010\u0016\u001a\u00030\u0085\u0001H\u0082@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u0016\u001a\u00030\u0088\u0001H\u0082@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u00172\u0007\u0010\u0016\u001a\u00030\u008b\u0001H\u0082@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u0017H\u0082@¢\u0006\u0005\b\u008e\u0001\u0010\u0014R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u008f\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0090\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0091\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0092\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0093\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0094\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0095\u0001¨\u0006\u0097\u0001"}, d2 = {"Lzendesk/conversationkit/android/internal/user/UserActionProcessor;", "Lzendesk/conversationkit/android/internal/ActionProcessor;", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;", "userActionProcessorRepository", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "sunCoFayeClient", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "metadataManager", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "attachmentDownloader", "Lzendesk/conversationkit/android/internal/user/AuthenticationErrorHandler;", "authenticationErrorHandler", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "conversationKitDispatchers", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "connectivityObserver", "<init>", "(Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;Lzendesk/conversationkit/android/internal/metadata/MetadataManager;Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;Lzendesk/conversationkit/android/internal/user/AuthenticationErrorHandler;Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;Lzendesk/conversationkit/android/internal/ConnectivityObserver;)V", "Lzendesk/conversationkit/android/model/User;", "getUser", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action;", "action", "Lzendesk/conversationkit/android/internal/Effect;", "process", "(Lzendesk/conversationkit/android/internal/Action;Lx70/c;)Ljava/lang/Object;", "", "invalidate", "()V", "processStartRealtimeConnection", "Lzendesk/conversationkit/android/internal/Action$SetVisitType;", "processSetVisitTypeReceived", "(Lzendesk/conversationkit/android/internal/Action$SetVisitType;Lx70/c;)Ljava/lang/Object;", "processGetVisitTypeReceived", "Lzendesk/conversationkit/android/internal/Action$NetworkConnectionStatusUpdate;", "processNetworkConnectionStatusUpdate", "(Lzendesk/conversationkit/android/internal/Action$NetworkConnectionStatusUpdate;)Lzendesk/conversationkit/android/internal/Effect;", "Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;", "processCreateUser", "()Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;", "Lzendesk/conversationkit/android/internal/Action$LoginUser;", "processLoginUser", "(Lzendesk/conversationkit/android/internal/Action$LoginUser;Lx70/c;)Ljava/lang/Object;", "processLogoutUser", "processRefreshUser", "Lzendesk/conversationkit/android/internal/Action$UpdateAppUserLocale;", "processUpdateAppUserLocale", "(Lzendesk/conversationkit/android/internal/Action$UpdateAppUserLocale;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$CreateConversation;", "processCreateConversation", "(Lzendesk/conversationkit/android/internal/Action$CreateConversation;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$GetConversation;", "processGetConversation", "(Lzendesk/conversationkit/android/internal/Action$GetConversation;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$ProactiveMessageReferral;", "processProactiveMessageReferral", "(Lzendesk/conversationkit/android/internal/Action$ProactiveMessageReferral;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$RefreshConversation;", "processRefreshConversation", "(Lzendesk/conversationkit/android/internal/Action$RefreshConversation;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$MessageReceived;", "processMessageReceived", "(Lzendesk/conversationkit/android/internal/Action$MessageReceived;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/extension/ServerType;", "currentServer", "newServer", "", "wasServedByAgent", "(Lzendesk/conversationkit/android/internal/extension/ServerType;Lzendesk/conversationkit/android/internal/extension/ServerType;)Z", "Lzendesk/conversationkit/android/internal/Action$LoadMoreMessages;", "processLoadMoreMessages", "(Lzendesk/conversationkit/android/internal/Action$LoadMoreMessages;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$PrepareMessage;", "processPrepareMessage", "(Lzendesk/conversationkit/android/internal/Action$PrepareMessage;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$SendMessage;", "processSendMessage", "(Lzendesk/conversationkit/android/internal/Action$SendMessage;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$PreparePushToken;", "preparePushToken", "(Lzendesk/conversationkit/android/internal/Action$PreparePushToken;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$PushCacheIntegrationId;", "cacheIntegrationId", "(Lzendesk/conversationkit/android/internal/Action$PushCacheIntegrationId;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$UpdatePushToken;", "updatePushToken", "(Lzendesk/conversationkit/android/internal/Action$UpdatePushToken;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$SendActivityData;", "sendActivityData", "(Lzendesk/conversationkit/android/internal/Action$SendActivityData;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$ActivityEventReceived;", "processActivityEventReceived", "(Lzendesk/conversationkit/android/internal/Action$ActivityEventReceived;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$PersistedUserRetrieve;", "processPersistedUserRetrieved", "(Lzendesk/conversationkit/android/internal/Action$PersistedUserRetrieve;)Lzendesk/conversationkit/android/internal/Effect;", "Lzendesk/conversationkit/android/internal/Action$AddProactiveMessage;", "processAddProactiveMessage", "(Lzendesk/conversationkit/android/internal/Action$AddProactiveMessage;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$GetProactiveMessage;", "processGetProactiveMessage", "(Lzendesk/conversationkit/android/internal/Action$GetProactiveMessage;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$ClearProactiveMessage;", "processClearProactiveMessage", "(Lzendesk/conversationkit/android/internal/Action$ClearProactiveMessage;Lx70/c;)Ljava/lang/Object;", "", "conversationId", "processConversationAdded", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "processConversationRemoved", "Lzendesk/conversationkit/android/internal/Action$ConversationUpdate;", "processConversationUpdate", "(Lzendesk/conversationkit/android/internal/Action$ConversationUpdate;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$GetConversations;", "processGetConversations", "(Lzendesk/conversationkit/android/internal/Action$GetConversations;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$UserMergeReceived;", "processUserMerge", "(Lzendesk/conversationkit/android/internal/Action$UserMergeReceived;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$AddConversationFields;", "processAddConversationFields", "(Lzendesk/conversationkit/android/internal/Action$AddConversationFields;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$AddConversationTags;", "processAddConversationTags", "(Lzendesk/conversationkit/android/internal/Action$AddConversationTags;Lx70/c;)Ljava/lang/Object;", "processClearConversationFields", "processClearTags", "Lzendesk/conversationkit/android/internal/Action$UpdateConversationMetadata;", "processUpdateConversationMetadata", "(Lzendesk/conversationkit/android/internal/Action$UpdateConversationMetadata;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$SendPostbackAction;", "processSendPostbackAction", "(Lzendesk/conversationkit/android/internal/Action$SendPostbackAction;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$DownloadAttachmentAction;", "processDownloadAttachmentAction", "(Lzendesk/conversationkit/android/internal/Action$DownloadAttachmentAction;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$UpdateDownloadStatusAction;", "processUpdateDownloadStatusAction", "(Lzendesk/conversationkit/android/internal/Action$UpdateDownloadStatusAction;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action$GetWaitTimeForConversation;", "processGetWaitTimeForConversation", "(Lzendesk/conversationkit/android/internal/Action$GetWaitTimeForConversation;Lx70/c;)Ljava/lang/Object;", "processReAuthenticateSubscription", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "Lzendesk/conversationkit/android/internal/user/AuthenticationErrorHandler;", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserActionProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActionProcessor.kt\nzendesk/conversationkit/android/internal/user/UserActionProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1186:1\n1#2:1187\n*E\n"})
public final class UserActionProcessor implements ActionProcessor {
    private static final double BEFORE_TIMESTAMP = 0.0d;

    @NotNull
    private static final String GET_CONVERSATION_SERIALIZATION_EXCEPTION_LOG_MESSAGE = "GET request for Conversation failed to decode malformed JSON response.";

    @NotNull
    private static final String LOG_TAG = "UserActionProcessor";

    @NotNull
    private final AttachmentDownloader attachmentDownloader;

    @NotNull
    private final AuthenticationErrorHandler authenticationErrorHandler;

    @NotNull
    private final ConnectivityObserver connectivityObserver;

    @NotNull
    private final ConversationKitDispatchers conversationKitDispatchers;

    @NotNull
    private final MetadataManager metadataManager;

    @NotNull
    private final SunCoFayeClient sunCoFayeClient;

    @NotNull
    private final UserActionProcessorRepository userActionProcessorRepository;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$cacheIntegrationId$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {697}, m = "cacheIntegrationId")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
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
            return UserActionProcessor.this.cacheIntegrationId(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$preparePushToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {692}, m = "preparePushToken")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02581 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02581(x70.c<? super C02581> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.preparePushToken(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$process$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$process$2", f = "UserActionProcessor.kt", l = {75, 82, 86, 87, 88, 89, 90, 93, 94, 95, 96, 97, 98, 99, 100, 103, 104, 105, 106, 109, 110, 111, 114, 115, 118, 119, 122, AppConstants.RESULT_CODE_ORDER_CANCELLED, 124, 125, 128, 129, AppConstants.RESULT_CODE_ORDER_COLLECTED, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, 134, 137, 138, 140}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/conversationkit/android/internal/Effect;", "<anonymous>", "(Lv80/b0;)Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Effect>, Object> {
        final /* synthetic */ Action $action;
        int label;
        final /* synthetic */ UserActionProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Action action, UserActionProcessor userActionProcessor, x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$action = action;
            this.this$0 = userActionProcessor;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new AnonymousClass2(this.$action, this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Effect> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x01b6, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x01d1, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01e8, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x01ff, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x0216, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x022d, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x0244, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x025b, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x0272, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:175:0x0289, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x02a0, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:189:0x02b7, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:196:0x02ce, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:203:0x02e5, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:210:0x02fc, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x0313, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:224:0x032a, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:235:0x034c, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:242:0x0363, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:249:0x037a, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:256:0x0391, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x03a8, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:270:0x03bf, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:277:0x03d6, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:284:0x03ed, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:291:0x0402, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:298:0x0417, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:305:0x042d, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:312:0x0443, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:319:0x0459, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:326:0x046f, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0126, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x015b, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x016f, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
        
            if (r4 == r0) goto L327;
         */
        /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 1252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processActivityEventReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {779}, m = "processActivityEventReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02591 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02591(x70.c<? super C02591> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processActivityEventReceived(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {951}, m = "processAddConversationFields")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02601 extends c {
        int label;
        /* synthetic */ Object result;

        public C02601(x70.c<? super C02601> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processAddConversationFields(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationTags$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {965}, m = "processAddConversationTags")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02611 extends c {
        int label;
        /* synthetic */ Object result;

        public C02611(x70.c<? super C02611> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processAddConversationTags(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {810}, m = "processAddProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02621 extends c {
        int label;
        /* synthetic */ Object result;

        public C02621(x70.c<? super C02621> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processAddProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearConversationFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {974}, m = "processClearConversationFields")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02631 extends c {
        int label;
        /* synthetic */ Object result;

        public C02631(x70.c<? super C02631> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processClearConversationFields(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {829}, m = "processClearProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02641 extends c {
        int label;
        /* synthetic */ Object result;

        public C02641(x70.c<? super C02641> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processClearProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearTags$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {982}, m = "processClearTags")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02651 extends c {
        int label;
        /* synthetic */ Object result;

        public C02651(x70.c<? super C02651> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processClearTags(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {843}, m = "processConversationAdded")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02661 extends c {
        int label;
        /* synthetic */ Object result;

        public C02661(x70.c<? super C02661> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processConversationAdded(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$2", f = "UserActionProcessor.kt", l = {845}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02672 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02672(String str, x70.c<? super C02672> cVar) {
            super(1, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02672(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02672) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String str = this.$conversationId;
                this.label = 1;
                obj = userActionProcessorRepository.getConversationRemotely(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.ConversationAddedResult(new ConversationKitResult.Success((Conversation) obj));
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationRemoved$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {866}, m = "processConversationRemoved")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02681 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02681(x70.c<? super C02681> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processConversationRemoved(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationUpdate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {886}, m = "processConversationUpdate")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02691 extends c {
        int label;
        /* synthetic */ Object result;

        public C02691(x70.c<? super C02691> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processConversationUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processCreateConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {327, 347, 357, 367, 374}, m = "processCreateConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02701 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02701(x70.c<? super C02701> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processCreateConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processCreateConversation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processCreateConversation$2", f = "UserActionProcessor.kt", l = {330, 328, 334}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02712 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.CreateConversation $action;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02712(Action.CreateConversation createConversation, x70.c<? super C02712> cVar) {
            super(1, cVar);
            this.$action = createConversation;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02712(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02712) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L17
                java.lang.Object r0 = r7.L$0
                zendesk.conversationkit.android.ConversationKitResult r0 = (zendesk.conversationkit.android.ConversationKitResult) r0
                ba0.g.M(r8)
                goto L7c
            L17:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                r8 = 0
                return r8
            L1e:
                ba0.g.M(r8)
                goto L63
            L22:
                java.lang.Object r1 = r7.L$1
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r7.L$0
                zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r4 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository) r4
                ba0.g.M(r8)
                goto L53
            L2e:
                ba0.g.M(r8)
                zendesk.conversationkit.android.internal.user.UserActionProcessor r8 = zendesk.conversationkit.android.internal.user.UserActionProcessor.this
                zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = zendesk.conversationkit.android.internal.user.UserActionProcessor.access$getUserActionProcessorRepository$p(r8)
                zendesk.conversationkit.android.internal.Action$CreateConversation r1 = r7.$action
                java.lang.Integer r1 = r1.getProactiveMessageId()
                zendesk.conversationkit.android.internal.user.UserActionProcessor r5 = zendesk.conversationkit.android.internal.user.UserActionProcessor.this
                zendesk.conversationkit.android.internal.metadata.MetadataManager r5 = zendesk.conversationkit.android.internal.user.UserActionProcessor.access$getMetadataManager$p(r5)
                r7.L$0 = r8
                r7.L$1 = r1
                r7.label = r4
                java.lang.Object r4 = r5.getMetadata(r7)
                if (r4 != r0) goto L50
                goto L7a
            L50:
                r6 = r4
                r4 = r8
                r8 = r6
            L53:
                java.util.Map r8 = (java.util.Map) r8
                r5 = 0
                r7.L$0 = r5
                r7.L$1 = r5
                r7.label = r3
                java.lang.Object r8 = r4.createConversation(r1, r8, r7)
                if (r8 != r0) goto L63
                goto L7a
            L63:
                zendesk.conversationkit.android.model.Conversation r8 = (zendesk.conversationkit.android.model.Conversation) r8
                zendesk.conversationkit.android.ConversationKitResult$Success r1 = new zendesk.conversationkit.android.ConversationKitResult$Success
                r1.<init>(r8)
                zendesk.conversationkit.android.internal.user.UserActionProcessor r8 = zendesk.conversationkit.android.internal.user.UserActionProcessor.this
                zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = zendesk.conversationkit.android.internal.user.UserActionProcessor.access$getUserActionProcessorRepository$p(r8)
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r8 = r8.getUser(r7)
                if (r8 != r0) goto L7b
            L7a:
                return r0
            L7b:
                r0 = r1
            L7c:
                zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
                zendesk.conversationkit.android.internal.Effect$CreateConversationResult r1 = new zendesk.conversationkit.android.internal.Effect$CreateConversationResult
                r1.<init>(r0, r8)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.C02712.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processDownloadAttachmentAction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {1056, 1066}, m = "processDownloadAttachmentAction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02721 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C02721(x70.c<? super C02721> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processDownloadAttachmentAction(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {388, 395}, m = "processGetConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02731 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02731(x70.c<? super C02731> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processGetConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$2", f = "UserActionProcessor.kt", l = {398}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02742 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.GetConversation $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02742(Action.GetConversation getConversation, x70.c<? super C02742> cVar) {
            super(1, cVar);
            this.$action = getConversation;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02742(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02742) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String conversationId = this.$action.getConversationId();
                this.label = 1;
                obj = userActionProcessorRepository.getConversationRemotely(conversationId, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.GetConversationResult(new ConversationKitResult.Success(obj), false);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {912}, m = "processGetConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02751 extends c {
        int label;
        /* synthetic */ Object result;

        public C02751(x70.c<? super C02751> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processGetConversations(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$2", f = "UserActionProcessor.kt", l = {914}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02762 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.GetConversations $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02762(Action.GetConversations getConversations, x70.c<? super C02762> cVar) {
            super(1, cVar);
            this.$action = getConversations;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02762(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02762) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                int offset = this.$action.getOffset();
                boolean fromCache = this.$action.getFromCache();
                this.label = 1;
                obj = userActionProcessorRepository.getConversations(offset, fromCache, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.GetConversationsResult(new ConversationKitResult.Success((ConversationsPagination) obj));
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {818}, m = "processGetProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02771 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02771(x70.c<? super C02771> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processGetProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetVisitTypeReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {182}, m = "processGetVisitTypeReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02781 extends c {
        int label;
        /* synthetic */ Object result;

        public C02781(x70.c<? super C02781> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processGetVisitTypeReceived(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {1135}, m = "processGetWaitTimeForConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02791 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02791(x70.c<? super C02791> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processGetWaitTimeForConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$2", f = "UserActionProcessor.kt", l = {1137}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02802 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.GetWaitTimeForConversation $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02802(Action.GetWaitTimeForConversation getWaitTimeForConversation, x70.c<? super C02802> cVar) {
            super(1, cVar);
            this.$action = getWaitTimeForConversation;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02802(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02802) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String conversationId = this.$action.getConversationId();
                this.label = 1;
                obj = userActionProcessorRepository.getWaitTimeForConversation(conversationId, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.FetchWaitTimeResult(new ConversationKitResult.Success(((WaitTimeDataResponse) obj).getWaitTimeData()));
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoadMoreMessages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {548, 577, 586}, m = "processLoadMoreMessages")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02811 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02811(x70.c<? super C02811> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processLoadMoreMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoadMoreMessages$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoadMoreMessages$2", f = "UserActionProcessor.kt", l = {549, 555}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02822 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.LoadMoreMessages $action;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02822(Action.LoadMoreMessages loadMoreMessages, x70.c<? super C02822> cVar) {
            super(1, cVar);
            this.$action = loadMoreMessages;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02822(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02822) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            MessageList messageList;
            String str;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String conversationId = this.$action.getConversationId();
                double beforeTimestamp = this.$action.getBeforeTimestamp();
                this.label = 1;
                obj = userActionProcessorRepository.loadMoreMessages(conversationId, beforeTimestamp, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = (String) this.L$1;
                MessageList messageList2 = (MessageList) this.L$0;
                g.M(obj);
                str = str2;
                messageList = messageList2;
                return new Effect.LoadMoreMessages(str, (Conversation) obj, ((Message) CollectionsKt.O(messageList.getMessages())).getBeforeTimestamp(), new ConversationKitResult.Success(messageList.getMessages()));
            }
            g.M(obj);
            MessageList messageList3 = (MessageList) obj;
            String conversationId2 = this.$action.getConversationId();
            UserActionProcessorRepository userActionProcessorRepository2 = UserActionProcessor.this.userActionProcessorRepository;
            String conversationId3 = this.$action.getConversationId();
            this.L$0 = messageList3;
            this.L$1 = conversationId2;
            this.label = 2;
            Object persistedConversation = userActionProcessorRepository2.getPersistedConversation(conversationId3, this);
            if (persistedConversation != aVar) {
                messageList = messageList3;
                str = conversationId2;
                obj = persistedConversation;
                return new Effect.LoadMoreMessages(str, (Conversation) obj, ((Message) CollectionsKt.O(messageList.getMessages())).getBeforeTimestamp(), new ConversationKitResult.Success(messageList.getMessages()));
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoginUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {221, 229}, m = "processLoginUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02831 extends c {
        int label;
        /* synthetic */ Object result;

        public C02831(x70.c<? super C02831> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processLoginUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processLogoutUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {251, 252}, m = "processLogoutUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02841 extends c {
        int label;
        /* synthetic */ Object result;

        public C02841(x70.c<? super C02841> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processLogoutUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processMessageReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {497, 507}, m = "processMessageReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02851 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02851(x70.c<? super C02851> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processMessageReceived(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processPrepareMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {612, 616, 621, 622}, m = "processPrepareMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02861 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C02861(x70.c<? super C02861> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processPrepareMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {423}, m = "processProactiveMessageReferral")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02871 extends c {
        int label;
        /* synthetic */ Object result;

        public C02871(x70.c<? super C02871> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processProactiveMessageReferral(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$2", f = "UserActionProcessor.kt", l = {424}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02882 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.ProactiveMessageReferral $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02882(Action.ProactiveMessageReferral proactiveMessageReferral, x70.c<? super C02882> cVar) {
            super(1, cVar);
            this.$action = proactiveMessageReferral;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02882(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02882) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                Integer proactiveMessageId = this.$action.getProactiveMessageId();
                String conversationId = this.$action.getConversationId();
                this.label = 1;
                obj = userActionProcessorRepository.getProactiveMessageConversation(proactiveMessageId, conversationId, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.ProactiveMessageReferral(new ConversationKitResult.Success((Conversation) obj), false);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {1167}, m = "processReAuthenticateSubscription")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02891 extends c {
        int label;
        /* synthetic */ Object result;

        public C02891(x70.c<? super C02891> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processReAuthenticateSubscription(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$2", f = "UserActionProcessor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02902 extends i implements Function1<x70.c<? super Effect>, Object> {
        int label;

        public C02902(x70.c<? super C02902> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02902(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02902) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            UserActionProcessor.this.sunCoFayeClient.subscribe();
            return Effect.None.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {462}, m = "processRefreshConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02911 extends c {
        int label;
        /* synthetic */ Object result;

        public C02911(x70.c<? super C02911> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processRefreshConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$2", f = "UserActionProcessor.kt", l = {464, 467}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUserActionProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActionProcessor.kt\nzendesk/conversationkit/android/internal/user/UserActionProcessor$processRefreshConversation$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1186:1\n543#2,6:1187\n*S KotlinDebug\n*F\n+ 1 UserActionProcessor.kt\nzendesk/conversationkit/android/internal/user/UserActionProcessor$processRefreshConversation$2\n*L\n475#1:1187,6\n*E\n"})
    public static final class C02922 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.RefreshConversation $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02922(Action.RefreshConversation refreshConversation, x70.c<? super C02922> cVar) {
            super(1, cVar);
            this.$action = refreshConversation;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02922(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02922) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[SYNTHETIC] */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L14
                java.lang.Object r0 = r6.L$0
                zendesk.conversationkit.android.internal.extension.ServerType r0 = (zendesk.conversationkit.android.internal.extension.ServerType) r0
                ba0.g.M(r7)
                goto L56
            L14:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
                r7 = 0
                return r7
            L1b:
                ba0.g.M(r7)
                goto L37
            L1f:
                ba0.g.M(r7)
                zendesk.conversationkit.android.internal.user.UserActionProcessor r7 = zendesk.conversationkit.android.internal.user.UserActionProcessor.this
                zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r7 = zendesk.conversationkit.android.internal.user.UserActionProcessor.access$getUserActionProcessorRepository$p(r7)
                zendesk.conversationkit.android.internal.Action$RefreshConversation r1 = r6.$action
                java.lang.String r1 = r1.getConversationId()
                r6.label = r3
                java.lang.Object r7 = r7.getPersistedConversation(r1, r6)
                if (r7 != r0) goto L37
                goto L53
            L37:
                zendesk.conversationkit.android.model.Conversation r7 = (zendesk.conversationkit.android.model.Conversation) r7
                zendesk.conversationkit.android.internal.extension.ServerType r7 = zendesk.conversationkit.android.internal.extension.ConversationKitKt.serverType(r7)
                zendesk.conversationkit.android.internal.user.UserActionProcessor r1 = zendesk.conversationkit.android.internal.user.UserActionProcessor.this
                zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r1 = zendesk.conversationkit.android.internal.user.UserActionProcessor.access$getUserActionProcessorRepository$p(r1)
                zendesk.conversationkit.android.internal.Action$RefreshConversation r3 = r6.$action
                java.lang.String r3 = r3.getConversationId()
                r6.L$0 = r7
                r6.label = r2
                java.lang.Object r1 = r1.refreshConversation(r3, r6)
                if (r1 != r0) goto L54
            L53:
                return r0
            L54:
                r0 = r7
                r7 = r1
            L56:
                zendesk.conversationkit.android.model.Conversation r7 = (zendesk.conversationkit.android.model.Conversation) r7
                zendesk.conversationkit.android.internal.extension.ServerType r1 = zendesk.conversationkit.android.internal.extension.ConversationKitKt.serverType(r7)
                zendesk.conversationkit.android.ConversationKitResult$Success r2 = new zendesk.conversationkit.android.ConversationKitResult$Success
                r2.<init>(r7)
                zendesk.conversationkit.android.internal.user.UserActionProcessor r3 = zendesk.conversationkit.android.internal.user.UserActionProcessor.this
                boolean r0 = zendesk.conversationkit.android.internal.user.UserActionProcessor.access$wasServedByAgent(r3, r0, r1)
                java.util.List r1 = r7.getMessages()
                int r3 = r1.size()
                java.util.ListIterator r1 = r1.listIterator(r3)
            L73:
                boolean r3 = r1.hasPrevious()
                if (r3 == 0) goto L8b
                java.lang.Object r3 = r1.previous()
                r4 = r3
                zendesk.conversationkit.android.model.Message r4 = (zendesk.conversationkit.android.model.Message) r4
                zendesk.conversationkit.android.model.Participant r5 = r7.getMyself()
                boolean r4 = r4.isAuthoredBy(r5)
                if (r4 != 0) goto L73
                goto L8c
            L8b:
                r3 = 0
            L8c:
                zendesk.conversationkit.android.model.Message r3 = (zendesk.conversationkit.android.model.Message) r3
                zendesk.conversationkit.android.internal.Effect$RefreshConversationResult r7 = new zendesk.conversationkit.android.internal.Effect$RefreshConversationResult
                r7.<init>(r2, r0, r3)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.C02922.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {273}, m = "processRefreshUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02931 extends c {
        int label;
        /* synthetic */ Object result;

        public C02931(x70.c<? super C02931> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processRefreshUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$2", f = "UserActionProcessor.kt", l = {274, 277}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02942 extends i implements Function1<x70.c<? super Effect>, Object> {
        Object L$0;
        int label;

        public C02942(x70.c<? super C02942> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02942(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02942) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            ConversationKitResult conversationKitResult;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                this.label = 1;
                obj = userActionProcessorRepository.refreshUser(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                conversationKitResult = (ConversationKitResult) this.L$0;
                g.M(obj);
                return new Effect.RefreshUserResult(conversationKitResult, (Conversation) obj);
            }
            g.M(obj);
            User user = (User) obj;
            ConversationKitResult.Success success = new ConversationKitResult.Success(user);
            UserActionProcessorRepository userActionProcessorRepository2 = UserActionProcessor.this.userActionProcessorRepository;
            String defaultConversationId = UserExtensionsKt.getDefaultConversationId(user);
            this.L$0 = success;
            this.label = 2;
            obj = userActionProcessorRepository2.getPersistedConversation(defaultConversationId, this);
            if (obj != aVar) {
                conversationKitResult = success;
                return new Effect.RefreshUserResult(conversationKitResult, (Conversation) obj);
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {645, 667, 679}, m = "processSendMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02951 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02951(x70.c<? super C02951> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processSendMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendMessage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendMessage$2", f = "UserActionProcessor.kt", l = {646, AppConstants.REQUEST_CODE_FILTER}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02962 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.SendMessage $action;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02962(Action.SendMessage sendMessage, x70.c<? super C02962> cVar) {
            super(1, cVar);
            this.$action = sendMessage;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02962(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02962) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            Message message;
            ConversationKitResult conversationKitResult;
            String str;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                Message message2 = this.$action.getMessage();
                String conversationId = this.$action.getConversationId();
                this.label = 1;
                obj = userActionProcessorRepository.sendMessage(message2, conversationId, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                message = (Message) this.L$2;
                str = (String) this.L$1;
                conversationKitResult = (ConversationKitResult) this.L$0;
                g.M(obj);
                return new Effect.SendMessageResult(conversationKitResult, str, message, (Conversation) obj);
            }
            g.M(obj);
            Message message3 = (Message) obj;
            ConversationKitResult.Success success = new ConversationKitResult.Success(message3);
            String conversationId2 = this.$action.getConversationId();
            UserActionProcessorRepository userActionProcessorRepository2 = UserActionProcessor.this.userActionProcessorRepository;
            String conversationId3 = this.$action.getConversationId();
            this.L$0 = success;
            this.L$1 = conversationId2;
            this.L$2 = message3;
            this.label = 2;
            Object persistedConversation = userActionProcessorRepository2.getPersistedConversation(conversationId3, this);
            if (persistedConversation != aVar) {
                message = message3;
                obj = persistedConversation;
                conversationKitResult = success;
                str = conversationId2;
                return new Effect.SendMessageResult(conversationKitResult, str, message, (Conversation) obj);
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {1025}, m = "processSendPostbackAction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02971 extends c {
        int label;
        /* synthetic */ Object result;

        public C02971(x70.c<? super C02971> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processSendPostbackAction(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$2", f = "UserActionProcessor.kt", l = {1026}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02982 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.SendPostbackAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02982(Action.SendPostbackAction sendPostbackAction, x70.c<? super C02982> cVar) {
            super(1, cVar);
            this.$action = sendPostbackAction;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C02982(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C02982) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String conversationId = this.$action.getConversationId();
                String actionId = this.$action.getActionId();
                this.label = 1;
                if (userActionProcessorRepository.sendPostbackAction(conversationId, actionId, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.SendPostbackResult(new ConversationKitResult.Success(this.$action.getActionId()));
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processSetVisitTypeReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {177}, m = "processSetVisitTypeReceived")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02991 extends c {
        int label;
        /* synthetic */ Object result;

        public C02991(x70.c<? super C02991> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processSetVisitTypeReceived(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processStartRealtimeConnection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {162, 169}, m = "processStartRealtimeConnection")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03001 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03001(x70.c<? super C03001> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processStartRealtimeConnection(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {304}, m = "processUpdateAppUserLocale")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03011 extends c {
        int label;
        /* synthetic */ Object result;

        public C03011(x70.c<? super C03011> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processUpdateAppUserLocale(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$2", f = "UserActionProcessor.kt", l = {305}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03022 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.UpdateAppUserLocale $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03022(Action.UpdateAppUserLocale updateAppUserLocale, x70.c<? super C03022> cVar) {
            super(1, cVar);
            this.$action = updateAppUserLocale;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C03022(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C03022) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String deviceLocale = this.$action.getDeviceLocale();
                this.label = 1;
                if (userActionProcessorRepository.updateAppUserLocale(deviceLocale, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Effect.None.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {995}, m = "processUpdateConversationMetadata")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03031 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03031(x70.c<? super C03031> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processUpdateConversationMetadata(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$2", f = "UserActionProcessor.kt", l = {996}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03042 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.UpdateConversationMetadata $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03042(Action.UpdateConversationMetadata updateConversationMetadata, x70.c<? super C03042> cVar) {
            super(1, cVar);
            this.$action = updateConversationMetadata;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C03042(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C03042) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String conversationId = this.$action.getConversationId();
                Map<String, Object> metadata = this.$action.getMetadata();
                this.label = 1;
                if (userActionProcessorRepository.updateConversationMetadata(conversationId, metadata, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Effect.None.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {1099, 1109}, m = "processUpdateDownloadStatusAction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03051 extends c {
        int label;
        /* synthetic */ Object result;

        public C03051(x70.c<? super C03051> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processUpdateDownloadStatusAction(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$2", f = "UserActionProcessor.kt", l = {1101}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03062 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.UpdateDownloadStatusAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03062(Action.UpdateDownloadStatusAction updateDownloadStatusAction, x70.c<? super C03062> cVar) {
            super(1, cVar);
            this.$action = updateDownloadStatusAction;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C03062(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C03062) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String fileName = ((DownloadAttachmentStatus.DownloadAttachmentSuccess) this.$action.getStatus()).getFileName();
                String messageId = ((DownloadAttachmentStatus.DownloadAttachmentSuccess) this.$action.getStatus()).getMessageId();
                String conversationId = ((DownloadAttachmentStatus.DownloadAttachmentSuccess) this.$action.getStatus()).getConversationId();
                this.label = 1;
                obj = userActionProcessorRepository.updateDownloadingStatusSuccess(fileName, messageId, conversationId, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.OpenAttachmentFromFile(((DownloadAttachmentStatus.DownloadAttachmentSuccess) this.$action.getStatus()).getFile(), ((Conversation) obj).getId());
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$3", f = "UserActionProcessor.kt", l = {1110}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.UpdateDownloadStatusAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Action.UpdateDownloadStatusAction updateDownloadStatusAction, x70.c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$action = updateDownloadStatusAction;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new AnonymousClass3(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                DownloadAttachmentStatus status = this.$action.getStatus();
                status.getClass();
                String fileName = ((DownloadAttachmentStatus.DownloadAttachmentFailed) status).getFileName();
                String messageId = ((DownloadAttachmentStatus.DownloadAttachmentFailed) this.$action.getStatus()).getMessageId();
                String conversationId = ((DownloadAttachmentStatus.DownloadAttachmentFailed) this.$action.getStatus()).getConversationId();
                this.label = 1;
                obj = userActionProcessorRepository.updateDownloadingStatusFailed(fileName, messageId, conversationId, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.RefreshConversationResult(new ConversationKitResult.Success((Conversation) obj), false, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$processUserMerge$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {934, 935, 936}, m = "processUserMerge")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03071 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03071(x70.c<? super C03071> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.processUserMerge(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {748}, m = "sendActivityData")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03081 extends c {
        int label;
        /* synthetic */ Object result;

        public C03081(x70.c<? super C03081> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.sendActivityData(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$2", f = "UserActionProcessor.kt", l = {749}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03092 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ Action.SendActivityData $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03092(Action.SendActivityData sendActivityData, x70.c<? super C03092> cVar) {
            super(1, cVar);
            this.$action = sendActivityData;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C03092(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C03092) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                ActivityData activityData = this.$action.getActivityData();
                String conversationId = this.$action.getConversationId();
                this.label = 1;
                if (userActionProcessorRepository.sendActivityData(activityData, conversationId, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Effect.None.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor", f = "UserActionProcessor.kt", l = {712}, m = "updatePushToken")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03101 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03101(x70.c<? super C03101> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessor.this.updatePushToken(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$2", f = "UserActionProcessor.kt", l = {713}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lzendesk/conversationkit/android/internal/Effect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03112 extends i implements Function1<x70.c<? super Effect>, Object> {
        final /* synthetic */ String $pushToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03112(String str, x70.c<? super C03112> cVar) {
            super(1, cVar);
            this.$pushToken = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return UserActionProcessor.this.new C03112(this.$pushToken, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Effect> cVar) {
            return ((C03112) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                UserActionProcessorRepository userActionProcessorRepository = UserActionProcessor.this.userActionProcessorRepository;
                String str = this.$pushToken;
                this.label = 1;
                if (userActionProcessorRepository.updatePushToken(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return new Effect.PushTokenUpdateResult(new ConversationKitResult.Success(Unit.f26487a), this.$pushToken);
        }
    }

    public UserActionProcessor(@NotNull UserActionProcessorRepository userActionProcessorRepository, @NotNull SunCoFayeClient sunCoFayeClient, @NotNull MetadataManager metadataManager, @NotNull AttachmentDownloader attachmentDownloader, @NotNull AuthenticationErrorHandler authenticationErrorHandler, @NotNull ConversationKitDispatchers conversationKitDispatchers, @NotNull ConnectivityObserver connectivityObserver) {
        userActionProcessorRepository.getClass();
        sunCoFayeClient.getClass();
        metadataManager.getClass();
        attachmentDownloader.getClass();
        authenticationErrorHandler.getClass();
        conversationKitDispatchers.getClass();
        connectivityObserver.getClass();
        this.userActionProcessorRepository = userActionProcessorRepository;
        this.sunCoFayeClient = sunCoFayeClient;
        this.metadataManager = metadataManager;
        this.attachmentDownloader = attachmentDownloader;
        this.authenticationErrorHandler = authenticationErrorHandler;
        this.conversationKitDispatchers = conversationKitDispatchers;
        this.connectivityObserver = connectivityObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cacheIntegrationId(zendesk.conversationkit.android.internal.Action.PushCacheIntegrationId r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$cacheIntegrationId$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$cacheIntegrationId$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$cacheIntegrationId$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$PushCacheIntegrationId r5 = (zendesk.conversationkit.android.internal.Action.PushCacheIntegrationId) r5
            ba0.g.M(r6)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository
            java.lang.String r2 = r5.getIntegrationId()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.setIntegrationId(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            zendesk.conversationkit.android.internal.Effect$IntegrationIdCached r6 = new zendesk.conversationkit.android.internal.Effect$IntegrationIdCached
            java.lang.String r5 = r5.getIntegrationId()
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.cacheIntegrationId(zendesk.conversationkit.android.internal.Action$PushCacheIntegrationId, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preparePushToken(zendesk.conversationkit.android.internal.Action.PreparePushToken r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02581
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$preparePushToken$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$preparePushToken$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$preparePushToken$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$PreparePushToken r5 = (zendesk.conversationkit.android.internal.Action.PreparePushToken) r5
            ba0.g.M(r6)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository
            java.lang.String r2 = r5.getPushToken()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.setPushToken(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            zendesk.conversationkit.android.internal.Effect$PushTokenPrepared r6 = new zendesk.conversationkit.android.internal.Effect$PushTokenPrepared
            java.lang.String r5 = r5.getPushToken()
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.preparePushToken(zendesk.conversationkit.android.internal.Action$PreparePushToken, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processActivityEventReceived(zendesk.conversationkit.android.internal.Action.ActivityEventReceived r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02591
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processActivityEventReceived$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processActivityEventReceived$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processActivityEventReceived$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$ActivityEventReceived r5 = (zendesk.conversationkit.android.internal.Action.ActivityEventReceived) r5
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L2b
            goto L48
        L2b:
            r5 = move-exception
            goto L54
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository     // Catch: java.lang.Exception -> L2b
            zendesk.conversationkit.android.model.ActivityEvent r2 = r5.getActivityEvent()     // Catch: java.lang.Exception -> L2b
            r0.L$0 = r5     // Catch: java.lang.Exception -> L2b
            r0.label = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r6.processActivityEventReceived(r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r6 != r1) goto L48
            return r1
        L48:
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6     // Catch: java.lang.Exception -> L2b
            zendesk.conversationkit.android.internal.Effect$ActivityEventReceived r0 = new zendesk.conversationkit.android.internal.Effect$ActivityEventReceived     // Catch: java.lang.Exception -> L2b
            zendesk.conversationkit.android.model.ActivityEvent r5 = r5.getActivityEvent()     // Catch: java.lang.Exception -> L2b
            r0.<init>(r5, r6)     // Catch: java.lang.Exception -> L2b
            return r0
        L54:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L6b
            java.lang.String r6 = r5.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "UserActionProcessor"
            zendesk.logger.Logger.e(r1, r6, r5, r0)
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        L6b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processActivityEventReceived(zendesk.conversationkit.android.internal.Action$ActivityEventReceived, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAddConversationFields(zendesk.conversationkit.android.internal.Action.AddConversationFields r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02601
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationFields$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationFields$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationFields$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L4a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            java.util.Map r6 = r5.getFields()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4a
            zendesk.conversationkit.android.internal.metadata.MetadataManager r6 = r4.metadataManager
            java.util.Map r5 = r5.getFields()
            r0.label = r3
            java.lang.Object r5 = r6.saveConversationFields(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processAddConversationFields(zendesk.conversationkit.android.internal.Action$AddConversationFields, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAddConversationTags(zendesk.conversationkit.android.internal.Action.AddConversationTags r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02611
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationTags$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationTags$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddConversationTags$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L4a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            java.util.List r6 = r5.getTags()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4a
            zendesk.conversationkit.android.internal.metadata.MetadataManager r6 = r4.metadataManager
            java.util.List r5 = r5.getTags()
            r0.label = r3
            java.lang.Object r5 = r6.saveConversationTags(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processAddConversationTags(zendesk.conversationkit.android.internal.Action$AddConversationTags, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAddProactiveMessage(zendesk.conversationkit.android.internal.Action.AddProactiveMessage r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02621
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processAddProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository
            zendesk.conversationkit.android.model.ProactiveMessage r5 = r5.getProactiveMessage()
            r0.label = r3
            java.lang.Object r5 = r6.setProactiveMessage(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processAddProactiveMessage(zendesk.conversationkit.android.internal.Action$AddProactiveMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processClearConversationFields(x70.c<? super zendesk.conversationkit.android.internal.Effect> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02631
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearConversationFields$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearConversationFields$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearConversationFields$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.metadata.MetadataManager r5 = r4.metadataManager
            r0.label = r3
            java.lang.Object r5 = r5.clearConversationFields(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processClearConversationFields(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processClearProactiveMessage(zendesk.conversationkit.android.internal.Action.ClearProactiveMessage r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02641
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository
            int r5 = r5.getProactiveMessageId()
            r0.label = r3
            java.lang.Object r5 = r6.clearProactiveMessage(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processClearProactiveMessage(zendesk.conversationkit.android.internal.Action$ClearProactiveMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processClearTags(x70.c<? super zendesk.conversationkit.android.internal.Effect> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02651
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearTags$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearTags$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processClearTags$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.metadata.MetadataManager r5 = r4.metadataManager
            r0.label = r3
            java.lang.Object r5 = r5.clearConversationTags(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processClearTags(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processConversationAdded(java.lang.String r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02661
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2e
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            goto L49
        L2a:
            r8 = move-exception
            goto L4c
        L2c:
            r8 = move-exception
            goto L63
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationAdded$2     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            if (r9 != r1) goto L49
            return r1
        L49:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            return r9
        L4c:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L62
            java.lang.String r9 = "Failed to get added conversation."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$ConversationAddedResult r9 = new zendesk.conversationkit.android.internal.Effect$ConversationAddedResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0)
            goto L74
        L62:
            throw r8
        L63:
            java.lang.String r9 = "GET request for Conversation failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$ConversationAddedResult r9 = new zendesk.conversationkit.android.internal.Effect$ConversationAddedResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0)
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processConversationAdded(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processConversationRemoved(java.lang.String r7, x70.c<? super zendesk.conversationkit.android.internal.Effect> r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02681
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationRemoved$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationRemoved$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationRemoved$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L32
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            ba0.g.M(r8)     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            goto L49
        L2e:
            r7 = move-exception
            goto L54
        L30:
            r7 = move-exception
            goto L6b
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L39:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = r6.userActionProcessorRepository     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            r0.label = r5     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            java.lang.Object r8 = r8.removeConversationById(r7, r0)     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            if (r8 != r1) goto L49
            return r1
        L49:
            zendesk.conversationkit.android.internal.Effect$ConversationRemovedResult r8 = new zendesk.conversationkit.android.internal.Effect$ConversationRemovedResult     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            zendesk.conversationkit.android.ConversationKitResult$Success r0 = new zendesk.conversationkit.android.ConversationKitResult$Success     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            r0.<init>(r7)     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2e zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L30
            return r8
        L54:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L6a
            java.lang.String r8 = "Failed to remove conversation."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r8, r7, r0)
            zendesk.conversationkit.android.internal.Effect$ConversationRemovedResult r8 = new zendesk.conversationkit.android.internal.Effect$ConversationRemovedResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r7)
            r8.<init>(r0)
            goto L7c
        L6a:
            throw r7
        L6b:
            java.lang.String r8 = "Unable to find conversation"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r8, r7, r0)
            zendesk.conversationkit.android.internal.Effect$ConversationRemovedResult r8 = new zendesk.conversationkit.android.internal.Effect$ConversationRemovedResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r7)
            r8.<init>(r0)
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processConversationRemoved(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processConversationUpdate(zendesk.conversationkit.android.internal.Action.ConversationUpdate r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02691
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationUpdate$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationUpdate$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processConversationUpdate$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2e
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            goto L4f
        L2a:
            r8 = move-exception
            goto L5c
        L2c:
            r8 = move-exception
            goto L73
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r9 = r7.userActionProcessorRepository     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            java.lang.String r2 = r8.getConversationId()     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            zendesk.conversationkit.android.model.ConversationStatus r6 = r8.getStatus()     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            java.util.Map r8 = r8.getMetadata()     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            java.lang.Object r9 = r9.updateConversationById(r2, r6, r8, r0)     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            if (r9 != r1) goto L4f
            return r1
        L4f:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            zendesk.conversationkit.android.internal.Effect$ConversationUpdatedResult r8 = new zendesk.conversationkit.android.internal.Effect$ConversationUpdatedResult     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            zendesk.conversationkit.android.ConversationKitResult$Success r0 = new zendesk.conversationkit.android.ConversationKitResult$Success     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            r0.<init>(r9)     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2a zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2c
            return r8
        L5c:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L72
            java.lang.String r9 = "Failed to update conversation."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$ConversationUpdatedResult r9 = new zendesk.conversationkit.android.internal.Effect$ConversationUpdatedResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0)
            goto L86
        L72:
            throw r8
        L73:
            java.lang.String r9 = r8.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$ConversationUpdatedResult r9 = new zendesk.conversationkit.android.internal.Effect$ConversationUpdatedResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0)
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processConversationUpdate(zendesk.conversationkit.android.internal.Action$ConversationUpdate, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processCreateConversation(zendesk.conversationkit.android.internal.Action.CreateConversation r13, x70.c<? super zendesk.conversationkit.android.internal.Effect> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processCreateConversation(zendesk.conversationkit.android.internal.Action$CreateConversation, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Effect.CreateUserResult processCreateUser() {
        return new Effect.CreateUserResult(new ConversationKitResult.Failure(ConversationKitError.UserAlreadyExists.INSTANCE), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDownloadAttachmentAction(zendesk.conversationkit.android.internal.Action.DownloadAttachmentAction r13, x70.c<? super zendesk.conversationkit.android.internal.Effect> r14) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processDownloadAttachmentAction(zendesk.conversationkit.android.internal.Action$DownloadAttachmentAction, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetConversation(zendesk.conversationkit.android.internal.Action.GetConversation r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02731
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "UserActionProcessor"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L31
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            goto L76
        L2d:
            r8 = move-exception
            goto L79
        L2f:
            r8 = move-exception
            goto L90
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.internal.Action$GetConversation r8 = (zendesk.conversationkit.android.internal.Action.GetConversation) r8
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            goto L54
        L40:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r9 = r7.userActionProcessorRepository     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            java.lang.String r2 = r8.getConversationId()     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r0.L$0 = r8     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r0.label = r5     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            java.lang.Object r9 = r9.getPersistedConversation(r2, r0)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            if (r9 != r1) goto L54
            goto L75
        L54:
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            if (r9 == 0) goto L63
            zendesk.conversationkit.android.internal.Effect$GetConversationResult r8 = new zendesk.conversationkit.android.internal.Effect$GetConversationResult     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            zendesk.conversationkit.android.ConversationKitResult$Success r0 = new zendesk.conversationkit.android.ConversationKitResult$Success     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r0.<init>(r9)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r8.<init>(r0, r5)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            return r8
        L63:
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversation$2     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r5 = 0
            r2.<init>(r8, r5)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r0.L$0 = r5     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            r0.label = r4     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2d kotlinx.serialization.SerializationException -> L2f
            return r9
        L79:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L8f
            java.lang.String r9 = "Failed to create conversation."
            java.lang.Object[] r0 = new java.lang.Object[r6]
            zendesk.logger.Logger.e(r3, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$GetConversationResult r9 = new zendesk.conversationkit.android.internal.Effect$GetConversationResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0, r6)
            goto La1
        L8f:
            throw r8
        L90:
            java.lang.String r9 = "GET request for Conversation failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r6]
            zendesk.logger.Logger.e(r3, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$GetConversationResult r9 = new zendesk.conversationkit.android.internal.Effect$GetConversationResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0, r6)
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processGetConversation(zendesk.conversationkit.android.internal.Action$GetConversation, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetConversations(zendesk.conversationkit.android.internal.Action.GetConversations r6, x70.c<? super zendesk.conversationkit.android.internal.Effect> r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02751
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r7)     // Catch: java.lang.Exception -> L27
            goto L44
        L27:
            r6 = move-exception
            goto L47
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r7 = r5.authenticationErrorHandler     // Catch: java.lang.Exception -> L27
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetConversations$2     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.lang.Exception -> L27
            r0.label = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L44
            return r1
        L44:
            zendesk.conversationkit.android.internal.Effect r7 = (zendesk.conversationkit.android.internal.Effect) r7     // Catch: java.lang.Exception -> L27
            return r7
        L47:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L60
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "UserActionProcessor"
            java.lang.String r1 = "Failed to update conversation."
            zendesk.logger.Logger.e(r0, r1, r6, r7)
            zendesk.conversationkit.android.internal.Effect$GetConversationsResult r7 = new zendesk.conversationkit.android.internal.Effect$GetConversationsResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r6)
            r7.<init>(r0)
            return r7
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processGetConversations(zendesk.conversationkit.android.internal.Action$GetConversations, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetProactiveMessage(zendesk.conversationkit.android.internal.Action.GetProactiveMessage r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02771
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetProactiveMessage$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetProactiveMessage$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            zendesk.conversationkit.android.internal.Action$GetProactiveMessage r5 = (zendesk.conversationkit.android.internal.Action.GetProactiveMessage) r5
            ba0.g.M(r6)     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            int r2 = r5.getProactiveMessageId()     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            r0.L$0 = r5     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            r0.label = r3     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            java.lang.Object r6 = r6.getProactiveMessage(r2, r0)     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            if (r6 != r1) goto L46
            return r1
        L46:
            zendesk.conversationkit.android.ConversationKitResult$Success r0 = new zendesk.conversationkit.android.ConversationKitResult$Success     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            r0.<init>(r6)     // Catch: zendesk.conversationkit.android.internal.exception.ProactiveMessageNotFoundException -> L4c
            goto L60
        L4c:
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            int r5 = r5.getProactiveMessageId()
            java.lang.String r1 = "Couldn't find proactive message for id "
            java.lang.String r5 = j4.s.f(r5, r1)
            r6.<init>(r5)
            r0.<init>(r6)
        L60:
            zendesk.conversationkit.android.internal.Effect$GetProactiveMessage r5 = new zendesk.conversationkit.android.internal.Effect$GetProactiveMessage
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processGetProactiveMessage(zendesk.conversationkit.android.internal.Action$GetProactiveMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetVisitTypeReceived(x70.c<? super zendesk.conversationkit.android.internal.Effect> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02781
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetVisitTypeReceived$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetVisitTypeReceived$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetVisitTypeReceived$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r5 = r4.userActionProcessorRepository
            r0.label = r3
            java.lang.Object r5 = r5.getVisitType(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.model.VisitType r5 = (zendesk.conversationkit.android.model.VisitType) r5
            zendesk.conversationkit.android.internal.Effect$GetVisitType r0 = new zendesk.conversationkit.android.internal.Effect$GetVisitType
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processGetVisitTypeReceived(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processGetWaitTimeForConversation(zendesk.conversationkit.android.internal.Action.GetWaitTimeForConversation r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02791
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L32
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.internal.Action$GetWaitTimeForConversation r8 = (zendesk.conversationkit.android.internal.Action.GetWaitTimeForConversation) r8
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            goto L4f
        L2e:
            r9 = move-exception
            goto L52
        L30:
            r9 = move-exception
            goto L71
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L39:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processGetWaitTimeForConversation$2     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r0.L$0 = r8     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r0.label = r5     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            if (r9 != r1) goto L4f
            return r1
        L4f:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            return r9
        L52:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L70
            java.lang.String r8 = r8.getConversationId()
            java.lang.String r0 = "Failed to fetch wait time for conversation "
            java.lang.String r8 = e0.f.k(r0, r8)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r8, r9, r0)
            zendesk.conversationkit.android.internal.Effect$FetchWaitTimeResult r8 = new zendesk.conversationkit.android.internal.Effect$FetchWaitTimeResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r9)
            r8.<init>(r0)
            goto L8c
        L70:
            throw r9
        L71:
            java.lang.String r8 = r8.getConversationId()
            java.lang.String r0 = "Failed to decode wait time data for conversation "
            java.lang.String r1 = " due to malformed JSON response."
            java.lang.String r8 = w.a0.p(r0, r8, r1)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r8, r9, r0)
            zendesk.conversationkit.android.internal.Effect$FetchWaitTimeResult r8 = new zendesk.conversationkit.android.internal.Effect$FetchWaitTimeResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r9)
            r8.<init>(r0)
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processGetWaitTimeForConversation(zendesk.conversationkit.android.internal.Action$GetWaitTimeForConversation, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processLoadMoreMessages(zendesk.conversationkit.android.internal.Action.LoadMoreMessages r10, x70.c<? super zendesk.conversationkit.android.internal.Effect> r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processLoadMoreMessages(zendesk.conversationkit.android.internal.Action$LoadMoreMessages, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r11 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processLoginUser(zendesk.conversationkit.android.internal.Action.LoginUser r10, x70.c<? super zendesk.conversationkit.android.internal.Effect> r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02831
            if (r0 == 0) goto L13
            r0 = r11
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoginUser$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoginUser$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processLoginUser$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2e
            ba0.g.M(r11)
            goto Lb0
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L35:
            ba0.g.M(r11)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            goto L75
        L39:
            r10 = move-exception
            goto L87
        L3b:
            ba0.g.M(r11)
            zendesk.conversationkit.android.internal.user.Jwt$Decoder r11 = new zendesk.conversationkit.android.internal.user.Jwt$Decoder     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r11.<init>()     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            java.lang.String r2 = r10.getJwt()     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.ConversationKitResult r11 = r11.decode(r2)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            java.lang.Object r11 = zendesk.conversationkit.android.ConversationKitResultKt.getOrThrow(r11)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.internal.user.Jwt r11 = (zendesk.conversationkit.android.internal.user.Jwt) r11     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r7 = 0
            r2 = 0
            boolean r11 = zendesk.conversationkit.android.internal.extension.AuthenticatedUserUtilKt.isJwtExpired$default(r11, r7, r6, r2)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            if (r11 == 0) goto L66
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r10 = r9.authenticationErrorHandler     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.internal.exception.JwtIsExpiredException r11 = new zendesk.conversationkit.android.internal.exception.JwtIsExpiredException     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r11.<init>()     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.internal.Effect$UserAccessRevoked r10 = r10.revokeUser(r11)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            return r10
        L66:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r11 = r9.userActionProcessorRepository     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            java.lang.String r10 = r10.getJwt()     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r0.label = r6     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            java.lang.Object r11 = r11.login(r10, r0)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            if (r11 != r1) goto L75
            goto Laf
        L75:
            zendesk.conversationkit.android.model.User r11 = (zendesk.conversationkit.android.model.User) r11     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.internal.faye.SunCoFayeClient r10 = r9.sunCoFayeClient     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r10.disconnect()     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.internal.Effect$LoginUserResult r10 = new zendesk.conversationkit.android.internal.Effect$LoginUserResult     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            zendesk.conversationkit.android.ConversationKitResult$Success r2 = new zendesk.conversationkit.android.ConversationKitResult$Success     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r2.<init>(r11)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            r10.<init>(r2)     // Catch: java.lang.Exception -> L39 zendesk.conversationkit.android.internal.exception.UserAlreadyLoggedInException -> L9e
            return r10
        L87:
            boolean r11 = r10 instanceof java.util.concurrent.CancellationException
            if (r11 != 0) goto L9d
            java.lang.String r11 = "Failed to login."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r11, r10, r0)
            zendesk.conversationkit.android.internal.Effect$LoginUserResult r11 = new zendesk.conversationkit.android.internal.Effect$LoginUserResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r10)
            r11.<init>(r0)
            goto Lba
        L9d:
            throw r10
        L9e:
            java.lang.String r10 = "Login skipped: user with this JWT already logged in."
            java.lang.Object[] r11 = new java.lang.Object[r3]
            zendesk.logger.Logger.w(r4, r10, r11)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r10 = r9.userActionProcessorRepository
            r0.label = r5
            java.lang.Object r11 = r10.getUser(r0)
            if (r11 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            zendesk.conversationkit.android.ConversationKitResult$Success r10 = new zendesk.conversationkit.android.ConversationKitResult$Success
            r10.<init>(r11)
            zendesk.conversationkit.android.internal.Effect$AlreadyLoggedInResult r11 = new zendesk.conversationkit.android.internal.Effect$AlreadyLoggedInResult
            r11.<init>(r10)
        Lba:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processLoginUser(zendesk.conversationkit.android.internal.Action$LoginUser, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r6.clearStorage(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processLogoutUser(x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02841
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processLogoutUser$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processLogoutUser$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processLogoutUser$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L2a
            goto L50
        L2a:
            r6 = move-exception
            goto L66
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L33:
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L2a
            goto L45
        L37:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r5.userActionProcessorRepository     // Catch: java.lang.Exception -> L2a
            r0.label = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.logout(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L45
            goto L4f
        L45:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r5.userActionProcessorRepository     // Catch: java.lang.Exception -> L2a
            r0.label = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.clearStorage(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r5.userActionProcessorRepository     // Catch: java.lang.Exception -> L2a
            r6.clearWebStorage()     // Catch: java.lang.Exception -> L2a
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r6 = r5.authenticationErrorHandler     // Catch: java.lang.Exception -> L2a
            r0 = 0
            zendesk.conversationkit.android.internal.Effect$UserAccessRevoked r6 = zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.revokeUser$default(r6, r0, r4, r0)     // Catch: java.lang.Exception -> L2a
            zendesk.conversationkit.android.internal.Effect$LogoutUserResult r0 = new zendesk.conversationkit.android.internal.Effect$LogoutUserResult     // Catch: java.lang.Exception -> L2a
            zendesk.conversationkit.android.ConversationKitResult r6 = r6.getResult()     // Catch: java.lang.Exception -> L2a
            r0.<init>(r6)     // Catch: java.lang.Exception -> L2a
            return r0
        L66:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L7f
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "UserActionProcessor"
            java.lang.String r2 = "Failed to logout the user."
            zendesk.logger.Logger.e(r1, r2, r6, r0)
            zendesk.conversationkit.android.internal.Effect$LogoutUserResult r0 = new zendesk.conversationkit.android.internal.Effect$LogoutUserResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r1 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r1.<init>(r6)
            r0.<init>(r1)
            return r0
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processLogoutUser(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processMessageReceived(zendesk.conversationkit.android.internal.Action.MessageReceived r10, x70.c<? super zendesk.conversationkit.android.internal.Effect> r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processMessageReceived(zendesk.conversationkit.android.internal.Action$MessageReceived, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Effect processNetworkConnectionStatusUpdate(Action.NetworkConnectionStatusUpdate action) {
        return new Effect.NetworkConnectionChanged(action.getConnectionStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Effect processPersistedUserRetrieved(Action.PersistedUserRetrieve action) {
        return new Effect.PersistedUserReceived(action.getUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd A[Catch: MessageAlreadyInConversationException -> 0x0048, ConversationNotFoundException -> 0x004b, MessageContentIsBlankException -> 0x004e, TryCatch #2 {ConversationNotFoundException -> 0x004b, MessageAlreadyInConversationException -> 0x0048, MessageContentIsBlankException -> 0x004e, blocks: (B:15:0x003e, B:55:0x00f3, B:26:0x0064, B:51:0x00d5, B:29:0x0075, B:43:0x00b3, B:45:0x00bd, B:47:0x00c3, B:32:0x007d, B:39:0x009a, B:35:0x0084), top: B:61:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processPrepareMessage(zendesk.conversationkit.android.internal.Action.PrepareMessage r13, x70.c<? super zendesk.conversationkit.android.internal.Effect> r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processPrepareMessage(zendesk.conversationkit.android.internal.Action$PrepareMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processProactiveMessageReferral(zendesk.conversationkit.android.internal.Action.ProactiveMessageReferral r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02871
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "UserActionProcessor"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2e
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            goto L49
        L2a:
            r8 = move-exception
            goto L4c
        L2c:
            r8 = move-exception
            goto L63
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processProactiveMessageReferral$2     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r0.label = r4     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            if (r9 != r1) goto L49
            return r1
        L49:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            return r9
        L4c:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L62
            java.lang.String r9 = "Failed to process proactive message referral."
            java.lang.Object[] r0 = new java.lang.Object[r5]
            zendesk.logger.Logger.e(r3, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$ProactiveMessageReferral r9 = new zendesk.conversationkit.android.internal.Effect$ProactiveMessageReferral
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0, r5)
            goto L74
        L62:
            throw r8
        L63:
            java.lang.String r9 = "POST request for proactive message referral failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r5]
            zendesk.logger.Logger.e(r3, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$ProactiveMessageReferral r9 = new zendesk.conversationkit.android.internal.Effect$ProactiveMessageReferral
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r8)
            r9.<init>(r0, r5)
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processProactiveMessageReferral(zendesk.conversationkit.android.internal.Action$ProactiveMessageReferral, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processReAuthenticateSubscription(x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02891
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L27
            goto L44
        L27:
            r6 = move-exception
            goto L47
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r6 = r5.authenticationErrorHandler     // Catch: java.lang.Exception -> L27
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processReAuthenticateSubscription$2     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Exception -> L27
            r0.label = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L44
            return r1
        L44:
            zendesk.conversationkit.android.internal.Effect r6 = (zendesk.conversationkit.android.internal.Effect) r6     // Catch: java.lang.Exception -> L27
            return r6
        L47:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L58
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "UserActionProcessor"
            java.lang.String r2 = "Failed to Resubscribe connection."
            zendesk.logger.Logger.e(r1, r2, r6, r0)
            zendesk.conversationkit.android.internal.Effect$None r6 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r6
        L58:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processReAuthenticateSubscription(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRefreshConversation(zendesk.conversationkit.android.internal.Action.RefreshConversation r12, x70.c<? super zendesk.conversationkit.android.internal.Effect> r13) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r13 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02911
            if (r0 == 0) goto L13
            r0 = r13
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L30
            ba0.g.M(r13)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            goto L4b
        L2a:
            r0 = move-exception
            r12 = r0
            goto L4e
        L2d:
            r0 = move-exception
            r12 = r0
            goto L69
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L37:
            ba0.g.M(r13)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r13 = r11.authenticationErrorHandler     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshConversation$2     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            r6 = 0
            r2.<init>(r12, r6)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            r0.label = r5     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            java.lang.Object r13 = r13.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            if (r13 != r1) goto L4b
            return r1
        L4b:
            zendesk.conversationkit.android.internal.Effect r13 = (zendesk.conversationkit.android.internal.Effect) r13     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2d
            return r13
        L4e:
            boolean r13 = r12 instanceof java.util.concurrent.CancellationException
            if (r13 != 0) goto L68
            java.lang.String r13 = "Failed to refresh conversation."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r13, r12, r0)
            zendesk.conversationkit.android.internal.Effect$RefreshConversationResult r5 = new zendesk.conversationkit.android.internal.Effect$RefreshConversationResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r6 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r6.<init>(r12)
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            goto L7e
        L68:
            throw r12
        L69:
            java.lang.String r13 = "GET request for Conversation failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r13, r12, r0)
            zendesk.conversationkit.android.internal.Effect$RefreshConversationResult r5 = new zendesk.conversationkit.android.internal.Effect$RefreshConversationResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r6 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r6.<init>(r12)
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processRefreshConversation(zendesk.conversationkit.android.internal.Action$RefreshConversation, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRefreshUser(x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02931
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            java.lang.String r5 = "UserActionProcessor"
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L37
            if (r2 != r6) goto L30
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            goto L4a
        L2c:
            r9 = move-exception
            goto L4d
        L2e:
            r9 = move-exception
            goto L64
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L37:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r8.authenticationErrorHandler     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processRefreshUser$2     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            r2.<init>(r7)     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            r0.label = r6     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            if (r9 != r1) goto L4a
            return r1
        L4a:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2c kotlinx.serialization.SerializationException -> L2e
            return r9
        L4d:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L63
            java.lang.String r0 = "Failed to get appUser."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            zendesk.logger.Logger.e(r5, r0, r9, r1)
            zendesk.conversationkit.android.internal.Effect$RefreshUserResult r0 = new zendesk.conversationkit.android.internal.Effect$RefreshUserResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r1 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r1.<init>(r9)
            r0.<init>(r1, r7, r3, r7)
            goto L75
        L63:
            throw r9
        L64:
            java.lang.String r0 = "GET request for AppUser failed to decode malformed JSON response."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            zendesk.logger.Logger.e(r5, r0, r9, r1)
            zendesk.conversationkit.android.internal.Effect$RefreshUserResult r0 = new zendesk.conversationkit.android.internal.Effect$RefreshUserResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r1 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r1.<init>(r9)
            r0.<init>(r1, r7, r3, r7)
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processRefreshUser(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processSendMessage(zendesk.conversationkit.android.internal.Action.SendMessage r24, x70.c<? super zendesk.conversationkit.android.internal.Effect> r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processSendMessage(zendesk.conversationkit.android.internal.Action$SendMessage, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processSendPostbackAction(zendesk.conversationkit.android.internal.Action.SendPostbackAction r6, x70.c<? super zendesk.conversationkit.android.internal.Effect> r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02971
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r7)     // Catch: java.lang.Exception -> L27
            goto L44
        L27:
            r6 = move-exception
            goto L47
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r7 = r5.authenticationErrorHandler     // Catch: java.lang.Exception -> L27
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processSendPostbackAction$2     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.lang.Exception -> L27
            r0.label = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L44
            return r1
        L44:
            zendesk.conversationkit.android.internal.Effect r7 = (zendesk.conversationkit.android.internal.Effect) r7     // Catch: java.lang.Exception -> L27
            return r7
        L47:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L60
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "UserActionProcessor"
            java.lang.String r1 = "POST request to send a Postback failed."
            zendesk.logger.Logger.e(r0, r1, r6, r7)
            zendesk.conversationkit.android.internal.Effect$SendPostbackResult r7 = new zendesk.conversationkit.android.internal.Effect$SendPostbackResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r0 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r0.<init>(r6)
            r7.<init>(r0)
            return r7
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processSendPostbackAction(zendesk.conversationkit.android.internal.Action$SendPostbackAction, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processSetVisitTypeReceived(zendesk.conversationkit.android.internal.Action.SetVisitType r5, x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C02991
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processSetVisitTypeReceived$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C02991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processSetVisitTypeReceived$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processSetVisitTypeReceived$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r4.userActionProcessorRepository
            zendesk.conversationkit.android.model.VisitType r5 = r5.getVisitType()
            r0.label = r3
            java.lang.Object r5 = r6.setVisitType(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.conversationkit.android.internal.Effect$None r5 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processSetVisitTypeReceived(zendesk.conversationkit.android.internal.Action$SetVisitType, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processStartRealtimeConnection(x70.c<? super zendesk.conversationkit.android.internal.Effect> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03001
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processStartRealtimeConnection$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processStartRealtimeConnection$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processStartRealtimeConnection$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            zendesk.conversationkit.android.ConnectionStatus r1 = (zendesk.conversationkit.android.ConnectionStatus) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            ba0.g.M(r6)
            goto L86
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L39:
            ba0.g.M(r6)
            goto L5a
        L3d:
            ba0.g.M(r6)
            zendesk.conversationkit.android.internal.ConnectivityObserver r6 = r5.connectivityObserver
            r6.connect()
            zendesk.conversationkit.android.internal.faye.SunCoFayeClient r6 = r5.sunCoFayeClient
            zendesk.conversationkit.android.ConnectionStatus r6 = r6.connectionStatus()
            zendesk.conversationkit.android.ConnectionStatus r2 = zendesk.conversationkit.android.ConnectionStatus.DISCONNECTED
            if (r6 != r2) goto L6c
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r6 = r5.userActionProcessorRepository
            r0.label = r4
            java.lang.Object r6 = r6.getUser(r0)
            if (r6 != r1) goto L5a
            goto L82
        L5a:
            zendesk.conversationkit.android.model.User r6 = (zendesk.conversationkit.android.model.User) r6
            java.util.List r6 = r6.getConversations()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            zendesk.conversationkit.android.internal.faye.SunCoFayeClient r6 = r5.sunCoFayeClient
            r6.connect()
            goto Lb5
        L6c:
            zendesk.conversationkit.android.internal.faye.SunCoFayeClient r6 = r5.sunCoFayeClient
            zendesk.conversationkit.android.ConnectionStatus r6 = r6.connectionStatus()
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r2 = r5.userActionProcessorRepository
            java.lang.String r4 = "UserActionProcessor"
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r2.getUser(r0)
            if (r0 != r1) goto L83
        L82:
            return r1
        L83:
            r1 = r6
            r6 = r0
            r0 = r4
        L86:
            zendesk.conversationkit.android.model.User r6 = (zendesk.conversationkit.android.model.User) r6
            java.util.List r6 = r6.getConversations()
            int r6 = r6.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\"Skipping connection attempt as the faye client is "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ".\n                    |User has "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = " conversations.\n"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r6 = kotlin.text.s.d(r6)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            zendesk.logger.Logger.i(r0, r6, r1)
        Lb5:
            zendesk.conversationkit.android.internal.Effect$None r6 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processStartRealtimeConnection(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processUpdateAppUserLocale(zendesk.conversationkit.android.internal.Action.UpdateAppUserLocale r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03011
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2e
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            goto L49
        L2a:
            r8 = move-exception
            goto L4c
        L2c:
            r8 = move-exception
            goto L5b
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateAppUserLocale$2     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            if (r9 != r1) goto L49
            return r1
        L49:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            return r9
        L4c:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L5a
            java.lang.String r9 = "Failed to update app user locale."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$None r8 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            goto L64
        L5a:
            throw r8
        L5b:
            java.lang.String r9 = "PUT request for AppUser failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$None r8 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processUpdateAppUserLocale(zendesk.conversationkit.android.internal.Action$UpdateAppUserLocale, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processUpdateConversationMetadata(zendesk.conversationkit.android.internal.Action.UpdateConversationMetadata r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03031
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03031) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L32
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.internal.Action$UpdateConversationMetadata r8 = (zendesk.conversationkit.android.internal.Action.UpdateConversationMetadata) r8
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            goto L4f
        L2e:
            r9 = move-exception
            goto L52
        L30:
            r8 = move-exception
            goto L69
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L39:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateConversationMetadata$2     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r0.L$0 = r8     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r0.label = r5     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            if (r9 != r1) goto L4f
            return r1
        L4f:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            return r9
        L52:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L68
            java.lang.String r8 = r8.getConversationId()
            java.lang.String r0 = "Failed updating Conversation with id = "
            java.lang.String r8 = e0.f.k(r0, r8)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r8, r9, r0)
            zendesk.conversationkit.android.internal.Effect$None r8 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            goto L72
        L68:
            throw r9
        L69:
            java.lang.String r9 = "PUT request to update Conversation failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$None r8 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processUpdateConversationMetadata(zendesk.conversationkit.android.internal.Action$UpdateConversationMetadata, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processUpdateDownloadStatusAction(zendesk.conversationkit.android.internal.Action.UpdateDownloadStatusAction r7, x70.c<? super zendesk.conversationkit.android.internal.Effect> r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03051
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r8)     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            goto L64
        L2a:
            r7 = move-exception
            goto L67
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L33:
            ba0.g.M(r8)     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            goto L53
        L37:
            ba0.g.M(r8)
            zendesk.conversationkit.android.model.attachments.DownloadAttachmentStatus r8 = r7.getStatus()     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            boolean r8 = r8 instanceof zendesk.conversationkit.android.model.attachments.DownloadAttachmentStatus.DownloadAttachmentSuccess     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r2 = r6.authenticationErrorHandler
            r5 = 0
            if (r8 == 0) goto L56
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$2 r8 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$2     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            r8.<init>(r7, r5)     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            r0.label = r4     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            java.lang.Object r8 = r2.executeWithAuthErrorHandling(r8, r0)     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            if (r8 != r1) goto L53
            goto L63
        L53:
            zendesk.conversationkit.android.internal.Effect r8 = (zendesk.conversationkit.android.internal.Effect) r8     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            return r8
        L56:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$3 r8 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUpdateDownloadStatusAction$3     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            r8.<init>(r7, r5)     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            r0.label = r3     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            java.lang.Object r8 = r2.executeWithAuthErrorHandling(r8, r0)     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            zendesk.conversationkit.android.internal.Effect r8 = (zendesk.conversationkit.android.internal.Effect) r8     // Catch: zendesk.conversationkit.android.internal.exception.ConversationNotFoundException -> L2a
            return r8
        L67:
            java.lang.String r8 = r7.getMessage()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "UserActionProcessor"
            zendesk.logger.Logger.e(r1, r8, r7, r0)
            zendesk.conversationkit.android.internal.Effect$None r7 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processUpdateDownloadStatusAction(zendesk.conversationkit.android.internal.Action$UpdateDownloadStatusAction, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processUserMerge(zendesk.conversationkit.android.internal.Action.UserMergeReceived r7, x70.c<? super zendesk.conversationkit.android.internal.Effect> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03071
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUserMerge$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03071) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$processUserMerge$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$processUserMerge$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r8)
            goto L7d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L34:
            ba0.g.M(r8)
            goto L72
        L38:
            java.lang.Object r7 = r0.L$0
            zendesk.conversationkit.android.internal.Action$UserMergeReceived r7 = (zendesk.conversationkit.android.internal.Action.UserMergeReceived) r7
            ba0.g.M(r8)
            goto L50
        L40:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = r6.userActionProcessorRepository
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.getUser(r0)
            if (r8 != r1) goto L50
            goto L7c
        L50:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            java.lang.String r8 = r8.getId()
            zendesk.conversationkit.android.model.UserMerge r7 = r7.getData()
            java.lang.String r7 = r7.getSurvivingAppUserId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r7)
            if (r7 != 0) goto L8e
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r7 = r6.userActionProcessorRepository
            r8 = 0
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r7.updateReAuthenticateUser(r5, r0)
            if (r7 != r1) goto L72
            goto L7c
        L72:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r7 = r6.userActionProcessorRepository
            r0.label = r3
            java.lang.Object r8 = r7.getUser(r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            java.lang.String r7 = r8.getJwt$zendesk_conversationkit_conversationkit_android()
            if (r7 == 0) goto L8b
            zendesk.conversationkit.android.internal.Effect$ReAuthenticateUser r8 = new zendesk.conversationkit.android.internal.Effect$ReAuthenticateUser
            r8.<init>(r7)
            return r8
        L8b:
            zendesk.conversationkit.android.internal.Effect$None r7 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r7
        L8e:
            zendesk.conversationkit.android.internal.Effect$None r7 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.processUserMerge(zendesk.conversationkit.android.internal.Action$UserMergeReceived, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendActivityData(zendesk.conversationkit.android.internal.Action.SendActivityData r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03081
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03081) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2e
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            goto L49
        L2a:
            r8 = move-exception
            goto L4c
        L2c:
            r8 = move-exception
            goto L5b
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            ba0.g.M(r9)
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$sendActivityData$2     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            if (r9 != r1) goto L49
            return r1
        L49:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2a kotlinx.serialization.SerializationException -> L2c
            return r9
        L4c:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L5a
            java.lang.String r9 = "Failed to send activity data."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$None r8 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
            goto L64
        L5a:
            throw r8
        L5b:
            java.lang.String r9 = "POST request for Sending Activity Data failed to decode malformed JSON response."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r9, r8, r0)
            zendesk.conversationkit.android.internal.Effect$None r8 = zendesk.conversationkit.android.internal.Effect.None.INSTANCE
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.sendActivityData(zendesk.conversationkit.android.internal.Action$SendActivityData, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updatePushToken(zendesk.conversationkit.android.internal.Action.UpdatePushToken r8, x70.c<? super zendesk.conversationkit.android.internal.Effect> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.user.UserActionProcessor.C03101
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$1 r0 = (zendesk.conversationkit.android.internal.user.UserActionProcessor.C03101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$1 r0 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "UserActionProcessor"
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L32
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            ba0.g.M(r9)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            goto L53
        L2e:
            r9 = move-exception
            goto L56
        L30:
            r9 = move-exception
            goto L6d
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L39:
            ba0.g.M(r9)
            java.lang.String r8 = r8.getPushToken()
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler r9 = r7.authenticationErrorHandler     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$2 r2 = new zendesk.conversationkit.android.internal.user.UserActionProcessor$updatePushToken$2     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r6 = 0
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r0.L$0 = r8     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            r0.label = r5     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            java.lang.Object r9 = r9.executeWithAuthErrorHandling(r2, r0)     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            if (r9 != r1) goto L53
            return r1
        L53:
            zendesk.conversationkit.android.internal.Effect r9 = (zendesk.conversationkit.android.internal.Effect) r9     // Catch: java.lang.Exception -> L2e kotlinx.serialization.SerializationException -> L30
            return r9
        L56:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L6c
            java.lang.String r0 = "Failed to update push token."
            java.lang.Object[] r1 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r0, r9, r1)
            zendesk.conversationkit.android.internal.Effect$PushTokenUpdateResult r0 = new zendesk.conversationkit.android.internal.Effect$PushTokenUpdateResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r1 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r1.<init>(r9)
            r0.<init>(r1, r8)
            goto L7e
        L6c:
            throw r9
        L6d:
            java.lang.String r0 = "PUT request for Updating Push Token failed to decode malformed JSON response."
            java.lang.Object[] r1 = new java.lang.Object[r3]
            zendesk.logger.Logger.e(r4, r0, r9, r1)
            zendesk.conversationkit.android.internal.Effect$PushTokenUpdateResult r0 = new zendesk.conversationkit.android.internal.Effect$PushTokenUpdateResult
            zendesk.conversationkit.android.ConversationKitResult$Failure r1 = new zendesk.conversationkit.android.ConversationKitResult$Failure
            r1.<init>(r9)
            r0.<init>(r1, r8)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.UserActionProcessor.updatePushToken(zendesk.conversationkit.android.internal.Action$UpdatePushToken, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean wasServedByAgent(ServerType currentServer, ServerType newServer) {
        return currentServer == ServerType.BOT && newServer == ServerType.AGENT;
    }

    @Nullable
    public final Object getUser(@NotNull x70.c<? super User> cVar) {
        return this.userActionProcessorRepository.getUser(cVar);
    }

    public final void invalidate() {
        this.connectivityObserver.disconnect();
        this.sunCoFayeClient.invalidate();
    }

    @Override // zendesk.conversationkit.android.internal.ActionProcessor
    @Nullable
    public Object process(@NotNull Action action, @NotNull x70.c<? super Effect> cVar) {
        return f0.K(this.conversationKitDispatchers.io(), new AnonymousClass2(action, this, null), cVar);
    }

    public /* synthetic */ UserActionProcessor(UserActionProcessorRepository userActionProcessorRepository, SunCoFayeClient sunCoFayeClient, MetadataManager metadataManager, AttachmentDownloader attachmentDownloader, AuthenticationErrorHandler authenticationErrorHandler, ConversationKitDispatchers conversationKitDispatchers, ConnectivityObserver connectivityObserver, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userActionProcessorRepository, sunCoFayeClient, metadataManager, attachmentDownloader, authenticationErrorHandler, (i11 & 32) != 0 ? new DefaultConversationKitDispatchers() : conversationKitDispatchers, connectivityObserver);
    }
}
