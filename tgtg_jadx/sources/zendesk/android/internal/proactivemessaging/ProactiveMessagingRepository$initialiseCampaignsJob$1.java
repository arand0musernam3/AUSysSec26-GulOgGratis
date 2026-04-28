package zendesk.android.internal.proactivemessaging;

import com.appsflyer.attribution.RequestError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$initialiseCampaignsJob$1", f = "ProactiveMessagingRepository.kt", l = {RequestError.NO_DEV_KEY, 42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ProactiveMessagingRepository$initialiseCampaignsJob$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ProactiveMessagingRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProactiveMessagingRepository$initialiseCampaignsJob$1(ProactiveMessagingRepository proactiveMessagingRepository, c<? super ProactiveMessagingRepository$initialiseCampaignsJob$1> cVar) {
        super(2, cVar);
        this.this$0 = proactiveMessagingRepository;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ProactiveMessagingRepository$initialiseCampaignsJob$1(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ProactiveMessagingRepository$initialiseCampaignsJob$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r5.initializeFilterOutCampaigns(r4) == r0) goto L15;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Exception {
        /*
            r4 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ba0.g.M(r5)
            goto L42
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L17:
            java.lang.Object r1 = r4.L$0
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository r1 = (zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository) r1
            ba0.g.M(r5)
            goto L2f
        L1f:
            ba0.g.M(r5)
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository r1 = r4.this$0
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.access$getLiveCampaigns(r1, r4)
            if (r5 != r0) goto L2f
            goto L41
        L2f:
            java.util.List r5 = (java.util.List) r5
            r1.setCampaigns$zendesk_zendesk_android(r5)
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository r5 = r4.this$0
            r1 = 0
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r5 = zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.access$initializeFilterOutCampaigns(r5, r4)
            if (r5 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$initialiseCampaignsJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
