package com.braze.ui.inappmessage;

import com.braze.h2;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@z70.e(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$5$2", f = "BrazeInAppMessageManager.kt", l = {252}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
public final class BrazeInAppMessageManager$registerInAppMessageManager$5$2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
    final /* synthetic */ IInAppMessage $it;
    int label;
    final /* synthetic */ BrazeInAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$registerInAppMessageManager$5$2(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, x70.c<? super BrazeInAppMessageManager$registerInAppMessageManager$5$2> cVar) {
        super(2, cVar);
        this.this$0 = brazeInAppMessageManager;
        this.$it = iInAppMessage;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this.this$0, this.$it, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((BrazeInAppMessageManager$registerInAppMessageManager$5$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            ba0.g.M(obj);
            BrazeInAppMessageManager brazeInAppMessageManager = this.this$0;
            IInAppMessage iInAppMessage = this.$it;
            this.label = 1;
            if (brazeInAppMessageManager.displayInAppMessage(iInAppMessage, true, this) == aVar) {
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
