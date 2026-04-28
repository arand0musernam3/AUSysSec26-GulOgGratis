package zendesk.android.internal.frontendevents.analyticsevents;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.android.internal.frontendevents.FrontendEventsRepository;
import zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsAction;
import zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO;
import zendesk.core.android.internal.DateKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.frontendevents.analyticsevents.ProactiveMessagingAnalyticsManager$subscribe$1$1", f = "ProactiveMessagingAnalyticsManager.kt", l = {58}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ProactiveMessagingAnalyticsManager$subscribe$1$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ ProactiveCampaignAnalyticsAction $action;
    final /* synthetic */ String $campaignId;
    final /* synthetic */ int $campaignVersion;
    int label;
    final /* synthetic */ ProactiveMessagingAnalyticsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProactiveMessagingAnalyticsManager$subscribe$1$1(ProactiveMessagingAnalyticsManager proactiveMessagingAnalyticsManager, String str, ProactiveCampaignAnalyticsAction proactiveCampaignAnalyticsAction, int i11, c<? super ProactiveMessagingAnalyticsManager$subscribe$1$1> cVar) {
        super(2, cVar);
        this.this$0 = proactiveMessagingAnalyticsManager;
        this.$campaignId = str;
        this.$action = proactiveCampaignAnalyticsAction;
        this.$campaignVersion = i11;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ProactiveMessagingAnalyticsManager$subscribe$1$1(this.this$0, this.$campaignId, this.$action, this.$campaignVersion, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ProactiveMessagingAnalyticsManager$subscribe$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            ProactiveCampaignAnalyticsDTO proactiveCampaignAnalyticsDTO = new ProactiveCampaignAnalyticsDTO(this.$campaignId, this.$action, DateKtxKt.currentIso8601UtcTimestamp(), this.$campaignVersion, this.this$0.visitorId);
            FrontendEventsRepository frontendEventsRepository = this.this$0.frontendEventsRepository;
            this.label = 1;
            if (frontendEventsRepository.sendProactiveMessagingAnalyticsEvent(proactiveCampaignAnalyticsDTO, this) == aVar) {
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
