package zendesk.android.events.internal;

import ba0.g;
import com.braze.h2;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
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
import zendesk.android.events.ZendeskEvent;
import zendesk.android.events.ZendeskEventListener;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzendesk/android/events/internal/ZendeskEventDispatcher;", "", "Lv80/x;", "mainDispatcher", "<init>", "(Lv80/x;)V", "Lzendesk/android/events/ZendeskEventListener;", "listener", "", "addEventListener", "(Lzendesk/android/events/ZendeskEventListener;)V", "removeEventListener", "removeAllEventListeners", "()V", "Lzendesk/android/events/ZendeskEvent;", "event", "notifyEventListeners", "(Lzendesk/android/events/ZendeskEvent;Lx70/c;)Ljava/lang/Object;", "Lv80/x;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "listeners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskEventDispatcher {

    @NotNull
    private final ConcurrentLinkedQueue<ZendeskEventListener> listeners;

    @NotNull
    private final x mainDispatcher;

    /* JADX INFO: renamed from: zendesk.android.events.internal.ZendeskEventDispatcher$notifyEventListeners$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.events.internal.ZendeskEventDispatcher$notifyEventListeners$2", f = "ZendeskEventDispatcher.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nZendeskEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZendeskEventDispatcher.kt\nzendesk/android/events/internal/ZendeskEventDispatcher$notifyEventListeners$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1869#2,2:46\n*S KotlinDebug\n*F\n+ 1 ZendeskEventDispatcher.kt\nzendesk/android/events/internal/ZendeskEventDispatcher$notifyEventListeners$2\n*L\n41#1:46,2\n*E\n"})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ZendeskEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ZendeskEvent zendeskEvent, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$event = zendeskEvent;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ZendeskEventDispatcher.this.new AnonymousClass2(this.$event, cVar);
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
            ConcurrentLinkedQueue concurrentLinkedQueue = ZendeskEventDispatcher.this.listeners;
            ZendeskEvent zendeskEvent = this.$event;
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((ZendeskEventListener) it.next()).onEvent(zendeskEvent);
            }
            return Unit.f26487a;
        }
    }

    public ZendeskEventDispatcher(@NotNull x xVar) {
        xVar.getClass();
        this.mainDispatcher = xVar;
        this.listeners = new ConcurrentLinkedQueue<>();
    }

    public final void addEventListener(@NotNull ZendeskEventListener listener) {
        listener.getClass();
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    @Nullable
    public final Object notifyEventListeners(@NotNull ZendeskEvent zendeskEvent, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.mainDispatcher, new AnonymousClass2(zendeskEvent, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    public final void removeAllEventListeners() {
        this.listeners.clear();
    }

    public final void removeEventListener(@NotNull ZendeskEventListener listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }
}
