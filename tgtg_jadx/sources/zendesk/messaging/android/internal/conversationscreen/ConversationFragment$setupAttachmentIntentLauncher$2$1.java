package zendesk.messaging.android.internal.conversationscreen;

import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1", f = "ConversationFragment.kt", l = {294}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ConversationFragment$setupAttachmentIntentLauncher$2$1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationFragment this$0;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1$1", f = "ConversationFragment.kt", l = {295, 296}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;
        final /* synthetic */ ConversationFragment this$0;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1$1$1", f = "ConversationFragment.kt", l = {298}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00371 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00371(ConversationFragment conversationFragment, x70.c<? super C00371> cVar) {
                super(2, cVar);
                this.this$0 = conversationFragment;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00371(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00371) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0 && i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                while (this.this$0.conversationScreenCoordinator == null) {
                    this.label = 1;
                    if (f0.o(10L, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f26487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationFragment conversationFragment, x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = conversationFragment;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (v80.j2.c(zendesk.messaging.android.internal.conversationscreen.ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT, r5, r4) == r0) goto L17;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r5)
                goto L42
            L10:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r5)
                r5 = 0
                return r5
            L17:
                ba0.g.M(r5)
                goto L2f
            L1b:
                ba0.g.M(r5)
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r5 = r4.this$0
                v80.i1 r5 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getInitializationJob$p(r5)
                if (r5 == 0) goto L2f
                r4.label = r3
                java.lang.Object r5 = r5.B(r4)
                if (r5 != r0) goto L2f
                goto L41
            L2f:
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1$1$1 r5 = new zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1$1$1
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r1 = r4.this$0
                r3 = 0
                r5.<init>(r1, r3)
                r4.label = r2
                r1 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r5 = v80.j2.c(r1, r5, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                zendesk.messaging.android.internal.conversationscreen.ConversationFragment r5 = r4.this$0
                zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator r5 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getConversationScreenCoordinator$p(r5)
                if (r5 == 0) goto L4d
                r5.dispatchUploadFilesForRestoredUrisAction$zendesk_messaging_messaging_android()
            L4d:
                kotlin.Unit r5 = kotlin.Unit.f26487a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$setupAttachmentIntentLauncher$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationFragment$setupAttachmentIntentLauncher$2$1(ConversationFragment conversationFragment, x70.c<? super ConversationFragment$setupAttachmentIntentLauncher$2$1> cVar) {
        super(2, cVar);
        this.this$0 = conversationFragment;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConversationFragment$setupAttachmentIntentLauncher$2$1(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((ConversationFragment$setupAttachmentIntentLauncher$2$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            ba0.g.M(obj);
            c90.f fVar = p0.f42144a;
            c90.e eVar = c90.e.f7834b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (f0.K(eVar, anonymousClass1, this) == aVar) {
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
