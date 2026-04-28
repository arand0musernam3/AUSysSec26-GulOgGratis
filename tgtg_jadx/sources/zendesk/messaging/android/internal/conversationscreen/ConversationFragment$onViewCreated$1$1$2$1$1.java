package zendesk.messaging.android.internal.conversationscreen;

import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onViewCreated$1$1$2$1$1", f = "ConversationFragment.kt", l = {361}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ConversationFragment$onViewCreated$1$1$2$1$1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationFragment$onViewCreated$1$1$2$1$1(ConversationFragment conversationFragment, x70.c<? super ConversationFragment$onViewCreated$1$1$2$1$1> cVar) {
        super(2, cVar);
        this.this$0 = conversationFragment;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConversationFragment$onViewCreated$1$1$2$1$1(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((ConversationFragment$onViewCreated$1$1$2$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            ba0.g.M(obj);
            ConversationScreenCoordinator conversationScreenCoordinator = this.this$0.conversationScreenCoordinator;
            if (conversationScreenCoordinator != null) {
                this.label = 1;
                if (conversationScreenCoordinator.init$zendesk_messaging_messaging_android(this) == aVar) {
                    return aVar;
                }
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
