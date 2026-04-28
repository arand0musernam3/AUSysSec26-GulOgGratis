package zendesk.android.internal;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.android.internal.di.ZendeskComponent;
import zendesk.conversationkit.android.ConversationKitEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.ZendeskFactory$initialiseConversationKit$2$1", f = "ZendeskFactory.kt", l = {ModuleDescriptor.MODULE_VERSION, 189}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ZendeskFactory$initialiseConversationKit$2$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ ConversationKitEvent $conversationKitEvent;
    final /* synthetic */ ZendeskComponent $zendeskComponent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskFactory$initialiseConversationKit$2$1(ConversationKitEvent conversationKitEvent, ZendeskComponent zendeskComponent, c<? super ZendeskFactory$initialiseConversationKit$2$1> cVar) {
        super(2, cVar);
        this.$conversationKitEvent = conversationKitEvent;
        this.$zendeskComponent = zendeskComponent;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ZendeskFactory$initialiseConversationKit$2$1(this.$conversationKitEvent, this.$zendeskComponent, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((ZendeskFactory$initialiseConversationKit$2$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r5.notifyEventListeners(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r5.notifyEventListeners(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return r0;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L14:
            ba0.g.M(r5)
            goto L5a
        L18:
            ba0.g.M(r5)
            zendesk.conversationkit.android.ConversationKitEvent r5 = r4.$conversationKitEvent
            zendesk.conversationkit.android.ConversationKitEvent$UserAccessRevoked r5 = (zendesk.conversationkit.android.ConversationKitEvent.UserAccessRevoked) r5
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof zendesk.conversationkit.android.internal.exception.JwtIsExpiredException
            zendesk.android.internal.di.ZendeskComponent r1 = r4.$zendeskComponent
            if (r5 == 0) goto L40
            zendesk.android.events.internal.ZendeskEventDispatcher r5 = r1.zendeskEventDispatcher()
            zendesk.android.events.ZendeskEvent$AuthenticationFailed r1 = new zendesk.android.events.ZendeskEvent$AuthenticationFailed
            zendesk.android.events.exception.ZendeskJwtExpiredException r2 = new zendesk.android.events.exception.ZendeskJwtExpiredException
            r2.<init>()
            r1.<init>(r2)
            r4.label = r3
            java.lang.Object r5 = r5.notifyEventListeners(r1, r4)
            if (r5 != r0) goto L5a
            goto L59
        L40:
            zendesk.android.events.internal.ZendeskEventDispatcher r5 = r1.zendeskEventDispatcher()
            zendesk.android.events.ZendeskEvent$AuthenticationFailed r1 = new zendesk.android.events.ZendeskEvent$AuthenticationFailed
            zendesk.conversationkit.android.ConversationKitEvent r3 = r4.$conversationKitEvent
            zendesk.conversationkit.android.ConversationKitEvent$UserAccessRevoked r3 = (zendesk.conversationkit.android.ConversationKitEvent.UserAccessRevoked) r3
            java.lang.Throwable r3 = r3.getCause()
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.notifyEventListeners(r1, r4)
            if (r5 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.ZendeskFactory$initialiseConversationKit$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
