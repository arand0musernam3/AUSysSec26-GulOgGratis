package zendesk.analyticskit.android.internal.data;

import ba0.g;
import com.braze.h2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u70.o;
import u70.p;
import u70.q;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.analyticskit.android.internal.model.AnalyticsEventsDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$2", f = "AnalyticsRepository.kt", l = {155}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Lu70/q;", "Lzendesk/analyticskit/android/internal/model/AnalyticsEventsDto;", "<anonymous>", "(Lv80/b0;)Lu70/q;"}, k = 3, mv = {2, 1, 0})
public final class AnalyticsRepository$sendAnalyticsEvents$2 extends i implements Function2<b0, c<? super q<? extends AnalyticsEventsDto>>, Object> {
    final /* synthetic */ AnalyticsEventsDto $analyticsEventsDto;
    int label;
    final /* synthetic */ AnalyticsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsRepository$sendAnalyticsEvents$2(AnalyticsRepository analyticsRepository, AnalyticsEventsDto analyticsEventsDto, c<? super AnalyticsRepository$sendAnalyticsEvents$2> cVar) {
        super(2, cVar);
        this.this$0 = analyticsRepository;
        this.$analyticsEventsDto = analyticsEventsDto;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new AnalyticsRepository$sendAnalyticsEvents$2(this.this$0, this.$analyticsEventsDto, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super q<AnalyticsEventsDto>> cVar) {
        return ((AnalyticsRepository$sendAnalyticsEvents$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object pVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                g.M(obj);
                AnalyticsService analyticsService = this.this$0.analyticsService;
                String clientId = this.this$0.analyticsSettings.getClientId();
                AnalyticsEventsDto analyticsEventsDto = this.$analyticsEventsDto;
                this.label = 1;
                if (analyticsService.sendAnalyticsEvents(clientId, analyticsEventsDto, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            o oVar = q.f40850b;
            pVar = this.$analyticsEventsDto;
        } catch (Exception e5) {
            if (e5 instanceof CancellationException) {
                throw e5;
            }
            o oVar2 = q.f40850b;
            pVar = new p(e5);
        }
        return new q(pVar);
    }
}
