package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;", "", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "conversationUIPersistence", "", "setConversationsListPersistence", "(Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;Lx70/c;)Ljava/lang/Object;", "", "conversationId", "getConversationsListPersistence", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "EMPTY", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO$EMPTY;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationsListLocalStorageIO {

    /* JADX INFO: renamed from: EMPTY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object getConversationsListPersistence(@NotNull ConversationsListLocalStorageIO conversationsListLocalStorageIO, @NotNull String str, @NotNull c<? super ConversationsListUIPersistenceItem> cVar) {
            return ConversationsListLocalStorageIO.INSTANCE.getConversationsListPersistence(str, cVar);
        }

        @Nullable
        public static Object setConversationsListPersistence(@NotNull ConversationsListLocalStorageIO conversationsListLocalStorageIO, @NotNull ConversationsListUIPersistenceItem conversationsListUIPersistenceItem, @NotNull c<? super Unit> cVar) {
            Object conversationsListPersistence = ConversationsListLocalStorageIO.INSTANCE.setConversationsListPersistence(conversationsListUIPersistenceItem, cVar);
            return conversationsListPersistence == a.COROUTINE_SUSPENDED ? conversationsListPersistence : Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO$EMPTY, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO$EMPTY;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;", "<init>", "()V", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "conversationUIPersistence", "", "setConversationsListPersistence", "(Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;Lx70/c;)Ljava/lang/Object;", "", "conversationId", "getConversationsListPersistence", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements ConversationsListLocalStorageIO {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO
        @Nullable
        public Object getConversationsListPersistence(@NotNull String str, @NotNull c<? super ConversationsListUIPersistenceItem> cVar) {
            return null;
        }

        @Override // zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO
        @Nullable
        public Object setConversationsListPersistence(@NotNull ConversationsListUIPersistenceItem conversationsListUIPersistenceItem, @NotNull c<? super Unit> cVar) {
            return Unit.f26487a;
        }
    }

    @Nullable
    Object getConversationsListPersistence(@NotNull String str, @NotNull c<? super ConversationsListUIPersistenceItem> cVar);

    @Nullable
    Object setConversationsListPersistence(@NotNull ConversationsListUIPersistenceItem conversationsListUIPersistenceItem, @NotNull c<? super Unit> cVar);
}
