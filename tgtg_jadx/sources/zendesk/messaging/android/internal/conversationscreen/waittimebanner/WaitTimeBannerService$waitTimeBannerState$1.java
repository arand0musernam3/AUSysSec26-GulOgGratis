package zendesk.messaging.android.internal.conversationscreen.waittimebanner;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.logger.Logger;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$waitTimeBannerState$1", f = "WaitTimeBannerService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class WaitTimeBannerService$waitTimeBannerState$1 extends i implements Function2<WaitTimeBannerType, c<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WaitTimeBannerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitTimeBannerService$waitTimeBannerState$1(WaitTimeBannerService waitTimeBannerService, c<? super WaitTimeBannerService$waitTimeBannerState$1> cVar) {
        super(2, cVar);
        this.this$0 = waitTimeBannerService;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        WaitTimeBannerService$waitTimeBannerState$1 waitTimeBannerService$waitTimeBannerState$1 = new WaitTimeBannerService$waitTimeBannerState$1(this.this$0, cVar);
        waitTimeBannerService$waitTimeBannerState$1.L$0 = obj;
        return waitTimeBannerService$waitTimeBannerState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WaitTimeBannerType waitTimeBannerType, c<? super Unit> cVar) {
        return ((WaitTimeBannerService$waitTimeBannerState$1) create(waitTimeBannerType, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        Logger.i("WaitTimeBannerService", "Wait time banner state updated: " + ((WaitTimeBannerType) this.L$0), new Object[0]);
        this.this$0.retries = 0;
        this.this$0.checkPollingStatus();
        return Unit.f26487a;
    }
}
