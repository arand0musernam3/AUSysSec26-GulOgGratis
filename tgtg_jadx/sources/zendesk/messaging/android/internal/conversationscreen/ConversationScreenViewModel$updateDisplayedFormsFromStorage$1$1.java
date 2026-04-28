package zendesk.messaging.android.internal.conversationscreen;

import com.braze.h2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.b0;
import y80.a2;
import y80.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1", f = "ConversationScreenViewModel.kt", l = {350}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
@SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1485:1\n230#2,5:1486\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1\n*L\n351#1:1486,5\n*E\n"})
public final class ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ConversationScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1(ConversationScreenViewModel conversationScreenViewModel, String str, x70.c<? super ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1> cVar) {
        super(2, cVar);
        this.this$0 = conversationScreenViewModel;
        this.$id = str;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1(this.this$0, this.$id, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((ConversationScreenViewModel$updateDisplayedFormsFromStorage$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object localStoredForms;
        a2 a2Var;
        Object value;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            ba0.g.M(obj);
            ConversationScreenRepository conversationScreenRepository = this.this$0.conversationScreenRepository;
            String str = this.$id;
            this.label = 1;
            localStoredForms = conversationScreenRepository.getLocalStoredForms(str, this);
            if (localStoredForms == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            localStoredForms = obj;
        }
        Map map = (Map) localStoredForms;
        f1 f1Var = this.this$0._conversationScreenStateFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConversationScreenState.copy$default((ConversationScreenState) value, null, null, null, null, null, null, false, null, false, false, null, map, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134215679, null)));
        return Unit.f26487a;
    }
}
