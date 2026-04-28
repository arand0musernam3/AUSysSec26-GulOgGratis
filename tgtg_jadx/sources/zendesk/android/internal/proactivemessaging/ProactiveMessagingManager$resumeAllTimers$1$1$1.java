package zendesk.android.internal.proactivemessaging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.BERTags;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$resumeAllTimers$1$1$1", f = "ProactiveMessagingManager.kt", l = {BERTags.PRIVATE, 194}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ProactiveMessagingManager$resumeAllTimers$1$1$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ EvaluationState $state;
    int label;
    final /* synthetic */ ProactiveMessagingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProactiveMessagingManager$resumeAllTimers$1$1$1(EvaluationState evaluationState, ProactiveMessagingManager proactiveMessagingManager, c<? super ProactiveMessagingManager$resumeAllTimers$1$1$1> cVar) {
        super(2, cVar);
        this.$state = evaluationState;
        this.this$0 = proactiveMessagingManager;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ProactiveMessagingManager$resumeAllTimers$1$1$1(this.$state, this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ProactiveMessagingManager$resumeAllTimers$1$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r7.reportToCts(r1, r6) == r0) goto L15;
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
            goto L4e
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L17:
            ba0.g.M(r7)
            goto L33
        L1b:
            ba0.g.M(r7)
            zendesk.android.internal.proactivemessaging.EvaluationState r7 = r6.$state
            long r4 = r7.getRemainingSeconds()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r7.toMillis(r4)
            r6.label = r3
            java.lang.Object r7 = v80.f0.o(r4, r6)
            if (r7 != r0) goto L33
            goto L4d
        L33:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r1 = "PM-Manager"
            java.lang.String r3 = "From resumed Timer"
            zendesk.logger.Logger.d(r1, r3, r7)
            zendesk.android.internal.proactivemessaging.ProactiveMessagingManager r7 = r6.this$0
            zendesk.android.internal.proactivemessaging.EvaluationState r1 = r6.$state
            java.util.List r1 = r1.getEvaluationResults()
            r6.label = r2
            java.lang.Object r7 = zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.access$reportToCts(r7, r1, r6)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$resumeAllTimers$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
