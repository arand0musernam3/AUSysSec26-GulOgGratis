package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIO;", "Lv80/x;", "persistenceDispatcher", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lv80/x;Lzendesk/storage/android/Storage;)V", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "conversationUIPersistence", "", "setConversationsListPersistence", "(Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;Lx70/c;)Ljava/lang/Object;", "", "conversationId", "getConversationsListPersistence", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lv80/x;", "getPersistenceDispatcher", "()Lv80/x;", "Lzendesk/storage/android/Storage;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListLocalStorageIOImpl implements ConversationsListLocalStorageIO {

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOImpl$getConversationsListPersistence$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOImpl$getConversationsListPersistence$2", f = "ConversationsListLocalStorageIOImpl.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;", "<anonymous>", "(Lv80/b0;)Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListUIPersistenceItem;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListLocalStorageIOImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListLocalStorageIOImpl.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl$getConversationsListPersistence$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,41:1\n20#2,7:42\n*S KotlinDebug\n*F\n+ 1 ConversationsListLocalStorageIOImpl.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl$getConversationsListPersistence$2\n*L\n38#1:42,7\n*E\n"})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super ConversationsListUIPersistenceItem>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ConversationsListLocalStorageIOImpl.this.new AnonymousClass2(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super ConversationsListUIPersistenceItem> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            Storage storage = ConversationsListLocalStorageIOImpl.this.storage;
            String str = this.$conversationId;
            String name = ConversationsListUIPersistenceItem.class.getName();
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return (ConversationsListUIPersistenceItem) storage.get(str, Integer.TYPE);
                    }
                    break;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return (ConversationsListUIPersistenceItem) storage.get(str, Float.TYPE);
                    }
                    break;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return (ConversationsListUIPersistenceItem) storage.get(str, Boolean.TYPE);
                    }
                    break;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return (ConversationsListUIPersistenceItem) storage.get(str, Long.TYPE);
                    }
                    break;
            }
            return storage.get(str, ConversationsListUIPersistenceItem.class);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOImpl$setConversationsListPersistence$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOImpl$setConversationsListPersistence$2", f = "ConversationsListLocalStorageIOImpl.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListLocalStorageIOImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListLocalStorageIOImpl.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl$setConversationsListPersistence$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,41:1\n43#2,2:42\n*S KotlinDebug\n*F\n+ 1 ConversationsListLocalStorageIOImpl.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageIOImpl$setConversationsListPersistence$2\n*L\n30#1:42,2\n*E\n"})
    public static final class C04572 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ConversationsListUIPersistenceItem $conversationUIPersistence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04572(ConversationsListUIPersistenceItem conversationsListUIPersistenceItem, c<? super C04572> cVar) {
            super(2, cVar);
            this.$conversationUIPersistence = conversationsListUIPersistenceItem;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ConversationsListLocalStorageIOImpl.this.new C04572(this.$conversationUIPersistence, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04572) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            ConversationsListLocalStorageIOImpl.this.storage.set(this.$conversationUIPersistence.getConversationId(), this.$conversationUIPersistence, ConversationsListUIPersistenceItem.class);
            return Unit.f26487a;
        }
    }

    public ConversationsListLocalStorageIOImpl(@NotNull x xVar, @NotNull Storage storage) {
        xVar.getClass();
        storage.getClass();
        this.persistenceDispatcher = xVar;
        this.storage = storage;
    }

    @Override // zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO
    @Nullable
    public Object getConversationsListPersistence(@NotNull String str, @NotNull c<? super ConversationsListUIPersistenceItem> cVar) {
        return f0.K(this.persistenceDispatcher, new AnonymousClass2(str, null), cVar);
    }

    @NotNull
    public final x getPersistenceDispatcher() {
        return this.persistenceDispatcher;
    }

    @Override // zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIO
    @Nullable
    public Object setConversationsListPersistence(@NotNull ConversationsListUIPersistenceItem conversationsListUIPersistenceItem, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C04572(conversationsListUIPersistenceItem, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }
}
