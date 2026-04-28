package zendesk.android.internal;

import ba0.g;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.events.internal.ZendeskEventDispatcher;
import zendesk.android.internal.di.ZendeskComponent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.ZendeskFactory$initialiseNativeMessaging$messaging$1$1", f = "ZendeskFactory.kt", l = {AppConstants.CONTACT_US_REQUEST_FILE}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ZendeskFactory$initialiseNativeMessaging$messaging$1$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ ZendeskEvent $it;
    final /* synthetic */ ZendeskComponent $zendeskComponent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskFactory$initialiseNativeMessaging$messaging$1$1(ZendeskComponent zendeskComponent, ZendeskEvent zendeskEvent, c<? super ZendeskFactory$initialiseNativeMessaging$messaging$1$1> cVar) {
        super(2, cVar);
        this.$zendeskComponent = zendeskComponent;
        this.$it = zendeskEvent;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ZendeskFactory$initialiseNativeMessaging$messaging$1$1(this.$zendeskComponent, this.$it, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ZendeskFactory$initialiseNativeMessaging$messaging$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            ZendeskEventDispatcher zendeskEventDispatcher = this.$zendeskComponent.zendeskEventDispatcher();
            ZendeskEvent zendeskEvent = this.$it;
            this.label = 1;
            if (zendeskEventDispatcher.notifyEventListeners(zendeskEvent, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        return Unit.f26487a;
    }
}
