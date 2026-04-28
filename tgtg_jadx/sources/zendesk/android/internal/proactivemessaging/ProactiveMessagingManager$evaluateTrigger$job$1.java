package zendesk.android.internal.proactivemessaging;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.android.internal.proactivemessaging.model.Trigger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$evaluateTrigger$job$1", f = "ProactiveMessagingManager.kt", l = {136, 138}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ProactiveMessagingManager$evaluateTrigger$job$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ List<EvaluationResult> $evaluationResults;
    final /* synthetic */ Trigger $trigger;
    int label;
    final /* synthetic */ ProactiveMessagingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProactiveMessagingManager$evaluateTrigger$job$1(Trigger trigger, ProactiveMessagingManager proactiveMessagingManager, List<EvaluationResult> list, c<? super ProactiveMessagingManager$evaluateTrigger$job$1> cVar) {
        super(2, cVar);
        this.$trigger = trigger;
        this.this$0 = proactiveMessagingManager;
        this.$evaluationResults = list;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ProactiveMessagingManager$evaluateTrigger$job$1(this.$trigger, this.this$0, this.$evaluationResults, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ProactiveMessagingManager$evaluateTrigger$job$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r7.reportToCts(r1, r6) == r0) goto L19;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ba0.g.M(r7)
            goto L54
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L17:
            ba0.g.M(r7)
            goto L3d
        L1b:
            ba0.g.M(r7)
            zendesk.android.internal.proactivemessaging.model.Trigger r7 = r6.$trigger
            java.lang.Integer r7 = r7.getDuration()
            if (r7 == 0) goto L2c
            int r7 = r7.intValue()
            long r4 = (long) r7
            goto L2e
        L2c:
            r4 = 0
        L2e:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r7.toMillis(r4)
            r6.label = r3
            java.lang.Object r7 = v80.f0.o(r4, r6)
            if (r7 != r0) goto L3d
            goto L53
        L3d:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r1 = "PM-Manager"
            java.lang.String r3 = "From Timer"
            zendesk.logger.Logger.d(r1, r3, r7)
            zendesk.android.internal.proactivemessaging.ProactiveMessagingManager r7 = r6.this$0
            java.util.List<zendesk.android.internal.proactivemessaging.EvaluationResult> r1 = r6.$evaluationResults
            r6.label = r2
            java.lang.Object r7 = zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.access$reportToCts(r7, r1, r6)
            if (r7 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$evaluateTrigger$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
