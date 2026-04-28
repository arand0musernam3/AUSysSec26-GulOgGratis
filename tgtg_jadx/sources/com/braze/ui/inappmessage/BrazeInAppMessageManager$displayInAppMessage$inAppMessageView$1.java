package com.braze.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.braze.h2;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@z70.e(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1", f = "BrazeInAppMessageManager.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Landroid/view/View;", "<anonymous>", "(Lv80/b0;)Landroid/view/View;"}, k = 3, mv = {2, 0, 0})
public final class BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1 extends i implements Function2<b0, x70.c<? super View>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ IInAppMessage $inAppMessage;
    final /* synthetic */ IInAppMessageViewFactory $inAppMessageViewFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(IInAppMessageViewFactory iInAppMessageViewFactory, Activity activity, IInAppMessage iInAppMessage, x70.c<? super BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1> cVar) {
        super(2, cVar);
        this.$inAppMessageViewFactory = iInAppMessageViewFactory;
        this.$activity = activity;
        this.$inAppMessage = iInAppMessage;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(this.$inAppMessageViewFactory, this.$activity, this.$inAppMessage, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super View> cVar) {
        return ((BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            ba0.g.M(obj);
            return this.$inAppMessageViewFactory.createInAppMessageView(this.$activity, this.$inAppMessage);
        }
        h2.b("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
