package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner;", "", "", "clear", "(Lx70/c;)Ljava/lang/Object;", "EMPTY", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner$EMPTY;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleanerImpl;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationsListLocalStorageCleaner {

    /* JADX INFO: renamed from: EMPTY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object clear(@NotNull ConversationsListLocalStorageCleaner conversationsListLocalStorageCleaner, @NotNull c<? super Unit> cVar) {
            Object objClear = ConversationsListLocalStorageCleaner.INSTANCE.clear(cVar);
            return objClear == a.COROUTINE_SUSPENDED ? objClear : Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageCleaner$EMPTY, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner$EMPTY;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner;", "<init>", "()V", "", "clear", "(Lx70/c;)Ljava/lang/Object;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements ConversationsListLocalStorageCleaner {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageCleaner
        @Nullable
        public Object clear(@NotNull c<? super Unit> cVar) {
            return Unit.f26487a;
        }
    }

    @Nullable
    Object clear(@NotNull c<? super Unit> cVar);
}
