package zendesk.conversationkit.android;

import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y80.y1;
import zendesk.conversationkit.android.internal.metadata.ConversationMetadataService;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationsPagination;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.conversationkit.android.model.WaitTimeData;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 Z2\u00020\u0001:\u0001ZJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0014H¦@¢\u0006\u0004\b\u001b\u0010\tJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0017H¦@¢\u0006\u0004\b\u001c\u0010\tJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H¦@¢\u0006\u0004\b\u001d\u0010\tJ\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u001f\u0010\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010 \u001a\u00020\u0017H¦@¢\u0006\u0004\b!\u0010\u001aJ&\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0017H¦@¢\u0006\u0004\b$\u0010%J,\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0(0\u00132\u0006\u0010 \u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H¦@¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0017H¦@¢\u0006\u0004\b,\u0010\u001aJ \u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010 \u001a\u00020\u0017H¦@¢\u0006\u0004\b/\u00100J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0013H¦@¢\u0006\u0004\b2\u0010\tJ\u0018\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u000201H¦@¢\u0006\u0004\b4\u00105J\u0018\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H¦@¢\u0006\u0004\b8\u00109J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u0002060\u00132\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b<\u0010;J*\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0017H¦@¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H&¢\u0006\u0004\bA\u0010BJ*\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00132\b\b\u0002\u0010C\u001a\u00020\u00112\b\b\u0002\u0010E\u001a\u00020DH¦@¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH&¢\u0006\u0004\bJ\u0010KJ&\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010 \u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H¦@¢\u0006\u0004\bM\u0010NJ \u0010O\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H¦@¢\u0006\u0004\bO\u0010PJ\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00132\u0006\u0010 \u001a\u00020\u0017H¦@¢\u0006\u0004\bR\u0010\u001aJ\u000f\u0010S\u001a\u00020\u0004H&¢\u0006\u0004\bS\u0010TR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006["}, d2 = {"Lzendesk/conversationkit/android/ConversationKit;", "", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "listener", "", "addEventListener", "(Lzendesk/conversationkit/android/ConversationKitEventListener;)V", "removeEventListener", "pause", "(Lx70/c;)Ljava/lang/Object;", "resume", "Lzendesk/conversationkit/android/ConversationKitSettings;", "getSettings", "()Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "getConfig", "()Lzendesk/conversationkit/android/model/Config;", "", "proactiveMessageId", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "createUser", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "", "jwt", "loginUser", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getCurrentUser", "getClientId", "logoutUser", "Lzendesk/conversationkit/android/model/Conversation;", "createConversation", "conversationId", "getConversation", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "sendMessage", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "beforeTimestamp", "", "getMessages", "(Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "pushNotificationToken", "updatePushNotificationToken", "Lzendesk/conversationkit/android/model/ActivityData;", "activityData", "sendActivityData", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/VisitType;", "getVisitType", "visitType", "setVisitType", "(Lzendesk/conversationkit/android/model/VisitType;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "proactiveMessage", "addProactiveMessage", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Lx70/c;)Ljava/lang/Object;", "getProactiveMessage", "(ILx70/c;)Ljava/lang/Object;", "clearProactiveMessage", "proactiveMessageReferral", "(Ljava/lang/Integer;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "event", "dispatchEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent;)V", "offset", "", "fromCache", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "getConversations", "(IZLx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "conversationMetadataService", "()Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "actionId", "sendPostbackMessage", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "downloadAttachment", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/WaitTimeData;", "getWaitTimeForConversation", "invalidate", "()V", "Ly80/y1;", "Lzendesk/conversationkit/android/ConnectionStatus;", "getConnectionStatusFlow", "()Ly80/y1;", "connectionStatusFlow", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/ConversationKit$Companion;", "", "<init>", "()V", "authenticationDelegate", "Lzendesk/conversationkit/android/AuthenticationDelegate;", "getAuthenticationDelegate", "()Lzendesk/conversationkit/android/AuthenticationDelegate;", "setAuthenticationDelegate", "(Lzendesk/conversationkit/android/AuthenticationDelegate;)V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static AuthenticationDelegate authenticationDelegate;

        private Companion() {
        }

        @Nullable
        public final AuthenticationDelegate getAuthenticationDelegate() {
            return authenticationDelegate;
        }

        public final void setAuthenticationDelegate(@Nullable AuthenticationDelegate authenticationDelegate2) {
            authenticationDelegate = authenticationDelegate2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object createConversation$default(ConversationKit conversationKit, Integer num, c cVar, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: createConversation");
                return null;
            }
            if ((i11 & 1) != 0) {
                num = null;
            }
            return conversationKit.createConversation(num, cVar);
        }

        public static /* synthetic */ Object createUser$default(ConversationKit conversationKit, Integer num, c cVar, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: createUser");
                return null;
            }
            if ((i11 & 1) != 0) {
                num = null;
            }
            return conversationKit.createUser(num, cVar);
        }

        public static /* synthetic */ Object getConversations$default(ConversationKit conversationKit, int i11, boolean z11, c cVar, int i12, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: getConversations");
                return null;
            }
            if ((i12 & 1) != 0) {
                i11 = 0;
            }
            if ((i12 & 2) != 0) {
                z11 = false;
            }
            return conversationKit.getConversations(i11, z11, cVar);
        }

        public static /* synthetic */ Object proactiveMessageReferral$default(ConversationKit conversationKit, Integer num, String str, c cVar, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: proactiveMessageReferral");
                return null;
            }
            if ((i11 & 1) != 0) {
                num = null;
            }
            return conversationKit.proactiveMessageReferral(num, str, cVar);
        }
    }

    void addEventListener(@NotNull ConversationKitEventListener listener);

    @Nullable
    Object addProactiveMessage(@NotNull ProactiveMessage proactiveMessage, @NotNull c<? super Unit> cVar);

    @Nullable
    Object clearProactiveMessage(int i11, @NotNull c<? super Unit> cVar);

    @NotNull
    ConversationMetadataService conversationMetadataService();

    @Nullable
    Object createConversation(@Nullable Integer num, @NotNull c<? super ConversationKitResult<Conversation>> cVar);

    @Nullable
    Object createUser(@Nullable Integer num, @NotNull c<? super ConversationKitResult<User>> cVar);

    void dispatchEvent(@NotNull ConversationKitEvent event);

    @Nullable
    Object downloadAttachment(@NotNull String str, @NotNull Message message, @NotNull c<? super Unit> cVar);

    @Nullable
    Object getClientId(@NotNull c<? super String> cVar);

    @NotNull
    Config getConfig();

    @NotNull
    y1 getConnectionStatusFlow();

    @Nullable
    Object getConversation(@NotNull String str, @NotNull c<? super ConversationKitResult<Conversation>> cVar);

    @Nullable
    Object getConversations(int i11, boolean z11, @NotNull c<? super ConversationKitResult<ConversationsPagination>> cVar);

    @Nullable
    Object getCurrentUser(@NotNull c<? super User> cVar);

    @Nullable
    Object getMessages(@NotNull String str, double d3, @NotNull c<? super ConversationKitResult<? extends List<Message>>> cVar);

    @Nullable
    Object getProactiveMessage(int i11, @NotNull c<? super ConversationKitResult<ProactiveMessage>> cVar);

    @NotNull
    ConversationKitSettings getSettings();

    @Nullable
    Object getVisitType(@NotNull c<? super ConversationKitResult<? extends VisitType>> cVar);

    @Nullable
    Object getWaitTimeForConversation(@NotNull String str, @NotNull c<? super ConversationKitResult<WaitTimeData>> cVar);

    void invalidate();

    @Nullable
    Object loginUser(@NotNull String str, @NotNull c<? super ConversationKitResult<User>> cVar);

    @Nullable
    Object logoutUser(@NotNull c<? super ConversationKitResult<Unit>> cVar);

    @Nullable
    Object pause(@NotNull c<? super Unit> cVar);

    @Nullable
    Object proactiveMessageReferral(@Nullable Integer num, @NotNull String str, @NotNull c<? super ConversationKitResult<Conversation>> cVar);

    void removeEventListener(@NotNull ConversationKitEventListener listener);

    @Nullable
    Object resume(@NotNull c<? super Unit> cVar);

    @Nullable
    Object sendActivityData(@NotNull ActivityData activityData, @NotNull String str, @NotNull c<? super Unit> cVar);

    @Nullable
    Object sendMessage(@NotNull Message message, @NotNull String str, @NotNull c<? super ConversationKitResult<Message>> cVar);

    @Nullable
    Object sendPostbackMessage(@NotNull String str, @NotNull String str2, @NotNull c<? super ConversationKitResult<Unit>> cVar);

    @Nullable
    Object setVisitType(@NotNull VisitType visitType, @NotNull c<? super Unit> cVar);

    @Nullable
    Object updatePushNotificationToken(@NotNull String str, @NotNull c<? super Unit> cVar);
}
