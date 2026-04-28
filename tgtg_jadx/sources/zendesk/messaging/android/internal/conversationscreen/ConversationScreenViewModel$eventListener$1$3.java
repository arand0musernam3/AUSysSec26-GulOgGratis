package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.b0;
import zendesk.conversationkit.android.ConversationKitEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$eventListener$1$3", f = "ConversationScreenViewModel.kt", l = {189, 190}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
@SourceDebugExtension({"SMAP\nConversationScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$eventListener$1$3\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1485:1\n36#2:1486\n*S KotlinDebug\n*F\n+ 1 ConversationScreenViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel$eventListener$1$3\n*L\n193#1:1486\n*E\n"})
public final class ConversationScreenViewModel$eventListener$1$3 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
    final /* synthetic */ ConversationKitEvent $conversationKitEvent;
    Object L$0;
    int label;
    final /* synthetic */ ConversationScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenViewModel$eventListener$1$3(ConversationKitEvent conversationKitEvent, ConversationScreenViewModel conversationScreenViewModel, x70.c<? super ConversationScreenViewModel$eventListener$1$3> cVar) {
        super(2, cVar);
        this.$conversationKitEvent = conversationKitEvent;
        this.this$0 = conversationScreenViewModel;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConversationScreenViewModel$eventListener$1$3(this.$conversationKitEvent, this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
        return ((ConversationScreenViewModel$eventListener$1$3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r6.f(r1, r5) == r0) goto L17;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ba0.g.M(r6)
            goto L6c
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L17:
            java.lang.Object r1 = r5.L$0
            java.lang.String r1 = (java.lang.String) r1
            ba0.g.M(r6)
            goto L37
        L1f:
            ba0.g.M(r6)
            zendesk.conversationkit.android.ConversationKitEvent r6 = r5.$conversationKitEvent
            zendesk.conversationkit.android.ConversationKitEvent$OpenFileAttachment r6 = (zendesk.conversationkit.android.ConversationKitEvent.OpenFileAttachment) r6
            java.lang.String r1 = r6.getConversationId()
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r6 = r5.this$0
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.conversationId$zendesk_messaging_messaging_android(r5)
            if (r6 != r0) goto L37
            goto L6b
        L37:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 == 0) goto L6c
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r6 = r5.this$0
            x80.m r6 = zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel.access$get_eventsChannel$p(r6)
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent$OpenFileAttachment r1 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent$OpenFileAttachment
            zendesk.conversationkit.android.ConversationKitEvent r3 = r5.$conversationKitEvent
            zendesk.conversationkit.android.ConversationKitEvent$OpenFileAttachment r3 = (zendesk.conversationkit.android.ConversationKitEvent.OpenFileAttachment) r3
            java.io.File r3 = r3.getFile()
            zendesk.conversationkit.android.ConversationKitEvent r4 = r5.$conversationKitEvent
            zendesk.conversationkit.android.ConversationKitEvent$OpenFileAttachment r4 = (zendesk.conversationkit.android.ConversationKitEvent.OpenFileAttachment) r4
            java.io.File r4 = r4.getFile()
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            java.lang.String r4 = zendesk.core.android.internal.FileKtxKt.getMimeType(r4)
            r1.<init>(r3, r4)
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r6.f(r1, r5)
            if (r6 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel$eventListener$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
