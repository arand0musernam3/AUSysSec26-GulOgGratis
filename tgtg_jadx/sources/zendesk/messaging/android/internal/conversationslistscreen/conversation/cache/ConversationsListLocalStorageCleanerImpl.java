package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleanerImpl;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListLocalStorageCleaner;", "Lv80/x;", "ioDispatcher", "Lzendesk/storage/android/Storage;", "storage", "<init>", "(Lv80/x;Lzendesk/storage/android/Storage;)V", "", "clear", "(Lx70/c;)Ljava/lang/Object;", "Lv80/x;", "Lzendesk/storage/android/Storage;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListLocalStorageCleanerImpl implements ConversationsListLocalStorageCleaner {

    @NotNull
    private final x ioDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageCleanerImpl$clear$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageCleanerImpl$clear$2", f = "ConversationsListLocalStorageCleanerImpl.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ConversationsListLocalStorageCleanerImpl.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            ConversationsListLocalStorageCleanerImpl.this.storage.clear();
            return Unit.f26487a;
        }
    }

    public ConversationsListLocalStorageCleanerImpl(@NotNull x xVar, @NotNull Storage storage) {
        xVar.getClass();
        storage.getClass();
        this.ioDispatcher = xVar;
        this.storage = storage;
    }

    @Override // zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageCleaner
    @Nullable
    public Object clear(@NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.ioDispatcher, new AnonymousClass2(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }
}
