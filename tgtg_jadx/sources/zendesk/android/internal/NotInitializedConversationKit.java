package zendesk.android.internal;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y80.r;
import y80.y1;
import zendesk.android.Zendesk;
import zendesk.android.internal.ZendeskError;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.ConversationKitSettings;
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
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u000bJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u000bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0096@¢\u0006\u0004\b\u001f\u0010\u000bJ \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b!\u0010\u001aJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010\"\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b#\u0010\u001dJ&\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b&\u0010'J,\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0\u00172\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b.\u0010\u001dJ \u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0017H\u0096@¢\u0006\u0004\b4\u0010\u000bJ\u0018\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u000203H\u0096@¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208H\u0096@¢\u0006\u0004\b:\u0010;J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b>\u0010=J(\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ&\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00172\u0006\u0010E\u001a\u00020\u00152\u0006\u0010G\u001a\u00020FH\u0096@¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ&\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\bQ\u0010RJ\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00172\u0006\u0010\"\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bT\u0010\u001dJ\u000f\u0010U\u001a\u00020\u0006H\u0016¢\u0006\u0004\bU\u0010\u0003R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lzendesk/android/internal/NotInitializedConversationKit;", "Lzendesk/conversationkit/android/ConversationKit;", "<init>", "()V", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "listener", "", "addEventListener", "(Lzendesk/conversationkit/android/ConversationKitEventListener;)V", "removeEventListener", "pause", "(Lx70/c;)Ljava/lang/Object;", "resume", "Lzendesk/conversationkit/android/ConversationKitSettings;", "getSettings", "()Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "getConfig", "()Lzendesk/conversationkit/android/model/Config;", "", "getClientId", "", "proactiveMessageId", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "createUser", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "jwt", "loginUser", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getCurrentUser", "logoutUser", "Lzendesk/conversationkit/android/model/Conversation;", "createConversation", "conversationId", "getConversation", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "sendMessage", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "beforeTimestamp", "", "getMessages", "(Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "pushNotificationToken", "updatePushNotificationToken", "Lzendesk/conversationkit/android/model/ActivityData;", "activityData", "sendActivityData", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/VisitType;", "getVisitType", "visitType", "setVisitType", "(Lzendesk/conversationkit/android/model/VisitType;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "proactiveMessage", "addProactiveMessage", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Lx70/c;)Ljava/lang/Object;", "getProactiveMessage", "(ILx70/c;)Ljava/lang/Object;", "clearProactiveMessage", "proactiveMessageReferral", "(Ljava/lang/Integer;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "event", "dispatchEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent;)V", "offset", "", "fromCache", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "getConversations", "(IZLx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "conversationMetadataService", "()Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "actionId", "sendPostbackMessage", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "downloadAttachment", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/WaitTimeData;", "getWaitTimeForConversation", "invalidate", "Ly80/y1;", "Lzendesk/conversationkit/android/ConnectionStatus;", "getConnectionStatusFlow", "()Ly80/y1;", "connectionStatusFlow", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotInitializedConversationKit implements ConversationKit {

    @NotNull
    public static final NotInitializedConversationKit INSTANCE = new NotInitializedConversationKit();

    private NotInitializedConversationKit() {
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void addEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object addProactiveMessage(@NotNull ProactiveMessage proactiveMessage, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object clearProactiveMessage(int i11, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    /* JADX INFO: renamed from: conversationMetadataService */
    public ConversationMetadataService getConversationMetadataService() {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return NotInitializedConversationMetadataService.INSTANCE;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object createConversation(@Nullable Integer num, @NotNull c<? super ConversationKitResult<Conversation>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object createUser(@Nullable Integer num, @NotNull c<? super ConversationKitResult<User>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void dispatchEvent(@NotNull ConversationKitEvent event) {
        event.getClass();
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object downloadAttachment(@NotNull String str, @NotNull Message message, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getClientId(@NotNull c<? super String> cVar) throws ZendeskError.NotInitialized {
        throw ZendeskError.NotInitialized.INSTANCE;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    public Config getConfig() throws ZendeskError.NotInitialized {
        throw ZendeskError.NotInitialized.INSTANCE;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    public y1 getConnectionStatusFlow() {
        return r.c(ConnectionStatus.DISCONNECTED);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getConversation(@NotNull String str, @NotNull c<? super ConversationKitResult<Conversation>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getConversations(int i11, boolean z11, @NotNull c<? super ConversationKitResult<ConversationsPagination>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getCurrentUser(@NotNull c<? super User> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return null;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getMessages(@NotNull String str, double d3, @NotNull c<? super ConversationKitResult<? extends List<Message>>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getProactiveMessage(int i11, @NotNull c<? super ConversationKitResult<ProactiveMessage>> cVar) {
        return new ConversationKitResult.Failure(ZendeskError.NotInitialized.INSTANCE);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    public ConversationKitSettings getSettings() throws ZendeskError.NotInitialized {
        throw ZendeskError.NotInitialized.INSTANCE;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getVisitType(@NotNull c<? super ConversationKitResult<? extends VisitType>> cVar) {
        return new ConversationKitResult.Failure(ZendeskError.NotInitialized.INSTANCE);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getWaitTimeForConversation(@NotNull String str, @NotNull c<? super ConversationKitResult<WaitTimeData>> cVar) {
        return new ConversationKitResult.Failure(ZendeskError.NotInitialized.INSTANCE);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void invalidate() {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object loginUser(@NotNull String str, @NotNull c<? super ConversationKitResult<User>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object logoutUser(@NotNull c<? super ConversationKitResult<Unit>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object pause(@NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object proactiveMessageReferral(@Nullable Integer num, @NotNull String str, @NotNull c<? super ConversationKitResult<Conversation>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void removeEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object resume(@NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object sendActivityData(@NotNull ActivityData activityData, @NotNull String str, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object sendMessage(@NotNull Message message, @NotNull String str, @NotNull c<? super ConversationKitResult<Message>> cVar) {
        ZendeskError.NotInitialized notInitialized = ZendeskError.NotInitialized.INSTANCE;
        Logger.w(Zendesk.LOG_TAG, notInitialized.getMessage(), new Object[0]);
        return new ConversationKitResult.Failure(notInitialized);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object sendPostbackMessage(@NotNull String str, @NotNull String str2, @NotNull c<? super ConversationKitResult<Unit>> cVar) {
        return new ConversationKitResult.Failure(ZendeskError.NotInitialized.INSTANCE);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object setVisitType(@NotNull VisitType visitType, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object updatePushNotificationToken(@NotNull String str, @NotNull c<? super Unit> cVar) {
        Logger.w(Zendesk.LOG_TAG, ZendeskError.NotInitialized.INSTANCE.getMessage(), new Object[0]);
        return Unit.f26487a;
    }
}
