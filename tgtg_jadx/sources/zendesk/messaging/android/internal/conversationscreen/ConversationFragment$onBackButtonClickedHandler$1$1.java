package zendesk.messaging.android.internal.conversationscreen;

import androidx.fragment.app.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onBackButtonClickedHandler$1$1", f = "ConversationFragment.kt", l = {252}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class ConversationFragment$onBackButtonClickedHandler$1$1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    final /* synthetic */ o0 $activity;
    int label;
    final /* synthetic */ ConversationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationFragment$onBackButtonClickedHandler$1$1(ConversationFragment conversationFragment, o0 o0Var, x70.c<? super ConversationFragment$onBackButtonClickedHandler$1$1> cVar) {
        super(2, cVar);
        this.this$0 = conversationFragment;
        this.$activity = o0Var;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConversationFragment$onBackButtonClickedHandler$1$1(this.this$0, this.$activity, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((ConversationFragment$onBackButtonClickedHandler$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            ba0.g.M(r8)
            goto L30
        Ld:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L14:
            ba0.g.M(r8)
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
            zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver r1 = r8.backNavigationResolver
            if (r1 == 0) goto L6a
            zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver r8 = r8.getBackNavigationResolver()
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment r1 = r7.this$0
            zendesk.android.messaging.MessagingScreen r1 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getMessagingScreenNavigation$p(r1)
            r7.label = r2
            java.lang.Object r8 = r8.shouldGoToConversationListScreen(r1, r7)
            if (r8 != r0) goto L30
            return r0
        L30:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6a
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
            zendesk.messaging.android.internal.messagingscreen.MessagingNavigator r0 = r8.getMessagingNavigator()
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
            java.lang.String r1 = "ConversationFragment"
            r0.popBackCurrentScreen(r1)
            java.lang.String r1 = "ConversationListFragment"
            boolean r1 = r0.hasScreenBeenDisplayed(r1)
            if (r1 != 0) goto L7a
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$Companion r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.INSTANCE
            java.lang.String r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getCredentials$p(r8)
            if (r8 != 0) goto L5b
            java.lang.String r8 = "credentials"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r8 = 0
        L5b:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r1 = r1.newInstance(r8)
            r5 = 12
            r6 = 0
            java.lang.String r2 = "ConversationListFragment"
            r3 = 0
            r4 = 0
            zendesk.messaging.android.internal.messagingscreen.MessagingNavigator.navigateToScreen$default(r0, r1, r2, r3, r4, r5, r6)
            goto L7a
        L6a:
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment r8 = r7.this$0
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r8 = zendesk.messaging.android.internal.conversationscreen.ConversationFragment.access$getConversationScreenViewModel$p(r8)
            if (r8 == 0) goto L75
            r8.processMessagingClosedEvent()
        L75:
            androidx.fragment.app.o0 r8 = r7.$activity
            r8.finish()
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$onBackButtonClickedHandler$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
