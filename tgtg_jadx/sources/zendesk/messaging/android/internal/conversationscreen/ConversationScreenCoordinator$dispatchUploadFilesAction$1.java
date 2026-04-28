package zendesk.messaging.android.internal.conversationscreen;

import com.braze.h2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction;
import zendesk.messaging.android.internal.model.UploadFile;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$dispatchUploadFilesAction$1", f = "ConversationScreenCoordinator.kt", l = {448}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ConversationScreenCoordinator$dispatchUploadFilesAction$1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    final /* synthetic */ List<UploadFile> $uploads;
    Object L$0;
    int label;
    final /* synthetic */ ConversationScreenCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenCoordinator$dispatchUploadFilesAction$1(List<UploadFile> list, ConversationScreenCoordinator conversationScreenCoordinator, x70.c<? super ConversationScreenCoordinator$dispatchUploadFilesAction$1> cVar) {
        super(2, cVar);
        this.$uploads = list;
        this.this$0 = conversationScreenCoordinator;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConversationScreenCoordinator$dispatchUploadFilesAction$1(this.$uploads, this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((ConversationScreenCoordinator$dispatchUploadFilesAction$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        List<UploadFile> list;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            ba0.g.M(obj);
            List<UploadFile> list2 = this.$uploads;
            ConversationScreenViewModel conversationScreenViewModel = this.this$0.conversationScreenViewModel;
            this.L$0 = list2;
            this.label = 1;
            Object objConversationId$zendesk_messaging_messaging_android = conversationScreenViewModel.conversationId$zendesk_messaging_messaging_android(this);
            if (objConversationId$zendesk_messaging_messaging_android == aVar) {
                return aVar;
            }
            list = list2;
            obj = objConversationId$zendesk_messaging_messaging_android;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$0;
            ba0.g.M(obj);
        }
        this.this$0.conversationScreenViewModel.dispatchAction(new ConversationScreenAction.UploadFiles(list, (String) obj));
        return Unit.f26487a;
    }
}
