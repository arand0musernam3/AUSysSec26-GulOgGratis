package zendesk.messaging.android.internal.conversationscreen;

import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.i1;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvents;", "", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleEventObserver", "Lv80/b0;", "lifecycleScope", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "visibleScreenTracker", "coroutineScope", "<init>", "(Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;Lv80/b0;Lzendesk/messaging/android/internal/VisibleScreenTracker;Lv80/b0;)V", "", "canSendTypingStop", "()Z", "Lzendesk/messaging/android/internal/conversationscreen/ConversationUserTypingAction;", "action", "", "dispatchUserTypingEvent", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationUserTypingAction;)V", "", "conversationId", "subscribeTypingEventsToLifecycle", "(Ljava/lang/String;)V", "onTyping", "onSendMessage", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Lv80/b0;", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationTypingEvent;", "_typingEventChannel", "Lx80/m;", "Ly80/i;", "typingEventChannel", "Ly80/i;", "getTypingEventChannel", "()Ly80/i;", "Lv80/i1;", "typingEventJob", "Lv80/i1;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationTypingEvents {

    @NotNull
    private static final String LOG_TAG = "ConversationTypingEvents";
    public static final long TIME_INTERVAL_IN_MILLIS = 10000;

    @NotNull
    private final x80.m _typingEventChannel;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final b0 lifecycleScope;

    @NotNull
    private final ProcessLifecycleEventObserver processLifecycleEventObserver;

    @NotNull
    private final y80.i typingEventChannel;

    @Nullable
    private i1 typingEventJob;

    @NotNull
    private final VisibleScreenTracker visibleScreenTracker;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$dispatchUserTypingEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$dispatchUserTypingEvent$1", f = "ConversationTypingEvents.kt", l = {112, 118}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationUserTypingAction $action;
        int label;
        final /* synthetic */ ConversationTypingEvents this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationUserTypingAction conversationUserTypingAction, ConversationTypingEvents conversationTypingEvents, x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$action = conversationUserTypingAction;
            this.this$0 = conversationTypingEvents;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new AnonymousClass1(this.$action, this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r7.f(r1, r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r7.f(r1, r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        
            return r0;
         */
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
                if (r1 == 0) goto L18
                if (r1 == r3) goto L14
                if (r1 != r2) goto Ld
                goto L14
            Ld:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
            L12:
                r7 = 0
                return r7
            L14:
                ba0.g.M(r7)
                goto L6e
            L18:
                ba0.g.M(r7)
                zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction r7 = r6.$action
                boolean r1 = r7 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction.TypingStart
                r4 = 0
                java.lang.String r5 = "ConversationTypingEvents"
                if (r1 == 0) goto L47
                java.lang.String r7 = "Sending typing start event"
                java.lang.Object[] r1 = new java.lang.Object[r4]
                zendesk.logger.Logger.i(r5, r7, r1)
                zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents r7 = r6.this$0
                x80.m r7 = zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents.access$get_typingEventChannel$p(r7)
                zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvent$TypingStart r1 = new zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvent$TypingStart
                zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction r2 = r6.$action
                zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction$TypingStart r2 = (zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction.TypingStart) r2
                java.lang.String r2 = r2.getConversationId()
                r1.<init>(r2)
                r6.label = r3
                java.lang.Object r7 = r7.f(r1, r6)
                if (r7 != r0) goto L6e
                goto L6d
            L47:
                boolean r7 = r7 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction.TypingStop
                if (r7 == 0) goto L71
                java.lang.String r7 = "Sending typing stop event"
                java.lang.Object[] r1 = new java.lang.Object[r4]
                zendesk.logger.Logger.i(r5, r7, r1)
                zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents r7 = r6.this$0
                x80.m r7 = zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents.access$get_typingEventChannel$p(r7)
                zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvent$TypingStop r1 = new zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvent$TypingStop
                zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction r3 = r6.$action
                zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction$TypingStop r3 = (zendesk.messaging.android.internal.conversationscreen.ConversationUserTypingAction.TypingStop) r3
                java.lang.String r3 = r3.getConversationId()
                r1.<init>(r3)
                r6.label = r2
                java.lang.Object r7 = r7.f(r1, r6)
                if (r7 != r0) goto L6e
            L6d:
                return r0
            L6e:
                kotlin.Unit r7 = kotlin.Unit.f26487a
                return r7
            L71:
                e40.a.f()
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$onTyping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$onTyping$1", f = "ConversationTypingEvents.kt", l = {85}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04241 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04241(String str, x70.c<? super C04241> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            C04241 c04241 = ConversationTypingEvents.this.new C04241(this.$conversationId, cVar);
            c04241.L$0 = obj;
            return c04241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04241) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                b0 b0Var2 = (b0) this.L$0;
                this.L$0 = b0Var2;
                this.label = 1;
                if (f0.o(ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, this) == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = (b0) this.L$0;
                ba0.g.M(obj);
            }
            if (f0.y(b0Var)) {
                ConversationTypingEvents.this.dispatchUserTypingEvent(new ConversationUserTypingAction.TypingStop(this.$conversationId));
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$subscribeTypingEventsToLifecycle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$subscribeTypingEventsToLifecycle$1", f = "ConversationTypingEvents.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04251 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04251(String str, x70.c<? super C04251> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationTypingEvents.this.new C04251(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04251) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y80.i iVarIsInForeground = ConversationTypingEvents.this.processLifecycleEventObserver.isInForeground();
                final ConversationTypingEvents conversationTypingEvents = ConversationTypingEvents.this;
                final String str = this.$conversationId;
                y80.j jVar = new y80.j() { // from class: zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents.subscribeTypingEventsToLifecycle.1.1
                    public final Object emit(boolean z11, x70.c<? super Unit> cVar) {
                        if (!z11 && conversationTypingEvents.canSendTypingStop()) {
                            conversationTypingEvents.dispatchUserTypingEvent(new ConversationUserTypingAction.TypingStop(str));
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit(((Boolean) obj2).booleanValue(), (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (iVarIsInForeground.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$subscribeTypingEventsToLifecycle$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents$subscribeTypingEventsToLifecycle$2", f = "ConversationTypingEvents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationTypingEvents.this.new AnonymousClass2(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            if (ConversationTypingEvents.this.visibleScreenTracker.getVisibleScreens$zendesk_messaging_messaging_android() == null && ConversationTypingEvents.this.canSendTypingStop()) {
                ConversationTypingEvents.this.dispatchUserTypingEvent(new ConversationUserTypingAction.TypingStop(this.$conversationId));
            }
            return Unit.f26487a;
        }
    }

    public ConversationTypingEvents(@NotNull ProcessLifecycleEventObserver processLifecycleEventObserver, @NotNull b0 b0Var, @NotNull VisibleScreenTracker visibleScreenTracker, @NotNull b0 b0Var2) {
        processLifecycleEventObserver.getClass();
        b0Var.getClass();
        visibleScreenTracker.getClass();
        b0Var2.getClass();
        this.processLifecycleEventObserver = processLifecycleEventObserver;
        this.lifecycleScope = b0Var;
        this.visibleScreenTracker = visibleScreenTracker;
        this.coroutineScope = b0Var2;
        x80.i iVarA = cg.a(0, null, null, 7);
        this._typingEventChannel = iVarA;
        this.typingEventChannel = y80.r.w(iVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canSendTypingStop() {
        i1 i1Var = this.typingEventJob;
        if (i1Var != null) {
            if (i1Var != null ? i1Var.g() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchUserTypingEvent(ConversationUserTypingAction action) {
        f0.B(this.coroutineScope, null, null, new AnonymousClass1(action, this, null), 3);
        i1 i1Var = this.typingEventJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
    }

    @NotNull
    public final y80.i getTypingEventChannel() {
        return this.typingEventChannel;
    }

    public final void onSendMessage(@NotNull String conversationId) {
        conversationId.getClass();
        if (canSendTypingStop()) {
            dispatchUserTypingEvent(new ConversationUserTypingAction.TypingStop(conversationId));
        }
    }

    public final void onTyping(@NotNull String conversationId) {
        conversationId.getClass();
        i1 i1Var = this.typingEventJob;
        if (i1Var == null || i1Var.a0()) {
            dispatchUserTypingEvent(new ConversationUserTypingAction.TypingStart(conversationId));
        } else {
            i1 i1Var2 = this.typingEventJob;
            if (i1Var2 != null) {
                i1Var2.a(null);
            }
        }
        this.typingEventJob = f0.B(this.lifecycleScope, null, null, new C04241(conversationId, null), 3);
    }

    public final void subscribeTypingEventsToLifecycle(@NotNull String conversationId) {
        conversationId.getClass();
        f0.B(this.lifecycleScope, null, null, new C04251(conversationId, null), 3);
        f0.B(this.lifecycleScope, null, null, new AnonymousClass2(conversationId, null), 3);
    }
}
